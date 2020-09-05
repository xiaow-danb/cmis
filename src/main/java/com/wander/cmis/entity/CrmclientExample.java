package com.wander.cmis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmclientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmclientExample() {
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

        public Criteria andBusinessdeptcdIsNull() {
            addCriterion("BUSINESSDEPTCD is null");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdIsNotNull() {
            addCriterion("BUSINESSDEPTCD is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdEqualTo(String value) {
            addCriterion("BUSINESSDEPTCD =", value, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdNotEqualTo(String value) {
            addCriterion("BUSINESSDEPTCD <>", value, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdGreaterThan(String value) {
            addCriterion("BUSINESSDEPTCD >", value, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSDEPTCD >=", value, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdLessThan(String value) {
            addCriterion("BUSINESSDEPTCD <", value, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSDEPTCD <=", value, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdLike(String value) {
            addCriterion("BUSINESSDEPTCD like", value, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdNotLike(String value) {
            addCriterion("BUSINESSDEPTCD not like", value, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdIn(List<String> values) {
            addCriterion("BUSINESSDEPTCD in", values, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdNotIn(List<String> values) {
            addCriterion("BUSINESSDEPTCD not in", values, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdBetween(String value1, String value2) {
            addCriterion("BUSINESSDEPTCD between", value1, value2, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptcdNotBetween(String value1, String value2) {
            addCriterion("BUSINESSDEPTCD not between", value1, value2, "businessdeptcd");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmIsNull() {
            addCriterion("BUSINESSDEPTNM is null");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmIsNotNull() {
            addCriterion("BUSINESSDEPTNM is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmEqualTo(String value) {
            addCriterion("BUSINESSDEPTNM =", value, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmNotEqualTo(String value) {
            addCriterion("BUSINESSDEPTNM <>", value, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmGreaterThan(String value) {
            addCriterion("BUSINESSDEPTNM >", value, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSDEPTNM >=", value, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmLessThan(String value) {
            addCriterion("BUSINESSDEPTNM <", value, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSDEPTNM <=", value, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmLike(String value) {
            addCriterion("BUSINESSDEPTNM like", value, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmNotLike(String value) {
            addCriterion("BUSINESSDEPTNM not like", value, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmIn(List<String> values) {
            addCriterion("BUSINESSDEPTNM in", values, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmNotIn(List<String> values) {
            addCriterion("BUSINESSDEPTNM not in", values, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmBetween(String value1, String value2) {
            addCriterion("BUSINESSDEPTNM between", value1, value2, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andBusinessdeptnmNotBetween(String value1, String value2) {
            addCriterion("BUSINESSDEPTNM not between", value1, value2, "businessdeptnm");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andClientcodeIsNull() {
            addCriterion("CLIENTCODE is null");
            return (Criteria) this;
        }

        public Criteria andClientcodeIsNotNull() {
            addCriterion("CLIENTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andClientcodeEqualTo(String value) {
            addCriterion("CLIENTCODE =", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotEqualTo(String value) {
            addCriterion("CLIENTCODE <>", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeGreaterThan(String value) {
            addCriterion("CLIENTCODE >", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTCODE >=", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeLessThan(String value) {
            addCriterion("CLIENTCODE <", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeLessThanOrEqualTo(String value) {
            addCriterion("CLIENTCODE <=", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeLike(String value) {
            addCriterion("CLIENTCODE like", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotLike(String value) {
            addCriterion("CLIENTCODE not like", value, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeIn(List<String> values) {
            addCriterion("CLIENTCODE in", values, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotIn(List<String> values) {
            addCriterion("CLIENTCODE not in", values, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeBetween(String value1, String value2) {
            addCriterion("CLIENTCODE between", value1, value2, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientcodeNotBetween(String value1, String value2) {
            addCriterion("CLIENTCODE not between", value1, value2, "clientcode");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdIsNull() {
            addCriterion("CLIENTMANAGERCD is null");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdIsNotNull() {
            addCriterion("CLIENTMANAGERCD is not null");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdEqualTo(String value) {
            addCriterion("CLIENTMANAGERCD =", value, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdNotEqualTo(String value) {
            addCriterion("CLIENTMANAGERCD <>", value, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdGreaterThan(String value) {
            addCriterion("CLIENTMANAGERCD >", value, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTMANAGERCD >=", value, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdLessThan(String value) {
            addCriterion("CLIENTMANAGERCD <", value, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdLessThanOrEqualTo(String value) {
            addCriterion("CLIENTMANAGERCD <=", value, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdLike(String value) {
            addCriterion("CLIENTMANAGERCD like", value, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdNotLike(String value) {
            addCriterion("CLIENTMANAGERCD not like", value, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdIn(List<String> values) {
            addCriterion("CLIENTMANAGERCD in", values, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdNotIn(List<String> values) {
            addCriterion("CLIENTMANAGERCD not in", values, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdBetween(String value1, String value2) {
            addCriterion("CLIENTMANAGERCD between", value1, value2, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagercdNotBetween(String value1, String value2) {
            addCriterion("CLIENTMANAGERCD not between", value1, value2, "clientmanagercd");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmIsNull() {
            addCriterion("CLIENTMANAGERNM is null");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmIsNotNull() {
            addCriterion("CLIENTMANAGERNM is not null");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmEqualTo(String value) {
            addCriterion("CLIENTMANAGERNM =", value, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmNotEqualTo(String value) {
            addCriterion("CLIENTMANAGERNM <>", value, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmGreaterThan(String value) {
            addCriterion("CLIENTMANAGERNM >", value, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTMANAGERNM >=", value, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmLessThan(String value) {
            addCriterion("CLIENTMANAGERNM <", value, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmLessThanOrEqualTo(String value) {
            addCriterion("CLIENTMANAGERNM <=", value, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmLike(String value) {
            addCriterion("CLIENTMANAGERNM like", value, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmNotLike(String value) {
            addCriterion("CLIENTMANAGERNM not like", value, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmIn(List<String> values) {
            addCriterion("CLIENTMANAGERNM in", values, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmNotIn(List<String> values) {
            addCriterion("CLIENTMANAGERNM not in", values, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmBetween(String value1, String value2) {
            addCriterion("CLIENTMANAGERNM between", value1, value2, "clientmanagernm");
            return (Criteria) this;
        }

        public Criteria andClientmanagernmNotBetween(String value1, String value2) {
            addCriterion("CLIENTMANAGERNM not between", value1, value2, "clientmanagernm");
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

        public Criteria andClientsourceIsNull() {
            addCriterion("CLIENTSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andClientsourceIsNotNull() {
            addCriterion("CLIENTSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andClientsourceEqualTo(String value) {
            addCriterion("CLIENTSOURCE =", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceNotEqualTo(String value) {
            addCriterion("CLIENTSOURCE <>", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceGreaterThan(String value) {
            addCriterion("CLIENTSOURCE >", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTSOURCE >=", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceLessThan(String value) {
            addCriterion("CLIENTSOURCE <", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceLessThanOrEqualTo(String value) {
            addCriterion("CLIENTSOURCE <=", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceLike(String value) {
            addCriterion("CLIENTSOURCE like", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceNotLike(String value) {
            addCriterion("CLIENTSOURCE not like", value, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceIn(List<String> values) {
            addCriterion("CLIENTSOURCE in", values, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceNotIn(List<String> values) {
            addCriterion("CLIENTSOURCE not in", values, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceBetween(String value1, String value2) {
            addCriterion("CLIENTSOURCE between", value1, value2, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourceNotBetween(String value1, String value2) {
            addCriterion("CLIENTSOURCE not between", value1, value2, "clientsource");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmIsNull() {
            addCriterion("CLIENTSOURCENM is null");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmIsNotNull() {
            addCriterion("CLIENTSOURCENM is not null");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmEqualTo(String value) {
            addCriterion("CLIENTSOURCENM =", value, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmNotEqualTo(String value) {
            addCriterion("CLIENTSOURCENM <>", value, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmGreaterThan(String value) {
            addCriterion("CLIENTSOURCENM >", value, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTSOURCENM >=", value, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmLessThan(String value) {
            addCriterion("CLIENTSOURCENM <", value, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmLessThanOrEqualTo(String value) {
            addCriterion("CLIENTSOURCENM <=", value, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmLike(String value) {
            addCriterion("CLIENTSOURCENM like", value, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmNotLike(String value) {
            addCriterion("CLIENTSOURCENM not like", value, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmIn(List<String> values) {
            addCriterion("CLIENTSOURCENM in", values, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmNotIn(List<String> values) {
            addCriterion("CLIENTSOURCENM not in", values, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmBetween(String value1, String value2) {
            addCriterion("CLIENTSOURCENM between", value1, value2, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andClientsourcenmNotBetween(String value1, String value2) {
            addCriterion("CLIENTSOURCENM not between", value1, value2, "clientsourcenm");
            return (Criteria) this;
        }

        public Criteria andCompanycdIsNull() {
            addCriterion("COMPANYCD is null");
            return (Criteria) this;
        }

        public Criteria andCompanycdIsNotNull() {
            addCriterion("COMPANYCD is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycdEqualTo(String value) {
            addCriterion("COMPANYCD =", value, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdNotEqualTo(String value) {
            addCriterion("COMPANYCD <>", value, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdGreaterThan(String value) {
            addCriterion("COMPANYCD >", value, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYCD >=", value, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdLessThan(String value) {
            addCriterion("COMPANYCD <", value, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdLessThanOrEqualTo(String value) {
            addCriterion("COMPANYCD <=", value, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdLike(String value) {
            addCriterion("COMPANYCD like", value, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdNotLike(String value) {
            addCriterion("COMPANYCD not like", value, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdIn(List<String> values) {
            addCriterion("COMPANYCD in", values, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdNotIn(List<String> values) {
            addCriterion("COMPANYCD not in", values, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdBetween(String value1, String value2) {
            addCriterion("COMPANYCD between", value1, value2, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanycdNotBetween(String value1, String value2) {
            addCriterion("COMPANYCD not between", value1, value2, "companycd");
            return (Criteria) this;
        }

        public Criteria andCompanynmIsNull() {
            addCriterion("COMPANYNM is null");
            return (Criteria) this;
        }

        public Criteria andCompanynmIsNotNull() {
            addCriterion("COMPANYNM is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynmEqualTo(String value) {
            addCriterion("COMPANYNM =", value, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmNotEqualTo(String value) {
            addCriterion("COMPANYNM <>", value, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmGreaterThan(String value) {
            addCriterion("COMPANYNM >", value, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYNM >=", value, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmLessThan(String value) {
            addCriterion("COMPANYNM <", value, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmLessThanOrEqualTo(String value) {
            addCriterion("COMPANYNM <=", value, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmLike(String value) {
            addCriterion("COMPANYNM like", value, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmNotLike(String value) {
            addCriterion("COMPANYNM not like", value, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmIn(List<String> values) {
            addCriterion("COMPANYNM in", values, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmNotIn(List<String> values) {
            addCriterion("COMPANYNM not in", values, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmBetween(String value1, String value2) {
            addCriterion("COMPANYNM between", value1, value2, "companynm");
            return (Criteria) this;
        }

        public Criteria andCompanynmNotBetween(String value1, String value2) {
            addCriterion("COMPANYNM not between", value1, value2, "companynm");
            return (Criteria) this;
        }

        public Criteria andCreatorcdIsNull() {
            addCriterion("CREATORCD is null");
            return (Criteria) this;
        }

        public Criteria andCreatorcdIsNotNull() {
            addCriterion("CREATORCD is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorcdEqualTo(String value) {
            addCriterion("CREATORCD =", value, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdNotEqualTo(String value) {
            addCriterion("CREATORCD <>", value, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdGreaterThan(String value) {
            addCriterion("CREATORCD >", value, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORCD >=", value, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdLessThan(String value) {
            addCriterion("CREATORCD <", value, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdLessThanOrEqualTo(String value) {
            addCriterion("CREATORCD <=", value, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdLike(String value) {
            addCriterion("CREATORCD like", value, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdNotLike(String value) {
            addCriterion("CREATORCD not like", value, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdIn(List<String> values) {
            addCriterion("CREATORCD in", values, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdNotIn(List<String> values) {
            addCriterion("CREATORCD not in", values, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdBetween(String value1, String value2) {
            addCriterion("CREATORCD between", value1, value2, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatorcdNotBetween(String value1, String value2) {
            addCriterion("CREATORCD not between", value1, value2, "creatorcd");
            return (Criteria) this;
        }

        public Criteria andCreatornmIsNull() {
            addCriterion("CREATORNM is null");
            return (Criteria) this;
        }

        public Criteria andCreatornmIsNotNull() {
            addCriterion("CREATORNM is not null");
            return (Criteria) this;
        }

        public Criteria andCreatornmEqualTo(String value) {
            addCriterion("CREATORNM =", value, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmNotEqualTo(String value) {
            addCriterion("CREATORNM <>", value, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmGreaterThan(String value) {
            addCriterion("CREATORNM >", value, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmGreaterThanOrEqualTo(String value) {
            addCriterion("CREATORNM >=", value, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmLessThan(String value) {
            addCriterion("CREATORNM <", value, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmLessThanOrEqualTo(String value) {
            addCriterion("CREATORNM <=", value, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmLike(String value) {
            addCriterion("CREATORNM like", value, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmNotLike(String value) {
            addCriterion("CREATORNM not like", value, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmIn(List<String> values) {
            addCriterion("CREATORNM in", values, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmNotIn(List<String> values) {
            addCriterion("CREATORNM not in", values, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmBetween(String value1, String value2) {
            addCriterion("CREATORNM between", value1, value2, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCreatornmNotBetween(String value1, String value2) {
            addCriterion("CREATORNM not between", value1, value2, "creatornm");
            return (Criteria) this;
        }

        public Criteria andCredentialnoIsNull() {
            addCriterion("CREDENTIALNO is null");
            return (Criteria) this;
        }

        public Criteria andCredentialnoIsNotNull() {
            addCriterion("CREDENTIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialnoEqualTo(String value) {
            addCriterion("CREDENTIALNO =", value, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoNotEqualTo(String value) {
            addCriterion("CREDENTIALNO <>", value, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoGreaterThan(String value) {
            addCriterion("CREDENTIALNO >", value, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoGreaterThanOrEqualTo(String value) {
            addCriterion("CREDENTIALNO >=", value, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoLessThan(String value) {
            addCriterion("CREDENTIALNO <", value, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoLessThanOrEqualTo(String value) {
            addCriterion("CREDENTIALNO <=", value, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoLike(String value) {
            addCriterion("CREDENTIALNO like", value, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoNotLike(String value) {
            addCriterion("CREDENTIALNO not like", value, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoIn(List<String> values) {
            addCriterion("CREDENTIALNO in", values, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoNotIn(List<String> values) {
            addCriterion("CREDENTIALNO not in", values, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoBetween(String value1, String value2) {
            addCriterion("CREDENTIALNO between", value1, value2, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialnoNotBetween(String value1, String value2) {
            addCriterion("CREDENTIALNO not between", value1, value2, "credentialno");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeIsNull() {
            addCriterion("CREDENTIALTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeIsNotNull() {
            addCriterion("CREDENTIALTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeEqualTo(String value) {
            addCriterion("CREDENTIALTYPE =", value, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeNotEqualTo(String value) {
            addCriterion("CREDENTIALTYPE <>", value, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeGreaterThan(String value) {
            addCriterion("CREDENTIALTYPE >", value, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDENTIALTYPE >=", value, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeLessThan(String value) {
            addCriterion("CREDENTIALTYPE <", value, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeLessThanOrEqualTo(String value) {
            addCriterion("CREDENTIALTYPE <=", value, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeLike(String value) {
            addCriterion("CREDENTIALTYPE like", value, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeNotLike(String value) {
            addCriterion("CREDENTIALTYPE not like", value, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeIn(List<String> values) {
            addCriterion("CREDENTIALTYPE in", values, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeNotIn(List<String> values) {
            addCriterion("CREDENTIALTYPE not in", values, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeBetween(String value1, String value2) {
            addCriterion("CREDENTIALTYPE between", value1, value2, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCredentialtypeNotBetween(String value1, String value2) {
            addCriterion("CREDENTIALTYPE not between", value1, value2, "credentialtype");
            return (Criteria) this;
        }

        public Criteria andCreditconditionIsNull() {
            addCriterion("CREDITCONDITION is null");
            return (Criteria) this;
        }

        public Criteria andCreditconditionIsNotNull() {
            addCriterion("CREDITCONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andCreditconditionEqualTo(String value) {
            addCriterion("CREDITCONDITION =", value, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionNotEqualTo(String value) {
            addCriterion("CREDITCONDITION <>", value, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionGreaterThan(String value) {
            addCriterion("CREDITCONDITION >", value, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITCONDITION >=", value, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionLessThan(String value) {
            addCriterion("CREDITCONDITION <", value, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionLessThanOrEqualTo(String value) {
            addCriterion("CREDITCONDITION <=", value, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionLike(String value) {
            addCriterion("CREDITCONDITION like", value, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionNotLike(String value) {
            addCriterion("CREDITCONDITION not like", value, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionIn(List<String> values) {
            addCriterion("CREDITCONDITION in", values, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionNotIn(List<String> values) {
            addCriterion("CREDITCONDITION not in", values, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionBetween(String value1, String value2) {
            addCriterion("CREDITCONDITION between", value1, value2, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andCreditconditionNotBetween(String value1, String value2) {
            addCriterion("CREDITCONDITION not between", value1, value2, "creditcondition");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("DISTRICT =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("DISTRICT <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("DISTRICT >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("DISTRICT <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("DISTRICT like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("DISTRICT not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("DISTRICT in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("DISTRICT not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("DISTRICT between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("DISTRICT not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNull() {
            addCriterion("ENGLISHNAME is null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIsNotNull() {
            addCriterion("ENGLISHNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEnglishnameEqualTo(String value) {
            addCriterion("ENGLISHNAME =", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotEqualTo(String value) {
            addCriterion("ENGLISHNAME <>", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThan(String value) {
            addCriterion("ENGLISHNAME >", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISHNAME >=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThan(String value) {
            addCriterion("ENGLISHNAME <", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("ENGLISHNAME <=", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameLike(String value) {
            addCriterion("ENGLISHNAME like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotLike(String value) {
            addCriterion("ENGLISHNAME not like", value, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameIn(List<String> values) {
            addCriterion("ENGLISHNAME in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotIn(List<String> values) {
            addCriterion("ENGLISHNAME not in", values, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameBetween(String value1, String value2) {
            addCriterion("ENGLISHNAME between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglishnameNotBetween(String value1, String value2) {
            addCriterion("ENGLISHNAME not between", value1, value2, "englishname");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmIsNull() {
            addCriterion("ENGLISTHSHORTNM is null");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmIsNotNull() {
            addCriterion("ENGLISTHSHORTNM is not null");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmEqualTo(String value) {
            addCriterion("ENGLISTHSHORTNM =", value, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmNotEqualTo(String value) {
            addCriterion("ENGLISTHSHORTNM <>", value, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmGreaterThan(String value) {
            addCriterion("ENGLISTHSHORTNM >", value, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmGreaterThanOrEqualTo(String value) {
            addCriterion("ENGLISTHSHORTNM >=", value, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmLessThan(String value) {
            addCriterion("ENGLISTHSHORTNM <", value, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmLessThanOrEqualTo(String value) {
            addCriterion("ENGLISTHSHORTNM <=", value, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmLike(String value) {
            addCriterion("ENGLISTHSHORTNM like", value, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmNotLike(String value) {
            addCriterion("ENGLISTHSHORTNM not like", value, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmIn(List<String> values) {
            addCriterion("ENGLISTHSHORTNM in", values, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmNotIn(List<String> values) {
            addCriterion("ENGLISTHSHORTNM not in", values, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmBetween(String value1, String value2) {
            addCriterion("ENGLISTHSHORTNM between", value1, value2, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andEnglisthshortnmNotBetween(String value1, String value2) {
            addCriterion("ENGLISTHSHORTNM not between", value1, value2, "englisthshortnm");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceIsNull() {
            addCriterion("FIRSTREPAYSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceIsNotNull() {
            addCriterion("FIRSTREPAYSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceEqualTo(String value) {
            addCriterion("FIRSTREPAYSOURCE =", value, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceNotEqualTo(String value) {
            addCriterion("FIRSTREPAYSOURCE <>", value, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceGreaterThan(String value) {
            addCriterion("FIRSTREPAYSOURCE >", value, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTREPAYSOURCE >=", value, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceLessThan(String value) {
            addCriterion("FIRSTREPAYSOURCE <", value, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceLessThanOrEqualTo(String value) {
            addCriterion("FIRSTREPAYSOURCE <=", value, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceLike(String value) {
            addCriterion("FIRSTREPAYSOURCE like", value, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceNotLike(String value) {
            addCriterion("FIRSTREPAYSOURCE not like", value, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceIn(List<String> values) {
            addCriterion("FIRSTREPAYSOURCE in", values, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceNotIn(List<String> values) {
            addCriterion("FIRSTREPAYSOURCE not in", values, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceBetween(String value1, String value2) {
            addCriterion("FIRSTREPAYSOURCE between", value1, value2, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andFirstrepaysourceNotBetween(String value1, String value2) {
            addCriterion("FIRSTREPAYSOURCE not between", value1, value2, "firstrepaysource");
            return (Criteria) this;
        }

        public Criteria andMailingaddrIsNull() {
            addCriterion("MAILINGADDR is null");
            return (Criteria) this;
        }

        public Criteria andMailingaddrIsNotNull() {
            addCriterion("MAILINGADDR is not null");
            return (Criteria) this;
        }

        public Criteria andMailingaddrEqualTo(String value) {
            addCriterion("MAILINGADDR =", value, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrNotEqualTo(String value) {
            addCriterion("MAILINGADDR <>", value, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrGreaterThan(String value) {
            addCriterion("MAILINGADDR >", value, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrGreaterThanOrEqualTo(String value) {
            addCriterion("MAILINGADDR >=", value, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrLessThan(String value) {
            addCriterion("MAILINGADDR <", value, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrLessThanOrEqualTo(String value) {
            addCriterion("MAILINGADDR <=", value, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrLike(String value) {
            addCriterion("MAILINGADDR like", value, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrNotLike(String value) {
            addCriterion("MAILINGADDR not like", value, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrIn(List<String> values) {
            addCriterion("MAILINGADDR in", values, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrNotIn(List<String> values) {
            addCriterion("MAILINGADDR not in", values, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrBetween(String value1, String value2) {
            addCriterion("MAILINGADDR between", value1, value2, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andMailingaddrNotBetween(String value1, String value2) {
            addCriterion("MAILINGADDR not between", value1, value2, "mailingaddr");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceIsNull() {
            addCriterion("OTHERREPAYSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceIsNotNull() {
            addCriterion("OTHERREPAYSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceEqualTo(String value) {
            addCriterion("OTHERREPAYSOURCE =", value, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceNotEqualTo(String value) {
            addCriterion("OTHERREPAYSOURCE <>", value, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceGreaterThan(String value) {
            addCriterion("OTHERREPAYSOURCE >", value, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERREPAYSOURCE >=", value, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceLessThan(String value) {
            addCriterion("OTHERREPAYSOURCE <", value, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceLessThanOrEqualTo(String value) {
            addCriterion("OTHERREPAYSOURCE <=", value, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceLike(String value) {
            addCriterion("OTHERREPAYSOURCE like", value, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceNotLike(String value) {
            addCriterion("OTHERREPAYSOURCE not like", value, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceIn(List<String> values) {
            addCriterion("OTHERREPAYSOURCE in", values, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceNotIn(List<String> values) {
            addCriterion("OTHERREPAYSOURCE not in", values, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceBetween(String value1, String value2) {
            addCriterion("OTHERREPAYSOURCE between", value1, value2, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andOtherrepaysourceNotBetween(String value1, String value2) {
            addCriterion("OTHERREPAYSOURCE not between", value1, value2, "otherrepaysource");
            return (Criteria) this;
        }

        public Criteria andPrivinceIsNull() {
            addCriterion("PRIVINCE is null");
            return (Criteria) this;
        }

        public Criteria andPrivinceIsNotNull() {
            addCriterion("PRIVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andPrivinceEqualTo(String value) {
            addCriterion("PRIVINCE =", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceNotEqualTo(String value) {
            addCriterion("PRIVINCE <>", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceGreaterThan(String value) {
            addCriterion("PRIVINCE >", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVINCE >=", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceLessThan(String value) {
            addCriterion("PRIVINCE <", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceLessThanOrEqualTo(String value) {
            addCriterion("PRIVINCE <=", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceLike(String value) {
            addCriterion("PRIVINCE like", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceNotLike(String value) {
            addCriterion("PRIVINCE not like", value, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceIn(List<String> values) {
            addCriterion("PRIVINCE in", values, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceNotIn(List<String> values) {
            addCriterion("PRIVINCE not in", values, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceBetween(String value1, String value2) {
            addCriterion("PRIVINCE between", value1, value2, "privince");
            return (Criteria) this;
        }

        public Criteria andPrivinceNotBetween(String value1, String value2) {
            addCriterion("PRIVINCE not between", value1, value2, "privince");
            return (Criteria) this;
        }

        public Criteria andPyIsNull() {
            addCriterion("PY is null");
            return (Criteria) this;
        }

        public Criteria andPyIsNotNull() {
            addCriterion("PY is not null");
            return (Criteria) this;
        }

        public Criteria andPyEqualTo(String value) {
            addCriterion("PY =", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotEqualTo(String value) {
            addCriterion("PY <>", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyGreaterThan(String value) {
            addCriterion("PY >", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyGreaterThanOrEqualTo(String value) {
            addCriterion("PY >=", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLessThan(String value) {
            addCriterion("PY <", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLessThanOrEqualTo(String value) {
            addCriterion("PY <=", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyLike(String value) {
            addCriterion("PY like", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotLike(String value) {
            addCriterion("PY not like", value, "py");
            return (Criteria) this;
        }

        public Criteria andPyIn(List<String> values) {
            addCriterion("PY in", values, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotIn(List<String> values) {
            addCriterion("PY not in", values, "py");
            return (Criteria) this;
        }

        public Criteria andPyBetween(String value1, String value2) {
            addCriterion("PY between", value1, value2, "py");
            return (Criteria) this;
        }

        public Criteria andPyNotBetween(String value1, String value2) {
            addCriterion("PY not between", value1, value2, "py");
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

        public Criteria andShortnameIsNull() {
            addCriterion("SHORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andShortnameIsNotNull() {
            addCriterion("SHORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShortnameEqualTo(String value) {
            addCriterion("SHORTNAME =", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotEqualTo(String value) {
            addCriterion("SHORTNAME <>", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThan(String value) {
            addCriterion("SHORTNAME >", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameGreaterThanOrEqualTo(String value) {
            addCriterion("SHORTNAME >=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThan(String value) {
            addCriterion("SHORTNAME <", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLessThanOrEqualTo(String value) {
            addCriterion("SHORTNAME <=", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameLike(String value) {
            addCriterion("SHORTNAME like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotLike(String value) {
            addCriterion("SHORTNAME not like", value, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameIn(List<String> values) {
            addCriterion("SHORTNAME in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotIn(List<String> values) {
            addCriterion("SHORTNAME not in", values, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameBetween(String value1, String value2) {
            addCriterion("SHORTNAME between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andShortnameNotBetween(String value1, String value2) {
            addCriterion("SHORTNAME not between", value1, value2, "shortname");
            return (Criteria) this;
        }

        public Criteria andDefvalueIsNull() {
            addCriterion("DEFVALUE is null");
            return (Criteria) this;
        }

        public Criteria andDefvalueIsNotNull() {
            addCriterion("DEFVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDefvalueEqualTo(Long value) {
            addCriterion("DEFVALUE =", value, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueNotEqualTo(Long value) {
            addCriterion("DEFVALUE <>", value, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueGreaterThan(Long value) {
            addCriterion("DEFVALUE >", value, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueGreaterThanOrEqualTo(Long value) {
            addCriterion("DEFVALUE >=", value, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueLessThan(Long value) {
            addCriterion("DEFVALUE <", value, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueLessThanOrEqualTo(Long value) {
            addCriterion("DEFVALUE <=", value, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueIn(List<Long> values) {
            addCriterion("DEFVALUE in", values, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueNotIn(List<Long> values) {
            addCriterion("DEFVALUE not in", values, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueBetween(Long value1, Long value2) {
            addCriterion("DEFVALUE between", value1, value2, "defvalue");
            return (Criteria) this;
        }

        public Criteria andDefvalueNotBetween(Long value1, Long value2) {
            addCriterion("DEFVALUE not between", value1, value2, "defvalue");
            return (Criteria) this;
        }

        public Criteria andIspushedIsNull() {
            addCriterion("ISPUSHED is null");
            return (Criteria) this;
        }

        public Criteria andIspushedIsNotNull() {
            addCriterion("ISPUSHED is not null");
            return (Criteria) this;
        }

        public Criteria andIspushedEqualTo(Short value) {
            addCriterion("ISPUSHED =", value, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedNotEqualTo(Short value) {
            addCriterion("ISPUSHED <>", value, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedGreaterThan(Short value) {
            addCriterion("ISPUSHED >", value, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedGreaterThanOrEqualTo(Short value) {
            addCriterion("ISPUSHED >=", value, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedLessThan(Short value) {
            addCriterion("ISPUSHED <", value, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedLessThanOrEqualTo(Short value) {
            addCriterion("ISPUSHED <=", value, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedIn(List<Short> values) {
            addCriterion("ISPUSHED in", values, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedNotIn(List<Short> values) {
            addCriterion("ISPUSHED not in", values, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedBetween(Short value1, Short value2) {
            addCriterion("ISPUSHED between", value1, value2, "ispushed");
            return (Criteria) this;
        }

        public Criteria andIspushedNotBetween(Short value1, Short value2) {
            addCriterion("ISPUSHED not between", value1, value2, "ispushed");
            return (Criteria) this;
        }

        public Criteria andPushedclientidIsNull() {
            addCriterion("PUSHEDCLIENTID is null");
            return (Criteria) this;
        }

        public Criteria andPushedclientidIsNotNull() {
            addCriterion("PUSHEDCLIENTID is not null");
            return (Criteria) this;
        }

        public Criteria andPushedclientidEqualTo(String value) {
            addCriterion("PUSHEDCLIENTID =", value, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidNotEqualTo(String value) {
            addCriterion("PUSHEDCLIENTID <>", value, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidGreaterThan(String value) {
            addCriterion("PUSHEDCLIENTID >", value, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidGreaterThanOrEqualTo(String value) {
            addCriterion("PUSHEDCLIENTID >=", value, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidLessThan(String value) {
            addCriterion("PUSHEDCLIENTID <", value, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidLessThanOrEqualTo(String value) {
            addCriterion("PUSHEDCLIENTID <=", value, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidLike(String value) {
            addCriterion("PUSHEDCLIENTID like", value, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidNotLike(String value) {
            addCriterion("PUSHEDCLIENTID not like", value, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidIn(List<String> values) {
            addCriterion("PUSHEDCLIENTID in", values, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidNotIn(List<String> values) {
            addCriterion("PUSHEDCLIENTID not in", values, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidBetween(String value1, String value2) {
            addCriterion("PUSHEDCLIENTID between", value1, value2, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andPushedclientidNotBetween(String value1, String value2) {
            addCriterion("PUSHEDCLIENTID not between", value1, value2, "pushedclientid");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseIsNull() {
            addCriterion("ISMIRCOENTERPRISE is null");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseIsNotNull() {
            addCriterion("ISMIRCOENTERPRISE is not null");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseEqualTo(Short value) {
            addCriterion("ISMIRCOENTERPRISE =", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseNotEqualTo(Short value) {
            addCriterion("ISMIRCOENTERPRISE <>", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseGreaterThan(Short value) {
            addCriterion("ISMIRCOENTERPRISE >", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseGreaterThanOrEqualTo(Short value) {
            addCriterion("ISMIRCOENTERPRISE >=", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseLessThan(Short value) {
            addCriterion("ISMIRCOENTERPRISE <", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseLessThanOrEqualTo(Short value) {
            addCriterion("ISMIRCOENTERPRISE <=", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseIn(List<Short> values) {
            addCriterion("ISMIRCOENTERPRISE in", values, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseNotIn(List<Short> values) {
            addCriterion("ISMIRCOENTERPRISE not in", values, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseBetween(Short value1, Short value2) {
            addCriterion("ISMIRCOENTERPRISE between", value1, value2, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseNotBetween(Short value1, Short value2) {
            addCriterion("ISMIRCOENTERPRISE not between", value1, value2, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andNsrztDmIsNull() {
            addCriterion("NSRZT_DM is null");
            return (Criteria) this;
        }

        public Criteria andNsrztDmIsNotNull() {
            addCriterion("NSRZT_DM is not null");
            return (Criteria) this;
        }

        public Criteria andNsrztDmEqualTo(String value) {
            addCriterion("NSRZT_DM =", value, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmNotEqualTo(String value) {
            addCriterion("NSRZT_DM <>", value, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmGreaterThan(String value) {
            addCriterion("NSRZT_DM >", value, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmGreaterThanOrEqualTo(String value) {
            addCriterion("NSRZT_DM >=", value, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmLessThan(String value) {
            addCriterion("NSRZT_DM <", value, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmLessThanOrEqualTo(String value) {
            addCriterion("NSRZT_DM <=", value, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmLike(String value) {
            addCriterion("NSRZT_DM like", value, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmNotLike(String value) {
            addCriterion("NSRZT_DM not like", value, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmIn(List<String> values) {
            addCriterion("NSRZT_DM in", values, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmNotIn(List<String> values) {
            addCriterion("NSRZT_DM not in", values, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmBetween(String value1, String value2) {
            addCriterion("NSRZT_DM between", value1, value2, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztDmNotBetween(String value1, String value2) {
            addCriterion("NSRZT_DM not between", value1, value2, "nsrztDm");
            return (Criteria) this;
        }

        public Criteria andNsrztMcIsNull() {
            addCriterion("NSRZT_MC is null");
            return (Criteria) this;
        }

        public Criteria andNsrztMcIsNotNull() {
            addCriterion("NSRZT_MC is not null");
            return (Criteria) this;
        }

        public Criteria andNsrztMcEqualTo(String value) {
            addCriterion("NSRZT_MC =", value, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcNotEqualTo(String value) {
            addCriterion("NSRZT_MC <>", value, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcGreaterThan(String value) {
            addCriterion("NSRZT_MC >", value, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcGreaterThanOrEqualTo(String value) {
            addCriterion("NSRZT_MC >=", value, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcLessThan(String value) {
            addCriterion("NSRZT_MC <", value, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcLessThanOrEqualTo(String value) {
            addCriterion("NSRZT_MC <=", value, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcLike(String value) {
            addCriterion("NSRZT_MC like", value, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcNotLike(String value) {
            addCriterion("NSRZT_MC not like", value, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcIn(List<String> values) {
            addCriterion("NSRZT_MC in", values, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcNotIn(List<String> values) {
            addCriterion("NSRZT_MC not in", values, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcBetween(String value1, String value2) {
            addCriterion("NSRZT_MC between", value1, value2, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andNsrztMcNotBetween(String value1, String value2) {
            addCriterion("NSRZT_MC not between", value1, value2, "nsrztMc");
            return (Criteria) this;
        }

        public Criteria andRzjgDmIsNull() {
            addCriterion("RZJG_DM is null");
            return (Criteria) this;
        }

        public Criteria andRzjgDmIsNotNull() {
            addCriterion("RZJG_DM is not null");
            return (Criteria) this;
        }

        public Criteria andRzjgDmEqualTo(String value) {
            addCriterion("RZJG_DM =", value, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmNotEqualTo(String value) {
            addCriterion("RZJG_DM <>", value, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmGreaterThan(String value) {
            addCriterion("RZJG_DM >", value, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmGreaterThanOrEqualTo(String value) {
            addCriterion("RZJG_DM >=", value, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmLessThan(String value) {
            addCriterion("RZJG_DM <", value, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmLessThanOrEqualTo(String value) {
            addCriterion("RZJG_DM <=", value, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmLike(String value) {
            addCriterion("RZJG_DM like", value, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmNotLike(String value) {
            addCriterion("RZJG_DM not like", value, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmIn(List<String> values) {
            addCriterion("RZJG_DM in", values, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmNotIn(List<String> values) {
            addCriterion("RZJG_DM not in", values, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmBetween(String value1, String value2) {
            addCriterion("RZJG_DM between", value1, value2, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgDmNotBetween(String value1, String value2) {
            addCriterion("RZJG_DM not between", value1, value2, "rzjgDm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmIsNull() {
            addCriterion("RZJG_SM is null");
            return (Criteria) this;
        }

        public Criteria andRzjgSmIsNotNull() {
            addCriterion("RZJG_SM is not null");
            return (Criteria) this;
        }

        public Criteria andRzjgSmEqualTo(String value) {
            addCriterion("RZJG_SM =", value, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmNotEqualTo(String value) {
            addCriterion("RZJG_SM <>", value, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmGreaterThan(String value) {
            addCriterion("RZJG_SM >", value, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmGreaterThanOrEqualTo(String value) {
            addCriterion("RZJG_SM >=", value, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmLessThan(String value) {
            addCriterion("RZJG_SM <", value, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmLessThanOrEqualTo(String value) {
            addCriterion("RZJG_SM <=", value, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmLike(String value) {
            addCriterion("RZJG_SM like", value, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmNotLike(String value) {
            addCriterion("RZJG_SM not like", value, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmIn(List<String> values) {
            addCriterion("RZJG_SM in", values, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmNotIn(List<String> values) {
            addCriterion("RZJG_SM not in", values, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmBetween(String value1, String value2) {
            addCriterion("RZJG_SM between", value1, value2, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andRzjgSmNotBetween(String value1, String value2) {
            addCriterion("RZJG_SM not between", value1, value2, "rzjgSm");
            return (Criteria) this;
        }

        public Criteria andXydjIsNull() {
            addCriterion("XYDJ is null");
            return (Criteria) this;
        }

        public Criteria andXydjIsNotNull() {
            addCriterion("XYDJ is not null");
            return (Criteria) this;
        }

        public Criteria andXydjEqualTo(String value) {
            addCriterion("XYDJ =", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjNotEqualTo(String value) {
            addCriterion("XYDJ <>", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjGreaterThan(String value) {
            addCriterion("XYDJ >", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjGreaterThanOrEqualTo(String value) {
            addCriterion("XYDJ >=", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjLessThan(String value) {
            addCriterion("XYDJ <", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjLessThanOrEqualTo(String value) {
            addCriterion("XYDJ <=", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjLike(String value) {
            addCriterion("XYDJ like", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjNotLike(String value) {
            addCriterion("XYDJ not like", value, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjIn(List<String> values) {
            addCriterion("XYDJ in", values, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjNotIn(List<String> values) {
            addCriterion("XYDJ not in", values, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjBetween(String value1, String value2) {
            addCriterion("XYDJ between", value1, value2, "xydj");
            return (Criteria) this;
        }

        public Criteria andXydjNotBetween(String value1, String value2) {
            addCriterion("XYDJ not between", value1, value2, "xydj");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmIsNull() {
            addCriterion("ZGSWJG_DM is null");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmIsNotNull() {
            addCriterion("ZGSWJG_DM is not null");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmEqualTo(String value) {
            addCriterion("ZGSWJG_DM =", value, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmNotEqualTo(String value) {
            addCriterion("ZGSWJG_DM <>", value, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmGreaterThan(String value) {
            addCriterion("ZGSWJG_DM >", value, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmGreaterThanOrEqualTo(String value) {
            addCriterion("ZGSWJG_DM >=", value, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmLessThan(String value) {
            addCriterion("ZGSWJG_DM <", value, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmLessThanOrEqualTo(String value) {
            addCriterion("ZGSWJG_DM <=", value, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmLike(String value) {
            addCriterion("ZGSWJG_DM like", value, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmNotLike(String value) {
            addCriterion("ZGSWJG_DM not like", value, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmIn(List<String> values) {
            addCriterion("ZGSWJG_DM in", values, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmNotIn(List<String> values) {
            addCriterion("ZGSWJG_DM not in", values, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmBetween(String value1, String value2) {
            addCriterion("ZGSWJG_DM between", value1, value2, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgDmNotBetween(String value1, String value2) {
            addCriterion("ZGSWJG_DM not between", value1, value2, "zgswjgDm");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcIsNull() {
            addCriterion("ZGSWJG_MC is null");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcIsNotNull() {
            addCriterion("ZGSWJG_MC is not null");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcEqualTo(String value) {
            addCriterion("ZGSWJG_MC =", value, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcNotEqualTo(String value) {
            addCriterion("ZGSWJG_MC <>", value, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcGreaterThan(String value) {
            addCriterion("ZGSWJG_MC >", value, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcGreaterThanOrEqualTo(String value) {
            addCriterion("ZGSWJG_MC >=", value, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcLessThan(String value) {
            addCriterion("ZGSWJG_MC <", value, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcLessThanOrEqualTo(String value) {
            addCriterion("ZGSWJG_MC <=", value, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcLike(String value) {
            addCriterion("ZGSWJG_MC like", value, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcNotLike(String value) {
            addCriterion("ZGSWJG_MC not like", value, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcIn(List<String> values) {
            addCriterion("ZGSWJG_MC in", values, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcNotIn(List<String> values) {
            addCriterion("ZGSWJG_MC not in", values, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcBetween(String value1, String value2) {
            addCriterion("ZGSWJG_MC between", value1, value2, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andZgswjgMcNotBetween(String value1, String value2) {
            addCriterion("ZGSWJG_MC not between", value1, value2, "zgswjgMc");
            return (Criteria) this;
        }

        public Criteria andSssjFlagIsNull() {
            addCriterion("SSSJ_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSssjFlagIsNotNull() {
            addCriterion("SSSJ_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSssjFlagEqualTo(String value) {
            addCriterion("SSSJ_FLAG =", value, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagNotEqualTo(String value) {
            addCriterion("SSSJ_FLAG <>", value, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagGreaterThan(String value) {
            addCriterion("SSSJ_FLAG >", value, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SSSJ_FLAG >=", value, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagLessThan(String value) {
            addCriterion("SSSJ_FLAG <", value, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagLessThanOrEqualTo(String value) {
            addCriterion("SSSJ_FLAG <=", value, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagLike(String value) {
            addCriterion("SSSJ_FLAG like", value, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagNotLike(String value) {
            addCriterion("SSSJ_FLAG not like", value, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagIn(List<String> values) {
            addCriterion("SSSJ_FLAG in", values, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagNotIn(List<String> values) {
            addCriterion("SSSJ_FLAG not in", values, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagBetween(String value1, String value2) {
            addCriterion("SSSJ_FLAG between", value1, value2, "sssjFlag");
            return (Criteria) this;
        }

        public Criteria andSssjFlagNotBetween(String value1, String value2) {
            addCriterion("SSSJ_FLAG not between", value1, value2, "sssjFlag");
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