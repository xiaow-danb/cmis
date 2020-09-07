package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchangeGuarantorinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeGuarantorinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidIsNull() {
            addCriterion("LOANAPPLYID is null");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidIsNotNull() {
            addCriterion("LOANAPPLYID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidEqualTo(String value) {
            addCriterion("LOANAPPLYID =", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidNotEqualTo(String value) {
            addCriterion("LOANAPPLYID <>", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidGreaterThan(String value) {
            addCriterion("LOANAPPLYID >", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("LOANAPPLYID >=", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidLessThan(String value) {
            addCriterion("LOANAPPLYID <", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidLessThanOrEqualTo(String value) {
            addCriterion("LOANAPPLYID <=", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidLike(String value) {
            addCriterion("LOANAPPLYID like", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidNotLike(String value) {
            addCriterion("LOANAPPLYID not like", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidIn(List<String> values) {
            addCriterion("LOANAPPLYID in", values, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidNotIn(List<String> values) {
            addCriterion("LOANAPPLYID not in", values, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidBetween(String value1, String value2) {
            addCriterion("LOANAPPLYID between", value1, value2, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidNotBetween(String value1, String value2) {
            addCriterion("LOANAPPLYID not between", value1, value2, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andGuarantorIsNull() {
            addCriterion("GUARANTOR is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorIsNotNull() {
            addCriterion("GUARANTOR is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorEqualTo(String value) {
            addCriterion("GUARANTOR =", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotEqualTo(String value) {
            addCriterion("GUARANTOR <>", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorGreaterThan(String value) {
            addCriterion("GUARANTOR >", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTOR >=", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLessThan(String value) {
            addCriterion("GUARANTOR <", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLessThanOrEqualTo(String value) {
            addCriterion("GUARANTOR <=", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLike(String value) {
            addCriterion("GUARANTOR like", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotLike(String value) {
            addCriterion("GUARANTOR not like", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorIn(List<String> values) {
            addCriterion("GUARANTOR in", values, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotIn(List<String> values) {
            addCriterion("GUARANTOR not in", values, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorBetween(String value1, String value2) {
            addCriterion("GUARANTOR between", value1, value2, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotBetween(String value1, String value2) {
            addCriterion("GUARANTOR not between", value1, value2, "guarantor");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("IDNO is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("IDNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("IDNO =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("IDNO <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("IDNO >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("IDNO >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("IDNO <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("IDNO <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("IDNO like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("IDNO not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("IDNO in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("IDNO not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("IDNO between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("IDNO not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeIsNull() {
            addCriterion("WORKUNITTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeIsNotNull() {
            addCriterion("WORKUNITTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeEqualTo(String value) {
            addCriterion("WORKUNITTYPE =", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeNotEqualTo(String value) {
            addCriterion("WORKUNITTYPE <>", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeGreaterThan(String value) {
            addCriterion("WORKUNITTYPE >", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKUNITTYPE >=", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeLessThan(String value) {
            addCriterion("WORKUNITTYPE <", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeLessThanOrEqualTo(String value) {
            addCriterion("WORKUNITTYPE <=", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeLike(String value) {
            addCriterion("WORKUNITTYPE like", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeNotLike(String value) {
            addCriterion("WORKUNITTYPE not like", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeIn(List<String> values) {
            addCriterion("WORKUNITTYPE in", values, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeNotIn(List<String> values) {
            addCriterion("WORKUNITTYPE not in", values, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeBetween(String value1, String value2) {
            addCriterion("WORKUNITTYPE between", value1, value2, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeNotBetween(String value1, String value2) {
            addCriterion("WORKUNITTYPE not between", value1, value2, "workunittype");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitIsNull() {
            addCriterion("GUARANTORWORKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitIsNotNull() {
            addCriterion("GUARANTORWORKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitEqualTo(String value) {
            addCriterion("GUARANTORWORKUNIT =", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitNotEqualTo(String value) {
            addCriterion("GUARANTORWORKUNIT <>", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitGreaterThan(String value) {
            addCriterion("GUARANTORWORKUNIT >", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORWORKUNIT >=", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitLessThan(String value) {
            addCriterion("GUARANTORWORKUNIT <", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORWORKUNIT <=", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitLike(String value) {
            addCriterion("GUARANTORWORKUNIT like", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitNotLike(String value) {
            addCriterion("GUARANTORWORKUNIT not like", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitIn(List<String> values) {
            addCriterion("GUARANTORWORKUNIT in", values, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitNotIn(List<String> values) {
            addCriterion("GUARANTORWORKUNIT not in", values, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitBetween(String value1, String value2) {
            addCriterion("GUARANTORWORKUNIT between", value1, value2, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitNotBetween(String value1, String value2) {
            addCriterion("GUARANTORWORKUNIT not between", value1, value2, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("DUTY is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("DUTY =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("DUTY <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("DUTY >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("DUTY <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("DUTY <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("DUTY like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("DUTY not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("DUTY in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("DUTY not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("DUTY between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("DUTY not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneIsNull() {
            addCriterion("GUARANTORUNITPHONE is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneIsNotNull() {
            addCriterion("GUARANTORUNITPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneEqualTo(String value) {
            addCriterion("GUARANTORUNITPHONE =", value, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneNotEqualTo(String value) {
            addCriterion("GUARANTORUNITPHONE <>", value, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneGreaterThan(String value) {
            addCriterion("GUARANTORUNITPHONE >", value, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORUNITPHONE >=", value, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneLessThan(String value) {
            addCriterion("GUARANTORUNITPHONE <", value, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORUNITPHONE <=", value, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneLike(String value) {
            addCriterion("GUARANTORUNITPHONE like", value, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneNotLike(String value) {
            addCriterion("GUARANTORUNITPHONE not like", value, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneIn(List<String> values) {
            addCriterion("GUARANTORUNITPHONE in", values, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneNotIn(List<String> values) {
            addCriterion("GUARANTORUNITPHONE not in", values, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneBetween(String value1, String value2) {
            addCriterion("GUARANTORUNITPHONE between", value1, value2, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorunitphoneNotBetween(String value1, String value2) {
            addCriterion("GUARANTORUNITPHONE not between", value1, value2, "guarantorunitphone");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(BigDecimal value) {
            addCriterion("DEPOSIT >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(BigDecimal value) {
            addCriterion("DEPOSIT <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIsNull() {
            addCriterion("MONTHLYINCOME is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIsNotNull() {
            addCriterion("MONTHLYINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeEqualTo(BigDecimal value) {
            addCriterion("MONTHLYINCOME =", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotEqualTo(BigDecimal value) {
            addCriterion("MONTHLYINCOME <>", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeGreaterThan(BigDecimal value) {
            addCriterion("MONTHLYINCOME >", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHLYINCOME >=", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeLessThan(BigDecimal value) {
            addCriterion("MONTHLYINCOME <", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHLYINCOME <=", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIn(List<BigDecimal> values) {
            addCriterion("MONTHLYINCOME in", values, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotIn(List<BigDecimal> values) {
            addCriterion("MONTHLYINCOME not in", values, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHLYINCOME between", value1, value2, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHLYINCOME not between", value1, value2, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andContactwayIsNull() {
            addCriterion("CONTACTWAY is null");
            return (Criteria) this;
        }

        public Criteria andContactwayIsNotNull() {
            addCriterion("CONTACTWAY is not null");
            return (Criteria) this;
        }

        public Criteria andContactwayEqualTo(String value) {
            addCriterion("CONTACTWAY =", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayNotEqualTo(String value) {
            addCriterion("CONTACTWAY <>", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayGreaterThan(String value) {
            addCriterion("CONTACTWAY >", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTWAY >=", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayLessThan(String value) {
            addCriterion("CONTACTWAY <", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayLessThanOrEqualTo(String value) {
            addCriterion("CONTACTWAY <=", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayLike(String value) {
            addCriterion("CONTACTWAY like", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayNotLike(String value) {
            addCriterion("CONTACTWAY not like", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayIn(List<String> values) {
            addCriterion("CONTACTWAY in", values, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayNotIn(List<String> values) {
            addCriterion("CONTACTWAY not in", values, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayBetween(String value1, String value2) {
            addCriterion("CONTACTWAY between", value1, value2, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayNotBetween(String value1, String value2) {
            addCriterion("CONTACTWAY not between", value1, value2, "contactway");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeIsNull() {
            addCriterion("GUARANTORTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeIsNotNull() {
            addCriterion("GUARANTORTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeEqualTo(String value) {
            addCriterion("GUARANTORTYPE =", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeNotEqualTo(String value) {
            addCriterion("GUARANTORTYPE <>", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeGreaterThan(String value) {
            addCriterion("GUARANTORTYPE >", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORTYPE >=", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeLessThan(String value) {
            addCriterion("GUARANTORTYPE <", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORTYPE <=", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeLike(String value) {
            addCriterion("GUARANTORTYPE like", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeNotLike(String value) {
            addCriterion("GUARANTORTYPE not like", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeIn(List<String> values) {
            addCriterion("GUARANTORTYPE in", values, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeNotIn(List<String> values) {
            addCriterion("GUARANTORTYPE not in", values, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeBetween(String value1, String value2) {
            addCriterion("GUARANTORTYPE between", value1, value2, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeNotBetween(String value1, String value2) {
            addCriterion("GUARANTORTYPE not between", value1, value2, "guarantortype");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}