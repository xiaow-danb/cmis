package com.wander.cmis.entity;

import java.math.BigDecimal;

//抵押信息
public class ExchangeCollateralinfo {
    private String id;

    private String loanapplyid;

    private String assetownertype;

    private String owner;

    private String assettype;

    private String mortgagename;

    private String mortgageaddr;

    private String mortgagearea;

    private String warrant;

    private BigDecimal assessvalue;

    private String landproperty;

    private String remark;

    private String buydate;

    private String collateralarea;

    private String county;

    private String street;

    private String mortageowneridcard;

    private String qsrzjbm;

    private String telephone;

    private String unitTel;

    private String homeAddr;

    private BigDecimal buyValue;

    private String dafjId;

    private String dbrqzqk;

    private String dywqy;

    private String ssxzjd;

    public ExchangeCollateralinfo() {
        super();
    }

    public ExchangeCollateralinfo(String id, String loanapplyid, String assetownertype, String owner, String assettype, String mortgagename, String mortgageaddr, String mortgagearea, String warrant, BigDecimal assessvalue, String landproperty, String remark, String buydate, String collateralarea, String county, String street, String mortageowneridcard, String qsrzjbm, String telephone, String unitTel, String homeAddr, BigDecimal buyValue, String dafjId, String dbrqzqk, String dywqy, String ssxzjd) {
        this.id = id;
        this.loanapplyid = loanapplyid;
        this.assetownertype = assetownertype;
        this.owner = owner;
        this.assettype = assettype;
        this.mortgagename = mortgagename;
        this.mortgageaddr = mortgageaddr;
        this.mortgagearea = mortgagearea;
        this.warrant = warrant;
        this.assessvalue = assessvalue;
        this.landproperty = landproperty;
        this.remark = remark;
        this.buydate = buydate;
        this.collateralarea = collateralarea;
        this.county = county;
        this.street = street;
        this.mortageowneridcard = mortageowneridcard;
        this.qsrzjbm = qsrzjbm;
        this.telephone = telephone;
        this.unitTel = unitTel;
        this.homeAddr = homeAddr;
        this.buyValue = buyValue;
        this.dafjId = dafjId;
        this.dbrqzqk = dbrqzqk;
        this.dywqy = dywqy;
        this.ssxzjd = ssxzjd;
    }

    @Override
    public String toString() {
        return "ExchangeCollateralinfo{" +
                "id='" + id + '\'' +
                ", loanapplyid='" + loanapplyid + '\'' +
                ", assetownertype='" + assetownertype + '\'' +
                ", owner='" + owner + '\'' +
                ", assettype='" + assettype + '\'' +
                ", mortgagename='" + mortgagename + '\'' +
                ", mortgageaddr='" + mortgageaddr + '\'' +
                ", mortgagearea='" + mortgagearea + '\'' +
                ", warrant='" + warrant + '\'' +
                ", assessvalue=" + assessvalue +
                ", landproperty='" + landproperty + '\'' +
                ", remark='" + remark + '\'' +
                ", buydate='" + buydate + '\'' +
                ", collateralarea='" + collateralarea + '\'' +
                ", county='" + county + '\'' +
                ", street='" + street + '\'' +
                ", mortageowneridcard='" + mortageowneridcard + '\'' +
                ", qsrzjbm='" + qsrzjbm + '\'' +
                ", telephone='" + telephone + '\'' +
                ", unitTel='" + unitTel + '\'' +
                ", homeAddr='" + homeAddr + '\'' +
                ", buyValue=" + buyValue +
                ", dafjId='" + dafjId + '\'' +
                ", dbrqzqk='" + dbrqzqk + '\'' +
                ", dywqy='" + dywqy + '\'' +
                ", ssxzjd='" + ssxzjd + '\'' +
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

    public String getAssetownertype() {
        return assetownertype;
    }

    public void setAssetownertype(String assetownertype) {
        this.assetownertype = assetownertype;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype;
    }

    public String getMortgagename() {
        return mortgagename;
    }

    public void setMortgagename(String mortgagename) {
        this.mortgagename = mortgagename;
    }

    public String getMortgageaddr() {
        return mortgageaddr;
    }

    public void setMortgageaddr(String mortgageaddr) {
        this.mortgageaddr = mortgageaddr;
    }

    public String getMortgagearea() {
        return mortgagearea;
    }

    public void setMortgagearea(String mortgagearea) {
        this.mortgagearea = mortgagearea;
    }

    public String getWarrant() {
        return warrant;
    }

    public void setWarrant(String warrant) {
        this.warrant = warrant;
    }

    public BigDecimal getAssessvalue() {
        return assessvalue;
    }

    public void setAssessvalue(BigDecimal assessvalue) {
        this.assessvalue = assessvalue;
    }

    public String getLandproperty() {
        return landproperty;
    }

    public void setLandproperty(String landproperty) {
        this.landproperty = landproperty;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
        this.buydate = buydate;
    }

    public String getCollateralarea() {
        return collateralarea;
    }

    public void setCollateralarea(String collateralarea) {
        this.collateralarea = collateralarea;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMortageowneridcard() {
        return mortageowneridcard;
    }

    public void setMortageowneridcard(String mortageowneridcard) {
        this.mortageowneridcard = mortageowneridcard;
    }

    public String getQsrzjbm() {
        return qsrzjbm;
    }

    public void setQsrzjbm(String qsrzjbm) {
        this.qsrzjbm = qsrzjbm;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUnitTel() {
        return unitTel;
    }

    public void setUnitTel(String unitTel) {
        this.unitTel = unitTel;
    }

    public String getHomeAddr() {
        return homeAddr;
    }

    public void setHomeAddr(String homeAddr) {
        this.homeAddr = homeAddr;
    }

    public BigDecimal getBuyValue() {
        return buyValue;
    }

    public void setBuyValue(BigDecimal buyValue) {
        this.buyValue = buyValue;
    }

    public String getDafjId() {
        return dafjId;
    }

    public void setDafjId(String dafjId) {
        this.dafjId = dafjId;
    }

    public String getDbrqzqk() {
        return dbrqzqk;
    }

    public void setDbrqzqk(String dbrqzqk) {
        this.dbrqzqk = dbrqzqk;
    }

    public String getDywqy() {
        return dywqy;
    }

    public void setDywqy(String dywqy) {
        this.dywqy = dywqy;
    }

    public String getSsxzjd() {
        return ssxzjd;
    }

    public void setSsxzjd(String ssxzjd) {
        this.ssxzjd = ssxzjd;
    }
}