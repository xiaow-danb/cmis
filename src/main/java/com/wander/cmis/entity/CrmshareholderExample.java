package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmshareholderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmshareholderExample() {
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

        public Criteria andCreatebyIsNull() {
            addCriterion("CREATEBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("CREATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(String value) {
            addCriterion("CREATEBY =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(String value) {
            addCriterion("CREATEBY <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(String value) {
            addCriterion("CREATEBY >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEBY >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(String value) {
            addCriterion("CREATEBY <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(String value) {
            addCriterion("CREATEBY <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLike(String value) {
            addCriterion("CREATEBY like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotLike(String value) {
            addCriterion("CREATEBY not like", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<String> values) {
            addCriterion("CREATEBY in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<String> values) {
            addCriterion("CREATEBY not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(String value1, String value2) {
            addCriterion("CREATEBY between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(String value1, String value2) {
            addCriterion("CREATEBY not between", value1, value2, "createby");
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

        public Criteria andDeletetimeIsNull() {
            addCriterion("DELETETIME is null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNotNull() {
            addCriterion("DELETETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeEqualTo(Date value) {
            addCriterion("DELETETIME =", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotEqualTo(Date value) {
            addCriterion("DELETETIME <>", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThan(Date value) {
            addCriterion("DELETETIME >", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELETETIME >=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThan(Date value) {
            addCriterion("DELETETIME <", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThanOrEqualTo(Date value) {
            addCriterion("DELETETIME <=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIn(List<Date> values) {
            addCriterion("DELETETIME in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotIn(List<Date> values) {
            addCriterion("DELETETIME not in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeBetween(Date value1, Date value2) {
            addCriterion("DELETETIME between", value1, value2, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotBetween(Date value1, Date value2) {
            addCriterion("DELETETIME not between", value1, value2, "deletetime");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("ISDELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("ISDELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(Short value) {
            addCriterion("ISDELETED =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(Short value) {
            addCriterion("ISDELETED <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(Short value) {
            addCriterion("ISDELETED >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("ISDELETED >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(Short value) {
            addCriterion("ISDELETED <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(Short value) {
            addCriterion("ISDELETED <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<Short> values) {
            addCriterion("ISDELETED in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<Short> values) {
            addCriterion("ISDELETED not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(Short value1, Short value2) {
            addCriterion("ISDELETED between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(Short value1, Short value2) {
            addCriterion("ISDELETED not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("UPDATEBY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("UPDATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(String value) {
            addCriterion("UPDATEBY =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(String value) {
            addCriterion("UPDATEBY <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(String value) {
            addCriterion("UPDATEBY >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEBY >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(String value) {
            addCriterion("UPDATEBY <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(String value) {
            addCriterion("UPDATEBY <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLike(String value) {
            addCriterion("UPDATEBY like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotLike(String value) {
            addCriterion("UPDATEBY not like", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<String> values) {
            addCriterion("UPDATEBY in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<String> values) {
            addCriterion("UPDATEBY not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(String value1, String value2) {
            addCriterion("UPDATEBY between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(String value1, String value2) {
            addCriterion("UPDATEBY not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Long value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Long value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Long value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Long value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Long value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Long value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Long> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Long> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Long value1, Long value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Long value1, Long value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andClientidIsNull() {
            addCriterion("CLIENTID is null");
            return (Criteria) this;
        }

        public Criteria andClientidIsNotNull() {
            addCriterion("CLIENTID is not null");
            return (Criteria) this;
        }

        public Criteria andClientidEqualTo(String value) {
            addCriterion("CLIENTID =", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotEqualTo(String value) {
            addCriterion("CLIENTID <>", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThan(String value) {
            addCriterion("CLIENTID >", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTID >=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThan(String value) {
            addCriterion("CLIENTID <", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLessThanOrEqualTo(String value) {
            addCriterion("CLIENTID <=", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidLike(String value) {
            addCriterion("CLIENTID like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotLike(String value) {
            addCriterion("CLIENTID not like", value, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidIn(List<String> values) {
            addCriterion("CLIENTID in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotIn(List<String> values) {
            addCriterion("CLIENTID not in", values, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidBetween(String value1, String value2) {
            addCriterion("CLIENTID between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andClientidNotBetween(String value1, String value2) {
            addCriterion("CLIENTID not between", value1, value2, "clientid");
            return (Criteria) this;
        }

        public Criteria andCredentialIsNull() {
            addCriterion("CREDENTIAL is null");
            return (Criteria) this;
        }

        public Criteria andCredentialIsNotNull() {
            addCriterion("CREDENTIAL is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialEqualTo(String value) {
            addCriterion("CREDENTIAL =", value, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialNotEqualTo(String value) {
            addCriterion("CREDENTIAL <>", value, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialGreaterThan(String value) {
            addCriterion("CREDENTIAL >", value, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialGreaterThanOrEqualTo(String value) {
            addCriterion("CREDENTIAL >=", value, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialLessThan(String value) {
            addCriterion("CREDENTIAL <", value, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialLessThanOrEqualTo(String value) {
            addCriterion("CREDENTIAL <=", value, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialLike(String value) {
            addCriterion("CREDENTIAL like", value, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialNotLike(String value) {
            addCriterion("CREDENTIAL not like", value, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialIn(List<String> values) {
            addCriterion("CREDENTIAL in", values, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialNotIn(List<String> values) {
            addCriterion("CREDENTIAL not in", values, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialBetween(String value1, String value2) {
            addCriterion("CREDENTIAL between", value1, value2, "credential");
            return (Criteria) this;
        }

        public Criteria andCredentialNotBetween(String value1, String value2) {
            addCriterion("CREDENTIAL not between", value1, value2, "credential");
            return (Criteria) this;
        }

        public Criteria andInvestwayIsNull() {
            addCriterion("INVESTWAY is null");
            return (Criteria) this;
        }

        public Criteria andInvestwayIsNotNull() {
            addCriterion("INVESTWAY is not null");
            return (Criteria) this;
        }

        public Criteria andInvestwayEqualTo(String value) {
            addCriterion("INVESTWAY =", value, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayNotEqualTo(String value) {
            addCriterion("INVESTWAY <>", value, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayGreaterThan(String value) {
            addCriterion("INVESTWAY >", value, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTWAY >=", value, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayLessThan(String value) {
            addCriterion("INVESTWAY <", value, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayLessThanOrEqualTo(String value) {
            addCriterion("INVESTWAY <=", value, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayLike(String value) {
            addCriterion("INVESTWAY like", value, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayNotLike(String value) {
            addCriterion("INVESTWAY not like", value, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayIn(List<String> values) {
            addCriterion("INVESTWAY in", values, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayNotIn(List<String> values) {
            addCriterion("INVESTWAY not in", values, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayBetween(String value1, String value2) {
            addCriterion("INVESTWAY between", value1, value2, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestwayNotBetween(String value1, String value2) {
            addCriterion("INVESTWAY not between", value1, value2, "investway");
            return (Criteria) this;
        }

        public Criteria andInvestmentIsNull() {
            addCriterion("INVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentIsNotNull() {
            addCriterion("INVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentEqualTo(BigDecimal value) {
            addCriterion("INVESTMENT =", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotEqualTo(BigDecimal value) {
            addCriterion("INVESTMENT <>", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentGreaterThan(BigDecimal value) {
            addCriterion("INVESTMENT >", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTMENT >=", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLessThan(BigDecimal value) {
            addCriterion("INVESTMENT <", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTMENT <=", value, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentIn(List<BigDecimal> values) {
            addCriterion("INVESTMENT in", values, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotIn(List<BigDecimal> values) {
            addCriterion("INVESTMENT not in", values, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTMENT between", value1, value2, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTMENT not between", value1, value2, "investment");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNull() {
            addCriterion("INVESTOR is null");
            return (Criteria) this;
        }

        public Criteria andInvestorIsNotNull() {
            addCriterion("INVESTOR is not null");
            return (Criteria) this;
        }

        public Criteria andInvestorEqualTo(String value) {
            addCriterion("INVESTOR =", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotEqualTo(String value) {
            addCriterion("INVESTOR <>", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThan(String value) {
            addCriterion("INVESTOR >", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTOR >=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThan(String value) {
            addCriterion("INVESTOR <", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLessThanOrEqualTo(String value) {
            addCriterion("INVESTOR <=", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorLike(String value) {
            addCriterion("INVESTOR like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotLike(String value) {
            addCriterion("INVESTOR not like", value, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorIn(List<String> values) {
            addCriterion("INVESTOR in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotIn(List<String> values) {
            addCriterion("INVESTOR not in", values, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorBetween(String value1, String value2) {
            addCriterion("INVESTOR between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andInvestorNotBetween(String value1, String value2) {
            addCriterion("INVESTOR not between", value1, value2, "investor");
            return (Criteria) this;
        }

        public Criteria andProportionIsNull() {
            addCriterion("PROPORTION is null");
            return (Criteria) this;
        }

        public Criteria andProportionIsNotNull() {
            addCriterion("PROPORTION is not null");
            return (Criteria) this;
        }

        public Criteria andProportionEqualTo(BigDecimal value) {
            addCriterion("PROPORTION =", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotEqualTo(BigDecimal value) {
            addCriterion("PROPORTION <>", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThan(BigDecimal value) {
            addCriterion("PROPORTION >", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPORTION >=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThan(BigDecimal value) {
            addCriterion("PROPORTION <", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROPORTION <=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionIn(List<BigDecimal> values) {
            addCriterion("PROPORTION in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotIn(List<BigDecimal> values) {
            addCriterion("PROPORTION not in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPORTION between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROPORTION not between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTemorningamountIsNull() {
            addCriterion("TEMORNINGAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTemorningamountIsNotNull() {
            addCriterion("TEMORNINGAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTemorningamountEqualTo(BigDecimal value) {
            addCriterion("TEMORNINGAMOUNT =", value, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountNotEqualTo(BigDecimal value) {
            addCriterion("TEMORNINGAMOUNT <>", value, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountGreaterThan(BigDecimal value) {
            addCriterion("TEMORNINGAMOUNT >", value, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMORNINGAMOUNT >=", value, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountLessThan(BigDecimal value) {
            addCriterion("TEMORNINGAMOUNT <", value, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMORNINGAMOUNT <=", value, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountIn(List<BigDecimal> values) {
            addCriterion("TEMORNINGAMOUNT in", values, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountNotIn(List<BigDecimal> values) {
            addCriterion("TEMORNINGAMOUNT not in", values, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMORNINGAMOUNT between", value1, value2, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andTemorningamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMORNINGAMOUNT not between", value1, value2, "temorningamount");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdIsNull() {
            addCriterion("ATTCHMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdIsNotNull() {
            addCriterion("ATTCHMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdEqualTo(String value) {
            addCriterion("ATTCHMENT_ID =", value, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdNotEqualTo(String value) {
            addCriterion("ATTCHMENT_ID <>", value, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdGreaterThan(String value) {
            addCriterion("ATTCHMENT_ID >", value, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("ATTCHMENT_ID >=", value, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdLessThan(String value) {
            addCriterion("ATTCHMENT_ID <", value, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdLessThanOrEqualTo(String value) {
            addCriterion("ATTCHMENT_ID <=", value, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdLike(String value) {
            addCriterion("ATTCHMENT_ID like", value, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdNotLike(String value) {
            addCriterion("ATTCHMENT_ID not like", value, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdIn(List<String> values) {
            addCriterion("ATTCHMENT_ID in", values, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdNotIn(List<String> values) {
            addCriterion("ATTCHMENT_ID not in", values, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdBetween(String value1, String value2) {
            addCriterion("ATTCHMENT_ID between", value1, value2, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andAttchmentIdNotBetween(String value1, String value2) {
            addCriterion("ATTCHMENT_ID not between", value1, value2, "attchmentId");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipIsNull() {
            addCriterion("SHAREHOLDERSRELATIONSHIP is null");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipIsNotNull() {
            addCriterion("SHAREHOLDERSRELATIONSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipEqualTo(String value) {
            addCriterion("SHAREHOLDERSRELATIONSHIP =", value, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipNotEqualTo(String value) {
            addCriterion("SHAREHOLDERSRELATIONSHIP <>", value, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipGreaterThan(String value) {
            addCriterion("SHAREHOLDERSRELATIONSHIP >", value, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDERSRELATIONSHIP >=", value, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipLessThan(String value) {
            addCriterion("SHAREHOLDERSRELATIONSHIP <", value, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipLessThanOrEqualTo(String value) {
            addCriterion("SHAREHOLDERSRELATIONSHIP <=", value, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipLike(String value) {
            addCriterion("SHAREHOLDERSRELATIONSHIP like", value, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipNotLike(String value) {
            addCriterion("SHAREHOLDERSRELATIONSHIP not like", value, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipIn(List<String> values) {
            addCriterion("SHAREHOLDERSRELATIONSHIP in", values, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipNotIn(List<String> values) {
            addCriterion("SHAREHOLDERSRELATIONSHIP not in", values, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipBetween(String value1, String value2) {
            addCriterion("SHAREHOLDERSRELATIONSHIP between", value1, value2, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andShareholdersrelationshipNotBetween(String value1, String value2) {
            addCriterion("SHAREHOLDERSRELATIONSHIP not between", value1, value2, "shareholdersrelationship");
            return (Criteria) this;
        }

        public Criteria andContractwayIsNull() {
            addCriterion("CONTRACTWAY is null");
            return (Criteria) this;
        }

        public Criteria andContractwayIsNotNull() {
            addCriterion("CONTRACTWAY is not null");
            return (Criteria) this;
        }

        public Criteria andContractwayEqualTo(String value) {
            addCriterion("CONTRACTWAY =", value, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayNotEqualTo(String value) {
            addCriterion("CONTRACTWAY <>", value, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayGreaterThan(String value) {
            addCriterion("CONTRACTWAY >", value, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTWAY >=", value, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayLessThan(String value) {
            addCriterion("CONTRACTWAY <", value, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTWAY <=", value, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayLike(String value) {
            addCriterion("CONTRACTWAY like", value, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayNotLike(String value) {
            addCriterion("CONTRACTWAY not like", value, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayIn(List<String> values) {
            addCriterion("CONTRACTWAY in", values, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayNotIn(List<String> values) {
            addCriterion("CONTRACTWAY not in", values, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayBetween(String value1, String value2) {
            addCriterion("CONTRACTWAY between", value1, value2, "contractway");
            return (Criteria) this;
        }

        public Criteria andContractwayNotBetween(String value1, String value2) {
            addCriterion("CONTRACTWAY not between", value1, value2, "contractway");
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