package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExtractapprovalapplydetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtractapprovalapplydetailExample() {
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

        public Criteria andCauseIsNull() {
            addCriterion("CAUSE is null");
            return (Criteria) this;
        }

        public Criteria andCauseIsNotNull() {
            addCriterion("CAUSE is not null");
            return (Criteria) this;
        }

        public Criteria andCauseEqualTo(String value) {
            addCriterion("CAUSE =", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotEqualTo(String value) {
            addCriterion("CAUSE <>", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThan(String value) {
            addCriterion("CAUSE >", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseGreaterThanOrEqualTo(String value) {
            addCriterion("CAUSE >=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThan(String value) {
            addCriterion("CAUSE <", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLessThanOrEqualTo(String value) {
            addCriterion("CAUSE <=", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseLike(String value) {
            addCriterion("CAUSE like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotLike(String value) {
            addCriterion("CAUSE not like", value, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseIn(List<String> values) {
            addCriterion("CAUSE in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotIn(List<String> values) {
            addCriterion("CAUSE not in", values, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseBetween(String value1, String value2) {
            addCriterion("CAUSE between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andCauseNotBetween(String value1, String value2) {
            addCriterion("CAUSE not between", value1, value2, "cause");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNull() {
            addCriterion("NODENAME is null");
            return (Criteria) this;
        }

        public Criteria andNodenameIsNotNull() {
            addCriterion("NODENAME is not null");
            return (Criteria) this;
        }

        public Criteria andNodenameEqualTo(String value) {
            addCriterion("NODENAME =", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotEqualTo(String value) {
            addCriterion("NODENAME <>", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThan(String value) {
            addCriterion("NODENAME >", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameGreaterThanOrEqualTo(String value) {
            addCriterion("NODENAME >=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThan(String value) {
            addCriterion("NODENAME <", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLessThanOrEqualTo(String value) {
            addCriterion("NODENAME <=", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameLike(String value) {
            addCriterion("NODENAME like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotLike(String value) {
            addCriterion("NODENAME not like", value, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameIn(List<String> values) {
            addCriterion("NODENAME in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotIn(List<String> values) {
            addCriterion("NODENAME not in", values, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameBetween(String value1, String value2) {
            addCriterion("NODENAME between", value1, value2, "nodename");
            return (Criteria) this;
        }

        public Criteria andNodenameNotBetween(String value1, String value2) {
            addCriterion("NODENAME not between", value1, value2, "nodename");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("RETURNTIME is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("RETURNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(BigDecimal value) {
            addCriterion("RETURNTIME =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(BigDecimal value) {
            addCriterion("RETURNTIME <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(BigDecimal value) {
            addCriterion("RETURNTIME >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNTIME >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(BigDecimal value) {
            addCriterion("RETURNTIME <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNTIME <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<BigDecimal> values) {
            addCriterion("RETURNTIME in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<BigDecimal> values) {
            addCriterion("RETURNTIME not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNTIME between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNTIME not between", value1, value2, "returntime");
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

        public Criteria andExtractapprovalapplyIdIsNull() {
            addCriterion("EXTRACTAPPROVALAPPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdIsNotNull() {
            addCriterion("EXTRACTAPPROVALAPPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdEqualTo(String value) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID =", value, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdNotEqualTo(String value) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID <>", value, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdGreaterThan(String value) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID >", value, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID >=", value, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdLessThan(String value) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID <", value, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdLessThanOrEqualTo(String value) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID <=", value, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdLike(String value) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID like", value, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdNotLike(String value) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID not like", value, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdIn(List<String> values) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID in", values, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdNotIn(List<String> values) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID not in", values, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdBetween(String value1, String value2) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID between", value1, value2, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andExtractapprovalapplyIdNotBetween(String value1, String value2) {
            addCriterion("EXTRACTAPPROVALAPPLY_ID not between", value1, value2, "extractapprovalapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdIsNull() {
            addCriterion("POLICYGUARANTEEAPPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdIsNotNull() {
            addCriterion("POLICYGUARANTEEAPPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdEqualTo(String value) {
            addCriterion("POLICYGUARANTEEAPPLY_ID =", value, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdNotEqualTo(String value) {
            addCriterion("POLICYGUARANTEEAPPLY_ID <>", value, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdGreaterThan(String value) {
            addCriterion("POLICYGUARANTEEAPPLY_ID >", value, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYGUARANTEEAPPLY_ID >=", value, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdLessThan(String value) {
            addCriterion("POLICYGUARANTEEAPPLY_ID <", value, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdLessThanOrEqualTo(String value) {
            addCriterion("POLICYGUARANTEEAPPLY_ID <=", value, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdLike(String value) {
            addCriterion("POLICYGUARANTEEAPPLY_ID like", value, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdNotLike(String value) {
            addCriterion("POLICYGUARANTEEAPPLY_ID not like", value, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdIn(List<String> values) {
            addCriterion("POLICYGUARANTEEAPPLY_ID in", values, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdNotIn(List<String> values) {
            addCriterion("POLICYGUARANTEEAPPLY_ID not in", values, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdBetween(String value1, String value2) {
            addCriterion("POLICYGUARANTEEAPPLY_ID between", value1, value2, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyguaranteeapplyIdNotBetween(String value1, String value2) {
            addCriterion("POLICYGUARANTEEAPPLY_ID not between", value1, value2, "policyguaranteeapplyId");
            return (Criteria) this;
        }

        public Criteria andCheckpassIsNull() {
            addCriterion("CHECKPASS is null");
            return (Criteria) this;
        }

        public Criteria andCheckpassIsNotNull() {
            addCriterion("CHECKPASS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpassEqualTo(String value) {
            addCriterion("CHECKPASS =", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotEqualTo(String value) {
            addCriterion("CHECKPASS <>", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassGreaterThan(String value) {
            addCriterion("CHECKPASS >", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKPASS >=", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLessThan(String value) {
            addCriterion("CHECKPASS <", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLessThanOrEqualTo(String value) {
            addCriterion("CHECKPASS <=", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassLike(String value) {
            addCriterion("CHECKPASS like", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotLike(String value) {
            addCriterion("CHECKPASS not like", value, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassIn(List<String> values) {
            addCriterion("CHECKPASS in", values, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotIn(List<String> values) {
            addCriterion("CHECKPASS not in", values, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassBetween(String value1, String value2) {
            addCriterion("CHECKPASS between", value1, value2, "checkpass");
            return (Criteria) this;
        }

        public Criteria andCheckpassNotBetween(String value1, String value2) {
            addCriterion("CHECKPASS not between", value1, value2, "checkpass");
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

        public Criteria andIscheckEqualTo(String value) {
            addCriterion("ISCHECK =", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotEqualTo(String value) {
            addCriterion("ISCHECK <>", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThan(String value) {
            addCriterion("ISCHECK >", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckGreaterThanOrEqualTo(String value) {
            addCriterion("ISCHECK >=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThan(String value) {
            addCriterion("ISCHECK <", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLessThanOrEqualTo(String value) {
            addCriterion("ISCHECK <=", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckLike(String value) {
            addCriterion("ISCHECK like", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotLike(String value) {
            addCriterion("ISCHECK not like", value, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckIn(List<String> values) {
            addCriterion("ISCHECK in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotIn(List<String> values) {
            addCriterion("ISCHECK not in", values, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckBetween(String value1, String value2) {
            addCriterion("ISCHECK between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andIscheckNotBetween(String value1, String value2) {
            addCriterion("ISCHECK not between", value1, value2, "ischeck");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusIsNull() {
            addCriterion("ATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusIsNotNull() {
            addCriterion("ATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusEqualTo(String value) {
            addCriterion("ATTENTIONSTATUS =", value, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusNotEqualTo(String value) {
            addCriterion("ATTENTIONSTATUS <>", value, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusGreaterThan(String value) {
            addCriterion("ATTENTIONSTATUS >", value, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ATTENTIONSTATUS >=", value, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusLessThan(String value) {
            addCriterion("ATTENTIONSTATUS <", value, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusLessThanOrEqualTo(String value) {
            addCriterion("ATTENTIONSTATUS <=", value, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusLike(String value) {
            addCriterion("ATTENTIONSTATUS like", value, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusNotLike(String value) {
            addCriterion("ATTENTIONSTATUS not like", value, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusIn(List<String> values) {
            addCriterion("ATTENTIONSTATUS in", values, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusNotIn(List<String> values) {
            addCriterion("ATTENTIONSTATUS not in", values, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusBetween(String value1, String value2) {
            addCriterion("ATTENTIONSTATUS between", value1, value2, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andAttentionstatusNotBetween(String value1, String value2) {
            addCriterion("ATTENTIONSTATUS not between", value1, value2, "attentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusIsNull() {
            addCriterion("BANKTAXATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusIsNotNull() {
            addCriterion("BANKTAXATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusEqualTo(String value) {
            addCriterion("BANKTAXATTENTIONSTATUS =", value, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusNotEqualTo(String value) {
            addCriterion("BANKTAXATTENTIONSTATUS <>", value, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusGreaterThan(String value) {
            addCriterion("BANKTAXATTENTIONSTATUS >", value, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("BANKTAXATTENTIONSTATUS >=", value, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusLessThan(String value) {
            addCriterion("BANKTAXATTENTIONSTATUS <", value, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusLessThanOrEqualTo(String value) {
            addCriterion("BANKTAXATTENTIONSTATUS <=", value, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusLike(String value) {
            addCriterion("BANKTAXATTENTIONSTATUS like", value, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusNotLike(String value) {
            addCriterion("BANKTAXATTENTIONSTATUS not like", value, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusIn(List<String> values) {
            addCriterion("BANKTAXATTENTIONSTATUS in", values, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusNotIn(List<String> values) {
            addCriterion("BANKTAXATTENTIONSTATUS not in", values, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusBetween(String value1, String value2) {
            addCriterion("BANKTAXATTENTIONSTATUS between", value1, value2, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBanktaxattentionstatusNotBetween(String value1, String value2) {
            addCriterion("BANKTAXATTENTIONSTATUS not between", value1, value2, "banktaxattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusIsNull() {
            addCriterion("SUMATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusIsNotNull() {
            addCriterion("SUMATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusEqualTo(String value) {
            addCriterion("SUMATTENTIONSTATUS =", value, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusNotEqualTo(String value) {
            addCriterion("SUMATTENTIONSTATUS <>", value, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusGreaterThan(String value) {
            addCriterion("SUMATTENTIONSTATUS >", value, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SUMATTENTIONSTATUS >=", value, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusLessThan(String value) {
            addCriterion("SUMATTENTIONSTATUS <", value, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusLessThanOrEqualTo(String value) {
            addCriterion("SUMATTENTIONSTATUS <=", value, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusLike(String value) {
            addCriterion("SUMATTENTIONSTATUS like", value, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusNotLike(String value) {
            addCriterion("SUMATTENTIONSTATUS not like", value, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusIn(List<String> values) {
            addCriterion("SUMATTENTIONSTATUS in", values, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusNotIn(List<String> values) {
            addCriterion("SUMATTENTIONSTATUS not in", values, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusBetween(String value1, String value2) {
            addCriterion("SUMATTENTIONSTATUS between", value1, value2, "sumattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSumattentionstatusNotBetween(String value1, String value2) {
            addCriterion("SUMATTENTIONSTATUS not between", value1, value2, "sumattentionstatus");
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