package com.wander.cmis.utils;

import com.wander.cmis.entity.*;
import com.wonders.cqjy.ggfw.dto.*;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BeanUtil {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 创建中间表个人信息
     *
     * @param x
     * @return
     */
    public static ExchangePolguaapp createPolguaappPersonal(XwdbLoanDTO x, String type ) {

        ExchangePolguaapp exchangePolguaapp = new ExchangePolguaapp();
        //贷款编号->申请编号
        exchangePolguaapp.setApplyno(x.getTac001() == null ? "" : x.getTac001() + "");
        //客户类型
        exchangePolguaapp.setClienttype(type);
        //申请日期
        exchangePolguaapp.setCreatetime(x.getTac002());

        //插入时间
        exchangePolguaapp.setCreateDate(sdf.format(new Date()));
        //性别
        if ("01".equals(type)) {
            if (!"".equals(x.getAac002()) && x.getAac002() != null) {
                if (x.getTac002().length() == 15) {
                    String sub = x.getAac002().substring(x.getAac002().length() - 1, x.getTac002().length());
                    if (Integer.parseInt(sub) % 2 == 0) {
                        exchangePolguaapp.setGender("30300002");
                    } else {
                        exchangePolguaapp.setGender("30300001");
                    }
                }
                if (x.getAac002().length() == 18) {
                    String sub = x.getAac002().substring(x.getAac002().length() - 2, x.getAac002().length() - 1);
                    if (Integer.parseInt(sub) % 2 == 0) {
                        exchangePolguaapp.setGender("30300002");
                    } else {
                        exchangePolguaapp.setGender("30300001");
                    }
                }

            }
        }
        //贷款申请总金额
        exchangePolguaapp.setLoanamount(x.getTac003());
        //政策组合贷款超过贴息部分（元）
        exchangePolguaapp.setGroupamount(x.getTac090());
        //创业担保贷款金额
        exchangePolguaapp.setCreatebusiamount(x.getTac089());
        //微型企业创业扶持贷款
        exchangePolguaapp.setMircoenterpamount(0.0);
        //贷款类型
        exchangePolguaapp.setLoantype(x.getTdi001());
        //是否抵质押担保 -> 新增
        exchangePolguaapp.setIsdzydb(x.getTdi004());
        //贷款年限 -> 新增
        exchangePolguaapp.setLengthofmaturity((short)1);
        //担保期限
        exchangePolguaapp.setCredityear(x.getCaa127());
        //担保费用
        exchangePolguaapp.setSecuritycost(new BigDecimal("0.0"));
        //贷款用途 -> 新增
        exchangePolguaapp.setLoanUse(x.getTac004());
        //固定电话 -> 新增
        exchangePolguaapp.setFixedTel(x.getTac006());
        //是否微型企业
        exchangePolguaapp.setIsmircoenterprise(x.getTac010());
        //家庭月均收入(元）
        exchangePolguaapp.setIncomeofmonth(x.getTac011() == null ? 0 : x.getTac011());
        //就业人数(不含申请人) -> 带动就业人数
        exchangePolguaapp.setEmployeenum(x.getTac012());
        //经营地址
        exchangePolguaapp.setBusinessAddress(x.getTac013());
        //个体工商户名称
        exchangePolguaapp.setGtgshmc(x.getTac016());
        //营业执照号码 -> 工商营业执照号
        if("01".equals(type)){
            exchangePolguaapp.setLicensenum(x.getTac017());
        }
        //经营项目 -> 主营业务1
        exchangePolguaapp.setMainbusiintro(x.getTac018());
        //经营地址电话
        exchangePolguaapp.setPlaceofbusinessphone(x.getTac019());
        //新增 未结清债务
        exchangePolguaapp.setWjqzw(x.getTac020() == null ? new BigDecimal("0") : new BigDecimal(x.getTac020()));
        //邮政编码
        exchangePolguaapp.setPostalCode(x.getTac021());
        //营业面积
        exchangePolguaapp.setBusinessArea(x.getTac022() == null ? new BigDecimal("0") : new BigDecimal(x.getTac022()));
        //月租金
        exchangePolguaapp.setMonthlyPrice(x.getTac023() == null ? new BigDecimal("0") : new BigDecimal(x.getTac023() + ""));
        //总投资
        exchangePolguaapp.setInvsetTotal(x.getTac024() == null ? new BigDecimal("0") : new BigDecimal(x.getTac024() + ""));
        //月销售收入
        exchangePolguaapp.setMonthSellIncome(x.getTac025() == null ? new BigDecimal("0") : new BigDecimal(x.getTac025() + ""));
        //月纯利润
        exchangePolguaapp.setMonthlyPrice(x.getTac026() == null ? new BigDecimal("0") : new BigDecimal(x.getTac026() + ""));
        //自有资金
        exchangePolguaapp.setOwnMoney(x.getTac027() == null ? new BigDecimal("0") : new BigDecimal(x.getTac027() + ""));
        //员工人数
        exchangePolguaapp.setEmployeenum(x.getTac028());
        //证件编号
        exchangePolguaapp.setIdentiNumber(x.getTac029());
        //申请审核返回备注
        exchangePolguaapp.setAuditadvice(x.getTac031());
        //区县审核日期
        exchangePolguaapp.setAuditdate(x.getTac071() == null ? "" : x.getTac071().toString());
        //家庭人口数
        exchangePolguaapp.setFamilyTotal(x.getTac073());
        //就业局审核意见
        exchangePolguaapp.setAuditadvice(x.getTac078());
        //意向银行 -> 意向银行编号
//        exchangePolguaapp.setJm118id(x.getTac079());
        //意向银行
        exchangePolguaapp.setLoanorgId(x.getTac079a() == null ? x.getTac079():x.getTac079a());
        //申报直属统筹区
        exchangePolguaapp.setSbzstcq(x.getTac018());
        //就业审核状态
        exchangePolguaapp.setAuditresult(x.getTac082());
        //jyid
        exchangePolguaapp.setJyid(x.getTac001() == null ? "":x.getTac001().toString());
        //发放审核状态
        exchangePolguaapp.setSendAudit(x.getTac083());
        //贷款状态
        exchangePolguaapp.setLoanStatus(x.getCcc009());
        //申请人类型
//        exchangePolguaapp.setProposertype(x.getCca080());
        exchangePolguaapp.setProposerbigtype(x.getCca080());
        //是否以配偶执照贷款
        exchangePolguaapp.setSfypozzdk(x.getCaa126());
        //是否两无贷款人员
        exchangePolguaapp.setIstwonot(x.getCaa127() == null ? (short) 0 : Short.parseShort(x.getCaa127()));
        //两无贷款人员类别
        exchangePolguaapp.setProposertypeCredit(x.getCaa129());
        //是否21号文件最新人群 TODO
//            exchangePolguaapp.setIs21filepersonneltype(x.getCaa131());
        //人群类别
        exchangePolguaapp.setPersonneltype21file(x.getCaa131());
        //是否免反担保
        exchangePolguaapp.setIsexemptcollateral(x.getCaa132() == null ? (short) 0 : Short.parseShort(x.getCaa132()));
        //免反担保人群类别 -> 确认免反担保人群类别
        exchangePolguaapp.setIsexemptcollateral(x.getCaa130() == null ? (short) 0 : Short.parseShort(x.getCaa130()));
        //营业执照注册时间 -> 注册时间
        exchangePolguaapp.setRegistdate(x.getTac121());
        //贷款申请区  存入中间表区域id
        exchangePolguaapp.setDomicile(x.getAaa027());
        //贷款申请街道/乡镇
        exchangePolguaapp.setStreet(x.getAab301());
        //身份证号码
        exchangePolguaapp.setCredentialno(x.getAac002());
        //姓名
        if ("01".equals(type)) {
            exchangePolguaapp.setClientname(x.getAac003());
        }
        //电话
        exchangePolguaapp.setContactway(x.getAac067());
        exchangePolguaapp.setLegalcellphone(x.getAac067());
        //企业统一社会信用代码 -> 工商营业执照号
        if("02".equals(type)){
            exchangePolguaapp.setLicensenum(x.getTac017());
        }
        //企业名称
        if ("02".equals(type)) {
            exchangePolguaapp.setClientname(x.getAab004());
        }
        //配偶手机号码
        exchangePolguaapp.setMarrowphone(x.getTal007());
        //配偶工作单位
        exchangePolguaapp.setPogzdw(x.getTal008());
        //人员编号
        exchangePolguaapp.setEmployeeIdenti(x.getCcc001() == null ? "" : x.getCcc001().toString());
        //单位编号
        exchangePolguaapp.setUnitIdenti(x.getAab001() == null ? "" : x.getAab001().toString());
        exchangePolguaapp.setXwdauditresult("");
        exchangePolguaapp.setXwdauditdate("");
        exchangePolguaapp.setXwdauditadvice("");
        exchangePolguaapp.setXwdaudittime("");
        exchangePolguaapp.setReadtag1((short) 1);
        exchangePolguaapp.setXwdreadtag1("0");
        exchangePolguaapp.setNewemployeenum(0);
        //担保方式
        return exchangePolguaapp;
    }

    /**
     * 创建担保人信息
     */
    public static ExchangeGuarantorinfo createGuarantorinfo(LoanJm65ApiDto y) {
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
        if("3".equals(y.getTab007())){
            //企业员工
            exchangeGuarantorinfo.setGuarantortype("其他企业在职职工");
        }else if("5".equals(y.getTab007()) || "8".equals(y.getTab007())){
            exchangeGuarantorinfo.setGuarantortype("国有企业正式职工");
        }else if("2".equals(y.getTab007())){
            exchangeGuarantorinfo.setGuarantortype("参公事业单位正式职工");
        }else{
            exchangeGuarantorinfo.setGuarantortype(y.getTab007des());
        }
        //工作单位
        exchangeGuarantorinfo.setGuarantorworkunit(y.getTab008());
        //单位电话
        exchangeGuarantorinfo.setGuarantorunitphone(y.getTab015());
        //年收入
        exchangeGuarantorinfo.setIncomeYear(y.getTab009() == null ? new BigDecimal("0") : new BigDecimal(y.getTab009()));
        //逾期偿还金额（元）
        exchangeGuarantorinfo.setYqchje(y.getTab011() == null ? new BigDecimal("0") : new BigDecimal(y.getTab011()));
        //现有负债(元)
        exchangeGuarantorinfo.setXyfz(y.getTab013() == null ? new BigDecimal("0") : new BigDecimal(y.getTab013()));
        //供养人口
        exchangeGuarantorinfo.setGyrk(y.getTab012() == null ? new BigDecimal("0") : new BigDecimal(y.getTab012()));
        //职务
        exchangeGuarantorinfo.setDuty(y.getTab014());
        //担保额度(元) -> 保证金额(万元)
        exchangeGuarantorinfo.setDeposit(y.getTab018() == null ? new BigDecimal("0") : new BigDecimal(y.getTab018()));
        //档案附件ID
        exchangeGuarantorinfo.setDafjId(y.getRecordid());
        //担保人签字情况
        exchangeGuarantorinfo.setDbrqzqk(y.getTab020());

        return exchangeGuarantorinfo;
    }

    /**
     * 创建抵质押物信息
     *
     * @param z
     */
    public static ExchangeCollateralinfo createCollateralinfo(LoanJm66ApiDto z) {
        ExchangeCollateralinfo exchangeCollateralinfo = new ExchangeCollateralinfo();
        //与申请表关联ID
//        exchangeCollateralinfo.setLoanapplyid(String.valueOf(id));
        //权属人证件编码
        exchangeCollateralinfo.setMortageowneridcard(z.getTad002());
        //姓名 -> 抵押物所有人
        exchangeCollateralinfo.setOwner(z.getTad003());
        //手机号码
        exchangeCollateralinfo.setTelephone(z.getTad007());
        //单位电话
        exchangeCollateralinfo.setUnitTel(z.getTad007());
        //家庭住址
        exchangeCollateralinfo.setHomeAddr(z.getTad005());
        //资产权属 码值TAD009
        if("1".equals(z.getTad009()) || "2".equals(z.getTad009())){
            exchangeCollateralinfo.setAssetownertype("01");
        }
        if("3".equals(z.getTad009())){
            exchangeCollateralinfo.setAssetownertype("02");
        }
        //资产类别 码值TAD010
        if("1".equals(z.getTad010())|| "4".equals(z.getTad010())||"5".equals(z.getTad010())||"6".equals(z.getTad010())||"7".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("04");
        }
        if("21".equals(z.getTad010())|| "9".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("01");
        }
        if("10".equals(z.getTad010())|| "22".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("02");
        }
        if("23".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("03");
        }
        if("25".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("05");
        }
        if("27".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("07");
        }
        if("27".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("07");
        }
        if("28".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("08");
        }
        if("29".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("09");
        }
        if("30".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("10");
        }
        if("8".equals(z.getTad010())){
            exchangeCollateralinfo.setAssettype("06");
        }
        //抵、质押品名称
        exchangeCollateralinfo.setMortgagename(z.getTad011());
        //抵、质押品证号 -> 权利证号
        exchangeCollateralinfo.setWarrant(z.getTad012());
        //抵、质押品估价
        exchangeCollateralinfo.setAssessvalue(z.getTad013() == null ? new BigDecimal("0") : new BigDecimal(z.getTad013()));
        //抵、质押品面积
        exchangeCollateralinfo.setMortgagearea(z.getTad014() == null ? "" : z.getTad014().toString());
        //土地属性
        exchangeCollateralinfo.setLandproperty(z.getTad015());
        //购买价值（元）
        exchangeCollateralinfo.setBuyValue(z.getTad016() == null ? new BigDecimal("0") : new BigDecimal(z.getTad016()));
        //购买时间
        exchangeCollateralinfo.setBuydate(z.getTad017() == null ? "" : z.getTad017().toString());
        //抵押物区域
        exchangeCollateralinfo.setDywqy(z.getTad019());
        exchangeCollateralinfo.setCollateralarea(z.getTad019());
        //所属乡镇街道
//        exchangeCollateralinfo.setSsxzjd(z.getTad021());
        exchangeCollateralinfo.setStreet(z.getTad021());
        //街道
        exchangeCollateralinfo.setCounty(z.getTad020());
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
     *
     * @return
     */
    public static ExchangeShareholder createShareholder(StockholderApiDto a) {
        ExchangeShareholder exchangeShareholder = new ExchangeShareholder();
        //关联id
//        exchangeShareholder.setLoanapplyid(String.valueOf(id));
        //股东编号
        exchangeShareholder.setGdbh(a.getGdk001() == null ? new BigDecimal("0") : new BigDecimal(a.getGdk001()));
        //单位编号
        exchangeShareholder.setUnitNo(a.getAab001() == null ? new BigDecimal("0") : BigDecimal.valueOf(a.getAab001()));
        //身份证号
        exchangeShareholder.setIdno(a.getAac002());
        //姓名
        exchangeShareholder.setName(a.getAac003());
        //出资额
        exchangeShareholder.setShareamt(a.getGdk003() == null ? new BigDecimal("0") : new BigDecimal(a.getGdk003()));
        //手机号
        exchangeShareholder.setMobile(a.getGdk004());
        //前端操作标识
        exchangeShareholder.setQdczbs(a.getGdk002());
        //前端操作标识描述
        exchangeShareholder.setQdczbsms(a.getGdk002des());

        return exchangeShareholder;
    }

    /**
     * 创建员工信息
     *
     * @param q
     */
    public static ExchangeEmployee createEmployee(LoanEmployeesApiDto q) {
        ExchangeEmployee exchangeEmployee = new ExchangeEmployee();
        //关联id
//        exchangeEmployee.setLoanapplyid(String.valueOf(id));
        //就业登记编号
        exchangeEmployee.setJydjbh(q.getAcc002() == null ? new BigDecimal("0") : new BigDecimal(q.getAcc002()));
        //人员编号
        exchangeEmployee.setEmployeeNo(q.getCcc001() == null ? new BigDecimal("0") : BigDecimal.valueOf(q.getCcc001()));
        //身份证号
        exchangeEmployee.setIdno(q.getAac002());
        //姓名
        exchangeEmployee.setName(q.getAac003());
        //
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
