package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectloanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectloanExample() {
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

        public Criteria andLoantypeIsNull() {
            addCriterion("LOANTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLoantypeIsNotNull() {
            addCriterion("LOANTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLoantypeEqualTo(Long value) {
            addCriterion("LOANTYPE =", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotEqualTo(Long value) {
            addCriterion("LOANTYPE <>", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeGreaterThan(Long value) {
            addCriterion("LOANTYPE >", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeGreaterThanOrEqualTo(Long value) {
            addCriterion("LOANTYPE >=", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLessThan(Long value) {
            addCriterion("LOANTYPE <", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLessThanOrEqualTo(Long value) {
            addCriterion("LOANTYPE <=", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeIn(List<Long> values) {
            addCriterion("LOANTYPE in", values, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotIn(List<Long> values) {
            addCriterion("LOANTYPE not in", values, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeBetween(Long value1, Long value2) {
            addCriterion("LOANTYPE between", value1, value2, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotBetween(Long value1, Long value2) {
            addCriterion("LOANTYPE not between", value1, value2, "loantype");
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

        public Criteria andOpertimeIsNull() {
            addCriterion("OPERTIME is null");
            return (Criteria) this;
        }

        public Criteria andOpertimeIsNotNull() {
            addCriterion("OPERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpertimeEqualTo(BigDecimal value) {
            addCriterion("OPERTIME =", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotEqualTo(BigDecimal value) {
            addCriterion("OPERTIME <>", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThan(BigDecimal value) {
            addCriterion("OPERTIME >", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERTIME >=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThan(BigDecimal value) {
            addCriterion("OPERTIME <", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERTIME <=", value, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeIn(List<BigDecimal> values) {
            addCriterion("OPERTIME in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotIn(List<BigDecimal> values) {
            addCriterion("OPERTIME not in", values, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERTIME between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andOpertimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERTIME not between", value1, value2, "opertime");
            return (Criteria) this;
        }

        public Criteria andApprstateIsNull() {
            addCriterion("APPRSTATE is null");
            return (Criteria) this;
        }

        public Criteria andApprstateIsNotNull() {
            addCriterion("APPRSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andApprstateEqualTo(String value) {
            addCriterion("APPRSTATE =", value, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateNotEqualTo(String value) {
            addCriterion("APPRSTATE <>", value, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateGreaterThan(String value) {
            addCriterion("APPRSTATE >", value, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateGreaterThanOrEqualTo(String value) {
            addCriterion("APPRSTATE >=", value, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateLessThan(String value) {
            addCriterion("APPRSTATE <", value, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateLessThanOrEqualTo(String value) {
            addCriterion("APPRSTATE <=", value, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateLike(String value) {
            addCriterion("APPRSTATE like", value, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateNotLike(String value) {
            addCriterion("APPRSTATE not like", value, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateIn(List<String> values) {
            addCriterion("APPRSTATE in", values, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateNotIn(List<String> values) {
            addCriterion("APPRSTATE not in", values, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateBetween(String value1, String value2) {
            addCriterion("APPRSTATE between", value1, value2, "apprstate");
            return (Criteria) this;
        }

        public Criteria andApprstateNotBetween(String value1, String value2) {
            addCriterion("APPRSTATE not between", value1, value2, "apprstate");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIsNull() {
            addCriterion("PROCESSINSTANCEID is null");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIsNotNull() {
            addCriterion("PROCESSINSTANCEID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidEqualTo(String value) {
            addCriterion("PROCESSINSTANCEID =", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotEqualTo(String value) {
            addCriterion("PROCESSINSTANCEID <>", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidGreaterThan(String value) {
            addCriterion("PROCESSINSTANCEID >", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSINSTANCEID >=", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLessThan(String value) {
            addCriterion("PROCESSINSTANCEID <", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLessThanOrEqualTo(String value) {
            addCriterion("PROCESSINSTANCEID <=", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidLike(String value) {
            addCriterion("PROCESSINSTANCEID like", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotLike(String value) {
            addCriterion("PROCESSINSTANCEID not like", value, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidIn(List<String> values) {
            addCriterion("PROCESSINSTANCEID in", values, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotIn(List<String> values) {
            addCriterion("PROCESSINSTANCEID not in", values, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidBetween(String value1, String value2) {
            addCriterion("PROCESSINSTANCEID between", value1, value2, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andProcessinstanceidNotBetween(String value1, String value2) {
            addCriterion("PROCESSINSTANCEID not between", value1, value2, "processinstanceid");
            return (Criteria) this;
        }

        public Criteria andSigncontentIsNull() {
            addCriterion("SIGNCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSigncontentIsNotNull() {
            addCriterion("SIGNCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSigncontentEqualTo(String value) {
            addCriterion("SIGNCONTENT =", value, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentNotEqualTo(String value) {
            addCriterion("SIGNCONTENT <>", value, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentGreaterThan(String value) {
            addCriterion("SIGNCONTENT >", value, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNCONTENT >=", value, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentLessThan(String value) {
            addCriterion("SIGNCONTENT <", value, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentLessThanOrEqualTo(String value) {
            addCriterion("SIGNCONTENT <=", value, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentLike(String value) {
            addCriterion("SIGNCONTENT like", value, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentNotLike(String value) {
            addCriterion("SIGNCONTENT not like", value, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentIn(List<String> values) {
            addCriterion("SIGNCONTENT in", values, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentNotIn(List<String> values) {
            addCriterion("SIGNCONTENT not in", values, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentBetween(String value1, String value2) {
            addCriterion("SIGNCONTENT between", value1, value2, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSigncontentNotBetween(String value1, String value2) {
            addCriterion("SIGNCONTENT not between", value1, value2, "signcontent");
            return (Criteria) this;
        }

        public Criteria andSignopinionIsNull() {
            addCriterion("SIGNOPINION is null");
            return (Criteria) this;
        }

        public Criteria andSignopinionIsNotNull() {
            addCriterion("SIGNOPINION is not null");
            return (Criteria) this;
        }

        public Criteria andSignopinionEqualTo(String value) {
            addCriterion("SIGNOPINION =", value, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionNotEqualTo(String value) {
            addCriterion("SIGNOPINION <>", value, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionGreaterThan(String value) {
            addCriterion("SIGNOPINION >", value, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNOPINION >=", value, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionLessThan(String value) {
            addCriterion("SIGNOPINION <", value, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionLessThanOrEqualTo(String value) {
            addCriterion("SIGNOPINION <=", value, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionLike(String value) {
            addCriterion("SIGNOPINION like", value, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionNotLike(String value) {
            addCriterion("SIGNOPINION not like", value, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionIn(List<String> values) {
            addCriterion("SIGNOPINION in", values, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionNotIn(List<String> values) {
            addCriterion("SIGNOPINION not in", values, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionBetween(String value1, String value2) {
            addCriterion("SIGNOPINION between", value1, value2, "signopinion");
            return (Criteria) this;
        }

        public Criteria andSignopinionNotBetween(String value1, String value2) {
            addCriterion("SIGNOPINION not between", value1, value2, "signopinion");
            return (Criteria) this;
        }

        public Criteria andAccountenddateIsNull() {
            addCriterion("ACCOUNTENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andAccountenddateIsNotNull() {
            addCriterion("ACCOUNTENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountenddateEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTENDDATE =", value, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTENDDATE <>", value, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTENDDATE >", value, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTENDDATE >=", value, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateLessThan(BigDecimal value) {
            addCriterion("ACCOUNTENDDATE <", value, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTENDDATE <=", value, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTENDDATE in", values, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTENDDATE not in", values, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTENDDATE between", value1, value2, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andAccountenddateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTENDDATE not between", value1, value2, "accountenddate");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNull() {
            addCriterion("APPLYDATE is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("APPLYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(BigDecimal value) {
            addCriterion("APPLYDATE =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(BigDecimal value) {
            addCriterion("APPLYDATE <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(BigDecimal value) {
            addCriterion("APPLYDATE >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYDATE >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(BigDecimal value) {
            addCriterion("APPLYDATE <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYDATE <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<BigDecimal> values) {
            addCriterion("APPLYDATE in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<BigDecimal> values) {
            addCriterion("APPLYDATE not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYDATE between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYDATE not between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNull() {
            addCriterion("APPLYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andApplystatusIsNotNull() {
            addCriterion("APPLYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andApplystatusEqualTo(String value) {
            addCriterion("APPLYSTATUS =", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotEqualTo(String value) {
            addCriterion("APPLYSTATUS <>", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThan(String value) {
            addCriterion("APPLYSTATUS >", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYSTATUS >=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThan(String value) {
            addCriterion("APPLYSTATUS <", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLessThanOrEqualTo(String value) {
            addCriterion("APPLYSTATUS <=", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusLike(String value) {
            addCriterion("APPLYSTATUS like", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotLike(String value) {
            addCriterion("APPLYSTATUS not like", value, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusIn(List<String> values) {
            addCriterion("APPLYSTATUS in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotIn(List<String> values) {
            addCriterion("APPLYSTATUS not in", values, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusBetween(String value1, String value2) {
            addCriterion("APPLYSTATUS between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplystatusNotBetween(String value1, String value2) {
            addCriterion("APPLYSTATUS not between", value1, value2, "applystatus");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountIsNull() {
            addCriterion("APPLYUSEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountIsNotNull() {
            addCriterion("APPLYUSEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountEqualTo(BigDecimal value) {
            addCriterion("APPLYUSEAMOUNT =", value, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountNotEqualTo(BigDecimal value) {
            addCriterion("APPLYUSEAMOUNT <>", value, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountGreaterThan(BigDecimal value) {
            addCriterion("APPLYUSEAMOUNT >", value, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYUSEAMOUNT >=", value, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountLessThan(BigDecimal value) {
            addCriterion("APPLYUSEAMOUNT <", value, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYUSEAMOUNT <=", value, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountIn(List<BigDecimal> values) {
            addCriterion("APPLYUSEAMOUNT in", values, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountNotIn(List<BigDecimal> values) {
            addCriterion("APPLYUSEAMOUNT not in", values, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYUSEAMOUNT between", value1, value2, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andApplyuseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYUSEAMOUNT not between", value1, value2, "applyuseamount");
            return (Criteria) this;
        }

        public Criteria andBeginloandateIsNull() {
            addCriterion("BEGINLOANDATE is null");
            return (Criteria) this;
        }

        public Criteria andBeginloandateIsNotNull() {
            addCriterion("BEGINLOANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeginloandateEqualTo(BigDecimal value) {
            addCriterion("BEGINLOANDATE =", value, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateNotEqualTo(BigDecimal value) {
            addCriterion("BEGINLOANDATE <>", value, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateGreaterThan(BigDecimal value) {
            addCriterion("BEGINLOANDATE >", value, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEGINLOANDATE >=", value, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateLessThan(BigDecimal value) {
            addCriterion("BEGINLOANDATE <", value, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEGINLOANDATE <=", value, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateIn(List<BigDecimal> values) {
            addCriterion("BEGINLOANDATE in", values, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateNotIn(List<BigDecimal> values) {
            addCriterion("BEGINLOANDATE not in", values, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEGINLOANDATE between", value1, value2, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginloandateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEGINLOANDATE not between", value1, value2, "beginloandate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateIsNull() {
            addCriterion("BEGINREPAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateIsNotNull() {
            addCriterion("BEGINREPAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateEqualTo(BigDecimal value) {
            addCriterion("BEGINREPAYDATE =", value, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateNotEqualTo(BigDecimal value) {
            addCriterion("BEGINREPAYDATE <>", value, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateGreaterThan(BigDecimal value) {
            addCriterion("BEGINREPAYDATE >", value, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BEGINREPAYDATE >=", value, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateLessThan(BigDecimal value) {
            addCriterion("BEGINREPAYDATE <", value, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BEGINREPAYDATE <=", value, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateIn(List<BigDecimal> values) {
            addCriterion("BEGINREPAYDATE in", values, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateNotIn(List<BigDecimal> values) {
            addCriterion("BEGINREPAYDATE not in", values, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEGINREPAYDATE between", value1, value2, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBeginrepaydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BEGINREPAYDATE not between", value1, value2, "beginrepaydate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateIsNull() {
            addCriterion("BREACHFINERATE is null");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateIsNotNull() {
            addCriterion("BREACHFINERATE is not null");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateEqualTo(Double value) {
            addCriterion("BREACHFINERATE =", value, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateNotEqualTo(Double value) {
            addCriterion("BREACHFINERATE <>", value, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateGreaterThan(Double value) {
            addCriterion("BREACHFINERATE >", value, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateGreaterThanOrEqualTo(Double value) {
            addCriterion("BREACHFINERATE >=", value, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateLessThan(Double value) {
            addCriterion("BREACHFINERATE <", value, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateLessThanOrEqualTo(Double value) {
            addCriterion("BREACHFINERATE <=", value, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateIn(List<Double> values) {
            addCriterion("BREACHFINERATE in", values, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateNotIn(List<Double> values) {
            addCriterion("BREACHFINERATE not in", values, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateBetween(Double value1, Double value2) {
            addCriterion("BREACHFINERATE between", value1, value2, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andBreachfinerateNotBetween(Double value1, Double value2) {
            addCriterion("BREACHFINERATE not between", value1, value2, "breachfinerate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateIsNull() {
            addCriterion("COMPFREEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCompfreedateIsNotNull() {
            addCriterion("COMPFREEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCompfreedateEqualTo(BigDecimal value) {
            addCriterion("COMPFREEDATE =", value, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateNotEqualTo(BigDecimal value) {
            addCriterion("COMPFREEDATE <>", value, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateGreaterThan(BigDecimal value) {
            addCriterion("COMPFREEDATE >", value, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPFREEDATE >=", value, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateLessThan(BigDecimal value) {
            addCriterion("COMPFREEDATE <", value, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPFREEDATE <=", value, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateIn(List<BigDecimal> values) {
            addCriterion("COMPFREEDATE in", values, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateNotIn(List<BigDecimal> values) {
            addCriterion("COMPFREEDATE not in", values, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPFREEDATE between", value1, value2, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andCompfreedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPFREEDATE not between", value1, value2, "compfreedate");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeIsNull() {
            addCriterion("CONSULTATIONFEE is null");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeIsNotNull() {
            addCriterion("CONSULTATIONFEE is not null");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeEqualTo(BigDecimal value) {
            addCriterion("CONSULTATIONFEE =", value, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeNotEqualTo(BigDecimal value) {
            addCriterion("CONSULTATIONFEE <>", value, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeGreaterThan(BigDecimal value) {
            addCriterion("CONSULTATIONFEE >", value, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONSULTATIONFEE >=", value, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeLessThan(BigDecimal value) {
            addCriterion("CONSULTATIONFEE <", value, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONSULTATIONFEE <=", value, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeIn(List<BigDecimal> values) {
            addCriterion("CONSULTATIONFEE in", values, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeNotIn(List<BigDecimal> values) {
            addCriterion("CONSULTATIONFEE not in", values, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONSULTATIONFEE between", value1, value2, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andConsultationfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONSULTATIONFEE not between", value1, value2, "consultationfee");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineIsNull() {
            addCriterion("CURRENTDEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineIsNotNull() {
            addCriterion("CURRENTDEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineEqualTo(Long value) {
            addCriterion("CURRENTDEADLINE =", value, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineNotEqualTo(Long value) {
            addCriterion("CURRENTDEADLINE <>", value, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineGreaterThan(Long value) {
            addCriterion("CURRENTDEADLINE >", value, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENTDEADLINE >=", value, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineLessThan(Long value) {
            addCriterion("CURRENTDEADLINE <", value, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineLessThanOrEqualTo(Long value) {
            addCriterion("CURRENTDEADLINE <=", value, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineIn(List<Long> values) {
            addCriterion("CURRENTDEADLINE in", values, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineNotIn(List<Long> values) {
            addCriterion("CURRENTDEADLINE not in", values, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineBetween(Long value1, Long value2) {
            addCriterion("CURRENTDEADLINE between", value1, value2, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineNotBetween(Long value1, Long value2) {
            addCriterion("CURRENTDEADLINE not between", value1, value2, "currentdeadline");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitIsNull() {
            addCriterion("CURRENTDEADLINEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitIsNotNull() {
            addCriterion("CURRENTDEADLINEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitEqualTo(String value) {
            addCriterion("CURRENTDEADLINEUNIT =", value, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitNotEqualTo(String value) {
            addCriterion("CURRENTDEADLINEUNIT <>", value, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitGreaterThan(String value) {
            addCriterion("CURRENTDEADLINEUNIT >", value, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTDEADLINEUNIT >=", value, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitLessThan(String value) {
            addCriterion("CURRENTDEADLINEUNIT <", value, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitLessThanOrEqualTo(String value) {
            addCriterion("CURRENTDEADLINEUNIT <=", value, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitLike(String value) {
            addCriterion("CURRENTDEADLINEUNIT like", value, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitNotLike(String value) {
            addCriterion("CURRENTDEADLINEUNIT not like", value, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitIn(List<String> values) {
            addCriterion("CURRENTDEADLINEUNIT in", values, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitNotIn(List<String> values) {
            addCriterion("CURRENTDEADLINEUNIT not in", values, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitBetween(String value1, String value2) {
            addCriterion("CURRENTDEADLINEUNIT between", value1, value2, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andCurrentdeadlineunitNotBetween(String value1, String value2) {
            addCriterion("CURRENTDEADLINEUNIT not between", value1, value2, "currentdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andEndloandateIsNull() {
            addCriterion("ENDLOANDATE is null");
            return (Criteria) this;
        }

        public Criteria andEndloandateIsNotNull() {
            addCriterion("ENDLOANDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndloandateEqualTo(BigDecimal value) {
            addCriterion("ENDLOANDATE =", value, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateNotEqualTo(BigDecimal value) {
            addCriterion("ENDLOANDATE <>", value, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateGreaterThan(BigDecimal value) {
            addCriterion("ENDLOANDATE >", value, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENDLOANDATE >=", value, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateLessThan(BigDecimal value) {
            addCriterion("ENDLOANDATE <", value, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENDLOANDATE <=", value, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateIn(List<BigDecimal> values) {
            addCriterion("ENDLOANDATE in", values, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateNotIn(List<BigDecimal> values) {
            addCriterion("ENDLOANDATE not in", values, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENDLOANDATE between", value1, value2, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndloandateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENDLOANDATE not between", value1, value2, "endloandate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateIsNull() {
            addCriterion("ENDREPAYDATE is null");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateIsNotNull() {
            addCriterion("ENDREPAYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateEqualTo(BigDecimal value) {
            addCriterion("ENDREPAYDATE =", value, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateNotEqualTo(BigDecimal value) {
            addCriterion("ENDREPAYDATE <>", value, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateGreaterThan(BigDecimal value) {
            addCriterion("ENDREPAYDATE >", value, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENDREPAYDATE >=", value, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateLessThan(BigDecimal value) {
            addCriterion("ENDREPAYDATE <", value, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENDREPAYDATE <=", value, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateIn(List<BigDecimal> values) {
            addCriterion("ENDREPAYDATE in", values, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateNotIn(List<BigDecimal> values) {
            addCriterion("ENDREPAYDATE not in", values, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENDREPAYDATE between", value1, value2, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andEndrepaydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENDREPAYDATE not between", value1, value2, "endrepaydate");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameIsNull() {
            addCriterion("EXPENSEACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameIsNotNull() {
            addCriterion("EXPENSEACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameEqualTo(String value) {
            addCriterion("EXPENSEACCOUNTNAME =", value, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameNotEqualTo(String value) {
            addCriterion("EXPENSEACCOUNTNAME <>", value, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameGreaterThan(String value) {
            addCriterion("EXPENSEACCOUNTNAME >", value, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("EXPENSEACCOUNTNAME >=", value, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameLessThan(String value) {
            addCriterion("EXPENSEACCOUNTNAME <", value, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameLessThanOrEqualTo(String value) {
            addCriterion("EXPENSEACCOUNTNAME <=", value, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameLike(String value) {
            addCriterion("EXPENSEACCOUNTNAME like", value, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameNotLike(String value) {
            addCriterion("EXPENSEACCOUNTNAME not like", value, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameIn(List<String> values) {
            addCriterion("EXPENSEACCOUNTNAME in", values, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameNotIn(List<String> values) {
            addCriterion("EXPENSEACCOUNTNAME not in", values, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameBetween(String value1, String value2) {
            addCriterion("EXPENSEACCOUNTNAME between", value1, value2, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseaccountnameNotBetween(String value1, String value2) {
            addCriterion("EXPENSEACCOUNTNAME not between", value1, value2, "expenseaccountname");
            return (Criteria) this;
        }

        public Criteria andExpenseamountIsNull() {
            addCriterion("EXPENSEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExpenseamountIsNotNull() {
            addCriterion("EXPENSEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseamountEqualTo(BigDecimal value) {
            addCriterion("EXPENSEAMOUNT =", value, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountNotEqualTo(BigDecimal value) {
            addCriterion("EXPENSEAMOUNT <>", value, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountGreaterThan(BigDecimal value) {
            addCriterion("EXPENSEAMOUNT >", value, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPENSEAMOUNT >=", value, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountLessThan(BigDecimal value) {
            addCriterion("EXPENSEAMOUNT <", value, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPENSEAMOUNT <=", value, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountIn(List<BigDecimal> values) {
            addCriterion("EXPENSEAMOUNT in", values, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountNotIn(List<BigDecimal> values) {
            addCriterion("EXPENSEAMOUNT not in", values, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPENSEAMOUNT between", value1, value2, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpenseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPENSEAMOUNT not between", value1, value2, "expenseamount");
            return (Criteria) this;
        }

        public Criteria andExpensebankIsNull() {
            addCriterion("EXPENSEBANK is null");
            return (Criteria) this;
        }

        public Criteria andExpensebankIsNotNull() {
            addCriterion("EXPENSEBANK is not null");
            return (Criteria) this;
        }

        public Criteria andExpensebankEqualTo(String value) {
            addCriterion("EXPENSEBANK =", value, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankNotEqualTo(String value) {
            addCriterion("EXPENSEBANK <>", value, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankGreaterThan(String value) {
            addCriterion("EXPENSEBANK >", value, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankGreaterThanOrEqualTo(String value) {
            addCriterion("EXPENSEBANK >=", value, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankLessThan(String value) {
            addCriterion("EXPENSEBANK <", value, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankLessThanOrEqualTo(String value) {
            addCriterion("EXPENSEBANK <=", value, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankLike(String value) {
            addCriterion("EXPENSEBANK like", value, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankNotLike(String value) {
            addCriterion("EXPENSEBANK not like", value, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankIn(List<String> values) {
            addCriterion("EXPENSEBANK in", values, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankNotIn(List<String> values) {
            addCriterion("EXPENSEBANK not in", values, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankBetween(String value1, String value2) {
            addCriterion("EXPENSEBANK between", value1, value2, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankNotBetween(String value1, String value2) {
            addCriterion("EXPENSEBANK not between", value1, value2, "expensebank");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountIsNull() {
            addCriterion("EXPENSEBANKACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountIsNotNull() {
            addCriterion("EXPENSEBANKACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountEqualTo(String value) {
            addCriterion("EXPENSEBANKACCOUNT =", value, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountNotEqualTo(String value) {
            addCriterion("EXPENSEBANKACCOUNT <>", value, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountGreaterThan(String value) {
            addCriterion("EXPENSEBANKACCOUNT >", value, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountGreaterThanOrEqualTo(String value) {
            addCriterion("EXPENSEBANKACCOUNT >=", value, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountLessThan(String value) {
            addCriterion("EXPENSEBANKACCOUNT <", value, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountLessThanOrEqualTo(String value) {
            addCriterion("EXPENSEBANKACCOUNT <=", value, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountLike(String value) {
            addCriterion("EXPENSEBANKACCOUNT like", value, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountNotLike(String value) {
            addCriterion("EXPENSEBANKACCOUNT not like", value, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountIn(List<String> values) {
            addCriterion("EXPENSEBANKACCOUNT in", values, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountNotIn(List<String> values) {
            addCriterion("EXPENSEBANKACCOUNT not in", values, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountBetween(String value1, String value2) {
            addCriterion("EXPENSEBANKACCOUNT between", value1, value2, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensebankaccountNotBetween(String value1, String value2) {
            addCriterion("EXPENSEBANKACCOUNT not between", value1, value2, "expensebankaccount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountIsNull() {
            addCriterion("EXPENSEFACTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountIsNotNull() {
            addCriterion("EXPENSEFACTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountEqualTo(BigDecimal value) {
            addCriterion("EXPENSEFACTAMOUNT =", value, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountNotEqualTo(BigDecimal value) {
            addCriterion("EXPENSEFACTAMOUNT <>", value, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountGreaterThan(BigDecimal value) {
            addCriterion("EXPENSEFACTAMOUNT >", value, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPENSEFACTAMOUNT >=", value, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountLessThan(BigDecimal value) {
            addCriterion("EXPENSEFACTAMOUNT <", value, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPENSEFACTAMOUNT <=", value, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountIn(List<BigDecimal> values) {
            addCriterion("EXPENSEFACTAMOUNT in", values, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountNotIn(List<BigDecimal> values) {
            addCriterion("EXPENSEFACTAMOUNT not in", values, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPENSEFACTAMOUNT between", value1, value2, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpensefactamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPENSEFACTAMOUNT not between", value1, value2, "expensefactamount");
            return (Criteria) this;
        }

        public Criteria andExpenseradioIsNull() {
            addCriterion("EXPENSERADIO is null");
            return (Criteria) this;
        }

        public Criteria andExpenseradioIsNotNull() {
            addCriterion("EXPENSERADIO is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseradioEqualTo(Double value) {
            addCriterion("EXPENSERADIO =", value, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioNotEqualTo(Double value) {
            addCriterion("EXPENSERADIO <>", value, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioGreaterThan(Double value) {
            addCriterion("EXPENSERADIO >", value, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioGreaterThanOrEqualTo(Double value) {
            addCriterion("EXPENSERADIO >=", value, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioLessThan(Double value) {
            addCriterion("EXPENSERADIO <", value, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioLessThanOrEqualTo(Double value) {
            addCriterion("EXPENSERADIO <=", value, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioIn(List<Double> values) {
            addCriterion("EXPENSERADIO in", values, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioNotIn(List<Double> values) {
            addCriterion("EXPENSERADIO not in", values, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioBetween(Double value1, Double value2) {
            addCriterion("EXPENSERADIO between", value1, value2, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andExpenseradioNotBetween(Double value1, Double value2) {
            addCriterion("EXPENSERADIO not between", value1, value2, "expenseradio");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherIsNull() {
            addCriterion("FEEINCOMEOTHER is null");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherIsNotNull() {
            addCriterion("FEEINCOMEOTHER is not null");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherEqualTo(BigDecimal value) {
            addCriterion("FEEINCOMEOTHER =", value, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherNotEqualTo(BigDecimal value) {
            addCriterion("FEEINCOMEOTHER <>", value, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherGreaterThan(BigDecimal value) {
            addCriterion("FEEINCOMEOTHER >", value, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEINCOMEOTHER >=", value, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherLessThan(BigDecimal value) {
            addCriterion("FEEINCOMEOTHER <", value, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEINCOMEOTHER <=", value, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherIn(List<BigDecimal> values) {
            addCriterion("FEEINCOMEOTHER in", values, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherNotIn(List<BigDecimal> values) {
            addCriterion("FEEINCOMEOTHER not in", values, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEINCOMEOTHER between", value1, value2, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeincomeotherNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEINCOMEOTHER not between", value1, value2, "feeincomeother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherIsNull() {
            addCriterion("FEEPAYOTHER is null");
            return (Criteria) this;
        }

        public Criteria andFeepayotherIsNotNull() {
            addCriterion("FEEPAYOTHER is not null");
            return (Criteria) this;
        }

        public Criteria andFeepayotherEqualTo(BigDecimal value) {
            addCriterion("FEEPAYOTHER =", value, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherNotEqualTo(BigDecimal value) {
            addCriterion("FEEPAYOTHER <>", value, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherGreaterThan(BigDecimal value) {
            addCriterion("FEEPAYOTHER >", value, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEPAYOTHER >=", value, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherLessThan(BigDecimal value) {
            addCriterion("FEEPAYOTHER <", value, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEPAYOTHER <=", value, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherIn(List<BigDecimal> values) {
            addCriterion("FEEPAYOTHER in", values, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherNotIn(List<BigDecimal> values) {
            addCriterion("FEEPAYOTHER not in", values, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEPAYOTHER between", value1, value2, "feepayother");
            return (Criteria) this;
        }

        public Criteria andFeepayotherNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEPAYOTHER not between", value1, value2, "feepayother");
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

        public Criteria andFeerateEqualTo(Double value) {
            addCriterion("FEERATE =", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateNotEqualTo(Double value) {
            addCriterion("FEERATE <>", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateGreaterThan(Double value) {
            addCriterion("FEERATE >", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateGreaterThanOrEqualTo(Double value) {
            addCriterion("FEERATE >=", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateLessThan(Double value) {
            addCriterion("FEERATE <", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateLessThanOrEqualTo(Double value) {
            addCriterion("FEERATE <=", value, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateIn(List<Double> values) {
            addCriterion("FEERATE in", values, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateNotIn(List<Double> values) {
            addCriterion("FEERATE not in", values, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateBetween(Double value1, Double value2) {
            addCriterion("FEERATE between", value1, value2, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateNotBetween(Double value1, Double value2) {
            addCriterion("FEERATE not between", value1, value2, "feerate");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherIsNull() {
            addCriterion("FEERATEINCOMEOTHER is null");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherIsNotNull() {
            addCriterion("FEERATEINCOMEOTHER is not null");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherEqualTo(Double value) {
            addCriterion("FEERATEINCOMEOTHER =", value, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherNotEqualTo(Double value) {
            addCriterion("FEERATEINCOMEOTHER <>", value, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherGreaterThan(Double value) {
            addCriterion("FEERATEINCOMEOTHER >", value, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherGreaterThanOrEqualTo(Double value) {
            addCriterion("FEERATEINCOMEOTHER >=", value, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherLessThan(Double value) {
            addCriterion("FEERATEINCOMEOTHER <", value, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherLessThanOrEqualTo(Double value) {
            addCriterion("FEERATEINCOMEOTHER <=", value, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherIn(List<Double> values) {
            addCriterion("FEERATEINCOMEOTHER in", values, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherNotIn(List<Double> values) {
            addCriterion("FEERATEINCOMEOTHER not in", values, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherBetween(Double value1, Double value2) {
            addCriterion("FEERATEINCOMEOTHER between", value1, value2, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeerateincomeotherNotBetween(Double value1, Double value2) {
            addCriterion("FEERATEINCOMEOTHER not between", value1, value2, "feerateincomeother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherIsNull() {
            addCriterion("FEERATEPAYOTHER is null");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherIsNotNull() {
            addCriterion("FEERATEPAYOTHER is not null");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherEqualTo(Double value) {
            addCriterion("FEERATEPAYOTHER =", value, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherNotEqualTo(Double value) {
            addCriterion("FEERATEPAYOTHER <>", value, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherGreaterThan(Double value) {
            addCriterion("FEERATEPAYOTHER >", value, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherGreaterThanOrEqualTo(Double value) {
            addCriterion("FEERATEPAYOTHER >=", value, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherLessThan(Double value) {
            addCriterion("FEERATEPAYOTHER <", value, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherLessThanOrEqualTo(Double value) {
            addCriterion("FEERATEPAYOTHER <=", value, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherIn(List<Double> values) {
            addCriterion("FEERATEPAYOTHER in", values, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherNotIn(List<Double> values) {
            addCriterion("FEERATEPAYOTHER not in", values, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherBetween(Double value1, Double value2) {
            addCriterion("FEERATEPAYOTHER between", value1, value2, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFeeratepayotherNotBetween(Double value1, Double value2) {
            addCriterion("FEERATEPAYOTHER not between", value1, value2, "feeratepayother");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseIsNull() {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE is null");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseIsNotNull() {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseEqualTo(String value) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE =", value, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseNotEqualTo(String value) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE <>", value, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseGreaterThan(String value) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE >", value, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE >=", value, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseLessThan(String value) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE <", value, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseLessThanOrEqualTo(String value) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE <=", value, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseLike(String value) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE like", value, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseNotLike(String value) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE not like", value, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseIn(List<String> values) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE in", values, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseNotIn(List<String> values) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE not in", values, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseBetween(String value1, String value2) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE between", value1, value2, "financeconfirmpledgeexpense");
            return (Criteria) this;
        }

        public Criteria andFinanceconfirmpledgeexpenseNotBetween(String value1, String value2) {
            addCriterion("FINANCECONFIRMPLEDGEEXPENSE not between", value1, value2, "financeconfirmpledgeexpense");
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

        public Criteria andInbankIsNull() {
            addCriterion("INBANK is null");
            return (Criteria) this;
        }

        public Criteria andInbankIsNotNull() {
            addCriterion("INBANK is not null");
            return (Criteria) this;
        }

        public Criteria andInbankEqualTo(String value) {
            addCriterion("INBANK =", value, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankNotEqualTo(String value) {
            addCriterion("INBANK <>", value, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankGreaterThan(String value) {
            addCriterion("INBANK >", value, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankGreaterThanOrEqualTo(String value) {
            addCriterion("INBANK >=", value, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankLessThan(String value) {
            addCriterion("INBANK <", value, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankLessThanOrEqualTo(String value) {
            addCriterion("INBANK <=", value, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankLike(String value) {
            addCriterion("INBANK like", value, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankNotLike(String value) {
            addCriterion("INBANK not like", value, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankIn(List<String> values) {
            addCriterion("INBANK in", values, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankNotIn(List<String> values) {
            addCriterion("INBANK not in", values, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankBetween(String value1, String value2) {
            addCriterion("INBANK between", value1, value2, "inbank");
            return (Criteria) this;
        }

        public Criteria andInbankNotBetween(String value1, String value2) {
            addCriterion("INBANK not between", value1, value2, "inbank");
            return (Criteria) this;
        }

        public Criteria andIsloanIsNull() {
            addCriterion("ISLOAN is null");
            return (Criteria) this;
        }

        public Criteria andIsloanIsNotNull() {
            addCriterion("ISLOAN is not null");
            return (Criteria) this;
        }

        public Criteria andIsloanEqualTo(Short value) {
            addCriterion("ISLOAN =", value, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanNotEqualTo(Short value) {
            addCriterion("ISLOAN <>", value, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanGreaterThan(Short value) {
            addCriterion("ISLOAN >", value, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanGreaterThanOrEqualTo(Short value) {
            addCriterion("ISLOAN >=", value, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanLessThan(Short value) {
            addCriterion("ISLOAN <", value, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanLessThanOrEqualTo(Short value) {
            addCriterion("ISLOAN <=", value, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanIn(List<Short> values) {
            addCriterion("ISLOAN in", values, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanNotIn(List<Short> values) {
            addCriterion("ISLOAN not in", values, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanBetween(Short value1, Short value2) {
            addCriterion("ISLOAN between", value1, value2, "isloan");
            return (Criteria) this;
        }

        public Criteria andIsloanNotBetween(Short value1, Short value2) {
            addCriterion("ISLOAN not between", value1, value2, "isloan");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoIsNull() {
            addCriterion("LOANCONTRACTNO is null");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoIsNotNull() {
            addCriterion("LOANCONTRACTNO is not null");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoEqualTo(String value) {
            addCriterion("LOANCONTRACTNO =", value, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoNotEqualTo(String value) {
            addCriterion("LOANCONTRACTNO <>", value, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoGreaterThan(String value) {
            addCriterion("LOANCONTRACTNO >", value, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoGreaterThanOrEqualTo(String value) {
            addCriterion("LOANCONTRACTNO >=", value, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoLessThan(String value) {
            addCriterion("LOANCONTRACTNO <", value, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoLessThanOrEqualTo(String value) {
            addCriterion("LOANCONTRACTNO <=", value, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoLike(String value) {
            addCriterion("LOANCONTRACTNO like", value, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoNotLike(String value) {
            addCriterion("LOANCONTRACTNO not like", value, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoIn(List<String> values) {
            addCriterion("LOANCONTRACTNO in", values, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoNotIn(List<String> values) {
            addCriterion("LOANCONTRACTNO not in", values, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoBetween(String value1, String value2) {
            addCriterion("LOANCONTRACTNO between", value1, value2, "loancontractno");
            return (Criteria) this;
        }

        public Criteria andLoancontractnoNotBetween(String value1, String value2) {
            addCriterion("LOANCONTRACTNO not between", value1, value2, "loancontractno");
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

        public Criteria andLoandateEqualTo(BigDecimal value) {
            addCriterion("LOANDATE =", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotEqualTo(BigDecimal value) {
            addCriterion("LOANDATE <>", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThan(BigDecimal value) {
            addCriterion("LOANDATE >", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANDATE >=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThan(BigDecimal value) {
            addCriterion("LOANDATE <", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANDATE <=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateIn(List<BigDecimal> values) {
            addCriterion("LOANDATE in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotIn(List<BigDecimal> values) {
            addCriterion("LOANDATE not in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANDATE between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANDATE not between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateIsNull() {
            addCriterion("LOANNOTIFYDATE is null");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateIsNotNull() {
            addCriterion("LOANNOTIFYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateEqualTo(BigDecimal value) {
            addCriterion("LOANNOTIFYDATE =", value, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateNotEqualTo(BigDecimal value) {
            addCriterion("LOANNOTIFYDATE <>", value, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateGreaterThan(BigDecimal value) {
            addCriterion("LOANNOTIFYDATE >", value, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANNOTIFYDATE >=", value, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateLessThan(BigDecimal value) {
            addCriterion("LOANNOTIFYDATE <", value, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANNOTIFYDATE <=", value, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateIn(List<BigDecimal> values) {
            addCriterion("LOANNOTIFYDATE in", values, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateNotIn(List<BigDecimal> values) {
            addCriterion("LOANNOTIFYDATE not in", values, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANNOTIFYDATE between", value1, value2, "loannotifydate");
            return (Criteria) this;
        }

        public Criteria andLoannotifydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANNOTIFYDATE not between", value1, value2, "loannotifydate");
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

        public Criteria andLoanrateEqualTo(Double value) {
            addCriterion("LOANRATE =", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotEqualTo(Double value) {
            addCriterion("LOANRATE <>", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThan(Double value) {
            addCriterion("LOANRATE >", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThanOrEqualTo(Double value) {
            addCriterion("LOANRATE >=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThan(Double value) {
            addCriterion("LOANRATE <", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThanOrEqualTo(Double value) {
            addCriterion("LOANRATE <=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIn(List<Double> values) {
            addCriterion("LOANRATE in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotIn(List<Double> values) {
            addCriterion("LOANRATE not in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateBetween(Double value1, Double value2) {
            addCriterion("LOANRATE between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotBetween(Double value1, Double value2) {
            addCriterion("LOANRATE not between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateIsNull() {
            addCriterion("LOANUSENOTIFYDATE is null");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateIsNotNull() {
            addCriterion("LOANUSENOTIFYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateEqualTo(BigDecimal value) {
            addCriterion("LOANUSENOTIFYDATE =", value, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateNotEqualTo(BigDecimal value) {
            addCriterion("LOANUSENOTIFYDATE <>", value, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateGreaterThan(BigDecimal value) {
            addCriterion("LOANUSENOTIFYDATE >", value, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANUSENOTIFYDATE >=", value, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateLessThan(BigDecimal value) {
            addCriterion("LOANUSENOTIFYDATE <", value, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANUSENOTIFYDATE <=", value, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateIn(List<BigDecimal> values) {
            addCriterion("LOANUSENOTIFYDATE in", values, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateNotIn(List<BigDecimal> values) {
            addCriterion("LOANUSENOTIFYDATE not in", values, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANUSENOTIFYDATE between", value1, value2, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanusenotifydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANUSENOTIFYDATE not between", value1, value2, "loanusenotifydate");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeIsNull() {
            addCriterion("LOANSCONTCODE is null");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeIsNotNull() {
            addCriterion("LOANSCONTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeEqualTo(String value) {
            addCriterion("LOANSCONTCODE =", value, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeNotEqualTo(String value) {
            addCriterion("LOANSCONTCODE <>", value, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeGreaterThan(String value) {
            addCriterion("LOANSCONTCODE >", value, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeGreaterThanOrEqualTo(String value) {
            addCriterion("LOANSCONTCODE >=", value, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeLessThan(String value) {
            addCriterion("LOANSCONTCODE <", value, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeLessThanOrEqualTo(String value) {
            addCriterion("LOANSCONTCODE <=", value, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeLike(String value) {
            addCriterion("LOANSCONTCODE like", value, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeNotLike(String value) {
            addCriterion("LOANSCONTCODE not like", value, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeIn(List<String> values) {
            addCriterion("LOANSCONTCODE in", values, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeNotIn(List<String> values) {
            addCriterion("LOANSCONTCODE not in", values, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeBetween(String value1, String value2) {
            addCriterion("LOANSCONTCODE between", value1, value2, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andLoanscontcodeNotBetween(String value1, String value2) {
            addCriterion("LOANSCONTCODE not between", value1, value2, "loanscontcode");
            return (Criteria) this;
        }

        public Criteria andManagementfeeIsNull() {
            addCriterion("MANAGEMENTFEE is null");
            return (Criteria) this;
        }

        public Criteria andManagementfeeIsNotNull() {
            addCriterion("MANAGEMENTFEE is not null");
            return (Criteria) this;
        }

        public Criteria andManagementfeeEqualTo(BigDecimal value) {
            addCriterion("MANAGEMENTFEE =", value, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeNotEqualTo(BigDecimal value) {
            addCriterion("MANAGEMENTFEE <>", value, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeGreaterThan(BigDecimal value) {
            addCriterion("MANAGEMENTFEE >", value, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MANAGEMENTFEE >=", value, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeLessThan(BigDecimal value) {
            addCriterion("MANAGEMENTFEE <", value, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MANAGEMENTFEE <=", value, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeIn(List<BigDecimal> values) {
            addCriterion("MANAGEMENTFEE in", values, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeNotIn(List<BigDecimal> values) {
            addCriterion("MANAGEMENTFEE not in", values, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANAGEMENTFEE between", value1, value2, "managementfee");
            return (Criteria) this;
        }

        public Criteria andManagementfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANAGEMENTFEE not between", value1, value2, "managementfee");
            return (Criteria) this;
        }

        public Criteria andMgropinionIsNull() {
            addCriterion("MGROPINION is null");
            return (Criteria) this;
        }

        public Criteria andMgropinionIsNotNull() {
            addCriterion("MGROPINION is not null");
            return (Criteria) this;
        }

        public Criteria andMgropinionEqualTo(String value) {
            addCriterion("MGROPINION =", value, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionNotEqualTo(String value) {
            addCriterion("MGROPINION <>", value, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionGreaterThan(String value) {
            addCriterion("MGROPINION >", value, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionGreaterThanOrEqualTo(String value) {
            addCriterion("MGROPINION >=", value, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionLessThan(String value) {
            addCriterion("MGROPINION <", value, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionLessThanOrEqualTo(String value) {
            addCriterion("MGROPINION <=", value, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionLike(String value) {
            addCriterion("MGROPINION like", value, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionNotLike(String value) {
            addCriterion("MGROPINION not like", value, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionIn(List<String> values) {
            addCriterion("MGROPINION in", values, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionNotIn(List<String> values) {
            addCriterion("MGROPINION not in", values, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionBetween(String value1, String value2) {
            addCriterion("MGROPINION between", value1, value2, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andMgropinionNotBetween(String value1, String value2) {
            addCriterion("MGROPINION not between", value1, value2, "mgropinion");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIsNull() {
            addCriterion("OTHERFEE is null");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIsNotNull() {
            addCriterion("OTHERFEE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherfeeEqualTo(BigDecimal value) {
            addCriterion("OTHERFEE =", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotEqualTo(BigDecimal value) {
            addCriterion("OTHERFEE <>", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeGreaterThan(BigDecimal value) {
            addCriterion("OTHERFEE >", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERFEE >=", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeLessThan(BigDecimal value) {
            addCriterion("OTHERFEE <", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERFEE <=", value, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeIn(List<BigDecimal> values) {
            addCriterion("OTHERFEE in", values, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotIn(List<BigDecimal> values) {
            addCriterion("OTHERFEE not in", values, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERFEE between", value1, value2, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOtherfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERFEE not between", value1, value2, "otherfee");
            return (Criteria) this;
        }

        public Criteria andOutbankIsNull() {
            addCriterion("OUTBANK is null");
            return (Criteria) this;
        }

        public Criteria andOutbankIsNotNull() {
            addCriterion("OUTBANK is not null");
            return (Criteria) this;
        }

        public Criteria andOutbankEqualTo(String value) {
            addCriterion("OUTBANK =", value, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankNotEqualTo(String value) {
            addCriterion("OUTBANK <>", value, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankGreaterThan(String value) {
            addCriterion("OUTBANK >", value, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankGreaterThanOrEqualTo(String value) {
            addCriterion("OUTBANK >=", value, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankLessThan(String value) {
            addCriterion("OUTBANK <", value, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankLessThanOrEqualTo(String value) {
            addCriterion("OUTBANK <=", value, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankLike(String value) {
            addCriterion("OUTBANK like", value, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankNotLike(String value) {
            addCriterion("OUTBANK not like", value, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankIn(List<String> values) {
            addCriterion("OUTBANK in", values, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankNotIn(List<String> values) {
            addCriterion("OUTBANK not in", values, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankBetween(String value1, String value2) {
            addCriterion("OUTBANK between", value1, value2, "outbank");
            return (Criteria) this;
        }

        public Criteria andOutbankNotBetween(String value1, String value2) {
            addCriterion("OUTBANK not between", value1, value2, "outbank");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIsNull() {
            addCriterion("OVERDUEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIsNotNull() {
            addCriterion("OVERDUEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueamountEqualTo(Double value) {
            addCriterion("OVERDUEAMOUNT =", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotEqualTo(Double value) {
            addCriterion("OVERDUEAMOUNT <>", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountGreaterThan(Double value) {
            addCriterion("OVERDUEAMOUNT >", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountGreaterThanOrEqualTo(Double value) {
            addCriterion("OVERDUEAMOUNT >=", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountLessThan(Double value) {
            addCriterion("OVERDUEAMOUNT <", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountLessThanOrEqualTo(Double value) {
            addCriterion("OVERDUEAMOUNT <=", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIn(List<Double> values) {
            addCriterion("OVERDUEAMOUNT in", values, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotIn(List<Double> values) {
            addCriterion("OVERDUEAMOUNT not in", values, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountBetween(Double value1, Double value2) {
            addCriterion("OVERDUEAMOUNT between", value1, value2, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotBetween(Double value1, Double value2) {
            addCriterion("OVERDUEAMOUNT not between", value1, value2, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverduetimesIsNull() {
            addCriterion("OVERDUETIMES is null");
            return (Criteria) this;
        }

        public Criteria andOverduetimesIsNotNull() {
            addCriterion("OVERDUETIMES is not null");
            return (Criteria) this;
        }

        public Criteria andOverduetimesEqualTo(Long value) {
            addCriterion("OVERDUETIMES =", value, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesNotEqualTo(Long value) {
            addCriterion("OVERDUETIMES <>", value, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesGreaterThan(Long value) {
            addCriterion("OVERDUETIMES >", value, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesGreaterThanOrEqualTo(Long value) {
            addCriterion("OVERDUETIMES >=", value, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesLessThan(Long value) {
            addCriterion("OVERDUETIMES <", value, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesLessThanOrEqualTo(Long value) {
            addCriterion("OVERDUETIMES <=", value, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesIn(List<Long> values) {
            addCriterion("OVERDUETIMES in", values, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesNotIn(List<Long> values) {
            addCriterion("OVERDUETIMES not in", values, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesBetween(Long value1, Long value2) {
            addCriterion("OVERDUETIMES between", value1, value2, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andOverduetimesNotBetween(Long value1, Long value2) {
            addCriterion("OVERDUETIMES not between", value1, value2, "overduetimes");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineIsNull() {
            addCriterion("PLEDGEDEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineIsNotNull() {
            addCriterion("PLEDGEDEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineEqualTo(String value) {
            addCriterion("PLEDGEDEADLINE =", value, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineNotEqualTo(String value) {
            addCriterion("PLEDGEDEADLINE <>", value, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineGreaterThan(String value) {
            addCriterion("PLEDGEDEADLINE >", value, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("PLEDGEDEADLINE >=", value, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineLessThan(String value) {
            addCriterion("PLEDGEDEADLINE <", value, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineLessThanOrEqualTo(String value) {
            addCriterion("PLEDGEDEADLINE <=", value, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineLike(String value) {
            addCriterion("PLEDGEDEADLINE like", value, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineNotLike(String value) {
            addCriterion("PLEDGEDEADLINE not like", value, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineIn(List<String> values) {
            addCriterion("PLEDGEDEADLINE in", values, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineNotIn(List<String> values) {
            addCriterion("PLEDGEDEADLINE not in", values, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineBetween(String value1, String value2) {
            addCriterion("PLEDGEDEADLINE between", value1, value2, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineNotBetween(String value1, String value2) {
            addCriterion("PLEDGEDEADLINE not between", value1, value2, "pledgedeadline");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitIsNull() {
            addCriterion("PLEDGEDEADLINEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitIsNotNull() {
            addCriterion("PLEDGEDEADLINEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitEqualTo(String value) {
            addCriterion("PLEDGEDEADLINEUNIT =", value, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitNotEqualTo(String value) {
            addCriterion("PLEDGEDEADLINEUNIT <>", value, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitGreaterThan(String value) {
            addCriterion("PLEDGEDEADLINEUNIT >", value, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitGreaterThanOrEqualTo(String value) {
            addCriterion("PLEDGEDEADLINEUNIT >=", value, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitLessThan(String value) {
            addCriterion("PLEDGEDEADLINEUNIT <", value, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitLessThanOrEqualTo(String value) {
            addCriterion("PLEDGEDEADLINEUNIT <=", value, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitLike(String value) {
            addCriterion("PLEDGEDEADLINEUNIT like", value, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitNotLike(String value) {
            addCriterion("PLEDGEDEADLINEUNIT not like", value, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitIn(List<String> values) {
            addCriterion("PLEDGEDEADLINEUNIT in", values, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitNotIn(List<String> values) {
            addCriterion("PLEDGEDEADLINEUNIT not in", values, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitBetween(String value1, String value2) {
            addCriterion("PLEDGEDEADLINEUNIT between", value1, value2, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgedeadlineunitNotBetween(String value1, String value2) {
            addCriterion("PLEDGEDEADLINEUNIT not between", value1, value2, "pledgedeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyIsNull() {
            addCriterion("PLEDGEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyIsNotNull() {
            addCriterion("PLEDGEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyEqualTo(BigDecimal value) {
            addCriterion("PLEDGEMONEY =", value, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyNotEqualTo(BigDecimal value) {
            addCriterion("PLEDGEMONEY <>", value, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyGreaterThan(BigDecimal value) {
            addCriterion("PLEDGEMONEY >", value, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLEDGEMONEY >=", value, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyLessThan(BigDecimal value) {
            addCriterion("PLEDGEMONEY <", value, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLEDGEMONEY <=", value, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyIn(List<BigDecimal> values) {
            addCriterion("PLEDGEMONEY in", values, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyNotIn(List<BigDecimal> values) {
            addCriterion("PLEDGEMONEY not in", values, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLEDGEMONEY between", value1, value2, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLEDGEMONEY not between", value1, value2, "pledgemoney");
            return (Criteria) this;
        }

        public Criteria andPledgerateIsNull() {
            addCriterion("PLEDGERATE is null");
            return (Criteria) this;
        }

        public Criteria andPledgerateIsNotNull() {
            addCriterion("PLEDGERATE is not null");
            return (Criteria) this;
        }

        public Criteria andPledgerateEqualTo(Double value) {
            addCriterion("PLEDGERATE =", value, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateNotEqualTo(Double value) {
            addCriterion("PLEDGERATE <>", value, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateGreaterThan(Double value) {
            addCriterion("PLEDGERATE >", value, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateGreaterThanOrEqualTo(Double value) {
            addCriterion("PLEDGERATE >=", value, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateLessThan(Double value) {
            addCriterion("PLEDGERATE <", value, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateLessThanOrEqualTo(Double value) {
            addCriterion("PLEDGERATE <=", value, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateIn(List<Double> values) {
            addCriterion("PLEDGERATE in", values, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateNotIn(List<Double> values) {
            addCriterion("PLEDGERATE not in", values, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateBetween(Double value1, Double value2) {
            addCriterion("PLEDGERATE between", value1, value2, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPledgerateNotBetween(Double value1, Double value2) {
            addCriterion("PLEDGERATE not between", value1, value2, "pledgerate");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountIsNull() {
            addCriterion("PRINCIPALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountIsNotNull() {
            addCriterion("PRINCIPALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountEqualTo(Double value) {
            addCriterion("PRINCIPALAMOUNT =", value, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountNotEqualTo(Double value) {
            addCriterion("PRINCIPALAMOUNT <>", value, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountGreaterThan(Double value) {
            addCriterion("PRINCIPALAMOUNT >", value, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountGreaterThanOrEqualTo(Double value) {
            addCriterion("PRINCIPALAMOUNT >=", value, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountLessThan(Double value) {
            addCriterion("PRINCIPALAMOUNT <", value, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountLessThanOrEqualTo(Double value) {
            addCriterion("PRINCIPALAMOUNT <=", value, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountIn(List<Double> values) {
            addCriterion("PRINCIPALAMOUNT in", values, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountNotIn(List<Double> values) {
            addCriterion("PRINCIPALAMOUNT not in", values, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountBetween(Double value1, Double value2) {
            addCriterion("PRINCIPALAMOUNT between", value1, value2, "principalamount");
            return (Criteria) this;
        }

        public Criteria andPrincipalamountNotBetween(Double value1, Double value2) {
            addCriterion("PRINCIPALAMOUNT not between", value1, value2, "principalamount");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeIsNull() {
            addCriterion("PROCEDURESFEE is null");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeIsNotNull() {
            addCriterion("PROCEDURESFEE is not null");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeEqualTo(BigDecimal value) {
            addCriterion("PROCEDURESFEE =", value, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeNotEqualTo(BigDecimal value) {
            addCriterion("PROCEDURESFEE <>", value, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeGreaterThan(BigDecimal value) {
            addCriterion("PROCEDURESFEE >", value, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCEDURESFEE >=", value, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeLessThan(BigDecimal value) {
            addCriterion("PROCEDURESFEE <", value, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCEDURESFEE <=", value, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeIn(List<BigDecimal> values) {
            addCriterion("PROCEDURESFEE in", values, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeNotIn(List<BigDecimal> values) {
            addCriterion("PROCEDURESFEE not in", values, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCEDURESFEE between", value1, value2, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andProceduresfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCEDURESFEE not between", value1, value2, "proceduresfee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeIsNull() {
            addCriterion("PROMISEFEE is null");
            return (Criteria) this;
        }

        public Criteria andPromisefeeIsNotNull() {
            addCriterion("PROMISEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andPromisefeeEqualTo(BigDecimal value) {
            addCriterion("PROMISEFEE =", value, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeNotEqualTo(BigDecimal value) {
            addCriterion("PROMISEFEE <>", value, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeGreaterThan(BigDecimal value) {
            addCriterion("PROMISEFEE >", value, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMISEFEE >=", value, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeLessThan(BigDecimal value) {
            addCriterion("PROMISEFEE <", value, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMISEFEE <=", value, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeIn(List<BigDecimal> values) {
            addCriterion("PROMISEFEE in", values, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeNotIn(List<BigDecimal> values) {
            addCriterion("PROMISEFEE not in", values, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMISEFEE between", value1, value2, "promisefee");
            return (Criteria) this;
        }

        public Criteria andPromisefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMISEFEE not between", value1, value2, "promisefee");
            return (Criteria) this;
        }

        public Criteria andProvidedateIsNull() {
            addCriterion("PROVIDEDATE is null");
            return (Criteria) this;
        }

        public Criteria andProvidedateIsNotNull() {
            addCriterion("PROVIDEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andProvidedateEqualTo(BigDecimal value) {
            addCriterion("PROVIDEDATE =", value, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateNotEqualTo(BigDecimal value) {
            addCriterion("PROVIDEDATE <>", value, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateGreaterThan(BigDecimal value) {
            addCriterion("PROVIDEDATE >", value, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROVIDEDATE >=", value, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateLessThan(BigDecimal value) {
            addCriterion("PROVIDEDATE <", value, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROVIDEDATE <=", value, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateIn(List<BigDecimal> values) {
            addCriterion("PROVIDEDATE in", values, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateNotIn(List<BigDecimal> values) {
            addCriterion("PROVIDEDATE not in", values, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROVIDEDATE between", value1, value2, "providedate");
            return (Criteria) this;
        }

        public Criteria andProvidedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROVIDEDATE not between", value1, value2, "providedate");
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

        public Criteria andRepaymentaccountIsNull() {
            addCriterion("REPAYMENTACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountIsNotNull() {
            addCriterion("REPAYMENTACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountEqualTo(String value) {
            addCriterion("REPAYMENTACCOUNT =", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountNotEqualTo(String value) {
            addCriterion("REPAYMENTACCOUNT <>", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountGreaterThan(String value) {
            addCriterion("REPAYMENTACCOUNT >", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTACCOUNT >=", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountLessThan(String value) {
            addCriterion("REPAYMENTACCOUNT <", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTACCOUNT <=", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountLike(String value) {
            addCriterion("REPAYMENTACCOUNT like", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountNotLike(String value) {
            addCriterion("REPAYMENTACCOUNT not like", value, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountIn(List<String> values) {
            addCriterion("REPAYMENTACCOUNT in", values, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountNotIn(List<String> values) {
            addCriterion("REPAYMENTACCOUNT not in", values, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountBetween(String value1, String value2) {
            addCriterion("REPAYMENTACCOUNT between", value1, value2, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTACCOUNT not between", value1, value2, "repaymentaccount");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoIsNull() {
            addCriterion("REPAYMENTACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoIsNotNull() {
            addCriterion("REPAYMENTACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoEqualTo(String value) {
            addCriterion("REPAYMENTACCOUNTNO =", value, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoNotEqualTo(String value) {
            addCriterion("REPAYMENTACCOUNTNO <>", value, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoGreaterThan(String value) {
            addCriterion("REPAYMENTACCOUNTNO >", value, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTACCOUNTNO >=", value, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoLessThan(String value) {
            addCriterion("REPAYMENTACCOUNTNO <", value, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTACCOUNTNO <=", value, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoLike(String value) {
            addCriterion("REPAYMENTACCOUNTNO like", value, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoNotLike(String value) {
            addCriterion("REPAYMENTACCOUNTNO not like", value, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoIn(List<String> values) {
            addCriterion("REPAYMENTACCOUNTNO in", values, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoNotIn(List<String> values) {
            addCriterion("REPAYMENTACCOUNTNO not in", values, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoBetween(String value1, String value2) {
            addCriterion("REPAYMENTACCOUNTNO between", value1, value2, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentaccountnoNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTACCOUNTNO not between", value1, value2, "repaymentaccountno");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankIsNull() {
            addCriterion("REPAYMENTBANK is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankIsNotNull() {
            addCriterion("REPAYMENTBANK is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankEqualTo(String value) {
            addCriterion("REPAYMENTBANK =", value, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankNotEqualTo(String value) {
            addCriterion("REPAYMENTBANK <>", value, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankGreaterThan(String value) {
            addCriterion("REPAYMENTBANK >", value, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTBANK >=", value, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankLessThan(String value) {
            addCriterion("REPAYMENTBANK <", value, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTBANK <=", value, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankLike(String value) {
            addCriterion("REPAYMENTBANK like", value, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankNotLike(String value) {
            addCriterion("REPAYMENTBANK not like", value, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankIn(List<String> values) {
            addCriterion("REPAYMENTBANK in", values, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankNotIn(List<String> values) {
            addCriterion("REPAYMENTBANK not in", values, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankBetween(String value1, String value2) {
            addCriterion("REPAYMENTBANK between", value1, value2, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentbankNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTBANK not between", value1, value2, "repaymentbank");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateIsNull() {
            addCriterion("REPAYMENTDATE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateIsNotNull() {
            addCriterion("REPAYMENTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTDATE =", value, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateNotEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTDATE <>", value, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateGreaterThan(BigDecimal value) {
            addCriterion("REPAYMENTDATE >", value, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTDATE >=", value, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateLessThan(BigDecimal value) {
            addCriterion("REPAYMENTDATE <", value, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTDATE <=", value, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateIn(List<BigDecimal> values) {
            addCriterion("REPAYMENTDATE in", values, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateNotIn(List<BigDecimal> values) {
            addCriterion("REPAYMENTDATE not in", values, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENTDATE between", value1, value2, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENTDATE not between", value1, value2, "repaymentdate");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeIsNull() {
            addCriterion("REPAYMENTMODE is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeIsNotNull() {
            addCriterion("REPAYMENTMODE is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTMODE =", value, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeNotEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTMODE <>", value, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeGreaterThan(BigDecimal value) {
            addCriterion("REPAYMENTMODE >", value, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTMODE >=", value, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeLessThan(BigDecimal value) {
            addCriterion("REPAYMENTMODE <", value, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTMODE <=", value, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeIn(List<BigDecimal> values) {
            addCriterion("REPAYMENTMODE in", values, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeNotIn(List<BigDecimal> values) {
            addCriterion("REPAYMENTMODE not in", values, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENTMODE between", value1, value2, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andRepaymentmodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENTMODE not between", value1, value2, "repaymentmode");
            return (Criteria) this;
        }

        public Criteria andTeniorIsNull() {
            addCriterion("TENIOR is null");
            return (Criteria) this;
        }

        public Criteria andTeniorIsNotNull() {
            addCriterion("TENIOR is not null");
            return (Criteria) this;
        }

        public Criteria andTeniorEqualTo(Long value) {
            addCriterion("TENIOR =", value, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorNotEqualTo(Long value) {
            addCriterion("TENIOR <>", value, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorGreaterThan(Long value) {
            addCriterion("TENIOR >", value, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorGreaterThanOrEqualTo(Long value) {
            addCriterion("TENIOR >=", value, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorLessThan(Long value) {
            addCriterion("TENIOR <", value, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorLessThanOrEqualTo(Long value) {
            addCriterion("TENIOR <=", value, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorIn(List<Long> values) {
            addCriterion("TENIOR in", values, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorNotIn(List<Long> values) {
            addCriterion("TENIOR not in", values, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorBetween(Long value1, Long value2) {
            addCriterion("TENIOR between", value1, value2, "tenior");
            return (Criteria) this;
        }

        public Criteria andTeniorNotBetween(Long value1, Long value2) {
            addCriterion("TENIOR not between", value1, value2, "tenior");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountIsNull() {
            addCriterion("TOTALCOMPFREEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountIsNotNull() {
            addCriterion("TOTALCOMPFREEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountEqualTo(BigDecimal value) {
            addCriterion("TOTALCOMPFREEAMOUNT =", value, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountNotEqualTo(BigDecimal value) {
            addCriterion("TOTALCOMPFREEAMOUNT <>", value, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountGreaterThan(BigDecimal value) {
            addCriterion("TOTALCOMPFREEAMOUNT >", value, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALCOMPFREEAMOUNT >=", value, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountLessThan(BigDecimal value) {
            addCriterion("TOTALCOMPFREEAMOUNT <", value, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALCOMPFREEAMOUNT <=", value, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountIn(List<BigDecimal> values) {
            addCriterion("TOTALCOMPFREEAMOUNT in", values, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountNotIn(List<BigDecimal> values) {
            addCriterion("TOTALCOMPFREEAMOUNT not in", values, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALCOMPFREEAMOUNT between", value1, value2, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALCOMPFREEAMOUNT not between", value1, value2, "totalcompfreeamount");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestIsNull() {
            addCriterion("TOTALCOMPFREEINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestIsNotNull() {
            addCriterion("TOTALCOMPFREEINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestEqualTo(BigDecimal value) {
            addCriterion("TOTALCOMPFREEINTEREST =", value, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestNotEqualTo(BigDecimal value) {
            addCriterion("TOTALCOMPFREEINTEREST <>", value, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestGreaterThan(BigDecimal value) {
            addCriterion("TOTALCOMPFREEINTEREST >", value, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALCOMPFREEINTEREST >=", value, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestLessThan(BigDecimal value) {
            addCriterion("TOTALCOMPFREEINTEREST <", value, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALCOMPFREEINTEREST <=", value, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestIn(List<BigDecimal> values) {
            addCriterion("TOTALCOMPFREEINTEREST in", values, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestNotIn(List<BigDecimal> values) {
            addCriterion("TOTALCOMPFREEINTEREST not in", values, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALCOMPFREEINTEREST between", value1, value2, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotalcompfreeinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALCOMPFREEINTEREST not between", value1, value2, "totalcompfreeinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountIsNull() {
            addCriterion("TOTALDESTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountIsNotNull() {
            addCriterion("TOTALDESTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountEqualTo(BigDecimal value) {
            addCriterion("TOTALDESTAMOUNT =", value, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountNotEqualTo(BigDecimal value) {
            addCriterion("TOTALDESTAMOUNT <>", value, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountGreaterThan(BigDecimal value) {
            addCriterion("TOTALDESTAMOUNT >", value, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALDESTAMOUNT >=", value, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountLessThan(BigDecimal value) {
            addCriterion("TOTALDESTAMOUNT <", value, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALDESTAMOUNT <=", value, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountIn(List<BigDecimal> values) {
            addCriterion("TOTALDESTAMOUNT in", values, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountNotIn(List<BigDecimal> values) {
            addCriterion("TOTALDESTAMOUNT not in", values, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALDESTAMOUNT between", value1, value2, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldestamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALDESTAMOUNT not between", value1, value2, "totaldestamount");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestIsNull() {
            addCriterion("TOTALDUEINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestIsNotNull() {
            addCriterion("TOTALDUEINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestEqualTo(BigDecimal value) {
            addCriterion("TOTALDUEINTEREST =", value, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestNotEqualTo(BigDecimal value) {
            addCriterion("TOTALDUEINTEREST <>", value, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestGreaterThan(BigDecimal value) {
            addCriterion("TOTALDUEINTEREST >", value, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALDUEINTEREST >=", value, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestLessThan(BigDecimal value) {
            addCriterion("TOTALDUEINTEREST <", value, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALDUEINTEREST <=", value, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestIn(List<BigDecimal> values) {
            addCriterion("TOTALDUEINTEREST in", values, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestNotIn(List<BigDecimal> values) {
            addCriterion("TOTALDUEINTEREST not in", values, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALDUEINTEREST between", value1, value2, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALDUEINTEREST not between", value1, value2, "totaldueinterest");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalIsNull() {
            addCriterion("TOTALDUEPRINCIPAL is null");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalIsNotNull() {
            addCriterion("TOTALDUEPRINCIPAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalEqualTo(BigDecimal value) {
            addCriterion("TOTALDUEPRINCIPAL =", value, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalNotEqualTo(BigDecimal value) {
            addCriterion("TOTALDUEPRINCIPAL <>", value, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalGreaterThan(BigDecimal value) {
            addCriterion("TOTALDUEPRINCIPAL >", value, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALDUEPRINCIPAL >=", value, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalLessThan(BigDecimal value) {
            addCriterion("TOTALDUEPRINCIPAL <", value, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALDUEPRINCIPAL <=", value, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalIn(List<BigDecimal> values) {
            addCriterion("TOTALDUEPRINCIPAL in", values, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalNotIn(List<BigDecimal> values) {
            addCriterion("TOTALDUEPRINCIPAL not in", values, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALDUEPRINCIPAL between", value1, value2, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotaldueprincipalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALDUEPRINCIPAL not between", value1, value2, "totaldueprincipal");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtIsNull() {
            addCriterion("TOTALPAYAMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtIsNotNull() {
            addCriterion("TOTALPAYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtEqualTo(BigDecimal value) {
            addCriterion("TOTALPAYAMT =", value, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtNotEqualTo(BigDecimal value) {
            addCriterion("TOTALPAYAMT <>", value, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtGreaterThan(BigDecimal value) {
            addCriterion("TOTALPAYAMT >", value, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALPAYAMT >=", value, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtLessThan(BigDecimal value) {
            addCriterion("TOTALPAYAMT <", value, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALPAYAMT <=", value, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtIn(List<BigDecimal> values) {
            addCriterion("TOTALPAYAMT in", values, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtNotIn(List<BigDecimal> values) {
            addCriterion("TOTALPAYAMT not in", values, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALPAYAMT between", value1, value2, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalpayamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALPAYAMT not between", value1, value2, "totalpayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtIsNull() {
            addCriterion("TOTALPROVIDEPAYAMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtIsNotNull() {
            addCriterion("TOTALPROVIDEPAYAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtEqualTo(Double value) {
            addCriterion("TOTALPROVIDEPAYAMT =", value, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtNotEqualTo(Double value) {
            addCriterion("TOTALPROVIDEPAYAMT <>", value, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtGreaterThan(Double value) {
            addCriterion("TOTALPROVIDEPAYAMT >", value, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtGreaterThanOrEqualTo(Double value) {
            addCriterion("TOTALPROVIDEPAYAMT >=", value, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtLessThan(Double value) {
            addCriterion("TOTALPROVIDEPAYAMT <", value, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtLessThanOrEqualTo(Double value) {
            addCriterion("TOTALPROVIDEPAYAMT <=", value, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtIn(List<Double> values) {
            addCriterion("TOTALPROVIDEPAYAMT in", values, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtNotIn(List<Double> values) {
            addCriterion("TOTALPROVIDEPAYAMT not in", values, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtBetween(Double value1, Double value2) {
            addCriterion("TOTALPROVIDEPAYAMT between", value1, value2, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andTotalprovidepayamtNotBetween(Double value1, Double value2) {
            addCriterion("TOTALPROVIDEPAYAMT not between", value1, value2, "totalprovidepayamt");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("UPDATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("UPDATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(BigDecimal value) {
            addCriterion("UPDATEDATE =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(BigDecimal value) {
            addCriterion("UPDATEDATE <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(BigDecimal value) {
            addCriterion("UPDATEDATE >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPDATEDATE >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(BigDecimal value) {
            addCriterion("UPDATEDATE <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPDATEDATE <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<BigDecimal> values) {
            addCriterion("UPDATEDATE in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<BigDecimal> values) {
            addCriterion("UPDATEDATE not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPDATEDATE between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPDATEDATE not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionIsNull() {
            addCriterion("USEDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionIsNotNull() {
            addCriterion("USEDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionEqualTo(String value) {
            addCriterion("USEDESCRIPTION =", value, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionNotEqualTo(String value) {
            addCriterion("USEDESCRIPTION <>", value, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionGreaterThan(String value) {
            addCriterion("USEDESCRIPTION >", value, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("USEDESCRIPTION >=", value, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionLessThan(String value) {
            addCriterion("USEDESCRIPTION <", value, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionLessThanOrEqualTo(String value) {
            addCriterion("USEDESCRIPTION <=", value, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionLike(String value) {
            addCriterion("USEDESCRIPTION like", value, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionNotLike(String value) {
            addCriterion("USEDESCRIPTION not like", value, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionIn(List<String> values) {
            addCriterion("USEDESCRIPTION in", values, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionNotIn(List<String> values) {
            addCriterion("USEDESCRIPTION not in", values, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionBetween(String value1, String value2) {
            addCriterion("USEDESCRIPTION between", value1, value2, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsedescriptionNotBetween(String value1, String value2) {
            addCriterion("USEDESCRIPTION not between", value1, value2, "usedescription");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateIsNull() {
            addCriterion("USEMONEYNOTIFYDATE is null");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateIsNotNull() {
            addCriterion("USEMONEYNOTIFYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateEqualTo(BigDecimal value) {
            addCriterion("USEMONEYNOTIFYDATE =", value, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateNotEqualTo(BigDecimal value) {
            addCriterion("USEMONEYNOTIFYDATE <>", value, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateGreaterThan(BigDecimal value) {
            addCriterion("USEMONEYNOTIFYDATE >", value, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEMONEYNOTIFYDATE >=", value, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateLessThan(BigDecimal value) {
            addCriterion("USEMONEYNOTIFYDATE <", value, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEMONEYNOTIFYDATE <=", value, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateIn(List<BigDecimal> values) {
            addCriterion("USEMONEYNOTIFYDATE in", values, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateNotIn(List<BigDecimal> values) {
            addCriterion("USEMONEYNOTIFYDATE not in", values, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEMONEYNOTIFYDATE between", value1, value2, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsemoneynotifydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEMONEYNOTIFYDATE not between", value1, value2, "usemoneynotifydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateIsNull() {
            addCriterion("USEDMONEYDATE is null");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateIsNotNull() {
            addCriterion("USEDMONEYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateEqualTo(BigDecimal value) {
            addCriterion("USEDMONEYDATE =", value, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateNotEqualTo(BigDecimal value) {
            addCriterion("USEDMONEYDATE <>", value, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateGreaterThan(BigDecimal value) {
            addCriterion("USEDMONEYDATE >", value, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDMONEYDATE >=", value, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateLessThan(BigDecimal value) {
            addCriterion("USEDMONEYDATE <", value, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDMONEYDATE <=", value, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateIn(List<BigDecimal> values) {
            addCriterion("USEDMONEYDATE in", values, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateNotIn(List<BigDecimal> values) {
            addCriterion("USEDMONEYDATE not in", values, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDMONEYDATE between", value1, value2, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andUsedmoneydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDMONEYDATE not between", value1, value2, "usedmoneydate");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceIsNull() {
            addCriterion("AVAILABLEBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceIsNotNull() {
            addCriterion("AVAILABLEBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceEqualTo(BigDecimal value) {
            addCriterion("AVAILABLEBALANCE =", value, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLEBALANCE <>", value, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLEBALANCE >", value, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLEBALANCE >=", value, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceLessThan(BigDecimal value) {
            addCriterion("AVAILABLEBALANCE <", value, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLEBALANCE <=", value, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceIn(List<BigDecimal> values) {
            addCriterion("AVAILABLEBALANCE in", values, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLEBALANCE not in", values, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLEBALANCE between", value1, value2, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andAvailablebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLEBALANCE not between", value1, value2, "availablebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceIsNull() {
            addCriterion("CANUSEBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceIsNotNull() {
            addCriterion("CANUSEBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceEqualTo(BigDecimal value) {
            addCriterion("CANUSEBALANCE =", value, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceNotEqualTo(BigDecimal value) {
            addCriterion("CANUSEBALANCE <>", value, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceGreaterThan(BigDecimal value) {
            addCriterion("CANUSEBALANCE >", value, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CANUSEBALANCE >=", value, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceLessThan(BigDecimal value) {
            addCriterion("CANUSEBALANCE <", value, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CANUSEBALANCE <=", value, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceIn(List<BigDecimal> values) {
            addCriterion("CANUSEBALANCE in", values, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceNotIn(List<BigDecimal> values) {
            addCriterion("CANUSEBALANCE not in", values, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CANUSEBALANCE between", value1, value2, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andCanusebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CANUSEBALANCE not between", value1, value2, "canusebalance");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNull() {
            addCriterion("USEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andUsedamountIsNotNull() {
            addCriterion("USEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andUsedamountEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT =", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <>", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThan(BigDecimal value) {
            addCriterion("USEDAMOUNT >", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT >=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThan(BigDecimal value) {
            addCriterion("USEDAMOUNT <", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAMOUNT <=", value, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotIn(List<BigDecimal> values) {
            addCriterion("USEDAMOUNT not in", values, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andUsedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAMOUNT not between", value1, value2, "usedamount");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("PROJECT_ID like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("PROJECT_ID not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdIsNull() {
            addCriterion("BANKLOAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankloanIdIsNotNull() {
            addCriterion("BANKLOAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankloanIdEqualTo(String value) {
            addCriterion("BANKLOAN_ID =", value, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdNotEqualTo(String value) {
            addCriterion("BANKLOAN_ID <>", value, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdGreaterThan(String value) {
            addCriterion("BANKLOAN_ID >", value, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANKLOAN_ID >=", value, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdLessThan(String value) {
            addCriterion("BANKLOAN_ID <", value, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdLessThanOrEqualTo(String value) {
            addCriterion("BANKLOAN_ID <=", value, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdLike(String value) {
            addCriterion("BANKLOAN_ID like", value, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdNotLike(String value) {
            addCriterion("BANKLOAN_ID not like", value, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdIn(List<String> values) {
            addCriterion("BANKLOAN_ID in", values, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdNotIn(List<String> values) {
            addCriterion("BANKLOAN_ID not in", values, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdBetween(String value1, String value2) {
            addCriterion("BANKLOAN_ID between", value1, value2, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andBankloanIdNotBetween(String value1, String value2) {
            addCriterion("BANKLOAN_ID not between", value1, value2, "bankloanId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdIsNull() {
            addCriterion("LOANCERTIFICATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdIsNotNull() {
            addCriterion("LOANCERTIFICATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdEqualTo(String value) {
            addCriterion("LOANCERTIFICATE_ID =", value, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdNotEqualTo(String value) {
            addCriterion("LOANCERTIFICATE_ID <>", value, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdGreaterThan(String value) {
            addCriterion("LOANCERTIFICATE_ID >", value, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOANCERTIFICATE_ID >=", value, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdLessThan(String value) {
            addCriterion("LOANCERTIFICATE_ID <", value, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdLessThanOrEqualTo(String value) {
            addCriterion("LOANCERTIFICATE_ID <=", value, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdLike(String value) {
            addCriterion("LOANCERTIFICATE_ID like", value, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdNotLike(String value) {
            addCriterion("LOANCERTIFICATE_ID not like", value, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdIn(List<String> values) {
            addCriterion("LOANCERTIFICATE_ID in", values, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdNotIn(List<String> values) {
            addCriterion("LOANCERTIFICATE_ID not in", values, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdBetween(String value1, String value2) {
            addCriterion("LOANCERTIFICATE_ID between", value1, value2, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andLoancertificateIdNotBetween(String value1, String value2) {
            addCriterion("LOANCERTIFICATE_ID not between", value1, value2, "loancertificateId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdIsNull() {
            addCriterion("PROJECTTOTALLIABILITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdIsNotNull() {
            addCriterion("PROJECTTOTALLIABILITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdEqualTo(String value) {
            addCriterion("PROJECTTOTALLIABILITY_ID =", value, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdNotEqualTo(String value) {
            addCriterion("PROJECTTOTALLIABILITY_ID <>", value, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdGreaterThan(String value) {
            addCriterion("PROJECTTOTALLIABILITY_ID >", value, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTTOTALLIABILITY_ID >=", value, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdLessThan(String value) {
            addCriterion("PROJECTTOTALLIABILITY_ID <", value, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECTTOTALLIABILITY_ID <=", value, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdLike(String value) {
            addCriterion("PROJECTTOTALLIABILITY_ID like", value, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdNotLike(String value) {
            addCriterion("PROJECTTOTALLIABILITY_ID not like", value, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdIn(List<String> values) {
            addCriterion("PROJECTTOTALLIABILITY_ID in", values, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdNotIn(List<String> values) {
            addCriterion("PROJECTTOTALLIABILITY_ID not in", values, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdBetween(String value1, String value2) {
            addCriterion("PROJECTTOTALLIABILITY_ID between", value1, value2, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andProjecttotalliabilityIdNotBetween(String value1, String value2) {
            addCriterion("PROJECTTOTALLIABILITY_ID not between", value1, value2, "projecttotalliabilityId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdIsNull() {
            addCriterion("UPDATEMAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdIsNotNull() {
            addCriterion("UPDATEMAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdEqualTo(String value) {
            addCriterion("UPDATEMAN_ID =", value, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdNotEqualTo(String value) {
            addCriterion("UPDATEMAN_ID <>", value, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdGreaterThan(String value) {
            addCriterion("UPDATEMAN_ID >", value, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATEMAN_ID >=", value, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdLessThan(String value) {
            addCriterion("UPDATEMAN_ID <", value, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdLessThanOrEqualTo(String value) {
            addCriterion("UPDATEMAN_ID <=", value, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdLike(String value) {
            addCriterion("UPDATEMAN_ID like", value, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdNotLike(String value) {
            addCriterion("UPDATEMAN_ID not like", value, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdIn(List<String> values) {
            addCriterion("UPDATEMAN_ID in", values, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdNotIn(List<String> values) {
            addCriterion("UPDATEMAN_ID not in", values, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdBetween(String value1, String value2) {
            addCriterion("UPDATEMAN_ID between", value1, value2, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andUpdatemanIdNotBetween(String value1, String value2) {
            addCriterion("UPDATEMAN_ID not between", value1, value2, "updatemanId");
            return (Criteria) this;
        }

        public Criteria andAloanadviceIsNull() {
            addCriterion("ALOANADVICE is null");
            return (Criteria) this;
        }

        public Criteria andAloanadviceIsNotNull() {
            addCriterion("ALOANADVICE is not null");
            return (Criteria) this;
        }

        public Criteria andAloanadviceEqualTo(String value) {
            addCriterion("ALOANADVICE =", value, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceNotEqualTo(String value) {
            addCriterion("ALOANADVICE <>", value, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceGreaterThan(String value) {
            addCriterion("ALOANADVICE >", value, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceGreaterThanOrEqualTo(String value) {
            addCriterion("ALOANADVICE >=", value, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceLessThan(String value) {
            addCriterion("ALOANADVICE <", value, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceLessThanOrEqualTo(String value) {
            addCriterion("ALOANADVICE <=", value, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceLike(String value) {
            addCriterion("ALOANADVICE like", value, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceNotLike(String value) {
            addCriterion("ALOANADVICE not like", value, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceIn(List<String> values) {
            addCriterion("ALOANADVICE in", values, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceNotIn(List<String> values) {
            addCriterion("ALOANADVICE not in", values, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceBetween(String value1, String value2) {
            addCriterion("ALOANADVICE between", value1, value2, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andAloanadviceNotBetween(String value1, String value2) {
            addCriterion("ALOANADVICE not between", value1, value2, "aloanadvice");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNull() {
            addCriterion("CLIENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andClientnameIsNotNull() {
            addCriterion("CLIENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andClientnameEqualTo(String value) {
            addCriterion("CLIENTNAME =", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotEqualTo(String value) {
            addCriterion("CLIENTNAME <>", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThan(String value) {
            addCriterion("CLIENTNAME >", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTNAME >=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThan(String value) {
            addCriterion("CLIENTNAME <", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLessThanOrEqualTo(String value) {
            addCriterion("CLIENTNAME <=", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameLike(String value) {
            addCriterion("CLIENTNAME like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotLike(String value) {
            addCriterion("CLIENTNAME not like", value, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameIn(List<String> values) {
            addCriterion("CLIENTNAME in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotIn(List<String> values) {
            addCriterion("CLIENTNAME not in", values, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameBetween(String value1, String value2) {
            addCriterion("CLIENTNAME between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andClientnameNotBetween(String value1, String value2) {
            addCriterion("CLIENTNAME not between", value1, value2, "clientname");
            return (Criteria) this;
        }

        public Criteria andCommitstateIsNull() {
            addCriterion("COMMITSTATE is null");
            return (Criteria) this;
        }

        public Criteria andCommitstateIsNotNull() {
            addCriterion("COMMITSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommitstateEqualTo(String value) {
            addCriterion("COMMITSTATE =", value, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateNotEqualTo(String value) {
            addCriterion("COMMITSTATE <>", value, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateGreaterThan(String value) {
            addCriterion("COMMITSTATE >", value, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateGreaterThanOrEqualTo(String value) {
            addCriterion("COMMITSTATE >=", value, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateLessThan(String value) {
            addCriterion("COMMITSTATE <", value, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateLessThanOrEqualTo(String value) {
            addCriterion("COMMITSTATE <=", value, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateLike(String value) {
            addCriterion("COMMITSTATE like", value, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateNotLike(String value) {
            addCriterion("COMMITSTATE not like", value, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateIn(List<String> values) {
            addCriterion("COMMITSTATE in", values, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateNotIn(List<String> values) {
            addCriterion("COMMITSTATE not in", values, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateBetween(String value1, String value2) {
            addCriterion("COMMITSTATE between", value1, value2, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCommitstateNotBetween(String value1, String value2) {
            addCriterion("COMMITSTATE not between", value1, value2, "commitstate");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeIsNull() {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeIsNotNull() {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeEqualTo(Long value) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE =", value, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeNotEqualTo(Long value) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE <>", value, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeGreaterThan(Long value) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE >", value, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE >=", value, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeLessThan(Long value) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE <", value, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE <=", value, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeIn(List<Long> values) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE in", values, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeNotIn(List<Long> values) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE not in", values, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeBetween(Long value1, Long value2) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE between", value1, value2, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andCustomerspayconsultingfeeNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMERSPAYCONSULTINGFEE not between", value1, value2, "customerspayconsultingfee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionIsNull() {
            addCriterion("GUARANTEECONDITION is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionIsNotNull() {
            addCriterion("GUARANTEECONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionEqualTo(String value) {
            addCriterion("GUARANTEECONDITION =", value, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionNotEqualTo(String value) {
            addCriterion("GUARANTEECONDITION <>", value, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionGreaterThan(String value) {
            addCriterion("GUARANTEECONDITION >", value, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEECONDITION >=", value, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionLessThan(String value) {
            addCriterion("GUARANTEECONDITION <", value, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEECONDITION <=", value, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionLike(String value) {
            addCriterion("GUARANTEECONDITION like", value, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionNotLike(String value) {
            addCriterion("GUARANTEECONDITION not like", value, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionIn(List<String> values) {
            addCriterion("GUARANTEECONDITION in", values, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionNotIn(List<String> values) {
            addCriterion("GUARANTEECONDITION not in", values, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionBetween(String value1, String value2) {
            addCriterion("GUARANTEECONDITION between", value1, value2, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditionNotBetween(String value1, String value2) {
            addCriterion("GUARANTEECONDITION not between", value1, value2, "guaranteecondition");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareIsNull() {
            addCriterion("GUARANTEECONDITIONDECLARE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareIsNotNull() {
            addCriterion("GUARANTEECONDITIONDECLARE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareEqualTo(String value) {
            addCriterion("GUARANTEECONDITIONDECLARE =", value, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareNotEqualTo(String value) {
            addCriterion("GUARANTEECONDITIONDECLARE <>", value, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareGreaterThan(String value) {
            addCriterion("GUARANTEECONDITIONDECLARE >", value, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEECONDITIONDECLARE >=", value, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareLessThan(String value) {
            addCriterion("GUARANTEECONDITIONDECLARE <", value, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEECONDITIONDECLARE <=", value, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareLike(String value) {
            addCriterion("GUARANTEECONDITIONDECLARE like", value, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareNotLike(String value) {
            addCriterion("GUARANTEECONDITIONDECLARE not like", value, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareIn(List<String> values) {
            addCriterion("GUARANTEECONDITIONDECLARE in", values, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareNotIn(List<String> values) {
            addCriterion("GUARANTEECONDITIONDECLARE not in", values, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareBetween(String value1, String value2) {
            addCriterion("GUARANTEECONDITIONDECLARE between", value1, value2, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeconditiondeclareNotBetween(String value1, String value2) {
            addCriterion("GUARANTEECONDITIONDECLARE not between", value1, value2, "guaranteeconditiondeclare");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateIsNull() {
            addCriterion("GUARANTEEEDATE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateIsNotNull() {
            addCriterion("GUARANTEEEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEEDATE =", value, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateNotEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEEDATE <>", value, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateGreaterThan(BigDecimal value) {
            addCriterion("GUARANTEEEDATE >", value, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEEDATE >=", value, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateLessThan(BigDecimal value) {
            addCriterion("GUARANTEEEDATE <", value, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEEDATE <=", value, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateIn(List<BigDecimal> values) {
            addCriterion("GUARANTEEEDATE in", values, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateNotIn(List<BigDecimal> values) {
            addCriterion("GUARANTEEEDATE not in", values, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEEEDATE between", value1, value2, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteeedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEEEDATE not between", value1, value2, "guaranteeedate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateIsNull() {
            addCriterion("GUARANTEESDATE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateIsNotNull() {
            addCriterion("GUARANTEESDATE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateEqualTo(BigDecimal value) {
            addCriterion("GUARANTEESDATE =", value, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateNotEqualTo(BigDecimal value) {
            addCriterion("GUARANTEESDATE <>", value, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateGreaterThan(BigDecimal value) {
            addCriterion("GUARANTEESDATE >", value, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEESDATE >=", value, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateLessThan(BigDecimal value) {
            addCriterion("GUARANTEESDATE <", value, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEESDATE <=", value, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateIn(List<BigDecimal> values) {
            addCriterion("GUARANTEESDATE in", values, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateNotIn(List<BigDecimal> values) {
            addCriterion("GUARANTEESDATE not in", values, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEESDATE between", value1, value2, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteesdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEESDATE not between", value1, value2, "guaranteesdate");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountIsNull() {
            addCriterion("GUARANTEEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountIsNotNull() {
            addCriterion("GUARANTEEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEDAMOUNT =", value, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountNotEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEDAMOUNT <>", value, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountGreaterThan(BigDecimal value) {
            addCriterion("GUARANTEEDAMOUNT >", value, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEDAMOUNT >=", value, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountLessThan(BigDecimal value) {
            addCriterion("GUARANTEEDAMOUNT <", value, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEDAMOUNT <=", value, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountIn(List<BigDecimal> values) {
            addCriterion("GUARANTEEDAMOUNT in", values, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountNotIn(List<BigDecimal> values) {
            addCriterion("GUARANTEEDAMOUNT not in", values, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEEDAMOUNT between", value1, value2, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andGuaranteedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEEDAMOUNT not between", value1, value2, "guaranteedamount");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryIsNull() {
            addCriterion("INDUSTRYCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryIsNotNull() {
            addCriterion("INDUSTRYCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryEqualTo(String value) {
            addCriterion("INDUSTRYCATEGORY =", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryNotEqualTo(String value) {
            addCriterion("INDUSTRYCATEGORY <>", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryGreaterThan(String value) {
            addCriterion("INDUSTRYCATEGORY >", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYCATEGORY >=", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryLessThan(String value) {
            addCriterion("INDUSTRYCATEGORY <", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYCATEGORY <=", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryLike(String value) {
            addCriterion("INDUSTRYCATEGORY like", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryNotLike(String value) {
            addCriterion("INDUSTRYCATEGORY not like", value, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryIn(List<String> values) {
            addCriterion("INDUSTRYCATEGORY in", values, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryNotIn(List<String> values) {
            addCriterion("INDUSTRYCATEGORY not in", values, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryBetween(String value1, String value2) {
            addCriterion("INDUSTRYCATEGORY between", value1, value2, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andIndustrycategoryNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYCATEGORY not between", value1, value2, "industrycategory");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanIsNull() {
            addCriterion("PROJECTLOANREPAYMENTPLAN is null");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanIsNotNull() {
            addCriterion("PROJECTLOANREPAYMENTPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanEqualTo(String value) {
            addCriterion("PROJECTLOANREPAYMENTPLAN =", value, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanNotEqualTo(String value) {
            addCriterion("PROJECTLOANREPAYMENTPLAN <>", value, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanGreaterThan(String value) {
            addCriterion("PROJECTLOANREPAYMENTPLAN >", value, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTLOANREPAYMENTPLAN >=", value, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanLessThan(String value) {
            addCriterion("PROJECTLOANREPAYMENTPLAN <", value, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanLessThanOrEqualTo(String value) {
            addCriterion("PROJECTLOANREPAYMENTPLAN <=", value, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanLike(String value) {
            addCriterion("PROJECTLOANREPAYMENTPLAN like", value, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanNotLike(String value) {
            addCriterion("PROJECTLOANREPAYMENTPLAN not like", value, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanIn(List<String> values) {
            addCriterion("PROJECTLOANREPAYMENTPLAN in", values, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanNotIn(List<String> values) {
            addCriterion("PROJECTLOANREPAYMENTPLAN not in", values, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanBetween(String value1, String value2) {
            addCriterion("PROJECTLOANREPAYMENTPLAN between", value1, value2, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectloanrepaymentplanNotBetween(String value1, String value2) {
            addCriterion("PROJECTLOANREPAYMENTPLAN not between", value1, value2, "projectloanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("PROJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("PROJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("PROJECTNAME =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("PROJECTNAME <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("PROJECTNAME >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTNAME >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("PROJECTNAME <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("PROJECTNAME <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("PROJECTNAME like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("PROJECTNAME not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("PROJECTNAME in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("PROJECTNAME not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("PROJECTNAME between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("PROJECTNAME not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeIsNull() {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE is null");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeIsNotNull() {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE =", value, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE <>", value, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeGreaterThan(BigDecimal value) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE >", value, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE >=", value, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeLessThan(BigDecimal value) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE <", value, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE <=", value, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeIn(List<BigDecimal> values) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE in", values, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE not in", values, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE between", value1, value2, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andReceivablecustomerguaranteefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVABLECUSTOMERGUARANTEEFEE not between", value1, value2, "receivablecustomerguaranteefee");
            return (Criteria) this;
        }

        public Criteria andSequencenoIsNull() {
            addCriterion("SEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andSequencenoIsNotNull() {
            addCriterion("SEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andSequencenoEqualTo(String value) {
            addCriterion("SEQUENCENO =", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotEqualTo(String value) {
            addCriterion("SEQUENCENO <>", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThan(String value) {
            addCriterion("SEQUENCENO >", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoGreaterThanOrEqualTo(String value) {
            addCriterion("SEQUENCENO >=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThan(String value) {
            addCriterion("SEQUENCENO <", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLessThanOrEqualTo(String value) {
            addCriterion("SEQUENCENO <=", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoLike(String value) {
            addCriterion("SEQUENCENO like", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotLike(String value) {
            addCriterion("SEQUENCENO not like", value, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoIn(List<String> values) {
            addCriterion("SEQUENCENO in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotIn(List<String> values) {
            addCriterion("SEQUENCENO not in", values, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoBetween(String value1, String value2) {
            addCriterion("SEQUENCENO between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSequencenoNotBetween(String value1, String value2) {
            addCriterion("SEQUENCENO not between", value1, value2, "sequenceno");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistIsNull() {
            addCriterion("SUBMITTEDFILELIST is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistIsNotNull() {
            addCriterion("SUBMITTEDFILELIST is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistEqualTo(String value) {
            addCriterion("SUBMITTEDFILELIST =", value, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistNotEqualTo(String value) {
            addCriterion("SUBMITTEDFILELIST <>", value, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistGreaterThan(String value) {
            addCriterion("SUBMITTEDFILELIST >", value, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMITTEDFILELIST >=", value, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistLessThan(String value) {
            addCriterion("SUBMITTEDFILELIST <", value, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistLessThanOrEqualTo(String value) {
            addCriterion("SUBMITTEDFILELIST <=", value, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistLike(String value) {
            addCriterion("SUBMITTEDFILELIST like", value, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistNotLike(String value) {
            addCriterion("SUBMITTEDFILELIST not like", value, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistIn(List<String> values) {
            addCriterion("SUBMITTEDFILELIST in", values, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistNotIn(List<String> values) {
            addCriterion("SUBMITTEDFILELIST not in", values, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistBetween(String value1, String value2) {
            addCriterion("SUBMITTEDFILELIST between", value1, value2, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andSubmittedfilelistNotBetween(String value1, String value2) {
            addCriterion("SUBMITTEDFILELIST not between", value1, value2, "submittedfilelist");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueIsNull() {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE is null");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueIsNotNull() {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE is not null");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueEqualTo(String value) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE =", value, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueNotEqualTo(String value) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE <>", value, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueGreaterThan(String value) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE >", value, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueGreaterThanOrEqualTo(String value) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE >=", value, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueLessThan(String value) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE <", value, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueLessThanOrEqualTo(String value) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE <=", value, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueLike(String value) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE like", value, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueNotLike(String value) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE not like", value, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueIn(List<String> values) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE in", values, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueNotIn(List<String> values) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE not in", values, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueBetween(String value1, String value2) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE between", value1, value2, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingsummaryissueNotBetween(String value1, String value2) {
            addCriterion("WINDCONTROLMEETINGSUMMARYISSUE not between", value1, value2, "windcontrolmeetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanIsNull() {
            addCriterion("LOANREPAYMENTPLAN is null");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanIsNotNull() {
            addCriterion("LOANREPAYMENTPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanEqualTo(String value) {
            addCriterion("LOANREPAYMENTPLAN =", value, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanNotEqualTo(String value) {
            addCriterion("LOANREPAYMENTPLAN <>", value, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanGreaterThan(String value) {
            addCriterion("LOANREPAYMENTPLAN >", value, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanGreaterThanOrEqualTo(String value) {
            addCriterion("LOANREPAYMENTPLAN >=", value, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanLessThan(String value) {
            addCriterion("LOANREPAYMENTPLAN <", value, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanLessThanOrEqualTo(String value) {
            addCriterion("LOANREPAYMENTPLAN <=", value, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanLike(String value) {
            addCriterion("LOANREPAYMENTPLAN like", value, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanNotLike(String value) {
            addCriterion("LOANREPAYMENTPLAN not like", value, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanIn(List<String> values) {
            addCriterion("LOANREPAYMENTPLAN in", values, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanNotIn(List<String> values) {
            addCriterion("LOANREPAYMENTPLAN not in", values, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanBetween(String value1, String value2) {
            addCriterion("LOANREPAYMENTPLAN between", value1, value2, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andLoanrepaymentplanNotBetween(String value1, String value2) {
            addCriterion("LOANREPAYMENTPLAN not between", value1, value2, "loanrepaymentplan");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeIsNull() {
            addCriterion("CLIENTGUARFEE is null");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeIsNotNull() {
            addCriterion("CLIENTGUARFEE is not null");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeEqualTo(BigDecimal value) {
            addCriterion("CLIENTGUARFEE =", value, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeNotEqualTo(BigDecimal value) {
            addCriterion("CLIENTGUARFEE <>", value, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeGreaterThan(BigDecimal value) {
            addCriterion("CLIENTGUARFEE >", value, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENTGUARFEE >=", value, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeLessThan(BigDecimal value) {
            addCriterion("CLIENTGUARFEE <", value, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CLIENTGUARFEE <=", value, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeIn(List<BigDecimal> values) {
            addCriterion("CLIENTGUARFEE in", values, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeNotIn(List<BigDecimal> values) {
            addCriterion("CLIENTGUARFEE not in", values, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENTGUARFEE between", value1, value2, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andClientguarfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CLIENTGUARFEE not between", value1, value2, "clientguarfee");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareIsNull() {
            addCriterion("CONDITIONDECLARE is null");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareIsNotNull() {
            addCriterion("CONDITIONDECLARE is not null");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareEqualTo(String value) {
            addCriterion("CONDITIONDECLARE =", value, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareNotEqualTo(String value) {
            addCriterion("CONDITIONDECLARE <>", value, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareGreaterThan(String value) {
            addCriterion("CONDITIONDECLARE >", value, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareGreaterThanOrEqualTo(String value) {
            addCriterion("CONDITIONDECLARE >=", value, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareLessThan(String value) {
            addCriterion("CONDITIONDECLARE <", value, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareLessThanOrEqualTo(String value) {
            addCriterion("CONDITIONDECLARE <=", value, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareLike(String value) {
            addCriterion("CONDITIONDECLARE like", value, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareNotLike(String value) {
            addCriterion("CONDITIONDECLARE not like", value, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareIn(List<String> values) {
            addCriterion("CONDITIONDECLARE in", values, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareNotIn(List<String> values) {
            addCriterion("CONDITIONDECLARE not in", values, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareBetween(String value1, String value2) {
            addCriterion("CONDITIONDECLARE between", value1, value2, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConditiondeclareNotBetween(String value1, String value2) {
            addCriterion("CONDITIONDECLARE not between", value1, value2, "conditiondeclare");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeIsNull() {
            addCriterion("CONSULTINGFEE is null");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeIsNotNull() {
            addCriterion("CONSULTINGFEE is not null");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeEqualTo(Long value) {
            addCriterion("CONSULTINGFEE =", value, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeNotEqualTo(Long value) {
            addCriterion("CONSULTINGFEE <>", value, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeGreaterThan(Long value) {
            addCriterion("CONSULTINGFEE >", value, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeGreaterThanOrEqualTo(Long value) {
            addCriterion("CONSULTINGFEE >=", value, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeLessThan(Long value) {
            addCriterion("CONSULTINGFEE <", value, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeLessThanOrEqualTo(Long value) {
            addCriterion("CONSULTINGFEE <=", value, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeIn(List<Long> values) {
            addCriterion("CONSULTINGFEE in", values, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeNotIn(List<Long> values) {
            addCriterion("CONSULTINGFEE not in", values, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeBetween(Long value1, Long value2) {
            addCriterion("CONSULTINGFEE between", value1, value2, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andConsultingfeeNotBetween(Long value1, Long value2) {
            addCriterion("CONSULTINGFEE not between", value1, value2, "consultingfee");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateIsNull() {
            addCriterion("GUARANTEEFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateIsNotNull() {
            addCriterion("GUARANTEEFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateEqualTo(Double value) {
            addCriterion("GUARANTEEFEERATE =", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateNotEqualTo(Double value) {
            addCriterion("GUARANTEEFEERATE <>", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateGreaterThan(Double value) {
            addCriterion("GUARANTEEFEERATE >", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateGreaterThanOrEqualTo(Double value) {
            addCriterion("GUARANTEEFEERATE >=", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateLessThan(Double value) {
            addCriterion("GUARANTEEFEERATE <", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateLessThanOrEqualTo(Double value) {
            addCriterion("GUARANTEEFEERATE <=", value, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateIn(List<Double> values) {
            addCriterion("GUARANTEEFEERATE in", values, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateNotIn(List<Double> values) {
            addCriterion("GUARANTEEFEERATE not in", values, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateBetween(Double value1, Double value2) {
            addCriterion("GUARANTEEFEERATE between", value1, value2, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteefeerateNotBetween(Double value1, Double value2) {
            addCriterion("GUARANTEEFEERATE not between", value1, value2, "guaranteefeerate");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberIsNull() {
            addCriterion("GUARANTEENUMBER is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberIsNotNull() {
            addCriterion("GUARANTEENUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberEqualTo(Long value) {
            addCriterion("GUARANTEENUMBER =", value, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberNotEqualTo(Long value) {
            addCriterion("GUARANTEENUMBER <>", value, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberGreaterThan(Long value) {
            addCriterion("GUARANTEENUMBER >", value, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberGreaterThanOrEqualTo(Long value) {
            addCriterion("GUARANTEENUMBER >=", value, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberLessThan(Long value) {
            addCriterion("GUARANTEENUMBER <", value, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberLessThanOrEqualTo(Long value) {
            addCriterion("GUARANTEENUMBER <=", value, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberIn(List<Long> values) {
            addCriterion("GUARANTEENUMBER in", values, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberNotIn(List<Long> values) {
            addCriterion("GUARANTEENUMBER not in", values, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberBetween(Long value1, Long value2) {
            addCriterion("GUARANTEENUMBER between", value1, value2, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteenumberNotBetween(Long value1, Long value2) {
            addCriterion("GUARANTEENUMBER not between", value1, value2, "guaranteenumber");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueIsNull() {
            addCriterion("GUARANTEETOTALVALUE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueIsNotNull() {
            addCriterion("GUARANTEETOTALVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueEqualTo(BigDecimal value) {
            addCriterion("GUARANTEETOTALVALUE =", value, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueNotEqualTo(BigDecimal value) {
            addCriterion("GUARANTEETOTALVALUE <>", value, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueGreaterThan(BigDecimal value) {
            addCriterion("GUARANTEETOTALVALUE >", value, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEETOTALVALUE >=", value, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueLessThan(BigDecimal value) {
            addCriterion("GUARANTEETOTALVALUE <", value, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEETOTALVALUE <=", value, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueIn(List<BigDecimal> values) {
            addCriterion("GUARANTEETOTALVALUE in", values, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueNotIn(List<BigDecimal> values) {
            addCriterion("GUARANTEETOTALVALUE not in", values, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEETOTALVALUE between", value1, value2, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andGuaranteetotalvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEETOTALVALUE not between", value1, value2, "guaranteetotalvalue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueIsNull() {
            addCriterion("MEETINGSUMMARYISSUE is null");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueIsNotNull() {
            addCriterion("MEETINGSUMMARYISSUE is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueEqualTo(String value) {
            addCriterion("MEETINGSUMMARYISSUE =", value, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueNotEqualTo(String value) {
            addCriterion("MEETINGSUMMARYISSUE <>", value, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueGreaterThan(String value) {
            addCriterion("MEETINGSUMMARYISSUE >", value, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueGreaterThanOrEqualTo(String value) {
            addCriterion("MEETINGSUMMARYISSUE >=", value, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueLessThan(String value) {
            addCriterion("MEETINGSUMMARYISSUE <", value, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueLessThanOrEqualTo(String value) {
            addCriterion("MEETINGSUMMARYISSUE <=", value, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueLike(String value) {
            addCriterion("MEETINGSUMMARYISSUE like", value, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueNotLike(String value) {
            addCriterion("MEETINGSUMMARYISSUE not like", value, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueIn(List<String> values) {
            addCriterion("MEETINGSUMMARYISSUE in", values, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueNotIn(List<String> values) {
            addCriterion("MEETINGSUMMARYISSUE not in", values, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueBetween(String value1, String value2) {
            addCriterion("MEETINGSUMMARYISSUE between", value1, value2, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andMeetingsummaryissueNotBetween(String value1, String value2) {
            addCriterion("MEETINGSUMMARYISSUE not between", value1, value2, "meetingsummaryissue");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioIsNull() {
            addCriterion("CUSTDEPOSITRATIO is null");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioIsNotNull() {
            addCriterion("CUSTDEPOSITRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioEqualTo(Double value) {
            addCriterion("CUSTDEPOSITRATIO =", value, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioNotEqualTo(Double value) {
            addCriterion("CUSTDEPOSITRATIO <>", value, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioGreaterThan(Double value) {
            addCriterion("CUSTDEPOSITRATIO >", value, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioGreaterThanOrEqualTo(Double value) {
            addCriterion("CUSTDEPOSITRATIO >=", value, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioLessThan(Double value) {
            addCriterion("CUSTDEPOSITRATIO <", value, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioLessThanOrEqualTo(Double value) {
            addCriterion("CUSTDEPOSITRATIO <=", value, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioIn(List<Double> values) {
            addCriterion("CUSTDEPOSITRATIO in", values, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioNotIn(List<Double> values) {
            addCriterion("CUSTDEPOSITRATIO not in", values, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioBetween(Double value1, Double value2) {
            addCriterion("CUSTDEPOSITRATIO between", value1, value2, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustdepositratioNotBetween(Double value1, Double value2) {
            addCriterion("CUSTDEPOSITRATIO not between", value1, value2, "custdepositratio");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNull() {
            addCriterion("CUSTNAME is null");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNotNull() {
            addCriterion("CUSTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustnameEqualTo(String value) {
            addCriterion("CUSTNAME =", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotEqualTo(String value) {
            addCriterion("CUSTNAME <>", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThan(String value) {
            addCriterion("CUSTNAME >", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTNAME >=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThan(String value) {
            addCriterion("CUSTNAME <", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThanOrEqualTo(String value) {
            addCriterion("CUSTNAME <=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLike(String value) {
            addCriterion("CUSTNAME like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotLike(String value) {
            addCriterion("CUSTNAME not like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameIn(List<String> values) {
            addCriterion("CUSTNAME in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotIn(List<String> values) {
            addCriterion("CUSTNAME not in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameBetween(String value1, String value2) {
            addCriterion("CUSTNAME between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotBetween(String value1, String value2) {
            addCriterion("CUSTNAME not between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateIsNull() {
            addCriterion("CUSTPAYMENTGUARRATE is null");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateIsNotNull() {
            addCriterion("CUSTPAYMENTGUARRATE is not null");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateEqualTo(Double value) {
            addCriterion("CUSTPAYMENTGUARRATE =", value, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateNotEqualTo(Double value) {
            addCriterion("CUSTPAYMENTGUARRATE <>", value, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateGreaterThan(Double value) {
            addCriterion("CUSTPAYMENTGUARRATE >", value, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateGreaterThanOrEqualTo(Double value) {
            addCriterion("CUSTPAYMENTGUARRATE >=", value, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateLessThan(Double value) {
            addCriterion("CUSTPAYMENTGUARRATE <", value, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateLessThanOrEqualTo(Double value) {
            addCriterion("CUSTPAYMENTGUARRATE <=", value, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateIn(List<Double> values) {
            addCriterion("CUSTPAYMENTGUARRATE in", values, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateNotIn(List<Double> values) {
            addCriterion("CUSTPAYMENTGUARRATE not in", values, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateBetween(Double value1, Double value2) {
            addCriterion("CUSTPAYMENTGUARRATE between", value1, value2, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustpaymentguarrateNotBetween(Double value1, Double value2) {
            addCriterion("CUSTPAYMENTGUARRATE not between", value1, value2, "custpaymentguarrate");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositIsNull() {
            addCriterion("CUSTOMERSDEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositIsNotNull() {
            addCriterion("CUSTOMERSDEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositEqualTo(BigDecimal value) {
            addCriterion("CUSTOMERSDEPOSIT =", value, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMERSDEPOSIT <>", value, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMERSDEPOSIT >", value, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMERSDEPOSIT >=", value, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositLessThan(BigDecimal value) {
            addCriterion("CUSTOMERSDEPOSIT <", value, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMERSDEPOSIT <=", value, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositIn(List<BigDecimal> values) {
            addCriterion("CUSTOMERSDEPOSIT in", values, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMERSDEPOSIT not in", values, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMERSDEPOSIT between", value1, value2, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andCustomersdepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMERSDEPOSIT not between", value1, value2, "customersdeposit");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksIsNull() {
            addCriterion("EXPENSEREMARKS is null");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksIsNotNull() {
            addCriterion("EXPENSEREMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksEqualTo(String value) {
            addCriterion("EXPENSEREMARKS =", value, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksNotEqualTo(String value) {
            addCriterion("EXPENSEREMARKS <>", value, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksGreaterThan(String value) {
            addCriterion("EXPENSEREMARKS >", value, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksGreaterThanOrEqualTo(String value) {
            addCriterion("EXPENSEREMARKS >=", value, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksLessThan(String value) {
            addCriterion("EXPENSEREMARKS <", value, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksLessThanOrEqualTo(String value) {
            addCriterion("EXPENSEREMARKS <=", value, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksLike(String value) {
            addCriterion("EXPENSEREMARKS like", value, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksNotLike(String value) {
            addCriterion("EXPENSEREMARKS not like", value, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksIn(List<String> values) {
            addCriterion("EXPENSEREMARKS in", values, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksNotIn(List<String> values) {
            addCriterion("EXPENSEREMARKS not in", values, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksBetween(String value1, String value2) {
            addCriterion("EXPENSEREMARKS between", value1, value2, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpenseremarksNotBetween(String value1, String value2) {
            addCriterion("EXPENSEREMARKS not between", value1, value2, "expenseremarks");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIsNull() {
            addCriterion("EXPIRATIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIsNotNull() {
            addCriterion("EXPIRATIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationdateEqualTo(BigDecimal value) {
            addCriterion("EXPIRATIONDATE =", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotEqualTo(BigDecimal value) {
            addCriterion("EXPIRATIONDATE <>", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateGreaterThan(BigDecimal value) {
            addCriterion("EXPIRATIONDATE >", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPIRATIONDATE >=", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateLessThan(BigDecimal value) {
            addCriterion("EXPIRATIONDATE <", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPIRATIONDATE <=", value, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateIn(List<BigDecimal> values) {
            addCriterion("EXPIRATIONDATE in", values, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotIn(List<BigDecimal> values) {
            addCriterion("EXPIRATIONDATE not in", values, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPIRATIONDATE between", value1, value2, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andExpirationdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPIRATIONDATE not between", value1, value2, "expirationdate");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsIsNull() {
            addCriterion("GUARCONDITIONS is null");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsIsNotNull() {
            addCriterion("GUARCONDITIONS is not null");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsEqualTo(String value) {
            addCriterion("GUARCONDITIONS =", value, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsNotEqualTo(String value) {
            addCriterion("GUARCONDITIONS <>", value, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsGreaterThan(String value) {
            addCriterion("GUARCONDITIONS >", value, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsGreaterThanOrEqualTo(String value) {
            addCriterion("GUARCONDITIONS >=", value, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsLessThan(String value) {
            addCriterion("GUARCONDITIONS <", value, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsLessThanOrEqualTo(String value) {
            addCriterion("GUARCONDITIONS <=", value, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsLike(String value) {
            addCriterion("GUARCONDITIONS like", value, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsNotLike(String value) {
            addCriterion("GUARCONDITIONS not like", value, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsIn(List<String> values) {
            addCriterion("GUARCONDITIONS in", values, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsNotIn(List<String> values) {
            addCriterion("GUARCONDITIONS not in", values, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsBetween(String value1, String value2) {
            addCriterion("GUARCONDITIONS between", value1, value2, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andGuarconditionsNotBetween(String value1, String value2) {
            addCriterion("GUARCONDITIONS not between", value1, value2, "guarconditions");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("INDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("INDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("INDUSTRY =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("INDUSTRY <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("INDUSTRY >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("INDUSTRY <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("INDUSTRY like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("INDUSTRY not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("INDUSTRY in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("INDUSTRY not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("INDUSTRY between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY not between", value1, value2, "industry");
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

        public Criteria andReceivableguarfeeaccountIsNull() {
            addCriterion("RECEIVABLEGUARFEEACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountIsNotNull() {
            addCriterion("RECEIVABLEGUARFEEACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT =", value, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT <>", value, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountGreaterThan(BigDecimal value) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT >", value, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT >=", value, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountLessThan(BigDecimal value) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT <", value, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT <=", value, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountIn(List<BigDecimal> values) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT in", values, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT not in", values, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT between", value1, value2, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andReceivableguarfeeaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVABLEGUARFEEACCOUNT not between", value1, value2, "receivableguarfeeaccount");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberIsNull() {
            addCriterion("REGISTEREDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberIsNotNull() {
            addCriterion("REGISTEREDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberEqualTo(Long value) {
            addCriterion("REGISTEREDNUMBER =", value, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberNotEqualTo(Long value) {
            addCriterion("REGISTEREDNUMBER <>", value, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberGreaterThan(Long value) {
            addCriterion("REGISTEREDNUMBER >", value, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberGreaterThanOrEqualTo(Long value) {
            addCriterion("REGISTEREDNUMBER >=", value, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberLessThan(Long value) {
            addCriterion("REGISTEREDNUMBER <", value, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberLessThanOrEqualTo(Long value) {
            addCriterion("REGISTEREDNUMBER <=", value, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberIn(List<Long> values) {
            addCriterion("REGISTEREDNUMBER in", values, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberNotIn(List<Long> values) {
            addCriterion("REGISTEREDNUMBER not in", values, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberBetween(Long value1, Long value2) {
            addCriterion("REGISTEREDNUMBER between", value1, value2, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisterednumberNotBetween(Long value1, Long value2) {
            addCriterion("REGISTEREDNUMBER not between", value1, value2, "registerednumber");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueIsNull() {
            addCriterion("REGISTEREDTOTALVALUE is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueIsNotNull() {
            addCriterion("REGISTEREDTOTALVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueEqualTo(BigDecimal value) {
            addCriterion("REGISTEREDTOTALVALUE =", value, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueNotEqualTo(BigDecimal value) {
            addCriterion("REGISTEREDTOTALVALUE <>", value, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueGreaterThan(BigDecimal value) {
            addCriterion("REGISTEREDTOTALVALUE >", value, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGISTEREDTOTALVALUE >=", value, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueLessThan(BigDecimal value) {
            addCriterion("REGISTEREDTOTALVALUE <", value, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGISTEREDTOTALVALUE <=", value, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueIn(List<BigDecimal> values) {
            addCriterion("REGISTEREDTOTALVALUE in", values, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueNotIn(List<BigDecimal> values) {
            addCriterion("REGISTEREDTOTALVALUE not in", values, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGISTEREDTOTALVALUE between", value1, value2, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andRegisteredtotalvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGISTEREDTOTALVALUE not between", value1, value2, "registeredtotalvalue");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistIsNull() {
            addCriterion("SUBMISSIONLIST is null");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistIsNotNull() {
            addCriterion("SUBMISSIONLIST is not null");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistEqualTo(String value) {
            addCriterion("SUBMISSIONLIST =", value, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistNotEqualTo(String value) {
            addCriterion("SUBMISSIONLIST <>", value, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistGreaterThan(String value) {
            addCriterion("SUBMISSIONLIST >", value, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMISSIONLIST >=", value, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistLessThan(String value) {
            addCriterion("SUBMISSIONLIST <", value, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistLessThanOrEqualTo(String value) {
            addCriterion("SUBMISSIONLIST <=", value, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistLike(String value) {
            addCriterion("SUBMISSIONLIST like", value, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistNotLike(String value) {
            addCriterion("SUBMISSIONLIST not like", value, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistIn(List<String> values) {
            addCriterion("SUBMISSIONLIST in", values, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistNotIn(List<String> values) {
            addCriterion("SUBMISSIONLIST not in", values, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistBetween(String value1, String value2) {
            addCriterion("SUBMISSIONLIST between", value1, value2, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andSubmissionlistNotBetween(String value1, String value2) {
            addCriterion("SUBMISSIONLIST not between", value1, value2, "submissionlist");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodIsNull() {
            addCriterion("WINDCONTROLMEETINGPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodIsNotNull() {
            addCriterion("WINDCONTROLMEETINGPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodEqualTo(String value) {
            addCriterion("WINDCONTROLMEETINGPERIOD =", value, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodNotEqualTo(String value) {
            addCriterion("WINDCONTROLMEETINGPERIOD <>", value, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodGreaterThan(String value) {
            addCriterion("WINDCONTROLMEETINGPERIOD >", value, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodGreaterThanOrEqualTo(String value) {
            addCriterion("WINDCONTROLMEETINGPERIOD >=", value, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodLessThan(String value) {
            addCriterion("WINDCONTROLMEETINGPERIOD <", value, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodLessThanOrEqualTo(String value) {
            addCriterion("WINDCONTROLMEETINGPERIOD <=", value, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodLike(String value) {
            addCriterion("WINDCONTROLMEETINGPERIOD like", value, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodNotLike(String value) {
            addCriterion("WINDCONTROLMEETINGPERIOD not like", value, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodIn(List<String> values) {
            addCriterion("WINDCONTROLMEETINGPERIOD in", values, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodNotIn(List<String> values) {
            addCriterion("WINDCONTROLMEETINGPERIOD not in", values, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodBetween(String value1, String value2) {
            addCriterion("WINDCONTROLMEETINGPERIOD between", value1, value2, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andWindcontrolmeetingperiodNotBetween(String value1, String value2) {
            addCriterion("WINDCONTROLMEETINGPERIOD not between", value1, value2, "windcontrolmeetingperiod");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNull() {
            addCriterion("CONTRACTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNotNull() {
            addCriterion("CONTRACTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andContractamountEqualTo(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT =", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT <>", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThan(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT >", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT >=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThan(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT <", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTAMOUNT <=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountIn(List<BigDecimal> values) {
            addCriterion("CONTRACTAMOUNT in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACTAMOUNT not in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTAMOUNT between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTAMOUNT not between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andFilelistIsNull() {
            addCriterion("FILELIST is null");
            return (Criteria) this;
        }

        public Criteria andFilelistIsNotNull() {
            addCriterion("FILELIST is not null");
            return (Criteria) this;
        }

        public Criteria andFilelistEqualTo(String value) {
            addCriterion("FILELIST =", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotEqualTo(String value) {
            addCriterion("FILELIST <>", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistGreaterThan(String value) {
            addCriterion("FILELIST >", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistGreaterThanOrEqualTo(String value) {
            addCriterion("FILELIST >=", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLessThan(String value) {
            addCriterion("FILELIST <", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLessThanOrEqualTo(String value) {
            addCriterion("FILELIST <=", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistLike(String value) {
            addCriterion("FILELIST like", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotLike(String value) {
            addCriterion("FILELIST not like", value, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistIn(List<String> values) {
            addCriterion("FILELIST in", values, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotIn(List<String> values) {
            addCriterion("FILELIST not in", values, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistBetween(String value1, String value2) {
            addCriterion("FILELIST between", value1, value2, "filelist");
            return (Criteria) this;
        }

        public Criteria andFilelistNotBetween(String value1, String value2) {
            addCriterion("FILELIST not between", value1, value2, "filelist");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountIsNull() {
            addCriterion("GUARTOTALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountIsNotNull() {
            addCriterion("GUARTOTALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountEqualTo(BigDecimal value) {
            addCriterion("GUARTOTALAMOUNT =", value, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountNotEqualTo(BigDecimal value) {
            addCriterion("GUARTOTALAMOUNT <>", value, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountGreaterThan(BigDecimal value) {
            addCriterion("GUARTOTALAMOUNT >", value, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARTOTALAMOUNT >=", value, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountLessThan(BigDecimal value) {
            addCriterion("GUARTOTALAMOUNT <", value, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARTOTALAMOUNT <=", value, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountIn(List<BigDecimal> values) {
            addCriterion("GUARTOTALAMOUNT in", values, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountNotIn(List<BigDecimal> values) {
            addCriterion("GUARTOTALAMOUNT not in", values, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARTOTALAMOUNT between", value1, value2, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuartotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARTOTALAMOUNT not between", value1, value2, "guartotalamount");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumIsNull() {
            addCriterion("GUATTOTALNUM is null");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumIsNotNull() {
            addCriterion("GUATTOTALNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumEqualTo(Long value) {
            addCriterion("GUATTOTALNUM =", value, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumNotEqualTo(Long value) {
            addCriterion("GUATTOTALNUM <>", value, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumGreaterThan(Long value) {
            addCriterion("GUATTOTALNUM >", value, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumGreaterThanOrEqualTo(Long value) {
            addCriterion("GUATTOTALNUM >=", value, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumLessThan(Long value) {
            addCriterion("GUATTOTALNUM <", value, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumLessThanOrEqualTo(Long value) {
            addCriterion("GUATTOTALNUM <=", value, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumIn(List<Long> values) {
            addCriterion("GUATTOTALNUM in", values, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumNotIn(List<Long> values) {
            addCriterion("GUATTOTALNUM not in", values, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumBetween(Long value1, Long value2) {
            addCriterion("GUATTOTALNUM between", value1, value2, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andGuattotalnumNotBetween(Long value1, Long value2) {
            addCriterion("GUATTOTALNUM not between", value1, value2, "guattotalnum");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeIsNull() {
            addCriterion("LOANREPAYTIME is null");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeIsNotNull() {
            addCriterion("LOANREPAYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeEqualTo(String value) {
            addCriterion("LOANREPAYTIME =", value, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeNotEqualTo(String value) {
            addCriterion("LOANREPAYTIME <>", value, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeGreaterThan(String value) {
            addCriterion("LOANREPAYTIME >", value, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("LOANREPAYTIME >=", value, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeLessThan(String value) {
            addCriterion("LOANREPAYTIME <", value, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeLessThanOrEqualTo(String value) {
            addCriterion("LOANREPAYTIME <=", value, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeLike(String value) {
            addCriterion("LOANREPAYTIME like", value, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeNotLike(String value) {
            addCriterion("LOANREPAYTIME not like", value, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeIn(List<String> values) {
            addCriterion("LOANREPAYTIME in", values, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeNotIn(List<String> values) {
            addCriterion("LOANREPAYTIME not in", values, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeBetween(String value1, String value2) {
            addCriterion("LOANREPAYTIME between", value1, value2, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andLoanrepaytimeNotBetween(String value1, String value2) {
            addCriterion("LOANREPAYTIME not between", value1, value2, "loanrepaytime");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountIsNull() {
            addCriterion("PROCOLLATERALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountIsNotNull() {
            addCriterion("PROCOLLATERALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountEqualTo(BigDecimal value) {
            addCriterion("PROCOLLATERALAMOUNT =", value, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountNotEqualTo(BigDecimal value) {
            addCriterion("PROCOLLATERALAMOUNT <>", value, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountGreaterThan(BigDecimal value) {
            addCriterion("PROCOLLATERALAMOUNT >", value, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCOLLATERALAMOUNT >=", value, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountLessThan(BigDecimal value) {
            addCriterion("PROCOLLATERALAMOUNT <", value, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCOLLATERALAMOUNT <=", value, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountIn(List<BigDecimal> values) {
            addCriterion("PROCOLLATERALAMOUNT in", values, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountNotIn(List<BigDecimal> values) {
            addCriterion("PROCOLLATERALAMOUNT not in", values, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCOLLATERALAMOUNT between", value1, value2, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCOLLATERALAMOUNT not between", value1, value2, "procollateralamount");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateIsNull() {
            addCriterion("PROCOLLATERALRATE is null");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateIsNotNull() {
            addCriterion("PROCOLLATERALRATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateEqualTo(Double value) {
            addCriterion("PROCOLLATERALRATE =", value, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateNotEqualTo(Double value) {
            addCriterion("PROCOLLATERALRATE <>", value, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateGreaterThan(Double value) {
            addCriterion("PROCOLLATERALRATE >", value, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateGreaterThanOrEqualTo(Double value) {
            addCriterion("PROCOLLATERALRATE >=", value, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateLessThan(Double value) {
            addCriterion("PROCOLLATERALRATE <", value, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateLessThanOrEqualTo(Double value) {
            addCriterion("PROCOLLATERALRATE <=", value, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateIn(List<Double> values) {
            addCriterion("PROCOLLATERALRATE in", values, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateNotIn(List<Double> values) {
            addCriterion("PROCOLLATERALRATE not in", values, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateBetween(Double value1, Double value2) {
            addCriterion("PROCOLLATERALRATE between", value1, value2, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andProcollateralrateNotBetween(Double value1, Double value2) {
            addCriterion("PROCOLLATERALRATE not between", value1, value2, "procollateralrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateIsNull() {
            addCriterion("REPORTTOTALINVESTMENTRATE is null");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateIsNotNull() {
            addCriterion("REPORTTOTALINVESTMENTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateEqualTo(Double value) {
            addCriterion("REPORTTOTALINVESTMENTRATE =", value, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateNotEqualTo(Double value) {
            addCriterion("REPORTTOTALINVESTMENTRATE <>", value, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateGreaterThan(Double value) {
            addCriterion("REPORTTOTALINVESTMENTRATE >", value, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateGreaterThanOrEqualTo(Double value) {
            addCriterion("REPORTTOTALINVESTMENTRATE >=", value, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateLessThan(Double value) {
            addCriterion("REPORTTOTALINVESTMENTRATE <", value, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateLessThanOrEqualTo(Double value) {
            addCriterion("REPORTTOTALINVESTMENTRATE <=", value, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateIn(List<Double> values) {
            addCriterion("REPORTTOTALINVESTMENTRATE in", values, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateNotIn(List<Double> values) {
            addCriterion("REPORTTOTALINVESTMENTRATE not in", values, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateBetween(Double value1, Double value2) {
            addCriterion("REPORTTOTALINVESTMENTRATE between", value1, value2, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReporttotalinvestmentrateNotBetween(Double value1, Double value2) {
            addCriterion("REPORTTOTALINVESTMENTRATE not between", value1, value2, "reporttotalinvestmentrate");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentIsNull() {
            addCriterion("REVIEWTOTALINVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentIsNotNull() {
            addCriterion("REVIEWTOTALINVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentEqualTo(BigDecimal value) {
            addCriterion("REVIEWTOTALINVESTMENT =", value, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentNotEqualTo(BigDecimal value) {
            addCriterion("REVIEWTOTALINVESTMENT <>", value, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentGreaterThan(BigDecimal value) {
            addCriterion("REVIEWTOTALINVESTMENT >", value, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWTOTALINVESTMENT >=", value, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentLessThan(BigDecimal value) {
            addCriterion("REVIEWTOTALINVESTMENT <", value, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWTOTALINVESTMENT <=", value, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentIn(List<BigDecimal> values) {
            addCriterion("REVIEWTOTALINVESTMENT in", values, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentNotIn(List<BigDecimal> values) {
            addCriterion("REVIEWTOTALINVESTMENT not in", values, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWTOTALINVESTMENT between", value1, value2, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andReviewtotalinvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWTOTALINVESTMENT not between", value1, value2, "reviewtotalinvestment");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("BANK_ID =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("BANK_ID <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("BANK_ID >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ID >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("BANK_ID <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("BANK_ID <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("BANK_ID like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("BANK_ID not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("BANK_ID in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("BANK_ID not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("BANK_ID between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("BANK_ID not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("CONTRACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("CONTRACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("CONTRACT_ID =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("CONTRACT_ID <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("CONTRACT_ID >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("CONTRACT_ID <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_ID <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("CONTRACT_ID like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("CONTRACT_ID not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("CONTRACT_ID in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("CONTRACT_ID not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_ID not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(BigDecimal value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(BigDecimal value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(BigDecimal value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(BigDecimal value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<BigDecimal> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<BigDecimal> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionIsNull() {
            addCriterion("MGRBOPINION is null");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionIsNotNull() {
            addCriterion("MGRBOPINION is not null");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionEqualTo(String value) {
            addCriterion("MGRBOPINION =", value, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionNotEqualTo(String value) {
            addCriterion("MGRBOPINION <>", value, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionGreaterThan(String value) {
            addCriterion("MGRBOPINION >", value, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionGreaterThanOrEqualTo(String value) {
            addCriterion("MGRBOPINION >=", value, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionLessThan(String value) {
            addCriterion("MGRBOPINION <", value, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionLessThanOrEqualTo(String value) {
            addCriterion("MGRBOPINION <=", value, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionLike(String value) {
            addCriterion("MGRBOPINION like", value, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionNotLike(String value) {
            addCriterion("MGRBOPINION not like", value, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionIn(List<String> values) {
            addCriterion("MGRBOPINION in", values, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionNotIn(List<String> values) {
            addCriterion("MGRBOPINION not in", values, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionBetween(String value1, String value2) {
            addCriterion("MGRBOPINION between", value1, value2, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andMgrbopinionNotBetween(String value1, String value2) {
            addCriterion("MGRBOPINION not between", value1, value2, "mgrbopinion");
            return (Criteria) this;
        }

        public Criteria andContractedateIsNull() {
            addCriterion("CONTRACTEDATE is null");
            return (Criteria) this;
        }

        public Criteria andContractedateIsNotNull() {
            addCriterion("CONTRACTEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractedateEqualTo(BigDecimal value) {
            addCriterion("CONTRACTEDATE =", value, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACTEDATE <>", value, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateGreaterThan(BigDecimal value) {
            addCriterion("CONTRACTEDATE >", value, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTEDATE >=", value, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateLessThan(BigDecimal value) {
            addCriterion("CONTRACTEDATE <", value, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTEDATE <=", value, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateIn(List<BigDecimal> values) {
            addCriterion("CONTRACTEDATE in", values, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACTEDATE not in", values, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTEDATE between", value1, value2, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTEDATE not between", value1, value2, "contractedate");
            return (Criteria) this;
        }

        public Criteria andContractsdateIsNull() {
            addCriterion("CONTRACTSDATE is null");
            return (Criteria) this;
        }

        public Criteria andContractsdateIsNotNull() {
            addCriterion("CONTRACTSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractsdateEqualTo(BigDecimal value) {
            addCriterion("CONTRACTSDATE =", value, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateNotEqualTo(BigDecimal value) {
            addCriterion("CONTRACTSDATE <>", value, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateGreaterThan(BigDecimal value) {
            addCriterion("CONTRACTSDATE >", value, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTSDATE >=", value, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateLessThan(BigDecimal value) {
            addCriterion("CONTRACTSDATE <", value, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONTRACTSDATE <=", value, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateIn(List<BigDecimal> values) {
            addCriterion("CONTRACTSDATE in", values, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateNotIn(List<BigDecimal> values) {
            addCriterion("CONTRACTSDATE not in", values, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTSDATE between", value1, value2, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andContractsdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONTRACTSDATE not between", value1, value2, "contractsdate");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeIsNull() {
            addCriterion("FINANCEPURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeIsNotNull() {
            addCriterion("FINANCEPURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeEqualTo(String value) {
            addCriterion("FINANCEPURPOSE =", value, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeNotEqualTo(String value) {
            addCriterion("FINANCEPURPOSE <>", value, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeGreaterThan(String value) {
            addCriterion("FINANCEPURPOSE >", value, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCEPURPOSE >=", value, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeLessThan(String value) {
            addCriterion("FINANCEPURPOSE <", value, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeLessThanOrEqualTo(String value) {
            addCriterion("FINANCEPURPOSE <=", value, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeLike(String value) {
            addCriterion("FINANCEPURPOSE like", value, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeNotLike(String value) {
            addCriterion("FINANCEPURPOSE not like", value, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeIn(List<String> values) {
            addCriterion("FINANCEPURPOSE in", values, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeNotIn(List<String> values) {
            addCriterion("FINANCEPURPOSE not in", values, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeBetween(String value1, String value2) {
            addCriterion("FINANCEPURPOSE between", value1, value2, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andFinancepurposeNotBetween(String value1, String value2) {
            addCriterion("FINANCEPURPOSE not between", value1, value2, "financepurpose");
            return (Criteria) this;
        }

        public Criteria andInvestamountIsNull() {
            addCriterion("INVESTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvestamountIsNotNull() {
            addCriterion("INVESTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvestamountEqualTo(BigDecimal value) {
            addCriterion("INVESTAMOUNT =", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountNotEqualTo(BigDecimal value) {
            addCriterion("INVESTAMOUNT <>", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountGreaterThan(BigDecimal value) {
            addCriterion("INVESTAMOUNT >", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTAMOUNT >=", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountLessThan(BigDecimal value) {
            addCriterion("INVESTAMOUNT <", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INVESTAMOUNT <=", value, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountIn(List<BigDecimal> values) {
            addCriterion("INVESTAMOUNT in", values, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountNotIn(List<BigDecimal> values) {
            addCriterion("INVESTAMOUNT not in", values, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTAMOUNT between", value1, value2, "investamount");
            return (Criteria) this;
        }

        public Criteria andInvestamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INVESTAMOUNT not between", value1, value2, "investamount");
            return (Criteria) this;
        }

        public Criteria andReceivetimesIsNull() {
            addCriterion("RECEIVETIMES is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimesIsNotNull() {
            addCriterion("RECEIVETIMES is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimesEqualTo(String value) {
            addCriterion("RECEIVETIMES =", value, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesNotEqualTo(String value) {
            addCriterion("RECEIVETIMES <>", value, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesGreaterThan(String value) {
            addCriterion("RECEIVETIMES >", value, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVETIMES >=", value, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesLessThan(String value) {
            addCriterion("RECEIVETIMES <", value, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesLessThanOrEqualTo(String value) {
            addCriterion("RECEIVETIMES <=", value, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesLike(String value) {
            addCriterion("RECEIVETIMES like", value, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesNotLike(String value) {
            addCriterion("RECEIVETIMES not like", value, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesIn(List<String> values) {
            addCriterion("RECEIVETIMES in", values, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesNotIn(List<String> values) {
            addCriterion("RECEIVETIMES not in", values, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesBetween(String value1, String value2) {
            addCriterion("RECEIVETIMES between", value1, value2, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andReceivetimesNotBetween(String value1, String value2) {
            addCriterion("RECEIVETIMES not between", value1, value2, "receivetimes");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeIsNull() {
            addCriterion("ADVISERFEE is null");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeIsNotNull() {
            addCriterion("ADVISERFEE is not null");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeEqualTo(BigDecimal value) {
            addCriterion("ADVISERFEE =", value, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeNotEqualTo(BigDecimal value) {
            addCriterion("ADVISERFEE <>", value, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeGreaterThan(BigDecimal value) {
            addCriterion("ADVISERFEE >", value, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADVISERFEE >=", value, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeLessThan(BigDecimal value) {
            addCriterion("ADVISERFEE <", value, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADVISERFEE <=", value, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeIn(List<BigDecimal> values) {
            addCriterion("ADVISERFEE in", values, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeNotIn(List<BigDecimal> values) {
            addCriterion("ADVISERFEE not in", values, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADVISERFEE between", value1, value2, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andAdviserfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADVISERFEE not between", value1, value2, "adviserfee");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdIsNull() {
            addCriterion("NOTICEAPPROVEDEMPCD is null");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdIsNotNull() {
            addCriterion("NOTICEAPPROVEDEMPCD is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdEqualTo(String value) {
            addCriterion("NOTICEAPPROVEDEMPCD =", value, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdNotEqualTo(String value) {
            addCriterion("NOTICEAPPROVEDEMPCD <>", value, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdGreaterThan(String value) {
            addCriterion("NOTICEAPPROVEDEMPCD >", value, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICEAPPROVEDEMPCD >=", value, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdLessThan(String value) {
            addCriterion("NOTICEAPPROVEDEMPCD <", value, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdLessThanOrEqualTo(String value) {
            addCriterion("NOTICEAPPROVEDEMPCD <=", value, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdLike(String value) {
            addCriterion("NOTICEAPPROVEDEMPCD like", value, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdNotLike(String value) {
            addCriterion("NOTICEAPPROVEDEMPCD not like", value, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdIn(List<String> values) {
            addCriterion("NOTICEAPPROVEDEMPCD in", values, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdNotIn(List<String> values) {
            addCriterion("NOTICEAPPROVEDEMPCD not in", values, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdBetween(String value1, String value2) {
            addCriterion("NOTICEAPPROVEDEMPCD between", value1, value2, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempcdNotBetween(String value1, String value2) {
            addCriterion("NOTICEAPPROVEDEMPCD not between", value1, value2, "noticeapprovedempcd");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmIsNull() {
            addCriterion("NOTICEAPPROVEDEMPNM is null");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmIsNotNull() {
            addCriterion("NOTICEAPPROVEDEMPNM is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmEqualTo(String value) {
            addCriterion("NOTICEAPPROVEDEMPNM =", value, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmNotEqualTo(String value) {
            addCriterion("NOTICEAPPROVEDEMPNM <>", value, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmGreaterThan(String value) {
            addCriterion("NOTICEAPPROVEDEMPNM >", value, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmGreaterThanOrEqualTo(String value) {
            addCriterion("NOTICEAPPROVEDEMPNM >=", value, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmLessThan(String value) {
            addCriterion("NOTICEAPPROVEDEMPNM <", value, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmLessThanOrEqualTo(String value) {
            addCriterion("NOTICEAPPROVEDEMPNM <=", value, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmLike(String value) {
            addCriterion("NOTICEAPPROVEDEMPNM like", value, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmNotLike(String value) {
            addCriterion("NOTICEAPPROVEDEMPNM not like", value, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmIn(List<String> values) {
            addCriterion("NOTICEAPPROVEDEMPNM in", values, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmNotIn(List<String> values) {
            addCriterion("NOTICEAPPROVEDEMPNM not in", values, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmBetween(String value1, String value2) {
            addCriterion("NOTICEAPPROVEDEMPNM between", value1, value2, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andNoticeapprovedempnmNotBetween(String value1, String value2) {
            addCriterion("NOTICEAPPROVEDEMPNM not between", value1, value2, "noticeapprovedempnm");
            return (Criteria) this;
        }

        public Criteria andSealempcdIsNull() {
            addCriterion("SEALEMPCD is null");
            return (Criteria) this;
        }

        public Criteria andSealempcdIsNotNull() {
            addCriterion("SEALEMPCD is not null");
            return (Criteria) this;
        }

        public Criteria andSealempcdEqualTo(String value) {
            addCriterion("SEALEMPCD =", value, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdNotEqualTo(String value) {
            addCriterion("SEALEMPCD <>", value, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdGreaterThan(String value) {
            addCriterion("SEALEMPCD >", value, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdGreaterThanOrEqualTo(String value) {
            addCriterion("SEALEMPCD >=", value, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdLessThan(String value) {
            addCriterion("SEALEMPCD <", value, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdLessThanOrEqualTo(String value) {
            addCriterion("SEALEMPCD <=", value, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdLike(String value) {
            addCriterion("SEALEMPCD like", value, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdNotLike(String value) {
            addCriterion("SEALEMPCD not like", value, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdIn(List<String> values) {
            addCriterion("SEALEMPCD in", values, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdNotIn(List<String> values) {
            addCriterion("SEALEMPCD not in", values, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdBetween(String value1, String value2) {
            addCriterion("SEALEMPCD between", value1, value2, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempcdNotBetween(String value1, String value2) {
            addCriterion("SEALEMPCD not between", value1, value2, "sealempcd");
            return (Criteria) this;
        }

        public Criteria andSealempnmIsNull() {
            addCriterion("SEALEMPNM is null");
            return (Criteria) this;
        }

        public Criteria andSealempnmIsNotNull() {
            addCriterion("SEALEMPNM is not null");
            return (Criteria) this;
        }

        public Criteria andSealempnmEqualTo(String value) {
            addCriterion("SEALEMPNM =", value, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmNotEqualTo(String value) {
            addCriterion("SEALEMPNM <>", value, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmGreaterThan(String value) {
            addCriterion("SEALEMPNM >", value, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmGreaterThanOrEqualTo(String value) {
            addCriterion("SEALEMPNM >=", value, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmLessThan(String value) {
            addCriterion("SEALEMPNM <", value, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmLessThanOrEqualTo(String value) {
            addCriterion("SEALEMPNM <=", value, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmLike(String value) {
            addCriterion("SEALEMPNM like", value, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmNotLike(String value) {
            addCriterion("SEALEMPNM not like", value, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmIn(List<String> values) {
            addCriterion("SEALEMPNM in", values, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmNotIn(List<String> values) {
            addCriterion("SEALEMPNM not in", values, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmBetween(String value1, String value2) {
            addCriterion("SEALEMPNM between", value1, value2, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andSealempnmNotBetween(String value1, String value2) {
            addCriterion("SEALEMPNM not between", value1, value2, "sealempnm");
            return (Criteria) this;
        }

        public Criteria andPayloanplanIsNull() {
            addCriterion("PAYLOANPLAN is null");
            return (Criteria) this;
        }

        public Criteria andPayloanplanIsNotNull() {
            addCriterion("PAYLOANPLAN is not null");
            return (Criteria) this;
        }

        public Criteria andPayloanplanEqualTo(String value) {
            addCriterion("PAYLOANPLAN =", value, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanNotEqualTo(String value) {
            addCriterion("PAYLOANPLAN <>", value, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanGreaterThan(String value) {
            addCriterion("PAYLOANPLAN >", value, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanGreaterThanOrEqualTo(String value) {
            addCriterion("PAYLOANPLAN >=", value, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanLessThan(String value) {
            addCriterion("PAYLOANPLAN <", value, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanLessThanOrEqualTo(String value) {
            addCriterion("PAYLOANPLAN <=", value, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanLike(String value) {
            addCriterion("PAYLOANPLAN like", value, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanNotLike(String value) {
            addCriterion("PAYLOANPLAN not like", value, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanIn(List<String> values) {
            addCriterion("PAYLOANPLAN in", values, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanNotIn(List<String> values) {
            addCriterion("PAYLOANPLAN not in", values, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanBetween(String value1, String value2) {
            addCriterion("PAYLOANPLAN between", value1, value2, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andPayloanplanNotBetween(String value1, String value2) {
            addCriterion("PAYLOANPLAN not between", value1, value2, "payloanplan");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNull() {
            addCriterion("ISCHECK is null");
            return (Criteria) this;
        }

        public Criteria andIscheckIsNotNull() {
            addCriterion("ISCHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckEqualTo(Short value) {
            addCriterion("ISCHECK =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(Short value) {
            addCriterion("ISCHECK <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(Short value) {
            addCriterion("ISCHECK >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(Short value) {
            addCriterion("ISCHECK >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(Short value) {
            addCriterion("ISCHECK <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(Short value) {
            addCriterion("ISCHECK <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<Short> values) {
            addCriterion("ISCHECK in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<Short> values) {
            addCriterion("ISCHECK not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(Short value1, Short value2) {
            addCriterion("ISCHECK between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(Short value1, Short value2) {
            addCriterion("ISCHECK not between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistIsNull() {
            addCriterion("REVIEWFILELIST is null");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistIsNotNull() {
            addCriterion("REVIEWFILELIST is not null");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistEqualTo(String value) {
            addCriterion("REVIEWFILELIST =", value, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistNotEqualTo(String value) {
            addCriterion("REVIEWFILELIST <>", value, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistGreaterThan(String value) {
            addCriterion("REVIEWFILELIST >", value, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWFILELIST >=", value, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistLessThan(String value) {
            addCriterion("REVIEWFILELIST <", value, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistLessThanOrEqualTo(String value) {
            addCriterion("REVIEWFILELIST <=", value, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistLike(String value) {
            addCriterion("REVIEWFILELIST like", value, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistNotLike(String value) {
            addCriterion("REVIEWFILELIST not like", value, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistIn(List<String> values) {
            addCriterion("REVIEWFILELIST in", values, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistNotIn(List<String> values) {
            addCriterion("REVIEWFILELIST not in", values, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistBetween(String value1, String value2) {
            addCriterion("REVIEWFILELIST between", value1, value2, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andReviewfilelistNotBetween(String value1, String value2) {
            addCriterion("REVIEWFILELIST not between", value1, value2, "reviewfilelist");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNull() {
            addCriterion("APPLYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andApplyamountIsNotNull() {
            addCriterion("APPLYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyamountEqualTo(BigDecimal value) {
            addCriterion("APPLYAMOUNT =", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotEqualTo(BigDecimal value) {
            addCriterion("APPLYAMOUNT <>", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThan(BigDecimal value) {
            addCriterion("APPLYAMOUNT >", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYAMOUNT >=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThan(BigDecimal value) {
            addCriterion("APPLYAMOUNT <", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYAMOUNT <=", value, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountIn(List<BigDecimal> values) {
            addCriterion("APPLYAMOUNT in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotIn(List<BigDecimal> values) {
            addCriterion("APPLYAMOUNT not in", values, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYAMOUNT between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andApplyamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYAMOUNT not between", value1, value2, "applyamount");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNull() {
            addCriterion("BANKNAME is null");
            return (Criteria) this;
        }

        public Criteria andBanknameIsNotNull() {
            addCriterion("BANKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBanknameEqualTo(String value) {
            addCriterion("BANKNAME =", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotEqualTo(String value) {
            addCriterion("BANKNAME <>", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThan(String value) {
            addCriterion("BANKNAME >", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNAME >=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThan(String value) {
            addCriterion("BANKNAME <", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLessThanOrEqualTo(String value) {
            addCriterion("BANKNAME <=", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameLike(String value) {
            addCriterion("BANKNAME like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotLike(String value) {
            addCriterion("BANKNAME not like", value, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameIn(List<String> values) {
            addCriterion("BANKNAME in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotIn(List<String> values) {
            addCriterion("BANKNAME not in", values, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameBetween(String value1, String value2) {
            addCriterion("BANKNAME between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andBanknameNotBetween(String value1, String value2) {
            addCriterion("BANKNAME not between", value1, value2, "bankname");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNull() {
            addCriterion("OWNERNAME is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("OWNERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("OWNERNAME =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("OWNERNAME <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("OWNERNAME >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("OWNERNAME >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("OWNERNAME <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("OWNERNAME <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("OWNERNAME like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("OWNERNAME not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("OWNERNAME in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("OWNERNAME not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("OWNERNAME between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("OWNERNAME not between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNull() {
            addCriterion("ATTACHMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIsNotNull() {
            addCriterion("ATTACHMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdEqualTo(String value) {
            addCriterion("ATTACHMENT_ID =", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotEqualTo(String value) {
            addCriterion("ATTACHMENT_ID <>", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThan(String value) {
            addCriterion("ATTACHMENT_ID >", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_ID >=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThan(String value) {
            addCriterion("ATTACHMENT_ID <", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLessThanOrEqualTo(String value) {
            addCriterion("ATTACHMENT_ID <=", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdLike(String value) {
            addCriterion("ATTACHMENT_ID like", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotLike(String value) {
            addCriterion("ATTACHMENT_ID not like", value, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdIn(List<String> values) {
            addCriterion("ATTACHMENT_ID in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotIn(List<String> values) {
            addCriterion("ATTACHMENT_ID not in", values, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_ID between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdNotBetween(String value1, String value2) {
            addCriterion("ATTACHMENT_ID not between", value1, value2, "attachmentId");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeIsNull() {
            addCriterion("NEWREVIEWFEE is null");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeIsNotNull() {
            addCriterion("NEWREVIEWFEE is not null");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeEqualTo(BigDecimal value) {
            addCriterion("NEWREVIEWFEE =", value, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeNotEqualTo(BigDecimal value) {
            addCriterion("NEWREVIEWFEE <>", value, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeGreaterThan(BigDecimal value) {
            addCriterion("NEWREVIEWFEE >", value, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEWREVIEWFEE >=", value, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeLessThan(BigDecimal value) {
            addCriterion("NEWREVIEWFEE <", value, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEWREVIEWFEE <=", value, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeIn(List<BigDecimal> values) {
            addCriterion("NEWREVIEWFEE in", values, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeNotIn(List<BigDecimal> values) {
            addCriterion("NEWREVIEWFEE not in", values, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEWREVIEWFEE between", value1, value2, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andNewreviewfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEWREVIEWFEE not between", value1, value2, "newreviewfee");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindIsNull() {
            addCriterion("GUARANTEEDUTYREMIND is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindIsNotNull() {
            addCriterion("GUARANTEEDUTYREMIND is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindEqualTo(String value) {
            addCriterion("GUARANTEEDUTYREMIND =", value, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindNotEqualTo(String value) {
            addCriterion("GUARANTEEDUTYREMIND <>", value, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindGreaterThan(String value) {
            addCriterion("GUARANTEEDUTYREMIND >", value, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEEDUTYREMIND >=", value, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindLessThan(String value) {
            addCriterion("GUARANTEEDUTYREMIND <", value, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEEDUTYREMIND <=", value, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindLike(String value) {
            addCriterion("GUARANTEEDUTYREMIND like", value, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindNotLike(String value) {
            addCriterion("GUARANTEEDUTYREMIND not like", value, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindIn(List<String> values) {
            addCriterion("GUARANTEEDUTYREMIND in", values, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindNotIn(List<String> values) {
            addCriterion("GUARANTEEDUTYREMIND not in", values, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindBetween(String value1, String value2) {
            addCriterion("GUARANTEEDUTYREMIND between", value1, value2, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andGuaranteedutyremindNotBetween(String value1, String value2) {
            addCriterion("GUARANTEEDUTYREMIND not between", value1, value2, "guaranteedutyremind");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidIsNull() {
            addCriterion("LOANSERIALUID is null");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidIsNotNull() {
            addCriterion("LOANSERIALUID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidEqualTo(String value) {
            addCriterion("LOANSERIALUID =", value, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidNotEqualTo(String value) {
            addCriterion("LOANSERIALUID <>", value, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidGreaterThan(String value) {
            addCriterion("LOANSERIALUID >", value, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidGreaterThanOrEqualTo(String value) {
            addCriterion("LOANSERIALUID >=", value, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidLessThan(String value) {
            addCriterion("LOANSERIALUID <", value, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidLessThanOrEqualTo(String value) {
            addCriterion("LOANSERIALUID <=", value, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidLike(String value) {
            addCriterion("LOANSERIALUID like", value, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidNotLike(String value) {
            addCriterion("LOANSERIALUID not like", value, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidIn(List<String> values) {
            addCriterion("LOANSERIALUID in", values, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidNotIn(List<String> values) {
            addCriterion("LOANSERIALUID not in", values, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidBetween(String value1, String value2) {
            addCriterion("LOANSERIALUID between", value1, value2, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanserialuidNotBetween(String value1, String value2) {
            addCriterion("LOANSERIALUID not between", value1, value2, "loanserialuid");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeIsNull() {
            addCriterion("BANKREPAYMENTMODE is null");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeIsNotNull() {
            addCriterion("BANKREPAYMENTMODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeEqualTo(String value) {
            addCriterion("BANKREPAYMENTMODE =", value, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeNotEqualTo(String value) {
            addCriterion("BANKREPAYMENTMODE <>", value, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeGreaterThan(String value) {
            addCriterion("BANKREPAYMENTMODE >", value, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKREPAYMENTMODE >=", value, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeLessThan(String value) {
            addCriterion("BANKREPAYMENTMODE <", value, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeLessThanOrEqualTo(String value) {
            addCriterion("BANKREPAYMENTMODE <=", value, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeLike(String value) {
            addCriterion("BANKREPAYMENTMODE like", value, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeNotLike(String value) {
            addCriterion("BANKREPAYMENTMODE not like", value, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeIn(List<String> values) {
            addCriterion("BANKREPAYMENTMODE in", values, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeNotIn(List<String> values) {
            addCriterion("BANKREPAYMENTMODE not in", values, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeBetween(String value1, String value2) {
            addCriterion("BANKREPAYMENTMODE between", value1, value2, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankrepaymentmodeNotBetween(String value1, String value2) {
            addCriterion("BANKREPAYMENTMODE not between", value1, value2, "bankrepaymentmode");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineIsNull() {
            addCriterion("BANKLOANDEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineIsNotNull() {
            addCriterion("BANKLOANDEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineEqualTo(Long value) {
            addCriterion("BANKLOANDEADLINE =", value, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineNotEqualTo(Long value) {
            addCriterion("BANKLOANDEADLINE <>", value, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineGreaterThan(Long value) {
            addCriterion("BANKLOANDEADLINE >", value, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineGreaterThanOrEqualTo(Long value) {
            addCriterion("BANKLOANDEADLINE >=", value, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineLessThan(Long value) {
            addCriterion("BANKLOANDEADLINE <", value, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineLessThanOrEqualTo(Long value) {
            addCriterion("BANKLOANDEADLINE <=", value, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineIn(List<Long> values) {
            addCriterion("BANKLOANDEADLINE in", values, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineNotIn(List<Long> values) {
            addCriterion("BANKLOANDEADLINE not in", values, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineBetween(Long value1, Long value2) {
            addCriterion("BANKLOANDEADLINE between", value1, value2, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andBankloandeadlineNotBetween(Long value1, Long value2) {
            addCriterion("BANKLOANDEADLINE not between", value1, value2, "bankloandeadline");
            return (Criteria) this;
        }

        public Criteria andIssettleIsNull() {
            addCriterion("ISSETTLE is null");
            return (Criteria) this;
        }

        public Criteria andIssettleIsNotNull() {
            addCriterion("ISSETTLE is not null");
            return (Criteria) this;
        }

        public Criteria andIssettleEqualTo(Short value) {
            addCriterion("ISSETTLE =", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleNotEqualTo(Short value) {
            addCriterion("ISSETTLE <>", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleGreaterThan(Short value) {
            addCriterion("ISSETTLE >", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleGreaterThanOrEqualTo(Short value) {
            addCriterion("ISSETTLE >=", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleLessThan(Short value) {
            addCriterion("ISSETTLE <", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleLessThanOrEqualTo(Short value) {
            addCriterion("ISSETTLE <=", value, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleIn(List<Short> values) {
            addCriterion("ISSETTLE in", values, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleNotIn(List<Short> values) {
            addCriterion("ISSETTLE not in", values, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleBetween(Short value1, Short value2) {
            addCriterion("ISSETTLE between", value1, value2, "issettle");
            return (Criteria) this;
        }

        public Criteria andIssettleNotBetween(Short value1, Short value2) {
            addCriterion("ISSETTLE not between", value1, value2, "issettle");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsIsNull() {
            addCriterion("DATASYNCSTAUTS is null");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsIsNotNull() {
            addCriterion("DATASYNCSTAUTS is not null");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsEqualTo(String value) {
            addCriterion("DATASYNCSTAUTS =", value, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsNotEqualTo(String value) {
            addCriterion("DATASYNCSTAUTS <>", value, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsGreaterThan(String value) {
            addCriterion("DATASYNCSTAUTS >", value, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsGreaterThanOrEqualTo(String value) {
            addCriterion("DATASYNCSTAUTS >=", value, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsLessThan(String value) {
            addCriterion("DATASYNCSTAUTS <", value, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsLessThanOrEqualTo(String value) {
            addCriterion("DATASYNCSTAUTS <=", value, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsLike(String value) {
            addCriterion("DATASYNCSTAUTS like", value, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsNotLike(String value) {
            addCriterion("DATASYNCSTAUTS not like", value, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsIn(List<String> values) {
            addCriterion("DATASYNCSTAUTS in", values, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsNotIn(List<String> values) {
            addCriterion("DATASYNCSTAUTS not in", values, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsBetween(String value1, String value2) {
            addCriterion("DATASYNCSTAUTS between", value1, value2, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andDatasyncstautsNotBetween(String value1, String value2) {
            addCriterion("DATASYNCSTAUTS not between", value1, value2, "datasyncstauts");
            return (Criteria) this;
        }

        public Criteria andLoankindsIsNull() {
            addCriterion("LOANKINDS is null");
            return (Criteria) this;
        }

        public Criteria andLoankindsIsNotNull() {
            addCriterion("LOANKINDS is not null");
            return (Criteria) this;
        }

        public Criteria andLoankindsEqualTo(String value) {
            addCriterion("LOANKINDS =", value, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsNotEqualTo(String value) {
            addCriterion("LOANKINDS <>", value, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsGreaterThan(String value) {
            addCriterion("LOANKINDS >", value, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsGreaterThanOrEqualTo(String value) {
            addCriterion("LOANKINDS >=", value, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsLessThan(String value) {
            addCriterion("LOANKINDS <", value, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsLessThanOrEqualTo(String value) {
            addCriterion("LOANKINDS <=", value, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsLike(String value) {
            addCriterion("LOANKINDS like", value, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsNotLike(String value) {
            addCriterion("LOANKINDS not like", value, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsIn(List<String> values) {
            addCriterion("LOANKINDS in", values, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsNotIn(List<String> values) {
            addCriterion("LOANKINDS not in", values, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsBetween(String value1, String value2) {
            addCriterion("LOANKINDS between", value1, value2, "loankinds");
            return (Criteria) this;
        }

        public Criteria andLoankindsNotBetween(String value1, String value2) {
            addCriterion("LOANKINDS not between", value1, value2, "loankinds");
            return (Criteria) this;
        }

        public Criteria andIsloanoverIsNull() {
            addCriterion("ISLOANOVER is null");
            return (Criteria) this;
        }

        public Criteria andIsloanoverIsNotNull() {
            addCriterion("ISLOANOVER is not null");
            return (Criteria) this;
        }

        public Criteria andIsloanoverEqualTo(Short value) {
            addCriterion("ISLOANOVER =", value, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverNotEqualTo(Short value) {
            addCriterion("ISLOANOVER <>", value, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverGreaterThan(Short value) {
            addCriterion("ISLOANOVER >", value, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverGreaterThanOrEqualTo(Short value) {
            addCriterion("ISLOANOVER >=", value, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverLessThan(Short value) {
            addCriterion("ISLOANOVER <", value, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverLessThanOrEqualTo(Short value) {
            addCriterion("ISLOANOVER <=", value, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverIn(List<Short> values) {
            addCriterion("ISLOANOVER in", values, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverNotIn(List<Short> values) {
            addCriterion("ISLOANOVER not in", values, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverBetween(Short value1, Short value2) {
            addCriterion("ISLOANOVER between", value1, value2, "isloanover");
            return (Criteria) this;
        }

        public Criteria andIsloanoverNotBetween(Short value1, Short value2) {
            addCriterion("ISLOANOVER not between", value1, value2, "isloanover");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516IsNull() {
            addCriterion("DATACHECKINFO_1516 is null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516IsNotNull() {
            addCriterion("DATACHECKINFO_1516 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516EqualTo(String value) {
            addCriterion("DATACHECKINFO_1516 =", value, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516NotEqualTo(String value) {
            addCriterion("DATACHECKINFO_1516 <>", value, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516GreaterThan(String value) {
            addCriterion("DATACHECKINFO_1516 >", value, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516GreaterThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_1516 >=", value, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516LessThan(String value) {
            addCriterion("DATACHECKINFO_1516 <", value, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516LessThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_1516 <=", value, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516Like(String value) {
            addCriterion("DATACHECKINFO_1516 like", value, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516NotLike(String value) {
            addCriterion("DATACHECKINFO_1516 not like", value, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516In(List<String> values) {
            addCriterion("DATACHECKINFO_1516 in", values, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516NotIn(List<String> values) {
            addCriterion("DATACHECKINFO_1516 not in", values, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516Between(String value1, String value2) {
            addCriterion("DATACHECKINFO_1516 between", value1, value2, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1516NotBetween(String value1, String value2) {
            addCriterion("DATACHECKINFO_1516 not between", value1, value2, "datacheckinfo1516");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNull() {
            addCriterion("CHECKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIsNotNull() {
            addCriterion("CHECKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstatusEqualTo(String value) {
            addCriterion("CHECKSTATUS =", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotEqualTo(String value) {
            addCriterion("CHECKSTATUS <>", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThan(String value) {
            addCriterion("CHECKSTATUS >", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS >=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThan(String value) {
            addCriterion("CHECKSTATUS <", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTATUS <=", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusLike(String value) {
            addCriterion("CHECKSTATUS like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotLike(String value) {
            addCriterion("CHECKSTATUS not like", value, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusIn(List<String> values) {
            addCriterion("CHECKSTATUS in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotIn(List<String> values) {
            addCriterion("CHECKSTATUS not in", values, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andCheckstatusNotBetween(String value1, String value2) {
            addCriterion("CHECKSTATUS not between", value1, value2, "checkstatus");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17IsNull() {
            addCriterion("DATACHECKINFO_17 is null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17IsNotNull() {
            addCriterion("DATACHECKINFO_17 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17EqualTo(String value) {
            addCriterion("DATACHECKINFO_17 =", value, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17NotEqualTo(String value) {
            addCriterion("DATACHECKINFO_17 <>", value, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17GreaterThan(String value) {
            addCriterion("DATACHECKINFO_17 >", value, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17GreaterThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_17 >=", value, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17LessThan(String value) {
            addCriterion("DATACHECKINFO_17 <", value, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17LessThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_17 <=", value, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17Like(String value) {
            addCriterion("DATACHECKINFO_17 like", value, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17NotLike(String value) {
            addCriterion("DATACHECKINFO_17 not like", value, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17In(List<String> values) {
            addCriterion("DATACHECKINFO_17 in", values, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17NotIn(List<String> values) {
            addCriterion("DATACHECKINFO_17 not in", values, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17Between(String value1, String value2) {
            addCriterion("DATACHECKINFO_17 between", value1, value2, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17NotBetween(String value1, String value2) {
            addCriterion("DATACHECKINFO_17 not between", value1, value2, "datacheckinfo17");
            return (Criteria) this;
        }

        public Criteria andBaserateIsNull() {
            addCriterion("BASERATE is null");
            return (Criteria) this;
        }

        public Criteria andBaserateIsNotNull() {
            addCriterion("BASERATE is not null");
            return (Criteria) this;
        }

        public Criteria andBaserateEqualTo(Double value) {
            addCriterion("BASERATE =", value, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateNotEqualTo(Double value) {
            addCriterion("BASERATE <>", value, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateGreaterThan(Double value) {
            addCriterion("BASERATE >", value, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateGreaterThanOrEqualTo(Double value) {
            addCriterion("BASERATE >=", value, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateLessThan(Double value) {
            addCriterion("BASERATE <", value, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateLessThanOrEqualTo(Double value) {
            addCriterion("BASERATE <=", value, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateIn(List<Double> values) {
            addCriterion("BASERATE in", values, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateNotIn(List<Double> values) {
            addCriterion("BASERATE not in", values, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateBetween(Double value1, Double value2) {
            addCriterion("BASERATE between", value1, value2, "baserate");
            return (Criteria) this;
        }

        public Criteria andBaserateNotBetween(Double value1, Double value2) {
            addCriterion("BASERATE not between", value1, value2, "baserate");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807IsNull() {
            addCriterion("DATACHECKINFO_1807 is null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807IsNotNull() {
            addCriterion("DATACHECKINFO_1807 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807EqualTo(String value) {
            addCriterion("DATACHECKINFO_1807 =", value, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807NotEqualTo(String value) {
            addCriterion("DATACHECKINFO_1807 <>", value, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807GreaterThan(String value) {
            addCriterion("DATACHECKINFO_1807 >", value, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807GreaterThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_1807 >=", value, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807LessThan(String value) {
            addCriterion("DATACHECKINFO_1807 <", value, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807LessThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_1807 <=", value, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807Like(String value) {
            addCriterion("DATACHECKINFO_1807 like", value, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807NotLike(String value) {
            addCriterion("DATACHECKINFO_1807 not like", value, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807In(List<String> values) {
            addCriterion("DATACHECKINFO_1807 in", values, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807NotIn(List<String> values) {
            addCriterion("DATACHECKINFO_1807 not in", values, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807Between(String value1, String value2) {
            addCriterion("DATACHECKINFO_1807 between", value1, value2, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1807NotBetween(String value1, String value2) {
            addCriterion("DATACHECKINFO_1807 not between", value1, value2, "datacheckinfo1807");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703IsNull() {
            addCriterion("DATACHECKINFO_17_03 is null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703IsNotNull() {
            addCriterion("DATACHECKINFO_17_03 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703EqualTo(String value) {
            addCriterion("DATACHECKINFO_17_03 =", value, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703NotEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_03 <>", value, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703GreaterThan(String value) {
            addCriterion("DATACHECKINFO_17_03 >", value, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703GreaterThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_03 >=", value, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703LessThan(String value) {
            addCriterion("DATACHECKINFO_17_03 <", value, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703LessThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_03 <=", value, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703Like(String value) {
            addCriterion("DATACHECKINFO_17_03 like", value, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703NotLike(String value) {
            addCriterion("DATACHECKINFO_17_03 not like", value, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703In(List<String> values) {
            addCriterion("DATACHECKINFO_17_03 in", values, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703NotIn(List<String> values) {
            addCriterion("DATACHECKINFO_17_03 not in", values, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703Between(String value1, String value2) {
            addCriterion("DATACHECKINFO_17_03 between", value1, value2, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1703NotBetween(String value1, String value2) {
            addCriterion("DATACHECKINFO_17_03 not between", value1, value2, "datacheckinfo1703");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706IsNull() {
            addCriterion("DATACHECKINFO_17_06 is null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706IsNotNull() {
            addCriterion("DATACHECKINFO_17_06 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706EqualTo(String value) {
            addCriterion("DATACHECKINFO_17_06 =", value, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706NotEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_06 <>", value, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706GreaterThan(String value) {
            addCriterion("DATACHECKINFO_17_06 >", value, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706GreaterThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_06 >=", value, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706LessThan(String value) {
            addCriterion("DATACHECKINFO_17_06 <", value, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706LessThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_06 <=", value, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706Like(String value) {
            addCriterion("DATACHECKINFO_17_06 like", value, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706NotLike(String value) {
            addCriterion("DATACHECKINFO_17_06 not like", value, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706In(List<String> values) {
            addCriterion("DATACHECKINFO_17_06 in", values, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706NotIn(List<String> values) {
            addCriterion("DATACHECKINFO_17_06 not in", values, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706Between(String value1, String value2) {
            addCriterion("DATACHECKINFO_17_06 between", value1, value2, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1706NotBetween(String value1, String value2) {
            addCriterion("DATACHECKINFO_17_06 not between", value1, value2, "datacheckinfo1706");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnIsNull() {
            addCriterion("DATACHECKINFO_17_SBN is null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnIsNotNull() {
            addCriterion("DATACHECKINFO_17_SBN is not null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_SBN =", value, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnNotEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_SBN <>", value, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnGreaterThan(String value) {
            addCriterion("DATACHECKINFO_17_SBN >", value, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnGreaterThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_SBN >=", value, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnLessThan(String value) {
            addCriterion("DATACHECKINFO_17_SBN <", value, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnLessThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_17_SBN <=", value, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnLike(String value) {
            addCriterion("DATACHECKINFO_17_SBN like", value, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnNotLike(String value) {
            addCriterion("DATACHECKINFO_17_SBN not like", value, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnIn(List<String> values) {
            addCriterion("DATACHECKINFO_17_SBN in", values, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnNotIn(List<String> values) {
            addCriterion("DATACHECKINFO_17_SBN not in", values, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnBetween(String value1, String value2) {
            addCriterion("DATACHECKINFO_17_SBN between", value1, value2, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo17SbnNotBetween(String value1, String value2) {
            addCriterion("DATACHECKINFO_17_SBN not between", value1, value2, "datacheckinfo17Sbn");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812IsNull() {
            addCriterion("DATACHECKINFO_1812 is null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812IsNotNull() {
            addCriterion("DATACHECKINFO_1812 is not null");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812EqualTo(String value) {
            addCriterion("DATACHECKINFO_1812 =", value, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812NotEqualTo(String value) {
            addCriterion("DATACHECKINFO_1812 <>", value, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812GreaterThan(String value) {
            addCriterion("DATACHECKINFO_1812 >", value, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812GreaterThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_1812 >=", value, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812LessThan(String value) {
            addCriterion("DATACHECKINFO_1812 <", value, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812LessThanOrEqualTo(String value) {
            addCriterion("DATACHECKINFO_1812 <=", value, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812Like(String value) {
            addCriterion("DATACHECKINFO_1812 like", value, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812NotLike(String value) {
            addCriterion("DATACHECKINFO_1812 not like", value, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812In(List<String> values) {
            addCriterion("DATACHECKINFO_1812 in", values, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812NotIn(List<String> values) {
            addCriterion("DATACHECKINFO_1812 not in", values, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812Between(String value1, String value2) {
            addCriterion("DATACHECKINFO_1812 between", value1, value2, "datacheckinfo1812");
            return (Criteria) this;
        }

        public Criteria andDatacheckinfo1812NotBetween(String value1, String value2) {
            addCriterion("DATACHECKINFO_1812 not between", value1, value2, "datacheckinfo1812");
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