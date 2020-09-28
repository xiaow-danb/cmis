package com.wander.cmis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import oracle.jdbc.OracleTypes;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;

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

    private String exchange_type;

    private String applyno;

    private String createtime;//贷款申请日期

    private String loantype;

    private String clienttype;

    private String clientname;

    private String proposertype;

    private String industry;

    private String contactway;

    private String gender;

    private String credentialno;

    private String domicile;//贷款申请区

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

    private Integer employeenum;//员工人数

    private String taxno;//税务登记号

    private String licensenum;

    private Double createbusiamount;//政策性贷款金额

    private Double groupamount;//商业贷款

    private Double mircoenterpamount;

    private Double loanamount;

    /**
     * 担保方式
     * 担保人 抵质押	guarMethod;
     * 是	是	05
     * 是	否	01
     * 否	是	02
     * 否	否	03
     */
    private String guarmethod;

    private Short lengthofmaturity;//贷款授信年限->贷款年限

    private BigDecimal securitycost;

    private String loanorg_id;

    private String loanorgname;

    private String updatetime;

    private Short readtag1;

    private String auditresult;//就业审核状态

    private String auditadvice;//就业局审核意见

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

    private String credityear;//贷款期限

    private String proposertypeCredit;//两无贷款人员类别

    private Short istwonot;//是否两无贷款人员

    private Boolean is21filepersonneltype;

    private String personneltype21file;//人群类别

    private Short isexemptcollateral;//是否免反担保

    private String exemptcollpertype;//确认免反担保人群类别

    private String loanway;//贷款方式

    private String marrStatus;//婚姻状况

    private String sfypozzdk;//是否以配偶执照贷款

    private String pogzdw;//配偶工作单位

    private String flwssddz;//法律(诉讼)文书送达地址

    private String gtgshmc;//个体工商户名称

    private String businessAddress;//经营地址

//    private String dksqjd;//贷款申请街道

//    private Double zhsydkje;//组合商业贷款金额

    private String jm118id;

    private String bcsjtjzt;//本次数据提交状态

    //是否抵质押担保
    private String isdzydb;

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
    //证件编号
    private String identiNumber;
    //申请审核返回备注
    private String sqshfhbz;
    //区县审核日期
    private String qxshrq;
    //家庭人口数
    private Integer familyTotal;
    //申报直属统筹区
    private String sbzstcq;
    //发放审核状态
    private String sendAudit;
    //贷款状态
    private String loanStatus;
    //人员编号
    private String employeeIdenti;

    //单位编号
    private String unitIdenti;

    //是否失败
    private String isfail;

    //法人身份证号
    private String legalId;

    //申请街道
    private String street;

    //公共服务编号
    private String handingno;

    //法人姓名
    private String legaName;

    //单位注册地址
//    private String unitRegistAddr;
    //申请来源
    private String sourcetype;

    //微型企业类型
    private String mircoType;

    //人员信息绑定推送状态
    private String personSyncStatus;

    //单位信息绑定推送状态
    private String unitSyncStatus;
}