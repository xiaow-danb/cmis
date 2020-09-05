package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//政担申请表
public class Policyguaranteeapply {
    private String id;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private String applyno;

    private String cause;

    private String clientid;

    private String clientname;

    private String clienttype;

    private String countyauditopinion;

    private String countyauditresult;

    private BigDecimal countyaudittime;

    private Long lengthofmaturity;

    private String lengthofmaturityunit;

    private BigDecimal loanamount;

    private String loantype;

    private BigDecimal operationtime;

    private String returnnode;

    private String returnperson;

    private BigDecimal returntime;

    private BigDecimal securitycost;

    private String status;

    private String streetopinion;

    private String countyId;

    private String countyauditorId;

    private String loanorgId;

    private String operatorId;

    private String organizationId;

    private String pmId;

    private String streetId;

    private BigDecimal createbusiamount;

    private BigDecimal groupamount;

    private String guarmethod;

    private BigDecimal importdate;

    private String inputproject;

    private BigDecimal mircoenterpamount;

    private String importempId;

    private String allottype;

    private String applyaddress;

    private BigDecimal appointtime;

    private String companycheckmessage;

    private String countycheckmessage;

    private String currentstage;

    private BigDecimal freesecuritycost;

    private BigDecimal otheramount;

    private String relationapplyid;

    private String streetcheckmessage;

    private String applyattachmentId;

    private String appointpersonId;

    private String checkcountyId;

    private String checkstreetId;

    private BigDecimal reviewamount;

    private String attentionstatus;

    private BigDecimal reviewcreatebusiamount;

    private BigDecimal reviewfreesecuritycost;

    private BigDecimal reviewgroupamount;

    private BigDecimal reviewmircoenterpamount;

    private BigDecimal reviewsecuritycost;

    private String banktaxattentionstatus;

    private String ischeck;

    private String policyattentionstatus;

    private String sumattentionstatus;

    private String recommendcode;

    private String exchangedataId;

    private String policyformalletterId;

    private String loanprocessname;

    private String clientdocId;

    private Long applycount;

    private String signmessage;

    private String signstatus;

    private String signedletterId;

    private String jyjcheckremark;

    private String corporatetype;

    private String isallowapproval;

    private Long modifyfrequency;

    private BigDecimal viewtime;

    private String tendemo;

    private String exchangecreatetime;

    private String flaggs;

    private String flagjudicial;

    private Long gsstage;

    private Long judicialstage;

    private String gsattentionstatus;

    private String sfattentionstatus;

    private String sfverifyreturnreason;

    private String badcreditgrade;

    private Date formalletterdate;

    private Short isautoformalletter;

    private String confirmletterpersonId;

    private String partnerno;

    private String businesskind;

    private Long bigdatastage;

    private String flagbigdata;

    private String bigdataattentionstatus;

    private String bigdataverifyreturnreason;

    private Long credityear;

    private String credityearunit;

    private String flagsocialinsurance;

    private String socialinsuranceexcelId;

    private String issynch;

    private String siattentionstatus;

    private String siverifyreturnreason;

    private String flaghd;

    private String hdattentionstatus;

    private String hdverifyreturnreason;

    private Short istestdata;

    private Long isreadappdata;

    private String sourcetype;

    private String reqserialuid;

    private Long sendbankflag;

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

    public String getApplyno() {
        return applyno;
    }

    public void setApplyno(String applyno) {
        this.applyno = applyno == null ? null : applyno.trim();
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause == null ? null : cause.trim();
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getClienttype() {
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype == null ? null : clienttype.trim();
    }

    public String getCountyauditopinion() {
        return countyauditopinion;
    }

    public void setCountyauditopinion(String countyauditopinion) {
        this.countyauditopinion = countyauditopinion == null ? null : countyauditopinion.trim();
    }

    public String getCountyauditresult() {
        return countyauditresult;
    }

    public void setCountyauditresult(String countyauditresult) {
        this.countyauditresult = countyauditresult == null ? null : countyauditresult.trim();
    }

    public BigDecimal getCountyaudittime() {
        return countyaudittime;
    }

    public void setCountyaudittime(BigDecimal countyaudittime) {
        this.countyaudittime = countyaudittime;
    }

    public Long getLengthofmaturity() {
        return lengthofmaturity;
    }

    public void setLengthofmaturity(Long lengthofmaturity) {
        this.lengthofmaturity = lengthofmaturity;
    }

    public String getLengthofmaturityunit() {
        return lengthofmaturityunit;
    }

    public void setLengthofmaturityunit(String lengthofmaturityunit) {
        this.lengthofmaturityunit = lengthofmaturityunit == null ? null : lengthofmaturityunit.trim();
    }

    public BigDecimal getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(BigDecimal loanamount) {
        this.loanamount = loanamount;
    }

    public String getLoantype() {
        return loantype;
    }

    public void setLoantype(String loantype) {
        this.loantype = loantype == null ? null : loantype.trim();
    }

    public BigDecimal getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(BigDecimal operationtime) {
        this.operationtime = operationtime;
    }

    public String getReturnnode() {
        return returnnode;
    }

    public void setReturnnode(String returnnode) {
        this.returnnode = returnnode == null ? null : returnnode.trim();
    }

    public String getReturnperson() {
        return returnperson;
    }

    public void setReturnperson(String returnperson) {
        this.returnperson = returnperson == null ? null : returnperson.trim();
    }

    public BigDecimal getReturntime() {
        return returntime;
    }

    public void setReturntime(BigDecimal returntime) {
        this.returntime = returntime;
    }

    public BigDecimal getSecuritycost() {
        return securitycost;
    }

    public void setSecuritycost(BigDecimal securitycost) {
        this.securitycost = securitycost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getStreetopinion() {
        return streetopinion;
    }

    public void setStreetopinion(String streetopinion) {
        this.streetopinion = streetopinion == null ? null : streetopinion.trim();
    }

    public String getCountyId() {
        return countyId;
    }

    public void setCountyId(String countyId) {
        this.countyId = countyId == null ? null : countyId.trim();
    }

    public String getCountyauditorId() {
        return countyauditorId;
    }

    public void setCountyauditorId(String countyauditorId) {
        this.countyauditorId = countyauditorId == null ? null : countyauditorId.trim();
    }

    public String getLoanorgId() {
        return loanorgId;
    }

    public void setLoanorgId(String loanorgId) {
        this.loanorgId = loanorgId == null ? null : loanorgId.trim();
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

    public String getPmId() {
        return pmId;
    }

    public void setPmId(String pmId) {
        this.pmId = pmId == null ? null : pmId.trim();
    }

    public String getStreetId() {
        return streetId;
    }

    public void setStreetId(String streetId) {
        this.streetId = streetId == null ? null : streetId.trim();
    }

    public BigDecimal getCreatebusiamount() {
        return createbusiamount;
    }

    public void setCreatebusiamount(BigDecimal createbusiamount) {
        this.createbusiamount = createbusiamount;
    }

    public BigDecimal getGroupamount() {
        return groupamount;
    }

    public void setGroupamount(BigDecimal groupamount) {
        this.groupamount = groupamount;
    }

    public String getGuarmethod() {
        return guarmethod;
    }

    public void setGuarmethod(String guarmethod) {
        this.guarmethod = guarmethod == null ? null : guarmethod.trim();
    }

    public BigDecimal getImportdate() {
        return importdate;
    }

    public void setImportdate(BigDecimal importdate) {
        this.importdate = importdate;
    }

    public String getInputproject() {
        return inputproject;
    }

    public void setInputproject(String inputproject) {
        this.inputproject = inputproject == null ? null : inputproject.trim();
    }

    public BigDecimal getMircoenterpamount() {
        return mircoenterpamount;
    }

    public void setMircoenterpamount(BigDecimal mircoenterpamount) {
        this.mircoenterpamount = mircoenterpamount;
    }

    public String getImportempId() {
        return importempId;
    }

    public void setImportempId(String importempId) {
        this.importempId = importempId == null ? null : importempId.trim();
    }

    public String getAllottype() {
        return allottype;
    }

    public void setAllottype(String allottype) {
        this.allottype = allottype == null ? null : allottype.trim();
    }

    public String getApplyaddress() {
        return applyaddress;
    }

    public void setApplyaddress(String applyaddress) {
        this.applyaddress = applyaddress == null ? null : applyaddress.trim();
    }

    public BigDecimal getAppointtime() {
        return appointtime;
    }

    public void setAppointtime(BigDecimal appointtime) {
        this.appointtime = appointtime;
    }

    public String getCompanycheckmessage() {
        return companycheckmessage;
    }

    public void setCompanycheckmessage(String companycheckmessage) {
        this.companycheckmessage = companycheckmessage == null ? null : companycheckmessage.trim();
    }

    public String getCountycheckmessage() {
        return countycheckmessage;
    }

    public void setCountycheckmessage(String countycheckmessage) {
        this.countycheckmessage = countycheckmessage == null ? null : countycheckmessage.trim();
    }

    public String getCurrentstage() {
        return currentstage;
    }

    public void setCurrentstage(String currentstage) {
        this.currentstage = currentstage == null ? null : currentstage.trim();
    }

    public BigDecimal getFreesecuritycost() {
        return freesecuritycost;
    }

    public void setFreesecuritycost(BigDecimal freesecuritycost) {
        this.freesecuritycost = freesecuritycost;
    }

    public BigDecimal getOtheramount() {
        return otheramount;
    }

    public void setOtheramount(BigDecimal otheramount) {
        this.otheramount = otheramount;
    }

    public String getRelationapplyid() {
        return relationapplyid;
    }

    public void setRelationapplyid(String relationapplyid) {
        this.relationapplyid = relationapplyid == null ? null : relationapplyid.trim();
    }

    public String getStreetcheckmessage() {
        return streetcheckmessage;
    }

    public void setStreetcheckmessage(String streetcheckmessage) {
        this.streetcheckmessage = streetcheckmessage == null ? null : streetcheckmessage.trim();
    }

    public String getApplyattachmentId() {
        return applyattachmentId;
    }

    public void setApplyattachmentId(String applyattachmentId) {
        this.applyattachmentId = applyattachmentId == null ? null : applyattachmentId.trim();
    }

    public String getAppointpersonId() {
        return appointpersonId;
    }

    public void setAppointpersonId(String appointpersonId) {
        this.appointpersonId = appointpersonId == null ? null : appointpersonId.trim();
    }

    public String getCheckcountyId() {
        return checkcountyId;
    }

    public void setCheckcountyId(String checkcountyId) {
        this.checkcountyId = checkcountyId == null ? null : checkcountyId.trim();
    }

    public String getCheckstreetId() {
        return checkstreetId;
    }

    public void setCheckstreetId(String checkstreetId) {
        this.checkstreetId = checkstreetId == null ? null : checkstreetId.trim();
    }

    public BigDecimal getReviewamount() {
        return reviewamount;
    }

    public void setReviewamount(BigDecimal reviewamount) {
        this.reviewamount = reviewamount;
    }

    public String getAttentionstatus() {
        return attentionstatus;
    }

    public void setAttentionstatus(String attentionstatus) {
        this.attentionstatus = attentionstatus == null ? null : attentionstatus.trim();
    }

    public BigDecimal getReviewcreatebusiamount() {
        return reviewcreatebusiamount;
    }

    public void setReviewcreatebusiamount(BigDecimal reviewcreatebusiamount) {
        this.reviewcreatebusiamount = reviewcreatebusiamount;
    }

    public BigDecimal getReviewfreesecuritycost() {
        return reviewfreesecuritycost;
    }

    public void setReviewfreesecuritycost(BigDecimal reviewfreesecuritycost) {
        this.reviewfreesecuritycost = reviewfreesecuritycost;
    }

    public BigDecimal getReviewgroupamount() {
        return reviewgroupamount;
    }

    public void setReviewgroupamount(BigDecimal reviewgroupamount) {
        this.reviewgroupamount = reviewgroupamount;
    }

    public BigDecimal getReviewmircoenterpamount() {
        return reviewmircoenterpamount;
    }

    public void setReviewmircoenterpamount(BigDecimal reviewmircoenterpamount) {
        this.reviewmircoenterpamount = reviewmircoenterpamount;
    }

    public BigDecimal getReviewsecuritycost() {
        return reviewsecuritycost;
    }

    public void setReviewsecuritycost(BigDecimal reviewsecuritycost) {
        this.reviewsecuritycost = reviewsecuritycost;
    }

    public String getBanktaxattentionstatus() {
        return banktaxattentionstatus;
    }

    public void setBanktaxattentionstatus(String banktaxattentionstatus) {
        this.banktaxattentionstatus = banktaxattentionstatus == null ? null : banktaxattentionstatus.trim();
    }

    public String getIscheck() {
        return ischeck;
    }

    public void setIscheck(String ischeck) {
        this.ischeck = ischeck == null ? null : ischeck.trim();
    }

    public String getPolicyattentionstatus() {
        return policyattentionstatus;
    }

    public void setPolicyattentionstatus(String policyattentionstatus) {
        this.policyattentionstatus = policyattentionstatus == null ? null : policyattentionstatus.trim();
    }

    public String getSumattentionstatus() {
        return sumattentionstatus;
    }

    public void setSumattentionstatus(String sumattentionstatus) {
        this.sumattentionstatus = sumattentionstatus == null ? null : sumattentionstatus.trim();
    }

    public String getRecommendcode() {
        return recommendcode;
    }

    public void setRecommendcode(String recommendcode) {
        this.recommendcode = recommendcode == null ? null : recommendcode.trim();
    }

    public String getExchangedataId() {
        return exchangedataId;
    }

    public void setExchangedataId(String exchangedataId) {
        this.exchangedataId = exchangedataId == null ? null : exchangedataId.trim();
    }

    public String getPolicyformalletterId() {
        return policyformalletterId;
    }

    public void setPolicyformalletterId(String policyformalletterId) {
        this.policyformalletterId = policyformalletterId == null ? null : policyformalletterId.trim();
    }

    public String getLoanprocessname() {
        return loanprocessname;
    }

    public void setLoanprocessname(String loanprocessname) {
        this.loanprocessname = loanprocessname == null ? null : loanprocessname.trim();
    }

    public String getClientdocId() {
        return clientdocId;
    }

    public void setClientdocId(String clientdocId) {
        this.clientdocId = clientdocId == null ? null : clientdocId.trim();
    }

    public Long getApplycount() {
        return applycount;
    }

    public void setApplycount(Long applycount) {
        this.applycount = applycount;
    }

    public String getSignmessage() {
        return signmessage;
    }

    public void setSignmessage(String signmessage) {
        this.signmessage = signmessage == null ? null : signmessage.trim();
    }

    public String getSignstatus() {
        return signstatus;
    }

    public void setSignstatus(String signstatus) {
        this.signstatus = signstatus == null ? null : signstatus.trim();
    }

    public String getSignedletterId() {
        return signedletterId;
    }

    public void setSignedletterId(String signedletterId) {
        this.signedletterId = signedletterId == null ? null : signedletterId.trim();
    }

    public String getJyjcheckremark() {
        return jyjcheckremark;
    }

    public void setJyjcheckremark(String jyjcheckremark) {
        this.jyjcheckremark = jyjcheckremark == null ? null : jyjcheckremark.trim();
    }

    public String getCorporatetype() {
        return corporatetype;
    }

    public void setCorporatetype(String corporatetype) {
        this.corporatetype = corporatetype == null ? null : corporatetype.trim();
    }

    public String getIsallowapproval() {
        return isallowapproval;
    }

    public void setIsallowapproval(String isallowapproval) {
        this.isallowapproval = isallowapproval == null ? null : isallowapproval.trim();
    }

    public Long getModifyfrequency() {
        return modifyfrequency;
    }

    public void setModifyfrequency(Long modifyfrequency) {
        this.modifyfrequency = modifyfrequency;
    }

    public BigDecimal getViewtime() {
        return viewtime;
    }

    public void setViewtime(BigDecimal viewtime) {
        this.viewtime = viewtime;
    }

    public String getTendemo() {
        return tendemo;
    }

    public void setTendemo(String tendemo) {
        this.tendemo = tendemo == null ? null : tendemo.trim();
    }

    public String getExchangecreatetime() {
        return exchangecreatetime;
    }

    public void setExchangecreatetime(String exchangecreatetime) {
        this.exchangecreatetime = exchangecreatetime == null ? null : exchangecreatetime.trim();
    }

    public String getFlaggs() {
        return flaggs;
    }

    public void setFlaggs(String flaggs) {
        this.flaggs = flaggs == null ? null : flaggs.trim();
    }

    public String getFlagjudicial() {
        return flagjudicial;
    }

    public void setFlagjudicial(String flagjudicial) {
        this.flagjudicial = flagjudicial == null ? null : flagjudicial.trim();
    }

    public Long getGsstage() {
        return gsstage;
    }

    public void setGsstage(Long gsstage) {
        this.gsstage = gsstage;
    }

    public Long getJudicialstage() {
        return judicialstage;
    }

    public void setJudicialstage(Long judicialstage) {
        this.judicialstage = judicialstage;
    }

    public String getGsattentionstatus() {
        return gsattentionstatus;
    }

    public void setGsattentionstatus(String gsattentionstatus) {
        this.gsattentionstatus = gsattentionstatus == null ? null : gsattentionstatus.trim();
    }

    public String getSfattentionstatus() {
        return sfattentionstatus;
    }

    public void setSfattentionstatus(String sfattentionstatus) {
        this.sfattentionstatus = sfattentionstatus == null ? null : sfattentionstatus.trim();
    }

    public String getSfverifyreturnreason() {
        return sfverifyreturnreason;
    }

    public void setSfverifyreturnreason(String sfverifyreturnreason) {
        this.sfverifyreturnreason = sfverifyreturnreason == null ? null : sfverifyreturnreason.trim();
    }

    public String getBadcreditgrade() {
        return badcreditgrade;
    }

    public void setBadcreditgrade(String badcreditgrade) {
        this.badcreditgrade = badcreditgrade == null ? null : badcreditgrade.trim();
    }

    public Date getFormalletterdate() {
        return formalletterdate;
    }

    public void setFormalletterdate(Date formalletterdate) {
        this.formalletterdate = formalletterdate;
    }

    public Short getIsautoformalletter() {
        return isautoformalletter;
    }

    public void setIsautoformalletter(Short isautoformalletter) {
        this.isautoformalletter = isautoformalletter;
    }

    public String getConfirmletterpersonId() {
        return confirmletterpersonId;
    }

    public void setConfirmletterpersonId(String confirmletterpersonId) {
        this.confirmletterpersonId = confirmletterpersonId == null ? null : confirmletterpersonId.trim();
    }

    public String getPartnerno() {
        return partnerno;
    }

    public void setPartnerno(String partnerno) {
        this.partnerno = partnerno == null ? null : partnerno.trim();
    }

    public String getBusinesskind() {
        return businesskind;
    }

    public void setBusinesskind(String businesskind) {
        this.businesskind = businesskind == null ? null : businesskind.trim();
    }

    public Long getBigdatastage() {
        return bigdatastage;
    }

    public void setBigdatastage(Long bigdatastage) {
        this.bigdatastage = bigdatastage;
    }

    public String getFlagbigdata() {
        return flagbigdata;
    }

    public void setFlagbigdata(String flagbigdata) {
        this.flagbigdata = flagbigdata == null ? null : flagbigdata.trim();
    }

    public String getBigdataattentionstatus() {
        return bigdataattentionstatus;
    }

    public void setBigdataattentionstatus(String bigdataattentionstatus) {
        this.bigdataattentionstatus = bigdataattentionstatus == null ? null : bigdataattentionstatus.trim();
    }

    public String getBigdataverifyreturnreason() {
        return bigdataverifyreturnreason;
    }

    public void setBigdataverifyreturnreason(String bigdataverifyreturnreason) {
        this.bigdataverifyreturnreason = bigdataverifyreturnreason == null ? null : bigdataverifyreturnreason.trim();
    }

    public Long getCredityear() {
        return credityear;
    }

    public void setCredityear(Long credityear) {
        this.credityear = credityear;
    }

    public String getCredityearunit() {
        return credityearunit;
    }

    public void setCredityearunit(String credityearunit) {
        this.credityearunit = credityearunit == null ? null : credityearunit.trim();
    }

    public String getFlagsocialinsurance() {
        return flagsocialinsurance;
    }

    public void setFlagsocialinsurance(String flagsocialinsurance) {
        this.flagsocialinsurance = flagsocialinsurance == null ? null : flagsocialinsurance.trim();
    }

    public String getSocialinsuranceexcelId() {
        return socialinsuranceexcelId;
    }

    public void setSocialinsuranceexcelId(String socialinsuranceexcelId) {
        this.socialinsuranceexcelId = socialinsuranceexcelId == null ? null : socialinsuranceexcelId.trim();
    }

    public String getIssynch() {
        return issynch;
    }

    public void setIssynch(String issynch) {
        this.issynch = issynch == null ? null : issynch.trim();
    }

    public String getSiattentionstatus() {
        return siattentionstatus;
    }

    public void setSiattentionstatus(String siattentionstatus) {
        this.siattentionstatus = siattentionstatus == null ? null : siattentionstatus.trim();
    }

    public String getSiverifyreturnreason() {
        return siverifyreturnreason;
    }

    public void setSiverifyreturnreason(String siverifyreturnreason) {
        this.siverifyreturnreason = siverifyreturnreason == null ? null : siverifyreturnreason.trim();
    }

    public String getFlaghd() {
        return flaghd;
    }

    public void setFlaghd(String flaghd) {
        this.flaghd = flaghd == null ? null : flaghd.trim();
    }

    public String getHdattentionstatus() {
        return hdattentionstatus;
    }

    public void setHdattentionstatus(String hdattentionstatus) {
        this.hdattentionstatus = hdattentionstatus == null ? null : hdattentionstatus.trim();
    }

    public String getHdverifyreturnreason() {
        return hdverifyreturnreason;
    }

    public void setHdverifyreturnreason(String hdverifyreturnreason) {
        this.hdverifyreturnreason = hdverifyreturnreason == null ? null : hdverifyreturnreason.trim();
    }

    public Short getIstestdata() {
        return istestdata;
    }

    public void setIstestdata(Short istestdata) {
        this.istestdata = istestdata;
    }

    public Long getIsreadappdata() {
        return isreadappdata;
    }

    public void setIsreadappdata(Long isreadappdata) {
        this.isreadappdata = isreadappdata;
    }

    public String getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype == null ? null : sourcetype.trim();
    }

    public String getReqserialuid() {
        return reqserialuid;
    }

    public void setReqserialuid(String reqserialuid) {
        this.reqserialuid = reqserialuid == null ? null : reqserialuid.trim();
    }

    public Long getSendbankflag() {
        return sendbankflag;
    }

    public void setSendbankflag(Long sendbankflag) {
        this.sendbankflag = sendbankflag;
    }
}