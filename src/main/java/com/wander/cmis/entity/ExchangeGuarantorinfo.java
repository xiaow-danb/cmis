package com.wander.cmis.entity;

import java.math.BigDecimal;

//保证人信息
public class ExchangeGuarantorinfo {
    private String id;

    private String loanapplyid;

    private String guarantor;

    private String idno;

    private String workunittype;

    private String guarantorworkunit;

    private String duty;

    private String guarantorunitphone;

    private BigDecimal deposit;

    private BigDecimal monthlyincome;

    private String contactway;

    private String address;

    private String guarantortype;

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

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor == null ? null : guarantor.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getWorkunittype() {
        return workunittype;
    }

    public void setWorkunittype(String workunittype) {
        this.workunittype = workunittype == null ? null : workunittype.trim();
    }

    public String getGuarantorworkunit() {
        return guarantorworkunit;
    }

    public void setGuarantorworkunit(String guarantorworkunit) {
        this.guarantorworkunit = guarantorworkunit == null ? null : guarantorworkunit.trim();
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getGuarantorunitphone() {
        return guarantorunitphone;
    }

    public void setGuarantorunitphone(String guarantorunitphone) {
        this.guarantorunitphone = guarantorunitphone == null ? null : guarantorunitphone.trim();
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getMonthlyincome() {
        return monthlyincome;
    }

    public void setMonthlyincome(BigDecimal monthlyincome) {
        this.monthlyincome = monthlyincome;
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGuarantortype() {
        return guarantortype;
    }

    public void setGuarantortype(String guarantortype) {
        this.guarantortype = guarantortype == null ? null : guarantortype.trim();
    }
}