package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//放款信息（中间表）
public class ExhangeProjectLoan {
    private String id;

    private String loanapplyid;

    private String jyid;

    private BigDecimal feerate;

    private BigDecimal guaranteefee;

    private BigDecimal loanrate;

    private String loandate;

    private String loanorganizationnm;

    private Short readtag1;

    private BigDecimal loanamount;

    private String isdiscount;

    private Date createtime;

    private Date auditDate;

    private String auditStatus;

    private String auditAdvice;

    private String loanType;

    private String grantStatus;

    public ExhangeProjectLoan() {
        super();
    }

    public ExhangeProjectLoan(String id, String loanapplyid, String jyid, BigDecimal feerate, BigDecimal guaranteefee, BigDecimal loanrate, String loandate, String loanorganizationnm, Short readtag1, BigDecimal loanamount, String isdiscount, Date createtime, Date auditDate, String auditStatus, String auditAdvice, String loanType, String grantStatus) {
        this.id = id;
        this.loanapplyid = loanapplyid;
        this.jyid = jyid;
        this.feerate = feerate;
        this.guaranteefee = guaranteefee;
        this.loanrate = loanrate;
        this.loandate = loandate;
        this.loanorganizationnm = loanorganizationnm;
        this.readtag1 = readtag1;
        this.loanamount = loanamount;
        this.isdiscount = isdiscount;
        this.createtime = createtime;
        this.auditDate = auditDate;
        this.auditStatus = auditStatus;
        this.auditAdvice = auditAdvice;
        this.loanType = loanType;
        this.grantStatus = grantStatus;
    }

    @Override
    public String toString() {
        return "ExhangeProjectLoan{" +
                "id='" + id + '\'' +
                ", loanapplyid='" + loanapplyid + '\'' +
                ", jyid='" + jyid + '\'' +
                ", feerate=" + feerate +
                ", guaranteefee=" + guaranteefee +
                ", loanrate=" + loanrate +
                ", loandate='" + loandate + '\'' +
                ", loanorganizationnm='" + loanorganizationnm + '\'' +
                ", readtag1=" + readtag1 +
                ", loanamount=" + loanamount +
                ", isdiscount='" + isdiscount + '\'' +
                ", createtime=" + createtime +
                ", auditDate=" + auditDate +
                ", auditStatus='" + auditStatus + '\'' +
                ", auditAdvice='" + auditAdvice + '\'' +
                ", loanType='" + loanType + '\'' +
                ", grantStatus='" + grantStatus + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoanapplyid() {
        return loanapplyid;
    }

    public void setLoanapplyid(String loanapplyid) {
        this.loanapplyid = loanapplyid;
    }

    public String getJyid() {
        return jyid;
    }

    public void setJyid(String jyid) {
        this.jyid = jyid;
    }

    public BigDecimal getFeerate() {
        return feerate;
    }

    public void setFeerate(BigDecimal feerate) {
        this.feerate = feerate;
    }

    public BigDecimal getGuaranteefee() {
        return guaranteefee;
    }

    public void setGuaranteefee(BigDecimal guaranteefee) {
        this.guaranteefee = guaranteefee;
    }

    public BigDecimal getLoanrate() {
        return loanrate;
    }

    public void setLoanrate(BigDecimal loanrate) {
        this.loanrate = loanrate;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public String getLoanorganizationnm() {
        return loanorganizationnm;
    }

    public void setLoanorganizationnm(String loanorganizationnm) {
        this.loanorganizationnm = loanorganizationnm;
    }

    public Short getReadtag1() {
        return readtag1;
    }

    public void setReadtag1(Short readtag1) {
        this.readtag1 = readtag1;
    }

    public BigDecimal getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(BigDecimal loanamount) {
        this.loanamount = loanamount;
    }

    public String getIsdiscount() {
        return isdiscount;
    }

    public void setIsdiscount(String isdiscount) {
        this.isdiscount = isdiscount;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditAdvice() {
        return auditAdvice;
    }

    public void setAuditAdvice(String auditAdvice) {
        this.auditAdvice = auditAdvice;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getGrantStatus() {
        return grantStatus;
    }

    public void setGrantStatus(String grantStatus) {
        this.grantStatus = grantStatus;
    }
}