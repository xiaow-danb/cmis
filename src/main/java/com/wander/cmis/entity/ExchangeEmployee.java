package com.wander.cmis.entity;

import java.math.BigDecimal;

//企业员工信息
public class ExchangeEmployee {
    private String id;

    private String loanapplyid;

    private String name;

    private String idno;

    private BigDecimal jydjbh;

    private BigDecimal employeeNo;

    private String sex;

    private String sexDesc;

    private String hkxz;

    private String whcd;

    private String whcdms;

    private String rylb1;

    private String rtlb1ms;

    private String rylb2;

    private String rylb2ms;

    private String rylb3;

    private String rylb3ms;

    private String dkrylb;

    private String dkrylbms;

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

    public BigDecimal getJydjbh() {
        return jydjbh;
    }

    public void setJydjbh(BigDecimal jydjbh) {
        this.jydjbh = jydjbh;
    }

    public BigDecimal getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(BigDecimal employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSexDesc() {
        return sexDesc;
    }

    public void setSexDesc(String sexDesc) {
        this.sexDesc = sexDesc == null ? null : sexDesc.trim();
    }

    public String getHkxz() {
        return hkxz;
    }

    public void setHkxz(String hkxz) {
        this.hkxz = hkxz == null ? null : hkxz.trim();
    }

    public String getWhcd() {
        return whcd;
    }

    public void setWhcd(String whcd) {
        this.whcd = whcd == null ? null : whcd.trim();
    }

    public String getWhcdms() {
        return whcdms;
    }

    public void setWhcdms(String whcdms) {
        this.whcdms = whcdms == null ? null : whcdms.trim();
    }

    public String getRylb1() {
        return rylb1;
    }

    public void setRylb1(String rylb1) {
        this.rylb1 = rylb1 == null ? null : rylb1.trim();
    }

    public String getRtlb1ms() {
        return rtlb1ms;
    }

    public void setRtlb1ms(String rtlb1ms) {
        this.rtlb1ms = rtlb1ms == null ? null : rtlb1ms.trim();
    }

    public String getRylb2() {
        return rylb2;
    }

    public void setRylb2(String rylb2) {
        this.rylb2 = rylb2 == null ? null : rylb2.trim();
    }

    public String getRylb2ms() {
        return rylb2ms;
    }

    public void setRylb2ms(String rylb2ms) {
        this.rylb2ms = rylb2ms == null ? null : rylb2ms.trim();
    }

    public String getRylb3() {
        return rylb3;
    }

    public void setRylb3(String rylb3) {
        this.rylb3 = rylb3 == null ? null : rylb3.trim();
    }

    public String getRylb3ms() {
        return rylb3ms;
    }

    public void setRylb3ms(String rylb3ms) {
        this.rylb3ms = rylb3ms == null ? null : rylb3ms.trim();
    }

    public String getDkrylb() {
        return dkrylb;
    }

    public void setDkrylb(String dkrylb) {
        this.dkrylb = dkrylb == null ? null : dkrylb.trim();
    }

    public String getDkrylbms() {
        return dkrylbms;
    }

    public void setDkrylbms(String dkrylbms) {
        this.dkrylbms = dkrylbms == null ? null : dkrylbms.trim();
    }
}