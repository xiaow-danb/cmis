package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.*;
import com.wander.cmis.mapper.*;
import com.wander.cmis.service.TransferPersonalService;
import com.wander.cmis.utils.BeanUtil;
import com.wonders.cqjy.ggfw.dto.*;
import com.wondersgroup.commons.json.JsonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 个人/企业贷款申请
 */
@Service
public class TransferPersonalServiceImpl implements TransferPersonalService, ApplicationContextAware {

    Logger logger = LoggerFactory.getLogger(TransferPersonalServiceImpl.class);

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ExchangeGuarantorinfoMapper exchangeGuarantorinfoMapper;

    @Resource
    private ExchangeEmployeeMapper exchangeEmployeeMapper;

    @Resource
    private ExchangeCollateralinfoMapper exchangeCollateralinfoMapper;

    private ApplicationContext applicationContext;

    @Resource
    private ExchangePolguaappMapper polguaappMapper;

    @Resource
    private ExchangeShareholderMapper shareholderMapper;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void doTransferPeople() {
        //初始化正大map
        Map<String, String> initMap = new HashMap<>();
        initMap(initMap);
        //初始化申请人类型
        List<ExchangePolguaapp> exchangePolguaapps = exchangePolguaappMapper.selectSyncAndNofail();
        List<Map<String, String>> list = new ArrayList<>();
        exchangePolguaapps.stream().forEach(x -> {
            Map<String, String> map = new HashMap<>();
            LoanApiDto loanApiDto = new LoanApiDto();
            //commApiDTO业务经办信息
            CommApiDTO commApiDTO = new CommApiDTO();
            //支撑平台办件编号
            commApiDTO.setHandlingno(UUID.randomUUID().toString().replace("-", ""));
            map.put("handlingno", commApiDTO.getHandlingno());
            //渠道数据来源
            commApiDTO.setCaa999("50");
            loanApiDto.setCommApiDTO(commApiDTO);
            //借款人身份证号
            loanApiDto.setAac002(x.getCredentialno());
            //借款人姓名
            loanApiDto.setAac003(x.getClientname());
            //贷款申请日期
            loanApiDto.setTac002(x.getCreatetime());
            //申请人类型 cca130与cca080必填其一 码值CCA080@2
            if (!StringUtils.isEmpty(x.getProposertype())) {
                String key = initMap.get(x.getProposertype());
                logger.info("申请人类型中间表获取数据为---->" + x.getProposertype());
                String property = applicationContext.getEnvironment().getProperty(key);
                loanApiDto.setCca080(property);
            } else {
                //人群类别 码值CAA130@1
                loanApiDto.setCaa130(Optional.ofNullable(x.getProposerbigtype()).orElse(""));
            }
            //申请人证件类别 可以为空
            loanApiDto.setCaa135("");
            //申请人证件号 可以为空
            loanApiDto.setCaa136("");
            //是否21号文件最新人群  "0"否,"1"是,值为null是给默认值0  码值AAC081 必填
            if (x.getIs21filepersonneltype()) {
                loanApiDto.setCaa131("1");
            } else {
                loanApiDto.setCaa131("0");
            }
            //就业局新增贷款方式字段 必填
            loanApiDto.setTac125(Optional.ofNullable(x.getLoantype()).orElse(""));
            //就业局新增 免反担保人群类别
            loanApiDto.setCaa133(Optional.ofNullable(x.getExemptcollpertype()).orElse(""));
            //就业局新增 两无人员类别
            loanApiDto.setCaa129(Optional.ofNullable(x.getProposertypeCredit()).orElse(""));
            //婚姻状况 必填
            // 申请人的婚姻状况  1已婚 2未婚 4 离异 如果没有给默认值2
            loanApiDto.setCaa137(Optional.ofNullable(x.getMarrStatus()).orElse("2"));
            //是否以配偶执照贷款 --> 需要码值查询 可以为空 但取数逻辑待确认
            loanApiDto.setCaa126(Optional.ofNullable(x.getSfypozzdk()).orElse(""));
            //配偶姓名
            loanApiDto.setTal003(Optional.ofNullable(x.getMarrownm()).orElse(""));
            //配偶身份证号码
            loanApiDto.setTal002(Optional.ofNullable(x.getMarrowcredentialno()).orElse(""));
            //配偶手机号码
            loanApiDto.setTal007(Optional.ofNullable(x.getMarrowphone()).orElse(""));
            //配偶工作单位 --> 可以为空 但是没有
            loanApiDto.setTal008(Optional.ofNullable(x.getPogzdw()).orElse(""));
            //家庭月收入(元)
            loanApiDto.setTac011(Optional.ofNullable(x.getIncomeofmonth()).orElse(0d));
            //TODO 法律(诉讼)文书送达地址 --> 正大那边没有
            //loanApiDto.setCaa138(Optional.ofNullable(x.getFlwssddz()).orElse(""));
            loanApiDto.setCaa138("法律（诉讼）文书送达地址");
            //统一社会信用代码
            loanApiDto.setTac017(x.getLicensenum());
            //就业局新增字段->个体工商户名称 --> 企业名称
            loanApiDto.setTac016(x.getClientname());
            //经营项目 为空
            loanApiDto.setTac018(Optional.ofNullable(x.getMainbusiintro()).orElse("无"));
//            loanApiDto.setTac018("经营项目");
            //经营地电话
            loanApiDto.setTac019(Optional.ofNullable(x.getPlaceofbusinessphone()).orElse(""));
            // 经营地址 必填
            loanApiDto.setTac013(Optional.ofNullable(x.getBusinessAddress()).orElse(""));
//            loanApiDto.setTac013("解放碑");
            //是否小微企业
            logger.info("是否小微企业---->" + x.getIsmircoenterprise());
            loanApiDto.setTac010(x.getIsmircoenterprise());
            //营业执照注册时间
            loanApiDto.setTac121(x.getRegistdate());
//            loanApiDto.setTac121("155122345678");
            //税务登记号 -->非必须
            loanApiDto.setTac117(x.getLicensenum());
            //员工人数
            loanApiDto.setTac028(Optional.ofNullable(x.getEmployeenum()).orElse(0));
            //本年新招人数
            loanApiDto.setTac012(Optional.ofNullable(x.getNewemployeenum()).orElse(0));
            // 贷款申请区县
            loanApiDto.setAaa027(x.getDomicile());
//            loanApiDto.setAaa027("500112");
            //贷款申请街道
            loanApiDto.setAab301(x.getStreet());
//            loanApiDto.setAab301("50011208");
            //贷款期限 -->文档中说明传固定值1
            loanApiDto.setCaa127("1");
            //创业担保金额(元)
            loanApiDto.setTac089(x.getCreatebusiamount());
            //没有取数逻辑-->组合商业贷款金额
            loanApiDto.setTac090(Optional.ofNullable(x.getGroupamount()).orElse(0d));
            //申请贷款总金额(元)
            loanApiDto.setTac003(x.getLoanamount());
            //就业局新增意向银行    TAC079
            //loanApiDto.setXwdbankid(Optional.ofNullable(x.getYxyhbh()).orElse(""));
            loanApiDto.setJm118id(Long.parseLong(x.getJm118id()));

            //担保人列表  查询当前关联人的
            logger.info("获取担保人列表的申请ID---->" + x.getId());
            List<ExchangeGuarantorinfo> exchangeGuarantorinfo = exchangeGuarantorinfoMapper.findGuarantorinfoByloanId(x.getId());
            if (StringUtils.isEmpty(exchangeGuarantorinfo)) {
                logger.info("这个申请单关联的担保人列表为空!!!");
            }
            List<LoanJm65ApiDto> loanJm65ApiDtos = guarantorinfoTransfer(exchangeGuarantorinfo);
            /*Map<String, List<LoanJm65ApiDto>> loanJm65ApiDtoMap =
                    guarantorinfoList.stream().collect(Collectors.groupingBy(LoanJm65ApiDto::getLoanapplyId));*/
            loanApiDto.setJm65ApiDtos(loanJm65ApiDtos);
            //抵押质押信息列表  查询当前关联人的
            List<ExchangeCollateralinfo> exchangeCollateralinfo = exchangeCollateralinfoMapper.findexchangeCollateralinfoByloanId(x.getId());
            if (StringUtils.isEmpty(exchangeCollateralinfo)) {
                logger.info("申请单对应的抵押质押信息列表为空!!!");
            }
            List<LoanJm66ApiDto> loanJm66ApiDtos = collateralinfoTransfer(exchangeCollateralinfo);
            /*Map<String, List<LoanJm66ApiDto>> loanJm66ApiDtoMap =
                    collateralinfoList.stream().collect(Collectors.groupingBy(LoanJm66ApiDto::getLoanapplyId));*/
            loanApiDto.setJm66ApiDtos(loanJm66ApiDtos);
            //TODO 本次数据提交状态
            //loanApiDto.setCce099(x.getBcsjtjzt());
            loanApiDto.setCce099("1002");

            /**
             *  调用同步的接口
             */
            String s = doCqjyApi(loanApiDto);
            JSONObject parse = (JSONObject) JSONObject.parse(s);
            //推送返回成功 修改审核状态为已审核 推送是否推送就业局为已推送
            if ("200".equals(parse.getString("statusCode"))) {
                map.put("id", x.getId());
            }
            list.add(map);
        });
        logger.info("成功的list中的id为---->" + list);
        System.out.println(Arrays.toString(list.toArray()));
        //成功的列表更改标识
        if (list.get(0).get("id") != null && !"".equals(list.get(0).get("id"))) {
            for (Map<String, String> map : list) {
                String handingNo = map.get("handlingno");
                String id = map.get("id");
                exchangePolguaappMapper.updateSuccess(handingNo, id);
            }
        }

    }

    private void initMap(Map<String, String> map) {
        map.put("01", "城镇登记失业人员");
        map.put("02", "就业困难人员");
        map.put("03", "复员转业军人");
        map.put("04", "高校毕业生");
        map.put("05", "刑满释放人员");
        map.put("06", "农村自主创业人员");
        map.put("07", "网络商户");
        map.put("08", "建档立卡贫困人员");
    }

    /**
     * 调用就业局-2.4.7.5 企业贷款申请数据提交接口
     *
     * @param loanApiDto
     * @return
     */
    private String doCompanyCqjyApi(LoanApiDto loanApiDto) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "loanManageApi";
        String param2 = "unitLoanSave";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = loanApiDto;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }


    /**
     * 同步就业局个人申请信息
     */
    @Override
    public void doSyncPersonalAndInsert() {
        //按天查询当天的审核结果 aae030
        XwdbQueryApiDTO dto = new XwdbQueryApiDTO();
        dto.setAae030(Integer.parseInt(sdf.format(new Date())));
        //待担保审核  6000 4002、待发放
        dto.setCcc009("6000");
        //得到个人申请结果
        String s = doPersonalSync(dto);
        //根据返回值新增到中间表
        JSONObject jsonObject = (JSONObject) JSONObject.parse(s);
        queryLoan(dto, jsonObject,"01");
        dto.setCcc009("4002");
        s = doPersonalSync(dto);
        //根据返回值新增到中间表
        jsonObject = (JSONObject) JSONObject.parse(s);
        queryLoan(dto, jsonObject,"01");
    }

    /**
     * 同步就业局企业申请信息
     */
    @Override
    public void doSyncCompanyAndInsert() {
        //按天查询当天的审核结果 aae030
        XwdbQueryApiDTO dto = new XwdbQueryApiDTO();
        dto.setAae030(Integer.parseInt(sdf.format(new Date())));
        //待担保审核  6000 4002、待发放
        dto.setCcc009("6000");
        String s = doPersonalSync(dto);
        //根据返回值新增到中间表
        JSONObject jsonObject = (JSONObject) JSONObject.parse(s);
        queryLoan(dto, jsonObject,"02");
        dto.setCcc009("4002");
        s = doPersonalSync(dto);
        //根据返回值新增到中间表
        jsonObject = (JSONObject) JSONObject.parse(s);
        queryLoan(dto, jsonObject,"02");

        //根据返回值新增到中间表
       /* JSONObject jsonObject = (JSONObject) JSONObject.parse(s);
        //TODO 就业局返回的接口为空 需要确认
        String data = jsonObject.getString("data");
        List<XwdbLoanDTO> xwdbLoanDTOS = JSONObject.parseArray(data, XwdbLoanDTO.class);
        doInsert(xwdbLoanDTOS);*/
    }

    /**
     * 就业局返回结果同步到中间表
     *
     * @param xwdbLoanDTOS
     */
    private void doInsert(List<XwdbLoanDTO> xwdbLoanDTOS) {
        xwdbLoanDTOS.stream().forEach(x -> {
            //工具类
            ExchangePolguaapp exchangePolguaapp = BeanUtil.createPolguaappPersonal(x,"01");
            //插入之后返回id
            String id = UUID.randomUUID().toString();
            exchangePolguaappMapper.insert(exchangePolguaapp);
            List<LoanJm65ApiDto> loanJm65ApiDtos = x.getJm65ApiDtos();
            //担保人列表
            loanJm65ApiDtos.stream().forEach(y -> {
                ExchangeGuarantorinfo exchangeGuarantorinfo = BeanUtil.createGuarantorinfo(y);
                //id
                exchangeGuarantorinfo.setId("");
                exchangeGuarantorinfoMapper.insert(exchangeGuarantorinfo);
            });
            //抵质押信息列表
            List<LoanJm66ApiDto> loanJm66ApiDtos = x.getJm66ApiDtos();
            loanJm66ApiDtos.stream().forEach(z -> {
                BeanUtil.createCollateralinfo(z);
            });
            //股东列表
            List<StockholderApiDto> stockholderApiDtos = x.getStockholderApiDtos();
            stockholderApiDtos.stream().forEach(a -> {
                BeanUtil.createShareholder(a);
            });
            //员工列表
            List<LoanEmployeesApiDto> loanEmployeesApiDtos = x.getLoanEmployeesApiDtos();
            loanEmployeesApiDtos.stream().forEach(q -> {
                ExchangeEmployee exchangeEmployee = BeanUtil.createEmployee(q);
                exchangeEmployeeMapper.insert(exchangeEmployee);
            });
        });
    }

    /**
     * 调用就业局 企业贷款担保公司数据查询接口
     * <p>
     * TODO 需要就业局提供按天查询接口
     */
    private String doCompanySync() {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "queryCompanyXwdbReview";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }

    /**
     * 调用就业局 个人（合伙）贷款担保公司数据查询接口
     * <p>
     * TODO 需要就业局提供按天查询接口
     */
    private String doPersonalSync(XwdbQueryApiDTO dto) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "queryPersonalXwdbReview";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0]= dto;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }


    /**
     * 调用就业局 个人贷款申请数据提交接口
     *
     * @param loanApiDto
     */
    private String doCqjyApi(LoanApiDto loanApiDto) {

        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "loanManageApi";
        String param2 = "personLoanSave";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = loanApiDto;
        String jsonstr = JSON.toJSONString(params, serconfig);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }

    /**
     * 抵押信息封装
     *
     * @param exchangeCollateralinfo
     * @return
     */
    private List<LoanJm66ApiDto> collateralinfoTransfer(List<ExchangeCollateralinfo> exchangeCollateralinfo) {
        List<LoanJm66ApiDto> result = new ArrayList<>();
        exchangeCollateralinfo.stream().forEach(x -> {
            LoanJm66ApiDto loanJm66ApiDto = new LoanJm66ApiDto();
            //关联id
            loanJm66ApiDto.setTac001(Long.parseLong(x.getLoanapplyid()));
            //TODO 权属人证件编码 必填
//            loanJm66ApiDto.setTad002(x.getQsrzjbm());
            loanJm66ApiDto.setTad002("1234");
            //姓名
            loanJm66ApiDto.setTad003(x.getOwner());
            //TODO 手机号码
//            loanJm66ApiDto.setTad008(x.getTelephone());
            loanJm66ApiDto.setTad008("13012345678");
            //单位电话
            loanJm66ApiDto.setTad007(Optional.ofNullable(x.getUnitTel()).orElse(""));
            //家庭住址
            loanJm66ApiDto.setTad005(Optional.ofNullable(x.getHomeAddr()).orElse(""));
            //资产权属  需要去码值表中获取 码值TAD009
            String assetownertype = x.getAssetownertype();
            Map<String, String> assetMap = new HashMap<>();
            intiAssetOwnerMap(assetMap);
            if (StringUtils.hasText(assetownertype)) {
                logger.info("资产权属 值---->" + assetownertype);
                String key = assetMap.get(assetownertype);
                loanJm66ApiDto.setTad009(applicationContext.getEnvironment().getProperty(key));
            } else {
                loanJm66ApiDto.setTad009("");
            }
            //TODO 资产类别 码值TAD010
//            loanJm66ApiDto.setTad010(x.getAssettype());

            //抵、质押品名称
            loanJm66ApiDto.setTad011(x.getMortgagename());
            //抵、质押品证号
            loanJm66ApiDto.setTad012(x.getWarrant());
            //抵、质押品估价
            loanJm66ApiDto.setTad013(x.getAssessvalue() == null ? 0 :x.getAssessvalue().doubleValue());
            //抵、质押品面积 资产类别为林权、宅基地、、居住性房地产、商业房地产、土地时，必填。
            String area = Optional.ofNullable(x.getMortgagearea()).orElse("0");
            loanJm66ApiDto.setTad014(Double.parseDouble(area));
            //TODO 土地属性 码值TAD015 未获取到结果
//            loanJm66ApiDto.setTad015(x.getLandproperty());
            loanJm66ApiDto.setTad015("");
            //购买价值（元）
            loanJm66ApiDto.setTad016(x.getBuyValue() == null ? 0 : x.getBuyValue().doubleValue());
            //购买时间 TODO
//            loanJm66ApiDto.setTad017(Integer.parseInt(Optional.ofNullable(x.getBuydate()).orElse("")));
            loanJm66ApiDto.setTad017(20200919);
            //TODO 抵押物区域 码值TAD019
//            loanJm66ApiDto.setTad019(x.getCollateralarea());
            loanJm66ApiDto.setTad019("1");
            //TODO 所属乡镇街道
//            loanJm66ApiDto.setTad021(x.getStreet("500112"));
            loanJm66ApiDto.setTad021("500112");
            //抵押物详细地址
            loanJm66ApiDto.setTad018(Optional.ofNullable(x.getMortgageaddr()).orElse(""));
            //档案附件ID
            loanJm66ApiDto.setRecordid(Optional.ofNullable(x.getDafjId()).orElse(""));
            //担保人签字情况
            loanJm66ApiDto.setTad022("1");
            result.add(loanJm66ApiDto);
        });
        return result;
    }

    private void intiAssetOwnerMap(Map<String, String> assetMap) {
        assetMap.put("01", "自有产权");
        assetMap.put("02", "共同产权");
        assetMap.put("03", "他人产权");
    }

    /**
     * 保证人信息封装
     *
     * @param exchangeGuarantorinfo
     * @return
     */
    private List<LoanJm65ApiDto> guarantorinfoTransfer(List<ExchangeGuarantorinfo> exchangeGuarantorinfo) {
        List<LoanJm65ApiDto> result = new ArrayList<>();
        exchangeGuarantorinfo.stream().forEach(x -> {
            LoanJm65ApiDto loanJm65ApiDto = new LoanJm65ApiDto();
            //关联id
            //TODO
            loanJm65ApiDto.setTac001(Long.parseLong(x.getLoanapplyid()));
            //证件号码
            loanJm65ApiDto.setTab002(x.getIdno());
            //姓名
            loanJm65ApiDto.setTab003(x.getGuarantor());
            //手机号码
            loanJm65ApiDto.setTab016(Optional.ofNullable(x.getContactway()).orElse(""));
            //家庭住址
            loanJm65ApiDto.setTab005(x.getAddress());
            //担保人类型
            loanJm65ApiDto.setTab007(x.getWorkunittype());
            //工作单位
            loanJm65ApiDto.setTab008(x.getGuarantorworkunit());
            //单位电话
            loanJm65ApiDto.setTab015(x.getGuarantorunitphone());
            //年收入(元)
            loanJm65ApiDto.setTab009(x.getMonthlyincome() == null ? 0 :x.getMonthlyincome().doubleValue());
            //逾期偿还金额
            loanJm65ApiDto.setTab011(x.getYqchje() == null ? 0 :x.getYqchje().doubleValue());
            //现有负债(元)
            loanJm65ApiDto.setTab013(x.getXyfz()== null ? 0 :x.getXyfz().doubleValue());
            //供养人口
            loanJm65ApiDto.setTab013(x.getGyrk()== null ? 0 :x.getGyrk().doubleValue());
            //职务
            loanJm65ApiDto.setTab014(Optional.ofNullable(x.getDuty()).orElse(""));
            //担保额度(元)
            loanJm65ApiDto.setTab018(x.getDeposit()== null ? 0 :x.getDeposit().doubleValue());
            //档案附件ID
            loanJm65ApiDto.setRecordid(Optional.ofNullable(x.getDafjId()).orElse(""));
            //担保人签字情况 直接填1
//            loanJm65ApiDto.setTab020(x.getDbrqzqk());
            loanJm65ApiDto.setTab020("1");
            result.add(loanJm65ApiDto);
        });
        return result;
    }

    private void queryLoan(XwdbQueryApiDTO dto, JSONObject jsonObject,String type) {
        String s;
        //总记录数
        String totalPageCount = jsonObject.getString("totalPageCount");
        for (int i = 1,len = Integer.parseInt(totalPageCount); i <= len; i++) {
            dto.setPageNo(i);
            dto.setPageSize(10);
            s = doPersonalSync(dto);
            jsonObject = (JSONObject) JSONObject.parse(s);
            //循环插入
            String result = jsonObject.getString("result");
            if("200".equals(jsonObject.getString("statusCode"))){
                //得到所有的审批结果
                List<XwdbLoanDTO> array = JSONArray.parseArray(result, XwdbLoanDTO.class);
                for (int j = 0; j < array.size(); j++) {
                    //循环调用贷款申请详情  存库
                    String s1 ="";
                    XwdbLoanDTO dto1 = array.get(j);
                    if("01".equals(type)){
                        //个人
                        s1 = getLoanApplyPersonal(dto1.getTac001().toString());
                     }
                    if("02".equals(type)){
                        //个人
                        s1 = getLoanApplyCompany(dto1.getTac001().toString());
                    }
                    //获取个人贷款申请详情
                    JSONObject parse = (JSONObject) JSONObject.parse(s1);
                    if(!"200".equals(parse.getString("statusCode"))){
                        logger.error("获取就业局贷款申请详情失败："+parse.getString("message"));
                    }
                    if("200".equals(parse.getString("statusCode"))){
//                    List<XwdbLoanDTO> list = JSONArray.parseArray(jsonObject.getString("result"),XwdbLoanDTO.class);
                        String res = parse.getString("result");
                        XwdbLoanDTO dto2 = JSONObject.parseObject(res, XwdbLoanDTO.class);
                        ExchangePolguaapp personal = BeanUtil.createPolguaappPersonal(dto2,type);
                        personal.setExchangeType("TOXWD");
                        personal.setId(UUID.randomUUID().toString().replace("-",""));
//                        personal.setSourcetype(polguaappDto.getSourceType());
                        //保存申请单
                        logger.info("保存个人贷款申请单编号："+personal.getApplyno());
                        polguaappMapper.insertSelective(personal);
                        //保存保证人
                        List<LoanJm65ApiDto> loanJm65ApiDtos = dto1.getJm65ApiDtos();
                        if(loanJm65ApiDtos != null && loanJm65ApiDtos.size()>0){
                            for (int k = 0; k < loanJm65ApiDtos.size(); k++) {
                                ExchangeGuarantorinfo guarantorinfo = BeanUtil.createGuarantorinfo(loanJm65ApiDtos.get(k));
                                guarantorinfo.setLoanapplyid(personal.getId());
                                logger.info("保存保证人信息编号为："+guarantorinfo.getLoanapplyid());
                                guarantorinfo.setId(UUID.randomUUID().toString().replace("-",""));
                                exchangeGuarantorinfoMapper.insertSelective(guarantorinfo);
                            }
                        }

                        //保存抵质押物
                        List<LoanJm66ApiDto> loanJm66ApiDtos = dto1.getJm66ApiDtos();
                        if(loanJm66ApiDtos != null && loanJm66ApiDtos.size()>0){
                            for (int l = 0; l < loanJm66ApiDtos.size(); l++) {
                                ExchangeCollateralinfo collateralinfo = BeanUtil.createCollateralinfo(loanJm66ApiDtos.get(l));
                                logger.info("保存抵质押物信息编号为："+collateralinfo.getLoanapplyid());
                                collateralinfo.setId(UUID.randomUUID().toString().replace("-",""));
                                collateralinfo.setLoanapplyid(personal.getId());
                                exchangeCollateralinfoMapper.insertSelective(collateralinfo);
                            }
                        }
                        //股东列表
                        List<StockholderApiDto> stockholderApiDtos = dto1.getStockholderApiDtos();
                        if(stockholderApiDtos != null && stockholderApiDtos.size()>0){
                            stockholderApiDtos.stream().forEach(a -> {
                                ExchangeShareholder shareholder = BeanUtil.createShareholder(a);
                                logger.info("保存股东信息编号为："+shareholder.getLoanapplyid());
                                shareholder.setId(UUID.randomUUID().toString().replace("-",""));
                                shareholder.setLoanapplyid(personal.getId());
                                shareholderMapper.insertSelective(shareholder);
                            });
                        }
                        //员工列表
                        List<LoanEmployeesApiDto> loanEmployeesApiDtos = dto1.getLoanEmployeesApiDtos();
                        if(loanEmployeesApiDtos != null && loanEmployeesApiDtos.size()>0){
                            loanEmployeesApiDtos.stream().forEach(q -> {
                                ExchangeEmployee exchangeEmployee = BeanUtil.createEmployee(q);
                                logger.info("保存员工信息编号为："+exchangeEmployee.getLoanapplyid());
                                exchangeEmployee.setId(UUID.randomUUID().toString().replace("-",""));
                                exchangeEmployee.setLoanapplyid(personal.getId());
                                exchangeEmployeeMapper.insertSelective(exchangeEmployee);
                            });
                        }
                    }
                }
            }
        }
    }

    //获取个人贷款申请详情
    private String getLoanApplyPersonal(String loanNo){
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "loadPersonLoanDetail";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = Long.parseLong(loanNo);
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        String result = InitAndRun.run(url, param1, param2, jsonstr);
        return result;
    }

    //获取企业贷款申请详情
    private String getLoanApplyCompany(String loanNo){
        SerializeConfig serconfig = new SerializeConfig();
        String dateFormat = "yyyy-MM-dd HH:mm:ss";
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "loadCompanyLoanDetail";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = Long.parseLong(loanNo);
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        String result = InitAndRun.run(url, param1, param2, jsonstr);
        return result;
    }
}
