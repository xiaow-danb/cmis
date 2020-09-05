package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//政担抽取送审明细表
public class Extractapprovalapplydetail {
    private String id;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private BigDecimal endtime;

    private BigDecimal opertime;

    private String apprstate;

    private String processinstanceid;

    private String signcontent;

    private String signopinion;

    private String cause;

    private String nodename;

    private BigDecimal returntime;

    private String projectId;

    private String extractapprovalapplyId;

    private String policyguaranteeapplyId;

    private String checkpass;

    private String ischeck;

    private String attentionstatus;

    private String banktaxattentionstatus;

    private String sumattentionstatus;

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

    public BigDecimal getEndtime() {
        return endtime;
    }

    public void setEndtime(BigDecimal endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getOpertime() {
        return opertime;
    }

    public void setOpertime(BigDecimal opertime) {
        this.opertime = opertime;
    }

    public String getApprstate() {
        return apprstate;
    }

    public void setApprstate(String apprstate) {
        this.apprstate = apprstate == null ? null : apprstate.trim();
    }

    public String getProcessinstanceid() {
        return processinstanceid;
    }

    public void setProcessinstanceid(String processinstanceid) {
        this.processinstanceid = processinstanceid == null ? null : processinstanceid.trim();
    }

    public String getSigncontent() {
        return signcontent;
    }

    public void setSigncontent(String signcontent) {
        this.signcontent = signcontent == null ? null : signcontent.trim();
    }

    public String getSignopinion() {
        return signopinion;
    }

    public void setSignopinion(String signopinion) {
        this.signopinion = signopinion == null ? null : signopinion.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getNodename() {
        return nodename;
    }

    public void setNodename(String nodename) {
        this.nodename = nodename == null ? null : nodename.trim();
    }

    public BigDecimal getReturntime() {
        return returntime;
    }

    public void setReturntime(BigDecimal returntime) {
        this.returntime = returntime;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getExtractapprovalapplyId() {
        return extractapprovalapplyId;
    }

    public void setExtractapprovalapplyId(String extractapprovalapplyId) {
        this.extractapprovalapplyId = extractapprovalapplyId == null ? null : extractapprovalapplyId.trim();
    }

    public String getPolicyguaranteeapplyId() {
        return policyguaranteeapplyId;
    }

    public void setPolicyguaranteeapplyId(String policyguaranteeapplyId) {
        this.policyguaranteeapplyId = policyguaranteeapplyId == null ? null : policyguaranteeapplyId.trim();
    }

    public String getCheckpass() {
        return checkpass;
    }

    public void setCheckpass(String checkpass) {
        this.checkpass = checkpass == null ? null : checkpass.trim();
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck == null ? null : ischeck.trim();
    }

    public String getAttentionstatus() {
        return attentionstatus;
    }

    public void setAttentionstatus(String attentionstatus) {
        this.attentionstatus = attentionstatus == null ? null : attentionstatus.trim();
    }

    public String getBanktaxattentionstatus() {
        return banktaxattentionstatus;
    }

    public void setBanktaxattentionstatus(String banktaxattentionstatus) {
        this.banktaxattentionstatus = banktaxattentionstatus == null ? null : banktaxattentionstatus.trim();
    }

    public String getSumattentionstatus() {
        return sumattentionstatus;
    }

    public void setSumattentionstatus(String sumattentionstatus) {
        this.sumattentionstatus = sumattentionstatus == null ? null : sumattentionstatus.trim();
    }
}