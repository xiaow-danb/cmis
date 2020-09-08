package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExhangeProjectLoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExhangeProjectLoanExample() {
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

        public Criteria andJyidIsNull() {
            addCriterion("JYID is null");
            return (Criteria) this;
        }

        public Criteria andJyidIsNotNull() {
            addCriterion("JYID is not null");
            return (Criteria) this;
        }

        public Criteria andJyidEqualTo(String value) {
            addCriterion("JYID =", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotEqualTo(String value) {
            addCriterion("JYID <>", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThan(String value) {
            addCriterion("JYID >", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThanOrEqualTo(String value) {
            addCriterion("JYID >=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThan(String value) {
            addCriterion("JYID <", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThanOrEqualTo(String value) {
            addCriterion("JYID <=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLike(String value) {
            addCriterion("JYID like", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotLike(String value) {
            addCriterion("JYID not like", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidIn(List<String> values) {
            addCriterion("JYID in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotIn(List<String> values) {
            addCriterion("JYID not in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidBetween(String value1, String value2) {
            addCriterion("JYID between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotBetween(String value1, String value2) {
            addCriterion("JYID not between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andFeerateIsNull() {
            addCriterion("FEERATE is null");
            return (Criteria) this;
        }

        public Criteria andFeerateIsNotNull() {
            addCriterion("FEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeerateEqualTo(BigDecimal value) {
            addCriterion("FEERATE =", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateNotEqualTo(BigDecimal value) {
            addCriterion("FEERATE <>", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateGreaterThan(BigDecimal value) {
            addCriterion("FEERATE >", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEERATE >=", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateLessThan(BigDecimal value) {
            addCriterion("FEERATE <", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEERATE <=", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateIn(List<BigDecimal> values) {
            addCriterion("FEERATE in", values, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateNotIn(List<BigDecimal> values) {
            addCriterion("FEERATE not in", values, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEERATE between", value1, value2, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEERATE not between", value1, value2, "feerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeIsNull() {
            addCriterion("GUARANTEEFEE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeIsNotNull() {
            addCriterion("GUARANTEEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEFEE =", value, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeNotEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEFEE <>", value, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeGreaterThan(BigDecimal value) {
            addCriterion("GUARANTEEFEE >", value, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEFEE >=", value, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeLessThan(BigDecimal value) {
            addCriterion("GUARANTEEFEE <", value, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEFEE <=", value, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeIn(List<BigDecimal> values) {
            addCriterion("GUARANTEEFEE in", values, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeNotIn(List<BigDecimal> values) {
            addCriterion("GUARANTEEFEE not in", values, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEEFEE between", value1, value2, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEEFEE not between", value1, value2, "guaranteefee");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNull() {
            addCriterion("LOANRATE is null");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNotNull() {
            addCriterion("LOANRATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanrateEqualTo(BigDecimal value) {
            addCriterion("LOANRATE =", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotEqualTo(BigDecimal value) {
            addCriterion("LOANRATE <>", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThan(BigDecimal value) {
            addCriterion("LOANRATE >", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANRATE >=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThan(BigDecimal value) {
            addCriterion("LOANRATE <", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANRATE <=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIn(List<BigDecimal> values) {
            addCriterion("LOANRATE in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotIn(List<BigDecimal> values) {
            addCriterion("LOANRATE not in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANRATE between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANRATE not between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoandateIsNull() {
            addCriterion("LOANDATE is null");
            return (Criteria) this;
        }

        public Criteria andLoandateIsNotNull() {
            addCriterion("LOANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoandateEqualTo(String value) {
            addCriterion("LOANDATE =", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotEqualTo(String value) {
            addCriterion("LOANDATE <>", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThan(String value) {
            addCriterion("LOANDATE >", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThanOrEqualTo(String value) {
            addCriterion("LOANDATE >=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThan(String value) {
            addCriterion("LOANDATE <", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThanOrEqualTo(String value) {
            addCriterion("LOANDATE <=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLike(String value) {
            addCriterion("LOANDATE like", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotLike(String value) {
            addCriterion("LOANDATE not like", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateIn(List<String> values) {
            addCriterion("LOANDATE in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotIn(List<String> values) {
            addCriterion("LOANDATE not in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateBetween(String value1, String value2) {
            addCriterion("LOANDATE between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotBetween(String value1, String value2) {
            addCriterion("LOANDATE not between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmIsNull() {
            addCriterion("LOANORGANIZATIONNM is null");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmIsNotNull() {
            addCriterion("LOANORGANIZATIONNM is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmEqualTo(String value) {
            addCriterion("LOANORGANIZATIONNM =", value, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmNotEqualTo(String value) {
            addCriterion("LOANORGANIZATIONNM <>", value, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmGreaterThan(String value) {
            addCriterion("LOANORGANIZATIONNM >", value, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmGreaterThanOrEqualTo(String value) {
            addCriterion("LOANORGANIZATIONNM >=", value, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmLessThan(String value) {
            addCriterion("LOANORGANIZATIONNM <", value, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmLessThanOrEqualTo(String value) {
            addCriterion("LOANORGANIZATIONNM <=", value, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmLike(String value) {
            addCriterion("LOANORGANIZATIONNM like", value, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmNotLike(String value) {
            addCriterion("LOANORGANIZATIONNM not like", value, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmIn(List<String> values) {
            addCriterion("LOANORGANIZATIONNM in", values, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmNotIn(List<String> values) {
            addCriterion("LOANORGANIZATIONNM not in", values, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmBetween(String value1, String value2) {
            addCriterion("LOANORGANIZATIONNM between", value1, value2, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationnmNotBetween(String value1, String value2) {
            addCriterion("LOANORGANIZATIONNM not between", value1, value2, "loanorganizationnm");
            return (Criteria) this;
        }

        public Criteria andReadtag1IsNull() {
            addCriterion("READTAG1 is null");
            return (Criteria) this;
        }

        public Criteria andReadtag1IsNotNull() {
            addCriterion("READTAG1 is not null");
            return (Criteria) this;
        }

        public Criteria andReadtag1EqualTo(Short value) {
            addCriterion("READTAG1 =", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1NotEqualTo(Short value) {
            addCriterion("READTAG1 <>", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1GreaterThan(Short value) {
            addCriterion("READTAG1 >", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1GreaterThanOrEqualTo(Short value) {
            addCriterion("READTAG1 >=", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1LessThan(Short value) {
            addCriterion("READTAG1 <", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1LessThanOrEqualTo(Short value) {
            addCriterion("READTAG1 <=", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1In(List<Short> values) {
            addCriterion("READTAG1 in", values, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1NotIn(List<Short> values) {
            addCriterion("READTAG1 not in", values, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1Between(Short value1, Short value2) {
            addCriterion("READTAG1 between", value1, value2, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1NotBetween(Short value1, Short value2) {
            addCriterion("READTAG1 not between", value1, value2, "readtag1");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("LOANAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("LOANAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(BigDecimal value) {
            addCriterion("LOANAMOUNT =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(BigDecimal value) {
            addCriterion("LOANAMOUNT <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(BigDecimal value) {
            addCriterion("LOANAMOUNT >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANAMOUNT >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(BigDecimal value) {
            addCriterion("LOANAMOUNT <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANAMOUNT <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<BigDecimal> values) {
            addCriterion("LOANAMOUNT in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<BigDecimal> values) {
            addCriterion("LOANAMOUNT not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANAMOUNT between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANAMOUNT not between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNull() {
            addCriterion("ISDISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIsNotNull() {
            addCriterion("ISDISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiscountEqualTo(String value) {
            addCriterion("ISDISCOUNT =", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotEqualTo(String value) {
            addCriterion("ISDISCOUNT <>", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThan(String value) {
            addCriterion("ISDISCOUNT >", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountGreaterThanOrEqualTo(String value) {
            addCriterion("ISDISCOUNT >=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThan(String value) {
            addCriterion("ISDISCOUNT <", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLessThanOrEqualTo(String value) {
            addCriterion("ISDISCOUNT <=", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountLike(String value) {
            addCriterion("ISDISCOUNT like", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotLike(String value) {
            addCriterion("ISDISCOUNT not like", value, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountIn(List<String> values) {
            addCriterion("ISDISCOUNT in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotIn(List<String> values) {
            addCriterion("ISDISCOUNT not in", values, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountBetween(String value1, String value2) {
            addCriterion("ISDISCOUNT between", value1, value2, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andIsdiscountNotBetween(String value1, String value2) {
            addCriterion("ISDISCOUNT not between", value1, value2, "isdiscount");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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