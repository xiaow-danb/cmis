package com.wander.cmis.entity;

import java.math.BigDecimal;

//抵质押物信息
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

    public String getAssetownertype() {
        return assetownertype;
    }

    public void setAssetownertype(String assetownertype) {
        this.assetownertype = assetownertype == null ? null : assetownertype.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype == null ? null : assettype.trim();
    }

    public String getMortgagename() {
        return mortgagename;
    }

    public void setMortgagename(String mortgagename) {
        this.mortgagename = mortgagename == null ? null : mortgagename.trim();
    }

    public String getMortgageaddr() {
        return mortgageaddr;
    }

    public void setMortgageaddr(String mortgageaddr) {
        this.mortgageaddr = mortgageaddr == null ? null : mortgageaddr.trim();
    }

    public String getMortgagearea() {
        return mortgagearea;
    }

    public void setMortgagearea(String mortgagearea) {
        this.mortgagearea = mortgagearea == null ? null : mortgagearea.trim();
    }

    public String getWarrant() {
        return warrant;
    }

    public void setWarrant(String warrant) {
        this.warrant = warrant == null ? null : warrant.trim();
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
        this.landproperty = landproperty == null ? null : landproperty.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
        this.buydate = buydate == null ? null : buydate.trim();
    }

    public String getCollateralarea() {
        return collateralarea;
    }

    public void setCollateralarea(String collateralarea) {
        this.collateralarea = collateralarea == null ? null : collateralarea.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }
}