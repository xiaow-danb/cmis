package com.wander.cmis.entity;

import java.math.BigDecimal;

//企业股东信息
public class ExchangeShareholder {
    private String id;

    private String loanapplyid;

    private String name;

    private String idno;

    private BigDecimal shareamt;

    private String mobile;

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
}