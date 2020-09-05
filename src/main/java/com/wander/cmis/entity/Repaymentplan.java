package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//还款计划表
public class Repaymentplan {
    private String id;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private BigDecimal compamount;

    private BigDecimal compdate;

    private BigDecimal compinterest;

    private BigDecimal overdueamount;

    private Long overduets;

    private BigDecimal recoveryamount;

    private BigDecimal recoverydate;

    private BigDecimal releaseguaramount;

    private BigDecimal releaseguardate;

    private BigDecimal repaymentdate;

    private BigDecimal repaymentmoney;

    private BigDecimal shouldrepaymentcapital;

    private BigDecimal shouldrepaymentinterest;

    private Long tenior;

    private String projectloanId;

    private String projecttotalliabilityId;

    private Short issettle;

    private Short isautosettle;

    private String issynch;

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

    public BigDecimal getCompamount() {
        return compamount;
    }

    public void setCompamount(BigDecimal compamount) {
        this.compamount = compamount;
    }

    public BigDecimal getCompdate() {
        return compdate;
    }

    public void setCompdate(BigDecimal compdate) {
        this.compdate = compdate;
    }

    public BigDecimal getCompinterest() {
        return compinterest;
    }

    public void setCompinterest(BigDecimal compinterest) {
        this.compinterest = compinterest;
    }

    public BigDecimal getOverdueamount() {
        return overdueamount;
    }

    public void setOverdueamount(BigDecimal overdueamount) {
        this.overdueamount = overdueamount;
    }

    public Long getOverduets() {
        return overduets;
    }

    public void setOverduets(Long overduets) {
        this.overduets = overduets;
    }

    public BigDecimal getRecoveryamount() {
        return recoveryamount;
    }

    public void setRecoveryamount(BigDecimal recoveryamount) {
        this.recoveryamount = recoveryamount;
    }

    public BigDecimal getRecoverydate() {
        return recoverydate;
    }

    public void setRecoverydate(BigDecimal recoverydate) {
        this.recoverydate = recoverydate;
    }

    public BigDecimal getReleaseguaramount() {
        return releaseguaramount;
    }

    public void setReleaseguaramount(BigDecimal releaseguaramount) {
        this.releaseguaramount = releaseguaramount;
    }

    public BigDecimal getReleaseguardate() {
        return releaseguardate;
    }

    public void setReleaseguardate(BigDecimal releaseguardate) {
        this.releaseguardate = releaseguardate;
    }

    public BigDecimal getRepaymentdate() {
        return repaymentdate;
    }

    public void setRepaymentdate(BigDecimal repaymentdate) {
        this.repaymentdate = repaymentdate;
    }

    public BigDecimal getRepaymentmoney() {
        return repaymentmoney;
    }

    public void setRepaymentmoney(BigDecimal repaymentmoney) {
        this.repaymentmoney = repaymentmoney;
    }

    public BigDecimal getShouldrepaymentcapital() {
        return shouldrepaymentcapital;
    }

    public void setShouldrepaymentcapital(BigDecimal shouldrepaymentcapital) {
        this.shouldrepaymentcapital = shouldrepaymentcapital;
    }

    public BigDecimal getShouldrepaymentinterest() {
        return shouldrepaymentinterest;
    }

    public void setShouldrepaymentinterest(BigDecimal shouldrepaymentinterest) {
        this.shouldrepaymentinterest = shouldrepaymentinterest;
    }

    public Long getTenior() {
        return tenior;
    }

    public void setTenior(Long tenior) {
        this.tenior = tenior;
    }

    public String getProjectloanId() {
        return projectloanId;
    }

    public void setProjectloanId(String projectloanId) {
        this.projectloanId = projectloanId == null ? null : projectloanId.trim();
    }

    public String getProjecttotalliabilityId() {
        return projecttotalliabilityId;
    }

    public void setProjecttotalliabilityId(String projecttotalliabilityId) {
        this.projecttotalliabilityId = projecttotalliabilityId == null ? null : projecttotalliabilityId.trim();
    }

    public Short getIssettle() {
        return issettle;
    }

    public void setIssettle(Short issettle) {
        this.issettle = issettle;
    }

    public Short getIsautosettle() {
        return isautosettle;
    }

    public void setIsautosettle(Short isautosettle) {
        this.isautosettle = isautosettle;
    }

    public String getIssynch() {
        return issynch;
    }

    public void setIssynch(String issynch) {
        this.issynch = issynch == null ? null : issynch.trim();
    }
}