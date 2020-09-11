package com.wander.cmis.entity;

import java.math.BigDecimal;

public class ExchangeShareholder {
    private String id;

    private String loanapplyid;

    private String name;

    private String idno;

    private BigDecimal shareamt;

    private String mobile;

    private BigDecimal gdbh;

    private BigDecimal unitNo;

    private String qdczbs;

    private String qdczbsms;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public BigDecimal getShareamt() {
        return shareamt;
    }

    public void setShareamt(BigDecimal shareamt) {
        this.shareamt = shareamt;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public BigDecimal getGdbh() {
        return gdbh;
    }

    public void setGdbh(BigDecimal gdbh) {
        this.gdbh = gdbh;
    }

    public BigDecimal getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(BigDecimal unitNo) {
        this.unitNo = unitNo;
    }

    public String getQdczbs() {
        return qdczbs;
    }

    public void setQdczbs(String qdczbs) {
        this.qdczbs = qdczbs == null ? null : qdczbs.trim();
    }

    public String getQdczbsms() {
        return qdczbsms;
    }

    public void setQdczbsms(String qdczbsms) {
        this.qdczbsms = qdczbsms == null ? null : qdczbsms.trim();
    }
}