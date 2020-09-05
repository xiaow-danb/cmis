package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmpersonalExtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmpersonalExtExample() {
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

        public Criteria andAdultchildrennmbIsNull() {
            addCriterion("ADULTCHILDRENNMB is null");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbIsNotNull() {
            addCriterion("ADULTCHILDRENNMB is not null");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbEqualTo(Long value) {
            addCriterion("ADULTCHILDRENNMB =", value, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbNotEqualTo(Long value) {
            addCriterion("ADULTCHILDRENNMB <>", value, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbGreaterThan(Long value) {
            addCriterion("ADULTCHILDRENNMB >", value, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbGreaterThanOrEqualTo(Long value) {
            addCriterion("ADULTCHILDRENNMB >=", value, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbLessThan(Long value) {
            addCriterion("ADULTCHILDRENNMB <", value, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbLessThanOrEqualTo(Long value) {
            addCriterion("ADULTCHILDRENNMB <=", value, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbIn(List<Long> values) {
            addCriterion("ADULTCHILDRENNMB in", values, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbNotIn(List<Long> values) {
            addCriterion("ADULTCHILDRENNMB not in", values, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbBetween(Long value1, Long value2) {
            addCriterion("ADULTCHILDRENNMB between", value1, value2, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andAdultchildrennmbNotBetween(Long value1, Long value2) {
            addCriterion("ADULTCHILDRENNMB not between", value1, value2, "adultchildrennmb");
            return (Criteria) this;
        }

        public Criteria andCitizentypeIsNull() {
            addCriterion("CITIZENTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCitizentypeIsNotNull() {
            addCriterion("CITIZENTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCitizentypeEqualTo(String value) {
            addCriterion("CITIZENTYPE =", value, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeNotEqualTo(String value) {
            addCriterion("CITIZENTYPE <>", value, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeGreaterThan(String value) {
            addCriterion("CITIZENTYPE >", value, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeGreaterThanOrEqualTo(String value) {
            addCriterion("CITIZENTYPE >=", value, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeLessThan(String value) {
            addCriterion("CITIZENTYPE <", value, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeLessThanOrEqualTo(String value) {
            addCriterion("CITIZENTYPE <=", value, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeLike(String value) {
            addCriterion("CITIZENTYPE like", value, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeNotLike(String value) {
            addCriterion("CITIZENTYPE not like", value, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeIn(List<String> values) {
            addCriterion("CITIZENTYPE in", values, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeNotIn(List<String> values) {
            addCriterion("CITIZENTYPE not in", values, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeBetween(String value1, String value2) {
            addCriterion("CITIZENTYPE between", value1, value2, "citizentype");
            return (Criteria) this;
        }

        public Criteria andCitizentypeNotBetween(String value1, String value2) {
            addCriterion("CITIZENTYPE not between", value1, value2, "citizentype");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("DEGREE =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("DEGREE <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("DEGREE >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("DEGREE >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("DEGREE <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("DEGREE <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("DEGREE like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("DEGREE not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("DEGREE in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("DEGREE not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("DEGREE between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("DEGREE not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDomicilecityIsNull() {
            addCriterion("DOMICILECITY is null");
            return (Criteria) this;
        }

        public Criteria andDomicilecityIsNotNull() {
            addCriterion("DOMICILECITY is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilecityEqualTo(String value) {
            addCriterion("DOMICILECITY =", value, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityNotEqualTo(String value) {
            addCriterion("DOMICILECITY <>", value, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityGreaterThan(String value) {
            addCriterion("DOMICILECITY >", value, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILECITY >=", value, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityLessThan(String value) {
            addCriterion("DOMICILECITY <", value, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityLessThanOrEqualTo(String value) {
            addCriterion("DOMICILECITY <=", value, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityLike(String value) {
            addCriterion("DOMICILECITY like", value, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityNotLike(String value) {
            addCriterion("DOMICILECITY not like", value, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityIn(List<String> values) {
            addCriterion("DOMICILECITY in", values, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityNotIn(List<String> values) {
            addCriterion("DOMICILECITY not in", values, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityBetween(String value1, String value2) {
            addCriterion("DOMICILECITY between", value1, value2, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicilecityNotBetween(String value1, String value2) {
            addCriterion("DOMICILECITY not between", value1, value2, "domicilecity");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIsNull() {
            addCriterion("DOMICILEPLACE is null");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIsNotNull() {
            addCriterion("DOMICILEPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceEqualTo(String value) {
            addCriterion("DOMICILEPLACE =", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotEqualTo(String value) {
            addCriterion("DOMICILEPLACE <>", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceGreaterThan(String value) {
            addCriterion("DOMICILEPLACE >", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILEPLACE >=", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLessThan(String value) {
            addCriterion("DOMICILEPLACE <", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLessThanOrEqualTo(String value) {
            addCriterion("DOMICILEPLACE <=", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceLike(String value) {
            addCriterion("DOMICILEPLACE like", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotLike(String value) {
            addCriterion("DOMICILEPLACE not like", value, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceIn(List<String> values) {
            addCriterion("DOMICILEPLACE in", values, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotIn(List<String> values) {
            addCriterion("DOMICILEPLACE not in", values, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceBetween(String value1, String value2) {
            addCriterion("DOMICILEPLACE between", value1, value2, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileplaceNotBetween(String value1, String value2) {
            addCriterion("DOMICILEPLACE not between", value1, value2, "domicileplace");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceIsNull() {
            addCriterion("DOMICILEPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceIsNotNull() {
            addCriterion("DOMICILEPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceEqualTo(String value) {
            addCriterion("DOMICILEPROVINCE =", value, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceNotEqualTo(String value) {
            addCriterion("DOMICILEPROVINCE <>", value, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceGreaterThan(String value) {
            addCriterion("DOMICILEPROVINCE >", value, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILEPROVINCE >=", value, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceLessThan(String value) {
            addCriterion("DOMICILEPROVINCE <", value, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceLessThanOrEqualTo(String value) {
            addCriterion("DOMICILEPROVINCE <=", value, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceLike(String value) {
            addCriterion("DOMICILEPROVINCE like", value, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceNotLike(String value) {
            addCriterion("DOMICILEPROVINCE not like", value, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceIn(List<String> values) {
            addCriterion("DOMICILEPROVINCE in", values, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceNotIn(List<String> values) {
            addCriterion("DOMICILEPROVINCE not in", values, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceBetween(String value1, String value2) {
            addCriterion("DOMICILEPROVINCE between", value1, value2, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andDomicileprovinceNotBetween(String value1, String value2) {
            addCriterion("DOMICILEPROVINCE not between", value1, value2, "domicileprovince");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNull() {
            addCriterion("GRADUATESCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIsNotNull() {
            addCriterion("GRADUATESCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolEqualTo(String value) {
            addCriterion("GRADUATESCHOOL =", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotEqualTo(String value) {
            addCriterion("GRADUATESCHOOL <>", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThan(String value) {
            addCriterion("GRADUATESCHOOL >", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATESCHOOL >=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThan(String value) {
            addCriterion("GRADUATESCHOOL <", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATESCHOOL <=", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolLike(String value) {
            addCriterion("GRADUATESCHOOL like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotLike(String value) {
            addCriterion("GRADUATESCHOOL not like", value, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolIn(List<String> values) {
            addCriterion("GRADUATESCHOOL in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotIn(List<String> values) {
            addCriterion("GRADUATESCHOOL not in", values, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolBetween(String value1, String value2) {
            addCriterion("GRADUATESCHOOL between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andGraduateschoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATESCHOOL not between", value1, value2, "graduateschool");
            return (Criteria) this;
        }

        public Criteria andHaschildrenIsNull() {
            addCriterion("HASCHILDREN is null");
            return (Criteria) this;
        }

        public Criteria andHaschildrenIsNotNull() {
            addCriterion("HASCHILDREN is not null");
            return (Criteria) this;
        }

        public Criteria andHaschildrenEqualTo(Short value) {
            addCriterion("HASCHILDREN =", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenNotEqualTo(Short value) {
            addCriterion("HASCHILDREN <>", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenGreaterThan(Short value) {
            addCriterion("HASCHILDREN >", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenGreaterThanOrEqualTo(Short value) {
            addCriterion("HASCHILDREN >=", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenLessThan(Short value) {
            addCriterion("HASCHILDREN <", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenLessThanOrEqualTo(Short value) {
            addCriterion("HASCHILDREN <=", value, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenIn(List<Short> values) {
            addCriterion("HASCHILDREN in", values, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenNotIn(List<Short> values) {
            addCriterion("HASCHILDREN not in", values, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenBetween(Short value1, Short value2) {
            addCriterion("HASCHILDREN between", value1, value2, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHaschildrenNotBetween(Short value1, Short value2) {
            addCriterion("HASCHILDREN not between", value1, value2, "haschildren");
            return (Criteria) this;
        }

        public Criteria andHasresidenceIsNull() {
            addCriterion("HASRESIDENCE is null");
            return (Criteria) this;
        }

        public Criteria andHasresidenceIsNotNull() {
            addCriterion("HASRESIDENCE is not null");
            return (Criteria) this;
        }

        public Criteria andHasresidenceEqualTo(Short value) {
            addCriterion("HASRESIDENCE =", value, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceNotEqualTo(Short value) {
            addCriterion("HASRESIDENCE <>", value, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceGreaterThan(Short value) {
            addCriterion("HASRESIDENCE >", value, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceGreaterThanOrEqualTo(Short value) {
            addCriterion("HASRESIDENCE >=", value, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceLessThan(Short value) {
            addCriterion("HASRESIDENCE <", value, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceLessThanOrEqualTo(Short value) {
            addCriterion("HASRESIDENCE <=", value, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceIn(List<Short> values) {
            addCriterion("HASRESIDENCE in", values, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceNotIn(List<Short> values) {
            addCriterion("HASRESIDENCE not in", values, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceBetween(Short value1, Short value2) {
            addCriterion("HASRESIDENCE between", value1, value2, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHasresidenceNotBetween(Short value1, Short value2) {
            addCriterion("HASRESIDENCE not between", value1, value2, "hasresidence");
            return (Criteria) this;
        }

        public Criteria andHousedecorationIsNull() {
            addCriterion("HOUSEDECORATION is null");
            return (Criteria) this;
        }

        public Criteria andHousedecorationIsNotNull() {
            addCriterion("HOUSEDECORATION is not null");
            return (Criteria) this;
        }

        public Criteria andHousedecorationEqualTo(String value) {
            addCriterion("HOUSEDECORATION =", value, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationNotEqualTo(String value) {
            addCriterion("HOUSEDECORATION <>", value, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationGreaterThan(String value) {
            addCriterion("HOUSEDECORATION >", value, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSEDECORATION >=", value, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationLessThan(String value) {
            addCriterion("HOUSEDECORATION <", value, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationLessThanOrEqualTo(String value) {
            addCriterion("HOUSEDECORATION <=", value, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationLike(String value) {
            addCriterion("HOUSEDECORATION like", value, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationNotLike(String value) {
            addCriterion("HOUSEDECORATION not like", value, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationIn(List<String> values) {
            addCriterion("HOUSEDECORATION in", values, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationNotIn(List<String> values) {
            addCriterion("HOUSEDECORATION not in", values, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationBetween(String value1, String value2) {
            addCriterion("HOUSEDECORATION between", value1, value2, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousedecorationNotBetween(String value1, String value2) {
            addCriterion("HOUSEDECORATION not between", value1, value2, "housedecoration");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNull() {
            addCriterion("HOUSETYPE is null");
            return (Criteria) this;
        }

        public Criteria andHousetypeIsNotNull() {
            addCriterion("HOUSETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHousetypeEqualTo(String value) {
            addCriterion("HOUSETYPE =", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotEqualTo(String value) {
            addCriterion("HOUSETYPE <>", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThan(String value) {
            addCriterion("HOUSETYPE >", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSETYPE >=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThan(String value) {
            addCriterion("HOUSETYPE <", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLessThanOrEqualTo(String value) {
            addCriterion("HOUSETYPE <=", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeLike(String value) {
            addCriterion("HOUSETYPE like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotLike(String value) {
            addCriterion("HOUSETYPE not like", value, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeIn(List<String> values) {
            addCriterion("HOUSETYPE in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotIn(List<String> values) {
            addCriterion("HOUSETYPE not in", values, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeBetween(String value1, String value2) {
            addCriterion("HOUSETYPE between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andHousetypeNotBetween(String value1, String value2) {
            addCriterion("HOUSETYPE not between", value1, value2, "housetype");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceIsNull() {
            addCriterion("INDUSTRYEXPERIENCE is null");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceIsNotNull() {
            addCriterion("INDUSTRYEXPERIENCE is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceEqualTo(String value) {
            addCriterion("INDUSTRYEXPERIENCE =", value, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceNotEqualTo(String value) {
            addCriterion("INDUSTRYEXPERIENCE <>", value, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceGreaterThan(String value) {
            addCriterion("INDUSTRYEXPERIENCE >", value, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYEXPERIENCE >=", value, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceLessThan(String value) {
            addCriterion("INDUSTRYEXPERIENCE <", value, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYEXPERIENCE <=", value, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceLike(String value) {
            addCriterion("INDUSTRYEXPERIENCE like", value, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceNotLike(String value) {
            addCriterion("INDUSTRYEXPERIENCE not like", value, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceIn(List<String> values) {
            addCriterion("INDUSTRYEXPERIENCE in", values, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceNotIn(List<String> values) {
            addCriterion("INDUSTRYEXPERIENCE not in", values, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceBetween(String value1, String value2) {
            addCriterion("INDUSTRYEXPERIENCE between", value1, value2, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andIndustryexperienceNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYEXPERIENCE not between", value1, value2, "industryexperience");
            return (Criteria) this;
        }

        public Criteria andLivareaIsNull() {
            addCriterion("LIVAREA is null");
            return (Criteria) this;
        }

        public Criteria andLivareaIsNotNull() {
            addCriterion("LIVAREA is not null");
            return (Criteria) this;
        }

        public Criteria andLivareaEqualTo(BigDecimal value) {
            addCriterion("LIVAREA =", value, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaNotEqualTo(BigDecimal value) {
            addCriterion("LIVAREA <>", value, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaGreaterThan(BigDecimal value) {
            addCriterion("LIVAREA >", value, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIVAREA >=", value, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaLessThan(BigDecimal value) {
            addCriterion("LIVAREA <", value, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIVAREA <=", value, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaIn(List<BigDecimal> values) {
            addCriterion("LIVAREA in", values, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaNotIn(List<BigDecimal> values) {
            addCriterion("LIVAREA not in", values, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIVAREA between", value1, value2, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIVAREA not between", value1, value2, "livarea");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesIsNull() {
            addCriterion("LIVPEOPLES is null");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesIsNotNull() {
            addCriterion("LIVPEOPLES is not null");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesEqualTo(Long value) {
            addCriterion("LIVPEOPLES =", value, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesNotEqualTo(Long value) {
            addCriterion("LIVPEOPLES <>", value, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesGreaterThan(Long value) {
            addCriterion("LIVPEOPLES >", value, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesGreaterThanOrEqualTo(Long value) {
            addCriterion("LIVPEOPLES >=", value, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesLessThan(Long value) {
            addCriterion("LIVPEOPLES <", value, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesLessThanOrEqualTo(Long value) {
            addCriterion("LIVPEOPLES <=", value, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesIn(List<Long> values) {
            addCriterion("LIVPEOPLES in", values, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesNotIn(List<Long> values) {
            addCriterion("LIVPEOPLES not in", values, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesBetween(Long value1, Long value2) {
            addCriterion("LIVPEOPLES between", value1, value2, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivpeoplesNotBetween(Long value1, Long value2) {
            addCriterion("LIVPEOPLES not between", value1, value2, "livpeoples");
            return (Criteria) this;
        }

        public Criteria andLivyearsIsNull() {
            addCriterion("LIVYEARS is null");
            return (Criteria) this;
        }

        public Criteria andLivyearsIsNotNull() {
            addCriterion("LIVYEARS is not null");
            return (Criteria) this;
        }

        public Criteria andLivyearsEqualTo(Long value) {
            addCriterion("LIVYEARS =", value, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsNotEqualTo(Long value) {
            addCriterion("LIVYEARS <>", value, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsGreaterThan(Long value) {
            addCriterion("LIVYEARS >", value, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsGreaterThanOrEqualTo(Long value) {
            addCriterion("LIVYEARS >=", value, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsLessThan(Long value) {
            addCriterion("LIVYEARS <", value, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsLessThanOrEqualTo(Long value) {
            addCriterion("LIVYEARS <=", value, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsIn(List<Long> values) {
            addCriterion("LIVYEARS in", values, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsNotIn(List<Long> values) {
            addCriterion("LIVYEARS not in", values, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsBetween(Long value1, Long value2) {
            addCriterion("LIVYEARS between", value1, value2, "livyears");
            return (Criteria) this;
        }

        public Criteria andLivyearsNotBetween(Long value1, Long value2) {
            addCriterion("LIVYEARS not between", value1, value2, "livyears");
            return (Criteria) this;
        }

        public Criteria andManageexperienceIsNull() {
            addCriterion("MANAGEEXPERIENCE is null");
            return (Criteria) this;
        }

        public Criteria andManageexperienceIsNotNull() {
            addCriterion("MANAGEEXPERIENCE is not null");
            return (Criteria) this;
        }

        public Criteria andManageexperienceEqualTo(String value) {
            addCriterion("MANAGEEXPERIENCE =", value, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceNotEqualTo(String value) {
            addCriterion("MANAGEEXPERIENCE <>", value, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceGreaterThan(String value) {
            addCriterion("MANAGEEXPERIENCE >", value, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGEEXPERIENCE >=", value, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceLessThan(String value) {
            addCriterion("MANAGEEXPERIENCE <", value, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceLessThanOrEqualTo(String value) {
            addCriterion("MANAGEEXPERIENCE <=", value, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceLike(String value) {
            addCriterion("MANAGEEXPERIENCE like", value, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceNotLike(String value) {
            addCriterion("MANAGEEXPERIENCE not like", value, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceIn(List<String> values) {
            addCriterion("MANAGEEXPERIENCE in", values, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceNotIn(List<String> values) {
            addCriterion("MANAGEEXPERIENCE not in", values, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceBetween(String value1, String value2) {
            addCriterion("MANAGEEXPERIENCE between", value1, value2, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andManageexperienceNotBetween(String value1, String value2) {
            addCriterion("MANAGEEXPERIENCE not between", value1, value2, "manageexperience");
            return (Criteria) this;
        }

        public Criteria andMerryyearsIsNull() {
            addCriterion("MERRYYEARS is null");
            return (Criteria) this;
        }

        public Criteria andMerryyearsIsNotNull() {
            addCriterion("MERRYYEARS is not null");
            return (Criteria) this;
        }

        public Criteria andMerryyearsEqualTo(Long value) {
            addCriterion("MERRYYEARS =", value, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsNotEqualTo(Long value) {
            addCriterion("MERRYYEARS <>", value, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsGreaterThan(Long value) {
            addCriterion("MERRYYEARS >", value, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsGreaterThanOrEqualTo(Long value) {
            addCriterion("MERRYYEARS >=", value, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsLessThan(Long value) {
            addCriterion("MERRYYEARS <", value, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsLessThanOrEqualTo(Long value) {
            addCriterion("MERRYYEARS <=", value, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsIn(List<Long> values) {
            addCriterion("MERRYYEARS in", values, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsNotIn(List<Long> values) {
            addCriterion("MERRYYEARS not in", values, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsBetween(Long value1, Long value2) {
            addCriterion("MERRYYEARS between", value1, value2, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMerryyearsNotBetween(Long value1, Long value2) {
            addCriterion("MERRYYEARS not between", value1, value2, "merryyears");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbIsNull() {
            addCriterion("MINORITYCHILDRENNMB is null");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbIsNotNull() {
            addCriterion("MINORITYCHILDRENNMB is not null");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbEqualTo(Long value) {
            addCriterion("MINORITYCHILDRENNMB =", value, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbNotEqualTo(Long value) {
            addCriterion("MINORITYCHILDRENNMB <>", value, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbGreaterThan(Long value) {
            addCriterion("MINORITYCHILDRENNMB >", value, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbGreaterThanOrEqualTo(Long value) {
            addCriterion("MINORITYCHILDRENNMB >=", value, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbLessThan(Long value) {
            addCriterion("MINORITYCHILDRENNMB <", value, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbLessThanOrEqualTo(Long value) {
            addCriterion("MINORITYCHILDRENNMB <=", value, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbIn(List<Long> values) {
            addCriterion("MINORITYCHILDRENNMB in", values, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbNotIn(List<Long> values) {
            addCriterion("MINORITYCHILDRENNMB not in", values, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbBetween(Long value1, Long value2) {
            addCriterion("MINORITYCHILDRENNMB between", value1, value2, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andMinoritychildrennmbNotBetween(Long value1, Long value2) {
            addCriterion("MINORITYCHILDRENNMB not between", value1, value2, "minoritychildrennmb");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNativehomeIsNull() {
            addCriterion("NATIVEHOME is null");
            return (Criteria) this;
        }

        public Criteria andNativehomeIsNotNull() {
            addCriterion("NATIVEHOME is not null");
            return (Criteria) this;
        }

        public Criteria andNativehomeEqualTo(String value) {
            addCriterion("NATIVEHOME =", value, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeNotEqualTo(String value) {
            addCriterion("NATIVEHOME <>", value, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeGreaterThan(String value) {
            addCriterion("NATIVEHOME >", value, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVEHOME >=", value, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeLessThan(String value) {
            addCriterion("NATIVEHOME <", value, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeLessThanOrEqualTo(String value) {
            addCriterion("NATIVEHOME <=", value, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeLike(String value) {
            addCriterion("NATIVEHOME like", value, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeNotLike(String value) {
            addCriterion("NATIVEHOME not like", value, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeIn(List<String> values) {
            addCriterion("NATIVEHOME in", values, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeNotIn(List<String> values) {
            addCriterion("NATIVEHOME not in", values, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeBetween(String value1, String value2) {
            addCriterion("NATIVEHOME between", value1, value2, "nativehome");
            return (Criteria) this;
        }

        public Criteria andNativehomeNotBetween(String value1, String value2) {
            addCriterion("NATIVEHOME not between", value1, value2, "nativehome");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andSocialcreditIsNull() {
            addCriterion("SOCIALCREDIT is null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditIsNotNull() {
            addCriterion("SOCIALCREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andSocialcreditEqualTo(String value) {
            addCriterion("SOCIALCREDIT =", value, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditNotEqualTo(String value) {
            addCriterion("SOCIALCREDIT <>", value, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditGreaterThan(String value) {
            addCriterion("SOCIALCREDIT >", value, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIALCREDIT >=", value, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditLessThan(String value) {
            addCriterion("SOCIALCREDIT <", value, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditLessThanOrEqualTo(String value) {
            addCriterion("SOCIALCREDIT <=", value, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditLike(String value) {
            addCriterion("SOCIALCREDIT like", value, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditNotLike(String value) {
            addCriterion("SOCIALCREDIT not like", value, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditIn(List<String> values) {
            addCriterion("SOCIALCREDIT in", values, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditNotIn(List<String> values) {
            addCriterion("SOCIALCREDIT not in", values, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditBetween(String value1, String value2) {
            addCriterion("SOCIALCREDIT between", value1, value2, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andSocialcreditNotBetween(String value1, String value2) {
            addCriterion("SOCIALCREDIT not between", value1, value2, "socialcredit");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNull() {
            addCriterion("WORKEXPERIENCE is null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNotNull() {
            addCriterion("WORKEXPERIENCE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceEqualTo(String value) {
            addCriterion("WORKEXPERIENCE =", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotEqualTo(String value) {
            addCriterion("WORKEXPERIENCE <>", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThan(String value) {
            addCriterion("WORKEXPERIENCE >", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("WORKEXPERIENCE >=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThan(String value) {
            addCriterion("WORKEXPERIENCE <", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThanOrEqualTo(String value) {
            addCriterion("WORKEXPERIENCE <=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLike(String value) {
            addCriterion("WORKEXPERIENCE like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotLike(String value) {
            addCriterion("WORKEXPERIENCE not like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIn(List<String> values) {
            addCriterion("WORKEXPERIENCE in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotIn(List<String> values) {
            addCriterion("WORKEXPERIENCE not in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceBetween(String value1, String value2) {
            addCriterion("WORKEXPERIENCE between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotBetween(String value1, String value2) {
            addCriterion("WORKEXPERIENCE not between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNull() {
            addCriterion("WORKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andWorkunitIsNotNull() {
            addCriterion("WORKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkunitEqualTo(String value) {
            addCriterion("WORKUNIT =", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotEqualTo(String value) {
            addCriterion("WORKUNIT <>", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThan(String value) {
            addCriterion("WORKUNIT >", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitGreaterThanOrEqualTo(String value) {
            addCriterion("WORKUNIT >=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThan(String value) {
            addCriterion("WORKUNIT <", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLessThanOrEqualTo(String value) {
            addCriterion("WORKUNIT <=", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitLike(String value) {
            addCriterion("WORKUNIT like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotLike(String value) {
            addCriterion("WORKUNIT not like", value, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitIn(List<String> values) {
            addCriterion("WORKUNIT in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotIn(List<String> values) {
            addCriterion("WORKUNIT not in", values, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitBetween(String value1, String value2) {
            addCriterion("WORKUNIT between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andWorkunitNotBetween(String value1, String value2) {
            addCriterion("WORKUNIT not between", value1, value2, "workunit");
            return (Criteria) this;
        }

        public Criteria andContactwayIsNull() {
            addCriterion("CONTACTWAY is null");
            return (Criteria) this;
        }

        public Criteria andContactwayIsNotNull() {
            addCriterion("CONTACTWAY is not null");
            return (Criteria) this;
        }

        public Criteria andContactwayEqualTo(String value) {
            addCriterion("CONTACTWAY =", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayNotEqualTo(String value) {
            addCriterion("CONTACTWAY <>", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayGreaterThan(String value) {
            addCriterion("CONTACTWAY >", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTWAY >=", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayLessThan(String value) {
            addCriterion("CONTACTWAY <", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayLessThanOrEqualTo(String value) {
            addCriterion("CONTACTWAY <=", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayLike(String value) {
            addCriterion("CONTACTWAY like", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayNotLike(String value) {
            addCriterion("CONTACTWAY not like", value, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayIn(List<String> values) {
            addCriterion("CONTACTWAY in", values, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayNotIn(List<String> values) {
            addCriterion("CONTACTWAY not in", values, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayBetween(String value1, String value2) {
            addCriterion("CONTACTWAY between", value1, value2, "contactway");
            return (Criteria) this;
        }

        public Criteria andContactwayNotBetween(String value1, String value2) {
            addCriterion("CONTACTWAY not between", value1, value2, "contactway");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("COUNTY is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("COUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("COUNTY =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("COUNTY <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("COUNTY >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTY >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("COUNTY <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("COUNTY <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("COUNTY like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("COUNTY not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("COUNTY in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("COUNTY not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("COUNTY between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("COUNTY not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andDomicileIsNull() {
            addCriterion("DOMICILE is null");
            return (Criteria) this;
        }

        public Criteria andDomicileIsNotNull() {
            addCriterion("DOMICILE is not null");
            return (Criteria) this;
        }

        public Criteria andDomicileEqualTo(String value) {
            addCriterion("DOMICILE =", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotEqualTo(String value) {
            addCriterion("DOMICILE <>", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileGreaterThan(String value) {
            addCriterion("DOMICILE >", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileGreaterThanOrEqualTo(String value) {
            addCriterion("DOMICILE >=", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLessThan(String value) {
            addCriterion("DOMICILE <", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLessThanOrEqualTo(String value) {
            addCriterion("DOMICILE <=", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileLike(String value) {
            addCriterion("DOMICILE like", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotLike(String value) {
            addCriterion("DOMICILE not like", value, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileIn(List<String> values) {
            addCriterion("DOMICILE in", values, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotIn(List<String> values) {
            addCriterion("DOMICILE not in", values, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileBetween(String value1, String value2) {
            addCriterion("DOMICILE between", value1, value2, "domicile");
            return (Criteria) this;
        }

        public Criteria andDomicileNotBetween(String value1, String value2) {
            addCriterion("DOMICILE not between", value1, value2, "domicile");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthIsNull() {
            addCriterion("INCOMEOFMONTH is null");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthIsNotNull() {
            addCriterion("INCOMEOFMONTH is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthEqualTo(BigDecimal value) {
            addCriterion("INCOMEOFMONTH =", value, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthNotEqualTo(BigDecimal value) {
            addCriterion("INCOMEOFMONTH <>", value, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthGreaterThan(BigDecimal value) {
            addCriterion("INCOMEOFMONTH >", value, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEOFMONTH >=", value, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthLessThan(BigDecimal value) {
            addCriterion("INCOMEOFMONTH <", value, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEOFMONTH <=", value, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthIn(List<BigDecimal> values) {
            addCriterion("INCOMEOFMONTH in", values, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthNotIn(List<BigDecimal> values) {
            addCriterion("INCOMEOFMONTH not in", values, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEOFMONTH between", value1, value2, "incomeofmonth");
            return (Criteria) this;
        }

        public Criteria andIncomeofmonthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEOFMONTH not between", value1, value2, "incomeofmonth");
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

        public Criteria andIsusedpolicyguarIsNull() {
            addCriterion("ISUSEDPOLICYGUAR is null");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarIsNotNull() {
            addCriterion("ISUSEDPOLICYGUAR is not null");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarEqualTo(String value) {
            addCriterion("ISUSEDPOLICYGUAR =", value, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarNotEqualTo(String value) {
            addCriterion("ISUSEDPOLICYGUAR <>", value, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarGreaterThan(String value) {
            addCriterion("ISUSEDPOLICYGUAR >", value, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarGreaterThanOrEqualTo(String value) {
            addCriterion("ISUSEDPOLICYGUAR >=", value, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarLessThan(String value) {
            addCriterion("ISUSEDPOLICYGUAR <", value, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarLessThanOrEqualTo(String value) {
            addCriterion("ISUSEDPOLICYGUAR <=", value, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarLike(String value) {
            addCriterion("ISUSEDPOLICYGUAR like", value, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarNotLike(String value) {
            addCriterion("ISUSEDPOLICYGUAR not like", value, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarIn(List<String> values) {
            addCriterion("ISUSEDPOLICYGUAR in", values, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarNotIn(List<String> values) {
            addCriterion("ISUSEDPOLICYGUAR not in", values, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarBetween(String value1, String value2) {
            addCriterion("ISUSEDPOLICYGUAR between", value1, value2, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andIsusedpolicyguarNotBetween(String value1, String value2) {
            addCriterion("ISUSEDPOLICYGUAR not between", value1, value2, "isusedpolicyguar");
            return (Criteria) this;
        }

        public Criteria andLicensenumIsNull() {
            addCriterion("LICENSENUM is null");
            return (Criteria) this;
        }

        public Criteria andLicensenumIsNotNull() {
            addCriterion("LICENSENUM is not null");
            return (Criteria) this;
        }

        public Criteria andLicensenumEqualTo(String value) {
            addCriterion("LICENSENUM =", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumNotEqualTo(String value) {
            addCriterion("LICENSENUM <>", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumGreaterThan(String value) {
            addCriterion("LICENSENUM >", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumGreaterThanOrEqualTo(String value) {
            addCriterion("LICENSENUM >=", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumLessThan(String value) {
            addCriterion("LICENSENUM <", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumLessThanOrEqualTo(String value) {
            addCriterion("LICENSENUM <=", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumLike(String value) {
            addCriterion("LICENSENUM like", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumNotLike(String value) {
            addCriterion("LICENSENUM not like", value, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumIn(List<String> values) {
            addCriterion("LICENSENUM in", values, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumNotIn(List<String> values) {
            addCriterion("LICENSENUM not in", values, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumBetween(String value1, String value2) {
            addCriterion("LICENSENUM between", value1, value2, "licensenum");
            return (Criteria) this;
        }

        public Criteria andLicensenumNotBetween(String value1, String value2) {
            addCriterion("LICENSENUM not between", value1, value2, "licensenum");
            return (Criteria) this;
        }

        public Criteria andProposertypeIsNull() {
            addCriterion("PROPOSERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProposertypeIsNotNull() {
            addCriterion("PROPOSERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProposertypeEqualTo(String value) {
            addCriterion("PROPOSERTYPE =", value, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeNotEqualTo(String value) {
            addCriterion("PROPOSERTYPE <>", value, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeGreaterThan(String value) {
            addCriterion("PROPOSERTYPE >", value, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSERTYPE >=", value, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeLessThan(String value) {
            addCriterion("PROPOSERTYPE <", value, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeLessThanOrEqualTo(String value) {
            addCriterion("PROPOSERTYPE <=", value, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeLike(String value) {
            addCriterion("PROPOSERTYPE like", value, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeNotLike(String value) {
            addCriterion("PROPOSERTYPE not like", value, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeIn(List<String> values) {
            addCriterion("PROPOSERTYPE in", values, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeNotIn(List<String> values) {
            addCriterion("PROPOSERTYPE not in", values, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeBetween(String value1, String value2) {
            addCriterion("PROPOSERTYPE between", value1, value2, "proposertype");
            return (Criteria) this;
        }

        public Criteria andProposertypeNotBetween(String value1, String value2) {
            addCriterion("PROPOSERTYPE not between", value1, value2, "proposertype");
            return (Criteria) this;
        }

        public Criteria andBusinessnumIsNull() {
            addCriterion("BUSINESSNUM is null");
            return (Criteria) this;
        }

        public Criteria andBusinessnumIsNotNull() {
            addCriterion("BUSINESSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessnumEqualTo(String value) {
            addCriterion("BUSINESSNUM =", value, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumNotEqualTo(String value) {
            addCriterion("BUSINESSNUM <>", value, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumGreaterThan(String value) {
            addCriterion("BUSINESSNUM >", value, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESSNUM >=", value, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumLessThan(String value) {
            addCriterion("BUSINESSNUM <", value, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumLessThanOrEqualTo(String value) {
            addCriterion("BUSINESSNUM <=", value, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumLike(String value) {
            addCriterion("BUSINESSNUM like", value, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumNotLike(String value) {
            addCriterion("BUSINESSNUM not like", value, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumIn(List<String> values) {
            addCriterion("BUSINESSNUM in", values, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumNotIn(List<String> values) {
            addCriterion("BUSINESSNUM not in", values, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumBetween(String value1, String value2) {
            addCriterion("BUSINESSNUM between", value1, value2, "businessnum");
            return (Criteria) this;
        }

        public Criteria andBusinessnumNotBetween(String value1, String value2) {
            addCriterion("BUSINESSNUM not between", value1, value2, "businessnum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIsNull() {
            addCriterion("EMPLOYEENUM is null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIsNotNull() {
            addCriterion("EMPLOYEENUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeenumEqualTo(Long value) {
            addCriterion("EMPLOYEENUM =", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotEqualTo(Long value) {
            addCriterion("EMPLOYEENUM <>", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThan(Long value) {
            addCriterion("EMPLOYEENUM >", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThanOrEqualTo(Long value) {
            addCriterion("EMPLOYEENUM >=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThan(Long value) {
            addCriterion("EMPLOYEENUM <", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThanOrEqualTo(Long value) {
            addCriterion("EMPLOYEENUM <=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIn(List<Long> values) {
            addCriterion("EMPLOYEENUM in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotIn(List<Long> values) {
            addCriterion("EMPLOYEENUM not in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumBetween(Long value1, Long value2) {
            addCriterion("EMPLOYEENUM between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotBetween(Long value1, Long value2) {
            addCriterion("EMPLOYEENUM not between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andMarrownmIsNull() {
            addCriterion("MARROWNM is null");
            return (Criteria) this;
        }

        public Criteria andMarrownmIsNotNull() {
            addCriterion("MARROWNM is not null");
            return (Criteria) this;
        }

        public Criteria andMarrownmEqualTo(String value) {
            addCriterion("MARROWNM =", value, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmNotEqualTo(String value) {
            addCriterion("MARROWNM <>", value, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmGreaterThan(String value) {
            addCriterion("MARROWNM >", value, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmGreaterThanOrEqualTo(String value) {
            addCriterion("MARROWNM >=", value, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmLessThan(String value) {
            addCriterion("MARROWNM <", value, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmLessThanOrEqualTo(String value) {
            addCriterion("MARROWNM <=", value, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmLike(String value) {
            addCriterion("MARROWNM like", value, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmNotLike(String value) {
            addCriterion("MARROWNM not like", value, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmIn(List<String> values) {
            addCriterion("MARROWNM in", values, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmNotIn(List<String> values) {
            addCriterion("MARROWNM not in", values, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmBetween(String value1, String value2) {
            addCriterion("MARROWNM between", value1, value2, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrownmNotBetween(String value1, String value2) {
            addCriterion("MARROWNM not between", value1, value2, "marrownm");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneIsNull() {
            addCriterion("MARROWPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneIsNotNull() {
            addCriterion("MARROWPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneEqualTo(String value) {
            addCriterion("MARROWPHONE =", value, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneNotEqualTo(String value) {
            addCriterion("MARROWPHONE <>", value, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneGreaterThan(String value) {
            addCriterion("MARROWPHONE >", value, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneGreaterThanOrEqualTo(String value) {
            addCriterion("MARROWPHONE >=", value, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneLessThan(String value) {
            addCriterion("MARROWPHONE <", value, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneLessThanOrEqualTo(String value) {
            addCriterion("MARROWPHONE <=", value, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneLike(String value) {
            addCriterion("MARROWPHONE like", value, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneNotLike(String value) {
            addCriterion("MARROWPHONE not like", value, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneIn(List<String> values) {
            addCriterion("MARROWPHONE in", values, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneNotIn(List<String> values) {
            addCriterion("MARROWPHONE not in", values, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneBetween(String value1, String value2) {
            addCriterion("MARROWPHONE between", value1, value2, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andMarrowphoneNotBetween(String value1, String value2) {
            addCriterion("MARROWPHONE not between", value1, value2, "marrowphone");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNull() {
            addCriterion("ORGANIZATIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNotNull() {
            addCriterion("ORGANIZATIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeEqualTo(String value) {
            addCriterion("ORGANIZATIONCODE =", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotEqualTo(String value) {
            addCriterion("ORGANIZATIONCODE <>", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThan(String value) {
            addCriterion("ORGANIZATIONCODE >", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONCODE >=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThan(String value) {
            addCriterion("ORGANIZATIONCODE <", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATIONCODE <=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLike(String value) {
            addCriterion("ORGANIZATIONCODE like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotLike(String value) {
            addCriterion("ORGANIZATIONCODE not like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIn(List<String> values) {
            addCriterion("ORGANIZATIONCODE in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotIn(List<String> values) {
            addCriterion("ORGANIZATIONCODE not in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONCODE between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATIONCODE not between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andProposercodeIsNull() {
            addCriterion("PROPOSERCODE is null");
            return (Criteria) this;
        }

        public Criteria andProposercodeIsNotNull() {
            addCriterion("PROPOSERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andProposercodeEqualTo(String value) {
            addCriterion("PROPOSERCODE =", value, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeNotEqualTo(String value) {
            addCriterion("PROPOSERCODE <>", value, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeGreaterThan(String value) {
            addCriterion("PROPOSERCODE >", value, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSERCODE >=", value, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeLessThan(String value) {
            addCriterion("PROPOSERCODE <", value, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeLessThanOrEqualTo(String value) {
            addCriterion("PROPOSERCODE <=", value, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeLike(String value) {
            addCriterion("PROPOSERCODE like", value, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeNotLike(String value) {
            addCriterion("PROPOSERCODE not like", value, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeIn(List<String> values) {
            addCriterion("PROPOSERCODE in", values, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeNotIn(List<String> values) {
            addCriterion("PROPOSERCODE not in", values, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeBetween(String value1, String value2) {
            addCriterion("PROPOSERCODE between", value1, value2, "proposercode");
            return (Criteria) this;
        }

        public Criteria andProposercodeNotBetween(String value1, String value2) {
            addCriterion("PROPOSERCODE not between", value1, value2, "proposercode");
            return (Criteria) this;
        }

        public Criteria andRegistdateIsNull() {
            addCriterion("REGISTDATE is null");
            return (Criteria) this;
        }

        public Criteria andRegistdateIsNotNull() {
            addCriterion("REGISTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegistdateEqualTo(BigDecimal value) {
            addCriterion("REGISTDATE =", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotEqualTo(BigDecimal value) {
            addCriterion("REGISTDATE <>", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThan(BigDecimal value) {
            addCriterion("REGISTDATE >", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGISTDATE >=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThan(BigDecimal value) {
            addCriterion("REGISTDATE <", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGISTDATE <=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateIn(List<BigDecimal> values) {
            addCriterion("REGISTDATE in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotIn(List<BigDecimal> values) {
            addCriterion("REGISTDATE not in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGISTDATE between", value1, value2, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGISTDATE not between", value1, value2, "registdate");
            return (Criteria) this;
        }

        public Criteria andContactwayext1IsNull() {
            addCriterion("CONTACTWAYEXT1 is null");
            return (Criteria) this;
        }

        public Criteria andContactwayext1IsNotNull() {
            addCriterion("CONTACTWAYEXT1 is not null");
            return (Criteria) this;
        }

        public Criteria andContactwayext1EqualTo(String value) {
            addCriterion("CONTACTWAYEXT1 =", value, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1NotEqualTo(String value) {
            addCriterion("CONTACTWAYEXT1 <>", value, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1GreaterThan(String value) {
            addCriterion("CONTACTWAYEXT1 >", value, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1GreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTWAYEXT1 >=", value, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1LessThan(String value) {
            addCriterion("CONTACTWAYEXT1 <", value, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1LessThanOrEqualTo(String value) {
            addCriterion("CONTACTWAYEXT1 <=", value, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1Like(String value) {
            addCriterion("CONTACTWAYEXT1 like", value, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1NotLike(String value) {
            addCriterion("CONTACTWAYEXT1 not like", value, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1In(List<String> values) {
            addCriterion("CONTACTWAYEXT1 in", values, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1NotIn(List<String> values) {
            addCriterion("CONTACTWAYEXT1 not in", values, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1Between(String value1, String value2) {
            addCriterion("CONTACTWAYEXT1 between", value1, value2, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext1NotBetween(String value1, String value2) {
            addCriterion("CONTACTWAYEXT1 not between", value1, value2, "contactwayext1");
            return (Criteria) this;
        }

        public Criteria andContactwayext2IsNull() {
            addCriterion("CONTACTWAYEXT2 is null");
            return (Criteria) this;
        }

        public Criteria andContactwayext2IsNotNull() {
            addCriterion("CONTACTWAYEXT2 is not null");
            return (Criteria) this;
        }

        public Criteria andContactwayext2EqualTo(String value) {
            addCriterion("CONTACTWAYEXT2 =", value, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2NotEqualTo(String value) {
            addCriterion("CONTACTWAYEXT2 <>", value, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2GreaterThan(String value) {
            addCriterion("CONTACTWAYEXT2 >", value, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2GreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTWAYEXT2 >=", value, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2LessThan(String value) {
            addCriterion("CONTACTWAYEXT2 <", value, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2LessThanOrEqualTo(String value) {
            addCriterion("CONTACTWAYEXT2 <=", value, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2Like(String value) {
            addCriterion("CONTACTWAYEXT2 like", value, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2NotLike(String value) {
            addCriterion("CONTACTWAYEXT2 not like", value, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2In(List<String> values) {
            addCriterion("CONTACTWAYEXT2 in", values, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2NotIn(List<String> values) {
            addCriterion("CONTACTWAYEXT2 not in", values, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2Between(String value1, String value2) {
            addCriterion("CONTACTWAYEXT2 between", value1, value2, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andContactwayext2NotBetween(String value1, String value2) {
            addCriterion("CONTACTWAYEXT2 not between", value1, value2, "contactwayext2");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIsNull() {
            addCriterion("LEGALREPRESENTATIVE is null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIsNotNull() {
            addCriterion("LEGALREPRESENTATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE =", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE <>", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeGreaterThan(String value) {
            addCriterion("LEGALREPRESENTATIVE >", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE >=", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLessThan(String value) {
            addCriterion("LEGALREPRESENTATIVE <", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLessThanOrEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE <=", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeLike(String value) {
            addCriterion("LEGALREPRESENTATIVE like", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotLike(String value) {
            addCriterion("LEGALREPRESENTATIVE not like", value, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIn(List<String> values) {
            addCriterion("LEGALREPRESENTATIVE in", values, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotIn(List<String> values) {
            addCriterion("LEGALREPRESENTATIVE not in", values, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeBetween(String value1, String value2) {
            addCriterion("LEGALREPRESENTATIVE between", value1, value2, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeNotBetween(String value1, String value2) {
            addCriterion("LEGALREPRESENTATIVE not between", value1, value2, "legalrepresentative");
            return (Criteria) this;
        }

        public Criteria andOperationaddrIsNull() {
            addCriterion("OPERATIONADDR is null");
            return (Criteria) this;
        }

        public Criteria andOperationaddrIsNotNull() {
            addCriterion("OPERATIONADDR is not null");
            return (Criteria) this;
        }

        public Criteria andOperationaddrEqualTo(String value) {
            addCriterion("OPERATIONADDR =", value, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrNotEqualTo(String value) {
            addCriterion("OPERATIONADDR <>", value, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrGreaterThan(String value) {
            addCriterion("OPERATIONADDR >", value, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATIONADDR >=", value, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrLessThan(String value) {
            addCriterion("OPERATIONADDR <", value, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrLessThanOrEqualTo(String value) {
            addCriterion("OPERATIONADDR <=", value, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrLike(String value) {
            addCriterion("OPERATIONADDR like", value, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrNotLike(String value) {
            addCriterion("OPERATIONADDR not like", value, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrIn(List<String> values) {
            addCriterion("OPERATIONADDR in", values, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrNotIn(List<String> values) {
            addCriterion("OPERATIONADDR not in", values, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrBetween(String value1, String value2) {
            addCriterion("OPERATIONADDR between", value1, value2, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andOperationaddrNotBetween(String value1, String value2) {
            addCriterion("OPERATIONADDR not between", value1, value2, "operationaddr");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayIsNull() {
            addCriterion("REGCONTACTWAY is null");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayIsNotNull() {
            addCriterion("REGCONTACTWAY is not null");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayEqualTo(String value) {
            addCriterion("REGCONTACTWAY =", value, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayNotEqualTo(String value) {
            addCriterion("REGCONTACTWAY <>", value, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayGreaterThan(String value) {
            addCriterion("REGCONTACTWAY >", value, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayGreaterThanOrEqualTo(String value) {
            addCriterion("REGCONTACTWAY >=", value, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayLessThan(String value) {
            addCriterion("REGCONTACTWAY <", value, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayLessThanOrEqualTo(String value) {
            addCriterion("REGCONTACTWAY <=", value, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayLike(String value) {
            addCriterion("REGCONTACTWAY like", value, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayNotLike(String value) {
            addCriterion("REGCONTACTWAY not like", value, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayIn(List<String> values) {
            addCriterion("REGCONTACTWAY in", values, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayNotIn(List<String> values) {
            addCriterion("REGCONTACTWAY not in", values, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayBetween(String value1, String value2) {
            addCriterion("REGCONTACTWAY between", value1, value2, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andRegcontactwayNotBetween(String value1, String value2) {
            addCriterion("REGCONTACTWAY not between", value1, value2, "regcontactway");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeIsNull() {
            addCriterion("PROPOSERBIGTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeIsNotNull() {
            addCriterion("PROPOSERBIGTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeEqualTo(String value) {
            addCriterion("PROPOSERBIGTYPE =", value, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeNotEqualTo(String value) {
            addCriterion("PROPOSERBIGTYPE <>", value, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeGreaterThan(String value) {
            addCriterion("PROPOSERBIGTYPE >", value, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSERBIGTYPE >=", value, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeLessThan(String value) {
            addCriterion("PROPOSERBIGTYPE <", value, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeLessThanOrEqualTo(String value) {
            addCriterion("PROPOSERBIGTYPE <=", value, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeLike(String value) {
            addCriterion("PROPOSERBIGTYPE like", value, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeNotLike(String value) {
            addCriterion("PROPOSERBIGTYPE not like", value, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeIn(List<String> values) {
            addCriterion("PROPOSERBIGTYPE in", values, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeNotIn(List<String> values) {
            addCriterion("PROPOSERBIGTYPE not in", values, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeBetween(String value1, String value2) {
            addCriterion("PROPOSERBIGTYPE between", value1, value2, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposerbigtypeNotBetween(String value1, String value2) {
            addCriterion("PROPOSERBIGTYPE not between", value1, value2, "proposerbigtype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeIsNull() {
            addCriterion("PROPOSERSMALLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeIsNotNull() {
            addCriterion("PROPOSERSMALLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeEqualTo(String value) {
            addCriterion("PROPOSERSMALLTYPE =", value, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeNotEqualTo(String value) {
            addCriterion("PROPOSERSMALLTYPE <>", value, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeGreaterThan(String value) {
            addCriterion("PROPOSERSMALLTYPE >", value, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSERSMALLTYPE >=", value, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeLessThan(String value) {
            addCriterion("PROPOSERSMALLTYPE <", value, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeLessThanOrEqualTo(String value) {
            addCriterion("PROPOSERSMALLTYPE <=", value, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeLike(String value) {
            addCriterion("PROPOSERSMALLTYPE like", value, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeNotLike(String value) {
            addCriterion("PROPOSERSMALLTYPE not like", value, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeIn(List<String> values) {
            addCriterion("PROPOSERSMALLTYPE in", values, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeNotIn(List<String> values) {
            addCriterion("PROPOSERSMALLTYPE not in", values, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeBetween(String value1, String value2) {
            addCriterion("PROPOSERSMALLTYPE between", value1, value2, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andProposersmalltypeNotBetween(String value1, String value2) {
            addCriterion("PROPOSERSMALLTYPE not between", value1, value2, "proposersmalltype");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoIsNull() {
            addCriterion("MARROWCREDENTIALNO is null");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoIsNotNull() {
            addCriterion("MARROWCREDENTIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoEqualTo(String value) {
            addCriterion("MARROWCREDENTIALNO =", value, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoNotEqualTo(String value) {
            addCriterion("MARROWCREDENTIALNO <>", value, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoGreaterThan(String value) {
            addCriterion("MARROWCREDENTIALNO >", value, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoGreaterThanOrEqualTo(String value) {
            addCriterion("MARROWCREDENTIALNO >=", value, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoLessThan(String value) {
            addCriterion("MARROWCREDENTIALNO <", value, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoLessThanOrEqualTo(String value) {
            addCriterion("MARROWCREDENTIALNO <=", value, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoLike(String value) {
            addCriterion("MARROWCREDENTIALNO like", value, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoNotLike(String value) {
            addCriterion("MARROWCREDENTIALNO not like", value, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoIn(List<String> values) {
            addCriterion("MARROWCREDENTIALNO in", values, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoNotIn(List<String> values) {
            addCriterion("MARROWCREDENTIALNO not in", values, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoBetween(String value1, String value2) {
            addCriterion("MARROWCREDENTIALNO between", value1, value2, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andMarrowcredentialnoNotBetween(String value1, String value2) {
            addCriterion("MARROWCREDENTIALNO not between", value1, value2, "marrowcredentialno");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditIsNull() {
            addCriterion("PROPOSERTYPE_CREDIT is null");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditIsNotNull() {
            addCriterion("PROPOSERTYPE_CREDIT is not null");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditEqualTo(String value) {
            addCriterion("PROPOSERTYPE_CREDIT =", value, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditNotEqualTo(String value) {
            addCriterion("PROPOSERTYPE_CREDIT <>", value, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditGreaterThan(String value) {
            addCriterion("PROPOSERTYPE_CREDIT >", value, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditGreaterThanOrEqualTo(String value) {
            addCriterion("PROPOSERTYPE_CREDIT >=", value, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditLessThan(String value) {
            addCriterion("PROPOSERTYPE_CREDIT <", value, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditLessThanOrEqualTo(String value) {
            addCriterion("PROPOSERTYPE_CREDIT <=", value, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditLike(String value) {
            addCriterion("PROPOSERTYPE_CREDIT like", value, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditNotLike(String value) {
            addCriterion("PROPOSERTYPE_CREDIT not like", value, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditIn(List<String> values) {
            addCriterion("PROPOSERTYPE_CREDIT in", values, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditNotIn(List<String> values) {
            addCriterion("PROPOSERTYPE_CREDIT not in", values, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditBetween(String value1, String value2) {
            addCriterion("PROPOSERTYPE_CREDIT between", value1, value2, "proposertypeCredit");
            return (Criteria) this;
        }

        public Criteria andProposertypeCreditNotBetween(String value1, String value2) {
            addCriterion("PROPOSERTYPE_CREDIT not between", value1, value2, "proposertypeCredit");
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