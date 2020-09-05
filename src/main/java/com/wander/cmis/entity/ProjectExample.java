package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andAcceptempcdIsNull() {
            addCriterion("ACCEPTEMPCD is null");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdIsNotNull() {
            addCriterion("ACCEPTEMPCD is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdEqualTo(String value) {
            addCriterion("ACCEPTEMPCD =", value, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdNotEqualTo(String value) {
            addCriterion("ACCEPTEMPCD <>", value, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdGreaterThan(String value) {
            addCriterion("ACCEPTEMPCD >", value, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPTEMPCD >=", value, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdLessThan(String value) {
            addCriterion("ACCEPTEMPCD <", value, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdLessThanOrEqualTo(String value) {
            addCriterion("ACCEPTEMPCD <=", value, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdLike(String value) {
            addCriterion("ACCEPTEMPCD like", value, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdNotLike(String value) {
            addCriterion("ACCEPTEMPCD not like", value, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdIn(List<String> values) {
            addCriterion("ACCEPTEMPCD in", values, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdNotIn(List<String> values) {
            addCriterion("ACCEPTEMPCD not in", values, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdBetween(String value1, String value2) {
            addCriterion("ACCEPTEMPCD between", value1, value2, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempcdNotBetween(String value1, String value2) {
            addCriterion("ACCEPTEMPCD not between", value1, value2, "acceptempcd");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmIsNull() {
            addCriterion("ACCEPTEMPNM is null");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmIsNotNull() {
            addCriterion("ACCEPTEMPNM is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmEqualTo(String value) {
            addCriterion("ACCEPTEMPNM =", value, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmNotEqualTo(String value) {
            addCriterion("ACCEPTEMPNM <>", value, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmGreaterThan(String value) {
            addCriterion("ACCEPTEMPNM >", value, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPTEMPNM >=", value, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmLessThan(String value) {
            addCriterion("ACCEPTEMPNM <", value, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmLessThanOrEqualTo(String value) {
            addCriterion("ACCEPTEMPNM <=", value, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmLike(String value) {
            addCriterion("ACCEPTEMPNM like", value, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmNotLike(String value) {
            addCriterion("ACCEPTEMPNM not like", value, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmIn(List<String> values) {
            addCriterion("ACCEPTEMPNM in", values, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmNotIn(List<String> values) {
            addCriterion("ACCEPTEMPNM not in", values, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmBetween(String value1, String value2) {
            addCriterion("ACCEPTEMPNM between", value1, value2, "acceptempnm");
            return (Criteria) this;
        }

        public Criteria andAcceptempnmNotBetween(String value1, String value2) {
            addCriterion("ACCEPTEMPNM not between", value1, value2, "acceptempnm");
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

        public Criteria andApplydeadlineIsNull() {
            addCriterion("APPLYDEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineIsNotNull() {
            addCriterion("APPLYDEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineEqualTo(Long value) {
            addCriterion("APPLYDEADLINE =", value, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineNotEqualTo(Long value) {
            addCriterion("APPLYDEADLINE <>", value, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineGreaterThan(Long value) {
            addCriterion("APPLYDEADLINE >", value, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLYDEADLINE >=", value, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineLessThan(Long value) {
            addCriterion("APPLYDEADLINE <", value, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineLessThanOrEqualTo(Long value) {
            addCriterion("APPLYDEADLINE <=", value, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineIn(List<Long> values) {
            addCriterion("APPLYDEADLINE in", values, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineNotIn(List<Long> values) {
            addCriterion("APPLYDEADLINE not in", values, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineBetween(Long value1, Long value2) {
            addCriterion("APPLYDEADLINE between", value1, value2, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineNotBetween(Long value1, Long value2) {
            addCriterion("APPLYDEADLINE not between", value1, value2, "applydeadline");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitIsNull() {
            addCriterion("APPLYDEADLINEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitIsNotNull() {
            addCriterion("APPLYDEADLINEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitEqualTo(String value) {
            addCriterion("APPLYDEADLINEUNIT =", value, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitNotEqualTo(String value) {
            addCriterion("APPLYDEADLINEUNIT <>", value, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitGreaterThan(String value) {
            addCriterion("APPLYDEADLINEUNIT >", value, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYDEADLINEUNIT >=", value, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitLessThan(String value) {
            addCriterion("APPLYDEADLINEUNIT <", value, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitLessThanOrEqualTo(String value) {
            addCriterion("APPLYDEADLINEUNIT <=", value, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitLike(String value) {
            addCriterion("APPLYDEADLINEUNIT like", value, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitNotLike(String value) {
            addCriterion("APPLYDEADLINEUNIT not like", value, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitIn(List<String> values) {
            addCriterion("APPLYDEADLINEUNIT in", values, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitNotIn(List<String> values) {
            addCriterion("APPLYDEADLINEUNIT not in", values, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitBetween(String value1, String value2) {
            addCriterion("APPLYDEADLINEUNIT between", value1, value2, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplydeadlineunitNotBetween(String value1, String value2) {
            addCriterion("APPLYDEADLINEUNIT not between", value1, value2, "applydeadlineunit");
            return (Criteria) this;
        }

        public Criteria andApplyrateIsNull() {
            addCriterion("APPLYRATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyrateIsNotNull() {
            addCriterion("APPLYRATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyrateEqualTo(Double value) {
            addCriterion("APPLYRATE =", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateNotEqualTo(Double value) {
            addCriterion("APPLYRATE <>", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateGreaterThan(Double value) {
            addCriterion("APPLYRATE >", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateGreaterThanOrEqualTo(Double value) {
            addCriterion("APPLYRATE >=", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateLessThan(Double value) {
            addCriterion("APPLYRATE <", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateLessThanOrEqualTo(Double value) {
            addCriterion("APPLYRATE <=", value, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateIn(List<Double> values) {
            addCriterion("APPLYRATE in", values, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateNotIn(List<Double> values) {
            addCriterion("APPLYRATE not in", values, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateBetween(Double value1, Double value2) {
            addCriterion("APPLYRATE between", value1, value2, "applyrate");
            return (Criteria) this;
        }

        public Criteria andApplyrateNotBetween(Double value1, Double value2) {
            addCriterion("APPLYRATE not between", value1, value2, "applyrate");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioIsNull() {
            addCriterion("ASSETLIABILITYRATIO is null");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioIsNotNull() {
            addCriterion("ASSETLIABILITYRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioEqualTo(Double value) {
            addCriterion("ASSETLIABILITYRATIO =", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioNotEqualTo(Double value) {
            addCriterion("ASSETLIABILITYRATIO <>", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioGreaterThan(Double value) {
            addCriterion("ASSETLIABILITYRATIO >", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioGreaterThanOrEqualTo(Double value) {
            addCriterion("ASSETLIABILITYRATIO >=", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioLessThan(Double value) {
            addCriterion("ASSETLIABILITYRATIO <", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioLessThanOrEqualTo(Double value) {
            addCriterion("ASSETLIABILITYRATIO <=", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioIn(List<Double> values) {
            addCriterion("ASSETLIABILITYRATIO in", values, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioNotIn(List<Double> values) {
            addCriterion("ASSETLIABILITYRATIO not in", values, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioBetween(Double value1, Double value2) {
            addCriterion("ASSETLIABILITYRATIO between", value1, value2, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioNotBetween(Double value1, Double value2) {
            addCriterion("ASSETLIABILITYRATIO not between", value1, value2, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetsIsNull() {
            addCriterion("ASSETS is null");
            return (Criteria) this;
        }

        public Criteria andAssetsIsNotNull() {
            addCriterion("ASSETS is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsEqualTo(BigDecimal value) {
            addCriterion("ASSETS =", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsNotEqualTo(BigDecimal value) {
            addCriterion("ASSETS <>", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsGreaterThan(BigDecimal value) {
            addCriterion("ASSETS >", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSETS >=", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsLessThan(BigDecimal value) {
            addCriterion("ASSETS <", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSETS <=", value, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsIn(List<BigDecimal> values) {
            addCriterion("ASSETS in", values, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsNotIn(List<BigDecimal> values) {
            addCriterion("ASSETS not in", values, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSETS between", value1, value2, "assets");
            return (Criteria) this;
        }

        public Criteria andAssetsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSETS not between", value1, value2, "assets");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeIsNull() {
            addCriterion("BANKMANAGEMENTFEE is null");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeIsNotNull() {
            addCriterion("BANKMANAGEMENTFEE is not null");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeEqualTo(BigDecimal value) {
            addCriterion("BANKMANAGEMENTFEE =", value, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeNotEqualTo(BigDecimal value) {
            addCriterion("BANKMANAGEMENTFEE <>", value, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeGreaterThan(BigDecimal value) {
            addCriterion("BANKMANAGEMENTFEE >", value, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKMANAGEMENTFEE >=", value, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeLessThan(BigDecimal value) {
            addCriterion("BANKMANAGEMENTFEE <", value, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKMANAGEMENTFEE <=", value, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeIn(List<BigDecimal> values) {
            addCriterion("BANKMANAGEMENTFEE in", values, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeNotIn(List<BigDecimal> values) {
            addCriterion("BANKMANAGEMENTFEE not in", values, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKMANAGEMENTFEE between", value1, value2, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKMANAGEMENTFEE not between", value1, value2, "bankmanagementfee");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateIsNull() {
            addCriterion("BANKMANAGEMENTFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateIsNotNull() {
            addCriterion("BANKMANAGEMENTFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateEqualTo(Double value) {
            addCriterion("BANKMANAGEMENTFEERATE =", value, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateNotEqualTo(Double value) {
            addCriterion("BANKMANAGEMENTFEERATE <>", value, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateGreaterThan(Double value) {
            addCriterion("BANKMANAGEMENTFEERATE >", value, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateGreaterThanOrEqualTo(Double value) {
            addCriterion("BANKMANAGEMENTFEERATE >=", value, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateLessThan(Double value) {
            addCriterion("BANKMANAGEMENTFEERATE <", value, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateLessThanOrEqualTo(Double value) {
            addCriterion("BANKMANAGEMENTFEERATE <=", value, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateIn(List<Double> values) {
            addCriterion("BANKMANAGEMENTFEERATE in", values, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateNotIn(List<Double> values) {
            addCriterion("BANKMANAGEMENTFEERATE not in", values, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateBetween(Double value1, Double value2) {
            addCriterion("BANKMANAGEMENTFEERATE between", value1, value2, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBankmanagementfeerateNotBetween(Double value1, Double value2) {
            addCriterion("BANKMANAGEMENTFEERATE not between", value1, value2, "bankmanagementfeerate");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureIsNull() {
            addCriterion("BORROWERSTRUCTURE is null");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureIsNotNull() {
            addCriterion("BORROWERSTRUCTURE is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureEqualTo(String value) {
            addCriterion("BORROWERSTRUCTURE =", value, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureNotEqualTo(String value) {
            addCriterion("BORROWERSTRUCTURE <>", value, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureGreaterThan(String value) {
            addCriterion("BORROWERSTRUCTURE >", value, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureGreaterThanOrEqualTo(String value) {
            addCriterion("BORROWERSTRUCTURE >=", value, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureLessThan(String value) {
            addCriterion("BORROWERSTRUCTURE <", value, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureLessThanOrEqualTo(String value) {
            addCriterion("BORROWERSTRUCTURE <=", value, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureLike(String value) {
            addCriterion("BORROWERSTRUCTURE like", value, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureNotLike(String value) {
            addCriterion("BORROWERSTRUCTURE not like", value, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureIn(List<String> values) {
            addCriterion("BORROWERSTRUCTURE in", values, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureNotIn(List<String> values) {
            addCriterion("BORROWERSTRUCTURE not in", values, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureBetween(String value1, String value2) {
            addCriterion("BORROWERSTRUCTURE between", value1, value2, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andBorrowerstructureNotBetween(String value1, String value2) {
            addCriterion("BORROWERSTRUCTURE not between", value1, value2, "borrowerstructure");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedIsNull() {
            addCriterion("CAPITALRAISED is null");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedIsNotNull() {
            addCriterion("CAPITALRAISED is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedEqualTo(BigDecimal value) {
            addCriterion("CAPITALRAISED =", value, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedNotEqualTo(BigDecimal value) {
            addCriterion("CAPITALRAISED <>", value, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedGreaterThan(BigDecimal value) {
            addCriterion("CAPITALRAISED >", value, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPITALRAISED >=", value, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedLessThan(BigDecimal value) {
            addCriterion("CAPITALRAISED <", value, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPITALRAISED <=", value, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedIn(List<BigDecimal> values) {
            addCriterion("CAPITALRAISED in", values, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedNotIn(List<BigDecimal> values) {
            addCriterion("CAPITALRAISED not in", values, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPITALRAISED between", value1, value2, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCapitalraisedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPITALRAISED not between", value1, value2, "capitalraised");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsIsNull() {
            addCriterion("CASHPAYMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsIsNotNull() {
            addCriterion("CASHPAYMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsEqualTo(BigDecimal value) {
            addCriterion("CASHPAYMENTS =", value, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsNotEqualTo(BigDecimal value) {
            addCriterion("CASHPAYMENTS <>", value, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsGreaterThan(BigDecimal value) {
            addCriterion("CASHPAYMENTS >", value, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHPAYMENTS >=", value, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsLessThan(BigDecimal value) {
            addCriterion("CASHPAYMENTS <", value, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHPAYMENTS <=", value, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsIn(List<BigDecimal> values) {
            addCriterion("CASHPAYMENTS in", values, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsNotIn(List<BigDecimal> values) {
            addCriterion("CASHPAYMENTS not in", values, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHPAYMENTS between", value1, value2, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andCashpaymentsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHPAYMENTS not between", value1, value2, "cashpayments");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("CHANNEL =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("CHANNEL <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("CHANNEL >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("CHANNEL <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("CHANNEL like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("CHANNEL not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("CHANNEL in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("CHANNEL not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("CHANNEL between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("CHANNEL not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyIsNull() {
            addCriterion("CHECKFREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyIsNotNull() {
            addCriterion("CHECKFREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyEqualTo(String value) {
            addCriterion("CHECKFREQUENCY =", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyNotEqualTo(String value) {
            addCriterion("CHECKFREQUENCY <>", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyGreaterThan(String value) {
            addCriterion("CHECKFREQUENCY >", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKFREQUENCY >=", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyLessThan(String value) {
            addCriterion("CHECKFREQUENCY <", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyLessThanOrEqualTo(String value) {
            addCriterion("CHECKFREQUENCY <=", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyLike(String value) {
            addCriterion("CHECKFREQUENCY like", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyNotLike(String value) {
            addCriterion("CHECKFREQUENCY not like", value, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyIn(List<String> values) {
            addCriterion("CHECKFREQUENCY in", values, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyNotIn(List<String> values) {
            addCriterion("CHECKFREQUENCY not in", values, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyBetween(String value1, String value2) {
            addCriterion("CHECKFREQUENCY between", value1, value2, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andCheckfrequencyNotBetween(String value1, String value2) {
            addCriterion("CHECKFREQUENCY not between", value1, value2, "checkfrequency");
            return (Criteria) this;
        }

        public Criteria andClientaddrIsNull() {
            addCriterion("CLIENTADDR is null");
            return (Criteria) this;
        }

        public Criteria andClientaddrIsNotNull() {
            addCriterion("CLIENTADDR is not null");
            return (Criteria) this;
        }

        public Criteria andClientaddrEqualTo(String value) {
            addCriterion("CLIENTADDR =", value, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrNotEqualTo(String value) {
            addCriterion("CLIENTADDR <>", value, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrGreaterThan(String value) {
            addCriterion("CLIENTADDR >", value, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTADDR >=", value, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrLessThan(String value) {
            addCriterion("CLIENTADDR <", value, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrLessThanOrEqualTo(String value) {
            addCriterion("CLIENTADDR <=", value, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrLike(String value) {
            addCriterion("CLIENTADDR like", value, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrNotLike(String value) {
            addCriterion("CLIENTADDR not like", value, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrIn(List<String> values) {
            addCriterion("CLIENTADDR in", values, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrNotIn(List<String> values) {
            addCriterion("CLIENTADDR not in", values, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrBetween(String value1, String value2) {
            addCriterion("CLIENTADDR between", value1, value2, "clientaddr");
            return (Criteria) this;
        }

        public Criteria andClientaddrNotBetween(String value1, String value2) {
            addCriterion("CLIENTADDR not between", value1, value2, "clientaddr");
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

        public Criteria andCompfreeamountIsNull() {
            addCriterion("COMPFREEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountIsNotNull() {
            addCriterion("COMPFREEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountEqualTo(BigDecimal value) {
            addCriterion("COMPFREEAMOUNT =", value, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountNotEqualTo(BigDecimal value) {
            addCriterion("COMPFREEAMOUNT <>", value, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountGreaterThan(BigDecimal value) {
            addCriterion("COMPFREEAMOUNT >", value, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPFREEAMOUNT >=", value, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountLessThan(BigDecimal value) {
            addCriterion("COMPFREEAMOUNT <", value, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPFREEAMOUNT <=", value, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountIn(List<BigDecimal> values) {
            addCriterion("COMPFREEAMOUNT in", values, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountNotIn(List<BigDecimal> values) {
            addCriterion("COMPFREEAMOUNT not in", values, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPFREEAMOUNT between", value1, value2, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andCompfreeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPFREEAMOUNT not between", value1, value2, "compfreeamount");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("CONTACT is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("CONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("CONTACT =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("CONTACT <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("CONTACT >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("CONTACT <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("CONTACT <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("CONTACT like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("CONTACT not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("CONTACT in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("CONTACT not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("CONTACT between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("CONTACT not between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactpersonIsNull() {
            addCriterion("CONTACTPERSON is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonIsNotNull() {
            addCriterion("CONTACTPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonEqualTo(String value) {
            addCriterion("CONTACTPERSON =", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotEqualTo(String value) {
            addCriterion("CONTACTPERSON <>", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThan(String value) {
            addCriterion("CONTACTPERSON >", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSON >=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThan(String value) {
            addCriterion("CONTACTPERSON <", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThanOrEqualTo(String value) {
            addCriterion("CONTACTPERSON <=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLike(String value) {
            addCriterion("CONTACTPERSON like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotLike(String value) {
            addCriterion("CONTACTPERSON not like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonIn(List<String> values) {
            addCriterion("CONTACTPERSON in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotIn(List<String> values) {
            addCriterion("CONTACTPERSON not in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonBetween(String value1, String value2) {
            addCriterion("CONTACTPERSON between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotBetween(String value1, String value2) {
            addCriterion("CONTACTPERSON not between", value1, value2, "contactperson");
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

        public Criteria andContractdeadlineIsNull() {
            addCriterion("CONTRACTDEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineIsNotNull() {
            addCriterion("CONTRACTDEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineEqualTo(Long value) {
            addCriterion("CONTRACTDEADLINE =", value, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineNotEqualTo(Long value) {
            addCriterion("CONTRACTDEADLINE <>", value, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineGreaterThan(Long value) {
            addCriterion("CONTRACTDEADLINE >", value, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineGreaterThanOrEqualTo(Long value) {
            addCriterion("CONTRACTDEADLINE >=", value, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineLessThan(Long value) {
            addCriterion("CONTRACTDEADLINE <", value, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineLessThanOrEqualTo(Long value) {
            addCriterion("CONTRACTDEADLINE <=", value, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineIn(List<Long> values) {
            addCriterion("CONTRACTDEADLINE in", values, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineNotIn(List<Long> values) {
            addCriterion("CONTRACTDEADLINE not in", values, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineBetween(Long value1, Long value2) {
            addCriterion("CONTRACTDEADLINE between", value1, value2, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineNotBetween(Long value1, Long value2) {
            addCriterion("CONTRACTDEADLINE not between", value1, value2, "contractdeadline");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitIsNull() {
            addCriterion("CONTRACTDEADLINEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitIsNotNull() {
            addCriterion("CONTRACTDEADLINEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitEqualTo(String value) {
            addCriterion("CONTRACTDEADLINEUNIT =", value, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitNotEqualTo(String value) {
            addCriterion("CONTRACTDEADLINEUNIT <>", value, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitGreaterThan(String value) {
            addCriterion("CONTRACTDEADLINEUNIT >", value, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACTDEADLINEUNIT >=", value, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitLessThan(String value) {
            addCriterion("CONTRACTDEADLINEUNIT <", value, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitLessThanOrEqualTo(String value) {
            addCriterion("CONTRACTDEADLINEUNIT <=", value, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitLike(String value) {
            addCriterion("CONTRACTDEADLINEUNIT like", value, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitNotLike(String value) {
            addCriterion("CONTRACTDEADLINEUNIT not like", value, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitIn(List<String> values) {
            addCriterion("CONTRACTDEADLINEUNIT in", values, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitNotIn(List<String> values) {
            addCriterion("CONTRACTDEADLINEUNIT not in", values, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitBetween(String value1, String value2) {
            addCriterion("CONTRACTDEADLINEUNIT between", value1, value2, "contractdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andContractdeadlineunitNotBetween(String value1, String value2) {
            addCriterion("CONTRACTDEADLINEUNIT not between", value1, value2, "contractdeadlineunit");
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

        public Criteria andContractrateIsNull() {
            addCriterion("CONTRACTRATE is null");
            return (Criteria) this;
        }

        public Criteria andContractrateIsNotNull() {
            addCriterion("CONTRACTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andContractrateEqualTo(Double value) {
            addCriterion("CONTRACTRATE =", value, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateNotEqualTo(Double value) {
            addCriterion("CONTRACTRATE <>", value, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateGreaterThan(Double value) {
            addCriterion("CONTRACTRATE >", value, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateGreaterThanOrEqualTo(Double value) {
            addCriterion("CONTRACTRATE >=", value, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateLessThan(Double value) {
            addCriterion("CONTRACTRATE <", value, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateLessThanOrEqualTo(Double value) {
            addCriterion("CONTRACTRATE <=", value, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateIn(List<Double> values) {
            addCriterion("CONTRACTRATE in", values, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateNotIn(List<Double> values) {
            addCriterion("CONTRACTRATE not in", values, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateBetween(Double value1, Double value2) {
            addCriterion("CONTRACTRATE between", value1, value2, "contractrate");
            return (Criteria) this;
        }

        public Criteria andContractrateNotBetween(Double value1, Double value2) {
            addCriterion("CONTRACTRATE not between", value1, value2, "contractrate");
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

        public Criteria andCreditlevelIsNull() {
            addCriterion("CREDITLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIsNotNull() {
            addCriterion("CREDITLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCreditlevelEqualTo(String value) {
            addCriterion("CREDITLEVEL =", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotEqualTo(String value) {
            addCriterion("CREDITLEVEL <>", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThan(String value) {
            addCriterion("CREDITLEVEL >", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITLEVEL >=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThan(String value) {
            addCriterion("CREDITLEVEL <", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLessThanOrEqualTo(String value) {
            addCriterion("CREDITLEVEL <=", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelLike(String value) {
            addCriterion("CREDITLEVEL like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotLike(String value) {
            addCriterion("CREDITLEVEL not like", value, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelIn(List<String> values) {
            addCriterion("CREDITLEVEL in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotIn(List<String> values) {
            addCriterion("CREDITLEVEL not in", values, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelBetween(String value1, String value2) {
            addCriterion("CREDITLEVEL between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCreditlevelNotBetween(String value1, String value2) {
            addCriterion("CREDITLEVEL not between", value1, value2, "creditlevel");
            return (Criteria) this;
        }

        public Criteria andCurrentamountIsNull() {
            addCriterion("CURRENTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCurrentamountIsNotNull() {
            addCriterion("CURRENTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentamountEqualTo(BigDecimal value) {
            addCriterion("CURRENTAMOUNT =", value, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountNotEqualTo(BigDecimal value) {
            addCriterion("CURRENTAMOUNT <>", value, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountGreaterThan(BigDecimal value) {
            addCriterion("CURRENTAMOUNT >", value, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENTAMOUNT >=", value, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountLessThan(BigDecimal value) {
            addCriterion("CURRENTAMOUNT <", value, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURRENTAMOUNT <=", value, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountIn(List<BigDecimal> values) {
            addCriterion("CURRENTAMOUNT in", values, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountNotIn(List<BigDecimal> values) {
            addCriterion("CURRENTAMOUNT not in", values, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENTAMOUNT between", value1, value2, "currentamount");
            return (Criteria) this;
        }

        public Criteria andCurrentamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURRENTAMOUNT not between", value1, value2, "currentamount");
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

        public Criteria andCurrentrateIsNull() {
            addCriterion("CURRENTRATE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentrateIsNotNull() {
            addCriterion("CURRENTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentrateEqualTo(Double value) {
            addCriterion("CURRENTRATE =", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotEqualTo(Double value) {
            addCriterion("CURRENTRATE <>", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateGreaterThan(Double value) {
            addCriterion("CURRENTRATE >", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateGreaterThanOrEqualTo(Double value) {
            addCriterion("CURRENTRATE >=", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateLessThan(Double value) {
            addCriterion("CURRENTRATE <", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateLessThanOrEqualTo(Double value) {
            addCriterion("CURRENTRATE <=", value, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateIn(List<Double> values) {
            addCriterion("CURRENTRATE in", values, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotIn(List<Double> values) {
            addCriterion("CURRENTRATE not in", values, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateBetween(Double value1, Double value2) {
            addCriterion("CURRENTRATE between", value1, value2, "currentrate");
            return (Criteria) this;
        }

        public Criteria andCurrentrateNotBetween(Double value1, Double value2) {
            addCriterion("CURRENTRATE not between", value1, value2, "currentrate");
            return (Criteria) this;
        }

        public Criteria andDestamountIsNull() {
            addCriterion("DESTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDestamountIsNotNull() {
            addCriterion("DESTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDestamountEqualTo(BigDecimal value) {
            addCriterion("DESTAMOUNT =", value, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountNotEqualTo(BigDecimal value) {
            addCriterion("DESTAMOUNT <>", value, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountGreaterThan(BigDecimal value) {
            addCriterion("DESTAMOUNT >", value, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DESTAMOUNT >=", value, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountLessThan(BigDecimal value) {
            addCriterion("DESTAMOUNT <", value, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DESTAMOUNT <=", value, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountIn(List<BigDecimal> values) {
            addCriterion("DESTAMOUNT in", values, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountNotIn(List<BigDecimal> values) {
            addCriterion("DESTAMOUNT not in", values, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESTAMOUNT between", value1, value2, "destamount");
            return (Criteria) this;
        }

        public Criteria andDestamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DESTAMOUNT not between", value1, value2, "destamount");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleIsNull() {
            addCriterion("ECONOMICCIRCLE is null");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleIsNotNull() {
            addCriterion("ECONOMICCIRCLE is not null");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleEqualTo(String value) {
            addCriterion("ECONOMICCIRCLE =", value, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleNotEqualTo(String value) {
            addCriterion("ECONOMICCIRCLE <>", value, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleGreaterThan(String value) {
            addCriterion("ECONOMICCIRCLE >", value, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleGreaterThanOrEqualTo(String value) {
            addCriterion("ECONOMICCIRCLE >=", value, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleLessThan(String value) {
            addCriterion("ECONOMICCIRCLE <", value, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleLessThanOrEqualTo(String value) {
            addCriterion("ECONOMICCIRCLE <=", value, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleLike(String value) {
            addCriterion("ECONOMICCIRCLE like", value, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleNotLike(String value) {
            addCriterion("ECONOMICCIRCLE not like", value, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleIn(List<String> values) {
            addCriterion("ECONOMICCIRCLE in", values, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleNotIn(List<String> values) {
            addCriterion("ECONOMICCIRCLE not in", values, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleBetween(String value1, String value2) {
            addCriterion("ECONOMICCIRCLE between", value1, value2, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andEconomiccircleNotBetween(String value1, String value2) {
            addCriterion("ECONOMICCIRCLE not between", value1, value2, "economiccircle");
            return (Criteria) this;
        }

        public Criteria andExaminedateIsNull() {
            addCriterion("EXAMINEDATE is null");
            return (Criteria) this;
        }

        public Criteria andExaminedateIsNotNull() {
            addCriterion("EXAMINEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExaminedateEqualTo(BigDecimal value) {
            addCriterion("EXAMINEDATE =", value, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateNotEqualTo(BigDecimal value) {
            addCriterion("EXAMINEDATE <>", value, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateGreaterThan(BigDecimal value) {
            addCriterion("EXAMINEDATE >", value, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXAMINEDATE >=", value, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateLessThan(BigDecimal value) {
            addCriterion("EXAMINEDATE <", value, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXAMINEDATE <=", value, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateIn(List<BigDecimal> values) {
            addCriterion("EXAMINEDATE in", values, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateNotIn(List<BigDecimal> values) {
            addCriterion("EXAMINEDATE not in", values, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXAMINEDATE between", value1, value2, "examinedate");
            return (Criteria) this;
        }

        public Criteria andExaminedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXAMINEDATE not between", value1, value2, "examinedate");
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

        public Criteria andFinancingtypeIsNull() {
            addCriterion("FINANCINGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeIsNotNull() {
            addCriterion("FINANCINGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeEqualTo(String value) {
            addCriterion("FINANCINGTYPE =", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeNotEqualTo(String value) {
            addCriterion("FINANCINGTYPE <>", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeGreaterThan(String value) {
            addCriterion("FINANCINGTYPE >", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeGreaterThanOrEqualTo(String value) {
            addCriterion("FINANCINGTYPE >=", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeLessThan(String value) {
            addCriterion("FINANCINGTYPE <", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeLessThanOrEqualTo(String value) {
            addCriterion("FINANCINGTYPE <=", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeLike(String value) {
            addCriterion("FINANCINGTYPE like", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeNotLike(String value) {
            addCriterion("FINANCINGTYPE not like", value, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeIn(List<String> values) {
            addCriterion("FINANCINGTYPE in", values, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeNotIn(List<String> values) {
            addCriterion("FINANCINGTYPE not in", values, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeBetween(String value1, String value2) {
            addCriterion("FINANCINGTYPE between", value1, value2, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFinancingtypeNotBetween(String value1, String value2) {
            addCriterion("FINANCINGTYPE not between", value1, value2, "financingtype");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyIsNull() {
            addCriterion("FIVELEVELCLASSIFY is null");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyIsNotNull() {
            addCriterion("FIVELEVELCLASSIFY is not null");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyEqualTo(String value) {
            addCriterion("FIVELEVELCLASSIFY =", value, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyNotEqualTo(String value) {
            addCriterion("FIVELEVELCLASSIFY <>", value, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyGreaterThan(String value) {
            addCriterion("FIVELEVELCLASSIFY >", value, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyGreaterThanOrEqualTo(String value) {
            addCriterion("FIVELEVELCLASSIFY >=", value, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyLessThan(String value) {
            addCriterion("FIVELEVELCLASSIFY <", value, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyLessThanOrEqualTo(String value) {
            addCriterion("FIVELEVELCLASSIFY <=", value, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyLike(String value) {
            addCriterion("FIVELEVELCLASSIFY like", value, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyNotLike(String value) {
            addCriterion("FIVELEVELCLASSIFY not like", value, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyIn(List<String> values) {
            addCriterion("FIVELEVELCLASSIFY in", values, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyNotIn(List<String> values) {
            addCriterion("FIVELEVELCLASSIFY not in", values, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyBetween(String value1, String value2) {
            addCriterion("FIVELEVELCLASSIFY between", value1, value2, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFivelevelclassifyNotBetween(String value1, String value2) {
            addCriterion("FIVELEVELCLASSIFY not between", value1, value2, "fivelevelclassify");
            return (Criteria) this;
        }

        public Criteria andFluidratioIsNull() {
            addCriterion("FLUIDRATIO is null");
            return (Criteria) this;
        }

        public Criteria andFluidratioIsNotNull() {
            addCriterion("FLUIDRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andFluidratioEqualTo(Double value) {
            addCriterion("FLUIDRATIO =", value, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioNotEqualTo(Double value) {
            addCriterion("FLUIDRATIO <>", value, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioGreaterThan(Double value) {
            addCriterion("FLUIDRATIO >", value, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioGreaterThanOrEqualTo(Double value) {
            addCriterion("FLUIDRATIO >=", value, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioLessThan(Double value) {
            addCriterion("FLUIDRATIO <", value, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioLessThanOrEqualTo(Double value) {
            addCriterion("FLUIDRATIO <=", value, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioIn(List<Double> values) {
            addCriterion("FLUIDRATIO in", values, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioNotIn(List<Double> values) {
            addCriterion("FLUIDRATIO not in", values, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioBetween(Double value1, Double value2) {
            addCriterion("FLUIDRATIO between", value1, value2, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andFluidratioNotBetween(Double value1, Double value2) {
            addCriterion("FLUIDRATIO not between", value1, value2, "fluidratio");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelIsNull() {
            addCriterion("GUARFEECALCMODEL is null");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelIsNotNull() {
            addCriterion("GUARFEECALCMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelEqualTo(String value) {
            addCriterion("GUARFEECALCMODEL =", value, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelNotEqualTo(String value) {
            addCriterion("GUARFEECALCMODEL <>", value, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelGreaterThan(String value) {
            addCriterion("GUARFEECALCMODEL >", value, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelGreaterThanOrEqualTo(String value) {
            addCriterion("GUARFEECALCMODEL >=", value, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelLessThan(String value) {
            addCriterion("GUARFEECALCMODEL <", value, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelLessThanOrEqualTo(String value) {
            addCriterion("GUARFEECALCMODEL <=", value, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelLike(String value) {
            addCriterion("GUARFEECALCMODEL like", value, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelNotLike(String value) {
            addCriterion("GUARFEECALCMODEL not like", value, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelIn(List<String> values) {
            addCriterion("GUARFEECALCMODEL in", values, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelNotIn(List<String> values) {
            addCriterion("GUARFEECALCMODEL not in", values, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelBetween(String value1, String value2) {
            addCriterion("GUARFEECALCMODEL between", value1, value2, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuarfeecalcmodelNotBetween(String value1, String value2) {
            addCriterion("GUARFEECALCMODEL not between", value1, value2, "guarfeecalcmodel");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyIsNull() {
            addCriterion("GUARANTEEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyIsNotNull() {
            addCriterion("GUARANTEEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEMONEY =", value, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyNotEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEMONEY <>", value, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyGreaterThan(BigDecimal value) {
            addCriterion("GUARANTEEMONEY >", value, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEMONEY >=", value, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyLessThan(BigDecimal value) {
            addCriterion("GUARANTEEMONEY <", value, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTEEMONEY <=", value, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyIn(List<BigDecimal> values) {
            addCriterion("GUARANTEEMONEY in", values, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyNotIn(List<BigDecimal> values) {
            addCriterion("GUARANTEEMONEY not in", values, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEEMONEY between", value1, value2, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andGuaranteemoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTEEMONEY not between", value1, value2, "guaranteemoney");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdIsNull() {
            addCriterion("HASBADCREDITRD is null");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdIsNotNull() {
            addCriterion("HASBADCREDITRD is not null");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdEqualTo(Short value) {
            addCriterion("HASBADCREDITRD =", value, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdNotEqualTo(Short value) {
            addCriterion("HASBADCREDITRD <>", value, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdGreaterThan(Short value) {
            addCriterion("HASBADCREDITRD >", value, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdGreaterThanOrEqualTo(Short value) {
            addCriterion("HASBADCREDITRD >=", value, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdLessThan(Short value) {
            addCriterion("HASBADCREDITRD <", value, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdLessThanOrEqualTo(Short value) {
            addCriterion("HASBADCREDITRD <=", value, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdIn(List<Short> values) {
            addCriterion("HASBADCREDITRD in", values, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdNotIn(List<Short> values) {
            addCriterion("HASBADCREDITRD not in", values, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdBetween(Short value1, Short value2) {
            addCriterion("HASBADCREDITRD between", value1, value2, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andHasbadcreditrdNotBetween(Short value1, Short value2) {
            addCriterion("HASBADCREDITRD not between", value1, value2, "hasbadcreditrd");
            return (Criteria) this;
        }

        public Criteria andIncomeamountIsNull() {
            addCriterion("INCOMEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIncomeamountIsNotNull() {
            addCriterion("INCOMEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeamountEqualTo(BigDecimal value) {
            addCriterion("INCOMEAMOUNT =", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountNotEqualTo(BigDecimal value) {
            addCriterion("INCOMEAMOUNT <>", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountGreaterThan(BigDecimal value) {
            addCriterion("INCOMEAMOUNT >", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEAMOUNT >=", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountLessThan(BigDecimal value) {
            addCriterion("INCOMEAMOUNT <", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEAMOUNT <=", value, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountIn(List<BigDecimal> values) {
            addCriterion("INCOMEAMOUNT in", values, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountNotIn(List<BigDecimal> values) {
            addCriterion("INCOMEAMOUNT not in", values, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEAMOUNT between", value1, value2, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEAMOUNT not between", value1, value2, "incomeamount");
            return (Criteria) this;
        }

        public Criteria andIncomeradioIsNull() {
            addCriterion("INCOMERADIO is null");
            return (Criteria) this;
        }

        public Criteria andIncomeradioIsNotNull() {
            addCriterion("INCOMERADIO is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeradioEqualTo(Double value) {
            addCriterion("INCOMERADIO =", value, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioNotEqualTo(Double value) {
            addCriterion("INCOMERADIO <>", value, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioGreaterThan(Double value) {
            addCriterion("INCOMERADIO >", value, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioGreaterThanOrEqualTo(Double value) {
            addCriterion("INCOMERADIO >=", value, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioLessThan(Double value) {
            addCriterion("INCOMERADIO <", value, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioLessThanOrEqualTo(Double value) {
            addCriterion("INCOMERADIO <=", value, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioIn(List<Double> values) {
            addCriterion("INCOMERADIO in", values, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioNotIn(List<Double> values) {
            addCriterion("INCOMERADIO not in", values, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioBetween(Double value1, Double value2) {
            addCriterion("INCOMERADIO between", value1, value2, "incomeradio");
            return (Criteria) this;
        }

        public Criteria andIncomeradioNotBetween(Double value1, Double value2) {
            addCriterion("INCOMERADIO not between", value1, value2, "incomeradio");
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

        public Criteria andInsurancebalanceIsNull() {
            addCriterion("INSURANCEBALANCE is null");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceIsNotNull() {
            addCriterion("INSURANCEBALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceEqualTo(BigDecimal value) {
            addCriterion("INSURANCEBALANCE =", value, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceNotEqualTo(BigDecimal value) {
            addCriterion("INSURANCEBALANCE <>", value, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceGreaterThan(BigDecimal value) {
            addCriterion("INSURANCEBALANCE >", value, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCEBALANCE >=", value, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceLessThan(BigDecimal value) {
            addCriterion("INSURANCEBALANCE <", value, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCEBALANCE <=", value, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceIn(List<BigDecimal> values) {
            addCriterion("INSURANCEBALANCE in", values, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceNotIn(List<BigDecimal> values) {
            addCriterion("INSURANCEBALANCE not in", values, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCEBALANCE between", value1, value2, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInsurancebalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCEBALANCE not between", value1, value2, "insurancebalance");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionIsNull() {
            addCriterion("INVESTDIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionIsNotNull() {
            addCriterion("INVESTDIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionEqualTo(String value) {
            addCriterion("INVESTDIRECTION =", value, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionNotEqualTo(String value) {
            addCriterion("INVESTDIRECTION <>", value, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionGreaterThan(String value) {
            addCriterion("INVESTDIRECTION >", value, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionGreaterThanOrEqualTo(String value) {
            addCriterion("INVESTDIRECTION >=", value, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionLessThan(String value) {
            addCriterion("INVESTDIRECTION <", value, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionLessThanOrEqualTo(String value) {
            addCriterion("INVESTDIRECTION <=", value, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionLike(String value) {
            addCriterion("INVESTDIRECTION like", value, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionNotLike(String value) {
            addCriterion("INVESTDIRECTION not like", value, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionIn(List<String> values) {
            addCriterion("INVESTDIRECTION in", values, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionNotIn(List<String> values) {
            addCriterion("INVESTDIRECTION not in", values, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionBetween(String value1, String value2) {
            addCriterion("INVESTDIRECTION between", value1, value2, "investdirection");
            return (Criteria) this;
        }

        public Criteria andInvestdirectionNotBetween(String value1, String value2) {
            addCriterion("INVESTDIRECTION not between", value1, value2, "investdirection");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectIsNull() {
            addCriterion("ISECONOMICPARKPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectIsNotNull() {
            addCriterion("ISECONOMICPARKPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectEqualTo(Short value) {
            addCriterion("ISECONOMICPARKPROJECT =", value, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectNotEqualTo(Short value) {
            addCriterion("ISECONOMICPARKPROJECT <>", value, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectGreaterThan(Short value) {
            addCriterion("ISECONOMICPARKPROJECT >", value, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectGreaterThanOrEqualTo(Short value) {
            addCriterion("ISECONOMICPARKPROJECT >=", value, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectLessThan(Short value) {
            addCriterion("ISECONOMICPARKPROJECT <", value, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectLessThanOrEqualTo(Short value) {
            addCriterion("ISECONOMICPARKPROJECT <=", value, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectIn(List<Short> values) {
            addCriterion("ISECONOMICPARKPROJECT in", values, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectNotIn(List<Short> values) {
            addCriterion("ISECONOMICPARKPROJECT not in", values, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectBetween(Short value1, Short value2) {
            addCriterion("ISECONOMICPARKPROJECT between", value1, value2, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIseconomicparkprojectNotBetween(Short value1, Short value2) {
            addCriterion("ISECONOMICPARKPROJECT not between", value1, value2, "iseconomicparkproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectIsNull() {
            addCriterion("ISFINAPLATFORMPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectIsNotNull() {
            addCriterion("ISFINAPLATFORMPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectEqualTo(Short value) {
            addCriterion("ISFINAPLATFORMPROJECT =", value, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectNotEqualTo(Short value) {
            addCriterion("ISFINAPLATFORMPROJECT <>", value, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectGreaterThan(Short value) {
            addCriterion("ISFINAPLATFORMPROJECT >", value, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectGreaterThanOrEqualTo(Short value) {
            addCriterion("ISFINAPLATFORMPROJECT >=", value, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectLessThan(Short value) {
            addCriterion("ISFINAPLATFORMPROJECT <", value, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectLessThanOrEqualTo(Short value) {
            addCriterion("ISFINAPLATFORMPROJECT <=", value, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectIn(List<Short> values) {
            addCriterion("ISFINAPLATFORMPROJECT in", values, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectNotIn(List<Short> values) {
            addCriterion("ISFINAPLATFORMPROJECT not in", values, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectBetween(Short value1, Short value2) {
            addCriterion("ISFINAPLATFORMPROJECT between", value1, value2, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIsfinaplatformprojectNotBetween(Short value1, Short value2) {
            addCriterion("ISFINAPLATFORMPROJECT not between", value1, value2, "isfinaplatformproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectIsNull() {
            addCriterion("ISHISPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andIshisprojectIsNotNull() {
            addCriterion("ISHISPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andIshisprojectEqualTo(Short value) {
            addCriterion("ISHISPROJECT =", value, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectNotEqualTo(Short value) {
            addCriterion("ISHISPROJECT <>", value, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectGreaterThan(Short value) {
            addCriterion("ISHISPROJECT >", value, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectGreaterThanOrEqualTo(Short value) {
            addCriterion("ISHISPROJECT >=", value, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectLessThan(Short value) {
            addCriterion("ISHISPROJECT <", value, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectLessThanOrEqualTo(Short value) {
            addCriterion("ISHISPROJECT <=", value, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectIn(List<Short> values) {
            addCriterion("ISHISPROJECT in", values, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectNotIn(List<Short> values) {
            addCriterion("ISHISPROJECT not in", values, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectBetween(Short value1, Short value2) {
            addCriterion("ISHISPROJECT between", value1, value2, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andIshisprojectNotBetween(Short value1, Short value2) {
            addCriterion("ISHISPROJECT not between", value1, value2, "ishisproject");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeIsNull() {
            addCriterion("JOINTGUARANTEE is null");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeIsNotNull() {
            addCriterion("JOINTGUARANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeEqualTo(Short value) {
            addCriterion("JOINTGUARANTEE =", value, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeNotEqualTo(Short value) {
            addCriterion("JOINTGUARANTEE <>", value, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeGreaterThan(Short value) {
            addCriterion("JOINTGUARANTEE >", value, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeGreaterThanOrEqualTo(Short value) {
            addCriterion("JOINTGUARANTEE >=", value, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeLessThan(Short value) {
            addCriterion("JOINTGUARANTEE <", value, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeLessThanOrEqualTo(Short value) {
            addCriterion("JOINTGUARANTEE <=", value, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeIn(List<Short> values) {
            addCriterion("JOINTGUARANTEE in", values, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeNotIn(List<Short> values) {
            addCriterion("JOINTGUARANTEE not in", values, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeBetween(Short value1, Short value2) {
            addCriterion("JOINTGUARANTEE between", value1, value2, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andJointguaranteeNotBetween(Short value1, Short value2) {
            addCriterion("JOINTGUARANTEE not between", value1, value2, "jointguarantee");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNull() {
            addCriterion("LEGALPERSON is null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIsNotNull() {
            addCriterion("LEGALPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andLegalpersonEqualTo(String value) {
            addCriterion("LEGALPERSON =", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotEqualTo(String value) {
            addCriterion("LEGALPERSON <>", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThan(String value) {
            addCriterion("LEGALPERSON >", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALPERSON >=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThan(String value) {
            addCriterion("LEGALPERSON <", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLessThanOrEqualTo(String value) {
            addCriterion("LEGALPERSON <=", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonLike(String value) {
            addCriterion("LEGALPERSON like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotLike(String value) {
            addCriterion("LEGALPERSON not like", value, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonIn(List<String> values) {
            addCriterion("LEGALPERSON in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotIn(List<String> values) {
            addCriterion("LEGALPERSON not in", values, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonBetween(String value1, String value2) {
            addCriterion("LEGALPERSON between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLegalpersonNotBetween(String value1, String value2) {
            addCriterion("LEGALPERSON not between", value1, value2, "legalperson");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIsNull() {
            addCriterion("LIABILITIES is null");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIsNotNull() {
            addCriterion("LIABILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesEqualTo(BigDecimal value) {
            addCriterion("LIABILITIES =", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotEqualTo(BigDecimal value) {
            addCriterion("LIABILITIES <>", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesGreaterThan(BigDecimal value) {
            addCriterion("LIABILITIES >", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIABILITIES >=", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesLessThan(BigDecimal value) {
            addCriterion("LIABILITIES <", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIABILITIES <=", value, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesIn(List<BigDecimal> values) {
            addCriterion("LIABILITIES in", values, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotIn(List<BigDecimal> values) {
            addCriterion("LIABILITIES not in", values, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIABILITIES between", value1, value2, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLiabilitiesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIABILITIES not between", value1, value2, "liabilities");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountIsNull() {
            addCriterion("LOANTOTALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountIsNotNull() {
            addCriterion("LOANTOTALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountEqualTo(BigDecimal value) {
            addCriterion("LOANTOTALAMOUNT =", value, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountNotEqualTo(BigDecimal value) {
            addCriterion("LOANTOTALAMOUNT <>", value, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountGreaterThan(BigDecimal value) {
            addCriterion("LOANTOTALAMOUNT >", value, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANTOTALAMOUNT >=", value, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountLessThan(BigDecimal value) {
            addCriterion("LOANTOTALAMOUNT <", value, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANTOTALAMOUNT <=", value, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountIn(List<BigDecimal> values) {
            addCriterion("LOANTOTALAMOUNT in", values, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountNotIn(List<BigDecimal> values) {
            addCriterion("LOANTOTALAMOUNT not in", values, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANTOTALAMOUNT between", value1, value2, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andLoantotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANTOTALAMOUNT not between", value1, value2, "loantotalamount");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesIsNull() {
            addCriterion("MONEYPURPOSES is null");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesIsNotNull() {
            addCriterion("MONEYPURPOSES is not null");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesEqualTo(String value) {
            addCriterion("MONEYPURPOSES =", value, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesNotEqualTo(String value) {
            addCriterion("MONEYPURPOSES <>", value, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesGreaterThan(String value) {
            addCriterion("MONEYPURPOSES >", value, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesGreaterThanOrEqualTo(String value) {
            addCriterion("MONEYPURPOSES >=", value, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesLessThan(String value) {
            addCriterion("MONEYPURPOSES <", value, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesLessThanOrEqualTo(String value) {
            addCriterion("MONEYPURPOSES <=", value, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesLike(String value) {
            addCriterion("MONEYPURPOSES like", value, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesNotLike(String value) {
            addCriterion("MONEYPURPOSES not like", value, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesIn(List<String> values) {
            addCriterion("MONEYPURPOSES in", values, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesNotIn(List<String> values) {
            addCriterion("MONEYPURPOSES not in", values, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesBetween(String value1, String value2) {
            addCriterion("MONEYPURPOSES between", value1, value2, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andMoneypurposesNotBetween(String value1, String value2) {
            addCriterion("MONEYPURPOSES not between", value1, value2, "moneypurposes");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountIsNull() {
            addCriterion("NORMALFREEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountIsNotNull() {
            addCriterion("NORMALFREEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountEqualTo(BigDecimal value) {
            addCriterion("NORMALFREEAMOUNT =", value, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountNotEqualTo(BigDecimal value) {
            addCriterion("NORMALFREEAMOUNT <>", value, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountGreaterThan(BigDecimal value) {
            addCriterion("NORMALFREEAMOUNT >", value, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NORMALFREEAMOUNT >=", value, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountLessThan(BigDecimal value) {
            addCriterion("NORMALFREEAMOUNT <", value, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NORMALFREEAMOUNT <=", value, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountIn(List<BigDecimal> values) {
            addCriterion("NORMALFREEAMOUNT in", values, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountNotIn(List<BigDecimal> values) {
            addCriterion("NORMALFREEAMOUNT not in", values, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NORMALFREEAMOUNT between", value1, value2, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andNormalfreeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NORMALFREEAMOUNT not between", value1, value2, "normalfreeamount");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateIsNull() {
            addCriterion("OVERDUEINTERESTRATE is null");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateIsNotNull() {
            addCriterion("OVERDUEINTERESTRATE is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateEqualTo(Double value) {
            addCriterion("OVERDUEINTERESTRATE =", value, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateNotEqualTo(Double value) {
            addCriterion("OVERDUEINTERESTRATE <>", value, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateGreaterThan(Double value) {
            addCriterion("OVERDUEINTERESTRATE >", value, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateGreaterThanOrEqualTo(Double value) {
            addCriterion("OVERDUEINTERESTRATE >=", value, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateLessThan(Double value) {
            addCriterion("OVERDUEINTERESTRATE <", value, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateLessThanOrEqualTo(Double value) {
            addCriterion("OVERDUEINTERESTRATE <=", value, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateIn(List<Double> values) {
            addCriterion("OVERDUEINTERESTRATE in", values, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateNotIn(List<Double> values) {
            addCriterion("OVERDUEINTERESTRATE not in", values, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateBetween(Double value1, Double value2) {
            addCriterion("OVERDUEINTERESTRATE between", value1, value2, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueinterestrateNotBetween(Double value1, Double value2) {
            addCriterion("OVERDUEINTERESTRATE not between", value1, value2, "overdueinterestrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateIsNull() {
            addCriterion("OVERDUEPRINCIPALRATE is null");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateIsNotNull() {
            addCriterion("OVERDUEPRINCIPALRATE is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateEqualTo(Double value) {
            addCriterion("OVERDUEPRINCIPALRATE =", value, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateNotEqualTo(Double value) {
            addCriterion("OVERDUEPRINCIPALRATE <>", value, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateGreaterThan(Double value) {
            addCriterion("OVERDUEPRINCIPALRATE >", value, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateGreaterThanOrEqualTo(Double value) {
            addCriterion("OVERDUEPRINCIPALRATE >=", value, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateLessThan(Double value) {
            addCriterion("OVERDUEPRINCIPALRATE <", value, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateLessThanOrEqualTo(Double value) {
            addCriterion("OVERDUEPRINCIPALRATE <=", value, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateIn(List<Double> values) {
            addCriterion("OVERDUEPRINCIPALRATE in", values, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateNotIn(List<Double> values) {
            addCriterion("OVERDUEPRINCIPALRATE not in", values, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateBetween(Double value1, Double value2) {
            addCriterion("OVERDUEPRINCIPALRATE between", value1, value2, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andOverdueprincipalrateNotBetween(Double value1, Double value2) {
            addCriterion("OVERDUEPRINCIPALRATE not between", value1, value2, "overdueprincipalrate");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelIsNull() {
            addCriterion("PAYINTERESTMODEL is null");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelIsNotNull() {
            addCriterion("PAYINTERESTMODEL is not null");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelEqualTo(String value) {
            addCriterion("PAYINTERESTMODEL =", value, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelNotEqualTo(String value) {
            addCriterion("PAYINTERESTMODEL <>", value, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelGreaterThan(String value) {
            addCriterion("PAYINTERESTMODEL >", value, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelGreaterThanOrEqualTo(String value) {
            addCriterion("PAYINTERESTMODEL >=", value, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelLessThan(String value) {
            addCriterion("PAYINTERESTMODEL <", value, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelLessThanOrEqualTo(String value) {
            addCriterion("PAYINTERESTMODEL <=", value, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelLike(String value) {
            addCriterion("PAYINTERESTMODEL like", value, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelNotLike(String value) {
            addCriterion("PAYINTERESTMODEL not like", value, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelIn(List<String> values) {
            addCriterion("PAYINTERESTMODEL in", values, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelNotIn(List<String> values) {
            addCriterion("PAYINTERESTMODEL not in", values, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelBetween(String value1, String value2) {
            addCriterion("PAYINTERESTMODEL between", value1, value2, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPayinterestmodelNotBetween(String value1, String value2) {
            addCriterion("PAYINTERESTMODEL not between", value1, value2, "payinterestmodel");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateIsNull() {
            addCriterion("PRELAUDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateIsNotNull() {
            addCriterion("PRELAUDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateEqualTo(BigDecimal value) {
            addCriterion("PRELAUDITDATE =", value, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateNotEqualTo(BigDecimal value) {
            addCriterion("PRELAUDITDATE <>", value, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateGreaterThan(BigDecimal value) {
            addCriterion("PRELAUDITDATE >", value, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRELAUDITDATE >=", value, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateLessThan(BigDecimal value) {
            addCriterion("PRELAUDITDATE <", value, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRELAUDITDATE <=", value, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateIn(List<BigDecimal> values) {
            addCriterion("PRELAUDITDATE in", values, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateNotIn(List<BigDecimal> values) {
            addCriterion("PRELAUDITDATE not in", values, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRELAUDITDATE between", value1, value2, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelauditdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRELAUDITDATE not between", value1, value2, "prelauditdate");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountIsNull() {
            addCriterion("PRELAUTITAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountIsNotNull() {
            addCriterion("PRELAUTITAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountEqualTo(BigDecimal value) {
            addCriterion("PRELAUTITAMOUNT =", value, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountNotEqualTo(BigDecimal value) {
            addCriterion("PRELAUTITAMOUNT <>", value, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountGreaterThan(BigDecimal value) {
            addCriterion("PRELAUTITAMOUNT >", value, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRELAUTITAMOUNT >=", value, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountLessThan(BigDecimal value) {
            addCriterion("PRELAUTITAMOUNT <", value, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRELAUTITAMOUNT <=", value, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountIn(List<BigDecimal> values) {
            addCriterion("PRELAUTITAMOUNT in", values, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountNotIn(List<BigDecimal> values) {
            addCriterion("PRELAUTITAMOUNT not in", values, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRELAUTITAMOUNT between", value1, value2, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRELAUTITAMOUNT not between", value1, value2, "prelautitamount");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineIsNull() {
            addCriterion("PRELAUTITDEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineIsNotNull() {
            addCriterion("PRELAUTITDEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineEqualTo(Long value) {
            addCriterion("PRELAUTITDEADLINE =", value, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineNotEqualTo(Long value) {
            addCriterion("PRELAUTITDEADLINE <>", value, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineGreaterThan(Long value) {
            addCriterion("PRELAUTITDEADLINE >", value, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineGreaterThanOrEqualTo(Long value) {
            addCriterion("PRELAUTITDEADLINE >=", value, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineLessThan(Long value) {
            addCriterion("PRELAUTITDEADLINE <", value, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineLessThanOrEqualTo(Long value) {
            addCriterion("PRELAUTITDEADLINE <=", value, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineIn(List<Long> values) {
            addCriterion("PRELAUTITDEADLINE in", values, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineNotIn(List<Long> values) {
            addCriterion("PRELAUTITDEADLINE not in", values, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineBetween(Long value1, Long value2) {
            addCriterion("PRELAUTITDEADLINE between", value1, value2, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineNotBetween(Long value1, Long value2) {
            addCriterion("PRELAUTITDEADLINE not between", value1, value2, "prelautitdeadline");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitIsNull() {
            addCriterion("PRELAUTITDEADLINEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitIsNotNull() {
            addCriterion("PRELAUTITDEADLINEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitEqualTo(String value) {
            addCriterion("PRELAUTITDEADLINEUNIT =", value, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitNotEqualTo(String value) {
            addCriterion("PRELAUTITDEADLINEUNIT <>", value, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitGreaterThan(String value) {
            addCriterion("PRELAUTITDEADLINEUNIT >", value, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitGreaterThanOrEqualTo(String value) {
            addCriterion("PRELAUTITDEADLINEUNIT >=", value, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitLessThan(String value) {
            addCriterion("PRELAUTITDEADLINEUNIT <", value, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitLessThanOrEqualTo(String value) {
            addCriterion("PRELAUTITDEADLINEUNIT <=", value, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitLike(String value) {
            addCriterion("PRELAUTITDEADLINEUNIT like", value, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitNotLike(String value) {
            addCriterion("PRELAUTITDEADLINEUNIT not like", value, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitIn(List<String> values) {
            addCriterion("PRELAUTITDEADLINEUNIT in", values, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitNotIn(List<String> values) {
            addCriterion("PRELAUTITDEADLINEUNIT not in", values, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitBetween(String value1, String value2) {
            addCriterion("PRELAUTITDEADLINEUNIT between", value1, value2, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitdeadlineunitNotBetween(String value1, String value2) {
            addCriterion("PRELAUTITDEADLINEUNIT not between", value1, value2, "prelautitdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateIsNull() {
            addCriterion("PRELAUTITRATE is null");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateIsNotNull() {
            addCriterion("PRELAUTITRATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateEqualTo(Double value) {
            addCriterion("PRELAUTITRATE =", value, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateNotEqualTo(Double value) {
            addCriterion("PRELAUTITRATE <>", value, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateGreaterThan(Double value) {
            addCriterion("PRELAUTITRATE >", value, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateGreaterThanOrEqualTo(Double value) {
            addCriterion("PRELAUTITRATE >=", value, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateLessThan(Double value) {
            addCriterion("PRELAUTITRATE <", value, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateLessThanOrEqualTo(Double value) {
            addCriterion("PRELAUTITRATE <=", value, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateIn(List<Double> values) {
            addCriterion("PRELAUTITRATE in", values, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateNotIn(List<Double> values) {
            addCriterion("PRELAUTITRATE not in", values, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateBetween(Double value1, Double value2) {
            addCriterion("PRELAUTITRATE between", value1, value2, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andPrelautitrateNotBetween(Double value1, Double value2) {
            addCriterion("PRELAUTITRATE not between", value1, value2, "prelautitrate");
            return (Criteria) this;
        }

        public Criteria andProfitratioIsNull() {
            addCriterion("PROFITRATIO is null");
            return (Criteria) this;
        }

        public Criteria andProfitratioIsNotNull() {
            addCriterion("PROFITRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andProfitratioEqualTo(Double value) {
            addCriterion("PROFITRATIO =", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotEqualTo(Double value) {
            addCriterion("PROFITRATIO <>", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioGreaterThan(Double value) {
            addCriterion("PROFITRATIO >", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioGreaterThanOrEqualTo(Double value) {
            addCriterion("PROFITRATIO >=", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioLessThan(Double value) {
            addCriterion("PROFITRATIO <", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioLessThanOrEqualTo(Double value) {
            addCriterion("PROFITRATIO <=", value, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioIn(List<Double> values) {
            addCriterion("PROFITRATIO in", values, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotIn(List<Double> values) {
            addCriterion("PROFITRATIO not in", values, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioBetween(Double value1, Double value2) {
            addCriterion("PROFITRATIO between", value1, value2, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProfitratioNotBetween(Double value1, Double value2) {
            addCriterion("PROFITRATIO not between", value1, value2, "profitratio");
            return (Criteria) this;
        }

        public Criteria andProjtypeIsNull() {
            addCriterion("PROJTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProjtypeIsNotNull() {
            addCriterion("PROJTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProjtypeEqualTo(String value) {
            addCriterion("PROJTYPE =", value, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeNotEqualTo(String value) {
            addCriterion("PROJTYPE <>", value, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeGreaterThan(String value) {
            addCriterion("PROJTYPE >", value, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJTYPE >=", value, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeLessThan(String value) {
            addCriterion("PROJTYPE <", value, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeLessThanOrEqualTo(String value) {
            addCriterion("PROJTYPE <=", value, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeLike(String value) {
            addCriterion("PROJTYPE like", value, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeNotLike(String value) {
            addCriterion("PROJTYPE not like", value, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeIn(List<String> values) {
            addCriterion("PROJTYPE in", values, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeNotIn(List<String> values) {
            addCriterion("PROJTYPE not in", values, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeBetween(String value1, String value2) {
            addCriterion("PROJTYPE between", value1, value2, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjtypeNotBetween(String value1, String value2) {
            addCriterion("PROJTYPE not between", value1, value2, "projtype");
            return (Criteria) this;
        }

        public Criteria andProjectareaIsNull() {
            addCriterion("PROJECTAREA is null");
            return (Criteria) this;
        }

        public Criteria andProjectareaIsNotNull() {
            addCriterion("PROJECTAREA is not null");
            return (Criteria) this;
        }

        public Criteria andProjectareaEqualTo(String value) {
            addCriterion("PROJECTAREA =", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaNotEqualTo(String value) {
            addCriterion("PROJECTAREA <>", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaGreaterThan(String value) {
            addCriterion("PROJECTAREA >", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTAREA >=", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaLessThan(String value) {
            addCriterion("PROJECTAREA <", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaLessThanOrEqualTo(String value) {
            addCriterion("PROJECTAREA <=", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaLike(String value) {
            addCriterion("PROJECTAREA like", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaNotLike(String value) {
            addCriterion("PROJECTAREA not like", value, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaIn(List<String> values) {
            addCriterion("PROJECTAREA in", values, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaNotIn(List<String> values) {
            addCriterion("PROJECTAREA not in", values, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaBetween(String value1, String value2) {
            addCriterion("PROJECTAREA between", value1, value2, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectareaNotBetween(String value1, String value2) {
            addCriterion("PROJECTAREA not between", value1, value2, "projectarea");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNull() {
            addCriterion("PROJECTCODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIsNotNull() {
            addCriterion("PROJECTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcodeEqualTo(String value) {
            addCriterion("PROJECTCODE =", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotEqualTo(String value) {
            addCriterion("PROJECTCODE <>", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThan(String value) {
            addCriterion("PROJECTCODE >", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTCODE >=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThan(String value) {
            addCriterion("PROJECTCODE <", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECTCODE <=", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeLike(String value) {
            addCriterion("PROJECTCODE like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotLike(String value) {
            addCriterion("PROJECTCODE not like", value, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeIn(List<String> values) {
            addCriterion("PROJECTCODE in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotIn(List<String> values) {
            addCriterion("PROJECTCODE not in", values, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeBetween(String value1, String value2) {
            addCriterion("PROJECTCODE between", value1, value2, "projectcode");
            return (Criteria) this;
        }

        public Criteria andProjectcodeNotBetween(String value1, String value2) {
            addCriterion("PROJECTCODE not between", value1, value2, "projectcode");
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

        public Criteria andProjectstageIsNull() {
            addCriterion("PROJECTSTAGE is null");
            return (Criteria) this;
        }

        public Criteria andProjectstageIsNotNull() {
            addCriterion("PROJECTSTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectstageEqualTo(Long value) {
            addCriterion("PROJECTSTAGE =", value, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageNotEqualTo(Long value) {
            addCriterion("PROJECTSTAGE <>", value, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageGreaterThan(Long value) {
            addCriterion("PROJECTSTAGE >", value, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageGreaterThanOrEqualTo(Long value) {
            addCriterion("PROJECTSTAGE >=", value, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageLessThan(Long value) {
            addCriterion("PROJECTSTAGE <", value, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageLessThanOrEqualTo(Long value) {
            addCriterion("PROJECTSTAGE <=", value, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageIn(List<Long> values) {
            addCriterion("PROJECTSTAGE in", values, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageNotIn(List<Long> values) {
            addCriterion("PROJECTSTAGE not in", values, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageBetween(Long value1, Long value2) {
            addCriterion("PROJECTSTAGE between", value1, value2, "projectstage");
            return (Criteria) this;
        }

        public Criteria andProjectstageNotBetween(Long value1, Long value2) {
            addCriterion("PROJECTSTAGE not between", value1, value2, "projectstage");
            return (Criteria) this;
        }

        public Criteria andQuickratioIsNull() {
            addCriterion("QUICKRATIO is null");
            return (Criteria) this;
        }

        public Criteria andQuickratioIsNotNull() {
            addCriterion("QUICKRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andQuickratioEqualTo(Double value) {
            addCriterion("QUICKRATIO =", value, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioNotEqualTo(Double value) {
            addCriterion("QUICKRATIO <>", value, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioGreaterThan(Double value) {
            addCriterion("QUICKRATIO >", value, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioGreaterThanOrEqualTo(Double value) {
            addCriterion("QUICKRATIO >=", value, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioLessThan(Double value) {
            addCriterion("QUICKRATIO <", value, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioLessThanOrEqualTo(Double value) {
            addCriterion("QUICKRATIO <=", value, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioIn(List<Double> values) {
            addCriterion("QUICKRATIO in", values, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioNotIn(List<Double> values) {
            addCriterion("QUICKRATIO not in", values, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioBetween(Double value1, Double value2) {
            addCriterion("QUICKRATIO between", value1, value2, "quickratio");
            return (Criteria) this;
        }

        public Criteria andQuickratioNotBetween(Double value1, Double value2) {
            addCriterion("QUICKRATIO not between", value1, value2, "quickratio");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonIsNull() {
            addCriterion("RECEPTIONPERSON is null");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonIsNotNull() {
            addCriterion("RECEPTIONPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonEqualTo(String value) {
            addCriterion("RECEPTIONPERSON =", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonNotEqualTo(String value) {
            addCriterion("RECEPTIONPERSON <>", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonGreaterThan(String value) {
            addCriterion("RECEPTIONPERSON >", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonGreaterThanOrEqualTo(String value) {
            addCriterion("RECEPTIONPERSON >=", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonLessThan(String value) {
            addCriterion("RECEPTIONPERSON <", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonLessThanOrEqualTo(String value) {
            addCriterion("RECEPTIONPERSON <=", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonLike(String value) {
            addCriterion("RECEPTIONPERSON like", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonNotLike(String value) {
            addCriterion("RECEPTIONPERSON not like", value, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonIn(List<String> values) {
            addCriterion("RECEPTIONPERSON in", values, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonNotIn(List<String> values) {
            addCriterion("RECEPTIONPERSON not in", values, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonBetween(String value1, String value2) {
            addCriterion("RECEPTIONPERSON between", value1, value2, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andReceptionpersonNotBetween(String value1, String value2) {
            addCriterion("RECEPTIONPERSON not between", value1, value2, "receptionperson");
            return (Criteria) this;
        }

        public Criteria andRecoveramountIsNull() {
            addCriterion("RECOVERAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRecoveramountIsNotNull() {
            addCriterion("RECOVERAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveramountEqualTo(BigDecimal value) {
            addCriterion("RECOVERAMOUNT =", value, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountNotEqualTo(BigDecimal value) {
            addCriterion("RECOVERAMOUNT <>", value, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountGreaterThan(BigDecimal value) {
            addCriterion("RECOVERAMOUNT >", value, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECOVERAMOUNT >=", value, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountLessThan(BigDecimal value) {
            addCriterion("RECOVERAMOUNT <", value, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECOVERAMOUNT <=", value, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountIn(List<BigDecimal> values) {
            addCriterion("RECOVERAMOUNT in", values, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountNotIn(List<BigDecimal> values) {
            addCriterion("RECOVERAMOUNT not in", values, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECOVERAMOUNT between", value1, value2, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRecoveramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECOVERAMOUNT not between", value1, value2, "recoveramount");
            return (Criteria) this;
        }

        public Criteria andRegionalIsNull() {
            addCriterion("REGIONAL is null");
            return (Criteria) this;
        }

        public Criteria andRegionalIsNotNull() {
            addCriterion("REGIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andRegionalEqualTo(String value) {
            addCriterion("REGIONAL =", value, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalNotEqualTo(String value) {
            addCriterion("REGIONAL <>", value, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalGreaterThan(String value) {
            addCriterion("REGIONAL >", value, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalGreaterThanOrEqualTo(String value) {
            addCriterion("REGIONAL >=", value, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalLessThan(String value) {
            addCriterion("REGIONAL <", value, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalLessThanOrEqualTo(String value) {
            addCriterion("REGIONAL <=", value, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalLike(String value) {
            addCriterion("REGIONAL like", value, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalNotLike(String value) {
            addCriterion("REGIONAL not like", value, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalIn(List<String> values) {
            addCriterion("REGIONAL in", values, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalNotIn(List<String> values) {
            addCriterion("REGIONAL not in", values, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalBetween(String value1, String value2) {
            addCriterion("REGIONAL between", value1, value2, "regional");
            return (Criteria) this;
        }

        public Criteria andRegionalNotBetween(String value1, String value2) {
            addCriterion("REGIONAL not between", value1, value2, "regional");
            return (Criteria) this;
        }

        public Criteria andRelationprojectIsNull() {
            addCriterion("RELATIONPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andRelationprojectIsNotNull() {
            addCriterion("RELATIONPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andRelationprojectEqualTo(Short value) {
            addCriterion("RELATIONPROJECT =", value, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectNotEqualTo(Short value) {
            addCriterion("RELATIONPROJECT <>", value, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectGreaterThan(Short value) {
            addCriterion("RELATIONPROJECT >", value, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectGreaterThanOrEqualTo(Short value) {
            addCriterion("RELATIONPROJECT >=", value, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectLessThan(Short value) {
            addCriterion("RELATIONPROJECT <", value, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectLessThanOrEqualTo(Short value) {
            addCriterion("RELATIONPROJECT <=", value, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectIn(List<Short> values) {
            addCriterion("RELATIONPROJECT in", values, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectNotIn(List<Short> values) {
            addCriterion("RELATIONPROJECT not in", values, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectBetween(Short value1, Short value2) {
            addCriterion("RELATIONPROJECT between", value1, value2, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectNotBetween(Short value1, Short value2) {
            addCriterion("RELATIONPROJECT not between", value1, value2, "relationproject");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoIsNull() {
            addCriterion("RELATIONPROJECTNO is null");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoIsNotNull() {
            addCriterion("RELATIONPROJECTNO is not null");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoEqualTo(String value) {
            addCriterion("RELATIONPROJECTNO =", value, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoNotEqualTo(String value) {
            addCriterion("RELATIONPROJECTNO <>", value, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoGreaterThan(String value) {
            addCriterion("RELATIONPROJECTNO >", value, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIONPROJECTNO >=", value, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoLessThan(String value) {
            addCriterion("RELATIONPROJECTNO <", value, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoLessThanOrEqualTo(String value) {
            addCriterion("RELATIONPROJECTNO <=", value, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoLike(String value) {
            addCriterion("RELATIONPROJECTNO like", value, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoNotLike(String value) {
            addCriterion("RELATIONPROJECTNO not like", value, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoIn(List<String> values) {
            addCriterion("RELATIONPROJECTNO in", values, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoNotIn(List<String> values) {
            addCriterion("RELATIONPROJECTNO not in", values, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoBetween(String value1, String value2) {
            addCriterion("RELATIONPROJECTNO between", value1, value2, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andRelationprojectnoNotBetween(String value1, String value2) {
            addCriterion("RELATIONPROJECTNO not between", value1, value2, "relationprojectno");
            return (Criteria) this;
        }

        public Criteria andReviewamountIsNull() {
            addCriterion("REVIEWAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReviewamountIsNotNull() {
            addCriterion("REVIEWAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewamountEqualTo(BigDecimal value) {
            addCriterion("REVIEWAMOUNT =", value, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountNotEqualTo(BigDecimal value) {
            addCriterion("REVIEWAMOUNT <>", value, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountGreaterThan(BigDecimal value) {
            addCriterion("REVIEWAMOUNT >", value, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWAMOUNT >=", value, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountLessThan(BigDecimal value) {
            addCriterion("REVIEWAMOUNT <", value, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWAMOUNT <=", value, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountIn(List<BigDecimal> values) {
            addCriterion("REVIEWAMOUNT in", values, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountNotIn(List<BigDecimal> values) {
            addCriterion("REVIEWAMOUNT not in", values, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWAMOUNT between", value1, value2, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWAMOUNT not between", value1, value2, "reviewamount");
            return (Criteria) this;
        }

        public Criteria andReviewdateIsNull() {
            addCriterion("REVIEWDATE is null");
            return (Criteria) this;
        }

        public Criteria andReviewdateIsNotNull() {
            addCriterion("REVIEWDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewdateEqualTo(BigDecimal value) {
            addCriterion("REVIEWDATE =", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotEqualTo(BigDecimal value) {
            addCriterion("REVIEWDATE <>", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateGreaterThan(BigDecimal value) {
            addCriterion("REVIEWDATE >", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWDATE >=", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateLessThan(BigDecimal value) {
            addCriterion("REVIEWDATE <", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWDATE <=", value, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateIn(List<BigDecimal> values) {
            addCriterion("REVIEWDATE in", values, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotIn(List<BigDecimal> values) {
            addCriterion("REVIEWDATE not in", values, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWDATE between", value1, value2, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWDATE not between", value1, value2, "reviewdate");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineIsNull() {
            addCriterion("REVIEWDEADLINE is null");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineIsNotNull() {
            addCriterion("REVIEWDEADLINE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineEqualTo(Long value) {
            addCriterion("REVIEWDEADLINE =", value, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineNotEqualTo(Long value) {
            addCriterion("REVIEWDEADLINE <>", value, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineGreaterThan(Long value) {
            addCriterion("REVIEWDEADLINE >", value, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineGreaterThanOrEqualTo(Long value) {
            addCriterion("REVIEWDEADLINE >=", value, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineLessThan(Long value) {
            addCriterion("REVIEWDEADLINE <", value, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineLessThanOrEqualTo(Long value) {
            addCriterion("REVIEWDEADLINE <=", value, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineIn(List<Long> values) {
            addCriterion("REVIEWDEADLINE in", values, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineNotIn(List<Long> values) {
            addCriterion("REVIEWDEADLINE not in", values, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineBetween(Long value1, Long value2) {
            addCriterion("REVIEWDEADLINE between", value1, value2, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineNotBetween(Long value1, Long value2) {
            addCriterion("REVIEWDEADLINE not between", value1, value2, "reviewdeadline");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitIsNull() {
            addCriterion("REVIEWDEADLINEUNIT is null");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitIsNotNull() {
            addCriterion("REVIEWDEADLINEUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitEqualTo(String value) {
            addCriterion("REVIEWDEADLINEUNIT =", value, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitNotEqualTo(String value) {
            addCriterion("REVIEWDEADLINEUNIT <>", value, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitGreaterThan(String value) {
            addCriterion("REVIEWDEADLINEUNIT >", value, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEWDEADLINEUNIT >=", value, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitLessThan(String value) {
            addCriterion("REVIEWDEADLINEUNIT <", value, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitLessThanOrEqualTo(String value) {
            addCriterion("REVIEWDEADLINEUNIT <=", value, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitLike(String value) {
            addCriterion("REVIEWDEADLINEUNIT like", value, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitNotLike(String value) {
            addCriterion("REVIEWDEADLINEUNIT not like", value, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitIn(List<String> values) {
            addCriterion("REVIEWDEADLINEUNIT in", values, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitNotIn(List<String> values) {
            addCriterion("REVIEWDEADLINEUNIT not in", values, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitBetween(String value1, String value2) {
            addCriterion("REVIEWDEADLINEUNIT between", value1, value2, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewdeadlineunitNotBetween(String value1, String value2) {
            addCriterion("REVIEWDEADLINEUNIT not between", value1, value2, "reviewdeadlineunit");
            return (Criteria) this;
        }

        public Criteria andReviewmodeIsNull() {
            addCriterion("REVIEWMODE is null");
            return (Criteria) this;
        }

        public Criteria andReviewmodeIsNotNull() {
            addCriterion("REVIEWMODE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewmodeEqualTo(Long value) {
            addCriterion("REVIEWMODE =", value, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeNotEqualTo(Long value) {
            addCriterion("REVIEWMODE <>", value, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeGreaterThan(Long value) {
            addCriterion("REVIEWMODE >", value, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeGreaterThanOrEqualTo(Long value) {
            addCriterion("REVIEWMODE >=", value, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeLessThan(Long value) {
            addCriterion("REVIEWMODE <", value, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeLessThanOrEqualTo(Long value) {
            addCriterion("REVIEWMODE <=", value, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeIn(List<Long> values) {
            addCriterion("REVIEWMODE in", values, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeNotIn(List<Long> values) {
            addCriterion("REVIEWMODE not in", values, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeBetween(Long value1, Long value2) {
            addCriterion("REVIEWMODE between", value1, value2, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewmodeNotBetween(Long value1, Long value2) {
            addCriterion("REVIEWMODE not between", value1, value2, "reviewmode");
            return (Criteria) this;
        }

        public Criteria andReviewrateIsNull() {
            addCriterion("REVIEWRATE is null");
            return (Criteria) this;
        }

        public Criteria andReviewrateIsNotNull() {
            addCriterion("REVIEWRATE is not null");
            return (Criteria) this;
        }

        public Criteria andReviewrateEqualTo(Double value) {
            addCriterion("REVIEWRATE =", value, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateNotEqualTo(Double value) {
            addCriterion("REVIEWRATE <>", value, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateGreaterThan(Double value) {
            addCriterion("REVIEWRATE >", value, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateGreaterThanOrEqualTo(Double value) {
            addCriterion("REVIEWRATE >=", value, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateLessThan(Double value) {
            addCriterion("REVIEWRATE <", value, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateLessThanOrEqualTo(Double value) {
            addCriterion("REVIEWRATE <=", value, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateIn(List<Double> values) {
            addCriterion("REVIEWRATE in", values, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateNotIn(List<Double> values) {
            addCriterion("REVIEWRATE not in", values, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateBetween(Double value1, Double value2) {
            addCriterion("REVIEWRATE between", value1, value2, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andReviewrateNotBetween(Double value1, Double value2) {
            addCriterion("REVIEWRATE not between", value1, value2, "reviewrate");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoIsNull() {
            addCriterion("RISKAUDITNO is null");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoIsNotNull() {
            addCriterion("RISKAUDITNO is not null");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoEqualTo(String value) {
            addCriterion("RISKAUDITNO =", value, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoNotEqualTo(String value) {
            addCriterion("RISKAUDITNO <>", value, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoGreaterThan(String value) {
            addCriterion("RISKAUDITNO >", value, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoGreaterThanOrEqualTo(String value) {
            addCriterion("RISKAUDITNO >=", value, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoLessThan(String value) {
            addCriterion("RISKAUDITNO <", value, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoLessThanOrEqualTo(String value) {
            addCriterion("RISKAUDITNO <=", value, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoLike(String value) {
            addCriterion("RISKAUDITNO like", value, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoNotLike(String value) {
            addCriterion("RISKAUDITNO not like", value, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoIn(List<String> values) {
            addCriterion("RISKAUDITNO in", values, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoNotIn(List<String> values) {
            addCriterion("RISKAUDITNO not in", values, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoBetween(String value1, String value2) {
            addCriterion("RISKAUDITNO between", value1, value2, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andRiskauditnoNotBetween(String value1, String value2) {
            addCriterion("RISKAUDITNO not between", value1, value2, "riskauditno");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeIsNull() {
            addCriterion("THREERIGHTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeIsNotNull() {
            addCriterion("THREERIGHTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeEqualTo(String value) {
            addCriterion("THREERIGHTTYPE =", value, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeNotEqualTo(String value) {
            addCriterion("THREERIGHTTYPE <>", value, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeGreaterThan(String value) {
            addCriterion("THREERIGHTTYPE >", value, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeGreaterThanOrEqualTo(String value) {
            addCriterion("THREERIGHTTYPE >=", value, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeLessThan(String value) {
            addCriterion("THREERIGHTTYPE <", value, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeLessThanOrEqualTo(String value) {
            addCriterion("THREERIGHTTYPE <=", value, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeLike(String value) {
            addCriterion("THREERIGHTTYPE like", value, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeNotLike(String value) {
            addCriterion("THREERIGHTTYPE not like", value, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeIn(List<String> values) {
            addCriterion("THREERIGHTTYPE in", values, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeNotIn(List<String> values) {
            addCriterion("THREERIGHTTYPE not in", values, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeBetween(String value1, String value2) {
            addCriterion("THREERIGHTTYPE between", value1, value2, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andThreerighttypeNotBetween(String value1, String value2) {
            addCriterion("THREERIGHTTYPE not between", value1, value2, "threerighttype");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentIsNull() {
            addCriterion("TOTALINVESTMENT is null");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentIsNotNull() {
            addCriterion("TOTALINVESTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentEqualTo(BigDecimal value) {
            addCriterion("TOTALINVESTMENT =", value, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentNotEqualTo(BigDecimal value) {
            addCriterion("TOTALINVESTMENT <>", value, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentGreaterThan(BigDecimal value) {
            addCriterion("TOTALINVESTMENT >", value, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALINVESTMENT >=", value, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentLessThan(BigDecimal value) {
            addCriterion("TOTALINVESTMENT <", value, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALINVESTMENT <=", value, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentIn(List<BigDecimal> values) {
            addCriterion("TOTALINVESTMENT in", values, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentNotIn(List<BigDecimal> values) {
            addCriterion("TOTALINVESTMENT not in", values, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALINVESTMENT between", value1, value2, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andTotalinvestmentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALINVESTMENT not between", value1, value2, "totalinvestment");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNull() {
            addCriterion("URGENCY is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNotNull() {
            addCriterion("URGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyEqualTo(String value) {
            addCriterion("URGENCY =", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotEqualTo(String value) {
            addCriterion("URGENCY <>", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThan(String value) {
            addCriterion("URGENCY >", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThanOrEqualTo(String value) {
            addCriterion("URGENCY >=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThan(String value) {
            addCriterion("URGENCY <", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThanOrEqualTo(String value) {
            addCriterion("URGENCY <=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLike(String value) {
            addCriterion("URGENCY like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotLike(String value) {
            addCriterion("URGENCY not like", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyIn(List<String> values) {
            addCriterion("URGENCY in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotIn(List<String> values) {
            addCriterion("URGENCY not in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyBetween(String value1, String value2) {
            addCriterion("URGENCY between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotBetween(String value1, String value2) {
            addCriterion("URGENCY not between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdIsNull() {
            addCriterion("BUSINESSTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdIsNotNull() {
            addCriterion("BUSINESSTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdEqualTo(String value) {
            addCriterion("BUSINESSTYPE_ID =", value, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdNotEqualTo(String value) {
            addCriterion("BUSINESSTYPE_ID <>", value, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdGreaterThan(String value) {
            addCriterion("BUSINESSTYPE_ID >", value, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE_ID >=", value, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdLessThan(String value) {
            addCriterion("BUSINESSTYPE_ID <", value, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSTYPE_ID <=", value, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdLike(String value) {
            addCriterion("BUSINESSTYPE_ID like", value, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdNotLike(String value) {
            addCriterion("BUSINESSTYPE_ID not like", value, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdIn(List<String> values) {
            addCriterion("BUSINESSTYPE_ID in", values, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdNotIn(List<String> values) {
            addCriterion("BUSINESSTYPE_ID not in", values, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE_ID between", value1, value2, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIdNotBetween(String value1, String value2) {
            addCriterion("BUSINESSTYPE_ID not between", value1, value2, "businesstypeId");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("CLIENT_ID =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("CLIENT_ID <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("CLIENT_ID >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_ID >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("CLIENT_ID <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_ID <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("CLIENT_ID like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("CLIENT_ID not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("CLIENT_ID in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("CLIENT_ID not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("CLIENT_ID between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("CLIENT_ID not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("COMPANY_ID like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("COMPANY_ID not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("DEPARTMENT_ID like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("DEPARTMENT_ID not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdIsNull() {
            addCriterion("GUARANTEECREDIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdIsNotNull() {
            addCriterion("GUARANTEECREDIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdEqualTo(String value) {
            addCriterion("GUARANTEECREDIT_ID =", value, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdNotEqualTo(String value) {
            addCriterion("GUARANTEECREDIT_ID <>", value, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdGreaterThan(String value) {
            addCriterion("GUARANTEECREDIT_ID >", value, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEECREDIT_ID >=", value, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdLessThan(String value) {
            addCriterion("GUARANTEECREDIT_ID <", value, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEECREDIT_ID <=", value, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdLike(String value) {
            addCriterion("GUARANTEECREDIT_ID like", value, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdNotLike(String value) {
            addCriterion("GUARANTEECREDIT_ID not like", value, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdIn(List<String> values) {
            addCriterion("GUARANTEECREDIT_ID in", values, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdNotIn(List<String> values) {
            addCriterion("GUARANTEECREDIT_ID not in", values, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdBetween(String value1, String value2) {
            addCriterion("GUARANTEECREDIT_ID between", value1, value2, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditIdNotBetween(String value1, String value2) {
            addCriterion("GUARANTEECREDIT_ID not between", value1, value2, "guaranteecreditId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdIsNull() {
            addCriterion("GUARANTEECREDITUSED_ID is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdIsNotNull() {
            addCriterion("GUARANTEECREDITUSED_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdEqualTo(String value) {
            addCriterion("GUARANTEECREDITUSED_ID =", value, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdNotEqualTo(String value) {
            addCriterion("GUARANTEECREDITUSED_ID <>", value, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdGreaterThan(String value) {
            addCriterion("GUARANTEECREDITUSED_ID >", value, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTEECREDITUSED_ID >=", value, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdLessThan(String value) {
            addCriterion("GUARANTEECREDITUSED_ID <", value, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdLessThanOrEqualTo(String value) {
            addCriterion("GUARANTEECREDITUSED_ID <=", value, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdLike(String value) {
            addCriterion("GUARANTEECREDITUSED_ID like", value, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdNotLike(String value) {
            addCriterion("GUARANTEECREDITUSED_ID not like", value, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdIn(List<String> values) {
            addCriterion("GUARANTEECREDITUSED_ID in", values, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdNotIn(List<String> values) {
            addCriterion("GUARANTEECREDITUSED_ID not in", values, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdBetween(String value1, String value2) {
            addCriterion("GUARANTEECREDITUSED_ID between", value1, value2, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andGuaranteecreditusedIdNotBetween(String value1, String value2) {
            addCriterion("GUARANTEECREDITUSED_ID not between", value1, value2, "guaranteecreditusedId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdIsNull() {
            addCriterion("INTENTPRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdIsNotNull() {
            addCriterion("INTENTPRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdEqualTo(String value) {
            addCriterion("INTENTPRODUCT_ID =", value, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdNotEqualTo(String value) {
            addCriterion("INTENTPRODUCT_ID <>", value, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdGreaterThan(String value) {
            addCriterion("INTENTPRODUCT_ID >", value, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdGreaterThanOrEqualTo(String value) {
            addCriterion("INTENTPRODUCT_ID >=", value, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdLessThan(String value) {
            addCriterion("INTENTPRODUCT_ID <", value, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdLessThanOrEqualTo(String value) {
            addCriterion("INTENTPRODUCT_ID <=", value, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdLike(String value) {
            addCriterion("INTENTPRODUCT_ID like", value, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdNotLike(String value) {
            addCriterion("INTENTPRODUCT_ID not like", value, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdIn(List<String> values) {
            addCriterion("INTENTPRODUCT_ID in", values, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdNotIn(List<String> values) {
            addCriterion("INTENTPRODUCT_ID not in", values, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdBetween(String value1, String value2) {
            addCriterion("INTENTPRODUCT_ID between", value1, value2, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andIntentproductIdNotBetween(String value1, String value2) {
            addCriterion("INTENTPRODUCT_ID not between", value1, value2, "intentproductId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdIsNull() {
            addCriterion("JOINTGUARANTEECOMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdIsNotNull() {
            addCriterion("JOINTGUARANTEECOMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdEqualTo(String value) {
            addCriterion("JOINTGUARANTEECOMPANY_ID =", value, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdNotEqualTo(String value) {
            addCriterion("JOINTGUARANTEECOMPANY_ID <>", value, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdGreaterThan(String value) {
            addCriterion("JOINTGUARANTEECOMPANY_ID >", value, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("JOINTGUARANTEECOMPANY_ID >=", value, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdLessThan(String value) {
            addCriterion("JOINTGUARANTEECOMPANY_ID <", value, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdLessThanOrEqualTo(String value) {
            addCriterion("JOINTGUARANTEECOMPANY_ID <=", value, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdLike(String value) {
            addCriterion("JOINTGUARANTEECOMPANY_ID like", value, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdNotLike(String value) {
            addCriterion("JOINTGUARANTEECOMPANY_ID not like", value, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdIn(List<String> values) {
            addCriterion("JOINTGUARANTEECOMPANY_ID in", values, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdNotIn(List<String> values) {
            addCriterion("JOINTGUARANTEECOMPANY_ID not in", values, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdBetween(String value1, String value2) {
            addCriterion("JOINTGUARANTEECOMPANY_ID between", value1, value2, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andJointguaranteecompanyIdNotBetween(String value1, String value2) {
            addCriterion("JOINTGUARANTEECOMPANY_ID not between", value1, value2, "jointguaranteecompanyId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdIsNull() {
            addCriterion("LOANORGANIZATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdIsNotNull() {
            addCriterion("LOANORGANIZATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdEqualTo(String value) {
            addCriterion("LOANORGANIZATION_ID =", value, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdNotEqualTo(String value) {
            addCriterion("LOANORGANIZATION_ID <>", value, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdGreaterThan(String value) {
            addCriterion("LOANORGANIZATION_ID >", value, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOANORGANIZATION_ID >=", value, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdLessThan(String value) {
            addCriterion("LOANORGANIZATION_ID <", value, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdLessThanOrEqualTo(String value) {
            addCriterion("LOANORGANIZATION_ID <=", value, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdLike(String value) {
            addCriterion("LOANORGANIZATION_ID like", value, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdNotLike(String value) {
            addCriterion("LOANORGANIZATION_ID not like", value, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdIn(List<String> values) {
            addCriterion("LOANORGANIZATION_ID in", values, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdNotIn(List<String> values) {
            addCriterion("LOANORGANIZATION_ID not in", values, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdBetween(String value1, String value2) {
            addCriterion("LOANORGANIZATION_ID between", value1, value2, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andLoanorganizationIdNotBetween(String value1, String value2) {
            addCriterion("LOANORGANIZATION_ID not between", value1, value2, "loanorganizationId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdIsNull() {
            addCriterion("PROJFEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdIsNotNull() {
            addCriterion("PROJFEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdEqualTo(String value) {
            addCriterion("PROJFEE_ID =", value, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdNotEqualTo(String value) {
            addCriterion("PROJFEE_ID <>", value, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdGreaterThan(String value) {
            addCriterion("PROJFEE_ID >", value, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJFEE_ID >=", value, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdLessThan(String value) {
            addCriterion("PROJFEE_ID <", value, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdLessThanOrEqualTo(String value) {
            addCriterion("PROJFEE_ID <=", value, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdLike(String value) {
            addCriterion("PROJFEE_ID like", value, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdNotLike(String value) {
            addCriterion("PROJFEE_ID not like", value, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdIn(List<String> values) {
            addCriterion("PROJFEE_ID in", values, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdNotIn(List<String> values) {
            addCriterion("PROJFEE_ID not in", values, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdBetween(String value1, String value2) {
            addCriterion("PROJFEE_ID between", value1, value2, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjfeeIdNotBetween(String value1, String value2) {
            addCriterion("PROJFEE_ID not between", value1, value2, "projfeeId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdIsNull() {
            addCriterion("PROJECTCANCELAPPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdIsNotNull() {
            addCriterion("PROJECTCANCELAPPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdEqualTo(String value) {
            addCriterion("PROJECTCANCELAPPLY_ID =", value, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdNotEqualTo(String value) {
            addCriterion("PROJECTCANCELAPPLY_ID <>", value, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdGreaterThan(String value) {
            addCriterion("PROJECTCANCELAPPLY_ID >", value, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTCANCELAPPLY_ID >=", value, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdLessThan(String value) {
            addCriterion("PROJECTCANCELAPPLY_ID <", value, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECTCANCELAPPLY_ID <=", value, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdLike(String value) {
            addCriterion("PROJECTCANCELAPPLY_ID like", value, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdNotLike(String value) {
            addCriterion("PROJECTCANCELAPPLY_ID not like", value, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdIn(List<String> values) {
            addCriterion("PROJECTCANCELAPPLY_ID in", values, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdNotIn(List<String> values) {
            addCriterion("PROJECTCANCELAPPLY_ID not in", values, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdBetween(String value1, String value2) {
            addCriterion("PROJECTCANCELAPPLY_ID between", value1, value2, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andProjectcancelapplyIdNotBetween(String value1, String value2) {
            addCriterion("PROJECTCANCELAPPLY_ID not between", value1, value2, "projectcancelapplyId");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldIsNull() {
            addCriterion("INTENDINGYIELD is null");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldIsNotNull() {
            addCriterion("INTENDINGYIELD is not null");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldEqualTo(Double value) {
            addCriterion("INTENDINGYIELD =", value, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldNotEqualTo(Double value) {
            addCriterion("INTENDINGYIELD <>", value, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldGreaterThan(Double value) {
            addCriterion("INTENDINGYIELD >", value, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldGreaterThanOrEqualTo(Double value) {
            addCriterion("INTENDINGYIELD >=", value, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldLessThan(Double value) {
            addCriterion("INTENDINGYIELD <", value, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldLessThanOrEqualTo(Double value) {
            addCriterion("INTENDINGYIELD <=", value, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldIn(List<Double> values) {
            addCriterion("INTENDINGYIELD in", values, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldNotIn(List<Double> values) {
            addCriterion("INTENDINGYIELD not in", values, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldBetween(Double value1, Double value2) {
            addCriterion("INTENDINGYIELD between", value1, value2, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIntendingyieldNotBetween(Double value1, Double value2) {
            addCriterion("INTENDINGYIELD not between", value1, value2, "intendingyield");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectIsNull() {
            addCriterion("ISRISKPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectIsNotNull() {
            addCriterion("ISRISKPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectEqualTo(Short value) {
            addCriterion("ISRISKPROJECT =", value, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectNotEqualTo(Short value) {
            addCriterion("ISRISKPROJECT <>", value, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectGreaterThan(Short value) {
            addCriterion("ISRISKPROJECT >", value, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectGreaterThanOrEqualTo(Short value) {
            addCriterion("ISRISKPROJECT >=", value, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectLessThan(Short value) {
            addCriterion("ISRISKPROJECT <", value, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectLessThanOrEqualTo(Short value) {
            addCriterion("ISRISKPROJECT <=", value, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectIn(List<Short> values) {
            addCriterion("ISRISKPROJECT in", values, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectNotIn(List<Short> values) {
            addCriterion("ISRISKPROJECT not in", values, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectBetween(Short value1, Short value2) {
            addCriterion("ISRISKPROJECT between", value1, value2, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andIsriskprojectNotBetween(Short value1, Short value2) {
            addCriterion("ISRISKPROJECT not between", value1, value2, "isriskproject");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdIsNull() {
            addCriterion("OPERATEDEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdIsNotNull() {
            addCriterion("OPERATEDEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdEqualTo(String value) {
            addCriterion("OPERATEDEPT_ID =", value, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdNotEqualTo(String value) {
            addCriterion("OPERATEDEPT_ID <>", value, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdGreaterThan(String value) {
            addCriterion("OPERATEDEPT_ID >", value, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATEDEPT_ID >=", value, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdLessThan(String value) {
            addCriterion("OPERATEDEPT_ID <", value, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATEDEPT_ID <=", value, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdLike(String value) {
            addCriterion("OPERATEDEPT_ID like", value, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdNotLike(String value) {
            addCriterion("OPERATEDEPT_ID not like", value, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdIn(List<String> values) {
            addCriterion("OPERATEDEPT_ID in", values, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdNotIn(List<String> values) {
            addCriterion("OPERATEDEPT_ID not in", values, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdBetween(String value1, String value2) {
            addCriterion("OPERATEDEPT_ID between", value1, value2, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andOperatedeptIdNotBetween(String value1, String value2) {
            addCriterion("OPERATEDEPT_ID not between", value1, value2, "operatedeptId");
            return (Criteria) this;
        }

        public Criteria andLimittagIsNull() {
            addCriterion("LIMITTAG is null");
            return (Criteria) this;
        }

        public Criteria andLimittagIsNotNull() {
            addCriterion("LIMITTAG is not null");
            return (Criteria) this;
        }

        public Criteria andLimittagEqualTo(String value) {
            addCriterion("LIMITTAG =", value, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagNotEqualTo(String value) {
            addCriterion("LIMITTAG <>", value, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagGreaterThan(String value) {
            addCriterion("LIMITTAG >", value, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagGreaterThanOrEqualTo(String value) {
            addCriterion("LIMITTAG >=", value, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagLessThan(String value) {
            addCriterion("LIMITTAG <", value, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagLessThanOrEqualTo(String value) {
            addCriterion("LIMITTAG <=", value, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagLike(String value) {
            addCriterion("LIMITTAG like", value, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagNotLike(String value) {
            addCriterion("LIMITTAG not like", value, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagIn(List<String> values) {
            addCriterion("LIMITTAG in", values, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagNotIn(List<String> values) {
            addCriterion("LIMITTAG not in", values, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagBetween(String value1, String value2) {
            addCriterion("LIMITTAG between", value1, value2, "limittag");
            return (Criteria) this;
        }

        public Criteria andLimittagNotBetween(String value1, String value2) {
            addCriterion("LIMITTAG not between", value1, value2, "limittag");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdIsNull() {
            addCriterion("OPERATEORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdIsNotNull() {
            addCriterion("OPERATEORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdEqualTo(String value) {
            addCriterion("OPERATEORG_ID =", value, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdNotEqualTo(String value) {
            addCriterion("OPERATEORG_ID <>", value, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdGreaterThan(String value) {
            addCriterion("OPERATEORG_ID >", value, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATEORG_ID >=", value, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdLessThan(String value) {
            addCriterion("OPERATEORG_ID <", value, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATEORG_ID <=", value, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdLike(String value) {
            addCriterion("OPERATEORG_ID like", value, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdNotLike(String value) {
            addCriterion("OPERATEORG_ID not like", value, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdIn(List<String> values) {
            addCriterion("OPERATEORG_ID in", values, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdNotIn(List<String> values) {
            addCriterion("OPERATEORG_ID not in", values, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdBetween(String value1, String value2) {
            addCriterion("OPERATEORG_ID between", value1, value2, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andOperateorgIdNotBetween(String value1, String value2) {
            addCriterion("OPERATEORG_ID not between", value1, value2, "operateorgId");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateIsNull() {
            addCriterion("FORMALAPPLYDATE is null");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateIsNotNull() {
            addCriterion("FORMALAPPLYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateEqualTo(BigDecimal value) {
            addCriterion("FORMALAPPLYDATE =", value, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateNotEqualTo(BigDecimal value) {
            addCriterion("FORMALAPPLYDATE <>", value, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateGreaterThan(BigDecimal value) {
            addCriterion("FORMALAPPLYDATE >", value, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMALAPPLYDATE >=", value, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateLessThan(BigDecimal value) {
            addCriterion("FORMALAPPLYDATE <", value, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMALAPPLYDATE <=", value, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateIn(List<BigDecimal> values) {
            addCriterion("FORMALAPPLYDATE in", values, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateNotIn(List<BigDecimal> values) {
            addCriterion("FORMALAPPLYDATE not in", values, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMALAPPLYDATE between", value1, value2, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andFormalapplydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMALAPPLYDATE not between", value1, value2, "formalapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateIsNull() {
            addCriterion("INTENTAPPLYDATE is null");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateIsNotNull() {
            addCriterion("INTENTAPPLYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateEqualTo(BigDecimal value) {
            addCriterion("INTENTAPPLYDATE =", value, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateNotEqualTo(BigDecimal value) {
            addCriterion("INTENTAPPLYDATE <>", value, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateGreaterThan(BigDecimal value) {
            addCriterion("INTENTAPPLYDATE >", value, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTENTAPPLYDATE >=", value, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateLessThan(BigDecimal value) {
            addCriterion("INTENTAPPLYDATE <", value, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTENTAPPLYDATE <=", value, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateIn(List<BigDecimal> values) {
            addCriterion("INTENTAPPLYDATE in", values, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateNotIn(List<BigDecimal> values) {
            addCriterion("INTENTAPPLYDATE not in", values, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTENTAPPLYDATE between", value1, value2, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIntentapplydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTENTAPPLYDATE not between", value1, value2, "intentapplydate");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyIsNull() {
            addCriterion("ISFORMALAPPLY is null");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyIsNotNull() {
            addCriterion("ISFORMALAPPLY is not null");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyEqualTo(Short value) {
            addCriterion("ISFORMALAPPLY =", value, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyNotEqualTo(Short value) {
            addCriterion("ISFORMALAPPLY <>", value, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyGreaterThan(Short value) {
            addCriterion("ISFORMALAPPLY >", value, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyGreaterThanOrEqualTo(Short value) {
            addCriterion("ISFORMALAPPLY >=", value, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyLessThan(Short value) {
            addCriterion("ISFORMALAPPLY <", value, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyLessThanOrEqualTo(Short value) {
            addCriterion("ISFORMALAPPLY <=", value, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyIn(List<Short> values) {
            addCriterion("ISFORMALAPPLY in", values, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyNotIn(List<Short> values) {
            addCriterion("ISFORMALAPPLY not in", values, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyBetween(Short value1, Short value2) {
            addCriterion("ISFORMALAPPLY between", value1, value2, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsformalapplyNotBetween(Short value1, Short value2) {
            addCriterion("ISFORMALAPPLY not between", value1, value2, "isformalapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyIsNull() {
            addCriterion("ISINTENTAPPLY is null");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyIsNotNull() {
            addCriterion("ISINTENTAPPLY is not null");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyEqualTo(Short value) {
            addCriterion("ISINTENTAPPLY =", value, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyNotEqualTo(Short value) {
            addCriterion("ISINTENTAPPLY <>", value, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyGreaterThan(Short value) {
            addCriterion("ISINTENTAPPLY >", value, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyGreaterThanOrEqualTo(Short value) {
            addCriterion("ISINTENTAPPLY >=", value, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyLessThan(Short value) {
            addCriterion("ISINTENTAPPLY <", value, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyLessThanOrEqualTo(Short value) {
            addCriterion("ISINTENTAPPLY <=", value, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyIn(List<Short> values) {
            addCriterion("ISINTENTAPPLY in", values, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyNotIn(List<Short> values) {
            addCriterion("ISINTENTAPPLY not in", values, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyBetween(Short value1, Short value2) {
            addCriterion("ISINTENTAPPLY between", value1, value2, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andIsintentapplyNotBetween(Short value1, Short value2) {
            addCriterion("ISINTENTAPPLY not between", value1, value2, "isintentapply");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountIsNull() {
            addCriterion("CHARGEREVIEWAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountIsNotNull() {
            addCriterion("CHARGEREVIEWAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountEqualTo(BigDecimal value) {
            addCriterion("CHARGEREVIEWAMOUNT =", value, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountNotEqualTo(BigDecimal value) {
            addCriterion("CHARGEREVIEWAMOUNT <>", value, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountGreaterThan(BigDecimal value) {
            addCriterion("CHARGEREVIEWAMOUNT >", value, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGEREVIEWAMOUNT >=", value, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountLessThan(BigDecimal value) {
            addCriterion("CHARGEREVIEWAMOUNT <", value, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHARGEREVIEWAMOUNT <=", value, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountIn(List<BigDecimal> values) {
            addCriterion("CHARGEREVIEWAMOUNT in", values, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountNotIn(List<BigDecimal> values) {
            addCriterion("CHARGEREVIEWAMOUNT not in", values, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGEREVIEWAMOUNT between", value1, value2, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHARGEREVIEWAMOUNT not between", value1, value2, "chargereviewamount");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayIsNull() {
            addCriterion("CHARGEREVIEWWAY is null");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayIsNotNull() {
            addCriterion("CHARGEREVIEWWAY is not null");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayEqualTo(String value) {
            addCriterion("CHARGEREVIEWWAY =", value, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayNotEqualTo(String value) {
            addCriterion("CHARGEREVIEWWAY <>", value, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayGreaterThan(String value) {
            addCriterion("CHARGEREVIEWWAY >", value, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGEREVIEWWAY >=", value, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayLessThan(String value) {
            addCriterion("CHARGEREVIEWWAY <", value, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayLessThanOrEqualTo(String value) {
            addCriterion("CHARGEREVIEWWAY <=", value, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayLike(String value) {
            addCriterion("CHARGEREVIEWWAY like", value, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayNotLike(String value) {
            addCriterion("CHARGEREVIEWWAY not like", value, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayIn(List<String> values) {
            addCriterion("CHARGEREVIEWWAY in", values, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayNotIn(List<String> values) {
            addCriterion("CHARGEREVIEWWAY not in", values, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayBetween(String value1, String value2) {
            addCriterion("CHARGEREVIEWWAY between", value1, value2, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andChargereviewwayNotBetween(String value1, String value2) {
            addCriterion("CHARGEREVIEWWAY not between", value1, value2, "chargereviewway");
            return (Criteria) this;
        }

        public Criteria andOverduerateIsNull() {
            addCriterion("OVERDUERATE is null");
            return (Criteria) this;
        }

        public Criteria andOverduerateIsNotNull() {
            addCriterion("OVERDUERATE is not null");
            return (Criteria) this;
        }

        public Criteria andOverduerateEqualTo(Double value) {
            addCriterion("OVERDUERATE =", value, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateNotEqualTo(Double value) {
            addCriterion("OVERDUERATE <>", value, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateGreaterThan(Double value) {
            addCriterion("OVERDUERATE >", value, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateGreaterThanOrEqualTo(Double value) {
            addCriterion("OVERDUERATE >=", value, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateLessThan(Double value) {
            addCriterion("OVERDUERATE <", value, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateLessThanOrEqualTo(Double value) {
            addCriterion("OVERDUERATE <=", value, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateIn(List<Double> values) {
            addCriterion("OVERDUERATE in", values, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateNotIn(List<Double> values) {
            addCriterion("OVERDUERATE not in", values, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateBetween(Double value1, Double value2) {
            addCriterion("OVERDUERATE between", value1, value2, "overduerate");
            return (Criteria) this;
        }

        public Criteria andOverduerateNotBetween(Double value1, Double value2) {
            addCriterion("OVERDUERATE not between", value1, value2, "overduerate");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestIsNull() {
            addCriterion("ANNUALINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestIsNotNull() {
            addCriterion("ANNUALINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestEqualTo(Double value) {
            addCriterion("ANNUALINTEREST =", value, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestNotEqualTo(Double value) {
            addCriterion("ANNUALINTEREST <>", value, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestGreaterThan(Double value) {
            addCriterion("ANNUALINTEREST >", value, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestGreaterThanOrEqualTo(Double value) {
            addCriterion("ANNUALINTEREST >=", value, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestLessThan(Double value) {
            addCriterion("ANNUALINTEREST <", value, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestLessThanOrEqualTo(Double value) {
            addCriterion("ANNUALINTEREST <=", value, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestIn(List<Double> values) {
            addCriterion("ANNUALINTEREST in", values, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestNotIn(List<Double> values) {
            addCriterion("ANNUALINTEREST not in", values, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestBetween(Double value1, Double value2) {
            addCriterion("ANNUALINTEREST between", value1, value2, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestNotBetween(Double value1, Double value2) {
            addCriterion("ANNUALINTEREST not between", value1, value2, "annualinterest");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountIsNull() {
            addCriterion("ANNUALINTERESTAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountIsNotNull() {
            addCriterion("ANNUALINTERESTAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountEqualTo(BigDecimal value) {
            addCriterion("ANNUALINTERESTAMOUNT =", value, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountNotEqualTo(BigDecimal value) {
            addCriterion("ANNUALINTERESTAMOUNT <>", value, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountGreaterThan(BigDecimal value) {
            addCriterion("ANNUALINTERESTAMOUNT >", value, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ANNUALINTERESTAMOUNT >=", value, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountLessThan(BigDecimal value) {
            addCriterion("ANNUALINTERESTAMOUNT <", value, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ANNUALINTERESTAMOUNT <=", value, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountIn(List<BigDecimal> values) {
            addCriterion("ANNUALINTERESTAMOUNT in", values, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountNotIn(List<BigDecimal> values) {
            addCriterion("ANNUALINTERESTAMOUNT not in", values, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ANNUALINTERESTAMOUNT between", value1, value2, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andAnnualinterestamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ANNUALINTERESTAMOUNT not between", value1, value2, "annualinterestamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountIsNull() {
            addCriterion("EARNINGSAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andEarningsamountIsNotNull() {
            addCriterion("EARNINGSAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEarningsamountEqualTo(BigDecimal value) {
            addCriterion("EARNINGSAMOUNT =", value, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountNotEqualTo(BigDecimal value) {
            addCriterion("EARNINGSAMOUNT <>", value, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountGreaterThan(BigDecimal value) {
            addCriterion("EARNINGSAMOUNT >", value, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EARNINGSAMOUNT >=", value, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountLessThan(BigDecimal value) {
            addCriterion("EARNINGSAMOUNT <", value, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EARNINGSAMOUNT <=", value, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountIn(List<BigDecimal> values) {
            addCriterion("EARNINGSAMOUNT in", values, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountNotIn(List<BigDecimal> values) {
            addCriterion("EARNINGSAMOUNT not in", values, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EARNINGSAMOUNT between", value1, value2, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EARNINGSAMOUNT not between", value1, value2, "earningsamount");
            return (Criteria) this;
        }

        public Criteria andEarningsratioIsNull() {
            addCriterion("EARNINGSRATIO is null");
            return (Criteria) this;
        }

        public Criteria andEarningsratioIsNotNull() {
            addCriterion("EARNINGSRATIO is not null");
            return (Criteria) this;
        }

        public Criteria andEarningsratioEqualTo(Double value) {
            addCriterion("EARNINGSRATIO =", value, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioNotEqualTo(Double value) {
            addCriterion("EARNINGSRATIO <>", value, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioGreaterThan(Double value) {
            addCriterion("EARNINGSRATIO >", value, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioGreaterThanOrEqualTo(Double value) {
            addCriterion("EARNINGSRATIO >=", value, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioLessThan(Double value) {
            addCriterion("EARNINGSRATIO <", value, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioLessThanOrEqualTo(Double value) {
            addCriterion("EARNINGSRATIO <=", value, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioIn(List<Double> values) {
            addCriterion("EARNINGSRATIO in", values, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioNotIn(List<Double> values) {
            addCriterion("EARNINGSRATIO not in", values, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioBetween(Double value1, Double value2) {
            addCriterion("EARNINGSRATIO between", value1, value2, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andEarningsratioNotBetween(Double value1, Double value2) {
            addCriterion("EARNINGSRATIO not between", value1, value2, "earningsratio");
            return (Criteria) this;
        }

        public Criteria andThistotalamountIsNull() {
            addCriterion("THISTOTALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andThistotalamountIsNotNull() {
            addCriterion("THISTOTALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andThistotalamountEqualTo(BigDecimal value) {
            addCriterion("THISTOTALAMOUNT =", value, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountNotEqualTo(BigDecimal value) {
            addCriterion("THISTOTALAMOUNT <>", value, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountGreaterThan(BigDecimal value) {
            addCriterion("THISTOTALAMOUNT >", value, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("THISTOTALAMOUNT >=", value, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountLessThan(BigDecimal value) {
            addCriterion("THISTOTALAMOUNT <", value, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("THISTOTALAMOUNT <=", value, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountIn(List<BigDecimal> values) {
            addCriterion("THISTOTALAMOUNT in", values, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountNotIn(List<BigDecimal> values) {
            addCriterion("THISTOTALAMOUNT not in", values, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THISTOTALAMOUNT between", value1, value2, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andThistotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("THISTOTALAMOUNT not between", value1, value2, "thistotalamount");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdIsNull() {
            addCriterion("UNDERWRITER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdIsNotNull() {
            addCriterion("UNDERWRITER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdEqualTo(String value) {
            addCriterion("UNDERWRITER_ID =", value, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdNotEqualTo(String value) {
            addCriterion("UNDERWRITER_ID <>", value, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdGreaterThan(String value) {
            addCriterion("UNDERWRITER_ID >", value, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdGreaterThanOrEqualTo(String value) {
            addCriterion("UNDERWRITER_ID >=", value, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdLessThan(String value) {
            addCriterion("UNDERWRITER_ID <", value, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdLessThanOrEqualTo(String value) {
            addCriterion("UNDERWRITER_ID <=", value, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdLike(String value) {
            addCriterion("UNDERWRITER_ID like", value, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdNotLike(String value) {
            addCriterion("UNDERWRITER_ID not like", value, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdIn(List<String> values) {
            addCriterion("UNDERWRITER_ID in", values, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdNotIn(List<String> values) {
            addCriterion("UNDERWRITER_ID not in", values, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdBetween(String value1, String value2) {
            addCriterion("UNDERWRITER_ID between", value1, value2, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andUnderwriterIdNotBetween(String value1, String value2) {
            addCriterion("UNDERWRITER_ID not between", value1, value2, "underwriterId");
            return (Criteria) this;
        }

        public Criteria andInventorytypeIsNull() {
            addCriterion("INVENTORYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andInventorytypeIsNotNull() {
            addCriterion("INVENTORYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInventorytypeEqualTo(String value) {
            addCriterion("INVENTORYTYPE =", value, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeNotEqualTo(String value) {
            addCriterion("INVENTORYTYPE <>", value, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeGreaterThan(String value) {
            addCriterion("INVENTORYTYPE >", value, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORYTYPE >=", value, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeLessThan(String value) {
            addCriterion("INVENTORYTYPE <", value, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeLessThanOrEqualTo(String value) {
            addCriterion("INVENTORYTYPE <=", value, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeLike(String value) {
            addCriterion("INVENTORYTYPE like", value, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeNotLike(String value) {
            addCriterion("INVENTORYTYPE not like", value, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeIn(List<String> values) {
            addCriterion("INVENTORYTYPE in", values, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeNotIn(List<String> values) {
            addCriterion("INVENTORYTYPE not in", values, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeBetween(String value1, String value2) {
            addCriterion("INVENTORYTYPE between", value1, value2, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andInventorytypeNotBetween(String value1, String value2) {
            addCriterion("INVENTORYTYPE not between", value1, value2, "inventorytype");
            return (Criteria) this;
        }

        public Criteria andRenewproidIsNull() {
            addCriterion("RENEWPROID is null");
            return (Criteria) this;
        }

        public Criteria andRenewproidIsNotNull() {
            addCriterion("RENEWPROID is not null");
            return (Criteria) this;
        }

        public Criteria andRenewproidEqualTo(String value) {
            addCriterion("RENEWPROID =", value, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidNotEqualTo(String value) {
            addCriterion("RENEWPROID <>", value, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidGreaterThan(String value) {
            addCriterion("RENEWPROID >", value, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidGreaterThanOrEqualTo(String value) {
            addCriterion("RENEWPROID >=", value, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidLessThan(String value) {
            addCriterion("RENEWPROID <", value, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidLessThanOrEqualTo(String value) {
            addCriterion("RENEWPROID <=", value, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidLike(String value) {
            addCriterion("RENEWPROID like", value, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidNotLike(String value) {
            addCriterion("RENEWPROID not like", value, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidIn(List<String> values) {
            addCriterion("RENEWPROID in", values, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidNotIn(List<String> values) {
            addCriterion("RENEWPROID not in", values, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidBetween(String value1, String value2) {
            addCriterion("RENEWPROID between", value1, value2, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewproidNotBetween(String value1, String value2) {
            addCriterion("RENEWPROID not between", value1, value2, "renewproid");
            return (Criteria) this;
        }

        public Criteria andRenewpronmIsNull() {
            addCriterion("RENEWPRONM is null");
            return (Criteria) this;
        }

        public Criteria andRenewpronmIsNotNull() {
            addCriterion("RENEWPRONM is not null");
            return (Criteria) this;
        }

        public Criteria andRenewpronmEqualTo(String value) {
            addCriterion("RENEWPRONM =", value, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmNotEqualTo(String value) {
            addCriterion("RENEWPRONM <>", value, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmGreaterThan(String value) {
            addCriterion("RENEWPRONM >", value, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmGreaterThanOrEqualTo(String value) {
            addCriterion("RENEWPRONM >=", value, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmLessThan(String value) {
            addCriterion("RENEWPRONM <", value, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmLessThanOrEqualTo(String value) {
            addCriterion("RENEWPRONM <=", value, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmLike(String value) {
            addCriterion("RENEWPRONM like", value, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmNotLike(String value) {
            addCriterion("RENEWPRONM not like", value, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmIn(List<String> values) {
            addCriterion("RENEWPRONM in", values, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmNotIn(List<String> values) {
            addCriterion("RENEWPRONM not in", values, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmBetween(String value1, String value2) {
            addCriterion("RENEWPRONM between", value1, value2, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andRenewpronmNotBetween(String value1, String value2) {
            addCriterion("RENEWPRONM not between", value1, value2, "renewpronm");
            return (Criteria) this;
        }

        public Criteria andDatechecknumIsNull() {
            addCriterion("DATECHECKNUM is null");
            return (Criteria) this;
        }

        public Criteria andDatechecknumIsNotNull() {
            addCriterion("DATECHECKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andDatechecknumEqualTo(Long value) {
            addCriterion("DATECHECKNUM =", value, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumNotEqualTo(Long value) {
            addCriterion("DATECHECKNUM <>", value, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumGreaterThan(Long value) {
            addCriterion("DATECHECKNUM >", value, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumGreaterThanOrEqualTo(Long value) {
            addCriterion("DATECHECKNUM >=", value, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumLessThan(Long value) {
            addCriterion("DATECHECKNUM <", value, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumLessThanOrEqualTo(Long value) {
            addCriterion("DATECHECKNUM <=", value, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumIn(List<Long> values) {
            addCriterion("DATECHECKNUM in", values, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumNotIn(List<Long> values) {
            addCriterion("DATECHECKNUM not in", values, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumBetween(Long value1, Long value2) {
            addCriterion("DATECHECKNUM between", value1, value2, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andDatechecknumNotBetween(Long value1, Long value2) {
            addCriterion("DATECHECKNUM not between", value1, value2, "datechecknum");
            return (Criteria) this;
        }

        public Criteria andExtractdateIsNull() {
            addCriterion("EXTRACTDATE is null");
            return (Criteria) this;
        }

        public Criteria andExtractdateIsNotNull() {
            addCriterion("EXTRACTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andExtractdateEqualTo(BigDecimal value) {
            addCriterion("EXTRACTDATE =", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateNotEqualTo(BigDecimal value) {
            addCriterion("EXTRACTDATE <>", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateGreaterThan(BigDecimal value) {
            addCriterion("EXTRACTDATE >", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRACTDATE >=", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateLessThan(BigDecimal value) {
            addCriterion("EXTRACTDATE <", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRACTDATE <=", value, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateIn(List<BigDecimal> values) {
            addCriterion("EXTRACTDATE in", values, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateNotIn(List<BigDecimal> values) {
            addCriterion("EXTRACTDATE not in", values, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRACTDATE between", value1, value2, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRACTDATE not between", value1, value2, "extractdate");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdIsNull() {
            addCriterion("EXTRACTPERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdIsNotNull() {
            addCriterion("EXTRACTPERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdEqualTo(String value) {
            addCriterion("EXTRACTPERSON_ID =", value, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdNotEqualTo(String value) {
            addCriterion("EXTRACTPERSON_ID <>", value, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdGreaterThan(String value) {
            addCriterion("EXTRACTPERSON_ID >", value, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXTRACTPERSON_ID >=", value, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdLessThan(String value) {
            addCriterion("EXTRACTPERSON_ID <", value, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdLessThanOrEqualTo(String value) {
            addCriterion("EXTRACTPERSON_ID <=", value, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdLike(String value) {
            addCriterion("EXTRACTPERSON_ID like", value, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdNotLike(String value) {
            addCriterion("EXTRACTPERSON_ID not like", value, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdIn(List<String> values) {
            addCriterion("EXTRACTPERSON_ID in", values, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdNotIn(List<String> values) {
            addCriterion("EXTRACTPERSON_ID not in", values, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdBetween(String value1, String value2) {
            addCriterion("EXTRACTPERSON_ID between", value1, value2, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andExtractpersonIdNotBetween(String value1, String value2) {
            addCriterion("EXTRACTPERSON_ID not between", value1, value2, "extractpersonId");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedIsNull() {
            addCriterion("AUDITINFOISSENDED is null");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedIsNotNull() {
            addCriterion("AUDITINFOISSENDED is not null");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedEqualTo(Short value) {
            addCriterion("AUDITINFOISSENDED =", value, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedNotEqualTo(Short value) {
            addCriterion("AUDITINFOISSENDED <>", value, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedGreaterThan(Short value) {
            addCriterion("AUDITINFOISSENDED >", value, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedGreaterThanOrEqualTo(Short value) {
            addCriterion("AUDITINFOISSENDED >=", value, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedLessThan(Short value) {
            addCriterion("AUDITINFOISSENDED <", value, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedLessThanOrEqualTo(Short value) {
            addCriterion("AUDITINFOISSENDED <=", value, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedIn(List<Short> values) {
            addCriterion("AUDITINFOISSENDED in", values, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedNotIn(List<Short> values) {
            addCriterion("AUDITINFOISSENDED not in", values, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedBetween(Short value1, Short value2) {
            addCriterion("AUDITINFOISSENDED between", value1, value2, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andAuditinfoissendedNotBetween(Short value1, Short value2) {
            addCriterion("AUDITINFOISSENDED not between", value1, value2, "auditinfoissended");
            return (Criteria) this;
        }

        public Criteria andFormalattIdIsNull() {
            addCriterion("FORMALATT_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormalattIdIsNotNull() {
            addCriterion("FORMALATT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormalattIdEqualTo(String value) {
            addCriterion("FORMALATT_ID =", value, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdNotEqualTo(String value) {
            addCriterion("FORMALATT_ID <>", value, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdGreaterThan(String value) {
            addCriterion("FORMALATT_ID >", value, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdGreaterThanOrEqualTo(String value) {
            addCriterion("FORMALATT_ID >=", value, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdLessThan(String value) {
            addCriterion("FORMALATT_ID <", value, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdLessThanOrEqualTo(String value) {
            addCriterion("FORMALATT_ID <=", value, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdLike(String value) {
            addCriterion("FORMALATT_ID like", value, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdNotLike(String value) {
            addCriterion("FORMALATT_ID not like", value, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdIn(List<String> values) {
            addCriterion("FORMALATT_ID in", values, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdNotIn(List<String> values) {
            addCriterion("FORMALATT_ID not in", values, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdBetween(String value1, String value2) {
            addCriterion("FORMALATT_ID between", value1, value2, "formalattId");
            return (Criteria) this;
        }

        public Criteria andFormalattIdNotBetween(String value1, String value2) {
            addCriterion("FORMALATT_ID not between", value1, value2, "formalattId");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeIsNull() {
            addCriterion("LOANORGACPTDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeIsNotNull() {
            addCriterion("LOANORGACPTDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeEqualTo(BigDecimal value) {
            addCriterion("LOANORGACPTDATETIME =", value, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeNotEqualTo(BigDecimal value) {
            addCriterion("LOANORGACPTDATETIME <>", value, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeGreaterThan(BigDecimal value) {
            addCriterion("LOANORGACPTDATETIME >", value, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANORGACPTDATETIME >=", value, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeLessThan(BigDecimal value) {
            addCriterion("LOANORGACPTDATETIME <", value, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANORGACPTDATETIME <=", value, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeIn(List<BigDecimal> values) {
            addCriterion("LOANORGACPTDATETIME in", values, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeNotIn(List<BigDecimal> values) {
            addCriterion("LOANORGACPTDATETIME not in", values, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANORGACPTDATETIME between", value1, value2, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptdatetimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANORGACPTDATETIME not between", value1, value2, "loanorgacptdatetime");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumIsNull() {
            addCriterion("LOANORGACPTNUM is null");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumIsNotNull() {
            addCriterion("LOANORGACPTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumEqualTo(String value) {
            addCriterion("LOANORGACPTNUM =", value, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumNotEqualTo(String value) {
            addCriterion("LOANORGACPTNUM <>", value, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumGreaterThan(String value) {
            addCriterion("LOANORGACPTNUM >", value, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumGreaterThanOrEqualTo(String value) {
            addCriterion("LOANORGACPTNUM >=", value, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumLessThan(String value) {
            addCriterion("LOANORGACPTNUM <", value, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumLessThanOrEqualTo(String value) {
            addCriterion("LOANORGACPTNUM <=", value, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumLike(String value) {
            addCriterion("LOANORGACPTNUM like", value, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumNotLike(String value) {
            addCriterion("LOANORGACPTNUM not like", value, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumIn(List<String> values) {
            addCriterion("LOANORGACPTNUM in", values, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumNotIn(List<String> values) {
            addCriterion("LOANORGACPTNUM not in", values, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumBetween(String value1, String value2) {
            addCriterion("LOANORGACPTNUM between", value1, value2, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andLoanorgacptnumNotBetween(String value1, String value2) {
            addCriterion("LOANORGACPTNUM not between", value1, value2, "loanorgacptnum");
            return (Criteria) this;
        }

        public Criteria andReqserialuidIsNull() {
            addCriterion("REQSERIALUID is null");
            return (Criteria) this;
        }

        public Criteria andReqserialuidIsNotNull() {
            addCriterion("REQSERIALUID is not null");
            return (Criteria) this;
        }

        public Criteria andReqserialuidEqualTo(String value) {
            addCriterion("REQSERIALUID =", value, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidNotEqualTo(String value) {
            addCriterion("REQSERIALUID <>", value, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidGreaterThan(String value) {
            addCriterion("REQSERIALUID >", value, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidGreaterThanOrEqualTo(String value) {
            addCriterion("REQSERIALUID >=", value, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidLessThan(String value) {
            addCriterion("REQSERIALUID <", value, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidLessThanOrEqualTo(String value) {
            addCriterion("REQSERIALUID <=", value, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidLike(String value) {
            addCriterion("REQSERIALUID like", value, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidNotLike(String value) {
            addCriterion("REQSERIALUID not like", value, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidIn(List<String> values) {
            addCriterion("REQSERIALUID in", values, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidNotIn(List<String> values) {
            addCriterion("REQSERIALUID not in", values, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidBetween(String value1, String value2) {
            addCriterion("REQSERIALUID between", value1, value2, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andReqserialuidNotBetween(String value1, String value2) {
            addCriterion("REQSERIALUID not between", value1, value2, "reqserialuid");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateIsNull() {
            addCriterion("LOANORGAPPRDATE is null");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateIsNotNull() {
            addCriterion("LOANORGAPPRDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateEqualTo(BigDecimal value) {
            addCriterion("LOANORGAPPRDATE =", value, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateNotEqualTo(BigDecimal value) {
            addCriterion("LOANORGAPPRDATE <>", value, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateGreaterThan(BigDecimal value) {
            addCriterion("LOANORGAPPRDATE >", value, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANORGAPPRDATE >=", value, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateLessThan(BigDecimal value) {
            addCriterion("LOANORGAPPRDATE <", value, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOANORGAPPRDATE <=", value, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateIn(List<BigDecimal> values) {
            addCriterion("LOANORGAPPRDATE in", values, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateNotIn(List<BigDecimal> values) {
            addCriterion("LOANORGAPPRDATE not in", values, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANORGAPPRDATE between", value1, value2, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOANORGAPPRDATE not between", value1, value2, "loanorgapprdate");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgIsNull() {
            addCriterion("LOANORGAPPRFLG is null");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgIsNotNull() {
            addCriterion("LOANORGAPPRFLG is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgEqualTo(String value) {
            addCriterion("LOANORGAPPRFLG =", value, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgNotEqualTo(String value) {
            addCriterion("LOANORGAPPRFLG <>", value, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgGreaterThan(String value) {
            addCriterion("LOANORGAPPRFLG >", value, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgGreaterThanOrEqualTo(String value) {
            addCriterion("LOANORGAPPRFLG >=", value, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgLessThan(String value) {
            addCriterion("LOANORGAPPRFLG <", value, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgLessThanOrEqualTo(String value) {
            addCriterion("LOANORGAPPRFLG <=", value, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgLike(String value) {
            addCriterion("LOANORGAPPRFLG like", value, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgNotLike(String value) {
            addCriterion("LOANORGAPPRFLG not like", value, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgIn(List<String> values) {
            addCriterion("LOANORGAPPRFLG in", values, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgNotIn(List<String> values) {
            addCriterion("LOANORGAPPRFLG not in", values, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgBetween(String value1, String value2) {
            addCriterion("LOANORGAPPRFLG between", value1, value2, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprflgNotBetween(String value1, String value2) {
            addCriterion("LOANORGAPPRFLG not between", value1, value2, "loanorgapprflg");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkIsNull() {
            addCriterion("LOANORGAPPRREMARK is null");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkIsNotNull() {
            addCriterion("LOANORGAPPRREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkEqualTo(String value) {
            addCriterion("LOANORGAPPRREMARK =", value, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkNotEqualTo(String value) {
            addCriterion("LOANORGAPPRREMARK <>", value, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkGreaterThan(String value) {
            addCriterion("LOANORGAPPRREMARK >", value, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkGreaterThanOrEqualTo(String value) {
            addCriterion("LOANORGAPPRREMARK >=", value, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkLessThan(String value) {
            addCriterion("LOANORGAPPRREMARK <", value, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkLessThanOrEqualTo(String value) {
            addCriterion("LOANORGAPPRREMARK <=", value, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkLike(String value) {
            addCriterion("LOANORGAPPRREMARK like", value, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkNotLike(String value) {
            addCriterion("LOANORGAPPRREMARK not like", value, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkIn(List<String> values) {
            addCriterion("LOANORGAPPRREMARK in", values, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkNotIn(List<String> values) {
            addCriterion("LOANORGAPPRREMARK not in", values, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkBetween(String value1, String value2) {
            addCriterion("LOANORGAPPRREMARK between", value1, value2, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgapprremarkNotBetween(String value1, String value2) {
            addCriterion("LOANORGAPPRREMARK not between", value1, value2, "loanorgapprremark");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoIsNull() {
            addCriterion("LOANORGCONTRACTNO is null");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoIsNotNull() {
            addCriterion("LOANORGCONTRACTNO is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoEqualTo(String value) {
            addCriterion("LOANORGCONTRACTNO =", value, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoNotEqualTo(String value) {
            addCriterion("LOANORGCONTRACTNO <>", value, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoGreaterThan(String value) {
            addCriterion("LOANORGCONTRACTNO >", value, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoGreaterThanOrEqualTo(String value) {
            addCriterion("LOANORGCONTRACTNO >=", value, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoLessThan(String value) {
            addCriterion("LOANORGCONTRACTNO <", value, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoLessThanOrEqualTo(String value) {
            addCriterion("LOANORGCONTRACTNO <=", value, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoLike(String value) {
            addCriterion("LOANORGCONTRACTNO like", value, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoNotLike(String value) {
            addCriterion("LOANORGCONTRACTNO not like", value, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoIn(List<String> values) {
            addCriterion("LOANORGCONTRACTNO in", values, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoNotIn(List<String> values) {
            addCriterion("LOANORGCONTRACTNO not in", values, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoBetween(String value1, String value2) {
            addCriterion("LOANORGCONTRACTNO between", value1, value2, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andLoanorgcontractnoNotBetween(String value1, String value2) {
            addCriterion("LOANORGCONTRACTNO not between", value1, value2, "loanorgcontractno");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassIsNull() {
            addCriterion("BANKCHECKFIVECLASS is null");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassIsNotNull() {
            addCriterion("BANKCHECKFIVECLASS is not null");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassEqualTo(String value) {
            addCriterion("BANKCHECKFIVECLASS =", value, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassNotEqualTo(String value) {
            addCriterion("BANKCHECKFIVECLASS <>", value, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassGreaterThan(String value) {
            addCriterion("BANKCHECKFIVECLASS >", value, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCHECKFIVECLASS >=", value, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassLessThan(String value) {
            addCriterion("BANKCHECKFIVECLASS <", value, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassLessThanOrEqualTo(String value) {
            addCriterion("BANKCHECKFIVECLASS <=", value, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassLike(String value) {
            addCriterion("BANKCHECKFIVECLASS like", value, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassNotLike(String value) {
            addCriterion("BANKCHECKFIVECLASS not like", value, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassIn(List<String> values) {
            addCriterion("BANKCHECKFIVECLASS in", values, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassNotIn(List<String> values) {
            addCriterion("BANKCHECKFIVECLASS not in", values, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassBetween(String value1, String value2) {
            addCriterion("BANKCHECKFIVECLASS between", value1, value2, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassNotBetween(String value1, String value2) {
            addCriterion("BANKCHECKFIVECLASS not between", value1, value2, "bankcheckfiveclass");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateIsNull() {
            addCriterion("BANKCHECKFIVECLASSDATE is null");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateIsNotNull() {
            addCriterion("BANKCHECKFIVECLASSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateEqualTo(BigDecimal value) {
            addCriterion("BANKCHECKFIVECLASSDATE =", value, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateNotEqualTo(BigDecimal value) {
            addCriterion("BANKCHECKFIVECLASSDATE <>", value, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateGreaterThan(BigDecimal value) {
            addCriterion("BANKCHECKFIVECLASSDATE >", value, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKCHECKFIVECLASSDATE >=", value, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateLessThan(BigDecimal value) {
            addCriterion("BANKCHECKFIVECLASSDATE <", value, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BANKCHECKFIVECLASSDATE <=", value, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateIn(List<BigDecimal> values) {
            addCriterion("BANKCHECKFIVECLASSDATE in", values, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateNotIn(List<BigDecimal> values) {
            addCriterion("BANKCHECKFIVECLASSDATE not in", values, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKCHECKFIVECLASSDATE between", value1, value2, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckfiveclassdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BANKCHECKFIVECLASSDATE not between", value1, value2, "bankcheckfiveclassdate");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonIsNull() {
            addCriterion("BANKCHECKRESON is null");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonIsNotNull() {
            addCriterion("BANKCHECKRESON is not null");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonEqualTo(String value) {
            addCriterion("BANKCHECKRESON =", value, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonNotEqualTo(String value) {
            addCriterion("BANKCHECKRESON <>", value, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonGreaterThan(String value) {
            addCriterion("BANKCHECKRESON >", value, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCHECKRESON >=", value, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonLessThan(String value) {
            addCriterion("BANKCHECKRESON <", value, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonLessThanOrEqualTo(String value) {
            addCriterion("BANKCHECKRESON <=", value, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonLike(String value) {
            addCriterion("BANKCHECKRESON like", value, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonNotLike(String value) {
            addCriterion("BANKCHECKRESON not like", value, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonIn(List<String> values) {
            addCriterion("BANKCHECKRESON in", values, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonNotIn(List<String> values) {
            addCriterion("BANKCHECKRESON not in", values, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonBetween(String value1, String value2) {
            addCriterion("BANKCHECKRESON between", value1, value2, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckresonNotBetween(String value1, String value2) {
            addCriterion("BANKCHECKRESON not between", value1, value2, "bankcheckreson");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusIsNull() {
            addCriterion("BANKCHECKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusIsNotNull() {
            addCriterion("BANKCHECKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusEqualTo(String value) {
            addCriterion("BANKCHECKSTATUS =", value, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusNotEqualTo(String value) {
            addCriterion("BANKCHECKSTATUS <>", value, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusGreaterThan(String value) {
            addCriterion("BANKCHECKSTATUS >", value, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCHECKSTATUS >=", value, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusLessThan(String value) {
            addCriterion("BANKCHECKSTATUS <", value, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusLessThanOrEqualTo(String value) {
            addCriterion("BANKCHECKSTATUS <=", value, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusLike(String value) {
            addCriterion("BANKCHECKSTATUS like", value, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusNotLike(String value) {
            addCriterion("BANKCHECKSTATUS not like", value, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusIn(List<String> values) {
            addCriterion("BANKCHECKSTATUS in", values, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusNotIn(List<String> values) {
            addCriterion("BANKCHECKSTATUS not in", values, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusBetween(String value1, String value2) {
            addCriterion("BANKCHECKSTATUS between", value1, value2, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andBankcheckstatusNotBetween(String value1, String value2) {
            addCriterion("BANKCHECKSTATUS not between", value1, value2, "bankcheckstatus");
            return (Criteria) this;
        }

        public Criteria andIsreadedIsNull() {
            addCriterion("ISREADED is null");
            return (Criteria) this;
        }

        public Criteria andIsreadedIsNotNull() {
            addCriterion("ISREADED is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadedEqualTo(Short value) {
            addCriterion("ISREADED =", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedNotEqualTo(Short value) {
            addCriterion("ISREADED <>", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedGreaterThan(Short value) {
            addCriterion("ISREADED >", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedGreaterThanOrEqualTo(Short value) {
            addCriterion("ISREADED >=", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedLessThan(Short value) {
            addCriterion("ISREADED <", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedLessThanOrEqualTo(Short value) {
            addCriterion("ISREADED <=", value, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedIn(List<Short> values) {
            addCriterion("ISREADED in", values, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedNotIn(List<Short> values) {
            addCriterion("ISREADED not in", values, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedBetween(Short value1, Short value2) {
            addCriterion("ISREADED between", value1, value2, "isreaded");
            return (Criteria) this;
        }

        public Criteria andIsreadedNotBetween(Short value1, Short value2) {
            addCriterion("ISREADED not between", value1, value2, "isreaded");
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

        public Criteria andFiveprocessIdIsNull() {
            addCriterion("FIVEPROCESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdIsNotNull() {
            addCriterion("FIVEPROCESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdEqualTo(String value) {
            addCriterion("FIVEPROCESS_ID =", value, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdNotEqualTo(String value) {
            addCriterion("FIVEPROCESS_ID <>", value, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdGreaterThan(String value) {
            addCriterion("FIVEPROCESS_ID >", value, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdGreaterThanOrEqualTo(String value) {
            addCriterion("FIVEPROCESS_ID >=", value, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdLessThan(String value) {
            addCriterion("FIVEPROCESS_ID <", value, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdLessThanOrEqualTo(String value) {
            addCriterion("FIVEPROCESS_ID <=", value, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdLike(String value) {
            addCriterion("FIVEPROCESS_ID like", value, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdNotLike(String value) {
            addCriterion("FIVEPROCESS_ID not like", value, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdIn(List<String> values) {
            addCriterion("FIVEPROCESS_ID in", values, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdNotIn(List<String> values) {
            addCriterion("FIVEPROCESS_ID not in", values, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdBetween(String value1, String value2) {
            addCriterion("FIVEPROCESS_ID between", value1, value2, "fiveprocessId");
            return (Criteria) this;
        }

        public Criteria andFiveprocessIdNotBetween(String value1, String value2) {
            addCriterion("FIVEPROCESS_ID not between", value1, value2, "fiveprocessId");
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

        public Criteria andIsbankrepayoverdueIsNull() {
            addCriterion("ISBANKREPAYOVERDUE is null");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueIsNotNull() {
            addCriterion("ISBANKREPAYOVERDUE is not null");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueEqualTo(Short value) {
            addCriterion("ISBANKREPAYOVERDUE =", value, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueNotEqualTo(Short value) {
            addCriterion("ISBANKREPAYOVERDUE <>", value, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueGreaterThan(Short value) {
            addCriterion("ISBANKREPAYOVERDUE >", value, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueGreaterThanOrEqualTo(Short value) {
            addCriterion("ISBANKREPAYOVERDUE >=", value, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueLessThan(Short value) {
            addCriterion("ISBANKREPAYOVERDUE <", value, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueLessThanOrEqualTo(Short value) {
            addCriterion("ISBANKREPAYOVERDUE <=", value, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueIn(List<Short> values) {
            addCriterion("ISBANKREPAYOVERDUE in", values, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueNotIn(List<Short> values) {
            addCriterion("ISBANKREPAYOVERDUE not in", values, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueBetween(Short value1, Short value2) {
            addCriterion("ISBANKREPAYOVERDUE between", value1, value2, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andIsbankrepayoverdueNotBetween(Short value1, Short value2) {
            addCriterion("ISBANKREPAYOVERDUE not between", value1, value2, "isbankrepayoverdue");
            return (Criteria) this;
        }

        public Criteria andSmsstatusIsNull() {
            addCriterion("SMSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSmsstatusIsNotNull() {
            addCriterion("SMSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSmsstatusEqualTo(String value) {
            addCriterion("SMSSTATUS =", value, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusNotEqualTo(String value) {
            addCriterion("SMSSTATUS <>", value, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusGreaterThan(String value) {
            addCriterion("SMSSTATUS >", value, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SMSSTATUS >=", value, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusLessThan(String value) {
            addCriterion("SMSSTATUS <", value, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusLessThanOrEqualTo(String value) {
            addCriterion("SMSSTATUS <=", value, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusLike(String value) {
            addCriterion("SMSSTATUS like", value, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusNotLike(String value) {
            addCriterion("SMSSTATUS not like", value, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusIn(List<String> values) {
            addCriterion("SMSSTATUS in", values, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusNotIn(List<String> values) {
            addCriterion("SMSSTATUS not in", values, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusBetween(String value1, String value2) {
            addCriterion("SMSSTATUS between", value1, value2, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andSmsstatusNotBetween(String value1, String value2) {
            addCriterion("SMSSTATUS not between", value1, value2, "smsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusIsNull() {
            addCriterion("DUESMSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusIsNotNull() {
            addCriterion("DUESMSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusEqualTo(String value) {
            addCriterion("DUESMSSTATUS =", value, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusNotEqualTo(String value) {
            addCriterion("DUESMSSTATUS <>", value, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusGreaterThan(String value) {
            addCriterion("DUESMSSTATUS >", value, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusGreaterThanOrEqualTo(String value) {
            addCriterion("DUESMSSTATUS >=", value, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusLessThan(String value) {
            addCriterion("DUESMSSTATUS <", value, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusLessThanOrEqualTo(String value) {
            addCriterion("DUESMSSTATUS <=", value, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusLike(String value) {
            addCriterion("DUESMSSTATUS like", value, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusNotLike(String value) {
            addCriterion("DUESMSSTATUS not like", value, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusIn(List<String> values) {
            addCriterion("DUESMSSTATUS in", values, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusNotIn(List<String> values) {
            addCriterion("DUESMSSTATUS not in", values, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusBetween(String value1, String value2) {
            addCriterion("DUESMSSTATUS between", value1, value2, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmsstatusNotBetween(String value1, String value2) {
            addCriterion("DUESMSSTATUS not between", value1, value2, "duesmsstatus");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeIsNull() {
            addCriterion("DUESMSTIME is null");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeIsNotNull() {
            addCriterion("DUESMSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeEqualTo(Date value) {
            addCriterion("DUESMSTIME =", value, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeNotEqualTo(Date value) {
            addCriterion("DUESMSTIME <>", value, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeGreaterThan(Date value) {
            addCriterion("DUESMSTIME >", value, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DUESMSTIME >=", value, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeLessThan(Date value) {
            addCriterion("DUESMSTIME <", value, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeLessThanOrEqualTo(Date value) {
            addCriterion("DUESMSTIME <=", value, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeIn(List<Date> values) {
            addCriterion("DUESMSTIME in", values, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeNotIn(List<Date> values) {
            addCriterion("DUESMSTIME not in", values, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeBetween(Date value1, Date value2) {
            addCriterion("DUESMSTIME between", value1, value2, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andDuesmstimeNotBetween(Date value1, Date value2) {
            addCriterion("DUESMSTIME not between", value1, value2, "duesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusIsNull() {
            addCriterion("OVERDUESMSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusIsNotNull() {
            addCriterion("OVERDUESMSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusEqualTo(String value) {
            addCriterion("OVERDUESMSSTATUS =", value, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusNotEqualTo(String value) {
            addCriterion("OVERDUESMSSTATUS <>", value, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusGreaterThan(String value) {
            addCriterion("OVERDUESMSSTATUS >", value, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusGreaterThanOrEqualTo(String value) {
            addCriterion("OVERDUESMSSTATUS >=", value, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusLessThan(String value) {
            addCriterion("OVERDUESMSSTATUS <", value, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusLessThanOrEqualTo(String value) {
            addCriterion("OVERDUESMSSTATUS <=", value, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusLike(String value) {
            addCriterion("OVERDUESMSSTATUS like", value, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusNotLike(String value) {
            addCriterion("OVERDUESMSSTATUS not like", value, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusIn(List<String> values) {
            addCriterion("OVERDUESMSSTATUS in", values, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusNotIn(List<String> values) {
            addCriterion("OVERDUESMSSTATUS not in", values, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusBetween(String value1, String value2) {
            addCriterion("OVERDUESMSSTATUS between", value1, value2, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmsstatusNotBetween(String value1, String value2) {
            addCriterion("OVERDUESMSSTATUS not between", value1, value2, "overduesmsstatus");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeIsNull() {
            addCriterion("OVERDUESMSTIME is null");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeIsNotNull() {
            addCriterion("OVERDUESMSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeEqualTo(Date value) {
            addCriterion("OVERDUESMSTIME =", value, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeNotEqualTo(Date value) {
            addCriterion("OVERDUESMSTIME <>", value, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeGreaterThan(Date value) {
            addCriterion("OVERDUESMSTIME >", value, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OVERDUESMSTIME >=", value, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeLessThan(Date value) {
            addCriterion("OVERDUESMSTIME <", value, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeLessThanOrEqualTo(Date value) {
            addCriterion("OVERDUESMSTIME <=", value, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeIn(List<Date> values) {
            addCriterion("OVERDUESMSTIME in", values, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeNotIn(List<Date> values) {
            addCriterion("OVERDUESMSTIME not in", values, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeBetween(Date value1, Date value2) {
            addCriterion("OVERDUESMSTIME between", value1, value2, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andOverduesmstimeNotBetween(Date value1, Date value2) {
            addCriterion("OVERDUESMSTIME not between", value1, value2, "overduesmstime");
            return (Criteria) this;
        }

        public Criteria andIssynchIsNull() {
            addCriterion("ISSYNCH is null");
            return (Criteria) this;
        }

        public Criteria andIssynchIsNotNull() {
            addCriterion("ISSYNCH is not null");
            return (Criteria) this;
        }

        public Criteria andIssynchEqualTo(String value) {
            addCriterion("ISSYNCH =", value, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchNotEqualTo(String value) {
            addCriterion("ISSYNCH <>", value, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchGreaterThan(String value) {
            addCriterion("ISSYNCH >", value, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchGreaterThanOrEqualTo(String value) {
            addCriterion("ISSYNCH >=", value, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchLessThan(String value) {
            addCriterion("ISSYNCH <", value, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchLessThanOrEqualTo(String value) {
            addCriterion("ISSYNCH <=", value, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchLike(String value) {
            addCriterion("ISSYNCH like", value, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchNotLike(String value) {
            addCriterion("ISSYNCH not like", value, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchIn(List<String> values) {
            addCriterion("ISSYNCH in", values, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchNotIn(List<String> values) {
            addCriterion("ISSYNCH not in", values, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchBetween(String value1, String value2) {
            addCriterion("ISSYNCH between", value1, value2, "issynch");
            return (Criteria) this;
        }

        public Criteria andIssynchNotBetween(String value1, String value2) {
            addCriterion("ISSYNCH not between", value1, value2, "issynch");
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