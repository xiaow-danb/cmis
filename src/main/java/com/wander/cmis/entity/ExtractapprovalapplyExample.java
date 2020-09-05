package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExtractapprovalapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExtractapprovalapplyExample() {
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

        public Criteria andBatchnumberIsNull() {
            addCriterion("BATCHNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIsNotNull() {
            addCriterion("BATCHNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBatchnumberEqualTo(String value) {
            addCriterion("BATCHNUMBER =", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotEqualTo(String value) {
            addCriterion("BATCHNUMBER <>", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThan(String value) {
            addCriterion("BATCHNUMBER >", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BATCHNUMBER >=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThan(String value) {
            addCriterion("BATCHNUMBER <", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLessThanOrEqualTo(String value) {
            addCriterion("BATCHNUMBER <=", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberLike(String value) {
            addCriterion("BATCHNUMBER like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotLike(String value) {
            addCriterion("BATCHNUMBER not like", value, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberIn(List<String> values) {
            addCriterion("BATCHNUMBER in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotIn(List<String> values) {
            addCriterion("BATCHNUMBER not in", values, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberBetween(String value1, String value2) {
            addCriterion("BATCHNUMBER between", value1, value2, "batchnumber");
            return (Criteria) this;
        }

        public Criteria andBatchnumberNotBetween(String value1, String value2) {
            addCriterion("BATCHNUMBER not between", value1, value2, "batchnumber");
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

        public Criteria andTotalIsNull() {
            addCriterion("TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("TOTAL =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("TOTAL <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("TOTAL >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("TOTAL <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("TOTAL in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("TOTAL not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("TOTAL between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL not between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNull() {
            addCriterion("TOTALMONEY is null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIsNotNull() {
            addCriterion("TOTALMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyEqualTo(BigDecimal value) {
            addCriterion("TOTALMONEY =", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotEqualTo(BigDecimal value) {
            addCriterion("TOTALMONEY <>", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThan(BigDecimal value) {
            addCriterion("TOTALMONEY >", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALMONEY >=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThan(BigDecimal value) {
            addCriterion("TOTALMONEY <", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALMONEY <=", value, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyIn(List<BigDecimal> values) {
            addCriterion("TOTALMONEY in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotIn(List<BigDecimal> values) {
            addCriterion("TOTALMONEY not in", values, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALMONEY between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andTotalmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALMONEY not between", value1, value2, "totalmoney");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("OPERATOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("OPERATOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(String value) {
            addCriterion("OPERATOR_ID =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(String value) {
            addCriterion("OPERATOR_ID <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(String value) {
            addCriterion("OPERATOR_ID >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_ID >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(String value) {
            addCriterion("OPERATOR_ID <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_ID <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLike(String value) {
            addCriterion("OPERATOR_ID like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotLike(String value) {
            addCriterion("OPERATOR_ID not like", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<String> values) {
            addCriterion("OPERATOR_ID in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<String> values) {
            addCriterion("OPERATOR_ID not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(String value1, String value2) {
            addCriterion("OPERATOR_ID between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_ID not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("ORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("ORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(String value) {
            addCriterion("ORGANIZATION_ID =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(String value) {
            addCriterion("ORGANIZATION_ID >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(String value) {
            addCriterion("ORGANIZATION_ID <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION_ID <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLike(String value) {
            addCriterion("ORGANIZATION_ID like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotLike(String value) {
            addCriterion("ORGANIZATION_ID not like", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<String> values) {
            addCriterion("ORGANIZATION_ID in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<String> values) {
            addCriterion("ORGANIZATION_ID not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION_ID not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdIsNull() {
            addCriterion("POLICYFORMALLETTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdIsNotNull() {
            addCriterion("POLICYFORMALLETTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdEqualTo(String value) {
            addCriterion("POLICYFORMALLETTER_ID =", value, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdNotEqualTo(String value) {
            addCriterion("POLICYFORMALLETTER_ID <>", value, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdGreaterThan(String value) {
            addCriterion("POLICYFORMALLETTER_ID >", value, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYFORMALLETTER_ID >=", value, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdLessThan(String value) {
            addCriterion("POLICYFORMALLETTER_ID <", value, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdLessThanOrEqualTo(String value) {
            addCriterion("POLICYFORMALLETTER_ID <=", value, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdLike(String value) {
            addCriterion("POLICYFORMALLETTER_ID like", value, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdNotLike(String value) {
            addCriterion("POLICYFORMALLETTER_ID not like", value, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdIn(List<String> values) {
            addCriterion("POLICYFORMALLETTER_ID in", values, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdNotIn(List<String> values) {
            addCriterion("POLICYFORMALLETTER_ID not in", values, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdBetween(String value1, String value2) {
            addCriterion("POLICYFORMALLETTER_ID between", value1, value2, "policyformalletterId");
            return (Criteria) this;
        }

        public Criteria andPolicyformalletterIdNotBetween(String value1, String value2) {
            addCriterion("POLICYFORMALLETTER_ID not between", value1, value2, "policyformalletterId");
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

        public Criteria andIssuperviseIsNull() {
            addCriterion("ISSUPERVISE is null");
            return (Criteria) this;
        }

        public Criteria andIssuperviseIsNotNull() {
            addCriterion("ISSUPERVISE is not null");
            return (Criteria) this;
        }

        public Criteria andIssuperviseEqualTo(String value) {
            addCriterion("ISSUPERVISE =", value, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseNotEqualTo(String value) {
            addCriterion("ISSUPERVISE <>", value, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseGreaterThan(String value) {
            addCriterion("ISSUPERVISE >", value, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUPERVISE >=", value, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseLessThan(String value) {
            addCriterion("ISSUPERVISE <", value, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseLessThanOrEqualTo(String value) {
            addCriterion("ISSUPERVISE <=", value, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseLike(String value) {
            addCriterion("ISSUPERVISE like", value, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseNotLike(String value) {
            addCriterion("ISSUPERVISE not like", value, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseIn(List<String> values) {
            addCriterion("ISSUPERVISE in", values, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseNotIn(List<String> values) {
            addCriterion("ISSUPERVISE not in", values, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseBetween(String value1, String value2) {
            addCriterion("ISSUPERVISE between", value1, value2, "issupervise");
            return (Criteria) this;
        }

        public Criteria andIssuperviseNotBetween(String value1, String value2) {
            addCriterion("ISSUPERVISE not between", value1, value2, "issupervise");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameIsNull() {
            addCriterion("CURRENTFLOWNAME is null");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameIsNotNull() {
            addCriterion("CURRENTFLOWNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameEqualTo(String value) {
            addCriterion("CURRENTFLOWNAME =", value, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameNotEqualTo(String value) {
            addCriterion("CURRENTFLOWNAME <>", value, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameGreaterThan(String value) {
            addCriterion("CURRENTFLOWNAME >", value, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTFLOWNAME >=", value, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameLessThan(String value) {
            addCriterion("CURRENTFLOWNAME <", value, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameLessThanOrEqualTo(String value) {
            addCriterion("CURRENTFLOWNAME <=", value, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameLike(String value) {
            addCriterion("CURRENTFLOWNAME like", value, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameNotLike(String value) {
            addCriterion("CURRENTFLOWNAME not like", value, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameIn(List<String> values) {
            addCriterion("CURRENTFLOWNAME in", values, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameNotIn(List<String> values) {
            addCriterion("CURRENTFLOWNAME not in", values, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameBetween(String value1, String value2) {
            addCriterion("CURRENTFLOWNAME between", value1, value2, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andCurrentflownameNotBetween(String value1, String value2) {
            addCriterion("CURRENTFLOWNAME not between", value1, value2, "currentflowname");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIsNull() {
            addCriterion("ISFINISHED is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIsNotNull() {
            addCriterion("ISFINISHED is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishedEqualTo(String value) {
            addCriterion("ISFINISHED =", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotEqualTo(String value) {
            addCriterion("ISFINISHED <>", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedGreaterThan(String value) {
            addCriterion("ISFINISHED >", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedGreaterThanOrEqualTo(String value) {
            addCriterion("ISFINISHED >=", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedLessThan(String value) {
            addCriterion("ISFINISHED <", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedLessThanOrEqualTo(String value) {
            addCriterion("ISFINISHED <=", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedLike(String value) {
            addCriterion("ISFINISHED like", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotLike(String value) {
            addCriterion("ISFINISHED not like", value, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedIn(List<String> values) {
            addCriterion("ISFINISHED in", values, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotIn(List<String> values) {
            addCriterion("ISFINISHED not in", values, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedBetween(String value1, String value2) {
            addCriterion("ISFINISHED between", value1, value2, "isfinished");
            return (Criteria) this;
        }

        public Criteria andIsfinishedNotBetween(String value1, String value2) {
            addCriterion("ISFINISHED not between", value1, value2, "isfinished");
            return (Criteria) this;
        }

        public Criteria andClienttypeIsNull() {
            addCriterion("CLIENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClienttypeIsNotNull() {
            addCriterion("CLIENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClienttypeEqualTo(String value) {
            addCriterion("CLIENTTYPE =", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotEqualTo(String value) {
            addCriterion("CLIENTTYPE <>", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeGreaterThan(String value) {
            addCriterion("CLIENTTYPE >", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTTYPE >=", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeLessThan(String value) {
            addCriterion("CLIENTTYPE <", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeLessThanOrEqualTo(String value) {
            addCriterion("CLIENTTYPE <=", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeLike(String value) {
            addCriterion("CLIENTTYPE like", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotLike(String value) {
            addCriterion("CLIENTTYPE not like", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeIn(List<String> values) {
            addCriterion("CLIENTTYPE in", values, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotIn(List<String> values) {
            addCriterion("CLIENTTYPE not in", values, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeBetween(String value1, String value2) {
            addCriterion("CLIENTTYPE between", value1, value2, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotBetween(String value1, String value2) {
            addCriterion("CLIENTTYPE not between", value1, value2, "clienttype");
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

        public Criteria andIspartnerprojectsIsNull() {
            addCriterion("ISPARTNERPROJECTS is null");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsIsNotNull() {
            addCriterion("ISPARTNERPROJECTS is not null");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsEqualTo(Short value) {
            addCriterion("ISPARTNERPROJECTS =", value, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsNotEqualTo(Short value) {
            addCriterion("ISPARTNERPROJECTS <>", value, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsGreaterThan(Short value) {
            addCriterion("ISPARTNERPROJECTS >", value, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsGreaterThanOrEqualTo(Short value) {
            addCriterion("ISPARTNERPROJECTS >=", value, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsLessThan(Short value) {
            addCriterion("ISPARTNERPROJECTS <", value, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsLessThanOrEqualTo(Short value) {
            addCriterion("ISPARTNERPROJECTS <=", value, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsIn(List<Short> values) {
            addCriterion("ISPARTNERPROJECTS in", values, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsNotIn(List<Short> values) {
            addCriterion("ISPARTNERPROJECTS not in", values, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsBetween(Short value1, Short value2) {
            addCriterion("ISPARTNERPROJECTS between", value1, value2, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andIspartnerprojectsNotBetween(Short value1, Short value2) {
            addCriterion("ISPARTNERPROJECTS not between", value1, value2, "ispartnerprojects");
            return (Criteria) this;
        }

        public Criteria andProcesskindIsNull() {
            addCriterion("PROCESSKIND is null");
            return (Criteria) this;
        }

        public Criteria andProcesskindIsNotNull() {
            addCriterion("PROCESSKIND is not null");
            return (Criteria) this;
        }

        public Criteria andProcesskindEqualTo(String value) {
            addCriterion("PROCESSKIND =", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindNotEqualTo(String value) {
            addCriterion("PROCESSKIND <>", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindGreaterThan(String value) {
            addCriterion("PROCESSKIND >", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSKIND >=", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindLessThan(String value) {
            addCriterion("PROCESSKIND <", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindLessThanOrEqualTo(String value) {
            addCriterion("PROCESSKIND <=", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindLike(String value) {
            addCriterion("PROCESSKIND like", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindNotLike(String value) {
            addCriterion("PROCESSKIND not like", value, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindIn(List<String> values) {
            addCriterion("PROCESSKIND in", values, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindNotIn(List<String> values) {
            addCriterion("PROCESSKIND not in", values, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindBetween(String value1, String value2) {
            addCriterion("PROCESSKIND between", value1, value2, "processkind");
            return (Criteria) this;
        }

        public Criteria andProcesskindNotBetween(String value1, String value2) {
            addCriterion("PROCESSKIND not between", value1, value2, "processkind");
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