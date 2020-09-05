package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//政担抽取送审主表
public class Extractapprovalapply {
    private String id;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private String apprstate;

    private String batchnumber;

    private BigDecimal opertime;

    private String processinstanceid;

    private Long total;

    private BigDecimal totalmoney;

    private String operatorId;

    private String organizationId;

    private String policyformalletterId;

    private String ischeck;

    private String issupervise;

    private String currentflowname;

    private String isfinished;

    private String clienttype;

    private String attentionstatus;

    private Short ispartnerprojects;

    private String processkind;

    private String remark;

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

    public String getApprstate() {
        return apprstate;
    }

    public void setApprstate(String apprstate) {
        this.apprstate = apprstate == null ? null : apprstate.trim();
    }

    public String getBatchnumber() {
        return batchnumber;
    }

    public void setBatchnumber(String batchnumber) {
        this.batchnumber = batchnumber == null ? null : batchnumber.trim();
    }

    public BigDecimal getOpertime() {
        return opertime;
    }

    public void setOpertime(BigDecimal opertime) {
        this.opertime = opertime;
    }

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid == null ? null : processinstanceid.trim();
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId == null ? null : operatorId.trim();
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getPolicyformalletterId() {
        return policyformalletterId;
    }

    public void setPolicyformalletterId(String policyformalletterId) {
        this.policyformalletterId = policyformalletterId == null ? null : policyformalletterId.trim();
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck == null ? null : ischeck.trim();
    }

    public String getIssupervise() {
        return issupervise;
    }

    public void setIssupervise(String issupervise) {
        this.issupervise = issupervise == null ? null : issupervise.trim();
    }

    public String getCurrentflowname() {
        return currentflowname;
    }

    public void setCurrentflowname(String currentflowname) {
        this.currentflowname = currentflowname == null ? null : currentflowname.trim();
    }

    public String getIsfinished() {
        return isfinished;
    }

    public void setIsfinished(String isfinished) {
        this.isfinished = isfinished == null ? null : isfinished.trim();
    }

    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype == null ? null : clienttype.trim();
    }

    public String getAttentionstatus() {
        return attentionstatus;
    }

    public void setAttentionstatus(String attentionstatus) {
        this.attentionstatus = attentionstatus == null ? null : attentionstatus.trim();
    }

    public Short getIspartnerprojects() {
        return ispartnerprojects;
    }

    public void setIspartnerprojects(Short ispartnerprojects) {
        this.ispartnerprojects = ispartnerprojects;
    }

    public String getProcesskind() {
        return processkind;
    }

    public void setProcesskind(String processkind) {
        this.processkind = processkind == null ? null : processkind.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}