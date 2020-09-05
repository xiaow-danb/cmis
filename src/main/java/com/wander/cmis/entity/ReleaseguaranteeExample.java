package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReleaseguaranteeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReleaseguaranteeExample() {
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

        public Criteria andReleasetypeIsNull() {
            addCriterion("RELEASETYPE is null");
            return (Criteria) this;
        }

        public Criteria andReleasetypeIsNotNull() {
            addCriterion("RELEASETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReleasetypeEqualTo(Long value) {
            addCriterion("RELEASETYPE =", value, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeNotEqualTo(Long value) {
            addCriterion("RELEASETYPE <>", value, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeGreaterThan(Long value) {
            addCriterion("RELEASETYPE >", value, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeGreaterThanOrEqualTo(Long value) {
            addCriterion("RELEASETYPE >=", value, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeLessThan(Long value) {
            addCriterion("RELEASETYPE <", value, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeLessThanOrEqualTo(Long value) {
            addCriterion("RELEASETYPE <=", value, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeIn(List<Long> values) {
            addCriterion("RELEASETYPE in", values, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeNotIn(List<Long> values) {
            addCriterion("RELEASETYPE not in", values, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeBetween(Long value1, Long value2) {
            addCriterion("RELEASETYPE between", value1, value2, "releasetype");
            return (Criteria) this;
        }

        public Criteria andReleasetypeNotBetween(Long value1, Long value2) {
            addCriterion("RELEASETYPE not between", value1, value2, "releasetype");
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

        public Criteria andApplybackguarmoneyIsNull() {
            addCriterion("APPLYBACKGUARMONEY is null");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyIsNotNull() {
            addCriterion("APPLYBACKGUARMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyEqualTo(BigDecimal value) {
            addCriterion("APPLYBACKGUARMONEY =", value, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyNotEqualTo(BigDecimal value) {
            addCriterion("APPLYBACKGUARMONEY <>", value, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyGreaterThan(BigDecimal value) {
            addCriterion("APPLYBACKGUARMONEY >", value, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYBACKGUARMONEY >=", value, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyLessThan(BigDecimal value) {
            addCriterion("APPLYBACKGUARMONEY <", value, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPLYBACKGUARMONEY <=", value, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyIn(List<BigDecimal> values) {
            addCriterion("APPLYBACKGUARMONEY in", values, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyNotIn(List<BigDecimal> values) {
            addCriterion("APPLYBACKGUARMONEY not in", values, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYBACKGUARMONEY between", value1, value2, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andApplybackguarmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPLYBACKGUARMONEY not between", value1, value2, "applybackguarmoney");
            return (Criteria) this;
        }

        public Criteria andBackbankIsNull() {
            addCriterion("BACKBANK is null");
            return (Criteria) this;
        }

        public Criteria andBackbankIsNotNull() {
            addCriterion("BACKBANK is not null");
            return (Criteria) this;
        }

        public Criteria andBackbankEqualTo(String value) {
            addCriterion("BACKBANK =", value, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankNotEqualTo(String value) {
            addCriterion("BACKBANK <>", value, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankGreaterThan(String value) {
            addCriterion("BACKBANK >", value, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankGreaterThanOrEqualTo(String value) {
            addCriterion("BACKBANK >=", value, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankLessThan(String value) {
            addCriterion("BACKBANK <", value, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankLessThanOrEqualTo(String value) {
            addCriterion("BACKBANK <=", value, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankLike(String value) {
            addCriterion("BACKBANK like", value, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankNotLike(String value) {
            addCriterion("BACKBANK not like", value, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankIn(List<String> values) {
            addCriterion("BACKBANK in", values, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankNotIn(List<String> values) {
            addCriterion("BACKBANK not in", values, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankBetween(String value1, String value2) {
            addCriterion("BACKBANK between", value1, value2, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackbankNotBetween(String value1, String value2) {
            addCriterion("BACKBANK not between", value1, value2, "backbank");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateIsNull() {
            addCriterion("BACKGUARMONEYDATE is null");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateIsNotNull() {
            addCriterion("BACKGUARMONEYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateEqualTo(BigDecimal value) {
            addCriterion("BACKGUARMONEYDATE =", value, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateNotEqualTo(BigDecimal value) {
            addCriterion("BACKGUARMONEYDATE <>", value, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateGreaterThan(BigDecimal value) {
            addCriterion("BACKGUARMONEYDATE >", value, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKGUARMONEYDATE >=", value, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateLessThan(BigDecimal value) {
            addCriterion("BACKGUARMONEYDATE <", value, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKGUARMONEYDATE <=", value, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateIn(List<BigDecimal> values) {
            addCriterion("BACKGUARMONEYDATE in", values, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateNotIn(List<BigDecimal> values) {
            addCriterion("BACKGUARMONEYDATE not in", values, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKGUARMONEYDATE between", value1, value2, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBackguarmoneydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKGUARMONEYDATE not between", value1, value2, "backguarmoneydate");
            return (Criteria) this;
        }

        public Criteria andBacknumIsNull() {
            addCriterion("BACKNUM is null");
            return (Criteria) this;
        }

        public Criteria andBacknumIsNotNull() {
            addCriterion("BACKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBacknumEqualTo(String value) {
            addCriterion("BACKNUM =", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotEqualTo(String value) {
            addCriterion("BACKNUM <>", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumGreaterThan(String value) {
            addCriterion("BACKNUM >", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumGreaterThanOrEqualTo(String value) {
            addCriterion("BACKNUM >=", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumLessThan(String value) {
            addCriterion("BACKNUM <", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumLessThanOrEqualTo(String value) {
            addCriterion("BACKNUM <=", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumLike(String value) {
            addCriterion("BACKNUM like", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotLike(String value) {
            addCriterion("BACKNUM not like", value, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumIn(List<String> values) {
            addCriterion("BACKNUM in", values, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotIn(List<String> values) {
            addCriterion("BACKNUM not in", values, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumBetween(String value1, String value2) {
            addCriterion("BACKNUM between", value1, value2, "backnum");
            return (Criteria) this;
        }

        public Criteria andBacknumNotBetween(String value1, String value2) {
            addCriterion("BACKNUM not between", value1, value2, "backnum");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageIsNull() {
            addCriterion("ISENTERNEXTSTAGE is null");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageIsNotNull() {
            addCriterion("ISENTERNEXTSTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageEqualTo(Short value) {
            addCriterion("ISENTERNEXTSTAGE =", value, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageNotEqualTo(Short value) {
            addCriterion("ISENTERNEXTSTAGE <>", value, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageGreaterThan(Short value) {
            addCriterion("ISENTERNEXTSTAGE >", value, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageGreaterThanOrEqualTo(Short value) {
            addCriterion("ISENTERNEXTSTAGE >=", value, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageLessThan(Short value) {
            addCriterion("ISENTERNEXTSTAGE <", value, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageLessThanOrEqualTo(Short value) {
            addCriterion("ISENTERNEXTSTAGE <=", value, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageIn(List<Short> values) {
            addCriterion("ISENTERNEXTSTAGE in", values, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageNotIn(List<Short> values) {
            addCriterion("ISENTERNEXTSTAGE not in", values, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageBetween(Short value1, Short value2) {
            addCriterion("ISENTERNEXTSTAGE between", value1, value2, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andIsenternextstageNotBetween(Short value1, Short value2) {
            addCriterion("ISENTERNEXTSTAGE not between", value1, value2, "isenternextstage");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("RELEASEDATE is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("RELEASEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(BigDecimal value) {
            addCriterion("RELEASEDATE =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(BigDecimal value) {
            addCriterion("RELEASEDATE <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(BigDecimal value) {
            addCriterion("RELEASEDATE >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEDATE >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(BigDecimal value) {
            addCriterion("RELEASEDATE <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEDATE <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<BigDecimal> values) {
            addCriterion("RELEASEDATE in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<BigDecimal> values) {
            addCriterion("RELEASEDATE not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEDATE between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEDATE not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyIsNull() {
            addCriterion("RELEASEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyIsNotNull() {
            addCriterion("RELEASEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyEqualTo(BigDecimal value) {
            addCriterion("RELEASEMONEY =", value, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyNotEqualTo(BigDecimal value) {
            addCriterion("RELEASEMONEY <>", value, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyGreaterThan(BigDecimal value) {
            addCriterion("RELEASEMONEY >", value, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEMONEY >=", value, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyLessThan(BigDecimal value) {
            addCriterion("RELEASEMONEY <", value, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEMONEY <=", value, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyIn(List<BigDecimal> values) {
            addCriterion("RELEASEMONEY in", values, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyNotIn(List<BigDecimal> values) {
            addCriterion("RELEASEMONEY not in", values, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEMONEY between", value1, value2, "releasemoney");
            return (Criteria) this;
        }

        public Criteria andReleasemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEMONEY not between", value1, value2, "releasemoney");
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

        public Criteria andStoreenddateIsNull() {
            addCriterion("STOREENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andStoreenddateIsNotNull() {
            addCriterion("STOREENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStoreenddateEqualTo(BigDecimal value) {
            addCriterion("STOREENDDATE =", value, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateNotEqualTo(BigDecimal value) {
            addCriterion("STOREENDDATE <>", value, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateGreaterThan(BigDecimal value) {
            addCriterion("STOREENDDATE >", value, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STOREENDDATE >=", value, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateLessThan(BigDecimal value) {
            addCriterion("STOREENDDATE <", value, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STOREENDDATE <=", value, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateIn(List<BigDecimal> values) {
            addCriterion("STOREENDDATE in", values, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateNotIn(List<BigDecimal> values) {
            addCriterion("STOREENDDATE not in", values, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOREENDDATE between", value1, value2, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStoreenddateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STOREENDDATE not between", value1, value2, "storeenddate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateIsNull() {
            addCriterion("STORESTARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStorestartdateIsNotNull() {
            addCriterion("STORESTARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStorestartdateEqualTo(BigDecimal value) {
            addCriterion("STORESTARTDATE =", value, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateNotEqualTo(BigDecimal value) {
            addCriterion("STORESTARTDATE <>", value, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateGreaterThan(BigDecimal value) {
            addCriterion("STORESTARTDATE >", value, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STORESTARTDATE >=", value, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateLessThan(BigDecimal value) {
            addCriterion("STORESTARTDATE <", value, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STORESTARTDATE <=", value, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateIn(List<BigDecimal> values) {
            addCriterion("STORESTARTDATE in", values, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateNotIn(List<BigDecimal> values) {
            addCriterion("STORESTARTDATE not in", values, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORESTARTDATE between", value1, value2, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andStorestartdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STORESTARTDATE not between", value1, value2, "storestartdate");
            return (Criteria) this;
        }

        public Criteria andReplaceamountIsNull() {
            addCriterion("REPLACEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReplaceamountIsNotNull() {
            addCriterion("REPLACEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceamountEqualTo(BigDecimal value) {
            addCriterion("REPLACEAMOUNT =", value, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountNotEqualTo(BigDecimal value) {
            addCriterion("REPLACEAMOUNT <>", value, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountGreaterThan(BigDecimal value) {
            addCriterion("REPLACEAMOUNT >", value, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEAMOUNT >=", value, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountLessThan(BigDecimal value) {
            addCriterion("REPLACEAMOUNT <", value, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEAMOUNT <=", value, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountIn(List<BigDecimal> values) {
            addCriterion("REPLACEAMOUNT in", values, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountNotIn(List<BigDecimal> values) {
            addCriterion("REPLACEAMOUNT not in", values, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEAMOUNT between", value1, value2, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEAMOUNT not between", value1, value2, "replaceamount");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestIsNull() {
            addCriterion("REPLACEINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestIsNotNull() {
            addCriterion("REPLACEINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestEqualTo(BigDecimal value) {
            addCriterion("REPLACEINTEREST =", value, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestNotEqualTo(BigDecimal value) {
            addCriterion("REPLACEINTEREST <>", value, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestGreaterThan(BigDecimal value) {
            addCriterion("REPLACEINTEREST >", value, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEINTEREST >=", value, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestLessThan(BigDecimal value) {
            addCriterion("REPLACEINTEREST <", value, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEINTEREST <=", value, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestIn(List<BigDecimal> values) {
            addCriterion("REPLACEINTEREST in", values, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestNotIn(List<BigDecimal> values) {
            addCriterion("REPLACEINTEREST not in", values, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEINTEREST between", value1, value2, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplaceinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEINTEREST not between", value1, value2, "replaceinterest");
            return (Criteria) this;
        }

        public Criteria andReplacerateIsNull() {
            addCriterion("REPLACERATE is null");
            return (Criteria) this;
        }

        public Criteria andReplacerateIsNotNull() {
            addCriterion("REPLACERATE is not null");
            return (Criteria) this;
        }

        public Criteria andReplacerateEqualTo(Double value) {
            addCriterion("REPLACERATE =", value, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateNotEqualTo(Double value) {
            addCriterion("REPLACERATE <>", value, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateGreaterThan(Double value) {
            addCriterion("REPLACERATE >", value, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateGreaterThanOrEqualTo(Double value) {
            addCriterion("REPLACERATE >=", value, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateLessThan(Double value) {
            addCriterion("REPLACERATE <", value, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateLessThanOrEqualTo(Double value) {
            addCriterion("REPLACERATE <=", value, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateIn(List<Double> values) {
            addCriterion("REPLACERATE in", values, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateNotIn(List<Double> values) {
            addCriterion("REPLACERATE not in", values, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateBetween(Double value1, Double value2) {
            addCriterion("REPLACERATE between", value1, value2, "replacerate");
            return (Criteria) this;
        }

        public Criteria andReplacerateNotBetween(Double value1, Double value2) {
            addCriterion("REPLACERATE not between", value1, value2, "replacerate");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyIsNull() {
            addCriterion("BACKPLEDGEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyIsNotNull() {
            addCriterion("BACKPLEDGEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyEqualTo(BigDecimal value) {
            addCriterion("BACKPLEDGEMONEY =", value, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyNotEqualTo(BigDecimal value) {
            addCriterion("BACKPLEDGEMONEY <>", value, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyGreaterThan(BigDecimal value) {
            addCriterion("BACKPLEDGEMONEY >", value, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKPLEDGEMONEY >=", value, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyLessThan(BigDecimal value) {
            addCriterion("BACKPLEDGEMONEY <", value, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKPLEDGEMONEY <=", value, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyIn(List<BigDecimal> values) {
            addCriterion("BACKPLEDGEMONEY in", values, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyNotIn(List<BigDecimal> values) {
            addCriterion("BACKPLEDGEMONEY not in", values, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKPLEDGEMONEY between", value1, value2, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andBackpledgemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKPLEDGEMONEY not between", value1, value2, "backpledgemoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyIsNull() {
            addCriterion("FACTAVOUCHMONEY is null");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyIsNotNull() {
            addCriterion("FACTAVOUCHMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyEqualTo(BigDecimal value) {
            addCriterion("FACTAVOUCHMONEY =", value, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyNotEqualTo(BigDecimal value) {
            addCriterion("FACTAVOUCHMONEY <>", value, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyGreaterThan(BigDecimal value) {
            addCriterion("FACTAVOUCHMONEY >", value, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTAVOUCHMONEY >=", value, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyLessThan(BigDecimal value) {
            addCriterion("FACTAVOUCHMONEY <", value, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTAVOUCHMONEY <=", value, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyIn(List<BigDecimal> values) {
            addCriterion("FACTAVOUCHMONEY in", values, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyNotIn(List<BigDecimal> values) {
            addCriterion("FACTAVOUCHMONEY not in", values, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTAVOUCHMONEY between", value1, value2, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFactavouchmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTAVOUCHMONEY not between", value1, value2, "factavouchmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyIsNull() {
            addCriterion("FLOWGUARMONEY is null");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyIsNotNull() {
            addCriterion("FLOWGUARMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyEqualTo(BigDecimal value) {
            addCriterion("FLOWGUARMONEY =", value, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyNotEqualTo(BigDecimal value) {
            addCriterion("FLOWGUARMONEY <>", value, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyGreaterThan(BigDecimal value) {
            addCriterion("FLOWGUARMONEY >", value, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOWGUARMONEY >=", value, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyLessThan(BigDecimal value) {
            addCriterion("FLOWGUARMONEY <", value, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOWGUARMONEY <=", value, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyIn(List<BigDecimal> values) {
            addCriterion("FLOWGUARMONEY in", values, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyNotIn(List<BigDecimal> values) {
            addCriterion("FLOWGUARMONEY not in", values, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOWGUARMONEY between", value1, value2, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andFlowguarmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOWGUARMONEY not between", value1, value2, "flowguarmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyIsNull() {
            addCriterion("ISBACKMONEY is null");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyIsNotNull() {
            addCriterion("ISBACKMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyEqualTo(Short value) {
            addCriterion("ISBACKMONEY =", value, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyNotEqualTo(Short value) {
            addCriterion("ISBACKMONEY <>", value, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyGreaterThan(Short value) {
            addCriterion("ISBACKMONEY >", value, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyGreaterThanOrEqualTo(Short value) {
            addCriterion("ISBACKMONEY >=", value, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyLessThan(Short value) {
            addCriterion("ISBACKMONEY <", value, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyLessThanOrEqualTo(Short value) {
            addCriterion("ISBACKMONEY <=", value, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyIn(List<Short> values) {
            addCriterion("ISBACKMONEY in", values, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyNotIn(List<Short> values) {
            addCriterion("ISBACKMONEY not in", values, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyBetween(Short value1, Short value2) {
            addCriterion("ISBACKMONEY between", value1, value2, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackmoneyNotBetween(Short value1, Short value2) {
            addCriterion("ISBACKMONEY not between", value1, value2, "isbackmoney");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantIsNull() {
            addCriterion("ISBACKWARRANT is null");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantIsNotNull() {
            addCriterion("ISBACKWARRANT is not null");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantEqualTo(Short value) {
            addCriterion("ISBACKWARRANT =", value, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantNotEqualTo(Short value) {
            addCriterion("ISBACKWARRANT <>", value, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantGreaterThan(Short value) {
            addCriterion("ISBACKWARRANT >", value, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantGreaterThanOrEqualTo(Short value) {
            addCriterion("ISBACKWARRANT >=", value, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantLessThan(Short value) {
            addCriterion("ISBACKWARRANT <", value, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantLessThanOrEqualTo(Short value) {
            addCriterion("ISBACKWARRANT <=", value, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantIn(List<Short> values) {
            addCriterion("ISBACKWARRANT in", values, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantNotIn(List<Short> values) {
            addCriterion("ISBACKWARRANT not in", values, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantBetween(Short value1, Short value2) {
            addCriterion("ISBACKWARRANT between", value1, value2, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andIsbackwarrantNotBetween(Short value1, Short value2) {
            addCriterion("ISBACKWARRANT not between", value1, value2, "isbackwarrant");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyIsNull() {
            addCriterion("OUTPLEDGEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyIsNotNull() {
            addCriterion("OUTPLEDGEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyEqualTo(BigDecimal value) {
            addCriterion("OUTPLEDGEMONEY =", value, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyNotEqualTo(BigDecimal value) {
            addCriterion("OUTPLEDGEMONEY <>", value, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyGreaterThan(BigDecimal value) {
            addCriterion("OUTPLEDGEMONEY >", value, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTPLEDGEMONEY >=", value, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyLessThan(BigDecimal value) {
            addCriterion("OUTPLEDGEMONEY <", value, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OUTPLEDGEMONEY <=", value, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyIn(List<BigDecimal> values) {
            addCriterion("OUTPLEDGEMONEY in", values, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyNotIn(List<BigDecimal> values) {
            addCriterion("OUTPLEDGEMONEY not in", values, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTPLEDGEMONEY between", value1, value2, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andOutpledgemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUTPLEDGEMONEY not between", value1, value2, "outpledgemoney");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherIsNull() {
            addCriterion("PAYMENTVOUCHER is null");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherIsNotNull() {
            addCriterion("PAYMENTVOUCHER is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherEqualTo(String value) {
            addCriterion("PAYMENTVOUCHER =", value, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherNotEqualTo(String value) {
            addCriterion("PAYMENTVOUCHER <>", value, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherGreaterThan(String value) {
            addCriterion("PAYMENTVOUCHER >", value, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENTVOUCHER >=", value, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherLessThan(String value) {
            addCriterion("PAYMENTVOUCHER <", value, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherLessThanOrEqualTo(String value) {
            addCriterion("PAYMENTVOUCHER <=", value, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherLike(String value) {
            addCriterion("PAYMENTVOUCHER like", value, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherNotLike(String value) {
            addCriterion("PAYMENTVOUCHER not like", value, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherIn(List<String> values) {
            addCriterion("PAYMENTVOUCHER in", values, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherNotIn(List<String> values) {
            addCriterion("PAYMENTVOUCHER not in", values, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherBetween(String value1, String value2) {
            addCriterion("PAYMENTVOUCHER between", value1, value2, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPaymentvoucherNotBetween(String value1, String value2) {
            addCriterion("PAYMENTVOUCHER not between", value1, value2, "paymentvoucher");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyIsNull() {
            addCriterion("PLANCAUTIONMONEY is null");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyIsNotNull() {
            addCriterion("PLANCAUTIONMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyEqualTo(BigDecimal value) {
            addCriterion("PLANCAUTIONMONEY =", value, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyNotEqualTo(BigDecimal value) {
            addCriterion("PLANCAUTIONMONEY <>", value, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyGreaterThan(BigDecimal value) {
            addCriterion("PLANCAUTIONMONEY >", value, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANCAUTIONMONEY >=", value, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyLessThan(BigDecimal value) {
            addCriterion("PLANCAUTIONMONEY <", value, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PLANCAUTIONMONEY <=", value, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyIn(List<BigDecimal> values) {
            addCriterion("PLANCAUTIONMONEY in", values, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyNotIn(List<BigDecimal> values) {
            addCriterion("PLANCAUTIONMONEY not in", values, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANCAUTIONMONEY between", value1, value2, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andPlancautionmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PLANCAUTIONMONEY not between", value1, value2, "plancautionmoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyIsNull() {
            addCriterion("RELEASEAFTERMONEY is null");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyIsNotNull() {
            addCriterion("RELEASEAFTERMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyEqualTo(BigDecimal value) {
            addCriterion("RELEASEAFTERMONEY =", value, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyNotEqualTo(BigDecimal value) {
            addCriterion("RELEASEAFTERMONEY <>", value, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyGreaterThan(BigDecimal value) {
            addCriterion("RELEASEAFTERMONEY >", value, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEAFTERMONEY >=", value, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyLessThan(BigDecimal value) {
            addCriterion("RELEASEAFTERMONEY <", value, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEAFTERMONEY <=", value, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyIn(List<BigDecimal> values) {
            addCriterion("RELEASEAFTERMONEY in", values, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyNotIn(List<BigDecimal> values) {
            addCriterion("RELEASEAFTERMONEY not in", values, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEAFTERMONEY between", value1, value2, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleaseaftermoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEAFTERMONEY not between", value1, value2, "releaseaftermoney");
            return (Criteria) this;
        }

        public Criteria andReleasememoIsNull() {
            addCriterion("RELEASEMEMO is null");
            return (Criteria) this;
        }

        public Criteria andReleasememoIsNotNull() {
            addCriterion("RELEASEMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andReleasememoEqualTo(String value) {
            addCriterion("RELEASEMEMO =", value, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoNotEqualTo(String value) {
            addCriterion("RELEASEMEMO <>", value, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoGreaterThan(String value) {
            addCriterion("RELEASEMEMO >", value, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASEMEMO >=", value, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoLessThan(String value) {
            addCriterion("RELEASEMEMO <", value, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoLessThanOrEqualTo(String value) {
            addCriterion("RELEASEMEMO <=", value, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoLike(String value) {
            addCriterion("RELEASEMEMO like", value, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoNotLike(String value) {
            addCriterion("RELEASEMEMO not like", value, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoIn(List<String> values) {
            addCriterion("RELEASEMEMO in", values, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoNotIn(List<String> values) {
            addCriterion("RELEASEMEMO not in", values, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoBetween(String value1, String value2) {
            addCriterion("RELEASEMEMO between", value1, value2, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleasememoNotBetween(String value1, String value2) {
            addCriterion("RELEASEMEMO not between", value1, value2, "releasememo");
            return (Criteria) this;
        }

        public Criteria andReleaseresonIsNull() {
            addCriterion("RELEASERESON is null");
            return (Criteria) this;
        }

        public Criteria andReleaseresonIsNotNull() {
            addCriterion("RELEASERESON is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseresonEqualTo(String value) {
            addCriterion("RELEASERESON =", value, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonNotEqualTo(String value) {
            addCriterion("RELEASERESON <>", value, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonGreaterThan(String value) {
            addCriterion("RELEASERESON >", value, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonGreaterThanOrEqualTo(String value) {
            addCriterion("RELEASERESON >=", value, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonLessThan(String value) {
            addCriterion("RELEASERESON <", value, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonLessThanOrEqualTo(String value) {
            addCriterion("RELEASERESON <=", value, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonLike(String value) {
            addCriterion("RELEASERESON like", value, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonNotLike(String value) {
            addCriterion("RELEASERESON not like", value, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonIn(List<String> values) {
            addCriterion("RELEASERESON in", values, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonNotIn(List<String> values) {
            addCriterion("RELEASERESON not in", values, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonBetween(String value1, String value2) {
            addCriterion("RELEASERESON between", value1, value2, "releasereson");
            return (Criteria) this;
        }

        public Criteria andReleaseresonNotBetween(String value1, String value2) {
            addCriterion("RELEASERESON not between", value1, value2, "releasereson");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyIsNull() {
            addCriterion("RELESECAUTIONMONEY is null");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyIsNotNull() {
            addCriterion("RELESECAUTIONMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyEqualTo(BigDecimal value) {
            addCriterion("RELESECAUTIONMONEY =", value, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyNotEqualTo(BigDecimal value) {
            addCriterion("RELESECAUTIONMONEY <>", value, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyGreaterThan(BigDecimal value) {
            addCriterion("RELESECAUTIONMONEY >", value, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELESECAUTIONMONEY >=", value, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyLessThan(BigDecimal value) {
            addCriterion("RELESECAUTIONMONEY <", value, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELESECAUTIONMONEY <=", value, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyIn(List<BigDecimal> values) {
            addCriterion("RELESECAUTIONMONEY in", values, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyNotIn(List<BigDecimal> values) {
            addCriterion("RELESECAUTIONMONEY not in", values, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELESECAUTIONMONEY between", value1, value2, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andRelesecautionmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELESECAUTIONMONEY not between", value1, value2, "relesecautionmoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyIsNull() {
            addCriterion("UNITEPLEDGEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyIsNotNull() {
            addCriterion("UNITEPLEDGEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyEqualTo(BigDecimal value) {
            addCriterion("UNITEPLEDGEMONEY =", value, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyNotEqualTo(BigDecimal value) {
            addCriterion("UNITEPLEDGEMONEY <>", value, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyGreaterThan(BigDecimal value) {
            addCriterion("UNITEPLEDGEMONEY >", value, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITEPLEDGEMONEY >=", value, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyLessThan(BigDecimal value) {
            addCriterion("UNITEPLEDGEMONEY <", value, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNITEPLEDGEMONEY <=", value, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyIn(List<BigDecimal> values) {
            addCriterion("UNITEPLEDGEMONEY in", values, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyNotIn(List<BigDecimal> values) {
            addCriterion("UNITEPLEDGEMONEY not in", values, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITEPLEDGEMONEY between", value1, value2, "unitepledgemoney");
            return (Criteria) this;
        }

        public Criteria andUnitepledgemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNITEPLEDGEMONEY not between", value1, value2, "unitepledgemoney");
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

        public Criteria andHandlingmanIdIsNull() {
            addCriterion("HANDLINGMAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdIsNotNull() {
            addCriterion("HANDLINGMAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdEqualTo(String value) {
            addCriterion("HANDLINGMAN_ID =", value, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdNotEqualTo(String value) {
            addCriterion("HANDLINGMAN_ID <>", value, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdGreaterThan(String value) {
            addCriterion("HANDLINGMAN_ID >", value, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLINGMAN_ID >=", value, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdLessThan(String value) {
            addCriterion("HANDLINGMAN_ID <", value, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdLessThanOrEqualTo(String value) {
            addCriterion("HANDLINGMAN_ID <=", value, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdLike(String value) {
            addCriterion("HANDLINGMAN_ID like", value, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdNotLike(String value) {
            addCriterion("HANDLINGMAN_ID not like", value, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdIn(List<String> values) {
            addCriterion("HANDLINGMAN_ID in", values, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdNotIn(List<String> values) {
            addCriterion("HANDLINGMAN_ID not in", values, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdBetween(String value1, String value2) {
            addCriterion("HANDLINGMAN_ID between", value1, value2, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andHandlingmanIdNotBetween(String value1, String value2) {
            addCriterion("HANDLINGMAN_ID not between", value1, value2, "handlingmanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdIsNull() {
            addCriterion("REPAYMENTPLAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdIsNotNull() {
            addCriterion("REPAYMENTPLAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdEqualTo(String value) {
            addCriterion("REPAYMENTPLAN_ID =", value, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdNotEqualTo(String value) {
            addCriterion("REPAYMENTPLAN_ID <>", value, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdGreaterThan(String value) {
            addCriterion("REPAYMENTPLAN_ID >", value, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPAYMENTPLAN_ID >=", value, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdLessThan(String value) {
            addCriterion("REPAYMENTPLAN_ID <", value, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdLessThanOrEqualTo(String value) {
            addCriterion("REPAYMENTPLAN_ID <=", value, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdLike(String value) {
            addCriterion("REPAYMENTPLAN_ID like", value, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdNotLike(String value) {
            addCriterion("REPAYMENTPLAN_ID not like", value, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdIn(List<String> values) {
            addCriterion("REPAYMENTPLAN_ID in", values, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdNotIn(List<String> values) {
            addCriterion("REPAYMENTPLAN_ID not in", values, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdBetween(String value1, String value2) {
            addCriterion("REPAYMENTPLAN_ID between", value1, value2, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andRepaymentplanIdNotBetween(String value1, String value2) {
            addCriterion("REPAYMENTPLAN_ID not between", value1, value2, "repaymentplanId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
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

        public Criteria andCompletedatefourIsNull() {
            addCriterion("COMPLETEDATEFOUR is null");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourIsNotNull() {
            addCriterion("COMPLETEDATEFOUR is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATEFOUR =", value, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourNotEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATEFOUR <>", value, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourGreaterThan(BigDecimal value) {
            addCriterion("COMPLETEDATEFOUR >", value, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATEFOUR >=", value, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourLessThan(BigDecimal value) {
            addCriterion("COMPLETEDATEFOUR <", value, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATEFOUR <=", value, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDATEFOUR in", values, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourNotIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDATEFOUR not in", values, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDATEFOUR between", value1, value2, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedatefourNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDATEFOUR not between", value1, value2, "completedatefour");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneIsNull() {
            addCriterion("COMPLETEDATEONE is null");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneIsNotNull() {
            addCriterion("COMPLETEDATEONE is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATEONE =", value, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneNotEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATEONE <>", value, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneGreaterThan(BigDecimal value) {
            addCriterion("COMPLETEDATEONE >", value, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATEONE >=", value, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneLessThan(BigDecimal value) {
            addCriterion("COMPLETEDATEONE <", value, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATEONE <=", value, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDATEONE in", values, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneNotIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDATEONE not in", values, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDATEONE between", value1, value2, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedateoneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDATEONE not between", value1, value2, "completedateone");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeIsNull() {
            addCriterion("COMPLETEDATETHREE is null");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeIsNotNull() {
            addCriterion("COMPLETEDATETHREE is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATETHREE =", value, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeNotEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATETHREE <>", value, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeGreaterThan(BigDecimal value) {
            addCriterion("COMPLETEDATETHREE >", value, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATETHREE >=", value, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeLessThan(BigDecimal value) {
            addCriterion("COMPLETEDATETHREE <", value, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATETHREE <=", value, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDATETHREE in", values, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeNotIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDATETHREE not in", values, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDATETHREE between", value1, value2, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatethreeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDATETHREE not between", value1, value2, "completedatethree");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoIsNull() {
            addCriterion("COMPLETEDATETWO is null");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoIsNotNull() {
            addCriterion("COMPLETEDATETWO is not null");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATETWO =", value, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoNotEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATETWO <>", value, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoGreaterThan(BigDecimal value) {
            addCriterion("COMPLETEDATETWO >", value, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATETWO >=", value, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoLessThan(BigDecimal value) {
            addCriterion("COMPLETEDATETWO <", value, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLETEDATETWO <=", value, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDATETWO in", values, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoNotIn(List<BigDecimal> values) {
            addCriterion("COMPLETEDATETWO not in", values, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDATETWO between", value1, value2, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andCompletedatetwoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLETEDATETWO not between", value1, value2, "completedatetwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourIsNull() {
            addCriterion("HANDLINGMANFOUR is null");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourIsNotNull() {
            addCriterion("HANDLINGMANFOUR is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourEqualTo(String value) {
            addCriterion("HANDLINGMANFOUR =", value, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourNotEqualTo(String value) {
            addCriterion("HANDLINGMANFOUR <>", value, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourGreaterThan(String value) {
            addCriterion("HANDLINGMANFOUR >", value, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLINGMANFOUR >=", value, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourLessThan(String value) {
            addCriterion("HANDLINGMANFOUR <", value, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourLessThanOrEqualTo(String value) {
            addCriterion("HANDLINGMANFOUR <=", value, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourLike(String value) {
            addCriterion("HANDLINGMANFOUR like", value, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourNotLike(String value) {
            addCriterion("HANDLINGMANFOUR not like", value, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourIn(List<String> values) {
            addCriterion("HANDLINGMANFOUR in", values, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourNotIn(List<String> values) {
            addCriterion("HANDLINGMANFOUR not in", values, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourBetween(String value1, String value2) {
            addCriterion("HANDLINGMANFOUR between", value1, value2, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanfourNotBetween(String value1, String value2) {
            addCriterion("HANDLINGMANFOUR not between", value1, value2, "handlingmanfour");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneIsNull() {
            addCriterion("HANDLINGMANONE is null");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneIsNotNull() {
            addCriterion("HANDLINGMANONE is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneEqualTo(String value) {
            addCriterion("HANDLINGMANONE =", value, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneNotEqualTo(String value) {
            addCriterion("HANDLINGMANONE <>", value, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneGreaterThan(String value) {
            addCriterion("HANDLINGMANONE >", value, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLINGMANONE >=", value, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneLessThan(String value) {
            addCriterion("HANDLINGMANONE <", value, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneLessThanOrEqualTo(String value) {
            addCriterion("HANDLINGMANONE <=", value, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneLike(String value) {
            addCriterion("HANDLINGMANONE like", value, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneNotLike(String value) {
            addCriterion("HANDLINGMANONE not like", value, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneIn(List<String> values) {
            addCriterion("HANDLINGMANONE in", values, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneNotIn(List<String> values) {
            addCriterion("HANDLINGMANONE not in", values, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneBetween(String value1, String value2) {
            addCriterion("HANDLINGMANONE between", value1, value2, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanoneNotBetween(String value1, String value2) {
            addCriterion("HANDLINGMANONE not between", value1, value2, "handlingmanone");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeIsNull() {
            addCriterion("HANDLINGMANTHREE is null");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeIsNotNull() {
            addCriterion("HANDLINGMANTHREE is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeEqualTo(String value) {
            addCriterion("HANDLINGMANTHREE =", value, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeNotEqualTo(String value) {
            addCriterion("HANDLINGMANTHREE <>", value, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeGreaterThan(String value) {
            addCriterion("HANDLINGMANTHREE >", value, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLINGMANTHREE >=", value, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeLessThan(String value) {
            addCriterion("HANDLINGMANTHREE <", value, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeLessThanOrEqualTo(String value) {
            addCriterion("HANDLINGMANTHREE <=", value, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeLike(String value) {
            addCriterion("HANDLINGMANTHREE like", value, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeNotLike(String value) {
            addCriterion("HANDLINGMANTHREE not like", value, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeIn(List<String> values) {
            addCriterion("HANDLINGMANTHREE in", values, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeNotIn(List<String> values) {
            addCriterion("HANDLINGMANTHREE not in", values, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeBetween(String value1, String value2) {
            addCriterion("HANDLINGMANTHREE between", value1, value2, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmanthreeNotBetween(String value1, String value2) {
            addCriterion("HANDLINGMANTHREE not between", value1, value2, "handlingmanthree");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoIsNull() {
            addCriterion("HANDLINGMANTWO is null");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoIsNotNull() {
            addCriterion("HANDLINGMANTWO is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoEqualTo(String value) {
            addCriterion("HANDLINGMANTWO =", value, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoNotEqualTo(String value) {
            addCriterion("HANDLINGMANTWO <>", value, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoGreaterThan(String value) {
            addCriterion("HANDLINGMANTWO >", value, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLINGMANTWO >=", value, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoLessThan(String value) {
            addCriterion("HANDLINGMANTWO <", value, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoLessThanOrEqualTo(String value) {
            addCriterion("HANDLINGMANTWO <=", value, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoLike(String value) {
            addCriterion("HANDLINGMANTWO like", value, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoNotLike(String value) {
            addCriterion("HANDLINGMANTWO not like", value, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoIn(List<String> values) {
            addCriterion("HANDLINGMANTWO in", values, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoNotIn(List<String> values) {
            addCriterion("HANDLINGMANTWO not in", values, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoBetween(String value1, String value2) {
            addCriterion("HANDLINGMANTWO between", value1, value2, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andHandlingmantwoNotBetween(String value1, String value2) {
            addCriterion("HANDLINGMANTWO not between", value1, value2, "handlingmantwo");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceIsNull() {
            addCriterion("REPLACEBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceIsNotNull() {
            addCriterion("REPLACEBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceEqualTo(BigDecimal value) {
            addCriterion("REPLACEBALANCE =", value, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceNotEqualTo(BigDecimal value) {
            addCriterion("REPLACEBALANCE <>", value, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceGreaterThan(BigDecimal value) {
            addCriterion("REPLACEBALANCE >", value, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEBALANCE >=", value, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceLessThan(BigDecimal value) {
            addCriterion("REPLACEBALANCE <", value, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEBALANCE <=", value, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceIn(List<BigDecimal> values) {
            addCriterion("REPLACEBALANCE in", values, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceNotIn(List<BigDecimal> values) {
            addCriterion("REPLACEBALANCE not in", values, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEBALANCE between", value1, value2, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEBALANCE not between", value1, value2, "replacebalance");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionIsNull() {
            addCriterion("REPLACEDEDUCTION is null");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionIsNotNull() {
            addCriterion("REPLACEDEDUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionEqualTo(BigDecimal value) {
            addCriterion("REPLACEDEDUCTION =", value, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionNotEqualTo(BigDecimal value) {
            addCriterion("REPLACEDEDUCTION <>", value, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionGreaterThan(BigDecimal value) {
            addCriterion("REPLACEDEDUCTION >", value, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEDEDUCTION >=", value, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionLessThan(BigDecimal value) {
            addCriterion("REPLACEDEDUCTION <", value, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEDEDUCTION <=", value, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionIn(List<BigDecimal> values) {
            addCriterion("REPLACEDEDUCTION in", values, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionNotIn(List<BigDecimal> values) {
            addCriterion("REPLACEDEDUCTION not in", values, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEDEDUCTION between", value1, value2, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacedeductionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEDEDUCTION not between", value1, value2, "replacededuction");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyIsNull() {
            addCriterion("REPLACEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyIsNotNull() {
            addCriterion("REPLACEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyEqualTo(BigDecimal value) {
            addCriterion("REPLACEMONEY =", value, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyNotEqualTo(BigDecimal value) {
            addCriterion("REPLACEMONEY <>", value, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyGreaterThan(BigDecimal value) {
            addCriterion("REPLACEMONEY >", value, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEMONEY >=", value, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyLessThan(BigDecimal value) {
            addCriterion("REPLACEMONEY <", value, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPLACEMONEY <=", value, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyIn(List<BigDecimal> values) {
            addCriterion("REPLACEMONEY in", values, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyNotIn(List<BigDecimal> values) {
            addCriterion("REPLACEMONEY not in", values, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEMONEY between", value1, value2, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andReplacemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPLACEMONEY not between", value1, value2, "replacemoney");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("TIMES is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(String value) {
            addCriterion("TIMES =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(String value) {
            addCriterion("TIMES <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(String value) {
            addCriterion("TIMES >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(String value) {
            addCriterion("TIMES >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(String value) {
            addCriterion("TIMES <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(String value) {
            addCriterion("TIMES <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLike(String value) {
            addCriterion("TIMES like", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotLike(String value) {
            addCriterion("TIMES not like", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<String> values) {
            addCriterion("TIMES in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<String> values) {
            addCriterion("TIMES not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(String value1, String value2) {
            addCriterion("TIMES between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(String value1, String value2) {
            addCriterion("TIMES not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestIsNull() {
            addCriterion("DEFAULTINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestIsNotNull() {
            addCriterion("DEFAULTINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestEqualTo(BigDecimal value) {
            addCriterion("DEFAULTINTEREST =", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestNotEqualTo(BigDecimal value) {
            addCriterion("DEFAULTINTEREST <>", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestGreaterThan(BigDecimal value) {
            addCriterion("DEFAULTINTEREST >", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULTINTEREST >=", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestLessThan(BigDecimal value) {
            addCriterion("DEFAULTINTEREST <", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEFAULTINTEREST <=", value, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestIn(List<BigDecimal> values) {
            addCriterion("DEFAULTINTEREST in", values, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestNotIn(List<BigDecimal> values) {
            addCriterion("DEFAULTINTEREST not in", values, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULTINTEREST between", value1, value2, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andDefaultinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEFAULTINTEREST not between", value1, value2, "defaultinterest");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdIsNull() {
            addCriterion("FINANCIALOPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdIsNotNull() {
            addCriterion("FINANCIALOPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdEqualTo(String value) {
            addCriterion("FINANCIALOPER_ID =", value, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdNotEqualTo(String value) {
            addCriterion("FINANCIALOPER_ID <>", value, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdGreaterThan(String value) {
            addCriterion("FINANCIALOPER_ID >", value, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCIALOPER_ID >=", value, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdLessThan(String value) {
            addCriterion("FINANCIALOPER_ID <", value, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdLessThanOrEqualTo(String value) {
            addCriterion("FINANCIALOPER_ID <=", value, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdLike(String value) {
            addCriterion("FINANCIALOPER_ID like", value, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdNotLike(String value) {
            addCriterion("FINANCIALOPER_ID not like", value, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdIn(List<String> values) {
            addCriterion("FINANCIALOPER_ID in", values, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdNotIn(List<String> values) {
            addCriterion("FINANCIALOPER_ID not in", values, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdBetween(String value1, String value2) {
            addCriterion("FINANCIALOPER_ID between", value1, value2, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andFinancialoperIdNotBetween(String value1, String value2) {
            addCriterion("FINANCIALOPER_ID not between", value1, value2, "financialoperId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdIsNull() {
            addCriterion("REPLACENOTIFICATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdIsNotNull() {
            addCriterion("REPLACENOTIFICATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdEqualTo(String value) {
            addCriterion("REPLACENOTIFICATION_ID =", value, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdNotEqualTo(String value) {
            addCriterion("REPLACENOTIFICATION_ID <>", value, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdGreaterThan(String value) {
            addCriterion("REPLACENOTIFICATION_ID >", value, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPLACENOTIFICATION_ID >=", value, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdLessThan(String value) {
            addCriterion("REPLACENOTIFICATION_ID <", value, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdLessThanOrEqualTo(String value) {
            addCriterion("REPLACENOTIFICATION_ID <=", value, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdLike(String value) {
            addCriterion("REPLACENOTIFICATION_ID like", value, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdNotLike(String value) {
            addCriterion("REPLACENOTIFICATION_ID not like", value, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdIn(List<String> values) {
            addCriterion("REPLACENOTIFICATION_ID in", values, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdNotIn(List<String> values) {
            addCriterion("REPLACENOTIFICATION_ID not in", values, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdBetween(String value1, String value2) {
            addCriterion("REPLACENOTIFICATION_ID between", value1, value2, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andReplacenotificationIdNotBetween(String value1, String value2) {
            addCriterion("REPLACENOTIFICATION_ID not between", value1, value2, "replacenotificationId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdIsNull() {
            addCriterion("TRACESCHEMEREPORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdIsNotNull() {
            addCriterion("TRACESCHEMEREPORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdEqualTo(String value) {
            addCriterion("TRACESCHEMEREPORT_ID =", value, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdNotEqualTo(String value) {
            addCriterion("TRACESCHEMEREPORT_ID <>", value, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdGreaterThan(String value) {
            addCriterion("TRACESCHEMEREPORT_ID >", value, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRACESCHEMEREPORT_ID >=", value, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdLessThan(String value) {
            addCriterion("TRACESCHEMEREPORT_ID <", value, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdLessThanOrEqualTo(String value) {
            addCriterion("TRACESCHEMEREPORT_ID <=", value, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdLike(String value) {
            addCriterion("TRACESCHEMEREPORT_ID like", value, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdNotLike(String value) {
            addCriterion("TRACESCHEMEREPORT_ID not like", value, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdIn(List<String> values) {
            addCriterion("TRACESCHEMEREPORT_ID in", values, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdNotIn(List<String> values) {
            addCriterion("TRACESCHEMEREPORT_ID not in", values, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdBetween(String value1, String value2) {
            addCriterion("TRACESCHEMEREPORT_ID between", value1, value2, "traceschemereportId");
            return (Criteria) this;
        }

        public Criteria andTraceschemereportIdNotBetween(String value1, String value2) {
            addCriterion("TRACESCHEMEREPORT_ID not between", value1, value2, "traceschemereportId");
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

        public Criteria andAccountnameIsNull() {
            addCriterion("ACCOUNTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("ACCOUNTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("ACCOUNTNAME =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("ACCOUNTNAME <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("ACCOUNTNAME >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("ACCOUNTNAME <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNAME <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("ACCOUNTNAME like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("ACCOUNTNAME not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("ACCOUNTNAME in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("ACCOUNTNAME not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNAME not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountIsNull() {
            addCriterion("ACTUALREPLACEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountIsNotNull() {
            addCriterion("ACTUALREPLACEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountEqualTo(BigDecimal value) {
            addCriterion("ACTUALREPLACEAMOUNT =", value, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountNotEqualTo(BigDecimal value) {
            addCriterion("ACTUALREPLACEAMOUNT <>", value, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountGreaterThan(BigDecimal value) {
            addCriterion("ACTUALREPLACEAMOUNT >", value, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUALREPLACEAMOUNT >=", value, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountLessThan(BigDecimal value) {
            addCriterion("ACTUALREPLACEAMOUNT <", value, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUALREPLACEAMOUNT <=", value, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountIn(List<BigDecimal> values) {
            addCriterion("ACTUALREPLACEAMOUNT in", values, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountNotIn(List<BigDecimal> values) {
            addCriterion("ACTUALREPLACEAMOUNT not in", values, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUALREPLACEAMOUNT between", value1, value2, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andActualreplaceamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUALREPLACEAMOUNT not between", value1, value2, "actualreplaceamount");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("ENDDATE like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("ENDDATE not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
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