package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.Date;

//放款表
public class Projectloan {
    private String id;

    private Long loantype;

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

    private BigDecimal accountenddate;

    private BigDecimal applydate;

    private String applystatus;

    private BigDecimal applyuseamount;

    private BigDecimal beginloandate;

    private BigDecimal beginrepaydate;

    private Double breachfinerate;

    private BigDecimal compfreedate;

    private BigDecimal consultationfee;

    private Long currentdeadline;

    private String currentdeadlineunit;

    private BigDecimal endloandate;

    private BigDecimal endrepaydate;

    private String expenseaccountname;

    private BigDecimal expenseamount;

    private String expensebank;

    private String expensebankaccount;

    private BigDecimal expensefactamount;

    private Double expenseradio;

    private BigDecimal feeincomeother;

    private BigDecimal feepayother;

    private Double feerate;

    private Double feerateincomeother;

    private Double feeratepayother;

    private String financeconfirmpledgeexpense;

    private BigDecimal guaranteefee;

    private String inbank;

    private Short isloan;

    private String loancontractno;

    private BigDecimal loandate;

    private BigDecimal loannotifydate;

    private Double loanrate;

    private BigDecimal loanusenotifydate;

    private String loanscontcode;

    private BigDecimal managementfee;

    private String mgropinion;

    private BigDecimal otherfee;

    private String outbank;

    private Double overdueamount;

    private Long overduetimes;

    private String pledgedeadline;

    private String pledgedeadlineunit;

    private BigDecimal pledgemoney;

    private Double pledgerate;

    private Double principalamount;

    private BigDecimal proceduresfee;

    private BigDecimal promisefee;

    private BigDecimal providedate;

    private String remark;

    private String repaymentaccount;

    private String repaymentaccountno;

    private String repaymentbank;

    private BigDecimal repaymentdate;

    private BigDecimal repaymentmode;

    private Long tenior;

    private BigDecimal totalcompfreeamount;

    private BigDecimal totalcompfreeinterest;

    private BigDecimal totaldestamount;

    private BigDecimal totaldueinterest;

    private BigDecimal totaldueprincipal;

    private BigDecimal totalpayamt;

    private Double totalprovidepayamt;

    private BigDecimal updatedate;

    private String usedescription;

    private BigDecimal usemoneynotifydate;

    private BigDecimal usedmoneydate;

    private BigDecimal availablebalance;

    private BigDecimal canusebalance;

    private BigDecimal usedamount;

    private String projectId;

    private String bankloanId;

    private String loancertificateId;

    private String projecttotalliabilityId;

    private String updatemanId;

    private String aloanadvice;

    private String clientname;

    private String commitstate;

    private Long customerspayconsultingfee;

    private String guaranteecondition;

    private String guaranteeconditiondeclare;

    private BigDecimal guaranteeedate;

    private BigDecimal guaranteesdate;

    private BigDecimal guaranteedamount;

    private String industrycategory;

    private String projectloanrepaymentplan;

    private String projectname;

    private BigDecimal receivablecustomerguaranteefee;

    private String sequenceno;

    private String submittedfilelist;

    private String windcontrolmeetingsummaryissue;

    private String loanrepaymentplan;

    private BigDecimal clientguarfee;

    private String conditiondeclare;

    private Long consultingfee;

    private Double guaranteefeerate;

    private Long guaranteenumber;

    private BigDecimal guaranteetotalvalue;

    private String meetingsummaryissue;

    private Double custdepositratio;

    private String custname;

    private Double custpaymentguarrate;

    private BigDecimal customersdeposit;

    private String expenseremarks;

    private BigDecimal expirationdate;

    private String guarconditions;

    private String industry;

    private BigDecimal loanamount;

    private BigDecimal receivableguarfeeaccount;

    private Long registerednumber;

    private BigDecimal registeredtotalvalue;

    private String submissionlist;

    private String windcontrolmeetingperiod;

    private BigDecimal contractamount;

    private String filelist;

    private BigDecimal guartotalamount;

    private Long guattotalnum;

    private String loanrepaytime;

    private BigDecimal procollateralamount;

    private Double procollateralrate;

    private Double reporttotalinvestmentrate;

    private BigDecimal reviewtotalinvestment;

    private String bankId;

    private String contractId;

    private BigDecimal endtime;

    private String mgrbopinion;

    private BigDecimal contractedate;

    private BigDecimal contractsdate;

    private String financepurpose;

    private BigDecimal investamount;

    private String receivetimes;

    private BigDecimal adviserfee;

    private String noticeapprovedempcd;

    private String noticeapprovedempnm;

    private String sealempcd;

    private String sealempnm;

    private String payloanplan;

    private Short ischeck;

    private String reviewfilelist;

    private BigDecimal applyamount;

    private String account;

    private String bankname;

    private String ownername;

    private String attachmentId;

    private BigDecimal newreviewfee;

    private String guaranteedutyremind;

    private String loanserialuid;

    private String bankrepaymentmode;

    private Long bankloandeadline;

    private Short issettle;

    private String datasyncstauts;

    private String loankinds;

    private Short isloanover;

    private String datacheckinfo1516;

    private String checkstatus;

    private String datacheckinfo17;

    private Double baserate;

    private String datacheckinfo1807;

    private String datacheckinfo1703;

    private String datacheckinfo1706;

    private String datacheckinfo17Sbn;

    private String datacheckinfo1812;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getLoantype() {
        return loantype;
    }

    public void setLoantype(Long loantype) {
        this.loantype = loantype;
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

    public BigDecimal getAccountenddate() {
        return accountenddate;
    }

    public void setAccountenddate(BigDecimal accountenddate) {
        this.accountenddate = accountenddate;
    }

    public BigDecimal getApplydate() {
        return applydate;
    }

    public void setApplydate(BigDecimal applydate) {
        this.applydate = applydate;
    }

    public String getApplystatus() {
        return applystatus;
    }

    public void setApplystatus(String applystatus) {
        this.applystatus = applystatus == null ? null : applystatus.trim();
    }

    public BigDecimal getApplyuseamount() {
        return applyuseamount;
    }

    public void setApplyuseamount(BigDecimal applyuseamount) {
        this.applyuseamount = applyuseamount;
    }

    public BigDecimal getBeginloandate() {
        return beginloandate;
    }

    public void setBeginloandate(BigDecimal beginloandate) {
        this.beginloandate = beginloandate;
    }

    public BigDecimal getBeginrepaydate() {
        return beginrepaydate;
    }

    public void setBeginrepaydate(BigDecimal beginrepaydate) {
        this.beginrepaydate = beginrepaydate;
    }

    public Double getBreachfinerate() {
        return breachfinerate;
    }

    public void setBreachfinerate(Double breachfinerate) {
        this.breachfinerate = breachfinerate;
    }

    public BigDecimal getCompfreedate() {
        return compfreedate;
    }

    public void setCompfreedate(BigDecimal compfreedate) {
        this.compfreedate = compfreedate;
    }

    public BigDecimal getConsultationfee() {
        return consultationfee;
    }

    public void setConsultationfee(BigDecimal consultationfee) {
        this.consultationfee = consultationfee;
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

    public BigDecimal getEndloandate() {
        return endloandate;
    }

    public void setEndloandate(BigDecimal endloandate) {
        this.endloandate = endloandate;
    }

    public BigDecimal getEndrepaydate() {
        return endrepaydate;
    }

    public void setEndrepaydate(BigDecimal endrepaydate) {
        this.endrepaydate = endrepaydate;
    }

    public String getExpenseaccountname() {
        return expenseaccountname;
    }

    public void setExpenseaccountname(String expenseaccountname) {
        this.expenseaccountname = expenseaccountname == null ? null : expenseaccountname.trim();
    }

    public BigDecimal getExpenseamount() {
        return expenseamount;
    }

    public void setExpenseamount(BigDecimal expenseamount) {
        this.expenseamount = expenseamount;
    }

    public String getExpensebank() {
        return expensebank;
    }

    public void setExpensebank(String expensebank) {
        this.expensebank = expensebank == null ? null : expensebank.trim();
    }

    public String getExpensebankaccount() {
        return expensebankaccount;
    }

    public void setExpensebankaccount(String expensebankaccount) {
        this.expensebankaccount = expensebankaccount == null ? null : expensebankaccount.trim();
    }

    public BigDecimal getExpensefactamount() {
        return expensefactamount;
    }

    public void setExpensefactamount(BigDecimal expensefactamount) {
        this.expensefactamount = expensefactamount;
    }

    public Double getExpenseradio() {
        return expenseradio;
    }

    public void setExpenseradio(Double expenseradio) {
        this.expenseradio = expenseradio;
    }

    public BigDecimal getFeeincomeother() {
        return feeincomeother;
    }

    public void setFeeincomeother(BigDecimal feeincomeother) {
        this.feeincomeother = feeincomeother;
    }

    public BigDecimal getFeepayother() {
        return feepayother;
    }

    public void setFeepayother(BigDecimal feepayother) {
        this.feepayother = feepayother;
    }

    public Double getFeerate() {
        return feerate;
    }

    public void setFeerate(Double feerate) {
        this.feerate = feerate;
    }

    public Double getFeerateincomeother() {
        return feerateincomeother;
    }

    public void setFeerateincomeother(Double feerateincomeother) {
        this.feerateincomeother = feerateincomeother;
    }

    public Double getFeeratepayother() {
        return feeratepayother;
    }

    public void setFeeratepayother(Double feeratepayother) {
        this.feeratepayother = feeratepayother;
    }

    public String getFinanceconfirmpledgeexpense() {
        return financeconfirmpledgeexpense;
    }

    public void setFinanceconfirmpledgeexpense(String financeconfirmpledgeexpense) {
        this.financeconfirmpledgeexpense = financeconfirmpledgeexpense == null ? null : financeconfirmpledgeexpense.trim();
    }

    public BigDecimal getGuaranteefee() {
        return guaranteefee;
    }

    public void setGuaranteefee(BigDecimal guaranteefee) {
        this.guaranteefee = guaranteefee;
    }

    public String getInbank() {
        return inbank;
    }

    public void setInbank(String inbank) {
        this.inbank = inbank == null ? null : inbank.trim();
    }

    public Short getIsloan() {
        return isloan;
    }

    public void setIsloan(Short isloan) {
        this.isloan = isloan;
    }

    public String getLoancontractno() {
        return loancontractno;
    }

    public void setLoancontractno(String loancontractno) {
        this.loancontractno = loancontractno == null ? null : loancontractno.trim();
    }

    public BigDecimal getLoandate() {
        return loandate;
    }

    public void setLoandate(BigDecimal loandate) {
        this.loandate = loandate;
    }

    public BigDecimal getLoannotifydate() {
        return loannotifydate;
    }

    public void setLoannotifydate(BigDecimal loannotifydate) {
        this.loannotifydate = loannotifydate;
    }

    public Double getLoanrate() {
        return loanrate;
    }

    public void setLoanrate(Double loanrate) {
        this.loanrate = loanrate;
    }

    public BigDecimal getLoanusenotifydate() {
        return loanusenotifydate;
    }

    public void setLoanusenotifydate(BigDecimal loanusenotifydate) {
        this.loanusenotifydate = loanusenotifydate;
    }

    public String getLoanscontcode() {
        return loanscontcode;
    }

    public void setLoanscontcode(String loanscontcode) {
        this.loanscontcode = loanscontcode == null ? null : loanscontcode.trim();
    }

    public BigDecimal getManagementfee() {
        return managementfee;
    }

    public void setManagementfee(BigDecimal managementfee) {
        this.managementfee = managementfee;
    }

    public String getMgropinion() {
        return mgropinion;
    }

    public void setMgropinion(String mgropinion) {
        this.mgropinion = mgropinion == null ? null : mgropinion.trim();
    }

    public BigDecimal getOtherfee() {
        return otherfee;
    }

    public void setOtherfee(BigDecimal otherfee) {
        this.otherfee = otherfee;
    }

    public String getOutbank() {
        return outbank;
    }

    public void setOutbank(String outbank) {
        this.outbank = outbank == null ? null : outbank.trim();
    }

    public Double getOverdueamount() {
        return overdueamount;
    }

    public void setOverdueamount(Double overdueamount) {
        this.overdueamount = overdueamount;
    }

    public Long getOverduetimes() {
        return overduetimes;
    }

    public void setOverduetimes(Long overduetimes) {
        this.overduetimes = overduetimes;
    }

    public String getPledgedeadline() {
        return pledgedeadline;
    }

    public void setPledgedeadline(String pledgedeadline) {
        this.pledgedeadline = pledgedeadline == null ? null : pledgedeadline.trim();
    }

    public String getPledgedeadlineunit() {
        return pledgedeadlineunit;
    }

    public void setPledgedeadlineunit(String pledgedeadlineunit) {
        this.pledgedeadlineunit = pledgedeadlineunit == null ? null : pledgedeadlineunit.trim();
    }

    public BigDecimal getPledgemoney() {
        return pledgemoney;
    }

    public void setPledgemoney(BigDecimal pledgemoney) {
        this.pledgemoney = pledgemoney;
    }

    public Double getPledgerate() {
        return pledgerate;
    }

    public void setPledgerate(Double pledgerate) {
        this.pledgerate = pledgerate;
    }

    public Double getPrincipalamount() {
        return principalamount;
    }

    public void setPrincipalamount(Double principalamount) {
        this.principalamount = principalamount;
    }

    public BigDecimal getProceduresfee() {
        return proceduresfee;
    }

    public void setProceduresfee(BigDecimal proceduresfee) {
        this.proceduresfee = proceduresfee;
    }

    public BigDecimal getPromisefee() {
        return promisefee;
    }

    public void setPromisefee(BigDecimal promisefee) {
        this.promisefee = promisefee;
    }

    public BigDecimal getProvidedate() {
        return providedate;
    }

    public void setProvidedate(BigDecimal providedate) {
        this.providedate = providedate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRepaymentaccount() {
        return repaymentaccount;
    }

    public void setRepaymentaccount(String repaymentaccount) {
        this.repaymentaccount = repaymentaccount == null ? null : repaymentaccount.trim();
    }

    public String getRepaymentaccountno() {
        return repaymentaccountno;
    }

    public void setRepaymentaccountno(String repaymentaccountno) {
        this.repaymentaccountno = repaymentaccountno == null ? null : repaymentaccountno.trim();
    }

    public String getRepaymentbank() {
        return repaymentbank;
    }

    public void setRepaymentbank(String repaymentbank) {
        this.repaymentbank = repaymentbank == null ? null : repaymentbank.trim();
    }

    public BigDecimal getRepaymentdate() {
        return repaymentdate;
    }

    public void setRepaymentdate(BigDecimal repaymentdate) {
        this.repaymentdate = repaymentdate;
    }

    public BigDecimal getRepaymentmode() {
        return repaymentmode;
    }

    public void setRepaymentmode(BigDecimal repaymentmode) {
        this.repaymentmode = repaymentmode;
    }

    public Long getTenior() {
        return tenior;
    }

    public void setTenior(Long tenior) {
        this.tenior = tenior;
    }

    public BigDecimal getTotalcompfreeamount() {
        return totalcompfreeamount;
    }

    public void setTotalcompfreeamount(BigDecimal totalcompfreeamount) {
        this.totalcompfreeamount = totalcompfreeamount;
    }

    public BigDecimal getTotalcompfreeinterest() {
        return totalcompfreeinterest;
    }

    public void setTotalcompfreeinterest(BigDecimal totalcompfreeinterest) {
        this.totalcompfreeinterest = totalcompfreeinterest;
    }

    public BigDecimal getTotaldestamount() {
        return totaldestamount;
    }

    public void setTotaldestamount(BigDecimal totaldestamount) {
        this.totaldestamount = totaldestamount;
    }

    public BigDecimal getTotaldueinterest() {
        return totaldueinterest;
    }

    public void setTotaldueinterest(BigDecimal totaldueinterest) {
        this.totaldueinterest = totaldueinterest;
    }

    public BigDecimal getTotaldueprincipal() {
        return totaldueprincipal;
    }

    public void setTotaldueprincipal(BigDecimal totaldueprincipal) {
        this.totaldueprincipal = totaldueprincipal;
    }

    public BigDecimal getTotalpayamt() {
        return totalpayamt;
    }

    public void setTotalpayamt(BigDecimal totalpayamt) {
        this.totalpayamt = totalpayamt;
    }

    public Double getTotalprovidepayamt() {
        return totalprovidepayamt;
    }

    public void setTotalprovidepayamt(Double totalprovidepayamt) {
        this.totalprovidepayamt = totalprovidepayamt;
    }

    public BigDecimal getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(BigDecimal updatedate) {
        this.updatedate = updatedate;
    }

    public String getUsedescription() {
        return usedescription;
    }

    public void setUsedescription(String usedescription) {
        this.usedescription = usedescription == null ? null : usedescription.trim();
    }

    public BigDecimal getUsemoneynotifydate() {
        return usemoneynotifydate;
    }

    public void setUsemoneynotifydate(BigDecimal usemoneynotifydate) {
        this.usemoneynotifydate = usemoneynotifydate;
    }

    public BigDecimal getUsedmoneydate() {
        return usedmoneydate;
    }

    public void setUsedmoneydate(BigDecimal usedmoneydate) {
        this.usedmoneydate = usedmoneydate;
    }

    public BigDecimal getAvailablebalance() {
        return availablebalance;
    }

    public void setAvailablebalance(BigDecimal availablebalance) {
        this.availablebalance = availablebalance;
    }

    public BigDecimal getCanusebalance() {
        return canusebalance;
    }

    public void setCanusebalance(BigDecimal canusebalance) {
        this.canusebalance = canusebalance;
    }

    public BigDecimal getUsedamount() {
        return usedamount;
    }

    public void setUsedamount(BigDecimal usedamount) {
        this.usedamount = usedamount;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId == null ? null : projectId.trim();
    }

    public String getBankloanId() {
        return bankloanId;
    }

    public void setBankloanId(String bankloanId) {
        this.bankloanId = bankloanId == null ? null : bankloanId.trim();
    }

    public String getLoancertificateId() {
        return loancertificateId;
    }

    public void setLoancertificateId(String loancertificateId) {
        this.loancertificateId = loancertificateId == null ? null : loancertificateId.trim();
    }

    public String getProjecttotalliabilityId() {
        return projecttotalliabilityId;
    }

    public void setProjecttotalliabilityId(String projecttotalliabilityId) {
        this.projecttotalliabilityId = projecttotalliabilityId == null ? null : projecttotalliabilityId.trim();
    }

    public String getUpdatemanId() {
        return updatemanId;
    }

    public void setUpdatemanId(String updatemanId) {
        this.updatemanId = updatemanId == null ? null : updatemanId.trim();
    }

    public String getAloanadvice() {
        return aloanadvice;
    }

    public void setAloanadvice(String aloanadvice) {
        this.aloanadvice = aloanadvice == null ? null : aloanadvice.trim();
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname == null ? null : clientname.trim();
    }

    public String getCommitstate() {
        return commitstate;
    }

    public void setCommitstate(String commitstate) {
        this.commitstate = commitstate == null ? null : commitstate.trim();
    }

    public Long getCustomerspayconsultingfee() {
        return customerspayconsultingfee;
    }

    public void setCustomerspayconsultingfee(Long customerspayconsultingfee) {
        this.customerspayconsultingfee = customerspayconsultingfee;
    }

    public String getGuaranteecondition() {
        return guaranteecondition;
    }

    public void setGuaranteecondition(String guaranteecondition) {
        this.guaranteecondition = guaranteecondition == null ? null : guaranteecondition.trim();
    }

    public String getGuaranteeconditiondeclare() {
        return guaranteeconditiondeclare;
    }

    public void setGuaranteeconditiondeclare(String guaranteeconditiondeclare) {
        this.guaranteeconditiondeclare = guaranteeconditiondeclare == null ? null : guaranteeconditiondeclare.trim();
    }

    public BigDecimal getGuaranteeedate() {
        return guaranteeedate;
    }

    public void setGuaranteeedate(BigDecimal guaranteeedate) {
        this.guaranteeedate = guaranteeedate;
    }

    public BigDecimal getGuaranteesdate() {
        return guaranteesdate;
    }

    public void setGuaranteesdate(BigDecimal guaranteesdate) {
        this.guaranteesdate = guaranteesdate;
    }

    public BigDecimal getGuaranteedamount() {
        return guaranteedamount;
    }

    public void setGuaranteedamount(BigDecimal guaranteedamount) {
        this.guaranteedamount = guaranteedamount;
    }

    public String getIndustrycategory() {
        return industrycategory;
    }

    public void setIndustrycategory(String industrycategory) {
        this.industrycategory = industrycategory == null ? null : industrycategory.trim();
    }

    public String getProjectloanrepaymentplan() {
        return projectloanrepaymentplan;
    }

    public void setProjectloanrepaymentplan(String projectloanrepaymentplan) {
        this.projectloanrepaymentplan = projectloanrepaymentplan == null ? null : projectloanrepaymentplan.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public BigDecimal getReceivablecustomerguaranteefee() {
        return receivablecustomerguaranteefee;
    }

    public void setReceivablecustomerguaranteefee(BigDecimal receivablecustomerguaranteefee) {
        this.receivablecustomerguaranteefee = receivablecustomerguaranteefee;
    }

    public String getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(String sequenceno) {
        this.sequenceno = sequenceno == null ? null : sequenceno.trim();
    }

    public String getSubmittedfilelist() {
        return submittedfilelist;
    }

    public void setSubmittedfilelist(String submittedfilelist) {
        this.submittedfilelist = submittedfilelist == null ? null : submittedfilelist.trim();
    }

    public String getWindcontrolmeetingsummaryissue() {
        return windcontrolmeetingsummaryissue;
    }

    public void setWindcontrolmeetingsummaryissue(String windcontrolmeetingsummaryissue) {
        this.windcontrolmeetingsummaryissue = windcontrolmeetingsummaryissue == null ? null : windcontrolmeetingsummaryissue.trim();
    }

    public String getLoanrepaymentplan() {
        return loanrepaymentplan;
    }

    public void setLoanrepaymentplan(String loanrepaymentplan) {
        this.loanrepaymentplan = loanrepaymentplan == null ? null : loanrepaymentplan.trim();
    }

    public BigDecimal getClientguarfee() {
        return clientguarfee;
    }

    public void setClientguarfee(BigDecimal clientguarfee) {
        this.clientguarfee = clientguarfee;
    }

    public String getConditiondeclare() {
        return conditiondeclare;
    }

    public void setConditiondeclare(String conditiondeclare) {
        this.conditiondeclare = conditiondeclare == null ? null : conditiondeclare.trim();
    }

    public Long getConsultingfee() {
        return consultingfee;
    }

    public void setConsultingfee(Long consultingfee) {
        this.consultingfee = consultingfee;
    }

    public Double getGuaranteefeerate() {
        return guaranteefeerate;
    }

    public void setGuaranteefeerate(Double guaranteefeerate) {
        this.guaranteefeerate = guaranteefeerate;
    }

    public Long getGuaranteenumber() {
        return guaranteenumber;
    }

    public void setGuaranteenumber(Long guaranteenumber) {
        this.guaranteenumber = guaranteenumber;
    }

    public BigDecimal getGuaranteetotalvalue() {
        return guaranteetotalvalue;
    }

    public void setGuaranteetotalvalue(BigDecimal guaranteetotalvalue) {
        this.guaranteetotalvalue = guaranteetotalvalue;
    }

    public String getMeetingsummaryissue() {
        return meetingsummaryissue;
    }

    public void setMeetingsummaryissue(String meetingsummaryissue) {
        this.meetingsummaryissue = meetingsummaryissue == null ? null : meetingsummaryissue.trim();
    }

    public Double getCustdepositratio() {
        return custdepositratio;
    }

    public void setCustdepositratio(Double custdepositratio) {
        this.custdepositratio = custdepositratio;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname == null ? null : custname.trim();
    }

    public Double getCustpaymentguarrate() {
        return custpaymentguarrate;
    }

    public void setCustpaymentguarrate(Double custpaymentguarrate) {
        this.custpaymentguarrate = custpaymentguarrate;
    }

    public BigDecimal getCustomersdeposit() {
        return customersdeposit;
    }

    public void setCustomersdeposit(BigDecimal customersdeposit) {
        this.customersdeposit = customersdeposit;
    }

    public String getExpenseremarks() {
        return expenseremarks;
    }

    public void setExpenseremarks(String expenseremarks) {
        this.expenseremarks = expenseremarks == null ? null : expenseremarks.trim();
    }

    public BigDecimal getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(BigDecimal expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getGuarconditions() {
        return guarconditions;
    }

    public void setGuarconditions(String guarconditions) {
        this.guarconditions = guarconditions == null ? null : guarconditions.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public BigDecimal getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(BigDecimal loanamount) {
        this.loanamount = loanamount;
    }

    public BigDecimal getReceivableguarfeeaccount() {
        return receivableguarfeeaccount;
    }

    public void setReceivableguarfeeaccount(BigDecimal receivableguarfeeaccount) {
        this.receivableguarfeeaccount = receivableguarfeeaccount;
    }

    public Long getRegisterednumber() {
        return registerednumber;
    }

    public void setRegisterednumber(Long registerednumber) {
        this.registerednumber = registerednumber;
    }

    public BigDecimal getRegisteredtotalvalue() {
        return registeredtotalvalue;
    }

    public void setRegisteredtotalvalue(BigDecimal registeredtotalvalue) {
        this.registeredtotalvalue = registeredtotalvalue;
    }

    public String getSubmissionlist() {
        return submissionlist;
    }

    public void setSubmissionlist(String submissionlist) {
        this.submissionlist = submissionlist == null ? null : submissionlist.trim();
    }

    public String getWindcontrolmeetingperiod() {
        return windcontrolmeetingperiod;
    }

    public void setWindcontrolmeetingperiod(String windcontrolmeetingperiod) {
        this.windcontrolmeetingperiod = windcontrolmeetingperiod == null ? null : windcontrolmeetingperiod.trim();
    }

    public BigDecimal getContractamount() {
        return contractamount;
    }

    public void setContractamount(BigDecimal contractamount) {
        this.contractamount = contractamount;
    }

    public String getFilelist() {
        return filelist;
    }

    public void setFilelist(String filelist) {
        this.filelist = filelist == null ? null : filelist.trim();
    }

    public BigDecimal getGuartotalamount() {
        return guartotalamount;
    }

    public void setGuartotalamount(BigDecimal guartotalamount) {
        this.guartotalamount = guartotalamount;
    }

    public Long getGuattotalnum() {
        return guattotalnum;
    }

    public void setGuattotalnum(Long guattotalnum) {
        this.guattotalnum = guattotalnum;
    }

    public String getLoanrepaytime() {
        return loanrepaytime;
    }

    public void setLoanrepaytime(String loanrepaytime) {
        this.loanrepaytime = loanrepaytime == null ? null : loanrepaytime.trim();
    }

    public BigDecimal getProcollateralamount() {
        return procollateralamount;
    }

    public void setProcollateralamount(BigDecimal procollateralamount) {
        this.procollateralamount = procollateralamount;
    }

    public Double getProcollateralrate() {
        return procollateralrate;
    }

    public void setProcollateralrate(Double procollateralrate) {
        this.procollateralrate = procollateralrate;
    }

    public Double getReporttotalinvestmentrate() {
        return reporttotalinvestmentrate;
    }

    public void setReporttotalinvestmentrate(Double reporttotalinvestmentrate) {
        this.reporttotalinvestmentrate = reporttotalinvestmentrate;
    }

    public BigDecimal getReviewtotalinvestment() {
        return reviewtotalinvestment;
    }

    public void setReviewtotalinvestment(BigDecimal reviewtotalinvestment) {
        this.reviewtotalinvestment = reviewtotalinvestment;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId == null ? null : contractId.trim();
    }

    public BigDecimal getEndtime() {
        return endtime;
    }

    public void setEndtime(BigDecimal endtime) {
        this.endtime = endtime;
    }

    public String getMgrbopinion() {
        return mgrbopinion;
    }

    public void setMgrbopinion(String mgrbopinion) {
        this.mgrbopinion = mgrbopinion == null ? null : mgrbopinion.trim();
    }

    public BigDecimal getContractedate() {
        return contractedate;
    }

    public void setContractedate(BigDecimal contractedate) {
        this.contractedate = contractedate;
    }

    public BigDecimal getContractsdate() {
        return contractsdate;
    }

    public void setContractsdate(BigDecimal contractsdate) {
        this.contractsdate = contractsdate;
    }

    public String getFinancepurpose() {
        return financepurpose;
    }

    public void setFinancepurpose(String financepurpose) {
        this.financepurpose = financepurpose == null ? null : financepurpose.trim();
    }

    public BigDecimal getInvestamount() {
        return investamount;
    }

    public void setInvestamount(BigDecimal investamount) {
        this.investamount = investamount;
    }

    public String getReceivetimes() {
        return receivetimes;
    }

    public void setReceivetimes(String receivetimes) {
        this.receivetimes = receivetimes == null ? null : receivetimes.trim();
    }

    public BigDecimal getAdviserfee() {
        return adviserfee;
    }

    public void setAdviserfee(BigDecimal adviserfee) {
        this.adviserfee = adviserfee;
    }

    public String getNoticeapprovedempcd() {
        return noticeapprovedempcd;
    }

    public void setNoticeapprovedempcd(String noticeapprovedempcd) {
        this.noticeapprovedempcd = noticeapprovedempcd == null ? null : noticeapprovedempcd.trim();
    }

    public String getNoticeapprovedempnm() {
        return noticeapprovedempnm;
    }

    public void setNoticeapprovedempnm(String noticeapprovedempnm) {
        this.noticeapprovedempnm = noticeapprovedempnm == null ? null : noticeapprovedempnm.trim();
    }

    public String getSealempcd() {
        return sealempcd;
    }

    public void setSealempcd(String sealempcd) {
        this.sealempcd = sealempcd == null ? null : sealempcd.trim();
    }

    public String getSealempnm() {
        return sealempnm;
    }

    public void setSealempnm(String sealempnm) {
        this.sealempnm = sealempnm == null ? null : sealempnm.trim();
    }

    public String getPayloanplan() {
        return payloanplan;
    }

    public void setPayloanplan(String payloanplan) {
        this.payloanplan = payloanplan == null ? null : payloanplan.trim();
    }

    public Short getIscheck() {
        return ischeck;
    }

    public void setIscheck(Short ischeck) {
        this.ischeck = ischeck;
    }

    public String getReviewfilelist() {
        return reviewfilelist;
    }

    public void setReviewfilelist(String reviewfilelist) {
        this.reviewfilelist = reviewfilelist == null ? null : reviewfilelist.trim();
    }

    public BigDecimal getApplyamount() {
        return applyamount;
    }

    public void setApplyamount(BigDecimal applyamount) {
        this.applyamount = applyamount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername == null ? null : ownername.trim();
    }

    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId == null ? null : attachmentId.trim();
    }

    public BigDecimal getNewreviewfee() {
        return newreviewfee;
    }

    public void setNewreviewfee(BigDecimal newreviewfee) {
        this.newreviewfee = newreviewfee;
    }

    public String getGuaranteedutyremind() {
        return guaranteedutyremind;
    }

    public void setGuaranteedutyremind(String guaranteedutyremind) {
        this.guaranteedutyremind = guaranteedutyremind == null ? null : guaranteedutyremind.trim();
    }

    public String getLoanserialuid() {
        return loanserialuid;
    }

    public void setLoanserialuid(String loanserialuid) {
        this.loanserialuid = loanserialuid == null ? null : loanserialuid.trim();
    }

    public String getBankrepaymentmode() {
        return bankrepaymentmode;
    }

    public void setBankrepaymentmode(String bankrepaymentmode) {
        this.bankrepaymentmode = bankrepaymentmode == null ? null : bankrepaymentmode.trim();
    }

    public Long getBankloandeadline() {
        return bankloandeadline;
    }

    public void setBankloandeadline(Long bankloandeadline) {
        this.bankloandeadline = bankloandeadline;
    }

    public Short getIssettle() {
        return issettle;
    }

    public void setIssettle(Short issettle) {
        this.issettle = issettle;
    }

    public String getDatasyncstauts() {
        return datasyncstauts;
    }

    public void setDatasyncstauts(String datasyncstauts) {
        this.datasyncstauts = datasyncstauts == null ? null : datasyncstauts.trim();
    }

    public String getLoankinds() {
        return loankinds;
    }

    public void setLoankinds(String loankinds) {
        this.loankinds = loankinds == null ? null : loankinds.trim();
    }

    public Short getIsloanover() {
        return isloanover;
    }

    public void setIsloanover(Short isloanover) {
        this.isloanover = isloanover;
    }

    public String getDatacheckinfo1516() {
        return datacheckinfo1516;
    }

    public void setDatacheckinfo1516(String datacheckinfo1516) {
        this.datacheckinfo1516 = datacheckinfo1516 == null ? null : datacheckinfo1516.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }

    public String getDatacheckinfo17() {
        return datacheckinfo17;
    }

    public void setDatacheckinfo17(String datacheckinfo17) {
        this.datacheckinfo17 = datacheckinfo17 == null ? null : datacheckinfo17.trim();
    }

    public Double getBaserate() {
        return baserate;
    }

    public void setBaserate(Double baserate) {
        this.baserate = baserate;
    }

    public String getDatacheckinfo1807() {
        return datacheckinfo1807;
    }

    public void setDatacheckinfo1807(String datacheckinfo1807) {
        this.datacheckinfo1807 = datacheckinfo1807 == null ? null : datacheckinfo1807.trim();
    }

    public String getDatacheckinfo1703() {
        return datacheckinfo1703;
    }

    public void setDatacheckinfo1703(String datacheckinfo1703) {
        this.datacheckinfo1703 = datacheckinfo1703 == null ? null : datacheckinfo1703.trim();
    }

    public String getDatacheckinfo1706() {
        return datacheckinfo1706;
    }

    public void setDatacheckinfo1706(String datacheckinfo1706) {
        this.datacheckinfo1706 = datacheckinfo1706 == null ? null : datacheckinfo1706.trim();
    }

    public String getDatacheckinfo17Sbn() {
        return datacheckinfo17Sbn;
    }

    public void setDatacheckinfo17Sbn(String datacheckinfo17Sbn) {
        this.datacheckinfo17Sbn = datacheckinfo17Sbn == null ? null : datacheckinfo17Sbn.trim();
    }

    public String getDatacheckinfo1812() {
        return datacheckinfo1812;
    }

    public void setDatacheckinfo1812(String datacheckinfo1812) {
        this.datacheckinfo1812 = datacheckinfo1812 == null ? null : datacheckinfo1812.trim();
    }
}