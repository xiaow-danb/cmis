package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepaymentplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepaymentplanExample() {
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

        public Criteria andCompamountIsNull() {
            addCriterion("COMPAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCompamountIsNotNull() {
            addCriterion("COMPAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCompamountEqualTo(BigDecimal value) {
            addCriterion("COMPAMOUNT =", value, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountNotEqualTo(BigDecimal value) {
            addCriterion("COMPAMOUNT <>", value, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountGreaterThan(BigDecimal value) {
            addCriterion("COMPAMOUNT >", value, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPAMOUNT >=", value, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountLessThan(BigDecimal value) {
            addCriterion("COMPAMOUNT <", value, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPAMOUNT <=", value, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountIn(List<BigDecimal> values) {
            addCriterion("COMPAMOUNT in", values, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountNotIn(List<BigDecimal> values) {
            addCriterion("COMPAMOUNT not in", values, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPAMOUNT between", value1, value2, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPAMOUNT not between", value1, value2, "compamount");
            return (Criteria) this;
        }

        public Criteria andCompdateIsNull() {
            addCriterion("COMPDATE is null");
            return (Criteria) this;
        }

        public Criteria andCompdateIsNotNull() {
            addCriterion("COMPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCompdateEqualTo(BigDecimal value) {
            addCriterion("COMPDATE =", value, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateNotEqualTo(BigDecimal value) {
            addCriterion("COMPDATE <>", value, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateGreaterThan(BigDecimal value) {
            addCriterion("COMPDATE >", value, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPDATE >=", value, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateLessThan(BigDecimal value) {
            addCriterion("COMPDATE <", value, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPDATE <=", value, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateIn(List<BigDecimal> values) {
            addCriterion("COMPDATE in", values, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateNotIn(List<BigDecimal> values) {
            addCriterion("COMPDATE not in", values, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPDATE between", value1, value2, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPDATE not between", value1, value2, "compdate");
            return (Criteria) this;
        }

        public Criteria andCompinterestIsNull() {
            addCriterion("COMPINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andCompinterestIsNotNull() {
            addCriterion("COMPINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andCompinterestEqualTo(BigDecimal value) {
            addCriterion("COMPINTEREST =", value, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestNotEqualTo(BigDecimal value) {
            addCriterion("COMPINTEREST <>", value, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestGreaterThan(BigDecimal value) {
            addCriterion("COMPINTEREST >", value, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPINTEREST >=", value, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestLessThan(BigDecimal value) {
            addCriterion("COMPINTEREST <", value, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPINTEREST <=", value, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestIn(List<BigDecimal> values) {
            addCriterion("COMPINTEREST in", values, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestNotIn(List<BigDecimal> values) {
            addCriterion("COMPINTEREST not in", values, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPINTEREST between", value1, value2, "compinterest");
            return (Criteria) this;
        }

        public Criteria andCompinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPINTEREST not between", value1, value2, "compinterest");
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

        public Criteria andOverdueamountEqualTo(BigDecimal value) {
            addCriterion("OVERDUEAMOUNT =", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotEqualTo(BigDecimal value) {
            addCriterion("OVERDUEAMOUNT <>", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountGreaterThan(BigDecimal value) {
            addCriterion("OVERDUEAMOUNT >", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERDUEAMOUNT >=", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountLessThan(BigDecimal value) {
            addCriterion("OVERDUEAMOUNT <", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OVERDUEAMOUNT <=", value, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountIn(List<BigDecimal> values) {
            addCriterion("OVERDUEAMOUNT in", values, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotIn(List<BigDecimal> values) {
            addCriterion("OVERDUEAMOUNT not in", values, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERDUEAMOUNT between", value1, value2, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverdueamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVERDUEAMOUNT not between", value1, value2, "overdueamount");
            return (Criteria) this;
        }

        public Criteria andOverduetsIsNull() {
            addCriterion("OVERDUETS is null");
            return (Criteria) this;
        }

        public Criteria andOverduetsIsNotNull() {
            addCriterion("OVERDUETS is not null");
            return (Criteria) this;
        }

        public Criteria andOverduetsEqualTo(Long value) {
            addCriterion("OVERDUETS =", value, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsNotEqualTo(Long value) {
            addCriterion("OVERDUETS <>", value, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsGreaterThan(Long value) {
            addCriterion("OVERDUETS >", value, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsGreaterThanOrEqualTo(Long value) {
            addCriterion("OVERDUETS >=", value, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsLessThan(Long value) {
            addCriterion("OVERDUETS <", value, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsLessThanOrEqualTo(Long value) {
            addCriterion("OVERDUETS <=", value, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsIn(List<Long> values) {
            addCriterion("OVERDUETS in", values, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsNotIn(List<Long> values) {
            addCriterion("OVERDUETS not in", values, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsBetween(Long value1, Long value2) {
            addCriterion("OVERDUETS between", value1, value2, "overduets");
            return (Criteria) this;
        }

        public Criteria andOverduetsNotBetween(Long value1, Long value2) {
            addCriterion("OVERDUETS not between", value1, value2, "overduets");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountIsNull() {
            addCriterion("RECOVERYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountIsNotNull() {
            addCriterion("RECOVERYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountEqualTo(BigDecimal value) {
            addCriterion("RECOVERYAMOUNT =", value, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountNotEqualTo(BigDecimal value) {
            addCriterion("RECOVERYAMOUNT <>", value, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountGreaterThan(BigDecimal value) {
            addCriterion("RECOVERYAMOUNT >", value, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECOVERYAMOUNT >=", value, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountLessThan(BigDecimal value) {
            addCriterion("RECOVERYAMOUNT <", value, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECOVERYAMOUNT <=", value, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountIn(List<BigDecimal> values) {
            addCriterion("RECOVERYAMOUNT in", values, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountNotIn(List<BigDecimal> values) {
            addCriterion("RECOVERYAMOUNT not in", values, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECOVERYAMOUNT between", value1, value2, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoveryamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECOVERYAMOUNT not between", value1, value2, "recoveryamount");
            return (Criteria) this;
        }

        public Criteria andRecoverydateIsNull() {
            addCriterion("RECOVERYDATE is null");
            return (Criteria) this;
        }

        public Criteria andRecoverydateIsNotNull() {
            addCriterion("RECOVERYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverydateEqualTo(BigDecimal value) {
            addCriterion("RECOVERYDATE =", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateNotEqualTo(BigDecimal value) {
            addCriterion("RECOVERYDATE <>", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateGreaterThan(BigDecimal value) {
            addCriterion("RECOVERYDATE >", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECOVERYDATE >=", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateLessThan(BigDecimal value) {
            addCriterion("RECOVERYDATE <", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECOVERYDATE <=", value, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateIn(List<BigDecimal> values) {
            addCriterion("RECOVERYDATE in", values, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateNotIn(List<BigDecimal> values) {
            addCriterion("RECOVERYDATE not in", values, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECOVERYDATE between", value1, value2, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andRecoverydateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECOVERYDATE not between", value1, value2, "recoverydate");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountIsNull() {
            addCriterion("RELEASEGUARAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountIsNotNull() {
            addCriterion("RELEASEGUARAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountEqualTo(BigDecimal value) {
            addCriterion("RELEASEGUARAMOUNT =", value, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountNotEqualTo(BigDecimal value) {
            addCriterion("RELEASEGUARAMOUNT <>", value, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountGreaterThan(BigDecimal value) {
            addCriterion("RELEASEGUARAMOUNT >", value, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEGUARAMOUNT >=", value, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountLessThan(BigDecimal value) {
            addCriterion("RELEASEGUARAMOUNT <", value, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEGUARAMOUNT <=", value, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountIn(List<BigDecimal> values) {
            addCriterion("RELEASEGUARAMOUNT in", values, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountNotIn(List<BigDecimal> values) {
            addCriterion("RELEASEGUARAMOUNT not in", values, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEGUARAMOUNT between", value1, value2, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguaramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEGUARAMOUNT not between", value1, value2, "releaseguaramount");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateIsNull() {
            addCriterion("RELEASEGUARDATE is null");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateIsNotNull() {
            addCriterion("RELEASEGUARDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateEqualTo(BigDecimal value) {
            addCriterion("RELEASEGUARDATE =", value, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateNotEqualTo(BigDecimal value) {
            addCriterion("RELEASEGUARDATE <>", value, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateGreaterThan(BigDecimal value) {
            addCriterion("RELEASEGUARDATE >", value, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEGUARDATE >=", value, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateLessThan(BigDecimal value) {
            addCriterion("RELEASEGUARDATE <", value, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RELEASEGUARDATE <=", value, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateIn(List<BigDecimal> values) {
            addCriterion("RELEASEGUARDATE in", values, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateNotIn(List<BigDecimal> values) {
            addCriterion("RELEASEGUARDATE not in", values, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEGUARDATE between", value1, value2, "releaseguardate");
            return (Criteria) this;
        }

        public Criteria andReleaseguardateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RELEASEGUARDATE not between", value1, value2, "releaseguardate");
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

        public Criteria andRepaymentmoneyIsNull() {
            addCriterion("REPAYMENTMONEY is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyIsNotNull() {
            addCriterion("REPAYMENTMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTMONEY =", value, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyNotEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTMONEY <>", value, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyGreaterThan(BigDecimal value) {
            addCriterion("REPAYMENTMONEY >", value, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTMONEY >=", value, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyLessThan(BigDecimal value) {
            addCriterion("REPAYMENTMONEY <", value, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REPAYMENTMONEY <=", value, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyIn(List<BigDecimal> values) {
            addCriterion("REPAYMENTMONEY in", values, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyNotIn(List<BigDecimal> values) {
            addCriterion("REPAYMENTMONEY not in", values, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENTMONEY between", value1, value2, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andRepaymentmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REPAYMENTMONEY not between", value1, value2, "repaymentmoney");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalIsNull() {
            addCriterion("SHOULDREPAYMENTCAPITAL is null");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalIsNotNull() {
            addCriterion("SHOULDREPAYMENTCAPITAL is not null");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalEqualTo(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTCAPITAL =", value, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalNotEqualTo(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTCAPITAL <>", value, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalGreaterThan(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTCAPITAL >", value, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTCAPITAL >=", value, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalLessThan(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTCAPITAL <", value, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTCAPITAL <=", value, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalIn(List<BigDecimal> values) {
            addCriterion("SHOULDREPAYMENTCAPITAL in", values, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalNotIn(List<BigDecimal> values) {
            addCriterion("SHOULDREPAYMENTCAPITAL not in", values, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOULDREPAYMENTCAPITAL between", value1, value2, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentcapitalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOULDREPAYMENTCAPITAL not between", value1, value2, "shouldrepaymentcapital");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestIsNull() {
            addCriterion("SHOULDREPAYMENTINTEREST is null");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestIsNotNull() {
            addCriterion("SHOULDREPAYMENTINTEREST is not null");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestEqualTo(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTINTEREST =", value, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestNotEqualTo(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTINTEREST <>", value, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestGreaterThan(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTINTEREST >", value, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTINTEREST >=", value, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestLessThan(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTINTEREST <", value, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHOULDREPAYMENTINTEREST <=", value, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestIn(List<BigDecimal> values) {
            addCriterion("SHOULDREPAYMENTINTEREST in", values, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestNotIn(List<BigDecimal> values) {
            addCriterion("SHOULDREPAYMENTINTEREST not in", values, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOULDREPAYMENTINTEREST between", value1, value2, "shouldrepaymentinterest");
            return (Criteria) this;
        }

        public Criteria andShouldrepaymentinterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHOULDREPAYMENTINTEREST not between", value1, value2, "shouldrepaymentinterest");
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

        public Criteria andProjectloanIdIsNull() {
            addCriterion("PROJECTLOAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdIsNotNull() {
            addCriterion("PROJECTLOAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdEqualTo(String value) {
            addCriterion("PROJECTLOAN_ID =", value, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdNotEqualTo(String value) {
            addCriterion("PROJECTLOAN_ID <>", value, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdGreaterThan(String value) {
            addCriterion("PROJECTLOAN_ID >", value, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTLOAN_ID >=", value, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdLessThan(String value) {
            addCriterion("PROJECTLOAN_ID <", value, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdLessThanOrEqualTo(String value) {
            addCriterion("PROJECTLOAN_ID <=", value, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdLike(String value) {
            addCriterion("PROJECTLOAN_ID like", value, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdNotLike(String value) {
            addCriterion("PROJECTLOAN_ID not like", value, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdIn(List<String> values) {
            addCriterion("PROJECTLOAN_ID in", values, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdNotIn(List<String> values) {
            addCriterion("PROJECTLOAN_ID not in", values, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdBetween(String value1, String value2) {
            addCriterion("PROJECTLOAN_ID between", value1, value2, "projectloanId");
            return (Criteria) this;
        }

        public Criteria andProjectloanIdNotBetween(String value1, String value2) {
            addCriterion("PROJECTLOAN_ID not between", value1, value2, "projectloanId");
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

        public Criteria andIsautosettleIsNull() {
            addCriterion("ISAUTOSETTLE is null");
            return (Criteria) this;
        }

        public Criteria andIsautosettleIsNotNull() {
            addCriterion("ISAUTOSETTLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsautosettleEqualTo(Short value) {
            addCriterion("ISAUTOSETTLE =", value, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleNotEqualTo(Short value) {
            addCriterion("ISAUTOSETTLE <>", value, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleGreaterThan(Short value) {
            addCriterion("ISAUTOSETTLE >", value, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleGreaterThanOrEqualTo(Short value) {
            addCriterion("ISAUTOSETTLE >=", value, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleLessThan(Short value) {
            addCriterion("ISAUTOSETTLE <", value, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleLessThanOrEqualTo(Short value) {
            addCriterion("ISAUTOSETTLE <=", value, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleIn(List<Short> values) {
            addCriterion("ISAUTOSETTLE in", values, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleNotIn(List<Short> values) {
            addCriterion("ISAUTOSETTLE not in", values, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleBetween(Short value1, Short value2) {
            addCriterion("ISAUTOSETTLE between", value1, value2, "isautosettle");
            return (Criteria) this;
        }

        public Criteria andIsautosettleNotBetween(Short value1, Short value2) {
            addCriterion("ISAUTOSETTLE not between", value1, value2, "isautosettle");
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