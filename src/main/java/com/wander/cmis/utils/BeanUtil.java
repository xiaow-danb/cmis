package com.wander.cmis.utils;

import com.wander.cmis.bean.*;
import com.wander.cmis.entity.*;

import java.math.BigDecimal;

public class BeanUtil {

    /**
     * 创建中间表个人信息
     * @param x
     * @return
     */
    public static ExchangePolguaapp createPolguaappPersonal(XwdbLoanDTO x){

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

        return exchangePolguaapp;
    }

    /**
     * 创建担保人信息
     */
    public static ExchangeGuarantorinfo createGuarantorinfo(LoanJm65ApiDto y){
        ExchangeGuarantorinfo exchangeGuarantorinfo = new ExchangeGuarantorinfo();
        //申请表ID
//        exchangeGuarantorinfo.setLoanapplyid(String.valueOf(id));
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

        return exchangeGuarantorinfo;
    }

    /**
     * 创建抵质押物信息
     * @param z
     */
    public static ExchangeCollateralinfo createCollateralinfo(LoanJm66ApiDto z){
        ExchangeCollateralinfo exchangeCollateralinfo = new ExchangeCollateralinfo();
        //与申请表关联ID
//        exchangeCollateralinfo.setLoanapplyid(String.valueOf(id));
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

        return exchangeCollateralinfo;
    }

    /**
     * 股东信息
     * @return
     */
    public static ExchangeShareholder createShareholder(StockholderApiDto a){
        ExchangeShareholder exchangeShareholder = new ExchangeShareholder();
        //关联id
//        exchangeShareholder.setLoanapplyid(String.valueOf(id));
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

        return  exchangeShareholder;
    }

    /**
     * 创建员工信息
     * @param q
     */
    public static ExchangeEmployee createEmployee (LoanEmployeesApiDto q){
        ExchangeEmployee exchangeEmployee = new ExchangeEmployee();
        //关联id
//        exchangeEmployee.setLoanapplyid(String.valueOf(id));
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

        return exchangeEmployee;
    }
}