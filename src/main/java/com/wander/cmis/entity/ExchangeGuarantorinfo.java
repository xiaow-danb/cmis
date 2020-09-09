package com.wander.cmis.entity;

import java.math.BigDecimal;

//抵押信息
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

    private BigDecimal yqchje;

    private BigDecimal xyfz;

    private BigDecimal gyrk;

    private String adfjId;

    private String dbrqzqk;

    @Override
    public String toString() {
        return "ExchangeGuarantorinfo{" +
                "id='" + id + '\'' +
                ", loanapplyid='" + loanapplyid + '\'' +
                ", guarantor='" + guarantor + '\'' +
                ", idno='" + idno + '\'' +
                ", workunittype='" + workunittype + '\'' +
                ", guarantorworkunit='" + guarantorworkunit + '\'' +
                ", duty='" + duty + '\'' +
                ", guarantorunitphone='" + guarantorunitphone + '\'' +
                ", deposit=" + deposit +
                ", monthlyincome=" + monthlyincome +
                ", contactway='" + contactway + '\'' +
                ", address='" + address + '\'' +
                ", guarantortype='" + guarantortype + '\'' +
                ", yqchje=" + yqchje +
                ", xyfz=" + xyfz +
                ", gyrk=" + gyrk +
                ", adfjId='" + adfjId + '\'' +
                ", dbrqzqk='" + dbrqzqk + '\'' +
                '}';
    }

    public ExchangeGuarantorinfo() {
        super();
    }

    public ExchangeGuarantorinfo(String id, String loanapplyid, String guarantor, String idno, String workunittype, String guarantorworkunit, String duty, String guarantorunitphone, BigDecimal deposit, BigDecimal monthlyincome, String contactway, String address, String guarantortype, BigDecimal yqchje, BigDecimal xyfz, BigDecimal gyrk, String adfjId, String dbrqzqk) {
        this.id = id;
        this.loanapplyid = loanapplyid;
        this.guarantor = guarantor;
        this.idno = idno;
        this.workunittype = workunittype;
        this.guarantorworkunit = guarantorworkunit;
        this.duty = duty;
        this.guarantorunitphone = guarantorunitphone;
        this.deposit = deposit;
        this.monthlyincome = monthlyincome;
        this.contactway = contactway;
        this.address = address;
        this.guarantortype = guarantortype;
        this.yqchje = yqchje;
        this.xyfz = xyfz;
        this.gyrk = gyrk;
        this.adfjId = adfjId;
        this.dbrqzqk = dbrqzqk;
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

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getWorkunittype() {
        return workunittype;
    }

    public void setWorkunittype(String workunittype) {
        this.workunittype = workunittype;
    }

    public String getGuarantorworkunit() {
        return guarantorworkunit;
    }

    public void setGuarantorworkunit(String guarantorworkunit) {
        this.guarantorworkunit = guarantorworkunit;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getGuarantorunitphone() {
        return guarantorunitphone;
    }

    public void setGuarantorunitphone(String guarantorunitphone) {
        this.guarantorunitphone = guarantorunitphone;
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
        this.contactway = contactway;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGuarantortype() {
        return guarantortype;
    }

    public void setGuarantortype(String guarantortype) {
        this.guarantortype = guarantortype;
    }

    public BigDecimal getYqchje() {
        return yqchje;
    }

    public void setYqchje(BigDecimal yqchje) {
        this.yqchje = yqchje;
    }

    public BigDecimal getXyfz() {
        return xyfz;
    }

    public void setXyfz(BigDecimal xyfz) {
        this.xyfz = xyfz;
    }

    public BigDecimal getGyrk() {
        return gyrk;
    }

    public void setGyrk(BigDecimal gyrk) {
        this.gyrk = gyrk;
    }

    public String getAdfjId() {
        return adfjId;
    }

    public void setAdfjId(String adfjId) {
        this.adfjId = adfjId;
    }

    public String getDbrqzqk() {
        return dbrqzqk;
    }

    public void setDbrqzqk(String dbrqzqk) {
        this.dbrqzqk = dbrqzqk;
    }
}