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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoanapplyid() {
        return loanapplyid;
    }

    public void setLoanapplyid(String loanapplyid) {
        this.loanapplyid = loanapplyid == null ? null : loanapplyid.trim();
    }

    public String getJyid() {
        return jyid;
    }

    public void setJyid(String jyid) {
        this.jyid = jyid == null ? null : jyid.trim();
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
        this.loandate = loandate == null ? null : loandate.trim();
    }

    public String getLoanorganizationnm() {
        return loanorganizationnm;
    }

    public void setLoanorganizationnm(String loanorganizationnm) {
        this.loanorganizationnm = loanorganizationnm == null ? null : loanorganizationnm.trim();
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
        this.isdiscount = isdiscount == null ? null : isdiscount.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}