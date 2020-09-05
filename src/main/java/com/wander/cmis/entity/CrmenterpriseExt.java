package com.wander.cmis.entity;

import java.util.Date;

//企业信息拓展表
public class CrmenterpriseExt {
    private String id;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private String affiliation;

    private String clientid;

    private Short isforeigntrade;

    private Short isreportfinancial;

    private String legalform;

    private Short sIspubliccomp;

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

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation == null ? null : affiliation.trim();
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public Short getIsforeigntrade() {
        return isforeigntrade;
    }

    public void setIsforeigntrade(Short isforeigntrade) {
        this.isforeigntrade = isforeigntrade;
    }

    public Short getIsreportfinancial() {
        return isreportfinancial;
    }

    public void setIsreportfinancial(Short isreportfinancial) {
        this.isreportfinancial = isreportfinancial;
    }

    public String getLegalform() {
        return legalform;
    }

    public void setLegalform(String legalform) {
        this.legalform = legalform == null ? null : legalform.trim();
    }

    public Short getsIspubliccomp() {
        return sIspubliccomp;
    }

    public void setsIspubliccomp(Short sIspubliccomp) {
        this.sIspubliccomp = sIspubliccomp;
    }
}