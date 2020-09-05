package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//反担保表
public class Antiguarantee {
    private String id;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private String mortgageaddr;

    private Double mortgagearea;

    private String antiguaranteetype;

    private BigDecimal assessvalue;

    private String assetownership;

    private String assettype;

    private String contactway;

    private String creater;

    private BigDecimal creationtime;

    private BigDecimal deposit;

    private String duty;

    private String guarantor;

    private String guarantoridcardno;

    private String guarantorworkunit;

    private BigDecimal monthlyincome;

    private String owner;

    private String remark;

    private String status;

    private String warrant;

    private String policyapplyId;

    private String landproperty;

    private String mortgagenm;

    private String contactwayworkunit;

    private String industrytype;

    private String workunittype;

    private BigDecimal purchaseamount;

    private BigDecimal purchasedate;

    private String belongcountyId;

    private String belongstreetId;

    private String guarantoraddr;

    private String guarantortype;

    private String collateralarea;

    private String collateralpersonidno;

    private String collateralpersonphone;

    private String guarantorspouseidcard;

    private String guarantorspouse;

    private String guarantorspousephone;

    private BigDecimal guarantoryearincome;

    private String belongcountyid;

    private BigDecimal socialsecuritypay;

    private BigDecimal valueofguaranty;

    private BigDecimal valueofmortgages;

    private String mortageowneridcard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }

    public Short getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Short isdeleted) {
        this.isdeleted = isdeleted;
    }

    public String getUpdateby() {
        return updateby;
    }

    public void setUpdateby(String updateby) {
        this.updateby = updateby == null ? null : updateby.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getMortgageaddr() {
        return mortgageaddr;
    }

    public void setMortgageaddr(String mortgageaddr) {
        this.mortgageaddr = mortgageaddr == null ? null : mortgageaddr.trim();
    }

    public Double getMortgagearea() {
        return mortgagearea;
    }

    public void setMortgagearea(Double mortgagearea) {
        this.mortgagearea = mortgagearea;
    }

    public String getAntiguaranteetype() {
        return antiguaranteetype;
    }

    public void setAntiguaranteetype(String antiguaranteetype) {
        this.antiguaranteetype = antiguaranteetype == null ? null : antiguaranteetype.trim();
    }

    public BigDecimal getAssessvalue() {
        return assessvalue;
    }

    public void setAssessvalue(BigDecimal assessvalue) {
        this.assessvalue = assessvalue;
    }

    public String getAssetownership() {
        return assetownership;
    }

    public void setAssetownership(String assetownership) {
        this.assetownership = assetownership == null ? null : assetownership.trim();
    }

    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype == null ? null : assettype.trim();
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public BigDecimal getCreationtime() {
        return creationtime;
    }

    public void setCreationtime(BigDecimal creationtime) {
        this.creationtime = creationtime;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor == null ? null : guarantor.trim();
    }

    public String getGuarantoridcardno() {
        return guarantoridcardno;
    }

    public void setGuarantoridcardno(String guarantoridcardno) {
        this.guarantoridcardno = guarantoridcardno == null ? null : guarantoridcardno.trim();
    }

    public String getGuarantorworkunit() {
        return guarantorworkunit;
    }

    public void setGuarantorworkunit(String guarantorworkunit) {
        this.guarantorworkunit = guarantorworkunit == null ? null : guarantorworkunit.trim();
    }

    public BigDecimal getMonthlyincome() {
        return monthlyincome;
    }

    public void setMonthlyincome(BigDecimal monthlyincome) {
        this.monthlyincome = monthlyincome;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getWarrant() {
        return warrant;
    }

    public void setWarrant(String warrant) {
        this.warrant = warrant == null ? null : warrant.trim();
    }

    public String getPolicyapplyId() {
        return policyapplyId;
    }

    public void setPolicyapplyId(String policyapplyId) {
        this.policyapplyId = policyapplyId == null ? null : policyapplyId.trim();
    }

    public String getLandproperty() {
        return landproperty;
    }

    public void setLandproperty(String landproperty) {
        this.landproperty = landproperty == null ? null : landproperty.trim();
    }

    public String getMortgagenm() {
        return mortgagenm;
    }

    public void setMortgagenm(String mortgagenm) {
        this.mortgagenm = mortgagenm == null ? null : mortgagenm.trim();
    }

    public String getContactwayworkunit() {
        return contactwayworkunit;
    }

    public void setContactwayworkunit(String contactwayworkunit) {
        this.contactwayworkunit = contactwayworkunit == null ? null : contactwayworkunit.trim();
    }

    public String getIndustrytype() {
        return industrytype;
    }

    public void setIndustrytype(String industrytype) {
        this.industrytype = industrytype == null ? null : industrytype.trim();
    }

    public String getWorkunittype() {
        return workunittype;
    }

    public void setWorkunittype(String workunittype) {
        this.workunittype = workunittype == null ? null : workunittype.trim();
    }

    public BigDecimal getPurchaseamount() {
        return purchaseamount;
    }

    public void setPurchaseamount(BigDecimal purchaseamount) {
        this.purchaseamount = purchaseamount;
    }

    public BigDecimal getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(BigDecimal purchasedate) {
        this.purchasedate = purchasedate;
    }

    public String getBelongcountyId() {
        return belongcountyId;
    }

    public void setBelongcountyId(String belongcountyId) {
        this.belongcountyId = belongcountyId == null ? null : belongcountyId.trim();
    }

    public String getBelongstreetId() {
        return belongstreetId;
    }

    public void setBelongstreetId(String belongstreetId) {
        this.belongstreetId = belongstreetId == null ? null : belongstreetId.trim();
    }

    public String getGuarantoraddr() {
        return guarantoraddr;
    }

    public void setGuarantoraddr(String guarantoraddr) {
        this.guarantoraddr = guarantoraddr == null ? null : guarantoraddr.trim();
    }

    public String getGuarantortype() {
        return guarantortype;
    }

    public void setGuarantortype(String guarantortype) {
        this.guarantortype = guarantortype == null ? null : guarantortype.trim();
    }

    public String getCollateralarea() {
        return collateralarea;
    }

    public void setCollateralarea(String collateralarea) {
        this.collateralarea = collateralarea == null ? null : collateralarea.trim();
    }

    public String getCollateralpersonidno() {
        return collateralpersonidno;
    }

    public void setCollateralpersonidno(String collateralpersonidno) {
        this.collateralpersonidno = collateralpersonidno == null ? null : collateralpersonidno.trim();
    }

    public String getCollateralpersonphone() {
        return collateralpersonphone;
    }

    public void setCollateralpersonphone(String collateralpersonphone) {
        this.collateralpersonphone = collateralpersonphone == null ? null : collateralpersonphone.trim();
    }

    public String getGuarantorspouseidcard() {
        return guarantorspouseidcard;
    }

    public void setGuarantorspouseidcard(String guarantorspouseidcard) {
        this.guarantorspouseidcard = guarantorspouseidcard == null ? null : guarantorspouseidcard.trim();
    }

    public String getGuarantorspouse() {
        return guarantorspouse;
    }

    public void setGuarantorspouse(String guarantorspouse) {
        this.guarantorspouse = guarantorspouse == null ? null : guarantorspouse.trim();
    }

    public String getGuarantorspousephone() {
        return guarantorspousephone;
    }

    public void setGuarantorspousephone(String guarantorspousephone) {
        this.guarantorspousephone = guarantorspousephone == null ? null : guarantorspousephone.trim();
    }

    public BigDecimal getGuarantoryearincome() {
        return guarantoryearincome;
    }

    public void setGuarantoryearincome(BigDecimal guarantoryearincome) {
        this.guarantoryearincome = guarantoryearincome;
    }

    public String getBelongcountyid() {
        return belongcountyid;
    }

    public void setBelongcountyid(String belongcountyid) {
        this.belongcountyid = belongcountyid == null ? null : belongcountyid.trim();
    }

    public BigDecimal getSocialsecuritypay() {
        return socialsecuritypay;
    }

    public void setSocialsecuritypay(BigDecimal socialsecuritypay) {
        this.socialsecuritypay = socialsecuritypay;
    }

    public BigDecimal getValueofguaranty() {
        return valueofguaranty;
    }

    public void setValueofguaranty(BigDecimal valueofguaranty) {
        this.valueofguaranty = valueofguaranty;
    }

    public BigDecimal getValueofmortgages() {
        return valueofmortgages;
    }

    public void setValueofmortgages(BigDecimal valueofmortgages) {
        this.valueofmortgages = valueofmortgages;
    }

    public String getMortageowneridcard() {
        return mortageowneridcard;
    }

    public void setMortageowneridcard(String mortageowneridcard) {
        this.mortageowneridcard = mortageowneridcard == null ? null : mortageowneridcard.trim();
    }
}