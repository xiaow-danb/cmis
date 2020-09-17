package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.*;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.*;
import com.wander.cmis.mapper.ExchangeCollateralinfoMapper;
import com.wander.cmis.mapper.ExchangeEmployeeMapper;
import com.wander.cmis.mapper.ExchangeGuarantorinfoMapper;
import com.wander.cmis.mapper.ExchangePolguaappMapper;
import com.wander.cmis.service.TransferPersonalService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 个人/企业贷款申请
 */
@Service
public class TransferPersonalServiceImpl implements TransferPersonalService {

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ExchangeGuarantorinfoMapper exchangeGuarantorinfoMapper;

    @Resource
    private ExchangeEmployeeMapper exchangeEmployeeMapper;

    @Resource
    private ExchangeCollateralinfoMapper exchangeCollateralinfoMapper;

    @Override
    public void doTransfer(String type) {
        List<ExchangePolguaapp> exchangePolguaapps = exchangePolguaappMapper.selectSyncAndNofail();
        List<Map<String,String>> list = new ArrayList<>();
        exchangePolguaapps.stream().forEach(x -> {
            Map<String,String> map = new HashMap<>();
            LoanApiDto loanApiDto = new LoanApiDto();
            //commApiDTO业务经办信息
            CommApiDTO commApiDTO = new CommApiDTO();
            //支撑平台办件编号
            commApiDTO.setHandlingno(UUID.randomUUID().toString().replace("-",""));
            map.put("handlingno",commApiDTO.getHandlingno());
            //渠道数据来源
            commApiDTO.setCaa999("50");
            loanApiDto.setCommApiDTO(commApiDTO);
            //借款人身份证号
            loanApiDto.setAac002(x.getCredentialno());
            //借款人姓名
            loanApiDto.setAac003(x.getClientname());
            //贷款申请日期
            loanApiDto.setTac002(x.getCreatetime());
            //申请人类型 cca130与cca080必填其一
            //TODO
           /* if (!StringUtils.isEmpty(x.getProposertype())) {
                loanApiDto.setCca080(x.getProposertype());
            } else {
                //人群类别 码值CAA130@1
                loanApiDto.setCaa130(Optional.ofNullable(x.getProposerbigtype()).orElse(""));
            }*/
           loanApiDto.setCca080("2");

            //申请人证件类别 可以为空
            loanApiDto.setCaa135("");
            //申请人证件号 可以为空
            loanApiDto.setCaa136("");
            //TODO 是否21号文件最新人群   码值AAC081
            loanApiDto.setCaa131("0");
            //就业局新增贷款方式字段
            loanApiDto.setTac125(Optional.ofNullable(x.getLoantype()).orElse(""));
            //就业局新增确认免反担保人群类别
            loanApiDto.setCaa133(Optional.ofNullable(x.getQrmfdbrqlb()).orElse(""));
            //就业局新增两无人员类别
            loanApiDto.setCaa129(Optional.ofNullable(x.getLwrylb()).orElse(""));
            //婚姻状况
            //TODO 查询申请人的婚姻状况  1已婚 2未婚 4 离异
            //loanApiDto.setCaa137(Optional.ofNullable(x.getMarrStatus()).orElse(""));
            loanApiDto.setCaa137("2");
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
            loanApiDto.setTac011(Optional.ofNullable(x.getIncomeofmonth()).orElse(
                    BigDecimal.valueOf(0)
            ));
            //法律(诉讼)文书送达地址 --> 正大那边没有
            //TODO
            //loanApiDto.setCaa138(Optional.ofNullable(x.getFlwssddz()).orElse(""));
            loanApiDto.setCaa138("不知道");
            //统一社会信用代码
            loanApiDto.setTac017(x.getLicensenum());
            //就业局新增字段->个体工商户名称
            //TODO  app中有
            //loanApiDto.setTac016(Optional.ofNullable(x.getGtgshmc()).orElse(""));
            loanApiDto.setTac016(x.getClientname());
            //经营项目
            //TODO
            //loanApiDto.setTac018(Optional.ofNullable(x.getMainbusiintro()).orElse(""));
            loanApiDto.setTac018("卖衣服");
            //经营地电话
            loanApiDto.setTac019(Optional.ofNullable(x.getPlaceofbusinessphone()).orElse(""));
            //没有取数逻辑 经营地址
           //TODO
            //loanApiDto.setTac013(Optional.ofNullable(x.getBusinessAddress()).orElse(""));
            loanApiDto.setTac013("解放碑");
            //是否小微企业
            loanApiDto.setTac010(x.getIsmircoenterprise());
            //营业执照注册时间
            //TODO
            //loanApiDto.setTac121(Optional.ofNullable(x.getRegistdate()).orElse(""));
            loanApiDto.setTac121("155122345678");
            //税务登记号 -->非必须
            loanApiDto.setTac117(x.getLicensenum());
            //员工人数
            loanApiDto.setTac028(Optional.ofNullable(x.getEmployeenum()).orElse(0));
            //本年新招人数
            loanApiDto.setTac012(Optional.ofNullable(x.getNewemployeenum()).orElse(0));
            //贷款申请区县
            //TODO 码值对应
            loanApiDto.setAaa027("500112");
            //贷款申请街道
            //TODO
            //loanApiDto.setAab301(Optional.ofNullable(x.getDksqjd()).orElse(""));
            loanApiDto.setAab301("50011208");
            //贷款期限 -->文档中说明传固定值1
            loanApiDto.setCaa127("1");
            //创业担保金额(元)
            loanApiDto.setTac089(x.getCreatebusiamount());
            //没有取数逻辑-->组合商业贷款金额
            loanApiDto.setTac090(Optional.ofNullable(x.getZhsydkje()).orElse(
                    new BigDecimal(0)
            ));
            //申请贷款总金额(元)
            loanApiDto.setTac003(x.getLoanamount());
            //就业局新增意向银行
            //TODO
            //loanApiDto.setXwdbankid(Optional.ofNullable(x.getYxyhbh()).orElse(""));
            loanApiDto.setJm118id("103");

            //担保人列表  查询当前关联人的
            List<ExchangeGuarantorinfo> exchangeGuarantorinfo = exchangeGuarantorinfoMapper.findGuarantorinfoByloanId(x.getId());
            List<LoanJm65ApiDto> guarantorinfoList = new ArrayList<>();
            if(exchangeGuarantorinfo != null && exchangeGuarantorinfo.size()>0){
                guarantorinfoTransfer(exchangeGuarantorinfo);
            }
            /*Map<String, List<LoanJm65ApiDto>> loanJm65ApiDtoMap =
                    guarantorinfoList.stream().collect(Collectors.groupingBy(LoanJm65ApiDto::getLoanapplyId));*/
            loanApiDto.setJm65ApiDtos(guarantorinfoList);
            //抵押质押信息列表  查询当前关联人的
            List<ExchangeCollateralinfo> exchangeCollateralinfo = exchangeCollateralinfoMapper.findexchangeCollateralinfoByloanId(x.getId());
            List<LoanJm66ApiDto> collateralinfoList = new ArrayList<>();
            if(exchangeCollateralinfo != null && exchangeCollateralinfo.size()>0){
                collateralinfoTransfer(exchangeCollateralinfo);
            }
            /*Map<String, List<LoanJm66ApiDto>> loanJm66ApiDtoMap =
                    collateralinfoList.stream().collect(Collectors.groupingBy(LoanJm66ApiDto::getLoanapplyId));*/
            loanApiDto.setJm66ApiDtos(collateralinfoList);
            //本次数据提交状态
            loanApiDto.setCce099(x.getBcsjtjzt());

            /**
             * 如果判断标识显示需要同步 项目 根据个人/企业type 调用同步的接口
             */
            if (type.equals(x.getClienttype())) {
                String s = doCqjyApi(loanApiDto);
                JSONObject parse = (JSONObject) JSONObject.parse(s);
                //推送返回成功 修改审核状态为已审核 推送是否推送就业局为已推送
                if ("200".equals(parse.getString("statusCode"))) {
                    map.put("id",x.getId());
                }
            } else {
                String s = doCompanyCqjyApi(loanApiDto);
                JSONObject parse = (JSONObject) JSONObject.parse(s);
                //推送返回成功 修改审核状态为已审核 推送是否推送就业局为已推送
                if ("200".equals(parse.getString("statusCode"))) {
                    map.put("id",x.getId());
                }
            }
            list.add(map);
        });
        System.out.println(Arrays.toString(list.toArray()));
        //成功的列表更改标识
        if(list.get(0).get("id") != null && !"".equals(list.get(0).get("id")) ){
            for (Map<String,String> map: list) {
                String handingNo = map.get("handlingno");
                String id = map.get("id");
                exchangePolguaappMapper.updateSuccess(handingNo,id);
            }
        }

    }

    /**
     * 调用就业局-2.4.7.5 企业贷款申请数据提交接口
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

    @Override
    public void doSyncPersonalAndInsert() {
        String s = doPersonalSync();
        //根据返回值新增到中间表
        JSONObject jsonObject = (JSONObject) JSONObject.parse(s);
        //TODO 就业局返回一个按天查询的接口 需要确认
        String data = jsonObject.getString("data");
        List<XwdbLoanDTO> xwdbLoanDTOS = JSONObject.parseArray(data, XwdbLoanDTO.class);
        doInsert(xwdbLoanDTOS);
    }

    @Override
    public void doSyncCompanyAndInsert() {
        String s = doCompanySync();
        //根据返回值新增到中间表
        JSONObject jsonObject = (JSONObject) JSONObject.parse(s);
        //TODO 就业局返回的接口为空 需要确认
        String data = jsonObject.getString("data");
        List<XwdbLoanDTO> xwdbLoanDTOS = JSONObject.parseArray(data, XwdbLoanDTO.class);
        doInsert(xwdbLoanDTOS);
    }

    /**
     * 就业局返回结果同步到中间表
     *
     * @param xwdbLoanDTOS
     */
    private void doInsert(List<XwdbLoanDTO> xwdbLoanDTOS) {
        xwdbLoanDTOS.stream().forEach(x -> {
            ExchangePolguaapp exchangePolguaapp = new ExchangePolguaapp();

            //贷款编号->申请编号
            exchangePolguaapp.setApplyno(x.getTac001().toString());
            //贷款申请日期 ->新增
            exchangePolguaapp.setLoanApplyDate(x.getTac002());
            //贷款申请总金额
            exchangePolguaapp.setLoanamount(BigDecimal.valueOf(x.getTac003()));
            //贷款类型
            exchangePolguaapp.setLoantype(x.getTdi001());
            //是否担保人担保 -> 新增
            exchangePolguaapp.setSfdbrdb(x.getTdi002());
            //是否抵质押担保 -> 新增
            exchangePolguaapp.setIsdzydb(x.getTdi004());
            //贷款年限 -> 新增
            exchangePolguaapp.setLoanApplyDate(x.getTdi003());
            //贷款用途 -> 新增
            exchangePolguaapp.setLoanUse(x.getTac004());
            //固定电话 -> 新增
            exchangePolguaapp.setFixedTel(x.getTac006());
            //是否微型企业
            exchangePolguaapp.setIsmircoenterprise(x.getTac010());
            //家庭月均收入(元）
            exchangePolguaapp.setIncomeofmonth(BigDecimal.valueOf(x.getTac011()));
            //就业人数(不含申请人) -> 带动就业人数
            exchangePolguaapp.setEmployeenum(x.getTac012());
            //经营地址
            exchangePolguaapp.setBusinessAddress(x.getTac013());
            //个体工商户名称
            exchangePolguaapp.setGtgshmc(x.getTac016());
            //营业执照号码 -> 工商营业执照号
            exchangePolguaapp.setLicensenum(x.getTac017());
            //经营项目 -> 主营业务1
            exchangePolguaapp.setMainbusiintro(x.getTac018());
            //经营地址电话
            exchangePolguaapp.setPlaceofbusinessphone(x.getTac019());
            //新增 未结清债务
            exchangePolguaapp.setWjqzw(new BigDecimal(x.getTac020()));
            //邮政编码
            exchangePolguaapp.setPostalCode(x.getTac021());
            //营业面积
            exchangePolguaapp.setBusinessArea(new BigDecimal(x.getTac022()));
            //月租金
            exchangePolguaapp.setMonthlyPrice(new BigDecimal(x.getTac023()));
            //总投资
            exchangePolguaapp.setInvsetTotal(new BigDecimal(x.getTac024()));
            //月销售收入
            exchangePolguaapp.setMonthSellIncome(BigDecimal.valueOf(x.getTac025()));
            //月纯利润
            exchangePolguaapp.setMonthlyPrice(BigDecimal.valueOf(x.getTac026()));
            //自有资金
            exchangePolguaapp.setOwnMoney(BigDecimal.valueOf(x.getTac027()));
            //员工人数
            exchangePolguaapp.setEmployeeCount(x.getTac028());
            //证件编号
            exchangePolguaapp.setIdentiNumber(x.getTac029());
            //申请审核返回备注
            exchangePolguaapp.setSqshfhbz(x.getTac031());
            //区县审核日期
            exchangePolguaapp.setQxshrq(x.getTac071().toString());
            //家庭人口数
            exchangePolguaapp.setFamilyTotal(x.getTac073());
            //就业局审核意见
            exchangePolguaapp.setJyjAdvice(x.getTac078());
            //意向银行 -> 意向银行编号
            exchangePolguaapp.setYxyhbh(x.getTac079());
            //申报直属统筹区
            exchangePolguaapp.setSbzstcq(x.getTac018());
            //就业审核状态
            exchangePolguaapp.setJyAudit(x.getTac082());
            //发放审核状态
            exchangePolguaapp.setSendAudit(x.getTac083());
            //政策性贷款金额
            exchangePolguaapp.setZcxdkje(BigDecimal.valueOf(x.getTac089()));
            //商业贷款
            exchangePolguaapp.setBusinessLoan(BigDecimal.valueOf(x.getTac090()));
            //贷款状态
            exchangePolguaapp.setLoanStatus(x.getCcc009());
            //申请人类型
            exchangePolguaapp.setProposertype(x.getCca080());
            //是否以配偶执照贷款
            exchangePolguaapp.setSfypozzdk(x.getCaa126());
            //贷款授信年限
            exchangePolguaapp.setDksxnx(Integer.parseInt(x.getCaa127()));
            //是否两无贷款人员
            exchangePolguaapp.setIstowloanpersonal(x.getCaa127());
            //两无贷款人员类别
            exchangePolguaapp.setLwrylb(x.getCaa129());
            //是否21号文件最新人群 TODO
//            exchangePolguaapp.setIs21filepersonneltype(x.getCaa131());
            //人群类别
            exchangePolguaapp.setPersonalType(x.getCaa130());
            //是否免反担保
            exchangePolguaapp.setIsmfdb(x.getCaa132());
            //免反担保人群类别 -> 确认免反担保人群类别
            exchangePolguaapp.setQrmfdbrqlb(x.getCaa130());
            //营业执照注册时间 -> 注册时间
            exchangePolguaapp.setRegistdate(x.getTac121());
            //贷款申请区
            exchangePolguaapp.setLoanApplyRegion(x.getAaa027());
            //贷款申请街道/乡镇
            exchangePolguaapp.setDksqjd(x.getAab301());
            //身份证号码
            exchangePolguaapp.setCredentialno(x.getAac002());
            //姓名
            exchangePolguaapp.setClientname(x.getAac003());
            //电话
            exchangePolguaapp.setContactway(x.getAac067());
            //企业统一社会信用代码 -> 工商营业执照号
            exchangePolguaapp.setLicensenum(x.getAab003());
            //企业名称
            exchangePolguaapp.setClientname(x.getAab004());
            //配偶手机号码
            exchangePolguaapp.setMarrowphone(x.getTal007());
            //配偶工作单位
            exchangePolguaapp.setPogzdw(x.getTal008());
            //人员编号
            exchangePolguaapp.setEmployeeIdenti(x.getCcc001().toString());
            //单位编号
            exchangePolguaapp.setUnitIdenti(x.getAab001().toString());
            //插入之后返回id
            String id = UUID.randomUUID().toString();
            exchangePolguaappMapper.insert(exchangePolguaapp);
            List<LoanJm65ApiDto> loanJm65ApiDtos = x.getLoanJm65ApiDtos();
            //担保人列表
            loanJm65ApiDtos.stream().forEach(y -> {
                ExchangeGuarantorinfo exchangeGuarantorinfo = new ExchangeGuarantorinfo();
                //申请表ID
                exchangeGuarantorinfo.setLoanapplyid(String.valueOf(id));
                //证件号码
                exchangeGuarantorinfo.setIdno(y.getTab002());
                //姓名
                exchangeGuarantorinfo.setGuarantor(y.getTab003());
                //手机号码
                exchangeGuarantorinfo.setContactway(y.getTab016());
                //家庭住址
                exchangeGuarantorinfo.setAddress(y.getTab005());
                //担保人类型 -> 保证人职工类型
                exchangeGuarantorinfo.setGuarantortype(y.getTab007());
                //工作单位
                exchangeGuarantorinfo.setGuarantorworkunit(y.getTab008());
                //单位电话
                exchangeGuarantorinfo.setGuarantorunitphone(y.getTab015());
                //年收入
                exchangeGuarantorinfo.setIncomeYear(y.getTab009());
                //逾期偿还金额（元）
                exchangeGuarantorinfo.setYqchje(y.getTab011());
                //现有负债(元)
                exchangeGuarantorinfo.setXyfz(y.getTab013());
                //供养人口
                exchangeGuarantorinfo.setGyrk(y.getTab012());
                //职务
                exchangeGuarantorinfo.setDuty(y.getTab014());
                //担保额度(元) -> 保证金额(万元)
                exchangeGuarantorinfo.setDeposit(y.getTab018());
                //档案附件ID
                exchangeGuarantorinfo.setDafjId(y.getRecordid());
                //担保人签字情况
                exchangeGuarantorinfo.setDbrqzqk(y.getTab020());
                exchangeGuarantorinfoMapper.insert(exchangeGuarantorinfo);
            });
            //抵质押信息列表
            List<LoanJm66ApiDto> loanJm66ApiDtos = x.getLoanJm66ApiDtos();
            loanJm66ApiDtos.stream().forEach(z -> {
                ExchangeCollateralinfo exchangeCollateralinfo = new ExchangeCollateralinfo();
                //与申请表关联ID
                exchangeCollateralinfo.setLoanapplyid(String.valueOf(id));
                //权属人证件编码
                exchangeCollateralinfo.setQsrzjbm(z.getTad002());
                //姓名 -> 抵押物所有人
                exchangeCollateralinfo.setOwner(z.getTad003());
                //手机号码
                exchangeCollateralinfo.setTelephone(z.getTad007());
                //单位电话
                exchangeCollateralinfo.setUnitTel(z.getTad007());
                //家庭住址
                exchangeCollateralinfo.setHomeAddr(z.getTad005());
                //资产权属 码值TAD009
                exchangeCollateralinfo.setAssetownertype(z.getTad009());
                //资产类别 码值TAD010
                exchangeCollateralinfo.setAssettype(z.getTad010());
                //抵、质押品名称
                exchangeCollateralinfo.setMortgagename(z.getTad011());
                //抵、质押品证号 -> 权利证号
                exchangeCollateralinfo.setWarrant(z.getTad012());
                //抵、质押品估价
                exchangeCollateralinfo.setAssessvalue(z.getTad013());
                //抵、质押品面积
                exchangeCollateralinfo.setMortgagearea(z.getTad014().toString());
                //土地属性
                exchangeCollateralinfo.setLandproperty(z.getTad015());
                //购买价值（元）
                exchangeCollateralinfo.setBuyValue(z.getTad016());
                //购买时间
                exchangeCollateralinfo.setBuydate(z.getTad017().toString());
                //抵押物区域
                exchangeCollateralinfo.setDywqy(z.getTad019());
                //所属乡镇街道
                exchangeCollateralinfo.setSsxzjd(z.getTad021());
                //抵押物详细地址
                exchangeCollateralinfo.setMortgageaddr(z.getTad018());
                //档案附件ID
                exchangeCollateralinfo.setDafjId(z.getRecordid());
                //担保人签字情况
                exchangeCollateralinfo.setDbrqzqk(z.getTad022());
            });
            //股东列表
            List<StockholderApiDto> stockholderApiDtos = x.getStockholderApiDtos();
            stockholderApiDtos.stream().forEach(a -> {
                ExchangeShareholder exchangeShareholder = new ExchangeShareholder();
                //关联id
                exchangeShareholder.setLoanapplyid(String.valueOf(id));
                //股东编号
                exchangeShareholder.setGdbh(BigDecimal.valueOf(a.getGdk001()));
                //单位编号
                exchangeShareholder.setUnitNo(BigDecimal.valueOf(a.getAab001()));
                //身份证号
                exchangeShareholder.setIdno(a.getAac002());
                //姓名
                exchangeShareholder.setName(a.getAac003());
                //出资额
                exchangeShareholder.setShareamt(new BigDecimal(a.getGdk003()));
                //手机号
                exchangeShareholder.setMobile(a.getGdk004());
                //前端操作标识
                exchangeShareholder.setQdczbs(a.getGdk002());
                //前端操作标识描述
                exchangeShareholder.setQdczbsms(a.getGdk002des());
            });
            //员工列表
            List<LoanEmployeesApiDto> loanEmployeesApiDtos = x.getLoanEmployeesApiDtos();
            loanEmployeesApiDtos.stream().forEach(q -> {
                ExchangeEmployee exchangeEmployee = new ExchangeEmployee();
                //关联id
                exchangeEmployee.setLoanapplyid(String.valueOf(id));
                //就业登记编号
                exchangeEmployee.setJydjbh(BigDecimal.valueOf(q.getAcc002()));
                //人员编号
                exchangeEmployee.setEmployeeNo(BigDecimal.valueOf(q.getCcc001()));
                //身份证号
                exchangeEmployee.setIdno(q.getAac002());
                //姓名
                exchangeEmployee.setSex(q.getAac004());
                //性别
                exchangeEmployee.setSexDesc(q.getAac004des());
                //性别描述
                exchangeEmployee.setWhcd(q.getAac011());
                //户口性质
                exchangeEmployee.setHkxz(q.getAac009());
                //文化程度
                exchangeEmployee.setWhcd(q.getAac011());
                //文化程度描述
                exchangeEmployee.setWhcdms(q.getAac011des());
                //人员类别1
                exchangeEmployee.setRylb1(q.getCca014());
                //人员类别1描述
                exchangeEmployee.setRtlb1ms(q.getCca014des());
                //人员类别2
                exchangeEmployee.setRylb2(q.getCca015());
                //人员类别2描述
                exchangeEmployee.setRylb2ms(q.getCca015des());
                //人员类别3
                exchangeEmployee.setRylb3(q.getCca016());
                //人员类别3描述
                exchangeEmployee.setRylb3ms(q.getCca016des());
                //贷款人员类别
                exchangeEmployee.setDkrylb(q.getCca080());
                //贷款人员类别描述
                exchangeEmployee.setDkrylbms(q.getCca080des());
                exchangeEmployeeMapper.insert(exchangeEmployee);
            });
        });
    }

    /**
     * 调用就业局 企业贷款担保公司数据查询接口
     *
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
     *
     * TODO 需要就业局提供按天查询接口
     */
    private String doPersonalSync() {
        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "xwdbApi";
        String param2 = "queryPersonalXwdbReview";
        //获取就业系统码表接口
        String url = "http://10.10.53.241:8106/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
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
            loanJm66ApiDto.setLoanapplyId(x.getLoanapplyid());
            //权属人证件编码
            loanJm66ApiDto.setTad002(x.getQsrzjbm());
            //姓名
            loanJm66ApiDto.setTad003(x.getOwner());
            //手机号码
            loanJm66ApiDto.setTad008(x.getTelephone());
            //单位电话
            loanJm66ApiDto.setTad007(x.getUnitTel());
            //家庭住址
            loanJm66ApiDto.setTad005(x.getHomeAddr());
            //资产权属  需要去码值表中获取 码值TAD009
            loanJm66ApiDto.setTad009(x.getAssetownertype());
            //资产类别 需要去码值表中获取 码值TAD010
            loanJm66ApiDto.setTad010(x.getAssettype());
            //抵、质押品名称
            loanJm66ApiDto.setTad011(x.getMortgagename());
            //抵、质押品证号
            loanJm66ApiDto.setTad012(x.getWarrant());
            //抵、质押品估价
            loanJm66ApiDto.setTad013(x.getAssessvalue());
            //抵、质押品面积 资产类别为林权、宅基地、、居住性房地产、商业房地产、土地时，必填。
            loanJm66ApiDto.setTad014(new BigDecimal(x.getMortgagearea()));
            //土地属性 码值TAD015 需要去码表中获取
            loanJm66ApiDto.setTad015(x.getLandproperty());
            //购买价值（元）
            loanJm66ApiDto.setTad016(x.getBuyValue());
            //购买时间 TODO 时间能存BigDecimal?
            loanJm66ApiDto.setTad017(new BigDecimal("0.00"));
            //抵押物区域 码值TAD019 需要去码表中获取
            loanJm66ApiDto.setTad019(x.getCollateralarea());
            //所属乡镇街道
            loanJm66ApiDto.setTad021(x.getStreet());
            //抵押物详细地址
            loanJm66ApiDto.setTad018(x.getMortgageaddr());
            //档案附件ID
            loanJm66ApiDto.setRecordid(x.getDafjId());
            //担保人签字情况
            loanJm66ApiDto.setTad022(x.getDbrqzqk());
            result.add(loanJm66ApiDto);
        });
        return result;
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
            loanJm65ApiDto.setLoanapplyId(x.getLoanapplyid());
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
            loanJm65ApiDto.setTab009(x.getMonthlyincome());
            //逾期偿还金额
            loanJm65ApiDto.setTab011(Optional.ofNullable(x.getYqchje()).orElse(
                    new BigDecimal(0)
            ));
            //现有负债(元)
            loanJm65ApiDto.setTab013(x.getXyfz());
            //供养人口
            loanJm65ApiDto.setTab013(x.getGyrk());
            //职务
            loanJm65ApiDto.setTab014(x.getDuty());
            //担保额度(元)
            loanJm65ApiDto.setTab018(x.getDeposit());
            //档案附件ID
            loanJm65ApiDto.setRecordid(x.getDafjId());
            //担保人签字情况
            loanJm65ApiDto.setTab020(x.getDbrqzqk());
            result.add(loanJm65ApiDto);
        });
        return result;
    }
}
