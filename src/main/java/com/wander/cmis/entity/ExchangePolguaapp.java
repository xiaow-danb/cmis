package com.wander.cmis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

//小额贷款申请数据
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EXCHANGE_POLGUAAPP")
public class ExchangePolguaapp {

    @Id
    @Column(name = "ID")
    private String id;

    private String exchangeType;

    private String applyno;

    private String createtime;

    private String loantype;

    private String clienttype;

    private String clientname;

    private String proposertype;

    private String industry;

    private String contactway;

    private String gender;

    private String credentialno;

    private String domicile;

    private String ismircoenterprise;

    private String registdate;

    private BigDecimal registerfunds;

    private String legalnm;

    private String legalcellphone;

    private String legalcredentialno;

    private String basicbanknm;

    private String basicaccount;

    private BigDecimal totalassets;

    private BigDecimal totalbankliabilities;

    private BigDecimal yearincome;

    private String mainbusiintro;

    private Integer employeenum;

    private String taxno;

    private String licensenum;

    private Double createbusiamount;

    private Double groupamount;

    private Double mircoenterpamount;

    private Double loanamount;

    private String guarmethod;

    private Short lengthofmaturity;

    private BigDecimal securitycost;

    private String loanorgId;

    private String loanorgname;

    private String updatetime;

    private Short readtag1;

    private String auditresult;

    private String auditadvice;

    private String auditdate;

    private String jyid;

    private String xwdreadtag1;

    private String xwdauditresult;

    private Short readtag2;

    private String loantag;

    private Short readtag3;

    private Double incomeofmonth;

    private String enterprisecode;

    private String loanname;

    private String xwdauditdate;

    private String loandate;

    private Short applycount;

    private String xwdauditadvice;

    private String placeofbusinessphone;

    private String corporatetype;

    private String errormsg;

    private String proposerbigtype;

    private String proposersmalltype;

    private Integer newemployeenum;

    private String partnerno;

    private String isautoread;

    private String datacreatetime;

    private String jyjupdatetime;

    private String xwdupdatetime;

    private String jyjaudittime;

    private String xwdaudittime;

    private String marrownm;

    private String marrowcredentialno;

    private String marrowphone;

    private String credentialnochanged;

    private String applyidXwd;

    private String credityear;

    private String proposertypeCredit;

    private Short istwonot;

    private Boolean is21filepersonneltype;

    private String personneltype21file;

    private Short isexemptcollateral;

    private String exemptcollpertype;

    private String loanWay;

    private String qrmfdbrqlb;

    private String lwrylb;

    private String marrStatus;

    private String sfypozzdk;

    private String pogzdw;

    private String flwssddz;

    private String gtgshmc;

    private String businessAddress;

    private String swdjh;

    private String dksqjd;

    private Double zhsydkje;

    private String yxyhbh;

    private String bcsjtjzt;

    //贷款申请日期
    private String loanApplyDate;

    //是否担保人担保
    private String sfdbrdb;

    //是否抵质押担保
    private String isdzydb;

    //贷款年限
    private String loanAge;

    //贷款用途
    private String loanUse;

    //固定电话
    private String fixedTel;

    //未结清债务
    private BigDecimal wjqzw;

    //邮政编码
    private String postalCode;

    //营业面积
    private BigDecimal businessArea;

    //月租金
    private BigDecimal monthlyPrice;

    //总投资
    private BigDecimal invsetTotal;

    //月销售收入
    private BigDecimal monthSellIncome;

    //月纯利润
    private BigDecimal monthProfit;

    //自有资金
    private BigDecimal ownMoney;

    //员工人数
    private Integer employeeCount;

    //证件编号
    private String identiNumber;
    //申请审核返回备注
    private String sqshfhbz;
    //区县审核日期
    private String qxshrq;
    //家庭人口数
    private Integer familyTotal;
    //就业局审核意见
    private String jyjAdvice;
    //申报直属统筹区
    private String sbzstcq;
    //就业审核状态
    private String jyAudit;
    //发放审核状态
    private String sendAudit;
    //政策性贷款金额
    private BigDecimal zcxdkje;
    //商业贷款
    private BigDecimal businessLoan;
    //贷款状态
    private String loanStatus;
    //贷款授信年限
    private Integer dksxnx;
    //是否两无贷款人员
    private String istowloanpersonal;
    //人群类别
    private String personalType;
    //是否免反担保
    private String ismfdb;
    //贷款申请区
    private String loanApplyRegion;

    //人员编号
    private String employeeIdenti;

    //单位编号
    private String unitIdenti;

    //是否失败
    private String isfail;

    //公共服务编号
    private String handingno;
}