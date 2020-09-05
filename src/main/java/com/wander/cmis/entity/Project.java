package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//项目表
public class Project {
    private String id;

    private String createby;

    private Date createtime;

    private Date deletetime;

    private Short isdeleted;

    private String updateby;

    private Date updatetime;

    private Long version;

    private String acceptempcd;

    private String acceptempnm;

    private BigDecimal applyamount;

    private BigDecimal applydate;

    private Long applydeadline;

    private String applydeadlineunit;

    private Double applyrate;

    private Double assetliabilityratio;

    private BigDecimal assets;

    private BigDecimal bankmanagementfee;

    private Double bankmanagementfeerate;

    private String borrowerstructure;

    private BigDecimal capitalraised;

    private BigDecimal cashpayments;

    private String channel;

    private String checkfrequency;

    private String clientaddr;

    private String clientid;

    private String clientname;

    private BigDecimal compfreeamount;

    private String contact;

    private String contactperson;

    private BigDecimal contractamount;

    private Long contractdeadline;

    private String contractdeadlineunit;

    private BigDecimal contractedate;

    private Double contractrate;

    private BigDecimal contractsdate;

    private String creditlevel;

    private BigDecimal currentamount;

    private Long currentdeadline;

    private String currentdeadlineunit;

    private Double currentrate;

    private BigDecimal destamount;

    private String economiccircle;

    private BigDecimal examinedate;

    private BigDecimal expenseamount;

    private Double expenseradio;

    private String financingtype;

    private String fivelevelclassify;

    private Double fluidratio;

    private String guarfeecalcmodel;

    private BigDecimal guaranteemoney;

    private Short hasbadcreditrd;

    private BigDecimal incomeamount;

    private Double incomeradio;

    private String industry;

    private BigDecimal insurancebalance;

    private String investdirection;

    private Short iseconomicparkproject;

    private Short isfinaplatformproject;

    private Short ishisproject;

    private Short jointguarantee;

    private String legalperson;

    private BigDecimal liabilities;

    private BigDecimal loantotalamount;

    private String moneypurposes;

    private BigDecimal normalfreeamount;

    private Double overdueinterestrate;

    private Double overdueprincipalrate;

    private String payinterestmodel;

    private BigDecimal prelauditdate;

    private BigDecimal prelautitamount;

    private Long prelautitdeadline;

    private String prelautitdeadlineunit;

    private Double prelautitrate;

    private Double profitratio;

    private String projtype;

    private String projectarea;

    private String projectcode;

    private String projectname;

    private Long projectstage;

    private Double quickratio;

    private String receptionperson;

    private BigDecimal recoveramount;

    private String regional;

    private Short relationproject;

    private String relationprojectno;

    private BigDecimal reviewamount;

    private BigDecimal reviewdate;

    private Long reviewdeadline;

    private String reviewdeadlineunit;

    private Long reviewmode;

    private Double reviewrate;

    private String riskauditno;

    private String threerighttype;

    private BigDecimal totalinvestment;

    private String urgency;

    private String businesstypeId;

    private String clientId;

    private String companyId;

    private String contractId;

    private String departmentId;

    private String guaranteecreditId;

    private String guaranteecreditusedId;

    private String intentproductId;

    private String jointguaranteecompanyId;

    private String loanorganizationId;

    private String projfeeId;

    private String projectcancelapplyId;

    private Double intendingyield;

    private Short isriskproject;

    private String operatedeptId;

    private String limittag;

    private String operateorgId;

    private BigDecimal formalapplydate;

    private BigDecimal intentapplydate;

    private Short isformalapply;

    private Short isintentapply;

    private BigDecimal chargereviewamount;

    private String chargereviewway;

    private Double overduerate;

    private Double annualinterest;

    private BigDecimal annualinterestamount;

    private BigDecimal earningsamount;

    private Double earningsratio;

    private BigDecimal thistotalamount;

    private String underwriterId;

    private String inventorytype;

    private String renewproid;

    private String renewpronm;

    private Long datechecknum;

    private BigDecimal extractdate;

    private String extractpersonId;

    private Short auditinfoissended;

    private String formalattId;

    private BigDecimal loanorgacptdatetime;

    private String loanorgacptnum;

    private String reqserialuid;

    private BigDecimal loanorgapprdate;

    private String loanorgapprflg;

    private String loanorgapprremark;

    private String loanorgcontractno;

    private String bankcheckfiveclass;

    private BigDecimal bankcheckfiveclassdate;

    private String bankcheckreson;

    private String bankcheckstatus;

    private Short isreaded;

    private BigDecimal repaymentdate;

    private String fiveprocessId;

    private Short isloanover;

    private Short isbankrepayoverdue;

    private String smsstatus;

    private String duesmsstatus;

    private Date duesmstime;

    private String overduesmsstatus;

    private Date overduesmstime;

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

    public String getAcceptempcd() {
        return acceptempcd;
    }

    public void setAcceptempcd(String acceptempcd) {
        this.acceptempcd = acceptempcd == null ? null : acceptempcd.trim();
    }

    public String getAcceptempnm() {
        return acceptempnm;
    }

    public void setAcceptempnm(String acceptempnm) {
        this.acceptempnm = acceptempnm == null ? null : acceptempnm.trim();
    }

    public BigDecimal getApplyamount() {
        return applyamount;
    }

    public void setApplyamount(BigDecimal applyamount) {
        this.applyamount = applyamount;
    }

    public BigDecimal getApplydate() {
        return applydate;
    }

    public void setApplydate(BigDecimal applydate) {
        this.applydate = applydate;
    }

    public Long getApplydeadline() {
        return applydeadline;
    }

    public void setApplydeadline(Long applydeadline) {
        this.applydeadline = applydeadline;
    }

    public String getApplydeadlineunit() {
        return applydeadlineunit;
    }

    public void setApplydeadlineunit(String applydeadlineunit) {
        this.applydeadlineunit = applydeadlineunit == null ? null : applydeadlineunit.trim();
    }

    public Double getApplyrate() {
        return applyrate;
    }

    public void setApplyrate(Double applyrate) {
        this.applyrate = applyrate;
    }

    public Double getAssetliabilityratio() {
        return assetliabilityratio;
    }

    public void setAssetliabilityratio(Double assetliabilityratio) {
        this.assetliabilityratio = assetliabilityratio;
    }

    public BigDecimal getAssets() {
        return assets;
    }

    public void setAssets(BigDecimal assets) {
        this.assets = assets;
    }

    public BigDecimal getBankmanagementfee() {
        return bankmanagementfee;
    }

    public void setBankmanagementfee(BigDecimal bankmanagementfee) {
        this.bankmanagementfee = bankmanagementfee;
    }

    public Double getBankmanagementfeerate() {
        return bankmanagementfeerate;
    }

    public void setBankmanagementfeerate(Double bankmanagementfeerate) {
        this.bankmanagementfeerate = bankmanagementfeerate;
    }

    public String getBorrowerstructure() {
        return borrowerstructure;
    }

    public void setBorrowerstructure(String borrowerstructure) {
        this.borrowerstructure = borrowerstructure == null ? null : borrowerstructure.trim();
    }

    public BigDecimal getCapitalraised() {
        return capitalraised;
    }

    public void setCapitalraised(BigDecimal capitalraised) {
        this.capitalraised = capitalraised;
    }

    public BigDecimal getCashpayments() {
        return cashpayments;
    }

    public void setCashpayments(BigDecimal cashpayments) {
        this.cashpayments = cashpayments;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getCheckfrequency() {
        return checkfrequency;
    }

    public void setCheckfrequency(String checkfrequency) {
        this.checkfrequency = checkfrequency == null ? null : checkfrequency.trim();
    }

    public String getClientaddr() {
        return clientaddr;
    }

    public void setClientaddr(String clientaddr) {
        this.clientaddr = clientaddr == null ? null : clientaddr.trim();
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

    public BigDecimal getCompfreeamount() {
        return compfreeamount;
    }

    public void setCompfreeamount(BigDecimal compfreeamount) {
        this.compfreeamount = compfreeamount;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getContactperson() {
        return contactperson;
    }

    public void setContactperson(String contactperson) {
        this.contactperson = contactperson == null ? null : contactperson.trim();
    }

    public BigDecimal getContractamount() {
        return contractamount;
    }

    public void setContractamount(BigDecimal contractamount) {
        this.contractamount = contractamount;
    }

    public Long getContractdeadline() {
        return contractdeadline;
    }

    public void setContractdeadline(Long contractdeadline) {
        this.contractdeadline = contractdeadline;
    }

    public String getContractdeadlineunit() {
        return contractdeadlineunit;
    }

    public void setContractdeadlineunit(String contractdeadlineunit) {
        this.contractdeadlineunit = contractdeadlineunit == null ? null : contractdeadlineunit.trim();
    }

    public BigDecimal getContractedate() {
        return contractedate;
    }

    public void setContractedate(BigDecimal contractedate) {
        this.contractedate = contractedate;
    }

    public Double getContractrate() {
        return contractrate;
    }

    public void setContractrate(Double contractrate) {
        this.contractrate = contractrate;
    }

    public BigDecimal getContractsdate() {
        return contractsdate;
    }

    public void setContractsdate(BigDecimal contractsdate) {
        this.contractsdate = contractsdate;
    }

    public String getCreditlevel() {
        return creditlevel;
    }

    public void setCreditlevel(String creditlevel) {
        this.creditlevel = creditlevel == null ? null : creditlevel.trim();
    }

    public BigDecimal getCurrentamount() {
        return currentamount;
    }

    public void setCurrentamount(BigDecimal currentamount) {
        this.currentamount = currentamount;
    }

    public Long getCurrentdeadline() {
        return currentdeadline;
    }

    public void setCurrentdeadline(Long currentdeadline) {
        this.currentdeadline = currentdeadline;
    }

    public String getCurrentdeadlineunit() {
        return currentdeadlineunit;
    }

    public void setCurrentdeadlineunit(String currentdeadlineunit) {
        this.currentdeadlineunit = currentdeadlineunit == null ? null : currentdeadlineunit.trim();
    }

    public Double getCurrentrate() {
        return currentrate;
    }

    public void setCurrentrate(Double currentrate) {
        this.currentrate = currentrate;
    }

    public BigDecimal getDestamount() {
        return destamount;
    }

    public void setDestamount(BigDecimal destamount) {
        this.destamount = destamount;
    }

    public String getEconomiccircle() {
        return economiccircle;
    }

    public void setEconomiccircle(String economiccircle) {
        this.economiccircle = economiccircle == null ? null : economiccircle.trim();
    }

    public BigDecimal getExaminedate() {
        return examinedate;
    }

    public void setExaminedate(BigDecimal examinedate) {
        this.examinedate = examinedate;
    }

    public BigDecimal getExpenseamount() {
        return expenseamount;
    }

    public void setExpenseamount(BigDecimal expenseamount) {
        this.expenseamount = expenseamount;
    }

    public Double getExpenseradio() {
        return expenseradio;
    }

    public void setExpenseradio(Double expenseradio) {
        this.expenseradio = expenseradio;
    }

    public String getFinancingtype() {
        return financingtype;
    }

    public void setFinancingtype(String financingtype) {
        this.financingtype = financingtype == null ? null : financingtype.trim();
    }

    public String getFivelevelclassify() {
        return fivelevelclassify;
    }

    public void setFivelevelclassify(String fivelevelclassify) {
        this.fivelevelclassify = fivelevelclassify == null ? null : fivelevelclassify.trim();
    }

    public Double getFluidratio() {
        return fluidratio;
    }

    public void setFluidratio(Double fluidratio) {
        this.fluidratio = fluidratio;
    }

    public String getGuarfeecalcmodel() {
        return guarfeecalcmodel;
    }

    public void setGuarfeecalcmodel(String guarfeecalcmodel) {
        this.guarfeecalcmodel = guarfeecalcmodel == null ? null : guarfeecalcmodel.trim();
    }

    public BigDecimal getGuaranteemoney() {
        return guaranteemoney;
    }

    public void setGuaranteemoney(BigDecimal guaranteemoney) {
        this.guaranteemoney = guaranteemoney;
    }

    public Short getHasbadcreditrd() {
        return hasbadcreditrd;
    }

    public void setHasbadcreditrd(Short hasbadcreditrd) {
        this.hasbadcreditrd = hasbadcreditrd;
    }

    public BigDecimal getIncomeamount() {
        return incomeamount;
    }

    public void setIncomeamount(BigDecimal incomeamount) {
        this.incomeamount = incomeamount;
    }

    public Double getIncomeradio() {
        return incomeradio;
    }

    public void setIncomeradio(Double incomeradio) {
        this.incomeradio = incomeradio;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public BigDecimal getInsurancebalance() {
        return insurancebalance;
    }

    public void setInsurancebalance(BigDecimal insurancebalance) {
        this.insurancebalance = insurancebalance;
    }

    public String getInvestdirection() {
        return investdirection;
    }

    public void setInvestdirection(String investdirection) {
        this.investdirection = investdirection == null ? null : investdirection.trim();
    }

    public Short getIseconomicparkproject() {
        return iseconomicparkproject;
    }

    public void setIseconomicparkproject(Short iseconomicparkproject) {
        this.iseconomicparkproject = iseconomicparkproject;
    }

    public Short getIsfinaplatformproject() {
        return isfinaplatformproject;
    }

    public void setIsfinaplatformproject(Short isfinaplatformproject) {
        this.isfinaplatformproject = isfinaplatformproject;
    }

    public Short getIshisproject() {
        return ishisproject;
    }

    public void setIshisproject(Short ishisproject) {
        this.ishisproject = ishisproject;
    }

    public Short getJointguarantee() {
        return jointguarantee;
    }

    public void setJointguarantee(Short jointguarantee) {
        this.jointguarantee = jointguarantee;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson == null ? null : legalperson.trim();
    }

    public BigDecimal getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(BigDecimal liabilities) {
        this.liabilities = liabilities;
    }

    public BigDecimal getLoantotalamount() {
        return loantotalamount;
    }

    public void setLoantotalamount(BigDecimal loantotalamount) {
        this.loantotalamount = loantotalamount;
    }

    public String getMoneypurposes() {
        return moneypurposes;
    }

    public void setMoneypurposes(String moneypurposes) {
        this.moneypurposes = moneypurposes == null ? null : moneypurposes.trim();
    }

    public BigDecimal getNormalfreeamount() {
        return normalfreeamount;
    }

    public void setNormalfreeamount(BigDecimal normalfreeamount) {
        this.normalfreeamount = normalfreeamount;
    }

    public Double getOverdueinterestrate() {
        return overdueinterestrate;
    }

    public void setOverdueinterestrate(Double overdueinterestrate) {
        this.overdueinterestrate = overdueinterestrate;
    }

    public Double getOverdueprincipalrate() {
        return overdueprincipalrate;
    }

    public void setOverdueprincipalrate(Double overdueprincipalrate) {
        this.overdueprincipalrate = overdueprincipalrate;
    }

    public String getPayinterestmodel() {
        return payinterestmodel;
    }

    public void setPayinterestmodel(String payinterestmodel) {
        this.payinterestmodel = payinterestmodel == null ? null : payinterestmodel.trim();
    }

    public BigDecimal getPrelauditdate() {
        return prelauditdate;
    }

    public void setPrelauditdate(BigDecimal prelauditdate) {
        this.prelauditdate = prelauditdate;
    }

    public BigDecimal getPrelautitamount() {
        return prelautitamount;
    }

    public void setPrelautitamount(BigDecimal prelautitamount) {
        this.prelautitamount = prelautitamount;
    }

    public Long getPrelautitdeadline() {
        return prelautitdeadline;
    }

    public void setPrelautitdeadline(Long prelautitdeadline) {
        this.prelautitdeadline = prelautitdeadline;
    }

    public String getPrelautitdeadlineunit() {
        return prelautitdeadlineunit;
    }

    public void setPrelautitdeadlineunit(String prelautitdeadlineunit) {
        this.prelautitdeadlineunit = prelautitdeadlineunit == null ? null : prelautitdeadlineunit.trim();
    }

    public Double getPrelautitrate() {
        return prelautitrate;
    }

    public void setPrelautitrate(Double prelautitrate) {
        this.prelautitrate = prelautitrate;
    }

    public Double getProfitratio() {
        return profitratio;
    }

    public void setProfitratio(Double profitratio) {
        this.profitratio = profitratio;
    }

    public String getProjtype() {
        return projtype;
    }

    public void setProjtype(String projtype) {
        this.projtype = projtype == null ? null : projtype.trim();
    }

    public String getProjectarea() {
        return projectarea;
    }

    public void setProjectarea(String projectarea) {
        this.projectarea = projectarea == null ? null : projectarea.trim();
    }

    public String getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(String projectcode) {
        this.projectcode = projectcode == null ? null : projectcode.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public Long getProjectstage() {
        return projectstage;
    }

    public void setProjectstage(Long projectstage) {
        this.projectstage = projectstage;
    }

    public Double getQuickratio() {
        return quickratio;
    }

    public void setQuickratio(Double quickratio) {
        this.quickratio = quickratio;
    }

    public String getReceptionperson() {
        return receptionperson;
    }

    public void setReceptionperson(String receptionperson) {
        this.receptionperson = receptionperson == null ? null : receptionperson.trim();
    }

    public BigDecimal getRecoveramount() {
        return recoveramount;
    }

    public void setRecoveramount(BigDecimal recoveramount) {
        this.recoveramount = recoveramount;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional == null ? null : regional.trim();
    }

    public Short getRelationproject() {
        return relationproject;
    }

    public void setRelationproject(Short relationproject) {
        this.relationproject = relationproject;
    }

    public String getRelationprojectno() {
        return relationprojectno;
    }

    public void setRelationprojectno(String relationprojectno) {
        this.relationprojectno = relationprojectno == null ? null : relationprojectno.trim();
    }

    public BigDecimal getReviewamount() {
        return reviewamount;
    }

    public void setReviewamount(BigDecimal reviewamount) {
        this.reviewamount = reviewamount;
    }

    public BigDecimal getReviewdate() {
        return reviewdate;
    }

    public void setReviewdate(BigDecimal reviewdate) {
        this.reviewdate = reviewdate;
    }

    public Long getReviewdeadline() {
        return reviewdeadline;
    }

    public void setReviewdeadline(Long reviewdeadline) {
        this.reviewdeadline = reviewdeadline;
    }

    public String getReviewdeadlineunit() {
        return reviewdeadlineunit;
    }

    public void setReviewdeadlineunit(String reviewdeadlineunit) {
        this.reviewdeadlineunit = reviewdeadlineunit == null ? null : reviewdeadlineunit.trim();
    }

    public Long getReviewmode() {
        return reviewmode;
    }

    public void setReviewmode(Long reviewmode) {
        this.reviewmode = reviewmode;
    }

    public Double getReviewrate() {
        return reviewrate;
    }

    public void setReviewrate(Double reviewrate) {
        this.reviewrate = reviewrate;
    }

    public String getRiskauditno() {
        return riskauditno;
    }

    public void setRiskauditno(String riskauditno) {
        this.riskauditno = riskauditno == null ? null : riskauditno.trim();
    }

    public String getThreerighttype() {
        return threerighttype;
    }

    public void setThreerighttype(String threerighttype) {
        this.threerighttype = threerighttype == null ? null : threerighttype.trim();
    }

    public BigDecimal getTotalinvestment() {
        return totalinvestment;
    }

    public void setTotalinvestment(BigDecimal totalinvestment) {
        this.totalinvestment = totalinvestment;
    }

    public String getUrgency() {
        return urgency;
    }

    public void setUrgency(String urgency) {
        this.urgency = urgency == null ? null : urgency.trim();
    }

    public String getBusinesstypeId() {
        return businesstypeId;
    }

    public void setBusinesstypeId(String businesstypeId) {
        this.businesstypeId = businesstypeId == null ? null : businesstypeId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public String getGuaranteecreditId() {
        return guaranteecreditId;
    }

    public void setGuaranteecreditId(String guaranteecreditId) {
        this.guaranteecreditId = guaranteecreditId == null ? null : guaranteecreditId.trim();
    }

    public String getGuaranteecreditusedId() {
        return guaranteecreditusedId;
    }

    public void setGuaranteecreditusedId(String guaranteecreditusedId) {
        this.guaranteecreditusedId = guaranteecreditusedId == null ? null : guaranteecreditusedId.trim();
    }

    public String getIntentproductId() {
        return intentproductId;
    }

    public void setIntentproductId(String intentproductId) {
        this.intentproductId = intentproductId == null ? null : intentproductId.trim();
    }

    public String getJointguaranteecompanyId() {
        return jointguaranteecompanyId;
    }

    public void setJointguaranteecompanyId(String jointguaranteecompanyId) {
        this.jointguaranteecompanyId = jointguaranteecompanyId == null ? null : jointguaranteecompanyId.trim();
    }

    public String getLoanorganizationId() {
        return loanorganizationId;
    }

    public void setLoanorganizationId(String loanorganizationId) {
        this.loanorganizationId = loanorganizationId == null ? null : loanorganizationId.trim();
    }

    public String getProjfeeId() {
        return projfeeId;
    }

    public void setProjfeeId(String projfeeId) {
        this.projfeeId = projfeeId == null ? null : projfeeId.trim();
    }

    public String getProjectcancelapplyId() {
        return projectcancelapplyId;
    }

    public void setProjectcancelapplyId(String projectcancelapplyId) {
        this.projectcancelapplyId = projectcancelapplyId == null ? null : projectcancelapplyId.trim();
    }

    public Double getIntendingyield() {
        return intendingyield;
    }

    public void setIntendingyield(Double intendingyield) {
        this.intendingyield = intendingyield;
    }

    public Short getIsriskproject() {
        return isriskproject;
    }

    public void setIsriskproject(Short isriskproject) {
        this.isriskproject = isriskproject;
    }

    public String getOperatedeptId() {
        return operatedeptId;
    }

    public void setOperatedeptId(String operatedeptId) {
        this.operatedeptId = operatedeptId == null ? null : operatedeptId.trim();
    }

    public String getLimittag() {
        return limittag;
    }

    public void setLimittag(String limittag) {
        this.limittag = limittag == null ? null : limittag.trim();
    }

    public String getOperateorgId() {
        return operateorgId;
    }

    public void setOperateorgId(String operateorgId) {
        this.operateorgId = operateorgId == null ? null : operateorgId.trim();
    }

    public BigDecimal getFormalapplydate() {
        return formalapplydate;
    }

    public void setFormalapplydate(BigDecimal formalapplydate) {
        this.formalapplydate = formalapplydate;
    }

    public BigDecimal getIntentapplydate() {
        return intentapplydate;
    }

    public void setIntentapplydate(BigDecimal intentapplydate) {
        this.intentapplydate = intentapplydate;
    }

    public Short getIsformalapply() {
        return isformalapply;
    }

    public void setIsformalapply(Short isformalapply) {
        this.isformalapply = isformalapply;
    }

    public Short getIsintentapply() {
        return isintentapply;
    }

    public void setIsintentapply(Short isintentapply) {
        this.isintentapply = isintentapply;
    }

    public BigDecimal getChargereviewamount() {
        return chargereviewamount;
    }

    public void setChargereviewamount(BigDecimal chargereviewamount) {
        this.chargereviewamount = chargereviewamount;
    }

    public String getChargereviewway() {
        return chargereviewway;
    }

    public void setChargereviewway(String chargereviewway) {
        this.chargereviewway = chargereviewway == null ? null : chargereviewway.trim();
    }

    public Double getOverduerate() {
        return overduerate;
    }

    public void setOverduerate(Double overduerate) {
        this.overduerate = overduerate;
    }

    public Double getAnnualinterest() {
        return annualinterest;
    }

    public void setAnnualinterest(Double annualinterest) {
        this.annualinterest = annualinterest;
    }

    public BigDecimal getAnnualinterestamount() {
        return annualinterestamount;
    }

    public void setAnnualinterestamount(BigDecimal annualinterestamount) {
        this.annualinterestamount = annualinterestamount;
    }

    public BigDecimal getEarningsamount() {
        return earningsamount;
    }

    public void setEarningsamount(BigDecimal earningsamount) {
        this.earningsamount = earningsamount;
    }

    public Double getEarningsratio() {
        return earningsratio;
    }

    public void setEarningsratio(Double earningsratio) {
        this.earningsratio = earningsratio;
    }

    public BigDecimal getThistotalamount() {
        return thistotalamount;
    }

    public void setThistotalamount(BigDecimal thistotalamount) {
        this.thistotalamount = thistotalamount;
    }

    public String getUnderwriterId() {
        return underwriterId;
    }

    public void setUnderwriterId(String underwriterId) {
        this.underwriterId = underwriterId == null ? null : underwriterId.trim();
    }

    public String getInventorytype() {
        return inventorytype;
    }

    public void setInventorytype(String inventorytype) {
        this.inventorytype = inventorytype == null ? null : inventorytype.trim();
    }

    public String getRenewproid() {
        return renewproid;
    }

    public void setRenewproid(String renewproid) {
        this.renewproid = renewproid == null ? null : renewproid.trim();
    }

    public String getRenewpronm() {
        return renewpronm;
    }

    public void setRenewpronm(String renewpronm) {
        this.renewpronm = renewpronm == null ? null : renewpronm.trim();
    }

    public Long getDatechecknum() {
        return datechecknum;
    }

    public void setDatechecknum(Long datechecknum) {
        this.datechecknum = datechecknum;
    }

    public BigDecimal getExtractdate() {
        return extractdate;
    }

    public void setExtractdate(BigDecimal extractdate) {
        this.extractdate = extractdate;
    }

    public String getExtractpersonId() {
        return extractpersonId;
    }

    public void setExtractpersonId(String extractpersonId) {
        this.extractpersonId = extractpersonId == null ? null : extractpersonId.trim();
    }

    public Short getAuditinfoissended() {
        return auditinfoissended;
    }

    public void setAuditinfoissended(Short auditinfoissended) {
        this.auditinfoissended = auditinfoissended;
    }

    public String getFormalattId() {
        return formalattId;
    }

    public void setFormalattId(String formalattId) {
        this.formalattId = formalattId == null ? null : formalattId.trim();
    }

    public BigDecimal getLoanorgacptdatetime() {
        return loanorgacptdatetime;
    }

    public void setLoanorgacptdatetime(BigDecimal loanorgacptdatetime) {
        this.loanorgacptdatetime = loanorgacptdatetime;
    }

    public String getLoanorgacptnum() {
        return loanorgacptnum;
    }

    public void setLoanorgacptnum(String loanorgacptnum) {
        this.loanorgacptnum = loanorgacptnum == null ? null : loanorgacptnum.trim();
    }

    public String getReqserialuid() {
        return reqserialuid;
    }

    public void setReqserialuid(String reqserialuid) {
        this.reqserialuid = reqserialuid == null ? null : reqserialuid.trim();
    }

    public BigDecimal getLoanorgapprdate() {
        return loanorgapprdate;
    }

    public void setLoanorgapprdate(BigDecimal loanorgapprdate) {
        this.loanorgapprdate = loanorgapprdate;
    }

    public String getLoanorgapprflg() {
        return loanorgapprflg;
    }

    public void setLoanorgapprflg(String loanorgapprflg) {
        this.loanorgapprflg = loanorgapprflg == null ? null : loanorgapprflg.trim();
    }

    public String getLoanorgapprremark() {
        return loanorgapprremark;
    }

    public void setLoanorgapprremark(String loanorgapprremark) {
        this.loanorgapprremark = loanorgapprremark == null ? null : loanorgapprremark.trim();
    }

    public String getLoanorgcontractno() {
        return loanorgcontractno;
    }

    public void setLoanorgcontractno(String loanorgcontractno) {
        this.loanorgcontractno = loanorgcontractno == null ? null : loanorgcontractno.trim();
    }

    public String getBankcheckfiveclass() {
        return bankcheckfiveclass;
    }

    public void setBankcheckfiveclass(String bankcheckfiveclass) {
        this.bankcheckfiveclass = bankcheckfiveclass == null ? null : bankcheckfiveclass.trim();
    }

    public BigDecimal getBankcheckfiveclassdate() {
        return bankcheckfiveclassdate;
    }

    public void setBankcheckfiveclassdate(BigDecimal bankcheckfiveclassdate) {
        this.bankcheckfiveclassdate = bankcheckfiveclassdate;
    }

    public String getBankcheckreson() {
        return bankcheckreson;
    }

    public void setBankcheckreson(String bankcheckreson) {
        this.bankcheckreson = bankcheckreson == null ? null : bankcheckreson.trim();
    }

    public String getBankcheckstatus() {
        return bankcheckstatus;
    }

    public void setBankcheckstatus(String bankcheckstatus) {
        this.bankcheckstatus = bankcheckstatus == null ? null : bankcheckstatus.trim();
    }

    public Short getIsreaded() {
        return isreaded;
    }

    public void setIsreaded(Short isreaded) {
        this.isreaded = isreaded;
    }

    public BigDecimal getRepaymentdate() {
        return repaymentdate;
    }

    public void setRepaymentdate(BigDecimal repaymentdate) {
        this.repaymentdate = repaymentdate;
    }

    public String getFiveprocessId() {
        return fiveprocessId;
    }

    public void setFiveprocessId(String fiveprocessId) {
        this.fiveprocessId = fiveprocessId == null ? null : fiveprocessId.trim();
    }

    public Short getIsloanover() {
        return isloanover;
    }

    public void setIsloanover(Short isloanover) {
        this.isloanover = isloanover;
    }

    public Short getIsbankrepayoverdue() {
        return isbankrepayoverdue;
    }

    public void setIsbankrepayoverdue(Short isbankrepayoverdue) {
        this.isbankrepayoverdue = isbankrepayoverdue;
    }

    public String getSmsstatus() {
        return smsstatus;
    }

    public void setSmsstatus(String smsstatus) {
        this.smsstatus = smsstatus == null ? null : smsstatus.trim();
    }

    public String getDuesmsstatus() {
        return duesmsstatus;
    }

    public void setDuesmsstatus(String duesmsstatus) {
        this.duesmsstatus = duesmsstatus == null ? null : duesmsstatus.trim();
    }

    public Date getDuesmstime() {
        return duesmstime;
    }

    public void setDuesmstime(Date duesmstime) {
        this.duesmstime = duesmstime;
    }

    public String getOverduesmsstatus() {
        return overduesmsstatus;
    }

    public void setOverduesmsstatus(String overduesmsstatus) {
        this.overduesmsstatus = overduesmsstatus == null ? null : overduesmsstatus.trim();
    }

    public Date getOverduesmstime() {
        return overduesmstime;
    }

    public void setOverduesmstime(Date overduesmstime) {
        this.overduesmstime = overduesmstime;
    }

    public String getIssynch() {
        return issynch;
    }

    public void setIssynch(String issynch) {
        this.issynch = issynch == null ? null : issynch.trim();
    }
}