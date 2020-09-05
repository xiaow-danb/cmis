package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AntiguaranteeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AntiguaranteeExample() {
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

        public Criteria andMortgageaddrIsNull() {
            addCriterion("MORTGAGEADDR is null");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrIsNotNull() {
            addCriterion("MORTGAGEADDR is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrEqualTo(String value) {
            addCriterion("MORTGAGEADDR =", value, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrNotEqualTo(String value) {
            addCriterion("MORTGAGEADDR <>", value, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrGreaterThan(String value) {
            addCriterion("MORTGAGEADDR >", value, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrGreaterThanOrEqualTo(String value) {
            addCriterion("MORTGAGEADDR >=", value, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrLessThan(String value) {
            addCriterion("MORTGAGEADDR <", value, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrLessThanOrEqualTo(String value) {
            addCriterion("MORTGAGEADDR <=", value, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrLike(String value) {
            addCriterion("MORTGAGEADDR like", value, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrNotLike(String value) {
            addCriterion("MORTGAGEADDR not like", value, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrIn(List<String> values) {
            addCriterion("MORTGAGEADDR in", values, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrNotIn(List<String> values) {
            addCriterion("MORTGAGEADDR not in", values, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrBetween(String value1, String value2) {
            addCriterion("MORTGAGEADDR between", value1, value2, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageaddrNotBetween(String value1, String value2) {
            addCriterion("MORTGAGEADDR not between", value1, value2, "mortgageaddr");
            return (Criteria) this;
        }

        public Criteria andMortgageareaIsNull() {
            addCriterion("MORTGAGEAREA is null");
            return (Criteria) this;
        }

        public Criteria andMortgageareaIsNotNull() {
            addCriterion("MORTGAGEAREA is not null");
            return (Criteria) this;
        }

        public Criteria andMortgageareaEqualTo(Double value) {
            addCriterion("MORTGAGEAREA =", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaNotEqualTo(Double value) {
            addCriterion("MORTGAGEAREA <>", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaGreaterThan(Double value) {
            addCriterion("MORTGAGEAREA >", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaGreaterThanOrEqualTo(Double value) {
            addCriterion("MORTGAGEAREA >=", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaLessThan(Double value) {
            addCriterion("MORTGAGEAREA <", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaLessThanOrEqualTo(Double value) {
            addCriterion("MORTGAGEAREA <=", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaIn(List<Double> values) {
            addCriterion("MORTGAGEAREA in", values, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaNotIn(List<Double> values) {
            addCriterion("MORTGAGEAREA not in", values, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaBetween(Double value1, Double value2) {
            addCriterion("MORTGAGEAREA between", value1, value2, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaNotBetween(Double value1, Double value2) {
            addCriterion("MORTGAGEAREA not between", value1, value2, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeIsNull() {
            addCriterion("ANTIGUARANTEETYPE is null");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeIsNotNull() {
            addCriterion("ANTIGUARANTEETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeEqualTo(String value) {
            addCriterion("ANTIGUARANTEETYPE =", value, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeNotEqualTo(String value) {
            addCriterion("ANTIGUARANTEETYPE <>", value, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeGreaterThan(String value) {
            addCriterion("ANTIGUARANTEETYPE >", value, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeGreaterThanOrEqualTo(String value) {
            addCriterion("ANTIGUARANTEETYPE >=", value, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeLessThan(String value) {
            addCriterion("ANTIGUARANTEETYPE <", value, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeLessThanOrEqualTo(String value) {
            addCriterion("ANTIGUARANTEETYPE <=", value, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeLike(String value) {
            addCriterion("ANTIGUARANTEETYPE like", value, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeNotLike(String value) {
            addCriterion("ANTIGUARANTEETYPE not like", value, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeIn(List<String> values) {
            addCriterion("ANTIGUARANTEETYPE in", values, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeNotIn(List<String> values) {
            addCriterion("ANTIGUARANTEETYPE not in", values, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeBetween(String value1, String value2) {
            addCriterion("ANTIGUARANTEETYPE between", value1, value2, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAntiguaranteetypeNotBetween(String value1, String value2) {
            addCriterion("ANTIGUARANTEETYPE not between", value1, value2, "antiguaranteetype");
            return (Criteria) this;
        }

        public Criteria andAssessvalueIsNull() {
            addCriterion("ASSESSVALUE is null");
            return (Criteria) this;
        }

        public Criteria andAssessvalueIsNotNull() {
            addCriterion("ASSESSVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andAssessvalueEqualTo(BigDecimal value) {
            addCriterion("ASSESSVALUE =", value, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueNotEqualTo(BigDecimal value) {
            addCriterion("ASSESSVALUE <>", value, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueGreaterThan(BigDecimal value) {
            addCriterion("ASSESSVALUE >", value, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSESSVALUE >=", value, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueLessThan(BigDecimal value) {
            addCriterion("ASSESSVALUE <", value, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSESSVALUE <=", value, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueIn(List<BigDecimal> values) {
            addCriterion("ASSESSVALUE in", values, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueNotIn(List<BigDecimal> values) {
            addCriterion("ASSESSVALUE not in", values, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSESSVALUE between", value1, value2, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssessvalueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSESSVALUE not between", value1, value2, "assessvalue");
            return (Criteria) this;
        }

        public Criteria andAssetownershipIsNull() {
            addCriterion("ASSETOWNERSHIP is null");
            return (Criteria) this;
        }

        public Criteria andAssetownershipIsNotNull() {
            addCriterion("ASSETOWNERSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andAssetownershipEqualTo(String value) {
            addCriterion("ASSETOWNERSHIP =", value, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipNotEqualTo(String value) {
            addCriterion("ASSETOWNERSHIP <>", value, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipGreaterThan(String value) {
            addCriterion("ASSETOWNERSHIP >", value, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETOWNERSHIP >=", value, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipLessThan(String value) {
            addCriterion("ASSETOWNERSHIP <", value, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipLessThanOrEqualTo(String value) {
            addCriterion("ASSETOWNERSHIP <=", value, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipLike(String value) {
            addCriterion("ASSETOWNERSHIP like", value, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipNotLike(String value) {
            addCriterion("ASSETOWNERSHIP not like", value, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipIn(List<String> values) {
            addCriterion("ASSETOWNERSHIP in", values, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipNotIn(List<String> values) {
            addCriterion("ASSETOWNERSHIP not in", values, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipBetween(String value1, String value2) {
            addCriterion("ASSETOWNERSHIP between", value1, value2, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssetownershipNotBetween(String value1, String value2) {
            addCriterion("ASSETOWNERSHIP not between", value1, value2, "assetownership");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNull() {
            addCriterion("ASSETTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNotNull() {
            addCriterion("ASSETTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssettypeEqualTo(String value) {
            addCriterion("ASSETTYPE =", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotEqualTo(String value) {
            addCriterion("ASSETTYPE <>", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThan(String value) {
            addCriterion("ASSETTYPE >", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETTYPE >=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThan(String value) {
            addCriterion("ASSETTYPE <", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThanOrEqualTo(String value) {
            addCriterion("ASSETTYPE <=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLike(String value) {
            addCriterion("ASSETTYPE like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotLike(String value) {
            addCriterion("ASSETTYPE not like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeIn(List<String> values) {
            addCriterion("ASSETTYPE in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotIn(List<String> values) {
            addCriterion("ASSETTYPE not in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeBetween(String value1, String value2) {
            addCriterion("ASSETTYPE between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotBetween(String value1, String value2) {
            addCriterion("ASSETTYPE not between", value1, value2, "assettype");
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

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("CREATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("CREATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(BigDecimal value) {
            addCriterion("CREATIONTIME =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(BigDecimal value) {
            addCriterion("CREATIONTIME <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(BigDecimal value) {
            addCriterion("CREATIONTIME >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATIONTIME >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(BigDecimal value) {
            addCriterion("CREATIONTIME <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATIONTIME <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<BigDecimal> values) {
            addCriterion("CREATIONTIME in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<BigDecimal> values) {
            addCriterion("CREATIONTIME not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATIONTIME between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATIONTIME not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("DEPOSIT is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("DEPOSIT is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(BigDecimal value) {
            addCriterion("DEPOSIT >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(BigDecimal value) {
            addCriterion("DEPOSIT <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPOSIT <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<BigDecimal> values) {
            addCriterion("DEPOSIT not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPOSIT not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("DUTY is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("DUTY =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("DUTY <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("DUTY >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("DUTY <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("DUTY <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("DUTY like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("DUTY not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("DUTY in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("DUTY not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("DUTY between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("DUTY not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andGuarantorIsNull() {
            addCriterion("GUARANTOR is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorIsNotNull() {
            addCriterion("GUARANTOR is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorEqualTo(String value) {
            addCriterion("GUARANTOR =", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotEqualTo(String value) {
            addCriterion("GUARANTOR <>", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorGreaterThan(String value) {
            addCriterion("GUARANTOR >", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTOR >=", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLessThan(String value) {
            addCriterion("GUARANTOR <", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLessThanOrEqualTo(String value) {
            addCriterion("GUARANTOR <=", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorLike(String value) {
            addCriterion("GUARANTOR like", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotLike(String value) {
            addCriterion("GUARANTOR not like", value, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorIn(List<String> values) {
            addCriterion("GUARANTOR in", values, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotIn(List<String> values) {
            addCriterion("GUARANTOR not in", values, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorBetween(String value1, String value2) {
            addCriterion("GUARANTOR between", value1, value2, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantorNotBetween(String value1, String value2) {
            addCriterion("GUARANTOR not between", value1, value2, "guarantor");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoIsNull() {
            addCriterion("GUARANTORIDCARDNO is null");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoIsNotNull() {
            addCriterion("GUARANTORIDCARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoEqualTo(String value) {
            addCriterion("GUARANTORIDCARDNO =", value, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoNotEqualTo(String value) {
            addCriterion("GUARANTORIDCARDNO <>", value, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoGreaterThan(String value) {
            addCriterion("GUARANTORIDCARDNO >", value, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORIDCARDNO >=", value, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoLessThan(String value) {
            addCriterion("GUARANTORIDCARDNO <", value, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORIDCARDNO <=", value, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoLike(String value) {
            addCriterion("GUARANTORIDCARDNO like", value, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoNotLike(String value) {
            addCriterion("GUARANTORIDCARDNO not like", value, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoIn(List<String> values) {
            addCriterion("GUARANTORIDCARDNO in", values, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoNotIn(List<String> values) {
            addCriterion("GUARANTORIDCARDNO not in", values, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoBetween(String value1, String value2) {
            addCriterion("GUARANTORIDCARDNO between", value1, value2, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantoridcardnoNotBetween(String value1, String value2) {
            addCriterion("GUARANTORIDCARDNO not between", value1, value2, "guarantoridcardno");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitIsNull() {
            addCriterion("GUARANTORWORKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitIsNotNull() {
            addCriterion("GUARANTORWORKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitEqualTo(String value) {
            addCriterion("GUARANTORWORKUNIT =", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitNotEqualTo(String value) {
            addCriterion("GUARANTORWORKUNIT <>", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitGreaterThan(String value) {
            addCriterion("GUARANTORWORKUNIT >", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORWORKUNIT >=", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitLessThan(String value) {
            addCriterion("GUARANTORWORKUNIT <", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORWORKUNIT <=", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitLike(String value) {
            addCriterion("GUARANTORWORKUNIT like", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitNotLike(String value) {
            addCriterion("GUARANTORWORKUNIT not like", value, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitIn(List<String> values) {
            addCriterion("GUARANTORWORKUNIT in", values, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitNotIn(List<String> values) {
            addCriterion("GUARANTORWORKUNIT not in", values, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitBetween(String value1, String value2) {
            addCriterion("GUARANTORWORKUNIT between", value1, value2, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andGuarantorworkunitNotBetween(String value1, String value2) {
            addCriterion("GUARANTORWORKUNIT not between", value1, value2, "guarantorworkunit");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIsNull() {
            addCriterion("MONTHLYINCOME is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIsNotNull() {
            addCriterion("MONTHLYINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeEqualTo(BigDecimal value) {
            addCriterion("MONTHLYINCOME =", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotEqualTo(BigDecimal value) {
            addCriterion("MONTHLYINCOME <>", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeGreaterThan(BigDecimal value) {
            addCriterion("MONTHLYINCOME >", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHLYINCOME >=", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeLessThan(BigDecimal value) {
            addCriterion("MONTHLYINCOME <", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTHLYINCOME <=", value, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeIn(List<BigDecimal> values) {
            addCriterion("MONTHLYINCOME in", values, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotIn(List<BigDecimal> values) {
            addCriterion("MONTHLYINCOME not in", values, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHLYINCOME between", value1, value2, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andMonthlyincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTHLYINCOME not between", value1, value2, "monthlyincome");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("OWNER is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("OWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("OWNER =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("OWNER <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("OWNER >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("OWNER >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("OWNER <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("OWNER <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("OWNER like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("OWNER not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("OWNER in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("OWNER not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("OWNER between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("OWNER not between", value1, value2, "owner");
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

        public Criteria andWarrantIsNull() {
            addCriterion("WARRANT is null");
            return (Criteria) this;
        }

        public Criteria andWarrantIsNotNull() {
            addCriterion("WARRANT is not null");
            return (Criteria) this;
        }

        public Criteria andWarrantEqualTo(String value) {
            addCriterion("WARRANT =", value, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantNotEqualTo(String value) {
            addCriterion("WARRANT <>", value, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantGreaterThan(String value) {
            addCriterion("WARRANT >", value, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantGreaterThanOrEqualTo(String value) {
            addCriterion("WARRANT >=", value, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantLessThan(String value) {
            addCriterion("WARRANT <", value, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantLessThanOrEqualTo(String value) {
            addCriterion("WARRANT <=", value, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantLike(String value) {
            addCriterion("WARRANT like", value, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantNotLike(String value) {
            addCriterion("WARRANT not like", value, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantIn(List<String> values) {
            addCriterion("WARRANT in", values, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantNotIn(List<String> values) {
            addCriterion("WARRANT not in", values, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantBetween(String value1, String value2) {
            addCriterion("WARRANT between", value1, value2, "warrant");
            return (Criteria) this;
        }

        public Criteria andWarrantNotBetween(String value1, String value2) {
            addCriterion("WARRANT not between", value1, value2, "warrant");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdIsNull() {
            addCriterion("POLICYAPPLY_ID is null");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdIsNotNull() {
            addCriterion("POLICYAPPLY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdEqualTo(String value) {
            addCriterion("POLICYAPPLY_ID =", value, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdNotEqualTo(String value) {
            addCriterion("POLICYAPPLY_ID <>", value, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdGreaterThan(String value) {
            addCriterion("POLICYAPPLY_ID >", value, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("POLICYAPPLY_ID >=", value, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdLessThan(String value) {
            addCriterion("POLICYAPPLY_ID <", value, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdLessThanOrEqualTo(String value) {
            addCriterion("POLICYAPPLY_ID <=", value, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdLike(String value) {
            addCriterion("POLICYAPPLY_ID like", value, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdNotLike(String value) {
            addCriterion("POLICYAPPLY_ID not like", value, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdIn(List<String> values) {
            addCriterion("POLICYAPPLY_ID in", values, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdNotIn(List<String> values) {
            addCriterion("POLICYAPPLY_ID not in", values, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdBetween(String value1, String value2) {
            addCriterion("POLICYAPPLY_ID between", value1, value2, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andPolicyapplyIdNotBetween(String value1, String value2) {
            addCriterion("POLICYAPPLY_ID not between", value1, value2, "policyapplyId");
            return (Criteria) this;
        }

        public Criteria andLandpropertyIsNull() {
            addCriterion("LANDPROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andLandpropertyIsNotNull() {
            addCriterion("LANDPROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andLandpropertyEqualTo(String value) {
            addCriterion("LANDPROPERTY =", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyNotEqualTo(String value) {
            addCriterion("LANDPROPERTY <>", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyGreaterThan(String value) {
            addCriterion("LANDPROPERTY >", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("LANDPROPERTY >=", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyLessThan(String value) {
            addCriterion("LANDPROPERTY <", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyLessThanOrEqualTo(String value) {
            addCriterion("LANDPROPERTY <=", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyLike(String value) {
            addCriterion("LANDPROPERTY like", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyNotLike(String value) {
            addCriterion("LANDPROPERTY not like", value, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyIn(List<String> values) {
            addCriterion("LANDPROPERTY in", values, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyNotIn(List<String> values) {
            addCriterion("LANDPROPERTY not in", values, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyBetween(String value1, String value2) {
            addCriterion("LANDPROPERTY between", value1, value2, "landproperty");
            return (Criteria) this;
        }

        public Criteria andLandpropertyNotBetween(String value1, String value2) {
            addCriterion("LANDPROPERTY not between", value1, value2, "landproperty");
            return (Criteria) this;
        }

        public Criteria andMortgagenmIsNull() {
            addCriterion("MORTGAGENM is null");
            return (Criteria) this;
        }

        public Criteria andMortgagenmIsNotNull() {
            addCriterion("MORTGAGENM is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagenmEqualTo(String value) {
            addCriterion("MORTGAGENM =", value, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmNotEqualTo(String value) {
            addCriterion("MORTGAGENM <>", value, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmGreaterThan(String value) {
            addCriterion("MORTGAGENM >", value, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmGreaterThanOrEqualTo(String value) {
            addCriterion("MORTGAGENM >=", value, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmLessThan(String value) {
            addCriterion("MORTGAGENM <", value, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmLessThanOrEqualTo(String value) {
            addCriterion("MORTGAGENM <=", value, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmLike(String value) {
            addCriterion("MORTGAGENM like", value, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmNotLike(String value) {
            addCriterion("MORTGAGENM not like", value, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmIn(List<String> values) {
            addCriterion("MORTGAGENM in", values, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmNotIn(List<String> values) {
            addCriterion("MORTGAGENM not in", values, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmBetween(String value1, String value2) {
            addCriterion("MORTGAGENM between", value1, value2, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andMortgagenmNotBetween(String value1, String value2) {
            addCriterion("MORTGAGENM not between", value1, value2, "mortgagenm");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitIsNull() {
            addCriterion("CONTACTWAYWORKUNIT is null");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitIsNotNull() {
            addCriterion("CONTACTWAYWORKUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitEqualTo(String value) {
            addCriterion("CONTACTWAYWORKUNIT =", value, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitNotEqualTo(String value) {
            addCriterion("CONTACTWAYWORKUNIT <>", value, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitGreaterThan(String value) {
            addCriterion("CONTACTWAYWORKUNIT >", value, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTWAYWORKUNIT >=", value, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitLessThan(String value) {
            addCriterion("CONTACTWAYWORKUNIT <", value, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitLessThanOrEqualTo(String value) {
            addCriterion("CONTACTWAYWORKUNIT <=", value, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitLike(String value) {
            addCriterion("CONTACTWAYWORKUNIT like", value, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitNotLike(String value) {
            addCriterion("CONTACTWAYWORKUNIT not like", value, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitIn(List<String> values) {
            addCriterion("CONTACTWAYWORKUNIT in", values, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitNotIn(List<String> values) {
            addCriterion("CONTACTWAYWORKUNIT not in", values, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitBetween(String value1, String value2) {
            addCriterion("CONTACTWAYWORKUNIT between", value1, value2, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andContactwayworkunitNotBetween(String value1, String value2) {
            addCriterion("CONTACTWAYWORKUNIT not between", value1, value2, "contactwayworkunit");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeIsNull() {
            addCriterion("INDUSTRYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeIsNotNull() {
            addCriterion("INDUSTRYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeEqualTo(String value) {
            addCriterion("INDUSTRYTYPE =", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeNotEqualTo(String value) {
            addCriterion("INDUSTRYTYPE <>", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeGreaterThan(String value) {
            addCriterion("INDUSTRYTYPE >", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRYTYPE >=", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeLessThan(String value) {
            addCriterion("INDUSTRYTYPE <", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRYTYPE <=", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeLike(String value) {
            addCriterion("INDUSTRYTYPE like", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeNotLike(String value) {
            addCriterion("INDUSTRYTYPE not like", value, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeIn(List<String> values) {
            addCriterion("INDUSTRYTYPE in", values, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeNotIn(List<String> values) {
            addCriterion("INDUSTRYTYPE not in", values, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeBetween(String value1, String value2) {
            addCriterion("INDUSTRYTYPE between", value1, value2, "industrytype");
            return (Criteria) this;
        }

        public Criteria andIndustrytypeNotBetween(String value1, String value2) {
            addCriterion("INDUSTRYTYPE not between", value1, value2, "industrytype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeIsNull() {
            addCriterion("WORKUNITTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeIsNotNull() {
            addCriterion("WORKUNITTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeEqualTo(String value) {
            addCriterion("WORKUNITTYPE =", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeNotEqualTo(String value) {
            addCriterion("WORKUNITTYPE <>", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeGreaterThan(String value) {
            addCriterion("WORKUNITTYPE >", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKUNITTYPE >=", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeLessThan(String value) {
            addCriterion("WORKUNITTYPE <", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeLessThanOrEqualTo(String value) {
            addCriterion("WORKUNITTYPE <=", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeLike(String value) {
            addCriterion("WORKUNITTYPE like", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeNotLike(String value) {
            addCriterion("WORKUNITTYPE not like", value, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeIn(List<String> values) {
            addCriterion("WORKUNITTYPE in", values, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeNotIn(List<String> values) {
            addCriterion("WORKUNITTYPE not in", values, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeBetween(String value1, String value2) {
            addCriterion("WORKUNITTYPE between", value1, value2, "workunittype");
            return (Criteria) this;
        }

        public Criteria andWorkunittypeNotBetween(String value1, String value2) {
            addCriterion("WORKUNITTYPE not between", value1, value2, "workunittype");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNull() {
            addCriterion("PURCHASEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIsNotNull() {
            addCriterion("PURCHASEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountEqualTo(BigDecimal value) {
            addCriterion("PURCHASEAMOUNT =", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASEAMOUNT <>", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThan(BigDecimal value) {
            addCriterion("PURCHASEAMOUNT >", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASEAMOUNT >=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThan(BigDecimal value) {
            addCriterion("PURCHASEAMOUNT <", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASEAMOUNT <=", value, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountIn(List<BigDecimal> values) {
            addCriterion("PURCHASEAMOUNT in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASEAMOUNT not in", values, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASEAMOUNT between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchaseamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASEAMOUNT not between", value1, value2, "purchaseamount");
            return (Criteria) this;
        }

        public Criteria andPurchasedateIsNull() {
            addCriterion("PURCHASEDATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchasedateIsNotNull() {
            addCriterion("PURCHASEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasedateEqualTo(BigDecimal value) {
            addCriterion("PURCHASEDATE =", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateNotEqualTo(BigDecimal value) {
            addCriterion("PURCHASEDATE <>", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateGreaterThan(BigDecimal value) {
            addCriterion("PURCHASEDATE >", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASEDATE >=", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateLessThan(BigDecimal value) {
            addCriterion("PURCHASEDATE <", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PURCHASEDATE <=", value, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateIn(List<BigDecimal> values) {
            addCriterion("PURCHASEDATE in", values, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateNotIn(List<BigDecimal> values) {
            addCriterion("PURCHASEDATE not in", values, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASEDATE between", value1, value2, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andPurchasedateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PURCHASEDATE not between", value1, value2, "purchasedate");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdIsNull() {
            addCriterion("BELONGCOUNTY_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdIsNotNull() {
            addCriterion("BELONGCOUNTY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdEqualTo(String value) {
            addCriterion("BELONGCOUNTY_ID =", value, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdNotEqualTo(String value) {
            addCriterion("BELONGCOUNTY_ID <>", value, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdGreaterThan(String value) {
            addCriterion("BELONGCOUNTY_ID >", value, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGCOUNTY_ID >=", value, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdLessThan(String value) {
            addCriterion("BELONGCOUNTY_ID <", value, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdLessThanOrEqualTo(String value) {
            addCriterion("BELONGCOUNTY_ID <=", value, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdLike(String value) {
            addCriterion("BELONGCOUNTY_ID like", value, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdNotLike(String value) {
            addCriterion("BELONGCOUNTY_ID not like", value, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdIn(List<String> values) {
            addCriterion("BELONGCOUNTY_ID in", values, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdNotIn(List<String> values) {
            addCriterion("BELONGCOUNTY_ID not in", values, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdBetween(String value1, String value2) {
            addCriterion("BELONGCOUNTY_ID between", value1, value2, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongcountyIdNotBetween(String value1, String value2) {
            addCriterion("BELONGCOUNTY_ID not between", value1, value2, "belongcountyId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdIsNull() {
            addCriterion("BELONGSTREET_ID is null");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdIsNotNull() {
            addCriterion("BELONGSTREET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdEqualTo(String value) {
            addCriterion("BELONGSTREET_ID =", value, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdNotEqualTo(String value) {
            addCriterion("BELONGSTREET_ID <>", value, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdGreaterThan(String value) {
            addCriterion("BELONGSTREET_ID >", value, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGSTREET_ID >=", value, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdLessThan(String value) {
            addCriterion("BELONGSTREET_ID <", value, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdLessThanOrEqualTo(String value) {
            addCriterion("BELONGSTREET_ID <=", value, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdLike(String value) {
            addCriterion("BELONGSTREET_ID like", value, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdNotLike(String value) {
            addCriterion("BELONGSTREET_ID not like", value, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdIn(List<String> values) {
            addCriterion("BELONGSTREET_ID in", values, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdNotIn(List<String> values) {
            addCriterion("BELONGSTREET_ID not in", values, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdBetween(String value1, String value2) {
            addCriterion("BELONGSTREET_ID between", value1, value2, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andBelongstreetIdNotBetween(String value1, String value2) {
            addCriterion("BELONGSTREET_ID not between", value1, value2, "belongstreetId");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrIsNull() {
            addCriterion("GUARANTORADDR is null");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrIsNotNull() {
            addCriterion("GUARANTORADDR is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrEqualTo(String value) {
            addCriterion("GUARANTORADDR =", value, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrNotEqualTo(String value) {
            addCriterion("GUARANTORADDR <>", value, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrGreaterThan(String value) {
            addCriterion("GUARANTORADDR >", value, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORADDR >=", value, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrLessThan(String value) {
            addCriterion("GUARANTORADDR <", value, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORADDR <=", value, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrLike(String value) {
            addCriterion("GUARANTORADDR like", value, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrNotLike(String value) {
            addCriterion("GUARANTORADDR not like", value, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrIn(List<String> values) {
            addCriterion("GUARANTORADDR in", values, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrNotIn(List<String> values) {
            addCriterion("GUARANTORADDR not in", values, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrBetween(String value1, String value2) {
            addCriterion("GUARANTORADDR between", value1, value2, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantoraddrNotBetween(String value1, String value2) {
            addCriterion("GUARANTORADDR not between", value1, value2, "guarantoraddr");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeIsNull() {
            addCriterion("GUARANTORTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeIsNotNull() {
            addCriterion("GUARANTORTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeEqualTo(String value) {
            addCriterion("GUARANTORTYPE =", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeNotEqualTo(String value) {
            addCriterion("GUARANTORTYPE <>", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeGreaterThan(String value) {
            addCriterion("GUARANTORTYPE >", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORTYPE >=", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeLessThan(String value) {
            addCriterion("GUARANTORTYPE <", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORTYPE <=", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeLike(String value) {
            addCriterion("GUARANTORTYPE like", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeNotLike(String value) {
            addCriterion("GUARANTORTYPE not like", value, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeIn(List<String> values) {
            addCriterion("GUARANTORTYPE in", values, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeNotIn(List<String> values) {
            addCriterion("GUARANTORTYPE not in", values, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeBetween(String value1, String value2) {
            addCriterion("GUARANTORTYPE between", value1, value2, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andGuarantortypeNotBetween(String value1, String value2) {
            addCriterion("GUARANTORTYPE not between", value1, value2, "guarantortype");
            return (Criteria) this;
        }

        public Criteria andCollateralareaIsNull() {
            addCriterion("COLLATERALAREA is null");
            return (Criteria) this;
        }

        public Criteria andCollateralareaIsNotNull() {
            addCriterion("COLLATERALAREA is not null");
            return (Criteria) this;
        }

        public Criteria andCollateralareaEqualTo(String value) {
            addCriterion("COLLATERALAREA =", value, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaNotEqualTo(String value) {
            addCriterion("COLLATERALAREA <>", value, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaGreaterThan(String value) {
            addCriterion("COLLATERALAREA >", value, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaGreaterThanOrEqualTo(String value) {
            addCriterion("COLLATERALAREA >=", value, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaLessThan(String value) {
            addCriterion("COLLATERALAREA <", value, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaLessThanOrEqualTo(String value) {
            addCriterion("COLLATERALAREA <=", value, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaLike(String value) {
            addCriterion("COLLATERALAREA like", value, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaNotLike(String value) {
            addCriterion("COLLATERALAREA not like", value, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaIn(List<String> values) {
            addCriterion("COLLATERALAREA in", values, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaNotIn(List<String> values) {
            addCriterion("COLLATERALAREA not in", values, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaBetween(String value1, String value2) {
            addCriterion("COLLATERALAREA between", value1, value2, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralareaNotBetween(String value1, String value2) {
            addCriterion("COLLATERALAREA not between", value1, value2, "collateralarea");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoIsNull() {
            addCriterion("COLLATERALPERSONIDNO is null");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoIsNotNull() {
            addCriterion("COLLATERALPERSONIDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoEqualTo(String value) {
            addCriterion("COLLATERALPERSONIDNO =", value, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoNotEqualTo(String value) {
            addCriterion("COLLATERALPERSONIDNO <>", value, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoGreaterThan(String value) {
            addCriterion("COLLATERALPERSONIDNO >", value, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoGreaterThanOrEqualTo(String value) {
            addCriterion("COLLATERALPERSONIDNO >=", value, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoLessThan(String value) {
            addCriterion("COLLATERALPERSONIDNO <", value, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoLessThanOrEqualTo(String value) {
            addCriterion("COLLATERALPERSONIDNO <=", value, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoLike(String value) {
            addCriterion("COLLATERALPERSONIDNO like", value, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoNotLike(String value) {
            addCriterion("COLLATERALPERSONIDNO not like", value, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoIn(List<String> values) {
            addCriterion("COLLATERALPERSONIDNO in", values, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoNotIn(List<String> values) {
            addCriterion("COLLATERALPERSONIDNO not in", values, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoBetween(String value1, String value2) {
            addCriterion("COLLATERALPERSONIDNO between", value1, value2, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonidnoNotBetween(String value1, String value2) {
            addCriterion("COLLATERALPERSONIDNO not between", value1, value2, "collateralpersonidno");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneIsNull() {
            addCriterion("COLLATERALPERSONPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneIsNotNull() {
            addCriterion("COLLATERALPERSONPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneEqualTo(String value) {
            addCriterion("COLLATERALPERSONPHONE =", value, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneNotEqualTo(String value) {
            addCriterion("COLLATERALPERSONPHONE <>", value, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneGreaterThan(String value) {
            addCriterion("COLLATERALPERSONPHONE >", value, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneGreaterThanOrEqualTo(String value) {
            addCriterion("COLLATERALPERSONPHONE >=", value, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneLessThan(String value) {
            addCriterion("COLLATERALPERSONPHONE <", value, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneLessThanOrEqualTo(String value) {
            addCriterion("COLLATERALPERSONPHONE <=", value, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneLike(String value) {
            addCriterion("COLLATERALPERSONPHONE like", value, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneNotLike(String value) {
            addCriterion("COLLATERALPERSONPHONE not like", value, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneIn(List<String> values) {
            addCriterion("COLLATERALPERSONPHONE in", values, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneNotIn(List<String> values) {
            addCriterion("COLLATERALPERSONPHONE not in", values, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneBetween(String value1, String value2) {
            addCriterion("COLLATERALPERSONPHONE between", value1, value2, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andCollateralpersonphoneNotBetween(String value1, String value2) {
            addCriterion("COLLATERALPERSONPHONE not between", value1, value2, "collateralpersonphone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardIsNull() {
            addCriterion("GUARANTORSPOUSEIDCARD is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardIsNotNull() {
            addCriterion("GUARANTORSPOUSEIDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardEqualTo(String value) {
            addCriterion("GUARANTORSPOUSEIDCARD =", value, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardNotEqualTo(String value) {
            addCriterion("GUARANTORSPOUSEIDCARD <>", value, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardGreaterThan(String value) {
            addCriterion("GUARANTORSPOUSEIDCARD >", value, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORSPOUSEIDCARD >=", value, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardLessThan(String value) {
            addCriterion("GUARANTORSPOUSEIDCARD <", value, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORSPOUSEIDCARD <=", value, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardLike(String value) {
            addCriterion("GUARANTORSPOUSEIDCARD like", value, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardNotLike(String value) {
            addCriterion("GUARANTORSPOUSEIDCARD not like", value, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardIn(List<String> values) {
            addCriterion("GUARANTORSPOUSEIDCARD in", values, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardNotIn(List<String> values) {
            addCriterion("GUARANTORSPOUSEIDCARD not in", values, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardBetween(String value1, String value2) {
            addCriterion("GUARANTORSPOUSEIDCARD between", value1, value2, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseidcardNotBetween(String value1, String value2) {
            addCriterion("GUARANTORSPOUSEIDCARD not between", value1, value2, "guarantorspouseidcard");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseIsNull() {
            addCriterion("GUARANTORSPOUSE is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseIsNotNull() {
            addCriterion("GUARANTORSPOUSE is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseEqualTo(String value) {
            addCriterion("GUARANTORSPOUSE =", value, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseNotEqualTo(String value) {
            addCriterion("GUARANTORSPOUSE <>", value, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseGreaterThan(String value) {
            addCriterion("GUARANTORSPOUSE >", value, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORSPOUSE >=", value, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseLessThan(String value) {
            addCriterion("GUARANTORSPOUSE <", value, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORSPOUSE <=", value, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseLike(String value) {
            addCriterion("GUARANTORSPOUSE like", value, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseNotLike(String value) {
            addCriterion("GUARANTORSPOUSE not like", value, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseIn(List<String> values) {
            addCriterion("GUARANTORSPOUSE in", values, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseNotIn(List<String> values) {
            addCriterion("GUARANTORSPOUSE not in", values, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseBetween(String value1, String value2) {
            addCriterion("GUARANTORSPOUSE between", value1, value2, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspouseNotBetween(String value1, String value2) {
            addCriterion("GUARANTORSPOUSE not between", value1, value2, "guarantorspouse");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneIsNull() {
            addCriterion("GUARANTORSPOUSEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneIsNotNull() {
            addCriterion("GUARANTORSPOUSEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneEqualTo(String value) {
            addCriterion("GUARANTORSPOUSEPHONE =", value, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneNotEqualTo(String value) {
            addCriterion("GUARANTORSPOUSEPHONE <>", value, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneGreaterThan(String value) {
            addCriterion("GUARANTORSPOUSEPHONE >", value, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneGreaterThanOrEqualTo(String value) {
            addCriterion("GUARANTORSPOUSEPHONE >=", value, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneLessThan(String value) {
            addCriterion("GUARANTORSPOUSEPHONE <", value, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneLessThanOrEqualTo(String value) {
            addCriterion("GUARANTORSPOUSEPHONE <=", value, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneLike(String value) {
            addCriterion("GUARANTORSPOUSEPHONE like", value, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneNotLike(String value) {
            addCriterion("GUARANTORSPOUSEPHONE not like", value, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneIn(List<String> values) {
            addCriterion("GUARANTORSPOUSEPHONE in", values, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneNotIn(List<String> values) {
            addCriterion("GUARANTORSPOUSEPHONE not in", values, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneBetween(String value1, String value2) {
            addCriterion("GUARANTORSPOUSEPHONE between", value1, value2, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantorspousephoneNotBetween(String value1, String value2) {
            addCriterion("GUARANTORSPOUSEPHONE not between", value1, value2, "guarantorspousephone");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeIsNull() {
            addCriterion("GUARANTORYEARINCOME is null");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeIsNotNull() {
            addCriterion("GUARANTORYEARINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeEqualTo(BigDecimal value) {
            addCriterion("GUARANTORYEARINCOME =", value, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeNotEqualTo(BigDecimal value) {
            addCriterion("GUARANTORYEARINCOME <>", value, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeGreaterThan(BigDecimal value) {
            addCriterion("GUARANTORYEARINCOME >", value, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTORYEARINCOME >=", value, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeLessThan(BigDecimal value) {
            addCriterion("GUARANTORYEARINCOME <", value, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GUARANTORYEARINCOME <=", value, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeIn(List<BigDecimal> values) {
            addCriterion("GUARANTORYEARINCOME in", values, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeNotIn(List<BigDecimal> values) {
            addCriterion("GUARANTORYEARINCOME not in", values, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTORYEARINCOME between", value1, value2, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andGuarantoryearincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GUARANTORYEARINCOME not between", value1, value2, "guarantoryearincome");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidIsNull() {
            addCriterion("BELONGCOUNTYID is null");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidIsNotNull() {
            addCriterion("BELONGCOUNTYID is not null");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidEqualTo(String value) {
            addCriterion("BELONGCOUNTYID =", value, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidNotEqualTo(String value) {
            addCriterion("BELONGCOUNTYID <>", value, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidGreaterThan(String value) {
            addCriterion("BELONGCOUNTYID >", value, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGCOUNTYID >=", value, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidLessThan(String value) {
            addCriterion("BELONGCOUNTYID <", value, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidLessThanOrEqualTo(String value) {
            addCriterion("BELONGCOUNTYID <=", value, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidLike(String value) {
            addCriterion("BELONGCOUNTYID like", value, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidNotLike(String value) {
            addCriterion("BELONGCOUNTYID not like", value, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidIn(List<String> values) {
            addCriterion("BELONGCOUNTYID in", values, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidNotIn(List<String> values) {
            addCriterion("BELONGCOUNTYID not in", values, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidBetween(String value1, String value2) {
            addCriterion("BELONGCOUNTYID between", value1, value2, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andBelongcountyidNotBetween(String value1, String value2) {
            addCriterion("BELONGCOUNTYID not between", value1, value2, "belongcountyid");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayIsNull() {
            addCriterion("SOCIALSECURITYPAY is null");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayIsNotNull() {
            addCriterion("SOCIALSECURITYPAY is not null");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayEqualTo(BigDecimal value) {
            addCriterion("SOCIALSECURITYPAY =", value, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayNotEqualTo(BigDecimal value) {
            addCriterion("SOCIALSECURITYPAY <>", value, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayGreaterThan(BigDecimal value) {
            addCriterion("SOCIALSECURITYPAY >", value, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOCIALSECURITYPAY >=", value, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayLessThan(BigDecimal value) {
            addCriterion("SOCIALSECURITYPAY <", value, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOCIALSECURITYPAY <=", value, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayIn(List<BigDecimal> values) {
            addCriterion("SOCIALSECURITYPAY in", values, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayNotIn(List<BigDecimal> values) {
            addCriterion("SOCIALSECURITYPAY not in", values, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOCIALSECURITYPAY between", value1, value2, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andSocialsecuritypayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOCIALSECURITYPAY not between", value1, value2, "socialsecuritypay");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyIsNull() {
            addCriterion("VALUEOFGUARANTY is null");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyIsNotNull() {
            addCriterion("VALUEOFGUARANTY is not null");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyEqualTo(BigDecimal value) {
            addCriterion("VALUEOFGUARANTY =", value, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyNotEqualTo(BigDecimal value) {
            addCriterion("VALUEOFGUARANTY <>", value, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyGreaterThan(BigDecimal value) {
            addCriterion("VALUEOFGUARANTY >", value, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUEOFGUARANTY >=", value, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyLessThan(BigDecimal value) {
            addCriterion("VALUEOFGUARANTY <", value, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUEOFGUARANTY <=", value, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyIn(List<BigDecimal> values) {
            addCriterion("VALUEOFGUARANTY in", values, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyNotIn(List<BigDecimal> values) {
            addCriterion("VALUEOFGUARANTY not in", values, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUEOFGUARANTY between", value1, value2, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofguarantyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUEOFGUARANTY not between", value1, value2, "valueofguaranty");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesIsNull() {
            addCriterion("VALUEOFMORTGAGES is null");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesIsNotNull() {
            addCriterion("VALUEOFMORTGAGES is not null");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesEqualTo(BigDecimal value) {
            addCriterion("VALUEOFMORTGAGES =", value, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesNotEqualTo(BigDecimal value) {
            addCriterion("VALUEOFMORTGAGES <>", value, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesGreaterThan(BigDecimal value) {
            addCriterion("VALUEOFMORTGAGES >", value, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUEOFMORTGAGES >=", value, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesLessThan(BigDecimal value) {
            addCriterion("VALUEOFMORTGAGES <", value, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUEOFMORTGAGES <=", value, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesIn(List<BigDecimal> values) {
            addCriterion("VALUEOFMORTGAGES in", values, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesNotIn(List<BigDecimal> values) {
            addCriterion("VALUEOFMORTGAGES not in", values, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUEOFMORTGAGES between", value1, value2, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andValueofmortgagesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUEOFMORTGAGES not between", value1, value2, "valueofmortgages");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardIsNull() {
            addCriterion("MORTAGEOWNERIDCARD is null");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardIsNotNull() {
            addCriterion("MORTAGEOWNERIDCARD is not null");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardEqualTo(String value) {
            addCriterion("MORTAGEOWNERIDCARD =", value, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardNotEqualTo(String value) {
            addCriterion("MORTAGEOWNERIDCARD <>", value, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardGreaterThan(String value) {
            addCriterion("MORTAGEOWNERIDCARD >", value, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardGreaterThanOrEqualTo(String value) {
            addCriterion("MORTAGEOWNERIDCARD >=", value, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardLessThan(String value) {
            addCriterion("MORTAGEOWNERIDCARD <", value, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardLessThanOrEqualTo(String value) {
            addCriterion("MORTAGEOWNERIDCARD <=", value, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardLike(String value) {
            addCriterion("MORTAGEOWNERIDCARD like", value, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardNotLike(String value) {
            addCriterion("MORTAGEOWNERIDCARD not like", value, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardIn(List<String> values) {
            addCriterion("MORTAGEOWNERIDCARD in", values, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardNotIn(List<String> values) {
            addCriterion("MORTAGEOWNERIDCARD not in", values, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardBetween(String value1, String value2) {
            addCriterion("MORTAGEOWNERIDCARD between", value1, value2, "mortageowneridcard");
            return (Criteria) this;
        }

        public Criteria andMortageowneridcardNotBetween(String value1, String value2) {
            addCriterion("MORTAGEOWNERIDCARD not between", value1, value2, "mortageowneridcard");
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