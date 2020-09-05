package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//解保表
public class Releaseguarantee {
    private String id;

    private Long releasetype;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private BigDecimal opertime;

    private String apprstate;

    private String processinstanceid;

    private String signcontent;

    private String signopinion;

    private BigDecimal applybackguarmoney;

    private String backbank;

    private BigDecimal backguarmoneydate;

    private String backnum;

    private Short isenternextstage;

    private BigDecimal releasedate;

    private BigDecimal releasemoney;

    private String remark;

    private BigDecimal storeenddate;

    private BigDecimal storestartdate;

    private BigDecimal replaceamount;

    private BigDecimal replaceinterest;

    private Double replacerate;

    private BigDecimal backpledgemoney;

    private BigDecimal factavouchmoney;

    private BigDecimal flowguarmoney;

    private Short isbackmoney;

    private Short isbackwarrant;

    private BigDecimal outpledgemoney;

    private String paymentvoucher;

    private BigDecimal plancautionmoney;

    private BigDecimal releaseaftermoney;

    private String releasememo;

    private String releasereson;

    private BigDecimal relesecautionmoney;

    private BigDecimal unitepledgemoney;

    private String projectId;

    private String handlingmanId;

    private String repaymentplanId;

    private String employeeId;

    private BigDecimal endtime;

    private BigDecimal completedatefour;

    private BigDecimal completedateone;

    private BigDecimal completedatethree;

    private BigDecimal completedatetwo;

    private String handlingmanfour;

    private String handlingmanone;

    private String handlingmanthree;

    private String handlingmantwo;

    private BigDecimal replacebalance;

    private BigDecimal replacededuction;

    private BigDecimal replacemoney;

    private String times;

    private BigDecimal defaultinterest;

    private String financialoperId;

    private String replacenotificationId;

    private String traceschemereportId;

    private String account;

    private String accountname;

    private BigDecimal actualreplaceamount;

    private String bank;

    private String enddate;

    private String datasyncstauts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getReleasetype() {
        return releasetype;
    }

    public void setReleasetype(Long releasetype) {
        this.releasetype = releasetype;
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

    public BigDecimal getApplybackguarmoney() {
        return applybackguarmoney;
    }

    public void setApplybackguarmoney(BigDecimal applybackguarmoney) {
        this.applybackguarmoney = applybackguarmoney;
    }

    public String getBackbank() {
        return backbank;
    }

    public void setBackbank(String backbank) {
        this.backbank = backbank == null ? null : backbank.trim();
    }

    public BigDecimal getBackguarmoneydate() {
        return backguarmoneydate;
    }

    public void setBackguarmoneydate(BigDecimal backguarmoneydate) {
        this.backguarmoneydate = backguarmoneydate;
    }

    public String getBacknum() {
        return backnum;
    }

    public void setBacknum(String backnum) {
        this.backnum = backnum == null ? null : backnum.trim();
    }

    public Short getIsenternextstage() {
        return isenternextstage;
    }

    public void setIsenternextstage(Short isenternextstage) {
        this.isenternextstage = isenternextstage;
    }

    public BigDecimal getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(BigDecimal releasedate) {
        this.releasedate = releasedate;
    }

    public BigDecimal getReleasemoney() {
        return releasemoney;
    }

    public void setReleasemoney(BigDecimal releasemoney) {
        this.releasemoney = releasemoney;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public BigDecimal getStoreenddate() {
        return storeenddate;
    }

    public void setStoreenddate(BigDecimal storeenddate) {
        this.storeenddate = storeenddate;
    }

    public BigDecimal getStorestartdate() {
        return storestartdate;
    }

    public void setStorestartdate(BigDecimal storestartdate) {
        this.storestartdate = storestartdate;
    }

    public BigDecimal getReplaceamount() {
        return replaceamount;
    }

    public void setReplaceamount(BigDecimal replaceamount) {
        this.replaceamount = replaceamount;
    }

    public BigDecimal getReplaceinterest() {
        return replaceinterest;
    }

    public void setReplaceinterest(BigDecimal replaceinterest) {
        this.replaceinterest = replaceinterest;
    }

    public Double getReplacerate() {
        return replacerate;
    }

    public void setReplacerate(Double replacerate) {
        this.replacerate = replacerate;
    }

    public BigDecimal getBackpledgemoney() {
        return backpledgemoney;
    }

    public void setBackpledgemoney(BigDecimal backpledgemoney) {
        this.backpledgemoney = backpledgemoney;
    }

    public BigDecimal getFactavouchmoney() {
        return factavouchmoney;
    }

    public void setFactavouchmoney(BigDecimal factavouchmoney) {
        this.factavouchmoney = factavouchmoney;
    }

    public BigDecimal getFlowguarmoney() {
        return flowguarmoney;
    }

    public void setFlowguarmoney(BigDecimal flowguarmoney) {
        this.flowguarmoney = flowguarmoney;
    }

    public Short getIsbackmoney() {
        return isbackmoney;
    }

    public void setIsbackmoney(Short isbackmoney) {
        this.isbackmoney = isbackmoney;
    }

    public Short getIsbackwarrant() {
        return isbackwarrant;
    }

    public void setIsbackwarrant(Short isbackwarrant) {
        this.isbackwarrant = isbackwarrant;
    }

    public BigDecimal getOutpledgemoney() {
        return outpledgemoney;
    }

    public void setOutpledgemoney(BigDecimal outpledgemoney) {
        this.outpledgemoney = outpledgemoney;
    }

    public String getPaymentvoucher() {
        return paymentvoucher;
    }

    public void setPaymentvoucher(String paymentvoucher) {
        this.paymentvoucher = paymentvoucher == null ? null : paymentvoucher.trim();
    }

    public BigDecimal getPlancautionmoney() {
        return plancautionmoney;
    }

    public void setPlancautionmoney(BigDecimal plancautionmoney) {
        this.plancautionmoney = plancautionmoney;
    }

    public BigDecimal getReleaseaftermoney() {
        return releaseaftermoney;
    }

    public void setReleaseaftermoney(BigDecimal releaseaftermoney) {
        this.releaseaftermoney = releaseaftermoney;
    }

    public String getReleasememo() {
        return releasememo;
    }

    public void setReleasememo(String releasememo) {
        this.releasememo = releasememo == null ? null : releasememo.trim();
    }

    public String getReleasereson() {
        return releasereson;
    }

    public void setReleasereson(String releasereson) {
        this.releasereson = releasereson == null ? null : releasereson.trim();
    }

    public BigDecimal getRelesecautionmoney() {
        return relesecautionmoney;
    }

    public void setRelesecautionmoney(BigDecimal relesecautionmoney) {
        this.relesecautionmoney = relesecautionmoney;
    }

    public BigDecimal getUnitepledgemoney() {
        return unitepledgemoney;
    }

    public void setUnitepledgemoney(BigDecimal unitepledgemoney) {
        this.unitepledgemoney = unitepledgemoney;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getHandlingmanId() {
        return handlingmanId;
    }

    public void setHandlingmanId(String handlingmanId) {
        this.handlingmanId = handlingmanId == null ? null : handlingmanId.trim();
    }

    public String getRepaymentplanId() {
        return repaymentplanId;
    }

    public void setRepaymentplanId(String repaymentplanId) {
        this.repaymentplanId = repaymentplanId == null ? null : repaymentplanId.trim();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public BigDecimal getEndtime() {
        return endtime;
    }

    public void setEndtime(BigDecimal endtime) {
        this.endtime = endtime;
    }

    public BigDecimal getCompletedatefour() {
        return completedatefour;
    }

    public void setCompletedatefour(BigDecimal completedatefour) {
        this.completedatefour = completedatefour;
    }

    public BigDecimal getCompletedateone() {
        return completedateone;
    }

    public void setCompletedateone(BigDecimal completedateone) {
        this.completedateone = completedateone;
    }

    public BigDecimal getCompletedatethree() {
        return completedatethree;
    }

    public void setCompletedatethree(BigDecimal completedatethree) {
        this.completedatethree = completedatethree;
    }

    public BigDecimal getCompletedatetwo() {
        return completedatetwo;
    }

    public void setCompletedatetwo(BigDecimal completedatetwo) {
        this.completedatetwo = completedatetwo;
    }

    public String getHandlingmanfour() {
        return handlingmanfour;
    }

    public void setHandlingmanfour(String handlingmanfour) {
        this.handlingmanfour = handlingmanfour == null ? null : handlingmanfour.trim();
    }

    public String getHandlingmanone() {
        return handlingmanone;
    }

    public void setHandlingmanone(String handlingmanone) {
        this.handlingmanone = handlingmanone == null ? null : handlingmanone.trim();
    }

    public String getHandlingmanthree() {
        return handlingmanthree;
    }

    public void setHandlingmanthree(String handlingmanthree) {
        this.handlingmanthree = handlingmanthree == null ? null : handlingmanthree.trim();
    }

    public String getHandlingmantwo() {
        return handlingmantwo;
    }

    public void setHandlingmantwo(String handlingmantwo) {
        this.handlingmantwo = handlingmantwo == null ? null : handlingmantwo.trim();
    }

    public BigDecimal getReplacebalance() {
        return replacebalance;
    }

    public void setReplacebalance(BigDecimal replacebalance) {
        this.replacebalance = replacebalance;
    }

    public BigDecimal getReplacededuction() {
        return replacededuction;
    }

    public void setReplacededuction(BigDecimal replacededuction) {
        this.replacededuction = replacededuction;
    }

    public BigDecimal getReplacemoney() {
        return replacemoney;
    }

    public void setReplacemoney(BigDecimal replacemoney) {
        this.replacemoney = replacemoney;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times == null ? null : times.trim();
    }

    public BigDecimal getDefaultinterest() {
        return defaultinterest;
    }

    public void setDefaultinterest(BigDecimal defaultinterest) {
        this.defaultinterest = defaultinterest;
    }

    public String getFinancialoperId() {
        return financialoperId;
    }

    public void setFinancialoperId(String financialoperId) {
        this.financialoperId = financialoperId == null ? null : financialoperId.trim();
    }

    public String getReplacenotificationId() {
        return replacenotificationId;
    }

    public void setReplacenotificationId(String replacenotificationId) {
        this.replacenotificationId = replacenotificationId == null ? null : replacenotificationId.trim();
    }

    public String getTraceschemereportId() {
        return traceschemereportId;
    }

    public void setTraceschemereportId(String traceschemereportId) {
        this.traceschemereportId = traceschemereportId == null ? null : traceschemereportId.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public BigDecimal getActualreplaceamount() {
        return actualreplaceamount;
    }

    public void setActualreplaceamount(BigDecimal actualreplaceamount) {
        this.actualreplaceamount = actualreplaceamount;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getDatasyncstauts() {
        return datasyncstauts;
    }

    public void setDatasyncstauts(String datasyncstauts) {
        this.datasyncstauts = datasyncstauts == null ? null : datasyncstauts.trim();
    }
}