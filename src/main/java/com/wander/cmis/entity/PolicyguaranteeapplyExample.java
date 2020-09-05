package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PolicyguaranteeapplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PolicyguaranteeapplyExample() {
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

        public Criteria andApplynoIsNull() {
            addCriterion("APPLYNO is null");
            return (Criteria) this;
        }

        public Criteria andApplynoIsNotNull() {
            addCriterion("APPLYNO is not null");
            return (Criteria) this;
        }

        public Criteria andApplynoEqualTo(String value) {
            addCriterion("APPLYNO =", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotEqualTo(String value) {
            addCriterion("APPLYNO <>", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThan(String value) {
            addCriterion("APPLYNO >", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYNO >=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThan(String value) {
            addCriterion("APPLYNO <", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLessThanOrEqualTo(String value) {
            addCriterion("APPLYNO <=", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoLike(String value) {
            addCriterion("APPLYNO like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotLike(String value) {
            addCriterion("APPLYNO not like", value, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoIn(List<String> values) {
            addCriterion("APPLYNO in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotIn(List<String> values) {
            addCriterion("APPLYNO not in", values, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoBetween(String value1, String value2) {
            addCriterion("APPLYNO between", value1, value2, "applyno");
            return (Criteria) this;
        }

        public Criteria andApplynoNotBetween(String value1, String value2) {
            addCriterion("APPLYNO not between", value1, value2, "applyno");
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

        public Criteria andCountyauditopinionIsNull() {
            addCriterion("COUNTYAUDITOPINION is null");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionIsNotNull() {
            addCriterion("COUNTYAUDITOPINION is not null");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionEqualTo(String value) {
            addCriterion("COUNTYAUDITOPINION =", value, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionNotEqualTo(String value) {
            addCriterion("COUNTYAUDITOPINION <>", value, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionGreaterThan(String value) {
            addCriterion("COUNTYAUDITOPINION >", value, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTYAUDITOPINION >=", value, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionLessThan(String value) {
            addCriterion("COUNTYAUDITOPINION <", value, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionLessThanOrEqualTo(String value) {
            addCriterion("COUNTYAUDITOPINION <=", value, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionLike(String value) {
            addCriterion("COUNTYAUDITOPINION like", value, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionNotLike(String value) {
            addCriterion("COUNTYAUDITOPINION not like", value, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionIn(List<String> values) {
            addCriterion("COUNTYAUDITOPINION in", values, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionNotIn(List<String> values) {
            addCriterion("COUNTYAUDITOPINION not in", values, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionBetween(String value1, String value2) {
            addCriterion("COUNTYAUDITOPINION between", value1, value2, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditopinionNotBetween(String value1, String value2) {
            addCriterion("COUNTYAUDITOPINION not between", value1, value2, "countyauditopinion");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultIsNull() {
            addCriterion("COUNTYAUDITRESULT is null");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultIsNotNull() {
            addCriterion("COUNTYAUDITRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultEqualTo(String value) {
            addCriterion("COUNTYAUDITRESULT =", value, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultNotEqualTo(String value) {
            addCriterion("COUNTYAUDITRESULT <>", value, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultGreaterThan(String value) {
            addCriterion("COUNTYAUDITRESULT >", value, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTYAUDITRESULT >=", value, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultLessThan(String value) {
            addCriterion("COUNTYAUDITRESULT <", value, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultLessThanOrEqualTo(String value) {
            addCriterion("COUNTYAUDITRESULT <=", value, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultLike(String value) {
            addCriterion("COUNTYAUDITRESULT like", value, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultNotLike(String value) {
            addCriterion("COUNTYAUDITRESULT not like", value, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultIn(List<String> values) {
            addCriterion("COUNTYAUDITRESULT in", values, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultNotIn(List<String> values) {
            addCriterion("COUNTYAUDITRESULT not in", values, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultBetween(String value1, String value2) {
            addCriterion("COUNTYAUDITRESULT between", value1, value2, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyauditresultNotBetween(String value1, String value2) {
            addCriterion("COUNTYAUDITRESULT not between", value1, value2, "countyauditresult");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeIsNull() {
            addCriterion("COUNTYAUDITTIME is null");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeIsNotNull() {
            addCriterion("COUNTYAUDITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeEqualTo(BigDecimal value) {
            addCriterion("COUNTYAUDITTIME =", value, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeNotEqualTo(BigDecimal value) {
            addCriterion("COUNTYAUDITTIME <>", value, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeGreaterThan(BigDecimal value) {
            addCriterion("COUNTYAUDITTIME >", value, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUNTYAUDITTIME >=", value, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeLessThan(BigDecimal value) {
            addCriterion("COUNTYAUDITTIME <", value, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUNTYAUDITTIME <=", value, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeIn(List<BigDecimal> values) {
            addCriterion("COUNTYAUDITTIME in", values, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeNotIn(List<BigDecimal> values) {
            addCriterion("COUNTYAUDITTIME not in", values, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUNTYAUDITTIME between", value1, value2, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andCountyaudittimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUNTYAUDITTIME not between", value1, value2, "countyaudittime");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityIsNull() {
            addCriterion("LENGTHOFMATURITY is null");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityIsNotNull() {
            addCriterion("LENGTHOFMATURITY is not null");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityEqualTo(Long value) {
            addCriterion("LENGTHOFMATURITY =", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityNotEqualTo(Long value) {
            addCriterion("LENGTHOFMATURITY <>", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityGreaterThan(Long value) {
            addCriterion("LENGTHOFMATURITY >", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityGreaterThanOrEqualTo(Long value) {
            addCriterion("LENGTHOFMATURITY >=", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityLessThan(Long value) {
            addCriterion("LENGTHOFMATURITY <", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityLessThanOrEqualTo(Long value) {
            addCriterion("LENGTHOFMATURITY <=", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityIn(List<Long> values) {
            addCriterion("LENGTHOFMATURITY in", values, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityNotIn(List<Long> values) {
            addCriterion("LENGTHOFMATURITY not in", values, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityBetween(Long value1, Long value2) {
            addCriterion("LENGTHOFMATURITY between", value1, value2, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityNotBetween(Long value1, Long value2) {
            addCriterion("LENGTHOFMATURITY not between", value1, value2, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitIsNull() {
            addCriterion("LENGTHOFMATURITYUNIT is null");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitIsNotNull() {
            addCriterion("LENGTHOFMATURITYUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitEqualTo(String value) {
            addCriterion("LENGTHOFMATURITYUNIT =", value, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitNotEqualTo(String value) {
            addCriterion("LENGTHOFMATURITYUNIT <>", value, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitGreaterThan(String value) {
            addCriterion("LENGTHOFMATURITYUNIT >", value, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitGreaterThanOrEqualTo(String value) {
            addCriterion("LENGTHOFMATURITYUNIT >=", value, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitLessThan(String value) {
            addCriterion("LENGTHOFMATURITYUNIT <", value, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitLessThanOrEqualTo(String value) {
            addCriterion("LENGTHOFMATURITYUNIT <=", value, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitLike(String value) {
            addCriterion("LENGTHOFMATURITYUNIT like", value, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitNotLike(String value) {
            addCriterion("LENGTHOFMATURITYUNIT not like", value, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitIn(List<String> values) {
            addCriterion("LENGTHOFMATURITYUNIT in", values, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitNotIn(List<String> values) {
            addCriterion("LENGTHOFMATURITYUNIT not in", values, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitBetween(String value1, String value2) {
            addCriterion("LENGTHOFMATURITYUNIT between", value1, value2, "lengthofmaturityunit");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityunitNotBetween(String value1, String value2) {
            addCriterion("LENGTHOFMATURITYUNIT not between", value1, value2, "lengthofmaturityunit");
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

        public Criteria andLoantypeIsNull() {
            addCriterion("LOANTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLoantypeIsNotNull() {
            addCriterion("LOANTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLoantypeEqualTo(String value) {
            addCriterion("LOANTYPE =", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotEqualTo(String value) {
            addCriterion("LOANTYPE <>", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeGreaterThan(String value) {
            addCriterion("LOANTYPE >", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOANTYPE >=", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLessThan(String value) {
            addCriterion("LOANTYPE <", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLessThanOrEqualTo(String value) {
            addCriterion("LOANTYPE <=", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeLike(String value) {
            addCriterion("LOANTYPE like", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotLike(String value) {
            addCriterion("LOANTYPE not like", value, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeIn(List<String> values) {
            addCriterion("LOANTYPE in", values, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotIn(List<String> values) {
            addCriterion("LOANTYPE not in", values, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeBetween(String value1, String value2) {
            addCriterion("LOANTYPE between", value1, value2, "loantype");
            return (Criteria) this;
        }

        public Criteria andLoantypeNotBetween(String value1, String value2) {
            addCriterion("LOANTYPE not between", value1, value2, "loantype");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNull() {
            addCriterion("OPERATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNotNull() {
            addCriterion("OPERATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeEqualTo(BigDecimal value) {
            addCriterion("OPERATIONTIME =", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotEqualTo(BigDecimal value) {
            addCriterion("OPERATIONTIME <>", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThan(BigDecimal value) {
            addCriterion("OPERATIONTIME >", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATIONTIME >=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThan(BigDecimal value) {
            addCriterion("OPERATIONTIME <", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATIONTIME <=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIn(List<BigDecimal> values) {
            addCriterion("OPERATIONTIME in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotIn(List<BigDecimal> values) {
            addCriterion("OPERATIONTIME not in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATIONTIME between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATIONTIME not between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andReturnnodeIsNull() {
            addCriterion("RETURNNODE is null");
            return (Criteria) this;
        }

        public Criteria andReturnnodeIsNotNull() {
            addCriterion("RETURNNODE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnnodeEqualTo(String value) {
            addCriterion("RETURNNODE =", value, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeNotEqualTo(String value) {
            addCriterion("RETURNNODE <>", value, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeGreaterThan(String value) {
            addCriterion("RETURNNODE >", value, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNNODE >=", value, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeLessThan(String value) {
            addCriterion("RETURNNODE <", value, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeLessThanOrEqualTo(String value) {
            addCriterion("RETURNNODE <=", value, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeLike(String value) {
            addCriterion("RETURNNODE like", value, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeNotLike(String value) {
            addCriterion("RETURNNODE not like", value, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeIn(List<String> values) {
            addCriterion("RETURNNODE in", values, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeNotIn(List<String> values) {
            addCriterion("RETURNNODE not in", values, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeBetween(String value1, String value2) {
            addCriterion("RETURNNODE between", value1, value2, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnnodeNotBetween(String value1, String value2) {
            addCriterion("RETURNNODE not between", value1, value2, "returnnode");
            return (Criteria) this;
        }

        public Criteria andReturnpersonIsNull() {
            addCriterion("RETURNPERSON is null");
            return (Criteria) this;
        }

        public Criteria andReturnpersonIsNotNull() {
            addCriterion("RETURNPERSON is not null");
            return (Criteria) this;
        }

        public Criteria andReturnpersonEqualTo(String value) {
            addCriterion("RETURNPERSON =", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonNotEqualTo(String value) {
            addCriterion("RETURNPERSON <>", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonGreaterThan(String value) {
            addCriterion("RETURNPERSON >", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNPERSON >=", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonLessThan(String value) {
            addCriterion("RETURNPERSON <", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonLessThanOrEqualTo(String value) {
            addCriterion("RETURNPERSON <=", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonLike(String value) {
            addCriterion("RETURNPERSON like", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonNotLike(String value) {
            addCriterion("RETURNPERSON not like", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonIn(List<String> values) {
            addCriterion("RETURNPERSON in", values, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonNotIn(List<String> values) {
            addCriterion("RETURNPERSON not in", values, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonBetween(String value1, String value2) {
            addCriterion("RETURNPERSON between", value1, value2, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonNotBetween(String value1, String value2) {
            addCriterion("RETURNPERSON not between", value1, value2, "returnperson");
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

        public Criteria andSecuritycostIsNull() {
            addCriterion("SECURITYCOST is null");
            return (Criteria) this;
        }

        public Criteria andSecuritycostIsNotNull() {
            addCriterion("SECURITYCOST is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritycostEqualTo(BigDecimal value) {
            addCriterion("SECURITYCOST =", value, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostNotEqualTo(BigDecimal value) {
            addCriterion("SECURITYCOST <>", value, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostGreaterThan(BigDecimal value) {
            addCriterion("SECURITYCOST >", value, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SECURITYCOST >=", value, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostLessThan(BigDecimal value) {
            addCriterion("SECURITYCOST <", value, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SECURITYCOST <=", value, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostIn(List<BigDecimal> values) {
            addCriterion("SECURITYCOST in", values, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostNotIn(List<BigDecimal> values) {
            addCriterion("SECURITYCOST not in", values, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECURITYCOST between", value1, value2, "securitycost");
            return (Criteria) this;
        }

        public Criteria andSecuritycostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECURITYCOST not between", value1, value2, "securitycost");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStreetopinionIsNull() {
            addCriterion("STREETOPINION is null");
            return (Criteria) this;
        }

        public Criteria andStreetopinionIsNotNull() {
            addCriterion("STREETOPINION is not null");
            return (Criteria) this;
        }

        public Criteria andStreetopinionEqualTo(String value) {
            addCriterion("STREETOPINION =", value, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionNotEqualTo(String value) {
            addCriterion("STREETOPINION <>", value, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionGreaterThan(String value) {
            addCriterion("STREETOPINION >", value, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionGreaterThanOrEqualTo(String value) {
            addCriterion("STREETOPINION >=", value, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionLessThan(String value) {
            addCriterion("STREETOPINION <", value, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionLessThanOrEqualTo(String value) {
            addCriterion("STREETOPINION <=", value, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionLike(String value) {
            addCriterion("STREETOPINION like", value, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionNotLike(String value) {
            addCriterion("STREETOPINION not like", value, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionIn(List<String> values) {
            addCriterion("STREETOPINION in", values, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionNotIn(List<String> values) {
            addCriterion("STREETOPINION not in", values, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionBetween(String value1, String value2) {
            addCriterion("STREETOPINION between", value1, value2, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andStreetopinionNotBetween(String value1, String value2) {
            addCriterion("STREETOPINION not between", value1, value2, "streetopinion");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNull() {
            addCriterion("COUNTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("COUNTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(String value) {
            addCriterion("COUNTY_ID =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(String value) {
            addCriterion("COUNTY_ID <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(String value) {
            addCriterion("COUNTY_ID >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY_ID >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(String value) {
            addCriterion("COUNTY_ID <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(String value) {
            addCriterion("COUNTY_ID <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLike(String value) {
            addCriterion("COUNTY_ID like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotLike(String value) {
            addCriterion("COUNTY_ID not like", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<String> values) {
            addCriterion("COUNTY_ID in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<String> values) {
            addCriterion("COUNTY_ID not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(String value1, String value2) {
            addCriterion("COUNTY_ID between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(String value1, String value2) {
            addCriterion("COUNTY_ID not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdIsNull() {
            addCriterion("COUNTYAUDITOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdIsNotNull() {
            addCriterion("COUNTYAUDITOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdEqualTo(String value) {
            addCriterion("COUNTYAUDITOR_ID =", value, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdNotEqualTo(String value) {
            addCriterion("COUNTYAUDITOR_ID <>", value, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdGreaterThan(String value) {
            addCriterion("COUNTYAUDITOR_ID >", value, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTYAUDITOR_ID >=", value, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdLessThan(String value) {
            addCriterion("COUNTYAUDITOR_ID <", value, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdLessThanOrEqualTo(String value) {
            addCriterion("COUNTYAUDITOR_ID <=", value, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdLike(String value) {
            addCriterion("COUNTYAUDITOR_ID like", value, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdNotLike(String value) {
            addCriterion("COUNTYAUDITOR_ID not like", value, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdIn(List<String> values) {
            addCriterion("COUNTYAUDITOR_ID in", values, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdNotIn(List<String> values) {
            addCriterion("COUNTYAUDITOR_ID not in", values, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdBetween(String value1, String value2) {
            addCriterion("COUNTYAUDITOR_ID between", value1, value2, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andCountyauditorIdNotBetween(String value1, String value2) {
            addCriterion("COUNTYAUDITOR_ID not between", value1, value2, "countyauditorId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdIsNull() {
            addCriterion("LOANORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdIsNotNull() {
            addCriterion("LOANORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdEqualTo(String value) {
            addCriterion("LOANORG_ID =", value, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdNotEqualTo(String value) {
            addCriterion("LOANORG_ID <>", value, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdGreaterThan(String value) {
            addCriterion("LOANORG_ID >", value, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdGreaterThanOrEqualTo(String value) {
            addCriterion("LOANORG_ID >=", value, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdLessThan(String value) {
            addCriterion("LOANORG_ID <", value, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdLessThanOrEqualTo(String value) {
            addCriterion("LOANORG_ID <=", value, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdLike(String value) {
            addCriterion("LOANORG_ID like", value, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdNotLike(String value) {
            addCriterion("LOANORG_ID not like", value, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdIn(List<String> values) {
            addCriterion("LOANORG_ID in", values, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdNotIn(List<String> values) {
            addCriterion("LOANORG_ID not in", values, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdBetween(String value1, String value2) {
            addCriterion("LOANORG_ID between", value1, value2, "loanorgId");
            return (Criteria) this;
        }

        public Criteria andLoanorgIdNotBetween(String value1, String value2) {
            addCriterion("LOANORG_ID not between", value1, value2, "loanorgId");
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

        public Criteria andPmIdIsNull() {
            addCriterion("PM_ID is null");
            return (Criteria) this;
        }

        public Criteria andPmIdIsNotNull() {
            addCriterion("PM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPmIdEqualTo(String value) {
            addCriterion("PM_ID =", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotEqualTo(String value) {
            addCriterion("PM_ID <>", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThan(String value) {
            addCriterion("PM_ID >", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdGreaterThanOrEqualTo(String value) {
            addCriterion("PM_ID >=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThan(String value) {
            addCriterion("PM_ID <", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLessThanOrEqualTo(String value) {
            addCriterion("PM_ID <=", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdLike(String value) {
            addCriterion("PM_ID like", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotLike(String value) {
            addCriterion("PM_ID not like", value, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdIn(List<String> values) {
            addCriterion("PM_ID in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotIn(List<String> values) {
            addCriterion("PM_ID not in", values, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdBetween(String value1, String value2) {
            addCriterion("PM_ID between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andPmIdNotBetween(String value1, String value2) {
            addCriterion("PM_ID not between", value1, value2, "pmId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNull() {
            addCriterion("STREET_ID is null");
            return (Criteria) this;
        }

        public Criteria andStreetIdIsNotNull() {
            addCriterion("STREET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStreetIdEqualTo(String value) {
            addCriterion("STREET_ID =", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotEqualTo(String value) {
            addCriterion("STREET_ID <>", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThan(String value) {
            addCriterion("STREET_ID >", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdGreaterThanOrEqualTo(String value) {
            addCriterion("STREET_ID >=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThan(String value) {
            addCriterion("STREET_ID <", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLessThanOrEqualTo(String value) {
            addCriterion("STREET_ID <=", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdLike(String value) {
            addCriterion("STREET_ID like", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotLike(String value) {
            addCriterion("STREET_ID not like", value, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdIn(List<String> values) {
            addCriterion("STREET_ID in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotIn(List<String> values) {
            addCriterion("STREET_ID not in", values, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdBetween(String value1, String value2) {
            addCriterion("STREET_ID between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andStreetIdNotBetween(String value1, String value2) {
            addCriterion("STREET_ID not between", value1, value2, "streetId");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountIsNull() {
            addCriterion("CREATEBUSIAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountIsNotNull() {
            addCriterion("CREATEBUSIAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountEqualTo(BigDecimal value) {
            addCriterion("CREATEBUSIAMOUNT =", value, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountNotEqualTo(BigDecimal value) {
            addCriterion("CREATEBUSIAMOUNT <>", value, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountGreaterThan(BigDecimal value) {
            addCriterion("CREATEBUSIAMOUNT >", value, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEBUSIAMOUNT >=", value, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountLessThan(BigDecimal value) {
            addCriterion("CREATEBUSIAMOUNT <", value, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEBUSIAMOUNT <=", value, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountIn(List<BigDecimal> values) {
            addCriterion("CREATEBUSIAMOUNT in", values, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountNotIn(List<BigDecimal> values) {
            addCriterion("CREATEBUSIAMOUNT not in", values, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEBUSIAMOUNT between", value1, value2, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andCreatebusiamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEBUSIAMOUNT not between", value1, value2, "createbusiamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountIsNull() {
            addCriterion("GROUPAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andGroupamountIsNotNull() {
            addCriterion("GROUPAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGroupamountEqualTo(BigDecimal value) {
            addCriterion("GROUPAMOUNT =", value, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountNotEqualTo(BigDecimal value) {
            addCriterion("GROUPAMOUNT <>", value, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountGreaterThan(BigDecimal value) {
            addCriterion("GROUPAMOUNT >", value, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GROUPAMOUNT >=", value, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountLessThan(BigDecimal value) {
            addCriterion("GROUPAMOUNT <", value, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GROUPAMOUNT <=", value, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountIn(List<BigDecimal> values) {
            addCriterion("GROUPAMOUNT in", values, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountNotIn(List<BigDecimal> values) {
            addCriterion("GROUPAMOUNT not in", values, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROUPAMOUNT between", value1, value2, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGroupamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROUPAMOUNT not between", value1, value2, "groupamount");
            return (Criteria) this;
        }

        public Criteria andGuarmethodIsNull() {
            addCriterion("GUARMETHOD is null");
            return (Criteria) this;
        }

        public Criteria andGuarmethodIsNotNull() {
            addCriterion("GUARMETHOD is not null");
            return (Criteria) this;
        }

        public Criteria andGuarmethodEqualTo(String value) {
            addCriterion("GUARMETHOD =", value, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodNotEqualTo(String value) {
            addCriterion("GUARMETHOD <>", value, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodGreaterThan(String value) {
            addCriterion("GUARMETHOD >", value, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodGreaterThanOrEqualTo(String value) {
            addCriterion("GUARMETHOD >=", value, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodLessThan(String value) {
            addCriterion("GUARMETHOD <", value, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodLessThanOrEqualTo(String value) {
            addCriterion("GUARMETHOD <=", value, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodLike(String value) {
            addCriterion("GUARMETHOD like", value, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodNotLike(String value) {
            addCriterion("GUARMETHOD not like", value, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodIn(List<String> values) {
            addCriterion("GUARMETHOD in", values, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodNotIn(List<String> values) {
            addCriterion("GUARMETHOD not in", values, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodBetween(String value1, String value2) {
            addCriterion("GUARMETHOD between", value1, value2, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andGuarmethodNotBetween(String value1, String value2) {
            addCriterion("GUARMETHOD not between", value1, value2, "guarmethod");
            return (Criteria) this;
        }

        public Criteria andImportdateIsNull() {
            addCriterion("IMPORTDATE is null");
            return (Criteria) this;
        }

        public Criteria andImportdateIsNotNull() {
            addCriterion("IMPORTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andImportdateEqualTo(BigDecimal value) {
            addCriterion("IMPORTDATE =", value, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateNotEqualTo(BigDecimal value) {
            addCriterion("IMPORTDATE <>", value, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateGreaterThan(BigDecimal value) {
            addCriterion("IMPORTDATE >", value, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPORTDATE >=", value, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateLessThan(BigDecimal value) {
            addCriterion("IMPORTDATE <", value, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMPORTDATE <=", value, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateIn(List<BigDecimal> values) {
            addCriterion("IMPORTDATE in", values, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateNotIn(List<BigDecimal> values) {
            addCriterion("IMPORTDATE not in", values, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPORTDATE between", value1, value2, "importdate");
            return (Criteria) this;
        }

        public Criteria andImportdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMPORTDATE not between", value1, value2, "importdate");
            return (Criteria) this;
        }

        public Criteria andInputprojectIsNull() {
            addCriterion("INPUTPROJECT is null");
            return (Criteria) this;
        }

        public Criteria andInputprojectIsNotNull() {
            addCriterion("INPUTPROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andInputprojectEqualTo(String value) {
            addCriterion("INPUTPROJECT =", value, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectNotEqualTo(String value) {
            addCriterion("INPUTPROJECT <>", value, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectGreaterThan(String value) {
            addCriterion("INPUTPROJECT >", value, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectGreaterThanOrEqualTo(String value) {
            addCriterion("INPUTPROJECT >=", value, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectLessThan(String value) {
            addCriterion("INPUTPROJECT <", value, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectLessThanOrEqualTo(String value) {
            addCriterion("INPUTPROJECT <=", value, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectLike(String value) {
            addCriterion("INPUTPROJECT like", value, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectNotLike(String value) {
            addCriterion("INPUTPROJECT not like", value, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectIn(List<String> values) {
            addCriterion("INPUTPROJECT in", values, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectNotIn(List<String> values) {
            addCriterion("INPUTPROJECT not in", values, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectBetween(String value1, String value2) {
            addCriterion("INPUTPROJECT between", value1, value2, "inputproject");
            return (Criteria) this;
        }

        public Criteria andInputprojectNotBetween(String value1, String value2) {
            addCriterion("INPUTPROJECT not between", value1, value2, "inputproject");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountIsNull() {
            addCriterion("MIRCOENTERPAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountIsNotNull() {
            addCriterion("MIRCOENTERPAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountEqualTo(BigDecimal value) {
            addCriterion("MIRCOENTERPAMOUNT =", value, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountNotEqualTo(BigDecimal value) {
            addCriterion("MIRCOENTERPAMOUNT <>", value, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountGreaterThan(BigDecimal value) {
            addCriterion("MIRCOENTERPAMOUNT >", value, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MIRCOENTERPAMOUNT >=", value, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountLessThan(BigDecimal value) {
            addCriterion("MIRCOENTERPAMOUNT <", value, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MIRCOENTERPAMOUNT <=", value, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountIn(List<BigDecimal> values) {
            addCriterion("MIRCOENTERPAMOUNT in", values, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountNotIn(List<BigDecimal> values) {
            addCriterion("MIRCOENTERPAMOUNT not in", values, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIRCOENTERPAMOUNT between", value1, value2, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andMircoenterpamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MIRCOENTERPAMOUNT not between", value1, value2, "mircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andImportempIdIsNull() {
            addCriterion("IMPORTEMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andImportempIdIsNotNull() {
            addCriterion("IMPORTEMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andImportempIdEqualTo(String value) {
            addCriterion("IMPORTEMP_ID =", value, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdNotEqualTo(String value) {
            addCriterion("IMPORTEMP_ID <>", value, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdGreaterThan(String value) {
            addCriterion("IMPORTEMP_ID >", value, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTEMP_ID >=", value, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdLessThan(String value) {
            addCriterion("IMPORTEMP_ID <", value, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdLessThanOrEqualTo(String value) {
            addCriterion("IMPORTEMP_ID <=", value, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdLike(String value) {
            addCriterion("IMPORTEMP_ID like", value, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdNotLike(String value) {
            addCriterion("IMPORTEMP_ID not like", value, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdIn(List<String> values) {
            addCriterion("IMPORTEMP_ID in", values, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdNotIn(List<String> values) {
            addCriterion("IMPORTEMP_ID not in", values, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdBetween(String value1, String value2) {
            addCriterion("IMPORTEMP_ID between", value1, value2, "importempId");
            return (Criteria) this;
        }

        public Criteria andImportempIdNotBetween(String value1, String value2) {
            addCriterion("IMPORTEMP_ID not between", value1, value2, "importempId");
            return (Criteria) this;
        }

        public Criteria andAllottypeIsNull() {
            addCriterion("ALLOTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAllottypeIsNotNull() {
            addCriterion("ALLOTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAllottypeEqualTo(String value) {
            addCriterion("ALLOTTYPE =", value, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeNotEqualTo(String value) {
            addCriterion("ALLOTTYPE <>", value, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeGreaterThan(String value) {
            addCriterion("ALLOTTYPE >", value, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeGreaterThanOrEqualTo(String value) {
            addCriterion("ALLOTTYPE >=", value, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeLessThan(String value) {
            addCriterion("ALLOTTYPE <", value, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeLessThanOrEqualTo(String value) {
            addCriterion("ALLOTTYPE <=", value, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeLike(String value) {
            addCriterion("ALLOTTYPE like", value, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeNotLike(String value) {
            addCriterion("ALLOTTYPE not like", value, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeIn(List<String> values) {
            addCriterion("ALLOTTYPE in", values, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeNotIn(List<String> values) {
            addCriterion("ALLOTTYPE not in", values, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeBetween(String value1, String value2) {
            addCriterion("ALLOTTYPE between", value1, value2, "allottype");
            return (Criteria) this;
        }

        public Criteria andAllottypeNotBetween(String value1, String value2) {
            addCriterion("ALLOTTYPE not between", value1, value2, "allottype");
            return (Criteria) this;
        }

        public Criteria andApplyaddressIsNull() {
            addCriterion("APPLYADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andApplyaddressIsNotNull() {
            addCriterion("APPLYADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andApplyaddressEqualTo(String value) {
            addCriterion("APPLYADDRESS =", value, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressNotEqualTo(String value) {
            addCriterion("APPLYADDRESS <>", value, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressGreaterThan(String value) {
            addCriterion("APPLYADDRESS >", value, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYADDRESS >=", value, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressLessThan(String value) {
            addCriterion("APPLYADDRESS <", value, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressLessThanOrEqualTo(String value) {
            addCriterion("APPLYADDRESS <=", value, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressLike(String value) {
            addCriterion("APPLYADDRESS like", value, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressNotLike(String value) {
            addCriterion("APPLYADDRESS not like", value, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressIn(List<String> values) {
            addCriterion("APPLYADDRESS in", values, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressNotIn(List<String> values) {
            addCriterion("APPLYADDRESS not in", values, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressBetween(String value1, String value2) {
            addCriterion("APPLYADDRESS between", value1, value2, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andApplyaddressNotBetween(String value1, String value2) {
            addCriterion("APPLYADDRESS not between", value1, value2, "applyaddress");
            return (Criteria) this;
        }

        public Criteria andAppointtimeIsNull() {
            addCriterion("APPOINTTIME is null");
            return (Criteria) this;
        }

        public Criteria andAppointtimeIsNotNull() {
            addCriterion("APPOINTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAppointtimeEqualTo(BigDecimal value) {
            addCriterion("APPOINTTIME =", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeNotEqualTo(BigDecimal value) {
            addCriterion("APPOINTTIME <>", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeGreaterThan(BigDecimal value) {
            addCriterion("APPOINTTIME >", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APPOINTTIME >=", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeLessThan(BigDecimal value) {
            addCriterion("APPOINTTIME <", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APPOINTTIME <=", value, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeIn(List<BigDecimal> values) {
            addCriterion("APPOINTTIME in", values, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeNotIn(List<BigDecimal> values) {
            addCriterion("APPOINTTIME not in", values, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPOINTTIME between", value1, value2, "appointtime");
            return (Criteria) this;
        }

        public Criteria andAppointtimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APPOINTTIME not between", value1, value2, "appointtime");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageIsNull() {
            addCriterion("COMPANYCHECKMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageIsNotNull() {
            addCriterion("COMPANYCHECKMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageEqualTo(String value) {
            addCriterion("COMPANYCHECKMESSAGE =", value, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageNotEqualTo(String value) {
            addCriterion("COMPANYCHECKMESSAGE <>", value, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageGreaterThan(String value) {
            addCriterion("COMPANYCHECKMESSAGE >", value, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANYCHECKMESSAGE >=", value, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageLessThan(String value) {
            addCriterion("COMPANYCHECKMESSAGE <", value, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageLessThanOrEqualTo(String value) {
            addCriterion("COMPANYCHECKMESSAGE <=", value, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageLike(String value) {
            addCriterion("COMPANYCHECKMESSAGE like", value, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageNotLike(String value) {
            addCriterion("COMPANYCHECKMESSAGE not like", value, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageIn(List<String> values) {
            addCriterion("COMPANYCHECKMESSAGE in", values, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageNotIn(List<String> values) {
            addCriterion("COMPANYCHECKMESSAGE not in", values, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageBetween(String value1, String value2) {
            addCriterion("COMPANYCHECKMESSAGE between", value1, value2, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCompanycheckmessageNotBetween(String value1, String value2) {
            addCriterion("COMPANYCHECKMESSAGE not between", value1, value2, "companycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageIsNull() {
            addCriterion("COUNTYCHECKMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageIsNotNull() {
            addCriterion("COUNTYCHECKMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageEqualTo(String value) {
            addCriterion("COUNTYCHECKMESSAGE =", value, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageNotEqualTo(String value) {
            addCriterion("COUNTYCHECKMESSAGE <>", value, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageGreaterThan(String value) {
            addCriterion("COUNTYCHECKMESSAGE >", value, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTYCHECKMESSAGE >=", value, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageLessThan(String value) {
            addCriterion("COUNTYCHECKMESSAGE <", value, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageLessThanOrEqualTo(String value) {
            addCriterion("COUNTYCHECKMESSAGE <=", value, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageLike(String value) {
            addCriterion("COUNTYCHECKMESSAGE like", value, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageNotLike(String value) {
            addCriterion("COUNTYCHECKMESSAGE not like", value, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageIn(List<String> values) {
            addCriterion("COUNTYCHECKMESSAGE in", values, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageNotIn(List<String> values) {
            addCriterion("COUNTYCHECKMESSAGE not in", values, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageBetween(String value1, String value2) {
            addCriterion("COUNTYCHECKMESSAGE between", value1, value2, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCountycheckmessageNotBetween(String value1, String value2) {
            addCriterion("COUNTYCHECKMESSAGE not between", value1, value2, "countycheckmessage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageIsNull() {
            addCriterion("CURRENTSTAGE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentstageIsNotNull() {
            addCriterion("CURRENTSTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentstageEqualTo(String value) {
            addCriterion("CURRENTSTAGE =", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageNotEqualTo(String value) {
            addCriterion("CURRENTSTAGE <>", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageGreaterThan(String value) {
            addCriterion("CURRENTSTAGE >", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTSTAGE >=", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageLessThan(String value) {
            addCriterion("CURRENTSTAGE <", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageLessThanOrEqualTo(String value) {
            addCriterion("CURRENTSTAGE <=", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageLike(String value) {
            addCriterion("CURRENTSTAGE like", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageNotLike(String value) {
            addCriterion("CURRENTSTAGE not like", value, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageIn(List<String> values) {
            addCriterion("CURRENTSTAGE in", values, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageNotIn(List<String> values) {
            addCriterion("CURRENTSTAGE not in", values, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageBetween(String value1, String value2) {
            addCriterion("CURRENTSTAGE between", value1, value2, "currentstage");
            return (Criteria) this;
        }

        public Criteria andCurrentstageNotBetween(String value1, String value2) {
            addCriterion("CURRENTSTAGE not between", value1, value2, "currentstage");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostIsNull() {
            addCriterion("FREESECURITYCOST is null");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostIsNotNull() {
            addCriterion("FREESECURITYCOST is not null");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostEqualTo(BigDecimal value) {
            addCriterion("FREESECURITYCOST =", value, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostNotEqualTo(BigDecimal value) {
            addCriterion("FREESECURITYCOST <>", value, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostGreaterThan(BigDecimal value) {
            addCriterion("FREESECURITYCOST >", value, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FREESECURITYCOST >=", value, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostLessThan(BigDecimal value) {
            addCriterion("FREESECURITYCOST <", value, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FREESECURITYCOST <=", value, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostIn(List<BigDecimal> values) {
            addCriterion("FREESECURITYCOST in", values, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostNotIn(List<BigDecimal> values) {
            addCriterion("FREESECURITYCOST not in", values, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREESECURITYCOST between", value1, value2, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andFreesecuritycostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FREESECURITYCOST not between", value1, value2, "freesecuritycost");
            return (Criteria) this;
        }

        public Criteria andOtheramountIsNull() {
            addCriterion("OTHERAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOtheramountIsNotNull() {
            addCriterion("OTHERAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOtheramountEqualTo(BigDecimal value) {
            addCriterion("OTHERAMOUNT =", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountNotEqualTo(BigDecimal value) {
            addCriterion("OTHERAMOUNT <>", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountGreaterThan(BigDecimal value) {
            addCriterion("OTHERAMOUNT >", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERAMOUNT >=", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountLessThan(BigDecimal value) {
            addCriterion("OTHERAMOUNT <", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHERAMOUNT <=", value, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountIn(List<BigDecimal> values) {
            addCriterion("OTHERAMOUNT in", values, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountNotIn(List<BigDecimal> values) {
            addCriterion("OTHERAMOUNT not in", values, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERAMOUNT between", value1, value2, "otheramount");
            return (Criteria) this;
        }

        public Criteria andOtheramountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHERAMOUNT not between", value1, value2, "otheramount");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidIsNull() {
            addCriterion("RELATIONAPPLYID is null");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidIsNotNull() {
            addCriterion("RELATIONAPPLYID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidEqualTo(String value) {
            addCriterion("RELATIONAPPLYID =", value, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidNotEqualTo(String value) {
            addCriterion("RELATIONAPPLYID <>", value, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidGreaterThan(String value) {
            addCriterion("RELATIONAPPLYID >", value, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("RELATIONAPPLYID >=", value, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidLessThan(String value) {
            addCriterion("RELATIONAPPLYID <", value, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidLessThanOrEqualTo(String value) {
            addCriterion("RELATIONAPPLYID <=", value, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidLike(String value) {
            addCriterion("RELATIONAPPLYID like", value, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidNotLike(String value) {
            addCriterion("RELATIONAPPLYID not like", value, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidIn(List<String> values) {
            addCriterion("RELATIONAPPLYID in", values, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidNotIn(List<String> values) {
            addCriterion("RELATIONAPPLYID not in", values, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidBetween(String value1, String value2) {
            addCriterion("RELATIONAPPLYID between", value1, value2, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andRelationapplyidNotBetween(String value1, String value2) {
            addCriterion("RELATIONAPPLYID not between", value1, value2, "relationapplyid");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageIsNull() {
            addCriterion("STREETCHECKMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageIsNotNull() {
            addCriterion("STREETCHECKMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageEqualTo(String value) {
            addCriterion("STREETCHECKMESSAGE =", value, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageNotEqualTo(String value) {
            addCriterion("STREETCHECKMESSAGE <>", value, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageGreaterThan(String value) {
            addCriterion("STREETCHECKMESSAGE >", value, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageGreaterThanOrEqualTo(String value) {
            addCriterion("STREETCHECKMESSAGE >=", value, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageLessThan(String value) {
            addCriterion("STREETCHECKMESSAGE <", value, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageLessThanOrEqualTo(String value) {
            addCriterion("STREETCHECKMESSAGE <=", value, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageLike(String value) {
            addCriterion("STREETCHECKMESSAGE like", value, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageNotLike(String value) {
            addCriterion("STREETCHECKMESSAGE not like", value, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageIn(List<String> values) {
            addCriterion("STREETCHECKMESSAGE in", values, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageNotIn(List<String> values) {
            addCriterion("STREETCHECKMESSAGE not in", values, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageBetween(String value1, String value2) {
            addCriterion("STREETCHECKMESSAGE between", value1, value2, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andStreetcheckmessageNotBetween(String value1, String value2) {
            addCriterion("STREETCHECKMESSAGE not between", value1, value2, "streetcheckmessage");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdIsNull() {
            addCriterion("APPLYATTACHMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdIsNotNull() {
            addCriterion("APPLYATTACHMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdEqualTo(String value) {
            addCriterion("APPLYATTACHMENT_ID =", value, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdNotEqualTo(String value) {
            addCriterion("APPLYATTACHMENT_ID <>", value, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdGreaterThan(String value) {
            addCriterion("APPLYATTACHMENT_ID >", value, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYATTACHMENT_ID >=", value, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdLessThan(String value) {
            addCriterion("APPLYATTACHMENT_ID <", value, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdLessThanOrEqualTo(String value) {
            addCriterion("APPLYATTACHMENT_ID <=", value, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdLike(String value) {
            addCriterion("APPLYATTACHMENT_ID like", value, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdNotLike(String value) {
            addCriterion("APPLYATTACHMENT_ID not like", value, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdIn(List<String> values) {
            addCriterion("APPLYATTACHMENT_ID in", values, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdNotIn(List<String> values) {
            addCriterion("APPLYATTACHMENT_ID not in", values, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdBetween(String value1, String value2) {
            addCriterion("APPLYATTACHMENT_ID between", value1, value2, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andApplyattachmentIdNotBetween(String value1, String value2) {
            addCriterion("APPLYATTACHMENT_ID not between", value1, value2, "applyattachmentId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdIsNull() {
            addCriterion("APPOINTPERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdIsNotNull() {
            addCriterion("APPOINTPERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdEqualTo(String value) {
            addCriterion("APPOINTPERSON_ID =", value, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdNotEqualTo(String value) {
            addCriterion("APPOINTPERSON_ID <>", value, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdGreaterThan(String value) {
            addCriterion("APPOINTPERSON_ID >", value, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTPERSON_ID >=", value, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdLessThan(String value) {
            addCriterion("APPOINTPERSON_ID <", value, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdLessThanOrEqualTo(String value) {
            addCriterion("APPOINTPERSON_ID <=", value, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdLike(String value) {
            addCriterion("APPOINTPERSON_ID like", value, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdNotLike(String value) {
            addCriterion("APPOINTPERSON_ID not like", value, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdIn(List<String> values) {
            addCriterion("APPOINTPERSON_ID in", values, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdNotIn(List<String> values) {
            addCriterion("APPOINTPERSON_ID not in", values, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdBetween(String value1, String value2) {
            addCriterion("APPOINTPERSON_ID between", value1, value2, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andAppointpersonIdNotBetween(String value1, String value2) {
            addCriterion("APPOINTPERSON_ID not between", value1, value2, "appointpersonId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdIsNull() {
            addCriterion("CHECKCOUNTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdIsNotNull() {
            addCriterion("CHECKCOUNTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdEqualTo(String value) {
            addCriterion("CHECKCOUNTY_ID =", value, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdNotEqualTo(String value) {
            addCriterion("CHECKCOUNTY_ID <>", value, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdGreaterThan(String value) {
            addCriterion("CHECKCOUNTY_ID >", value, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKCOUNTY_ID >=", value, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdLessThan(String value) {
            addCriterion("CHECKCOUNTY_ID <", value, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdLessThanOrEqualTo(String value) {
            addCriterion("CHECKCOUNTY_ID <=", value, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdLike(String value) {
            addCriterion("CHECKCOUNTY_ID like", value, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdNotLike(String value) {
            addCriterion("CHECKCOUNTY_ID not like", value, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdIn(List<String> values) {
            addCriterion("CHECKCOUNTY_ID in", values, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdNotIn(List<String> values) {
            addCriterion("CHECKCOUNTY_ID not in", values, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdBetween(String value1, String value2) {
            addCriterion("CHECKCOUNTY_ID between", value1, value2, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckcountyIdNotBetween(String value1, String value2) {
            addCriterion("CHECKCOUNTY_ID not between", value1, value2, "checkcountyId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdIsNull() {
            addCriterion("CHECKSTREET_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdIsNotNull() {
            addCriterion("CHECKSTREET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdEqualTo(String value) {
            addCriterion("CHECKSTREET_ID =", value, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdNotEqualTo(String value) {
            addCriterion("CHECKSTREET_ID <>", value, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdGreaterThan(String value) {
            addCriterion("CHECKSTREET_ID >", value, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTREET_ID >=", value, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdLessThan(String value) {
            addCriterion("CHECKSTREET_ID <", value, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTREET_ID <=", value, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdLike(String value) {
            addCriterion("CHECKSTREET_ID like", value, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdNotLike(String value) {
            addCriterion("CHECKSTREET_ID not like", value, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdIn(List<String> values) {
            addCriterion("CHECKSTREET_ID in", values, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdNotIn(List<String> values) {
            addCriterion("CHECKSTREET_ID not in", values, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdBetween(String value1, String value2) {
            addCriterion("CHECKSTREET_ID between", value1, value2, "checkstreetId");
            return (Criteria) this;
        }

        public Criteria andCheckstreetIdNotBetween(String value1, String value2) {
            addCriterion("CHECKSTREET_ID not between", value1, value2, "checkstreetId");
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

        public Criteria andReviewcreatebusiamountIsNull() {
            addCriterion("REVIEWCREATEBUSIAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountIsNotNull() {
            addCriterion("REVIEWCREATEBUSIAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountEqualTo(BigDecimal value) {
            addCriterion("REVIEWCREATEBUSIAMOUNT =", value, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountNotEqualTo(BigDecimal value) {
            addCriterion("REVIEWCREATEBUSIAMOUNT <>", value, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountGreaterThan(BigDecimal value) {
            addCriterion("REVIEWCREATEBUSIAMOUNT >", value, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWCREATEBUSIAMOUNT >=", value, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountLessThan(BigDecimal value) {
            addCriterion("REVIEWCREATEBUSIAMOUNT <", value, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWCREATEBUSIAMOUNT <=", value, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountIn(List<BigDecimal> values) {
            addCriterion("REVIEWCREATEBUSIAMOUNT in", values, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountNotIn(List<BigDecimal> values) {
            addCriterion("REVIEWCREATEBUSIAMOUNT not in", values, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWCREATEBUSIAMOUNT between", value1, value2, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewcreatebusiamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWCREATEBUSIAMOUNT not between", value1, value2, "reviewcreatebusiamount");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostIsNull() {
            addCriterion("REVIEWFREESECURITYCOST is null");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostIsNotNull() {
            addCriterion("REVIEWFREESECURITYCOST is not null");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostEqualTo(BigDecimal value) {
            addCriterion("REVIEWFREESECURITYCOST =", value, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostNotEqualTo(BigDecimal value) {
            addCriterion("REVIEWFREESECURITYCOST <>", value, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostGreaterThan(BigDecimal value) {
            addCriterion("REVIEWFREESECURITYCOST >", value, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWFREESECURITYCOST >=", value, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostLessThan(BigDecimal value) {
            addCriterion("REVIEWFREESECURITYCOST <", value, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWFREESECURITYCOST <=", value, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostIn(List<BigDecimal> values) {
            addCriterion("REVIEWFREESECURITYCOST in", values, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostNotIn(List<BigDecimal> values) {
            addCriterion("REVIEWFREESECURITYCOST not in", values, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWFREESECURITYCOST between", value1, value2, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewfreesecuritycostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWFREESECURITYCOST not between", value1, value2, "reviewfreesecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountIsNull() {
            addCriterion("REVIEWGROUPAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountIsNotNull() {
            addCriterion("REVIEWGROUPAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountEqualTo(BigDecimal value) {
            addCriterion("REVIEWGROUPAMOUNT =", value, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountNotEqualTo(BigDecimal value) {
            addCriterion("REVIEWGROUPAMOUNT <>", value, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountGreaterThan(BigDecimal value) {
            addCriterion("REVIEWGROUPAMOUNT >", value, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWGROUPAMOUNT >=", value, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountLessThan(BigDecimal value) {
            addCriterion("REVIEWGROUPAMOUNT <", value, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWGROUPAMOUNT <=", value, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountIn(List<BigDecimal> values) {
            addCriterion("REVIEWGROUPAMOUNT in", values, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountNotIn(List<BigDecimal> values) {
            addCriterion("REVIEWGROUPAMOUNT not in", values, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWGROUPAMOUNT between", value1, value2, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewgroupamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWGROUPAMOUNT not between", value1, value2, "reviewgroupamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountIsNull() {
            addCriterion("REVIEWMIRCOENTERPAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountIsNotNull() {
            addCriterion("REVIEWMIRCOENTERPAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountEqualTo(BigDecimal value) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT =", value, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountNotEqualTo(BigDecimal value) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT <>", value, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountGreaterThan(BigDecimal value) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT >", value, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT >=", value, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountLessThan(BigDecimal value) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT <", value, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT <=", value, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountIn(List<BigDecimal> values) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT in", values, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountNotIn(List<BigDecimal> values) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT not in", values, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT between", value1, value2, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewmircoenterpamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWMIRCOENTERPAMOUNT not between", value1, value2, "reviewmircoenterpamount");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostIsNull() {
            addCriterion("REVIEWSECURITYCOST is null");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostIsNotNull() {
            addCriterion("REVIEWSECURITYCOST is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostEqualTo(BigDecimal value) {
            addCriterion("REVIEWSECURITYCOST =", value, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostNotEqualTo(BigDecimal value) {
            addCriterion("REVIEWSECURITYCOST <>", value, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostGreaterThan(BigDecimal value) {
            addCriterion("REVIEWSECURITYCOST >", value, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWSECURITYCOST >=", value, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostLessThan(BigDecimal value) {
            addCriterion("REVIEWSECURITYCOST <", value, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REVIEWSECURITYCOST <=", value, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostIn(List<BigDecimal> values) {
            addCriterion("REVIEWSECURITYCOST in", values, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostNotIn(List<BigDecimal> values) {
            addCriterion("REVIEWSECURITYCOST not in", values, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWSECURITYCOST between", value1, value2, "reviewsecuritycost");
            return (Criteria) this;
        }

        public Criteria andReviewsecuritycostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REVIEWSECURITYCOST not between", value1, value2, "reviewsecuritycost");
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

        public Criteria andPolicyattentionstatusIsNull() {
            addCriterion("POLICYATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusIsNotNull() {
            addCriterion("POLICYATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusEqualTo(String value) {
            addCriterion("POLICYATTENTIONSTATUS =", value, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusNotEqualTo(String value) {
            addCriterion("POLICYATTENTIONSTATUS <>", value, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusGreaterThan(String value) {
            addCriterion("POLICYATTENTIONSTATUS >", value, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYATTENTIONSTATUS >=", value, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusLessThan(String value) {
            addCriterion("POLICYATTENTIONSTATUS <", value, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusLessThanOrEqualTo(String value) {
            addCriterion("POLICYATTENTIONSTATUS <=", value, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusLike(String value) {
            addCriterion("POLICYATTENTIONSTATUS like", value, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusNotLike(String value) {
            addCriterion("POLICYATTENTIONSTATUS not like", value, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusIn(List<String> values) {
            addCriterion("POLICYATTENTIONSTATUS in", values, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusNotIn(List<String> values) {
            addCriterion("POLICYATTENTIONSTATUS not in", values, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusBetween(String value1, String value2) {
            addCriterion("POLICYATTENTIONSTATUS between", value1, value2, "policyattentionstatus");
            return (Criteria) this;
        }

        public Criteria andPolicyattentionstatusNotBetween(String value1, String value2) {
            addCriterion("POLICYATTENTIONSTATUS not between", value1, value2, "policyattentionstatus");
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

        public Criteria andRecommendcodeIsNull() {
            addCriterion("RECOMMENDCODE is null");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeIsNotNull() {
            addCriterion("RECOMMENDCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeEqualTo(String value) {
            addCriterion("RECOMMENDCODE =", value, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeNotEqualTo(String value) {
            addCriterion("RECOMMENDCODE <>", value, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeGreaterThan(String value) {
            addCriterion("RECOMMENDCODE >", value, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMENDCODE >=", value, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeLessThan(String value) {
            addCriterion("RECOMMENDCODE <", value, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeLessThanOrEqualTo(String value) {
            addCriterion("RECOMMENDCODE <=", value, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeLike(String value) {
            addCriterion("RECOMMENDCODE like", value, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeNotLike(String value) {
            addCriterion("RECOMMENDCODE not like", value, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeIn(List<String> values) {
            addCriterion("RECOMMENDCODE in", values, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeNotIn(List<String> values) {
            addCriterion("RECOMMENDCODE not in", values, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeBetween(String value1, String value2) {
            addCriterion("RECOMMENDCODE between", value1, value2, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andRecommendcodeNotBetween(String value1, String value2) {
            addCriterion("RECOMMENDCODE not between", value1, value2, "recommendcode");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdIsNull() {
            addCriterion("EXCHANGEDATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdIsNotNull() {
            addCriterion("EXCHANGEDATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdEqualTo(String value) {
            addCriterion("EXCHANGEDATA_ID =", value, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdNotEqualTo(String value) {
            addCriterion("EXCHANGEDATA_ID <>", value, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdGreaterThan(String value) {
            addCriterion("EXCHANGEDATA_ID >", value, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGEDATA_ID >=", value, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdLessThan(String value) {
            addCriterion("EXCHANGEDATA_ID <", value, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGEDATA_ID <=", value, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdLike(String value) {
            addCriterion("EXCHANGEDATA_ID like", value, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdNotLike(String value) {
            addCriterion("EXCHANGEDATA_ID not like", value, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdIn(List<String> values) {
            addCriterion("EXCHANGEDATA_ID in", values, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdNotIn(List<String> values) {
            addCriterion("EXCHANGEDATA_ID not in", values, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdBetween(String value1, String value2) {
            addCriterion("EXCHANGEDATA_ID between", value1, value2, "exchangedataId");
            return (Criteria) this;
        }

        public Criteria andExchangedataIdNotBetween(String value1, String value2) {
            addCriterion("EXCHANGEDATA_ID not between", value1, value2, "exchangedataId");
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

        public Criteria andLoanprocessnameIsNull() {
            addCriterion("LOANPROCESSNAME is null");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameIsNotNull() {
            addCriterion("LOANPROCESSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameEqualTo(String value) {
            addCriterion("LOANPROCESSNAME =", value, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameNotEqualTo(String value) {
            addCriterion("LOANPROCESSNAME <>", value, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameGreaterThan(String value) {
            addCriterion("LOANPROCESSNAME >", value, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameGreaterThanOrEqualTo(String value) {
            addCriterion("LOANPROCESSNAME >=", value, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameLessThan(String value) {
            addCriterion("LOANPROCESSNAME <", value, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameLessThanOrEqualTo(String value) {
            addCriterion("LOANPROCESSNAME <=", value, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameLike(String value) {
            addCriterion("LOANPROCESSNAME like", value, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameNotLike(String value) {
            addCriterion("LOANPROCESSNAME not like", value, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameIn(List<String> values) {
            addCriterion("LOANPROCESSNAME in", values, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameNotIn(List<String> values) {
            addCriterion("LOANPROCESSNAME not in", values, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameBetween(String value1, String value2) {
            addCriterion("LOANPROCESSNAME between", value1, value2, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andLoanprocessnameNotBetween(String value1, String value2) {
            addCriterion("LOANPROCESSNAME not between", value1, value2, "loanprocessname");
            return (Criteria) this;
        }

        public Criteria andClientdocIdIsNull() {
            addCriterion("CLIENTDOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andClientdocIdIsNotNull() {
            addCriterion("CLIENTDOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClientdocIdEqualTo(String value) {
            addCriterion("CLIENTDOC_ID =", value, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdNotEqualTo(String value) {
            addCriterion("CLIENTDOC_ID <>", value, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdGreaterThan(String value) {
            addCriterion("CLIENTDOC_ID >", value, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTDOC_ID >=", value, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdLessThan(String value) {
            addCriterion("CLIENTDOC_ID <", value, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdLessThanOrEqualTo(String value) {
            addCriterion("CLIENTDOC_ID <=", value, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdLike(String value) {
            addCriterion("CLIENTDOC_ID like", value, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdNotLike(String value) {
            addCriterion("CLIENTDOC_ID not like", value, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdIn(List<String> values) {
            addCriterion("CLIENTDOC_ID in", values, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdNotIn(List<String> values) {
            addCriterion("CLIENTDOC_ID not in", values, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdBetween(String value1, String value2) {
            addCriterion("CLIENTDOC_ID between", value1, value2, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andClientdocIdNotBetween(String value1, String value2) {
            addCriterion("CLIENTDOC_ID not between", value1, value2, "clientdocId");
            return (Criteria) this;
        }

        public Criteria andApplycountIsNull() {
            addCriterion("APPLYCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andApplycountIsNotNull() {
            addCriterion("APPLYCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andApplycountEqualTo(Long value) {
            addCriterion("APPLYCOUNT =", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountNotEqualTo(Long value) {
            addCriterion("APPLYCOUNT <>", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountGreaterThan(Long value) {
            addCriterion("APPLYCOUNT >", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountGreaterThanOrEqualTo(Long value) {
            addCriterion("APPLYCOUNT >=", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountLessThan(Long value) {
            addCriterion("APPLYCOUNT <", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountLessThanOrEqualTo(Long value) {
            addCriterion("APPLYCOUNT <=", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountIn(List<Long> values) {
            addCriterion("APPLYCOUNT in", values, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountNotIn(List<Long> values) {
            addCriterion("APPLYCOUNT not in", values, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountBetween(Long value1, Long value2) {
            addCriterion("APPLYCOUNT between", value1, value2, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountNotBetween(Long value1, Long value2) {
            addCriterion("APPLYCOUNT not between", value1, value2, "applycount");
            return (Criteria) this;
        }

        public Criteria andSignmessageIsNull() {
            addCriterion("SIGNMESSAGE is null");
            return (Criteria) this;
        }

        public Criteria andSignmessageIsNotNull() {
            addCriterion("SIGNMESSAGE is not null");
            return (Criteria) this;
        }

        public Criteria andSignmessageEqualTo(String value) {
            addCriterion("SIGNMESSAGE =", value, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageNotEqualTo(String value) {
            addCriterion("SIGNMESSAGE <>", value, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageGreaterThan(String value) {
            addCriterion("SIGNMESSAGE >", value, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNMESSAGE >=", value, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageLessThan(String value) {
            addCriterion("SIGNMESSAGE <", value, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageLessThanOrEqualTo(String value) {
            addCriterion("SIGNMESSAGE <=", value, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageLike(String value) {
            addCriterion("SIGNMESSAGE like", value, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageNotLike(String value) {
            addCriterion("SIGNMESSAGE not like", value, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageIn(List<String> values) {
            addCriterion("SIGNMESSAGE in", values, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageNotIn(List<String> values) {
            addCriterion("SIGNMESSAGE not in", values, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageBetween(String value1, String value2) {
            addCriterion("SIGNMESSAGE between", value1, value2, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignmessageNotBetween(String value1, String value2) {
            addCriterion("SIGNMESSAGE not between", value1, value2, "signmessage");
            return (Criteria) this;
        }

        public Criteria andSignstatusIsNull() {
            addCriterion("SIGNSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSignstatusIsNotNull() {
            addCriterion("SIGNSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSignstatusEqualTo(String value) {
            addCriterion("SIGNSTATUS =", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotEqualTo(String value) {
            addCriterion("SIGNSTATUS <>", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusGreaterThan(String value) {
            addCriterion("SIGNSTATUS >", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNSTATUS >=", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusLessThan(String value) {
            addCriterion("SIGNSTATUS <", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusLessThanOrEqualTo(String value) {
            addCriterion("SIGNSTATUS <=", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusLike(String value) {
            addCriterion("SIGNSTATUS like", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotLike(String value) {
            addCriterion("SIGNSTATUS not like", value, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusIn(List<String> values) {
            addCriterion("SIGNSTATUS in", values, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotIn(List<String> values) {
            addCriterion("SIGNSTATUS not in", values, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusBetween(String value1, String value2) {
            addCriterion("SIGNSTATUS between", value1, value2, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignstatusNotBetween(String value1, String value2) {
            addCriterion("SIGNSTATUS not between", value1, value2, "signstatus");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdIsNull() {
            addCriterion("SIGNEDLETTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdIsNotNull() {
            addCriterion("SIGNEDLETTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdEqualTo(String value) {
            addCriterion("SIGNEDLETTER_ID =", value, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdNotEqualTo(String value) {
            addCriterion("SIGNEDLETTER_ID <>", value, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdGreaterThan(String value) {
            addCriterion("SIGNEDLETTER_ID >", value, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNEDLETTER_ID >=", value, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdLessThan(String value) {
            addCriterion("SIGNEDLETTER_ID <", value, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdLessThanOrEqualTo(String value) {
            addCriterion("SIGNEDLETTER_ID <=", value, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdLike(String value) {
            addCriterion("SIGNEDLETTER_ID like", value, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdNotLike(String value) {
            addCriterion("SIGNEDLETTER_ID not like", value, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdIn(List<String> values) {
            addCriterion("SIGNEDLETTER_ID in", values, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdNotIn(List<String> values) {
            addCriterion("SIGNEDLETTER_ID not in", values, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdBetween(String value1, String value2) {
            addCriterion("SIGNEDLETTER_ID between", value1, value2, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andSignedletterIdNotBetween(String value1, String value2) {
            addCriterion("SIGNEDLETTER_ID not between", value1, value2, "signedletterId");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkIsNull() {
            addCriterion("JYJCHECKREMARK is null");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkIsNotNull() {
            addCriterion("JYJCHECKREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkEqualTo(String value) {
            addCriterion("JYJCHECKREMARK =", value, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkNotEqualTo(String value) {
            addCriterion("JYJCHECKREMARK <>", value, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkGreaterThan(String value) {
            addCriterion("JYJCHECKREMARK >", value, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkGreaterThanOrEqualTo(String value) {
            addCriterion("JYJCHECKREMARK >=", value, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkLessThan(String value) {
            addCriterion("JYJCHECKREMARK <", value, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkLessThanOrEqualTo(String value) {
            addCriterion("JYJCHECKREMARK <=", value, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkLike(String value) {
            addCriterion("JYJCHECKREMARK like", value, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkNotLike(String value) {
            addCriterion("JYJCHECKREMARK not like", value, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkIn(List<String> values) {
            addCriterion("JYJCHECKREMARK in", values, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkNotIn(List<String> values) {
            addCriterion("JYJCHECKREMARK not in", values, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkBetween(String value1, String value2) {
            addCriterion("JYJCHECKREMARK between", value1, value2, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andJyjcheckremarkNotBetween(String value1, String value2) {
            addCriterion("JYJCHECKREMARK not between", value1, value2, "jyjcheckremark");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeIsNull() {
            addCriterion("CORPORATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeIsNotNull() {
            addCriterion("CORPORATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeEqualTo(String value) {
            addCriterion("CORPORATETYPE =", value, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeNotEqualTo(String value) {
            addCriterion("CORPORATETYPE <>", value, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeGreaterThan(String value) {
            addCriterion("CORPORATETYPE >", value, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeGreaterThanOrEqualTo(String value) {
            addCriterion("CORPORATETYPE >=", value, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeLessThan(String value) {
            addCriterion("CORPORATETYPE <", value, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeLessThanOrEqualTo(String value) {
            addCriterion("CORPORATETYPE <=", value, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeLike(String value) {
            addCriterion("CORPORATETYPE like", value, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeNotLike(String value) {
            addCriterion("CORPORATETYPE not like", value, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeIn(List<String> values) {
            addCriterion("CORPORATETYPE in", values, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeNotIn(List<String> values) {
            addCriterion("CORPORATETYPE not in", values, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeBetween(String value1, String value2) {
            addCriterion("CORPORATETYPE between", value1, value2, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andCorporatetypeNotBetween(String value1, String value2) {
            addCriterion("CORPORATETYPE not between", value1, value2, "corporatetype");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalIsNull() {
            addCriterion("ISALLOWAPPROVAL is null");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalIsNotNull() {
            addCriterion("ISALLOWAPPROVAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalEqualTo(String value) {
            addCriterion("ISALLOWAPPROVAL =", value, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalNotEqualTo(String value) {
            addCriterion("ISALLOWAPPROVAL <>", value, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalGreaterThan(String value) {
            addCriterion("ISALLOWAPPROVAL >", value, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalGreaterThanOrEqualTo(String value) {
            addCriterion("ISALLOWAPPROVAL >=", value, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalLessThan(String value) {
            addCriterion("ISALLOWAPPROVAL <", value, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalLessThanOrEqualTo(String value) {
            addCriterion("ISALLOWAPPROVAL <=", value, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalLike(String value) {
            addCriterion("ISALLOWAPPROVAL like", value, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalNotLike(String value) {
            addCriterion("ISALLOWAPPROVAL not like", value, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalIn(List<String> values) {
            addCriterion("ISALLOWAPPROVAL in", values, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalNotIn(List<String> values) {
            addCriterion("ISALLOWAPPROVAL not in", values, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalBetween(String value1, String value2) {
            addCriterion("ISALLOWAPPROVAL between", value1, value2, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andIsallowapprovalNotBetween(String value1, String value2) {
            addCriterion("ISALLOWAPPROVAL not between", value1, value2, "isallowapproval");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyIsNull() {
            addCriterion("MODIFYFREQUENCY is null");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyIsNotNull() {
            addCriterion("MODIFYFREQUENCY is not null");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyEqualTo(Long value) {
            addCriterion("MODIFYFREQUENCY =", value, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyNotEqualTo(Long value) {
            addCriterion("MODIFYFREQUENCY <>", value, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyGreaterThan(Long value) {
            addCriterion("MODIFYFREQUENCY >", value, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFYFREQUENCY >=", value, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyLessThan(Long value) {
            addCriterion("MODIFYFREQUENCY <", value, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyLessThanOrEqualTo(Long value) {
            addCriterion("MODIFYFREQUENCY <=", value, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyIn(List<Long> values) {
            addCriterion("MODIFYFREQUENCY in", values, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyNotIn(List<Long> values) {
            addCriterion("MODIFYFREQUENCY not in", values, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyBetween(Long value1, Long value2) {
            addCriterion("MODIFYFREQUENCY between", value1, value2, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andModifyfrequencyNotBetween(Long value1, Long value2) {
            addCriterion("MODIFYFREQUENCY not between", value1, value2, "modifyfrequency");
            return (Criteria) this;
        }

        public Criteria andViewtimeIsNull() {
            addCriterion("VIEWTIME is null");
            return (Criteria) this;
        }

        public Criteria andViewtimeIsNotNull() {
            addCriterion("VIEWTIME is not null");
            return (Criteria) this;
        }

        public Criteria andViewtimeEqualTo(BigDecimal value) {
            addCriterion("VIEWTIME =", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeNotEqualTo(BigDecimal value) {
            addCriterion("VIEWTIME <>", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeGreaterThan(BigDecimal value) {
            addCriterion("VIEWTIME >", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VIEWTIME >=", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeLessThan(BigDecimal value) {
            addCriterion("VIEWTIME <", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VIEWTIME <=", value, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeIn(List<BigDecimal> values) {
            addCriterion("VIEWTIME in", values, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeNotIn(List<BigDecimal> values) {
            addCriterion("VIEWTIME not in", values, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIEWTIME between", value1, value2, "viewtime");
            return (Criteria) this;
        }

        public Criteria andViewtimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIEWTIME not between", value1, value2, "viewtime");
            return (Criteria) this;
        }

        public Criteria andTendemoIsNull() {
            addCriterion("TENDEMO is null");
            return (Criteria) this;
        }

        public Criteria andTendemoIsNotNull() {
            addCriterion("TENDEMO is not null");
            return (Criteria) this;
        }

        public Criteria andTendemoEqualTo(String value) {
            addCriterion("TENDEMO =", value, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoNotEqualTo(String value) {
            addCriterion("TENDEMO <>", value, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoGreaterThan(String value) {
            addCriterion("TENDEMO >", value, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoGreaterThanOrEqualTo(String value) {
            addCriterion("TENDEMO >=", value, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoLessThan(String value) {
            addCriterion("TENDEMO <", value, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoLessThanOrEqualTo(String value) {
            addCriterion("TENDEMO <=", value, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoLike(String value) {
            addCriterion("TENDEMO like", value, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoNotLike(String value) {
            addCriterion("TENDEMO not like", value, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoIn(List<String> values) {
            addCriterion("TENDEMO in", values, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoNotIn(List<String> values) {
            addCriterion("TENDEMO not in", values, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoBetween(String value1, String value2) {
            addCriterion("TENDEMO between", value1, value2, "tendemo");
            return (Criteria) this;
        }

        public Criteria andTendemoNotBetween(String value1, String value2) {
            addCriterion("TENDEMO not between", value1, value2, "tendemo");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeIsNull() {
            addCriterion("EXCHANGECREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeIsNotNull() {
            addCriterion("EXCHANGECREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeEqualTo(String value) {
            addCriterion("EXCHANGECREATETIME =", value, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeNotEqualTo(String value) {
            addCriterion("EXCHANGECREATETIME <>", value, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeGreaterThan(String value) {
            addCriterion("EXCHANGECREATETIME >", value, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGECREATETIME >=", value, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeLessThan(String value) {
            addCriterion("EXCHANGECREATETIME <", value, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGECREATETIME <=", value, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeLike(String value) {
            addCriterion("EXCHANGECREATETIME like", value, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeNotLike(String value) {
            addCriterion("EXCHANGECREATETIME not like", value, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeIn(List<String> values) {
            addCriterion("EXCHANGECREATETIME in", values, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeNotIn(List<String> values) {
            addCriterion("EXCHANGECREATETIME not in", values, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeBetween(String value1, String value2) {
            addCriterion("EXCHANGECREATETIME between", value1, value2, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andExchangecreatetimeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGECREATETIME not between", value1, value2, "exchangecreatetime");
            return (Criteria) this;
        }

        public Criteria andFlaggsIsNull() {
            addCriterion("FLAGGS is null");
            return (Criteria) this;
        }

        public Criteria andFlaggsIsNotNull() {
            addCriterion("FLAGGS is not null");
            return (Criteria) this;
        }

        public Criteria andFlaggsEqualTo(String value) {
            addCriterion("FLAGGS =", value, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsNotEqualTo(String value) {
            addCriterion("FLAGGS <>", value, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsGreaterThan(String value) {
            addCriterion("FLAGGS >", value, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsGreaterThanOrEqualTo(String value) {
            addCriterion("FLAGGS >=", value, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsLessThan(String value) {
            addCriterion("FLAGGS <", value, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsLessThanOrEqualTo(String value) {
            addCriterion("FLAGGS <=", value, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsLike(String value) {
            addCriterion("FLAGGS like", value, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsNotLike(String value) {
            addCriterion("FLAGGS not like", value, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsIn(List<String> values) {
            addCriterion("FLAGGS in", values, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsNotIn(List<String> values) {
            addCriterion("FLAGGS not in", values, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsBetween(String value1, String value2) {
            addCriterion("FLAGGS between", value1, value2, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlaggsNotBetween(String value1, String value2) {
            addCriterion("FLAGGS not between", value1, value2, "flaggs");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialIsNull() {
            addCriterion("FLAGJUDICIAL is null");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialIsNotNull() {
            addCriterion("FLAGJUDICIAL is not null");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialEqualTo(String value) {
            addCriterion("FLAGJUDICIAL =", value, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialNotEqualTo(String value) {
            addCriterion("FLAGJUDICIAL <>", value, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialGreaterThan(String value) {
            addCriterion("FLAGJUDICIAL >", value, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialGreaterThanOrEqualTo(String value) {
            addCriterion("FLAGJUDICIAL >=", value, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialLessThan(String value) {
            addCriterion("FLAGJUDICIAL <", value, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialLessThanOrEqualTo(String value) {
            addCriterion("FLAGJUDICIAL <=", value, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialLike(String value) {
            addCriterion("FLAGJUDICIAL like", value, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialNotLike(String value) {
            addCriterion("FLAGJUDICIAL not like", value, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialIn(List<String> values) {
            addCriterion("FLAGJUDICIAL in", values, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialNotIn(List<String> values) {
            addCriterion("FLAGJUDICIAL not in", values, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialBetween(String value1, String value2) {
            addCriterion("FLAGJUDICIAL between", value1, value2, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andFlagjudicialNotBetween(String value1, String value2) {
            addCriterion("FLAGJUDICIAL not between", value1, value2, "flagjudicial");
            return (Criteria) this;
        }

        public Criteria andGsstageIsNull() {
            addCriterion("GSSTAGE is null");
            return (Criteria) this;
        }

        public Criteria andGsstageIsNotNull() {
            addCriterion("GSSTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andGsstageEqualTo(Long value) {
            addCriterion("GSSTAGE =", value, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageNotEqualTo(Long value) {
            addCriterion("GSSTAGE <>", value, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageGreaterThan(Long value) {
            addCriterion("GSSTAGE >", value, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageGreaterThanOrEqualTo(Long value) {
            addCriterion("GSSTAGE >=", value, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageLessThan(Long value) {
            addCriterion("GSSTAGE <", value, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageLessThanOrEqualTo(Long value) {
            addCriterion("GSSTAGE <=", value, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageIn(List<Long> values) {
            addCriterion("GSSTAGE in", values, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageNotIn(List<Long> values) {
            addCriterion("GSSTAGE not in", values, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageBetween(Long value1, Long value2) {
            addCriterion("GSSTAGE between", value1, value2, "gsstage");
            return (Criteria) this;
        }

        public Criteria andGsstageNotBetween(Long value1, Long value2) {
            addCriterion("GSSTAGE not between", value1, value2, "gsstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageIsNull() {
            addCriterion("JUDICIALSTAGE is null");
            return (Criteria) this;
        }

        public Criteria andJudicialstageIsNotNull() {
            addCriterion("JUDICIALSTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andJudicialstageEqualTo(Long value) {
            addCriterion("JUDICIALSTAGE =", value, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageNotEqualTo(Long value) {
            addCriterion("JUDICIALSTAGE <>", value, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageGreaterThan(Long value) {
            addCriterion("JUDICIALSTAGE >", value, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageGreaterThanOrEqualTo(Long value) {
            addCriterion("JUDICIALSTAGE >=", value, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageLessThan(Long value) {
            addCriterion("JUDICIALSTAGE <", value, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageLessThanOrEqualTo(Long value) {
            addCriterion("JUDICIALSTAGE <=", value, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageIn(List<Long> values) {
            addCriterion("JUDICIALSTAGE in", values, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageNotIn(List<Long> values) {
            addCriterion("JUDICIALSTAGE not in", values, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageBetween(Long value1, Long value2) {
            addCriterion("JUDICIALSTAGE between", value1, value2, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andJudicialstageNotBetween(Long value1, Long value2) {
            addCriterion("JUDICIALSTAGE not between", value1, value2, "judicialstage");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusIsNull() {
            addCriterion("GSATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusIsNotNull() {
            addCriterion("GSATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusEqualTo(String value) {
            addCriterion("GSATTENTIONSTATUS =", value, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusNotEqualTo(String value) {
            addCriterion("GSATTENTIONSTATUS <>", value, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusGreaterThan(String value) {
            addCriterion("GSATTENTIONSTATUS >", value, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("GSATTENTIONSTATUS >=", value, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusLessThan(String value) {
            addCriterion("GSATTENTIONSTATUS <", value, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusLessThanOrEqualTo(String value) {
            addCriterion("GSATTENTIONSTATUS <=", value, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusLike(String value) {
            addCriterion("GSATTENTIONSTATUS like", value, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusNotLike(String value) {
            addCriterion("GSATTENTIONSTATUS not like", value, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusIn(List<String> values) {
            addCriterion("GSATTENTIONSTATUS in", values, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusNotIn(List<String> values) {
            addCriterion("GSATTENTIONSTATUS not in", values, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusBetween(String value1, String value2) {
            addCriterion("GSATTENTIONSTATUS between", value1, value2, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andGsattentionstatusNotBetween(String value1, String value2) {
            addCriterion("GSATTENTIONSTATUS not between", value1, value2, "gsattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusIsNull() {
            addCriterion("SFATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusIsNotNull() {
            addCriterion("SFATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusEqualTo(String value) {
            addCriterion("SFATTENTIONSTATUS =", value, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusNotEqualTo(String value) {
            addCriterion("SFATTENTIONSTATUS <>", value, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusGreaterThan(String value) {
            addCriterion("SFATTENTIONSTATUS >", value, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SFATTENTIONSTATUS >=", value, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusLessThan(String value) {
            addCriterion("SFATTENTIONSTATUS <", value, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusLessThanOrEqualTo(String value) {
            addCriterion("SFATTENTIONSTATUS <=", value, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusLike(String value) {
            addCriterion("SFATTENTIONSTATUS like", value, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusNotLike(String value) {
            addCriterion("SFATTENTIONSTATUS not like", value, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusIn(List<String> values) {
            addCriterion("SFATTENTIONSTATUS in", values, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusNotIn(List<String> values) {
            addCriterion("SFATTENTIONSTATUS not in", values, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusBetween(String value1, String value2) {
            addCriterion("SFATTENTIONSTATUS between", value1, value2, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfattentionstatusNotBetween(String value1, String value2) {
            addCriterion("SFATTENTIONSTATUS not between", value1, value2, "sfattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonIsNull() {
            addCriterion("SFVERIFYRETURNREASON is null");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonIsNotNull() {
            addCriterion("SFVERIFYRETURNREASON is not null");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonEqualTo(String value) {
            addCriterion("SFVERIFYRETURNREASON =", value, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonNotEqualTo(String value) {
            addCriterion("SFVERIFYRETURNREASON <>", value, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonGreaterThan(String value) {
            addCriterion("SFVERIFYRETURNREASON >", value, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonGreaterThanOrEqualTo(String value) {
            addCriterion("SFVERIFYRETURNREASON >=", value, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonLessThan(String value) {
            addCriterion("SFVERIFYRETURNREASON <", value, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonLessThanOrEqualTo(String value) {
            addCriterion("SFVERIFYRETURNREASON <=", value, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonLike(String value) {
            addCriterion("SFVERIFYRETURNREASON like", value, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonNotLike(String value) {
            addCriterion("SFVERIFYRETURNREASON not like", value, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonIn(List<String> values) {
            addCriterion("SFVERIFYRETURNREASON in", values, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonNotIn(List<String> values) {
            addCriterion("SFVERIFYRETURNREASON not in", values, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonBetween(String value1, String value2) {
            addCriterion("SFVERIFYRETURNREASON between", value1, value2, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSfverifyreturnreasonNotBetween(String value1, String value2) {
            addCriterion("SFVERIFYRETURNREASON not between", value1, value2, "sfverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeIsNull() {
            addCriterion("BADCREDITGRADE is null");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeIsNotNull() {
            addCriterion("BADCREDITGRADE is not null");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeEqualTo(String value) {
            addCriterion("BADCREDITGRADE =", value, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeNotEqualTo(String value) {
            addCriterion("BADCREDITGRADE <>", value, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeGreaterThan(String value) {
            addCriterion("BADCREDITGRADE >", value, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeGreaterThanOrEqualTo(String value) {
            addCriterion("BADCREDITGRADE >=", value, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeLessThan(String value) {
            addCriterion("BADCREDITGRADE <", value, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeLessThanOrEqualTo(String value) {
            addCriterion("BADCREDITGRADE <=", value, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeLike(String value) {
            addCriterion("BADCREDITGRADE like", value, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeNotLike(String value) {
            addCriterion("BADCREDITGRADE not like", value, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeIn(List<String> values) {
            addCriterion("BADCREDITGRADE in", values, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeNotIn(List<String> values) {
            addCriterion("BADCREDITGRADE not in", values, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeBetween(String value1, String value2) {
            addCriterion("BADCREDITGRADE between", value1, value2, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andBadcreditgradeNotBetween(String value1, String value2) {
            addCriterion("BADCREDITGRADE not between", value1, value2, "badcreditgrade");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateIsNull() {
            addCriterion("FORMALLETTERDATE is null");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateIsNotNull() {
            addCriterion("FORMALLETTERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateEqualTo(Date value) {
            addCriterion("FORMALLETTERDATE =", value, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateNotEqualTo(Date value) {
            addCriterion("FORMALLETTERDATE <>", value, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateGreaterThan(Date value) {
            addCriterion("FORMALLETTERDATE >", value, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("FORMALLETTERDATE >=", value, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateLessThan(Date value) {
            addCriterion("FORMALLETTERDATE <", value, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateLessThanOrEqualTo(Date value) {
            addCriterion("FORMALLETTERDATE <=", value, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateIn(List<Date> values) {
            addCriterion("FORMALLETTERDATE in", values, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateNotIn(List<Date> values) {
            addCriterion("FORMALLETTERDATE not in", values, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateBetween(Date value1, Date value2) {
            addCriterion("FORMALLETTERDATE between", value1, value2, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andFormalletterdateNotBetween(Date value1, Date value2) {
            addCriterion("FORMALLETTERDATE not between", value1, value2, "formalletterdate");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterIsNull() {
            addCriterion("ISAUTOFORMALLETTER is null");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterIsNotNull() {
            addCriterion("ISAUTOFORMALLETTER is not null");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterEqualTo(Short value) {
            addCriterion("ISAUTOFORMALLETTER =", value, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterNotEqualTo(Short value) {
            addCriterion("ISAUTOFORMALLETTER <>", value, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterGreaterThan(Short value) {
            addCriterion("ISAUTOFORMALLETTER >", value, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterGreaterThanOrEqualTo(Short value) {
            addCriterion("ISAUTOFORMALLETTER >=", value, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterLessThan(Short value) {
            addCriterion("ISAUTOFORMALLETTER <", value, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterLessThanOrEqualTo(Short value) {
            addCriterion("ISAUTOFORMALLETTER <=", value, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterIn(List<Short> values) {
            addCriterion("ISAUTOFORMALLETTER in", values, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterNotIn(List<Short> values) {
            addCriterion("ISAUTOFORMALLETTER not in", values, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterBetween(Short value1, Short value2) {
            addCriterion("ISAUTOFORMALLETTER between", value1, value2, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andIsautoformalletterNotBetween(Short value1, Short value2) {
            addCriterion("ISAUTOFORMALLETTER not between", value1, value2, "isautoformalletter");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdIsNull() {
            addCriterion("CONFIRMLETTERPERSON_ID is null");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdIsNotNull() {
            addCriterion("CONFIRMLETTERPERSON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdEqualTo(String value) {
            addCriterion("CONFIRMLETTERPERSON_ID =", value, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdNotEqualTo(String value) {
            addCriterion("CONFIRMLETTERPERSON_ID <>", value, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdGreaterThan(String value) {
            addCriterion("CONFIRMLETTERPERSON_ID >", value, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRMLETTERPERSON_ID >=", value, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdLessThan(String value) {
            addCriterion("CONFIRMLETTERPERSON_ID <", value, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdLessThanOrEqualTo(String value) {
            addCriterion("CONFIRMLETTERPERSON_ID <=", value, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdLike(String value) {
            addCriterion("CONFIRMLETTERPERSON_ID like", value, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdNotLike(String value) {
            addCriterion("CONFIRMLETTERPERSON_ID not like", value, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdIn(List<String> values) {
            addCriterion("CONFIRMLETTERPERSON_ID in", values, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdNotIn(List<String> values) {
            addCriterion("CONFIRMLETTERPERSON_ID not in", values, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdBetween(String value1, String value2) {
            addCriterion("CONFIRMLETTERPERSON_ID between", value1, value2, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andConfirmletterpersonIdNotBetween(String value1, String value2) {
            addCriterion("CONFIRMLETTERPERSON_ID not between", value1, value2, "confirmletterpersonId");
            return (Criteria) this;
        }

        public Criteria andPartnernoIsNull() {
            addCriterion("PARTNERNO is null");
            return (Criteria) this;
        }

        public Criteria andPartnernoIsNotNull() {
            addCriterion("PARTNERNO is not null");
            return (Criteria) this;
        }

        public Criteria andPartnernoEqualTo(String value) {
            addCriterion("PARTNERNO =", value, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoNotEqualTo(String value) {
            addCriterion("PARTNERNO <>", value, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoGreaterThan(String value) {
            addCriterion("PARTNERNO >", value, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoGreaterThanOrEqualTo(String value) {
            addCriterion("PARTNERNO >=", value, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoLessThan(String value) {
            addCriterion("PARTNERNO <", value, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoLessThanOrEqualTo(String value) {
            addCriterion("PARTNERNO <=", value, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoLike(String value) {
            addCriterion("PARTNERNO like", value, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoNotLike(String value) {
            addCriterion("PARTNERNO not like", value, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoIn(List<String> values) {
            addCriterion("PARTNERNO in", values, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoNotIn(List<String> values) {
            addCriterion("PARTNERNO not in", values, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoBetween(String value1, String value2) {
            addCriterion("PARTNERNO between", value1, value2, "partnerno");
            return (Criteria) this;
        }

        public Criteria andPartnernoNotBetween(String value1, String value2) {
            addCriterion("PARTNERNO not between", value1, value2, "partnerno");
            return (Criteria) this;
        }

        public Criteria andBusinesskindIsNull() {
            addCriterion("BUSINESSKIND is null");
            return (Criteria) this;
        }

        public Criteria andBusinesskindIsNotNull() {
            addCriterion("BUSINESSKIND is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesskindEqualTo(String value) {
            addCriterion("BUSINESSKIND =", value, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindNotEqualTo(String value) {
            addCriterion("BUSINESSKIND <>", value, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindGreaterThan(String value) {
            addCriterion("BUSINESSKIND >", value, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSKIND >=", value, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindLessThan(String value) {
            addCriterion("BUSINESSKIND <", value, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSKIND <=", value, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindLike(String value) {
            addCriterion("BUSINESSKIND like", value, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindNotLike(String value) {
            addCriterion("BUSINESSKIND not like", value, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindIn(List<String> values) {
            addCriterion("BUSINESSKIND in", values, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindNotIn(List<String> values) {
            addCriterion("BUSINESSKIND not in", values, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindBetween(String value1, String value2) {
            addCriterion("BUSINESSKIND between", value1, value2, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBusinesskindNotBetween(String value1, String value2) {
            addCriterion("BUSINESSKIND not between", value1, value2, "businesskind");
            return (Criteria) this;
        }

        public Criteria andBigdatastageIsNull() {
            addCriterion("BIGDATASTAGE is null");
            return (Criteria) this;
        }

        public Criteria andBigdatastageIsNotNull() {
            addCriterion("BIGDATASTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andBigdatastageEqualTo(Long value) {
            addCriterion("BIGDATASTAGE =", value, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageNotEqualTo(Long value) {
            addCriterion("BIGDATASTAGE <>", value, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageGreaterThan(Long value) {
            addCriterion("BIGDATASTAGE >", value, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageGreaterThanOrEqualTo(Long value) {
            addCriterion("BIGDATASTAGE >=", value, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageLessThan(Long value) {
            addCriterion("BIGDATASTAGE <", value, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageLessThanOrEqualTo(Long value) {
            addCriterion("BIGDATASTAGE <=", value, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageIn(List<Long> values) {
            addCriterion("BIGDATASTAGE in", values, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageNotIn(List<Long> values) {
            addCriterion("BIGDATASTAGE not in", values, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageBetween(Long value1, Long value2) {
            addCriterion("BIGDATASTAGE between", value1, value2, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andBigdatastageNotBetween(Long value1, Long value2) {
            addCriterion("BIGDATASTAGE not between", value1, value2, "bigdatastage");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataIsNull() {
            addCriterion("FLAGBIGDATA is null");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataIsNotNull() {
            addCriterion("FLAGBIGDATA is not null");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataEqualTo(String value) {
            addCriterion("FLAGBIGDATA =", value, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataNotEqualTo(String value) {
            addCriterion("FLAGBIGDATA <>", value, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataGreaterThan(String value) {
            addCriterion("FLAGBIGDATA >", value, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataGreaterThanOrEqualTo(String value) {
            addCriterion("FLAGBIGDATA >=", value, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataLessThan(String value) {
            addCriterion("FLAGBIGDATA <", value, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataLessThanOrEqualTo(String value) {
            addCriterion("FLAGBIGDATA <=", value, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataLike(String value) {
            addCriterion("FLAGBIGDATA like", value, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataNotLike(String value) {
            addCriterion("FLAGBIGDATA not like", value, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataIn(List<String> values) {
            addCriterion("FLAGBIGDATA in", values, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataNotIn(List<String> values) {
            addCriterion("FLAGBIGDATA not in", values, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataBetween(String value1, String value2) {
            addCriterion("FLAGBIGDATA between", value1, value2, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andFlagbigdataNotBetween(String value1, String value2) {
            addCriterion("FLAGBIGDATA not between", value1, value2, "flagbigdata");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusIsNull() {
            addCriterion("BIGDATAATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusIsNotNull() {
            addCriterion("BIGDATAATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusEqualTo(String value) {
            addCriterion("BIGDATAATTENTIONSTATUS =", value, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusNotEqualTo(String value) {
            addCriterion("BIGDATAATTENTIONSTATUS <>", value, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusGreaterThan(String value) {
            addCriterion("BIGDATAATTENTIONSTATUS >", value, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("BIGDATAATTENTIONSTATUS >=", value, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusLessThan(String value) {
            addCriterion("BIGDATAATTENTIONSTATUS <", value, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusLessThanOrEqualTo(String value) {
            addCriterion("BIGDATAATTENTIONSTATUS <=", value, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusLike(String value) {
            addCriterion("BIGDATAATTENTIONSTATUS like", value, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusNotLike(String value) {
            addCriterion("BIGDATAATTENTIONSTATUS not like", value, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusIn(List<String> values) {
            addCriterion("BIGDATAATTENTIONSTATUS in", values, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusNotIn(List<String> values) {
            addCriterion("BIGDATAATTENTIONSTATUS not in", values, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusBetween(String value1, String value2) {
            addCriterion("BIGDATAATTENTIONSTATUS between", value1, value2, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataattentionstatusNotBetween(String value1, String value2) {
            addCriterion("BIGDATAATTENTIONSTATUS not between", value1, value2, "bigdataattentionstatus");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonIsNull() {
            addCriterion("BIGDATAVERIFYRETURNREASON is null");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonIsNotNull() {
            addCriterion("BIGDATAVERIFYRETURNREASON is not null");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonEqualTo(String value) {
            addCriterion("BIGDATAVERIFYRETURNREASON =", value, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonNotEqualTo(String value) {
            addCriterion("BIGDATAVERIFYRETURNREASON <>", value, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonGreaterThan(String value) {
            addCriterion("BIGDATAVERIFYRETURNREASON >", value, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonGreaterThanOrEqualTo(String value) {
            addCriterion("BIGDATAVERIFYRETURNREASON >=", value, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonLessThan(String value) {
            addCriterion("BIGDATAVERIFYRETURNREASON <", value, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonLessThanOrEqualTo(String value) {
            addCriterion("BIGDATAVERIFYRETURNREASON <=", value, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonLike(String value) {
            addCriterion("BIGDATAVERIFYRETURNREASON like", value, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonNotLike(String value) {
            addCriterion("BIGDATAVERIFYRETURNREASON not like", value, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonIn(List<String> values) {
            addCriterion("BIGDATAVERIFYRETURNREASON in", values, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonNotIn(List<String> values) {
            addCriterion("BIGDATAVERIFYRETURNREASON not in", values, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonBetween(String value1, String value2) {
            addCriterion("BIGDATAVERIFYRETURNREASON between", value1, value2, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andBigdataverifyreturnreasonNotBetween(String value1, String value2) {
            addCriterion("BIGDATAVERIFYRETURNREASON not between", value1, value2, "bigdataverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andCredityearIsNull() {
            addCriterion("CREDITYEAR is null");
            return (Criteria) this;
        }

        public Criteria andCredityearIsNotNull() {
            addCriterion("CREDITYEAR is not null");
            return (Criteria) this;
        }

        public Criteria andCredityearEqualTo(Long value) {
            addCriterion("CREDITYEAR =", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearNotEqualTo(Long value) {
            addCriterion("CREDITYEAR <>", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearGreaterThan(Long value) {
            addCriterion("CREDITYEAR >", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearGreaterThanOrEqualTo(Long value) {
            addCriterion("CREDITYEAR >=", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearLessThan(Long value) {
            addCriterion("CREDITYEAR <", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearLessThanOrEqualTo(Long value) {
            addCriterion("CREDITYEAR <=", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearIn(List<Long> values) {
            addCriterion("CREDITYEAR in", values, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearNotIn(List<Long> values) {
            addCriterion("CREDITYEAR not in", values, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearBetween(Long value1, Long value2) {
            addCriterion("CREDITYEAR between", value1, value2, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearNotBetween(Long value1, Long value2) {
            addCriterion("CREDITYEAR not between", value1, value2, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearunitIsNull() {
            addCriterion("CREDITYEARUNIT is null");
            return (Criteria) this;
        }

        public Criteria andCredityearunitIsNotNull() {
            addCriterion("CREDITYEARUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCredityearunitEqualTo(String value) {
            addCriterion("CREDITYEARUNIT =", value, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitNotEqualTo(String value) {
            addCriterion("CREDITYEARUNIT <>", value, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitGreaterThan(String value) {
            addCriterion("CREDITYEARUNIT >", value, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITYEARUNIT >=", value, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitLessThan(String value) {
            addCriterion("CREDITYEARUNIT <", value, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitLessThanOrEqualTo(String value) {
            addCriterion("CREDITYEARUNIT <=", value, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitLike(String value) {
            addCriterion("CREDITYEARUNIT like", value, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitNotLike(String value) {
            addCriterion("CREDITYEARUNIT not like", value, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitIn(List<String> values) {
            addCriterion("CREDITYEARUNIT in", values, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitNotIn(List<String> values) {
            addCriterion("CREDITYEARUNIT not in", values, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitBetween(String value1, String value2) {
            addCriterion("CREDITYEARUNIT between", value1, value2, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andCredityearunitNotBetween(String value1, String value2) {
            addCriterion("CREDITYEARUNIT not between", value1, value2, "credityearunit");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceIsNull() {
            addCriterion("FLAGSOCIALINSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceIsNotNull() {
            addCriterion("FLAGSOCIALINSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceEqualTo(String value) {
            addCriterion("FLAGSOCIALINSURANCE =", value, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceNotEqualTo(String value) {
            addCriterion("FLAGSOCIALINSURANCE <>", value, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceGreaterThan(String value) {
            addCriterion("FLAGSOCIALINSURANCE >", value, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("FLAGSOCIALINSURANCE >=", value, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceLessThan(String value) {
            addCriterion("FLAGSOCIALINSURANCE <", value, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceLessThanOrEqualTo(String value) {
            addCriterion("FLAGSOCIALINSURANCE <=", value, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceLike(String value) {
            addCriterion("FLAGSOCIALINSURANCE like", value, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceNotLike(String value) {
            addCriterion("FLAGSOCIALINSURANCE not like", value, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceIn(List<String> values) {
            addCriterion("FLAGSOCIALINSURANCE in", values, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceNotIn(List<String> values) {
            addCriterion("FLAGSOCIALINSURANCE not in", values, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceBetween(String value1, String value2) {
            addCriterion("FLAGSOCIALINSURANCE between", value1, value2, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andFlagsocialinsuranceNotBetween(String value1, String value2) {
            addCriterion("FLAGSOCIALINSURANCE not between", value1, value2, "flagsocialinsurance");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdIsNull() {
            addCriterion("SOCIALINSURANCEEXCEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdIsNotNull() {
            addCriterion("SOCIALINSURANCEEXCEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdEqualTo(String value) {
            addCriterion("SOCIALINSURANCEEXCEL_ID =", value, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdNotEqualTo(String value) {
            addCriterion("SOCIALINSURANCEEXCEL_ID <>", value, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdGreaterThan(String value) {
            addCriterion("SOCIALINSURANCEEXCEL_ID >", value, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIALINSURANCEEXCEL_ID >=", value, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdLessThan(String value) {
            addCriterion("SOCIALINSURANCEEXCEL_ID <", value, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdLessThanOrEqualTo(String value) {
            addCriterion("SOCIALINSURANCEEXCEL_ID <=", value, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdLike(String value) {
            addCriterion("SOCIALINSURANCEEXCEL_ID like", value, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdNotLike(String value) {
            addCriterion("SOCIALINSURANCEEXCEL_ID not like", value, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdIn(List<String> values) {
            addCriterion("SOCIALINSURANCEEXCEL_ID in", values, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdNotIn(List<String> values) {
            addCriterion("SOCIALINSURANCEEXCEL_ID not in", values, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdBetween(String value1, String value2) {
            addCriterion("SOCIALINSURANCEEXCEL_ID between", value1, value2, "socialinsuranceexcelId");
            return (Criteria) this;
        }

        public Criteria andSocialinsuranceexcelIdNotBetween(String value1, String value2) {
            addCriterion("SOCIALINSURANCEEXCEL_ID not between", value1, value2, "socialinsuranceexcelId");
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

        public Criteria andSiattentionstatusIsNull() {
            addCriterion("SIATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusIsNotNull() {
            addCriterion("SIATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusEqualTo(String value) {
            addCriterion("SIATTENTIONSTATUS =", value, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusNotEqualTo(String value) {
            addCriterion("SIATTENTIONSTATUS <>", value, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusGreaterThan(String value) {
            addCriterion("SIATTENTIONSTATUS >", value, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SIATTENTIONSTATUS >=", value, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusLessThan(String value) {
            addCriterion("SIATTENTIONSTATUS <", value, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusLessThanOrEqualTo(String value) {
            addCriterion("SIATTENTIONSTATUS <=", value, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusLike(String value) {
            addCriterion("SIATTENTIONSTATUS like", value, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusNotLike(String value) {
            addCriterion("SIATTENTIONSTATUS not like", value, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusIn(List<String> values) {
            addCriterion("SIATTENTIONSTATUS in", values, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusNotIn(List<String> values) {
            addCriterion("SIATTENTIONSTATUS not in", values, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusBetween(String value1, String value2) {
            addCriterion("SIATTENTIONSTATUS between", value1, value2, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiattentionstatusNotBetween(String value1, String value2) {
            addCriterion("SIATTENTIONSTATUS not between", value1, value2, "siattentionstatus");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonIsNull() {
            addCriterion("SIVERIFYRETURNREASON is null");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonIsNotNull() {
            addCriterion("SIVERIFYRETURNREASON is not null");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonEqualTo(String value) {
            addCriterion("SIVERIFYRETURNREASON =", value, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonNotEqualTo(String value) {
            addCriterion("SIVERIFYRETURNREASON <>", value, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonGreaterThan(String value) {
            addCriterion("SIVERIFYRETURNREASON >", value, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonGreaterThanOrEqualTo(String value) {
            addCriterion("SIVERIFYRETURNREASON >=", value, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonLessThan(String value) {
            addCriterion("SIVERIFYRETURNREASON <", value, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonLessThanOrEqualTo(String value) {
            addCriterion("SIVERIFYRETURNREASON <=", value, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonLike(String value) {
            addCriterion("SIVERIFYRETURNREASON like", value, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonNotLike(String value) {
            addCriterion("SIVERIFYRETURNREASON not like", value, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonIn(List<String> values) {
            addCriterion("SIVERIFYRETURNREASON in", values, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonNotIn(List<String> values) {
            addCriterion("SIVERIFYRETURNREASON not in", values, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonBetween(String value1, String value2) {
            addCriterion("SIVERIFYRETURNREASON between", value1, value2, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andSiverifyreturnreasonNotBetween(String value1, String value2) {
            addCriterion("SIVERIFYRETURNREASON not between", value1, value2, "siverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andFlaghdIsNull() {
            addCriterion("FLAGHD is null");
            return (Criteria) this;
        }

        public Criteria andFlaghdIsNotNull() {
            addCriterion("FLAGHD is not null");
            return (Criteria) this;
        }

        public Criteria andFlaghdEqualTo(String value) {
            addCriterion("FLAGHD =", value, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdNotEqualTo(String value) {
            addCriterion("FLAGHD <>", value, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdGreaterThan(String value) {
            addCriterion("FLAGHD >", value, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdGreaterThanOrEqualTo(String value) {
            addCriterion("FLAGHD >=", value, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdLessThan(String value) {
            addCriterion("FLAGHD <", value, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdLessThanOrEqualTo(String value) {
            addCriterion("FLAGHD <=", value, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdLike(String value) {
            addCriterion("FLAGHD like", value, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdNotLike(String value) {
            addCriterion("FLAGHD not like", value, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdIn(List<String> values) {
            addCriterion("FLAGHD in", values, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdNotIn(List<String> values) {
            addCriterion("FLAGHD not in", values, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdBetween(String value1, String value2) {
            addCriterion("FLAGHD between", value1, value2, "flaghd");
            return (Criteria) this;
        }

        public Criteria andFlaghdNotBetween(String value1, String value2) {
            addCriterion("FLAGHD not between", value1, value2, "flaghd");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusIsNull() {
            addCriterion("HDATTENTIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusIsNotNull() {
            addCriterion("HDATTENTIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusEqualTo(String value) {
            addCriterion("HDATTENTIONSTATUS =", value, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusNotEqualTo(String value) {
            addCriterion("HDATTENTIONSTATUS <>", value, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusGreaterThan(String value) {
            addCriterion("HDATTENTIONSTATUS >", value, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusGreaterThanOrEqualTo(String value) {
            addCriterion("HDATTENTIONSTATUS >=", value, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusLessThan(String value) {
            addCriterion("HDATTENTIONSTATUS <", value, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusLessThanOrEqualTo(String value) {
            addCriterion("HDATTENTIONSTATUS <=", value, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusLike(String value) {
            addCriterion("HDATTENTIONSTATUS like", value, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusNotLike(String value) {
            addCriterion("HDATTENTIONSTATUS not like", value, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusIn(List<String> values) {
            addCriterion("HDATTENTIONSTATUS in", values, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusNotIn(List<String> values) {
            addCriterion("HDATTENTIONSTATUS not in", values, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusBetween(String value1, String value2) {
            addCriterion("HDATTENTIONSTATUS between", value1, value2, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdattentionstatusNotBetween(String value1, String value2) {
            addCriterion("HDATTENTIONSTATUS not between", value1, value2, "hdattentionstatus");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonIsNull() {
            addCriterion("HDVERIFYRETURNREASON is null");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonIsNotNull() {
            addCriterion("HDVERIFYRETURNREASON is not null");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonEqualTo(String value) {
            addCriterion("HDVERIFYRETURNREASON =", value, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonNotEqualTo(String value) {
            addCriterion("HDVERIFYRETURNREASON <>", value, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonGreaterThan(String value) {
            addCriterion("HDVERIFYRETURNREASON >", value, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonGreaterThanOrEqualTo(String value) {
            addCriterion("HDVERIFYRETURNREASON >=", value, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonLessThan(String value) {
            addCriterion("HDVERIFYRETURNREASON <", value, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonLessThanOrEqualTo(String value) {
            addCriterion("HDVERIFYRETURNREASON <=", value, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonLike(String value) {
            addCriterion("HDVERIFYRETURNREASON like", value, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonNotLike(String value) {
            addCriterion("HDVERIFYRETURNREASON not like", value, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonIn(List<String> values) {
            addCriterion("HDVERIFYRETURNREASON in", values, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonNotIn(List<String> values) {
            addCriterion("HDVERIFYRETURNREASON not in", values, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonBetween(String value1, String value2) {
            addCriterion("HDVERIFYRETURNREASON between", value1, value2, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andHdverifyreturnreasonNotBetween(String value1, String value2) {
            addCriterion("HDVERIFYRETURNREASON not between", value1, value2, "hdverifyreturnreason");
            return (Criteria) this;
        }

        public Criteria andIstestdataIsNull() {
            addCriterion("ISTESTDATA is null");
            return (Criteria) this;
        }

        public Criteria andIstestdataIsNotNull() {
            addCriterion("ISTESTDATA is not null");
            return (Criteria) this;
        }

        public Criteria andIstestdataEqualTo(Short value) {
            addCriterion("ISTESTDATA =", value, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataNotEqualTo(Short value) {
            addCriterion("ISTESTDATA <>", value, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataGreaterThan(Short value) {
            addCriterion("ISTESTDATA >", value, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataGreaterThanOrEqualTo(Short value) {
            addCriterion("ISTESTDATA >=", value, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataLessThan(Short value) {
            addCriterion("ISTESTDATA <", value, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataLessThanOrEqualTo(Short value) {
            addCriterion("ISTESTDATA <=", value, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataIn(List<Short> values) {
            addCriterion("ISTESTDATA in", values, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataNotIn(List<Short> values) {
            addCriterion("ISTESTDATA not in", values, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataBetween(Short value1, Short value2) {
            addCriterion("ISTESTDATA between", value1, value2, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIstestdataNotBetween(Short value1, Short value2) {
            addCriterion("ISTESTDATA not between", value1, value2, "istestdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataIsNull() {
            addCriterion("ISREADAPPDATA is null");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataIsNotNull() {
            addCriterion("ISREADAPPDATA is not null");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataEqualTo(Long value) {
            addCriterion("ISREADAPPDATA =", value, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataNotEqualTo(Long value) {
            addCriterion("ISREADAPPDATA <>", value, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataGreaterThan(Long value) {
            addCriterion("ISREADAPPDATA >", value, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataGreaterThanOrEqualTo(Long value) {
            addCriterion("ISREADAPPDATA >=", value, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataLessThan(Long value) {
            addCriterion("ISREADAPPDATA <", value, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataLessThanOrEqualTo(Long value) {
            addCriterion("ISREADAPPDATA <=", value, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataIn(List<Long> values) {
            addCriterion("ISREADAPPDATA in", values, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataNotIn(List<Long> values) {
            addCriterion("ISREADAPPDATA not in", values, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataBetween(Long value1, Long value2) {
            addCriterion("ISREADAPPDATA between", value1, value2, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andIsreadappdataNotBetween(Long value1, Long value2) {
            addCriterion("ISREADAPPDATA not between", value1, value2, "isreadappdata");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNull() {
            addCriterion("SOURCETYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("SOURCETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(String value) {
            addCriterion("SOURCETYPE =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(String value) {
            addCriterion("SOURCETYPE <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(String value) {
            addCriterion("SOURCETYPE >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCETYPE >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(String value) {
            addCriterion("SOURCETYPE <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCETYPE <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLike(String value) {
            addCriterion("SOURCETYPE like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotLike(String value) {
            addCriterion("SOURCETYPE not like", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<String> values) {
            addCriterion("SOURCETYPE in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<String> values) {
            addCriterion("SOURCETYPE not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(String value1, String value2) {
            addCriterion("SOURCETYPE between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(String value1, String value2) {
            addCriterion("SOURCETYPE not between", value1, value2, "sourcetype");
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

        public Criteria andSendbankflagIsNull() {
            addCriterion("SENDBANKFLAG is null");
            return (Criteria) this;
        }

        public Criteria andSendbankflagIsNotNull() {
            addCriterion("SENDBANKFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSendbankflagEqualTo(Long value) {
            addCriterion("SENDBANKFLAG =", value, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagNotEqualTo(Long value) {
            addCriterion("SENDBANKFLAG <>", value, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagGreaterThan(Long value) {
            addCriterion("SENDBANKFLAG >", value, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagGreaterThanOrEqualTo(Long value) {
            addCriterion("SENDBANKFLAG >=", value, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagLessThan(Long value) {
            addCriterion("SENDBANKFLAG <", value, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagLessThanOrEqualTo(Long value) {
            addCriterion("SENDBANKFLAG <=", value, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagIn(List<Long> values) {
            addCriterion("SENDBANKFLAG in", values, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagNotIn(List<Long> values) {
            addCriterion("SENDBANKFLAG not in", values, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagBetween(Long value1, Long value2) {
            addCriterion("SENDBANKFLAG between", value1, value2, "sendbankflag");
            return (Criteria) this;
        }

        public Criteria andSendbankflagNotBetween(Long value1, Long value2) {
            addCriterion("SENDBANKFLAG not between", value1, value2, "sendbankflag");
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