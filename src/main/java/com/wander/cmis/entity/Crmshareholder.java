package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Crmshareholder {
    private String id;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private String clientid;

    private String credential;

    private String investway;

    private BigDecimal investment;

    private String investor;

    private BigDecimal proportion;

    private String remark;

    private BigDecimal temorningamount;

    private String attchmentId;

    private String shareholdersrelationship;

    private String contractway;

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

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }

    public String getInvestway() {
        return investway;
    }

    public void setInvestway(String investway) {
        this.investway = investway == null ? null : investway.trim();
    }

    public BigDecimal getInvestment() {
        return investment;
    }

    public void setInvestment(BigDecimal investment) {
        this.investment = investment;
    }

    public String getInvestor() {
        return investor;
    }

    public void setInvestor(String investor) {
        this.investor = investor == null ? null : investor.trim();
    }

    public BigDecimal getProportion() {
        return proportion;
    }

    public void setProportion(BigDecimal proportion) {
        this.proportion = proportion;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getTemorningamount() {
        return temorningamount;
    }

    public void setTemorningamount(BigDecimal temorningamount) {
        this.temorningamount = temorningamount;
    }

    public String getAttchmentId() {
        return attchmentId;
    }

    public void setAttchmentId(String attchmentId) {
        this.attchmentId = attchmentId == null ? null : attchmentId.trim();
    }

    public String getShareholdersrelationship() {
        return shareholdersrelationship;
    }

    public void setShareholdersrelationship(String shareholdersrelationship) {
        this.shareholdersrelationship = shareholdersrelationship == null ? null : shareholdersrelationship.trim();
    }

    public String getContractway() {
        return contractway;
    }

    public void setContractway(String contractway) {
        this.contractway = contractway == null ? null : contractway.trim();
    }
}