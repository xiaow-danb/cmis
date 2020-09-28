package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.BankBean;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.*;
import com.wander.cmis.mapper.*;
import com.wander.cmis.service.ApplyPersonSyncService;
import com.wonders.cqjy.ggfw.dto.CommApiDTO;
import com.wonders.cqjy.ggfw.dto.LoanApiDto;
import com.wonders.cqjy.ggfw.dto.LoanJm65ApiDto;
import com.wonders.cqjy.ggfw.dto.LoanJm66ApiDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;

@Service
public class ApplyPersonSyncServiceImpl implements ApplyPersonSyncService {

    Logger logger = LoggerFactory.getLogger(ApplyPersonSyncServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Resource
    private ExchangeCountyMapper exchangeCountyMapper;

    @Resource
    private ExchangeGuarantorinfoMapper exchangeGuarantorinfoMapper;

    @Resource
    private ExchangeCollateralinfoMapper exchangeCollateralinfoMapper;

    @Override
    public void doApplyPersonSync() {
        List<ExchangePolguaapp> exchangePolguaapps = exchangePolguaappMapper.personalText();
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
            if (!StringUtils.isEmpty(x.getProposerbigtype())) {
                loanApiDto.setCca080(x.getProposerbigtype());
            } else {
                //人群类别 码值CAA130@1
                loanApiDto.setCaa130(Optional.ofNullable(x.getProposerbigtype()).orElse(""));
            }
            //申请人证件类别 可以为空
            loanApiDto.setCaa135("");
            //申请人证件号 可以为空
            loanApiDto.setCaa136("");
            //是否21号文件最新人群  "0"否,"1"是,值为null是给默认值0  码值AAC081 必填
            if (StringUtils.isEmpty(x.getIs21filepersonneltype())) {
                loanApiDto.setCaa131("0");
            } else {
                loanApiDto.setCaa131("1");
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
            //TODO 法律(诉讼)文书送达地址 --> 业务系统那边没有
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
            if (StringUtils.isEmpty(x.getBusinessAddress())) {
                logger.info("业务系统中经营地址为空!!!");
            }
            loanApiDto.setTac013(Optional.ofNullable(x.getBusinessAddress()).orElse("空"));
//            loanApiDto.setTac013("解放碑");
            //是否小微企业
            logger.info("是否小微企业---->" + x.getIsmircoenterprise());
            loanApiDto.setTac010(x.getIsmircoenterprise());
            //营业执照注册时间
            if (StringUtils.isEmpty(x.getRegistdate())) {
                logger.info("业务系统营业执照注册时间为空");
            }
            loanApiDto.setTac121(x.getRegistdate());
            //税务登记号 -->非必须
            loanApiDto.setTac117(x.getLicensenum());
            //员工人数
            loanApiDto.setTac028(Optional.ofNullable(x.getEmployeenum()).orElse(0));
            //本年新招人数
            loanApiDto.setTac012(Optional.ofNullable(x.getNewemployeenum()).orElse(0));
            //TODO 贷款申请区县
            ExchangeCounty exchangeCounty = new ExchangeCounty();
            exchangeCounty.setId(x.getDomicile());
            ExchangeCounty exchangeCounty1 = exchangeCountyMapper.selectByPrimaryKey(exchangeCounty);
            loanApiDto.setAaa027("500242");
            //贷款申请街道
            exchangeCounty.setId(x.getStreet());
            exchangeCounty1 = exchangeCountyMapper.selectByPrimaryKey(exchangeCounty);
            if (StringUtils.isEmpty(x.getStreet())) {
                logger.info("业务系统贷款申请街道为空!!!");
            }
            loanApiDto.setAab301(exchangeCounty1.getJyjcountyid());
            //贷款期限 -->文档中说明传固定值1
            loanApiDto.setCaa127("1");
            //创业担保金额(元)
            loanApiDto.setTac089(x.getCreatebusiamount());
            //没有取数逻辑-->组合商业贷款金额
            loanApiDto.setTac090(Optional.ofNullable(x.getGroupamount()).orElse(0d));
            //申请贷款总金额(元)
            loanApiDto.setTac003(x.getLoanamount());
            //就业局新增意向银行
            if (StringUtils.isEmpty(x.getJm118id())) {
                logger.info("中间表获取的意向银行编号为空!!!");
            }
            loanApiDto.setJm118id(Long.parseLong(x.getLoanorgId()));
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
            } else {
                /**
                 * 记录错误日志
                 */
                ErrorLog errorLog = new ErrorLog();
                errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                errorLog.setJyjInterface("个人贷款申请数据提交接口");
                String send = JSONObject.toJSON(loanApiDto).toString();
                errorLog.setSendData(send);
                errorLog.setResultData(s);
                errorLogMapper.insert(errorLog);
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

    /**
     * 2.4.8.4 贷款意向银行查询接口
     *
     * @param domicile
     * @return
     */
    private Long queryLoanBankList(String domicile) {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "loanManageApi";
        String param2 = "queryLoanBankList";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        LoanApiDto loanApiDto = new LoanApiDto();
        loanApiDto.setAaa027(domicile);
        params[0] = loanApiDto;
        String jsonstr = JSON.toJSONString(params, serconfig);
        System.out.println(jsonstr);
        String run = InitAndRun.run(url, param1, param2, jsonstr);
        JSONObject jsonObject = JSONObject.parseObject(run);
        String result = jsonObject.getString("result");
        List<BankBean> bankBeans = JSONObject.parseArray(result, BankBean.class);
        Long bankId;
        if (StringUtils.isEmpty(bankBeans)) {
            logger.info("就业局接口查出的意向银行编号为空!!!---->参数为:" + domicile);
            bankId = 0L;
        }
        String jyjbankid = bankBeans.get(0).getJm118id();
        bankId = Long.parseLong(jyjbankid);
        return bankId;
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
            //TODO 关联id
//            ExchangePolguaapp polguaapp = exchangePolguaappMapper.selectByPrimaryKey(x.getLoanapplyid());
//            loanJm65ApiDto.setTac001(Long.parseLong(polguaapp.getApplyno()));
            //证件号码
            loanJm65ApiDto.setTab002(x.getIdno());
            //姓名
            loanJm65ApiDto.setTab003(x.getGuarantor());
            //TODO 手机号码
            loanJm65ApiDto.setTab016("13330333033");
//            loanJm65ApiDto.setTab016(Optional.ofNullable(x.getContactway()).orElse(""));
            //家庭住址
            loanJm65ApiDto.setTab005(x.getAddress());
            //担保人类型
            loanJm65ApiDto.setTab007(x.getWorkunittype());
            //工作单位
            loanJm65ApiDto.setTab008(x.getGuarantorworkunit());
            //单位电话
            loanJm65ApiDto.setTab015(x.getGuarantorunitphone());
            //年收入(元)
            loanJm65ApiDto.setTab009(x.getMonthlyincome() == null ? 0 : x.getMonthlyincome().doubleValue());
            //逾期偿还金额
            loanJm65ApiDto.setTab011(x.getYqchje() == null ? 0 : x.getYqchje().doubleValue());
            //现有负债(元)
            loanJm65ApiDto.setTab013(x.getXyfz() == null ? 0 : x.getXyfz().doubleValue());
            //供养人口
            loanJm65ApiDto.setTab013(x.getGyrk() == null ? 0 : x.getGyrk().doubleValue());
            //职务
            loanJm65ApiDto.setTab014(Optional.ofNullable(x.getDuty()).orElse(""));
            //担保额度(元)
            loanJm65ApiDto.setTab018(x.getDeposit() == null ? 0 : x.getDeposit().doubleValue());
            //档案附件ID
            loanJm65ApiDto.setRecordid(Optional.ofNullable(x.getDafjId()).orElse(""));
            //担保人签字情况 直接填1
//            loanJm65ApiDto.setTab020(x.getDbrqzqk());
            loanJm65ApiDto.setTab020("1");
            result.add(loanJm65ApiDto);
        });
        return result;
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

            ExchangePolguaapp polguaapp = exchangePolguaappMapper.selectByPrimaryKey(x.getLoanapplyid());
//            loanJm66ApiDto.setTac001(Long.parseLong(polguaapp.getApplyno()));
            loanJm66ApiDto.setTac001(20162512398L);
            //权属人证件编码 必填
//            loanJm66ApiDto.setTad002(x.getQsrzjbm());
            loanJm66ApiDto.setTad002(x.getMortageowneridcard());
            //姓名
            loanJm66ApiDto.setTad003(x.getOwner());
            //TODO 手机号码
            loanJm66ApiDto.setTad008(x.getTelephone());
//            loanJm66ApiDto.setTad008("13012345678");
            //单位电话
            loanJm66ApiDto.setTad007(Optional.ofNullable(x.getUnitTel()).orElse(""));
            //家庭住址
            loanJm66ApiDto.setTad005(Optional.ofNullable(x.getHomeAddr()).orElse(""));
            //资产权属  需要去码值表中获取 码值TAD009
            String assetownertype = x.getAssetownertype();
            Map<String, String> assetMap = new HashMap<>();
            loanJm66ApiDto.setTad009(assetownertype);
            //资产类别 码值TAD010
            loanJm66ApiDto.setTad010(x.getAssettype());

            //抵、质押品名称
            loanJm66ApiDto.setTad011(x.getMortgagename());
            //抵、质押品证号
            loanJm66ApiDto.setTad012(x.getWarrant());
            //抵、质押品估价
            loanJm66ApiDto.setTad013(x.getAssessvalue() == null ? 0 : x.getAssessvalue().doubleValue());
            //抵、质押品面积 资产类别为林权、宅基地、、居住性房地产、商业房地产、土地时，必填。
            String area = Optional.ofNullable(x.getMortgagearea()).orElse("0");
            loanJm66ApiDto.setTad014(Double.parseDouble(area));
            //土地属性 码值TAD015 未获取到结果
            loanJm66ApiDto.setTad015(x.getLandproperty());
            //购买价值（元）
            loanJm66ApiDto.setTad016(x.getBuyValue() == null ? 0 : x.getBuyValue().doubleValue());
            //购买时间
//            loanJm66ApiDto.setTad017(Integer.parseInt(Optional.ofNullable(x.getBuydate()).orElse("")));
            //抵押物区域 码值TAD019
            loanJm66ApiDto.setTad019(x.getCollateralarea());
            //所属乡镇街道
//            loanJm66ApiDto.setTad021(x.getStreet("500112"));
            loanJm66ApiDto.setTad021(x.getStreet());
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
}
