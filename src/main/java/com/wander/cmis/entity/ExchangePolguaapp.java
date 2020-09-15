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

    private Short employeenum;

    private String taxno;

    private String licensenum;

    private BigDecimal createbusiamount;

    private BigDecimal groupamount;

    private BigDecimal mircoenterpamount;

    private BigDecimal loanamount;

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

    private BigDecimal incomeofmonth;

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

    private Short newemployeenum;

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

    private BigDecimal zhsydkje;

    private String yxyhbh;

    private String bcsjtjzt;

}