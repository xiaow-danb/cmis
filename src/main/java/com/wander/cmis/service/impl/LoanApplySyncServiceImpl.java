package com.wander.cmis.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.bean.*;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.entity.*;
import com.wander.cmis.mapper.*;
import com.wander.cmis.service.LoanApplySyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.*;

@Service
@Transactional
public class LoanApplySyncServiceImpl implements LoanApplySyncService {

    Logger logger = LoggerFactory.getLogger(LoanApplySyncServiceImpl.class);

    @Resource
    private ExchangePolguaappMapper exchangePolguaappMapper;

    @Resource
    private ExchangeEmployeeMapper exchangeEmployeeMapper;

    @Resource
    private ExchangeGuarantorinfoMapper exchangeGuarantorinfoMapper;

    @Resource
    private ExchangeShareholderMapper exchangeShareholderMapper;

    @Resource
    private ExchangeCollateralinfoMapper exchangeCollateralinfoMapper;

    @Resource
    private ErrorLogMapper errorLogMapper;

    @Value("${restUrl}")
    private String restUrl;

    @Override
    public void doSync() {

        /**
         * 获取非P非X的历史数据同步
         */
        List<ExchangePolguaapp> exchangePolguaapps = exchangePolguaappMapper.selectByHitsoty();
        if (CollectionUtils.isEmpty(exchangePolguaapps)) {
            logger.info("个人企业申请本次需要推送的数据为空!!!");
            return;
        }
        logger.info("开始推送个人/企业申请数据---->" + exchangePolguaapps);
        for (ExchangePolguaapp exchangePolguaapp : exchangePolguaapps) {//贷款数据传输类   N
            LoanXdgsApiDto loanXdgsApiDto = new LoanXdgsApiDto();
            //网上来源数据编号 jam202   id  N
            loanXdgsApiDto.setJam202(exchangePolguaapp.getId());
            //网上来源数据交互方式    jam203  EXCHANGE_TYPE
            loanXdgsApiDto.setJam203(exchangePolguaapp.getExchangeType());
            //网上申请编号    jam204  applyNo
            loanXdgsApiDto.setJam204(exchangePolguaapp.getApplyno());
            //贷款类型  jam205     clientType
            loanXdgsApiDto.setJam205(exchangePolguaapp.getClienttype());
            //网上客户类型    jam206  clientType
            loanXdgsApiDto.setJam206(exchangePolguaapp.getClienttype());
            //网上申请姓名或者单位名称  jam207  clientName
            loanXdgsApiDto.setJam207(exchangePolguaapp.getClientname());
            //申请人员类别    jam208  proposertype
            loanXdgsApiDto.setJam208(exchangePolguaapp.getProposerbigtype());
            //行业类型  jam209  industry
//            loanXdgsApiDto.setJam209(exchangePolguaapp.getIndustry());
            loanXdgsApiDto.setJam209("2");
            //联系电话  jam210  ContactWay
            loanXdgsApiDto.setJam210(exchangePolguaapp.getContactway());
            //性别    jam211  Gender
            loanXdgsApiDto.setJam211(exchangePolguaapp.getGender());
            //身份证号码 jam212  CredentialNo
            loanXdgsApiDto.setJam212(exchangePolguaapp.getCredentialno());
            //区县    jam213  Domicile
            loanXdgsApiDto.setJam213(exchangePolguaapp.getDomicile());
            //是否微型企业    jam214  IsMircoEnterprise
            loanXdgsApiDto.setJam214(exchangePolguaapp.getIsmircoenterprise());
            //注册时间  jam215  registDate
            loanXdgsApiDto.setJam215(exchangePolguaapp.getRegistdate());
            //注册资本  jam216  registerFunds
            if (null != exchangePolguaapp.getRegisterfunds()) {
                loanXdgsApiDto.setJam216(exchangePolguaapp.getRegisterfunds().doubleValue());
            }
            //法人姓名  jam217  legalNm
            loanXdgsApiDto.setJam217(exchangePolguaapp.getLegalnm());
            //法人联系电话    jam218  legalCellPhone
            loanXdgsApiDto.setJam218(exchangePolguaapp.getLegalcellphone());
            //法人身份证号码   jam219  legalCredentialNo
            loanXdgsApiDto.setJam219(exchangePolguaapp.getLegalcredentialno());
            //开户行   jam220  basicBankNm
            loanXdgsApiDto.setJam220(exchangePolguaapp.getBasicbanknm());
            //账号    jam221  basicAccount
            loanXdgsApiDto.setJam221(exchangePolguaapp.getBasicaccount());
            //资产总额  jam222  totalAssets
            if (null != exchangePolguaapp.getTotalassets()) {
                loanXdgsApiDto.setJam222(exchangePolguaapp.getTotalassets().doubleValue());
            }
            //银行负债  jam223  totalBankLiabilities
            if (null != exchangePolguaapp.getTotalbankliabilities()) {
                loanXdgsApiDto.setJam223(exchangePolguaapp.getTotalbankliabilities().doubleValue());
            }
            //年销售规模    jam224   yearIncome
            if (null != exchangePolguaapp.getYearincome()) {
                loanXdgsApiDto.setJam224(exchangePolguaapp.getYearincome().doubleValue());
            }
            //主营业务  jam225  mainBusiIntro
            loanXdgsApiDto.setJam225(exchangePolguaapp.getMainbusiintro());
            //带动就业人数    jam226  employeeNum
            loanXdgsApiDto.setJam226(exchangePolguaapp.getEmployeenum());
            //纳税人识别号    jam227  taxNo
            loanXdgsApiDto.setJam227(exchangePolguaapp.getTaxno());
            //工商营业执照号   jam228  LicenseNum
            loanXdgsApiDto.setJam228(exchangePolguaapp.getLicensenum());
            //创业担保贷款金额  jam229  CreateBusiAmount
            loanXdgsApiDto.setJam229(exchangePolguaapp.getCreatebusiamount());
            //政策组合贷款超过贴息部分  jam230  GroupAmount
            loanXdgsApiDto.setJam230(exchangePolguaapp.getGroupamount());
            //微型企业创业扶持贷款    jam231  MircoEnterpAmount
            loanXdgsApiDto.setJam231(exchangePolguaapp.getMircoenterpamount());
            //贷款总金额 jam232  LoanAmount
            loanXdgsApiDto.setJam232(exchangePolguaapp.getLoanamount());
            //担保方式  jam233  GuarMethod
            loanXdgsApiDto.setJam233(exchangePolguaapp.getGuarmethod());
            //担保期限  jam234  LengthOfMaturity
            if (null != exchangePolguaapp.getLengthofmaturity()) {
                loanXdgsApiDto.setJam234(exchangePolguaapp.getLengthofmaturity().intValue());
            }
            //担保费用  jam235  SecurityCost
            if (null != exchangePolguaapp.getSecuritycost()) {
                loanXdgsApiDto.setJam235(exchangePolguaapp.getSecuritycost().doubleValue());
            }
            //承贷银行id    jam236  LoanOrg_ID
            loanXdgsApiDto.setJam236(exchangePolguaapp.getLoanorgId());
            //承贷银行名称    jam237  LoanOrgName
            loanXdgsApiDto.setJam237(exchangePolguaapp.getLoanorgname());
            //家庭月收入 jam239  incomeofmonth
            loanXdgsApiDto.setJam239(exchangePolguaapp.getIncomeofmonth());
            //组织机构代码    jam240  enterprisecode
            loanXdgsApiDto.setJam240(exchangePolguaapp.getEnterprisecode());
            //银行分理处 jam244  loanname
            loanXdgsApiDto.setJam244(exchangePolguaapp.getLoanname());
            //贷款申请日期
            String createtime = exchangePolguaapp.getCreatetime();
//            if (StringUtils.hasText(createtime)) {
//                logger.error("数据问题,申请日期为空,申请编号为---->" + exchangePolguaapp.getId());
//                return;
//            }
            //TODO 测试库没有的话先给假数据
            loanXdgsApiDto.setTac002(Integer.valueOf(Optional.ofNullable(createtime).orElse("20201021")));
            //股东列表  jm211List   原EXCHANGE_SHAREHOLDER表数据
            List<ExchangeShareholder> exchangeShareholders
                    = exchangeShareholderMapper.selectByLoanId(exchangePolguaapp.getId());
            List<LoanJm211ApiDto> loanJm211ApiDtos = new ArrayList<>();
            if (!StringUtils.isEmpty(exchangeShareholders)) {
                exchangeShareholders.forEach(exchangeShareholder -> {
                    LoanJm211ApiDto loanJm211ApiDto = new LoanJm211ApiDto();
                    //网上申请编号    jam202  loanapplyId N
                    loanJm211ApiDto.setJam202(exchangeShareholder.getLoanapplyid());
                    //股东姓名  jbm202  name
                    loanJm211ApiDto.setJbm202(exchangeShareholder.getName());
                    //股东身份证号    jbm203  IDNO
                    loanJm211ApiDto.setJbm202(exchangeShareholder.getIdno());
                    //股东出资金额    jbm204  shareamt
                    if (null != exchangeShareholder.getShareamt()) {
                        loanJm211ApiDto.setJbm204(exchangeShareholder.getShareamt().doubleValue());
                    }
                    //股东电话  jbm205  mobile
                    loanJm211ApiDto.setJbm205(exchangeShareholder.getMobile());
                    loanJm211ApiDtos.add(loanJm211ApiDto);
                });
            } else {
                logger.error("获取到的股东列表为空---->参数id:" + exchangePolguaapp.getId());
            }
            loanXdgsApiDto.setJm211List(loanJm211ApiDtos);
            //员工列表  jm212List   原EXCHANGE_EMPLOYEE表数据
            List<ExchangeEmployee> exchangeEmployees =
                    exchangeEmployeeMapper.selectByLoanId(exchangePolguaapp.getId());
            List<LoanJm212ApiDto> loanJm212ApiDtos = new ArrayList<>();
            if (!StringUtils.isEmpty(exchangeEmployees)) {
                exchangeEmployees.forEach(exchangeEmployee -> {
                    LoanJm212ApiDto loanJm212ApiDto = new LoanJm212ApiDto();
                    //网上申请编号    jam202  loanapplyId N
                    loanJm212ApiDto.setJam202(exchangeEmployee.getLoanapplyid());
                    //员工姓名  jbm202  name
                    loanJm212ApiDto.setJbm202(exchangeEmployee.getName());
                    //员工身份证号    jbm203  IDNO
                    loanJm212ApiDto.setJbm203(exchangeEmployee.getIdno());
                    loanJm212ApiDtos.add(loanJm212ApiDto);
                });
            } else {
                logger.error("获取到的员工列表为空---->参数id:" + exchangePolguaapp.getId());
            }
            loanXdgsApiDto.setJm212List(loanJm212ApiDtos);
            //担保人列表 jm23List    原EXCHANGE_GUARANTORINFO表数据
            List<ExchangeGuarantorinfo> exchangeGuarantorinfos =
                    exchangeGuarantorinfoMapper.findGuarantorinfoByloanId(exchangePolguaapp.getId());
            List<LoanJm23ApiDto> loanJm23ApiDtos = new ArrayList<>();
            if (StringUtils.isEmpty(exchangeGuarantorinfos)) {
                exchangeGuarantorinfos.forEach(exchangeGuarantorinfo -> {
                    LoanJm23ApiDto loanJm23ApiDto = new LoanJm23ApiDto();
                    //网上来源数据编号  jam202  loanapplyId N
                    loanJm23ApiDto.setJam202(exchangeGuarantorinfo.getLoanapplyid());
                    //担保人姓名 jcm202  guarantor
                    loanJm23ApiDto.setJcm202(exchangeGuarantorinfo.getGuarantor());
                    //担保人身份证    jcm203  IDNO
                    loanJm23ApiDto.setJcm203(exchangeGuarantorinfo.getIdno());
                    //担保人单位类型   jcm204  workunittype
                    loanJm23ApiDto.setJcm204(exchangeGuarantorinfo.getWorkunittype());
                    //担保人工作单位   jcm205  gua rantorworkunit
                    //担保人职位     jcm206  duty
                    loanJm23ApiDto.setJcm206(exchangeGuarantorinfo.getDuty());
                    //保证人单位联系方式 jcm207  guarantorunitphone
                    loanJm23ApiDto.setJcm207(exchangeGuarantorinfo.getGuarantorunitphone());
                    //保证金额(万元)  jcm208  deposit
                    if (null != exchangeGuarantorinfo.getDeposit()) {
                        loanJm23ApiDto.setJcm208(exchangeGuarantorinfo.getDeposit().doubleValue());
                    }
                    //保证人月收人(元) jcm209  monthlyincome
                    if (null != exchangeGuarantorinfo.getMonthlyincome()) {
                        loanJm23ApiDto.setJcm209(exchangeGuarantorinfo.getMonthlyincome().doubleValue());
                    }
                    //保证人联系方式   jcm210  contactway
                    loanJm23ApiDto.setJcm210(exchangeGuarantorinfo.getContactway());
                    //保证人地址 jcm211  address
                    loanJm23ApiDto.setJcm211(exchangeGuarantorinfo.getAddress());
                    loanJm23ApiDtos.add(loanJm23ApiDto);
                });
            } else {
                logger.error("获取到的担保人列表为空---->参数id:" + exchangePolguaapp.getId());
            }
            loanXdgsApiDto.setJm23List(loanJm23ApiDtos);
            //抵质押物列表    jm24List    原EXCHANGE_COLLATERALINFO表数据
            List<ExchangeCollateralinfo> exchangeCollateralinfos =
                    exchangeCollateralinfoMapper.findexchangeCollateralinfoByloanId(exchangePolguaapp.getId());
            List<LoanJm24ApiDto> loanJm24ApiDtos = new ArrayList<>();
            if (!StringUtils.isEmpty(exchangeCollateralinfos)) {
                exchangeCollateralinfos.forEach(exchangeCollateralinfo -> {
                    LoanJm24ApiDto loanJm24ApiDto = new LoanJm24ApiDto();
                    //网上来源数据编号  jam202  loanapplyId N
                    loanJm24ApiDto.setJam202(exchangeCollateralinfo.getLoanapplyid());
                    //资产权属  jdm202  assetownertype
                    loanJm24ApiDto.setJdm202(exchangeCollateralinfo.getAssetownertype());
                    //抵押物所有人    jdm203  owner
                    loanJm24ApiDto.setJdm203(exchangeCollateralinfo.getOwner());
                    //资产类型  jdm204  assettype
                    loanJm24ApiDto.setJdm204(exchangeCollateralinfo.getAssettype());
                    //抵押物名称 jdm205  mortgagename
                    loanJm24ApiDto.setJdm205(exchangeCollateralinfo.getMortgagename());
                    //抵押物地址 jdm206  Mortgageaddr
                    loanJm24ApiDto.setJdm206(exchangeCollateralinfo.getMortgageaddr());
                    //抵押物面积(㎡)  jdm207  mortgageArea
                    loanJm24ApiDto.setJdm207(exchangeCollateralinfo.getMortgagearea());
                    //权利证号  jdm208  warrant
                    loanJm24ApiDto.setJdm208(exchangeCollateralinfo.getWarrant());
                    //评估价值(万元)  jdm209  assessvalue
                    if (null != exchangeCollateralinfo.getAssessvalue()) {
                        loanJm24ApiDto.setJdm209(exchangeCollateralinfo.getAssessvalue().doubleValue());
                    }
                    //土地属性  jdm210  landproperty
                    loanJm24ApiDto.setJdm210(exchangeCollateralinfo.getLandproperty());
                    //备注    jdm211  remark
                    loanJm24ApiDto.setJdm211(exchangeCollateralinfo.getRemark());
                    //土地区域  jdm212  COLLATERALAREA
                    loanJm24ApiDto.setJdm212(exchangeCollateralinfo.getCollateralarea());
                    //土地区域-区县   jdm213  county
                    loanJm24ApiDto.setJdm213(exchangeCollateralinfo.getCounty());
                    //土地区域-街道社区 jdm214  street
                    loanJm24ApiDto.setJdm214(exchangeCollateralinfo.getStreet());
                    loanJm24ApiDtos.add(loanJm24ApiDto);
                });
            } else {
                logger.error("获取到的抵质押物列表为空---->参数id:" + exchangePolguaapp.getId());
            }
            loanXdgsApiDto.setJm24List(loanJm24ApiDtos);
            //调用就业局接口
            logger.info("开始推送,推送的数据为---->" + loanXdgsApiDto);
            String s = doJyjApi(loanXdgsApiDto);
            logger.info("调用接口后的返回数据为--->" + s);
            JSONObject parse = (JSONObject) JSONObject.parse(s);
            //推送返回成功 修改审核状态为已审核 推送是否推送就业局为已推送
            if ("200".equals(parse.getString("statusCode"))) {
                logger.info("调用成功,开始更新推送状态!!!");
                exchangePolguaappMapper.updateBySuccessRecord(exchangePolguaapp.getId());
            } else {
                logger.info("返回码值不为200,记录错误日志,不更新本条数据推送状态!!!");
                /**
                 * 记录错误日志
                 */
                ErrorLog errorLog = new ErrorLog();
                errorLog.setId(UUID.randomUUID().toString().replace("-", ""));
                errorLog.setJyjInterface("2.4.9小贷公司专用贷款申请数据推送接口");
                String send = JSONObject.toJSON(loanXdgsApiDto).toString();
                errorLog.setSendData(send);
                errorLog.setResultData(s);
                errorLogMapper.insert(errorLog);
            }
        }
    }

    private String doJyjApi(LoanXdgsApiDto loanXdgsApiDto) {

        SerializeConfig serconfig = new SerializeConfig();

        String dateFormat = "yyyy-MM-dd HH:mm:ss";

        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));

        String param1 = "loanXdgsManageApi";
        String param2 = "saveLoan";
        String url = restUrl + "/ecooppf/rest/" + param1 + "/" + param2;
        Object[] params = new Object[1];
        params[0] = loanXdgsApiDto;
        String jsonstr = JSON.toJSONString(params, serconfig);
        return InitAndRun.run(url, param1, param2, jsonstr);
    }

}
