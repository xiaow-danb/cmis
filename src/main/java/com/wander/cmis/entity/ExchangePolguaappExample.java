package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchangePolguaappExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangePolguaappExample() {
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

        public Criteria andExchangeTypeIsNull() {
            addCriterion("EXCHANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNotNull() {
            addCriterion("EXCHANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE =", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE <>", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThan(String value) {
            addCriterion("EXCHANGE_TYPE >", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE >=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThan(String value) {
            addCriterion("EXCHANGE_TYPE <", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE <=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLike(String value) {
            addCriterion("EXCHANGE_TYPE like", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotLike(String value) {
            addCriterion("EXCHANGE_TYPE not like", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIn(List<String> values) {
            addCriterion("EXCHANGE_TYPE in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotIn(List<String> values) {
            addCriterion("EXCHANGE_TYPE not in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeBetween(String value1, String value2) {
            addCriterion("EXCHANGE_TYPE between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_TYPE not between", value1, value2, "exchangeType");
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

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
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

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
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

        public Criteria andIsmircoenterpriseIsNull() {
            addCriterion("ISMIRCOENTERPRISE is null");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseIsNotNull() {
            addCriterion("ISMIRCOENTERPRISE is not null");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseEqualTo(String value) {
            addCriterion("ISMIRCOENTERPRISE =", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseNotEqualTo(String value) {
            addCriterion("ISMIRCOENTERPRISE <>", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseGreaterThan(String value) {
            addCriterion("ISMIRCOENTERPRISE >", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("ISMIRCOENTERPRISE >=", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseLessThan(String value) {
            addCriterion("ISMIRCOENTERPRISE <", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseLessThanOrEqualTo(String value) {
            addCriterion("ISMIRCOENTERPRISE <=", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseLike(String value) {
            addCriterion("ISMIRCOENTERPRISE like", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseNotLike(String value) {
            addCriterion("ISMIRCOENTERPRISE not like", value, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseIn(List<String> values) {
            addCriterion("ISMIRCOENTERPRISE in", values, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseNotIn(List<String> values) {
            addCriterion("ISMIRCOENTERPRISE not in", values, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseBetween(String value1, String value2) {
            addCriterion("ISMIRCOENTERPRISE between", value1, value2, "ismircoenterprise");
            return (Criteria) this;
        }

        public Criteria andIsmircoenterpriseNotBetween(String value1, String value2) {
            addCriterion("ISMIRCOENTERPRISE not between", value1, value2, "ismircoenterprise");
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

        public Criteria andRegistdateEqualTo(String value) {
            addCriterion("REGISTDATE =", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotEqualTo(String value) {
            addCriterion("REGISTDATE <>", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThan(String value) {
            addCriterion("REGISTDATE >", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTDATE >=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThan(String value) {
            addCriterion("REGISTDATE <", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThanOrEqualTo(String value) {
            addCriterion("REGISTDATE <=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLike(String value) {
            addCriterion("REGISTDATE like", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotLike(String value) {
            addCriterion("REGISTDATE not like", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateIn(List<String> values) {
            addCriterion("REGISTDATE in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotIn(List<String> values) {
            addCriterion("REGISTDATE not in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateBetween(String value1, String value2) {
            addCriterion("REGISTDATE between", value1, value2, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotBetween(String value1, String value2) {
            addCriterion("REGISTDATE not between", value1, value2, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsIsNull() {
            addCriterion("REGISTERFUNDS is null");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsIsNotNull() {
            addCriterion("REGISTERFUNDS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsEqualTo(BigDecimal value) {
            addCriterion("REGISTERFUNDS =", value, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsNotEqualTo(BigDecimal value) {
            addCriterion("REGISTERFUNDS <>", value, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsGreaterThan(BigDecimal value) {
            addCriterion("REGISTERFUNDS >", value, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REGISTERFUNDS >=", value, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsLessThan(BigDecimal value) {
            addCriterion("REGISTERFUNDS <", value, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REGISTERFUNDS <=", value, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsIn(List<BigDecimal> values) {
            addCriterion("REGISTERFUNDS in", values, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsNotIn(List<BigDecimal> values) {
            addCriterion("REGISTERFUNDS not in", values, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGISTERFUNDS between", value1, value2, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andRegisterfundsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REGISTERFUNDS not between", value1, value2, "registerfunds");
            return (Criteria) this;
        }

        public Criteria andLegalnmIsNull() {
            addCriterion("LEGALNM is null");
            return (Criteria) this;
        }

        public Criteria andLegalnmIsNotNull() {
            addCriterion("LEGALNM is not null");
            return (Criteria) this;
        }

        public Criteria andLegalnmEqualTo(String value) {
            addCriterion("LEGALNM =", value, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmNotEqualTo(String value) {
            addCriterion("LEGALNM <>", value, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmGreaterThan(String value) {
            addCriterion("LEGALNM >", value, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALNM >=", value, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmLessThan(String value) {
            addCriterion("LEGALNM <", value, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmLessThanOrEqualTo(String value) {
            addCriterion("LEGALNM <=", value, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmLike(String value) {
            addCriterion("LEGALNM like", value, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmNotLike(String value) {
            addCriterion("LEGALNM not like", value, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmIn(List<String> values) {
            addCriterion("LEGALNM in", values, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmNotIn(List<String> values) {
            addCriterion("LEGALNM not in", values, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmBetween(String value1, String value2) {
            addCriterion("LEGALNM between", value1, value2, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalnmNotBetween(String value1, String value2) {
            addCriterion("LEGALNM not between", value1, value2, "legalnm");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneIsNull() {
            addCriterion("LEGALCELLPHONE is null");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneIsNotNull() {
            addCriterion("LEGALCELLPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneEqualTo(String value) {
            addCriterion("LEGALCELLPHONE =", value, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneNotEqualTo(String value) {
            addCriterion("LEGALCELLPHONE <>", value, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneGreaterThan(String value) {
            addCriterion("LEGALCELLPHONE >", value, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALCELLPHONE >=", value, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneLessThan(String value) {
            addCriterion("LEGALCELLPHONE <", value, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneLessThanOrEqualTo(String value) {
            addCriterion("LEGALCELLPHONE <=", value, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneLike(String value) {
            addCriterion("LEGALCELLPHONE like", value, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneNotLike(String value) {
            addCriterion("LEGALCELLPHONE not like", value, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneIn(List<String> values) {
            addCriterion("LEGALCELLPHONE in", values, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneNotIn(List<String> values) {
            addCriterion("LEGALCELLPHONE not in", values, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneBetween(String value1, String value2) {
            addCriterion("LEGALCELLPHONE between", value1, value2, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcellphoneNotBetween(String value1, String value2) {
            addCriterion("LEGALCELLPHONE not between", value1, value2, "legalcellphone");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoIsNull() {
            addCriterion("LEGALCREDENTIALNO is null");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoIsNotNull() {
            addCriterion("LEGALCREDENTIALNO is not null");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoEqualTo(String value) {
            addCriterion("LEGALCREDENTIALNO =", value, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoNotEqualTo(String value) {
            addCriterion("LEGALCREDENTIALNO <>", value, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoGreaterThan(String value) {
            addCriterion("LEGALCREDENTIALNO >", value, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALCREDENTIALNO >=", value, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoLessThan(String value) {
            addCriterion("LEGALCREDENTIALNO <", value, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoLessThanOrEqualTo(String value) {
            addCriterion("LEGALCREDENTIALNO <=", value, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoLike(String value) {
            addCriterion("LEGALCREDENTIALNO like", value, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoNotLike(String value) {
            addCriterion("LEGALCREDENTIALNO not like", value, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoIn(List<String> values) {
            addCriterion("LEGALCREDENTIALNO in", values, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoNotIn(List<String> values) {
            addCriterion("LEGALCREDENTIALNO not in", values, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoBetween(String value1, String value2) {
            addCriterion("LEGALCREDENTIALNO between", value1, value2, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andLegalcredentialnoNotBetween(String value1, String value2) {
            addCriterion("LEGALCREDENTIALNO not between", value1, value2, "legalcredentialno");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmIsNull() {
            addCriterion("BASICBANKNM is null");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmIsNotNull() {
            addCriterion("BASICBANKNM is not null");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmEqualTo(String value) {
            addCriterion("BASICBANKNM =", value, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmNotEqualTo(String value) {
            addCriterion("BASICBANKNM <>", value, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmGreaterThan(String value) {
            addCriterion("BASICBANKNM >", value, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmGreaterThanOrEqualTo(String value) {
            addCriterion("BASICBANKNM >=", value, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmLessThan(String value) {
            addCriterion("BASICBANKNM <", value, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmLessThanOrEqualTo(String value) {
            addCriterion("BASICBANKNM <=", value, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmLike(String value) {
            addCriterion("BASICBANKNM like", value, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmNotLike(String value) {
            addCriterion("BASICBANKNM not like", value, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmIn(List<String> values) {
            addCriterion("BASICBANKNM in", values, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmNotIn(List<String> values) {
            addCriterion("BASICBANKNM not in", values, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmBetween(String value1, String value2) {
            addCriterion("BASICBANKNM between", value1, value2, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicbanknmNotBetween(String value1, String value2) {
            addCriterion("BASICBANKNM not between", value1, value2, "basicbanknm");
            return (Criteria) this;
        }

        public Criteria andBasicaccountIsNull() {
            addCriterion("BASICACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBasicaccountIsNotNull() {
            addCriterion("BASICACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBasicaccountEqualTo(String value) {
            addCriterion("BASICACCOUNT =", value, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountNotEqualTo(String value) {
            addCriterion("BASICACCOUNT <>", value, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountGreaterThan(String value) {
            addCriterion("BASICACCOUNT >", value, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountGreaterThanOrEqualTo(String value) {
            addCriterion("BASICACCOUNT >=", value, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountLessThan(String value) {
            addCriterion("BASICACCOUNT <", value, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountLessThanOrEqualTo(String value) {
            addCriterion("BASICACCOUNT <=", value, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountLike(String value) {
            addCriterion("BASICACCOUNT like", value, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountNotLike(String value) {
            addCriterion("BASICACCOUNT not like", value, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountIn(List<String> values) {
            addCriterion("BASICACCOUNT in", values, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountNotIn(List<String> values) {
            addCriterion("BASICACCOUNT not in", values, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountBetween(String value1, String value2) {
            addCriterion("BASICACCOUNT between", value1, value2, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andBasicaccountNotBetween(String value1, String value2) {
            addCriterion("BASICACCOUNT not between", value1, value2, "basicaccount");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIsNull() {
            addCriterion("TOTALASSETS is null");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIsNotNull() {
            addCriterion("TOTALASSETS is not null");
            return (Criteria) this;
        }

        public Criteria andTotalassetsEqualTo(BigDecimal value) {
            addCriterion("TOTALASSETS =", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotEqualTo(BigDecimal value) {
            addCriterion("TOTALASSETS <>", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsGreaterThan(BigDecimal value) {
            addCriterion("TOTALASSETS >", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALASSETS >=", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsLessThan(BigDecimal value) {
            addCriterion("TOTALASSETS <", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALASSETS <=", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIn(List<BigDecimal> values) {
            addCriterion("TOTALASSETS in", values, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotIn(List<BigDecimal> values) {
            addCriterion("TOTALASSETS not in", values, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALASSETS between", value1, value2, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALASSETS not between", value1, value2, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesIsNull() {
            addCriterion("TOTALBANKLIABILITIES is null");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesIsNotNull() {
            addCriterion("TOTALBANKLIABILITIES is not null");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesEqualTo(BigDecimal value) {
            addCriterion("TOTALBANKLIABILITIES =", value, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesNotEqualTo(BigDecimal value) {
            addCriterion("TOTALBANKLIABILITIES <>", value, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesGreaterThan(BigDecimal value) {
            addCriterion("TOTALBANKLIABILITIES >", value, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALBANKLIABILITIES >=", value, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesLessThan(BigDecimal value) {
            addCriterion("TOTALBANKLIABILITIES <", value, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALBANKLIABILITIES <=", value, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesIn(List<BigDecimal> values) {
            addCriterion("TOTALBANKLIABILITIES in", values, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesNotIn(List<BigDecimal> values) {
            addCriterion("TOTALBANKLIABILITIES not in", values, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALBANKLIABILITIES between", value1, value2, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalbankliabilitiesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALBANKLIABILITIES not between", value1, value2, "totalbankliabilities");
            return (Criteria) this;
        }

        public Criteria andYearincomeIsNull() {
            addCriterion("YEARINCOME is null");
            return (Criteria) this;
        }

        public Criteria andYearincomeIsNotNull() {
            addCriterion("YEARINCOME is not null");
            return (Criteria) this;
        }

        public Criteria andYearincomeEqualTo(BigDecimal value) {
            addCriterion("YEARINCOME =", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeNotEqualTo(BigDecimal value) {
            addCriterion("YEARINCOME <>", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeGreaterThan(BigDecimal value) {
            addCriterion("YEARINCOME >", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEARINCOME >=", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeLessThan(BigDecimal value) {
            addCriterion("YEARINCOME <", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEARINCOME <=", value, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeIn(List<BigDecimal> values) {
            addCriterion("YEARINCOME in", values, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeNotIn(List<BigDecimal> values) {
            addCriterion("YEARINCOME not in", values, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEARINCOME between", value1, value2, "yearincome");
            return (Criteria) this;
        }

        public Criteria andYearincomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEARINCOME not between", value1, value2, "yearincome");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroIsNull() {
            addCriterion("MAINBUSIINTRO is null");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroIsNotNull() {
            addCriterion("MAINBUSIINTRO is not null");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroEqualTo(String value) {
            addCriterion("MAINBUSIINTRO =", value, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroNotEqualTo(String value) {
            addCriterion("MAINBUSIINTRO <>", value, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroGreaterThan(String value) {
            addCriterion("MAINBUSIINTRO >", value, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroGreaterThanOrEqualTo(String value) {
            addCriterion("MAINBUSIINTRO >=", value, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroLessThan(String value) {
            addCriterion("MAINBUSIINTRO <", value, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroLessThanOrEqualTo(String value) {
            addCriterion("MAINBUSIINTRO <=", value, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroLike(String value) {
            addCriterion("MAINBUSIINTRO like", value, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroNotLike(String value) {
            addCriterion("MAINBUSIINTRO not like", value, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroIn(List<String> values) {
            addCriterion("MAINBUSIINTRO in", values, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroNotIn(List<String> values) {
            addCriterion("MAINBUSIINTRO not in", values, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroBetween(String value1, String value2) {
            addCriterion("MAINBUSIINTRO between", value1, value2, "mainbusiintro");
            return (Criteria) this;
        }

        public Criteria andMainbusiintroNotBetween(String value1, String value2) {
            addCriterion("MAINBUSIINTRO not between", value1, value2, "mainbusiintro");
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

        public Criteria andEmployeenumEqualTo(Short value) {
            addCriterion("EMPLOYEENUM =", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotEqualTo(Short value) {
            addCriterion("EMPLOYEENUM <>", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThan(Short value) {
            addCriterion("EMPLOYEENUM >", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumGreaterThanOrEqualTo(Short value) {
            addCriterion("EMPLOYEENUM >=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThan(Short value) {
            addCriterion("EMPLOYEENUM <", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumLessThanOrEqualTo(Short value) {
            addCriterion("EMPLOYEENUM <=", value, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumIn(List<Short> values) {
            addCriterion("EMPLOYEENUM in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotIn(List<Short> values) {
            addCriterion("EMPLOYEENUM not in", values, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumBetween(Short value1, Short value2) {
            addCriterion("EMPLOYEENUM between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andEmployeenumNotBetween(Short value1, Short value2) {
            addCriterion("EMPLOYEENUM not between", value1, value2, "employeenum");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNull() {
            addCriterion("TAXNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNotNull() {
            addCriterion("TAXNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnoEqualTo(String value) {
            addCriterion("TAXNO =", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotEqualTo(String value) {
            addCriterion("TAXNO <>", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThan(String value) {
            addCriterion("TAXNO >", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXNO >=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThan(String value) {
            addCriterion("TAXNO <", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThanOrEqualTo(String value) {
            addCriterion("TAXNO <=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLike(String value) {
            addCriterion("TAXNO like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotLike(String value) {
            addCriterion("TAXNO not like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoIn(List<String> values) {
            addCriterion("TAXNO in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotIn(List<String> values) {
            addCriterion("TAXNO not in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoBetween(String value1, String value2) {
            addCriterion("TAXNO between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotBetween(String value1, String value2) {
            addCriterion("TAXNO not between", value1, value2, "taxno");
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

        public Criteria andLengthofmaturityIsNull() {
            addCriterion("LENGTHOFMATURITY is null");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityIsNotNull() {
            addCriterion("LENGTHOFMATURITY is not null");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityEqualTo(Short value) {
            addCriterion("LENGTHOFMATURITY =", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityNotEqualTo(Short value) {
            addCriterion("LENGTHOFMATURITY <>", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityGreaterThan(Short value) {
            addCriterion("LENGTHOFMATURITY >", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityGreaterThanOrEqualTo(Short value) {
            addCriterion("LENGTHOFMATURITY >=", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityLessThan(Short value) {
            addCriterion("LENGTHOFMATURITY <", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityLessThanOrEqualTo(Short value) {
            addCriterion("LENGTHOFMATURITY <=", value, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityIn(List<Short> values) {
            addCriterion("LENGTHOFMATURITY in", values, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityNotIn(List<Short> values) {
            addCriterion("LENGTHOFMATURITY not in", values, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityBetween(Short value1, Short value2) {
            addCriterion("LENGTHOFMATURITY between", value1, value2, "lengthofmaturity");
            return (Criteria) this;
        }

        public Criteria andLengthofmaturityNotBetween(Short value1, Short value2) {
            addCriterion("LENGTHOFMATURITY not between", value1, value2, "lengthofmaturity");
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

        public Criteria andLoanorgnameIsNull() {
            addCriterion("LOANORGNAME is null");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameIsNotNull() {
            addCriterion("LOANORGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameEqualTo(String value) {
            addCriterion("LOANORGNAME =", value, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameNotEqualTo(String value) {
            addCriterion("LOANORGNAME <>", value, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameGreaterThan(String value) {
            addCriterion("LOANORGNAME >", value, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameGreaterThanOrEqualTo(String value) {
            addCriterion("LOANORGNAME >=", value, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameLessThan(String value) {
            addCriterion("LOANORGNAME <", value, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameLessThanOrEqualTo(String value) {
            addCriterion("LOANORGNAME <=", value, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameLike(String value) {
            addCriterion("LOANORGNAME like", value, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameNotLike(String value) {
            addCriterion("LOANORGNAME not like", value, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameIn(List<String> values) {
            addCriterion("LOANORGNAME in", values, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameNotIn(List<String> values) {
            addCriterion("LOANORGNAME not in", values, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameBetween(String value1, String value2) {
            addCriterion("LOANORGNAME between", value1, value2, "loanorgname");
            return (Criteria) this;
        }

        public Criteria andLoanorgnameNotBetween(String value1, String value2) {
            addCriterion("LOANORGNAME not between", value1, value2, "loanorgname");
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

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UPDATETIME like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UPDATETIME not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andReadtag1IsNull() {
            addCriterion("READTAG1 is null");
            return (Criteria) this;
        }

        public Criteria andReadtag1IsNotNull() {
            addCriterion("READTAG1 is not null");
            return (Criteria) this;
        }

        public Criteria andReadtag1EqualTo(Short value) {
            addCriterion("READTAG1 =", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1NotEqualTo(Short value) {
            addCriterion("READTAG1 <>", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1GreaterThan(Short value) {
            addCriterion("READTAG1 >", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1GreaterThanOrEqualTo(Short value) {
            addCriterion("READTAG1 >=", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1LessThan(Short value) {
            addCriterion("READTAG1 <", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1LessThanOrEqualTo(Short value) {
            addCriterion("READTAG1 <=", value, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1In(List<Short> values) {
            addCriterion("READTAG1 in", values, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1NotIn(List<Short> values) {
            addCriterion("READTAG1 not in", values, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1Between(Short value1, Short value2) {
            addCriterion("READTAG1 between", value1, value2, "readtag1");
            return (Criteria) this;
        }

        public Criteria andReadtag1NotBetween(Short value1, Short value2) {
            addCriterion("READTAG1 not between", value1, value2, "readtag1");
            return (Criteria) this;
        }

        public Criteria andAuditresultIsNull() {
            addCriterion("AUDITRESULT is null");
            return (Criteria) this;
        }

        public Criteria andAuditresultIsNotNull() {
            addCriterion("AUDITRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditresultEqualTo(String value) {
            addCriterion("AUDITRESULT =", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotEqualTo(String value) {
            addCriterion("AUDITRESULT <>", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultGreaterThan(String value) {
            addCriterion("AUDITRESULT >", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITRESULT >=", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultLessThan(String value) {
            addCriterion("AUDITRESULT <", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultLessThanOrEqualTo(String value) {
            addCriterion("AUDITRESULT <=", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultLike(String value) {
            addCriterion("AUDITRESULT like", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotLike(String value) {
            addCriterion("AUDITRESULT not like", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultIn(List<String> values) {
            addCriterion("AUDITRESULT in", values, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotIn(List<String> values) {
            addCriterion("AUDITRESULT not in", values, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultBetween(String value1, String value2) {
            addCriterion("AUDITRESULT between", value1, value2, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotBetween(String value1, String value2) {
            addCriterion("AUDITRESULT not between", value1, value2, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditadviceIsNull() {
            addCriterion("AUDITADVICE is null");
            return (Criteria) this;
        }

        public Criteria andAuditadviceIsNotNull() {
            addCriterion("AUDITADVICE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditadviceEqualTo(String value) {
            addCriterion("AUDITADVICE =", value, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceNotEqualTo(String value) {
            addCriterion("AUDITADVICE <>", value, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceGreaterThan(String value) {
            addCriterion("AUDITADVICE >", value, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITADVICE >=", value, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceLessThan(String value) {
            addCriterion("AUDITADVICE <", value, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceLessThanOrEqualTo(String value) {
            addCriterion("AUDITADVICE <=", value, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceLike(String value) {
            addCriterion("AUDITADVICE like", value, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceNotLike(String value) {
            addCriterion("AUDITADVICE not like", value, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceIn(List<String> values) {
            addCriterion("AUDITADVICE in", values, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceNotIn(List<String> values) {
            addCriterion("AUDITADVICE not in", values, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceBetween(String value1, String value2) {
            addCriterion("AUDITADVICE between", value1, value2, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditadviceNotBetween(String value1, String value2) {
            addCriterion("AUDITADVICE not between", value1, value2, "auditadvice");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNull() {
            addCriterion("AUDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andAuditdateIsNotNull() {
            addCriterion("AUDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditdateEqualTo(String value) {
            addCriterion("AUDITDATE =", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotEqualTo(String value) {
            addCriterion("AUDITDATE <>", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThan(String value) {
            addCriterion("AUDITDATE >", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITDATE >=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThan(String value) {
            addCriterion("AUDITDATE <", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLessThanOrEqualTo(String value) {
            addCriterion("AUDITDATE <=", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateLike(String value) {
            addCriterion("AUDITDATE like", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotLike(String value) {
            addCriterion("AUDITDATE not like", value, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateIn(List<String> values) {
            addCriterion("AUDITDATE in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotIn(List<String> values) {
            addCriterion("AUDITDATE not in", values, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateBetween(String value1, String value2) {
            addCriterion("AUDITDATE between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andAuditdateNotBetween(String value1, String value2) {
            addCriterion("AUDITDATE not between", value1, value2, "auditdate");
            return (Criteria) this;
        }

        public Criteria andJyidIsNull() {
            addCriterion("JYID is null");
            return (Criteria) this;
        }

        public Criteria andJyidIsNotNull() {
            addCriterion("JYID is not null");
            return (Criteria) this;
        }

        public Criteria andJyidEqualTo(String value) {
            addCriterion("JYID =", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotEqualTo(String value) {
            addCriterion("JYID <>", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThan(String value) {
            addCriterion("JYID >", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidGreaterThanOrEqualTo(String value) {
            addCriterion("JYID >=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThan(String value) {
            addCriterion("JYID <", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLessThanOrEqualTo(String value) {
            addCriterion("JYID <=", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidLike(String value) {
            addCriterion("JYID like", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotLike(String value) {
            addCriterion("JYID not like", value, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidIn(List<String> values) {
            addCriterion("JYID in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotIn(List<String> values) {
            addCriterion("JYID not in", values, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidBetween(String value1, String value2) {
            addCriterion("JYID between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andJyidNotBetween(String value1, String value2) {
            addCriterion("JYID not between", value1, value2, "jyid");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1IsNull() {
            addCriterion("XWDREADTAG1 is null");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1IsNotNull() {
            addCriterion("XWDREADTAG1 is not null");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1EqualTo(String value) {
            addCriterion("XWDREADTAG1 =", value, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1NotEqualTo(String value) {
            addCriterion("XWDREADTAG1 <>", value, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1GreaterThan(String value) {
            addCriterion("XWDREADTAG1 >", value, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1GreaterThanOrEqualTo(String value) {
            addCriterion("XWDREADTAG1 >=", value, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1LessThan(String value) {
            addCriterion("XWDREADTAG1 <", value, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1LessThanOrEqualTo(String value) {
            addCriterion("XWDREADTAG1 <=", value, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1Like(String value) {
            addCriterion("XWDREADTAG1 like", value, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1NotLike(String value) {
            addCriterion("XWDREADTAG1 not like", value, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1In(List<String> values) {
            addCriterion("XWDREADTAG1 in", values, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1NotIn(List<String> values) {
            addCriterion("XWDREADTAG1 not in", values, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1Between(String value1, String value2) {
            addCriterion("XWDREADTAG1 between", value1, value2, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdreadtag1NotBetween(String value1, String value2) {
            addCriterion("XWDREADTAG1 not between", value1, value2, "xwdreadtag1");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultIsNull() {
            addCriterion("XWDAUDITRESULT is null");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultIsNotNull() {
            addCriterion("XWDAUDITRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultEqualTo(String value) {
            addCriterion("XWDAUDITRESULT =", value, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultNotEqualTo(String value) {
            addCriterion("XWDAUDITRESULT <>", value, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultGreaterThan(String value) {
            addCriterion("XWDAUDITRESULT >", value, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultGreaterThanOrEqualTo(String value) {
            addCriterion("XWDAUDITRESULT >=", value, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultLessThan(String value) {
            addCriterion("XWDAUDITRESULT <", value, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultLessThanOrEqualTo(String value) {
            addCriterion("XWDAUDITRESULT <=", value, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultLike(String value) {
            addCriterion("XWDAUDITRESULT like", value, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultNotLike(String value) {
            addCriterion("XWDAUDITRESULT not like", value, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultIn(List<String> values) {
            addCriterion("XWDAUDITRESULT in", values, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultNotIn(List<String> values) {
            addCriterion("XWDAUDITRESULT not in", values, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultBetween(String value1, String value2) {
            addCriterion("XWDAUDITRESULT between", value1, value2, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andXwdauditresultNotBetween(String value1, String value2) {
            addCriterion("XWDAUDITRESULT not between", value1, value2, "xwdauditresult");
            return (Criteria) this;
        }

        public Criteria andReadtag2IsNull() {
            addCriterion("READTAG2 is null");
            return (Criteria) this;
        }

        public Criteria andReadtag2IsNotNull() {
            addCriterion("READTAG2 is not null");
            return (Criteria) this;
        }

        public Criteria andReadtag2EqualTo(Short value) {
            addCriterion("READTAG2 =", value, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2NotEqualTo(Short value) {
            addCriterion("READTAG2 <>", value, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2GreaterThan(Short value) {
            addCriterion("READTAG2 >", value, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2GreaterThanOrEqualTo(Short value) {
            addCriterion("READTAG2 >=", value, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2LessThan(Short value) {
            addCriterion("READTAG2 <", value, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2LessThanOrEqualTo(Short value) {
            addCriterion("READTAG2 <=", value, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2In(List<Short> values) {
            addCriterion("READTAG2 in", values, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2NotIn(List<Short> values) {
            addCriterion("READTAG2 not in", values, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2Between(Short value1, Short value2) {
            addCriterion("READTAG2 between", value1, value2, "readtag2");
            return (Criteria) this;
        }

        public Criteria andReadtag2NotBetween(Short value1, Short value2) {
            addCriterion("READTAG2 not between", value1, value2, "readtag2");
            return (Criteria) this;
        }

        public Criteria andLoantagIsNull() {
            addCriterion("LOANTAG is null");
            return (Criteria) this;
        }

        public Criteria andLoantagIsNotNull() {
            addCriterion("LOANTAG is not null");
            return (Criteria) this;
        }

        public Criteria andLoantagEqualTo(String value) {
            addCriterion("LOANTAG =", value, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagNotEqualTo(String value) {
            addCriterion("LOANTAG <>", value, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagGreaterThan(String value) {
            addCriterion("LOANTAG >", value, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagGreaterThanOrEqualTo(String value) {
            addCriterion("LOANTAG >=", value, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagLessThan(String value) {
            addCriterion("LOANTAG <", value, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagLessThanOrEqualTo(String value) {
            addCriterion("LOANTAG <=", value, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagLike(String value) {
            addCriterion("LOANTAG like", value, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagNotLike(String value) {
            addCriterion("LOANTAG not like", value, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagIn(List<String> values) {
            addCriterion("LOANTAG in", values, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagNotIn(List<String> values) {
            addCriterion("LOANTAG not in", values, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagBetween(String value1, String value2) {
            addCriterion("LOANTAG between", value1, value2, "loantag");
            return (Criteria) this;
        }

        public Criteria andLoantagNotBetween(String value1, String value2) {
            addCriterion("LOANTAG not between", value1, value2, "loantag");
            return (Criteria) this;
        }

        public Criteria andReadtag3IsNull() {
            addCriterion("READTAG3 is null");
            return (Criteria) this;
        }

        public Criteria andReadtag3IsNotNull() {
            addCriterion("READTAG3 is not null");
            return (Criteria) this;
        }

        public Criteria andReadtag3EqualTo(Short value) {
            addCriterion("READTAG3 =", value, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3NotEqualTo(Short value) {
            addCriterion("READTAG3 <>", value, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3GreaterThan(Short value) {
            addCriterion("READTAG3 >", value, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3GreaterThanOrEqualTo(Short value) {
            addCriterion("READTAG3 >=", value, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3LessThan(Short value) {
            addCriterion("READTAG3 <", value, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3LessThanOrEqualTo(Short value) {
            addCriterion("READTAG3 <=", value, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3In(List<Short> values) {
            addCriterion("READTAG3 in", values, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3NotIn(List<Short> values) {
            addCriterion("READTAG3 not in", values, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3Between(Short value1, Short value2) {
            addCriterion("READTAG3 between", value1, value2, "readtag3");
            return (Criteria) this;
        }

        public Criteria andReadtag3NotBetween(Short value1, Short value2) {
            addCriterion("READTAG3 not between", value1, value2, "readtag3");
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

        public Criteria andEnterprisecodeIsNull() {
            addCriterion("ENTERPRISECODE is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeIsNotNull() {
            addCriterion("ENTERPRISECODE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeEqualTo(String value) {
            addCriterion("ENTERPRISECODE =", value, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeNotEqualTo(String value) {
            addCriterion("ENTERPRISECODE <>", value, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeGreaterThan(String value) {
            addCriterion("ENTERPRISECODE >", value, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISECODE >=", value, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeLessThan(String value) {
            addCriterion("ENTERPRISECODE <", value, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISECODE <=", value, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeLike(String value) {
            addCriterion("ENTERPRISECODE like", value, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeNotLike(String value) {
            addCriterion("ENTERPRISECODE not like", value, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeIn(List<String> values) {
            addCriterion("ENTERPRISECODE in", values, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeNotIn(List<String> values) {
            addCriterion("ENTERPRISECODE not in", values, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeBetween(String value1, String value2) {
            addCriterion("ENTERPRISECODE between", value1, value2, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andEnterprisecodeNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISECODE not between", value1, value2, "enterprisecode");
            return (Criteria) this;
        }

        public Criteria andLoannameIsNull() {
            addCriterion("LOANNAME is null");
            return (Criteria) this;
        }

        public Criteria andLoannameIsNotNull() {
            addCriterion("LOANNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoannameEqualTo(String value) {
            addCriterion("LOANNAME =", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameNotEqualTo(String value) {
            addCriterion("LOANNAME <>", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameGreaterThan(String value) {
            addCriterion("LOANNAME >", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameGreaterThanOrEqualTo(String value) {
            addCriterion("LOANNAME >=", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameLessThan(String value) {
            addCriterion("LOANNAME <", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameLessThanOrEqualTo(String value) {
            addCriterion("LOANNAME <=", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameLike(String value) {
            addCriterion("LOANNAME like", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameNotLike(String value) {
            addCriterion("LOANNAME not like", value, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameIn(List<String> values) {
            addCriterion("LOANNAME in", values, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameNotIn(List<String> values) {
            addCriterion("LOANNAME not in", values, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameBetween(String value1, String value2) {
            addCriterion("LOANNAME between", value1, value2, "loanname");
            return (Criteria) this;
        }

        public Criteria andLoannameNotBetween(String value1, String value2) {
            addCriterion("LOANNAME not between", value1, value2, "loanname");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateIsNull() {
            addCriterion("XWDAUDITDATE is null");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateIsNotNull() {
            addCriterion("XWDAUDITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateEqualTo(String value) {
            addCriterion("XWDAUDITDATE =", value, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateNotEqualTo(String value) {
            addCriterion("XWDAUDITDATE <>", value, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateGreaterThan(String value) {
            addCriterion("XWDAUDITDATE >", value, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateGreaterThanOrEqualTo(String value) {
            addCriterion("XWDAUDITDATE >=", value, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateLessThan(String value) {
            addCriterion("XWDAUDITDATE <", value, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateLessThanOrEqualTo(String value) {
            addCriterion("XWDAUDITDATE <=", value, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateLike(String value) {
            addCriterion("XWDAUDITDATE like", value, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateNotLike(String value) {
            addCriterion("XWDAUDITDATE not like", value, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateIn(List<String> values) {
            addCriterion("XWDAUDITDATE in", values, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateNotIn(List<String> values) {
            addCriterion("XWDAUDITDATE not in", values, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateBetween(String value1, String value2) {
            addCriterion("XWDAUDITDATE between", value1, value2, "xwdauditdate");
            return (Criteria) this;
        }

        public Criteria andXwdauditdateNotBetween(String value1, String value2) {
            addCriterion("XWDAUDITDATE not between", value1, value2, "xwdauditdate");
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

        public Criteria andLoandateEqualTo(String value) {
            addCriterion("LOANDATE =", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotEqualTo(String value) {
            addCriterion("LOANDATE <>", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThan(String value) {
            addCriterion("LOANDATE >", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateGreaterThanOrEqualTo(String value) {
            addCriterion("LOANDATE >=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThan(String value) {
            addCriterion("LOANDATE <", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLessThanOrEqualTo(String value) {
            addCriterion("LOANDATE <=", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateLike(String value) {
            addCriterion("LOANDATE like", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotLike(String value) {
            addCriterion("LOANDATE not like", value, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateIn(List<String> values) {
            addCriterion("LOANDATE in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotIn(List<String> values) {
            addCriterion("LOANDATE not in", values, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateBetween(String value1, String value2) {
            addCriterion("LOANDATE between", value1, value2, "loandate");
            return (Criteria) this;
        }

        public Criteria andLoandateNotBetween(String value1, String value2) {
            addCriterion("LOANDATE not between", value1, value2, "loandate");
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

        public Criteria andApplycountEqualTo(Short value) {
            addCriterion("APPLYCOUNT =", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountNotEqualTo(Short value) {
            addCriterion("APPLYCOUNT <>", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountGreaterThan(Short value) {
            addCriterion("APPLYCOUNT >", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountGreaterThanOrEqualTo(Short value) {
            addCriterion("APPLYCOUNT >=", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountLessThan(Short value) {
            addCriterion("APPLYCOUNT <", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountLessThanOrEqualTo(Short value) {
            addCriterion("APPLYCOUNT <=", value, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountIn(List<Short> values) {
            addCriterion("APPLYCOUNT in", values, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountNotIn(List<Short> values) {
            addCriterion("APPLYCOUNT not in", values, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountBetween(Short value1, Short value2) {
            addCriterion("APPLYCOUNT between", value1, value2, "applycount");
            return (Criteria) this;
        }

        public Criteria andApplycountNotBetween(Short value1, Short value2) {
            addCriterion("APPLYCOUNT not between", value1, value2, "applycount");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceIsNull() {
            addCriterion("XWDAUDITADVICE is null");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceIsNotNull() {
            addCriterion("XWDAUDITADVICE is not null");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceEqualTo(String value) {
            addCriterion("XWDAUDITADVICE =", value, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceNotEqualTo(String value) {
            addCriterion("XWDAUDITADVICE <>", value, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceGreaterThan(String value) {
            addCriterion("XWDAUDITADVICE >", value, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceGreaterThanOrEqualTo(String value) {
            addCriterion("XWDAUDITADVICE >=", value, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceLessThan(String value) {
            addCriterion("XWDAUDITADVICE <", value, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceLessThanOrEqualTo(String value) {
            addCriterion("XWDAUDITADVICE <=", value, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceLike(String value) {
            addCriterion("XWDAUDITADVICE like", value, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceNotLike(String value) {
            addCriterion("XWDAUDITADVICE not like", value, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceIn(List<String> values) {
            addCriterion("XWDAUDITADVICE in", values, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceNotIn(List<String> values) {
            addCriterion("XWDAUDITADVICE not in", values, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceBetween(String value1, String value2) {
            addCriterion("XWDAUDITADVICE between", value1, value2, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andXwdauditadviceNotBetween(String value1, String value2) {
            addCriterion("XWDAUDITADVICE not between", value1, value2, "xwdauditadvice");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneIsNull() {
            addCriterion("PLACEOFBUSINESSPHONE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneIsNotNull() {
            addCriterion("PLACEOFBUSINESSPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneEqualTo(String value) {
            addCriterion("PLACEOFBUSINESSPHONE =", value, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneNotEqualTo(String value) {
            addCriterion("PLACEOFBUSINESSPHONE <>", value, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneGreaterThan(String value) {
            addCriterion("PLACEOFBUSINESSPHONE >", value, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneGreaterThanOrEqualTo(String value) {
            addCriterion("PLACEOFBUSINESSPHONE >=", value, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneLessThan(String value) {
            addCriterion("PLACEOFBUSINESSPHONE <", value, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneLessThanOrEqualTo(String value) {
            addCriterion("PLACEOFBUSINESSPHONE <=", value, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneLike(String value) {
            addCriterion("PLACEOFBUSINESSPHONE like", value, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneNotLike(String value) {
            addCriterion("PLACEOFBUSINESSPHONE not like", value, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneIn(List<String> values) {
            addCriterion("PLACEOFBUSINESSPHONE in", values, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneNotIn(List<String> values) {
            addCriterion("PLACEOFBUSINESSPHONE not in", values, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneBetween(String value1, String value2) {
            addCriterion("PLACEOFBUSINESSPHONE between", value1, value2, "placeofbusinessphone");
            return (Criteria) this;
        }

        public Criteria andPlaceofbusinessphoneNotBetween(String value1, String value2) {
            addCriterion("PLACEOFBUSINESSPHONE not between", value1, value2, "placeofbusinessphone");
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

        public Criteria andErrormsgIsNull() {
            addCriterion("ERRORMSG is null");
            return (Criteria) this;
        }

        public Criteria andErrormsgIsNotNull() {
            addCriterion("ERRORMSG is not null");
            return (Criteria) this;
        }

        public Criteria andErrormsgEqualTo(String value) {
            addCriterion("ERRORMSG =", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotEqualTo(String value) {
            addCriterion("ERRORMSG <>", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThan(String value) {
            addCriterion("ERRORMSG >", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgGreaterThanOrEqualTo(String value) {
            addCriterion("ERRORMSG >=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThan(String value) {
            addCriterion("ERRORMSG <", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLessThanOrEqualTo(String value) {
            addCriterion("ERRORMSG <=", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgLike(String value) {
            addCriterion("ERRORMSG like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotLike(String value) {
            addCriterion("ERRORMSG not like", value, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgIn(List<String> values) {
            addCriterion("ERRORMSG in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotIn(List<String> values) {
            addCriterion("ERRORMSG not in", values, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgBetween(String value1, String value2) {
            addCriterion("ERRORMSG between", value1, value2, "errormsg");
            return (Criteria) this;
        }

        public Criteria andErrormsgNotBetween(String value1, String value2) {
            addCriterion("ERRORMSG not between", value1, value2, "errormsg");
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

        public Criteria andNewemployeenumIsNull() {
            addCriterion("NEWEMPLOYEENUM is null");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumIsNotNull() {
            addCriterion("NEWEMPLOYEENUM is not null");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumEqualTo(Short value) {
            addCriterion("NEWEMPLOYEENUM =", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumNotEqualTo(Short value) {
            addCriterion("NEWEMPLOYEENUM <>", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumGreaterThan(Short value) {
            addCriterion("NEWEMPLOYEENUM >", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumGreaterThanOrEqualTo(Short value) {
            addCriterion("NEWEMPLOYEENUM >=", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumLessThan(Short value) {
            addCriterion("NEWEMPLOYEENUM <", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumLessThanOrEqualTo(Short value) {
            addCriterion("NEWEMPLOYEENUM <=", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumIn(List<Short> values) {
            addCriterion("NEWEMPLOYEENUM in", values, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumNotIn(List<Short> values) {
            addCriterion("NEWEMPLOYEENUM not in", values, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumBetween(Short value1, Short value2) {
            addCriterion("NEWEMPLOYEENUM between", value1, value2, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumNotBetween(Short value1, Short value2) {
            addCriterion("NEWEMPLOYEENUM not between", value1, value2, "newemployeenum");
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

        public Criteria andIsautoreadIsNull() {
            addCriterion("ISAUTOREAD is null");
            return (Criteria) this;
        }

        public Criteria andIsautoreadIsNotNull() {
            addCriterion("ISAUTOREAD is not null");
            return (Criteria) this;
        }

        public Criteria andIsautoreadEqualTo(String value) {
            addCriterion("ISAUTOREAD =", value, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadNotEqualTo(String value) {
            addCriterion("ISAUTOREAD <>", value, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadGreaterThan(String value) {
            addCriterion("ISAUTOREAD >", value, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadGreaterThanOrEqualTo(String value) {
            addCriterion("ISAUTOREAD >=", value, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadLessThan(String value) {
            addCriterion("ISAUTOREAD <", value, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadLessThanOrEqualTo(String value) {
            addCriterion("ISAUTOREAD <=", value, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadLike(String value) {
            addCriterion("ISAUTOREAD like", value, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadNotLike(String value) {
            addCriterion("ISAUTOREAD not like", value, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadIn(List<String> values) {
            addCriterion("ISAUTOREAD in", values, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadNotIn(List<String> values) {
            addCriterion("ISAUTOREAD not in", values, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadBetween(String value1, String value2) {
            addCriterion("ISAUTOREAD between", value1, value2, "isautoread");
            return (Criteria) this;
        }

        public Criteria andIsautoreadNotBetween(String value1, String value2) {
            addCriterion("ISAUTOREAD not between", value1, value2, "isautoread");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeIsNull() {
            addCriterion("DATACREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeIsNotNull() {
            addCriterion("DATACREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeEqualTo(String value) {
            addCriterion("DATACREATETIME =", value, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeNotEqualTo(String value) {
            addCriterion("DATACREATETIME <>", value, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeGreaterThan(String value) {
            addCriterion("DATACREATETIME >", value, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATACREATETIME >=", value, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeLessThan(String value) {
            addCriterion("DATACREATETIME <", value, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeLessThanOrEqualTo(String value) {
            addCriterion("DATACREATETIME <=", value, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeLike(String value) {
            addCriterion("DATACREATETIME like", value, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeNotLike(String value) {
            addCriterion("DATACREATETIME not like", value, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeIn(List<String> values) {
            addCriterion("DATACREATETIME in", values, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeNotIn(List<String> values) {
            addCriterion("DATACREATETIME not in", values, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeBetween(String value1, String value2) {
            addCriterion("DATACREATETIME between", value1, value2, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andDatacreatetimeNotBetween(String value1, String value2) {
            addCriterion("DATACREATETIME not between", value1, value2, "datacreatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeIsNull() {
            addCriterion("JYJUPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeIsNotNull() {
            addCriterion("JYJUPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeEqualTo(String value) {
            addCriterion("JYJUPDATETIME =", value, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeNotEqualTo(String value) {
            addCriterion("JYJUPDATETIME <>", value, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeGreaterThan(String value) {
            addCriterion("JYJUPDATETIME >", value, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("JYJUPDATETIME >=", value, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeLessThan(String value) {
            addCriterion("JYJUPDATETIME <", value, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeLessThanOrEqualTo(String value) {
            addCriterion("JYJUPDATETIME <=", value, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeLike(String value) {
            addCriterion("JYJUPDATETIME like", value, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeNotLike(String value) {
            addCriterion("JYJUPDATETIME not like", value, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeIn(List<String> values) {
            addCriterion("JYJUPDATETIME in", values, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeNotIn(List<String> values) {
            addCriterion("JYJUPDATETIME not in", values, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeBetween(String value1, String value2) {
            addCriterion("JYJUPDATETIME between", value1, value2, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjupdatetimeNotBetween(String value1, String value2) {
            addCriterion("JYJUPDATETIME not between", value1, value2, "jyjupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeIsNull() {
            addCriterion("XWDUPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeIsNotNull() {
            addCriterion("XWDUPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeEqualTo(String value) {
            addCriterion("XWDUPDATETIME =", value, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeNotEqualTo(String value) {
            addCriterion("XWDUPDATETIME <>", value, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeGreaterThan(String value) {
            addCriterion("XWDUPDATETIME >", value, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("XWDUPDATETIME >=", value, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeLessThan(String value) {
            addCriterion("XWDUPDATETIME <", value, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeLessThanOrEqualTo(String value) {
            addCriterion("XWDUPDATETIME <=", value, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeLike(String value) {
            addCriterion("XWDUPDATETIME like", value, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeNotLike(String value) {
            addCriterion("XWDUPDATETIME not like", value, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeIn(List<String> values) {
            addCriterion("XWDUPDATETIME in", values, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeNotIn(List<String> values) {
            addCriterion("XWDUPDATETIME not in", values, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeBetween(String value1, String value2) {
            addCriterion("XWDUPDATETIME between", value1, value2, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andXwdupdatetimeNotBetween(String value1, String value2) {
            addCriterion("XWDUPDATETIME not between", value1, value2, "xwdupdatetime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeIsNull() {
            addCriterion("JYJAUDITTIME is null");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeIsNotNull() {
            addCriterion("JYJAUDITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeEqualTo(String value) {
            addCriterion("JYJAUDITTIME =", value, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeNotEqualTo(String value) {
            addCriterion("JYJAUDITTIME <>", value, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeGreaterThan(String value) {
            addCriterion("JYJAUDITTIME >", value, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeGreaterThanOrEqualTo(String value) {
            addCriterion("JYJAUDITTIME >=", value, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeLessThan(String value) {
            addCriterion("JYJAUDITTIME <", value, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeLessThanOrEqualTo(String value) {
            addCriterion("JYJAUDITTIME <=", value, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeLike(String value) {
            addCriterion("JYJAUDITTIME like", value, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeNotLike(String value) {
            addCriterion("JYJAUDITTIME not like", value, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeIn(List<String> values) {
            addCriterion("JYJAUDITTIME in", values, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeNotIn(List<String> values) {
            addCriterion("JYJAUDITTIME not in", values, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeBetween(String value1, String value2) {
            addCriterion("JYJAUDITTIME between", value1, value2, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andJyjaudittimeNotBetween(String value1, String value2) {
            addCriterion("JYJAUDITTIME not between", value1, value2, "jyjaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeIsNull() {
            addCriterion("XWDAUDITTIME is null");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeIsNotNull() {
            addCriterion("XWDAUDITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeEqualTo(String value) {
            addCriterion("XWDAUDITTIME =", value, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeNotEqualTo(String value) {
            addCriterion("XWDAUDITTIME <>", value, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeGreaterThan(String value) {
            addCriterion("XWDAUDITTIME >", value, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeGreaterThanOrEqualTo(String value) {
            addCriterion("XWDAUDITTIME >=", value, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeLessThan(String value) {
            addCriterion("XWDAUDITTIME <", value, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeLessThanOrEqualTo(String value) {
            addCriterion("XWDAUDITTIME <=", value, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeLike(String value) {
            addCriterion("XWDAUDITTIME like", value, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeNotLike(String value) {
            addCriterion("XWDAUDITTIME not like", value, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeIn(List<String> values) {
            addCriterion("XWDAUDITTIME in", values, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeNotIn(List<String> values) {
            addCriterion("XWDAUDITTIME not in", values, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeBetween(String value1, String value2) {
            addCriterion("XWDAUDITTIME between", value1, value2, "xwdaudittime");
            return (Criteria) this;
        }

        public Criteria andXwdaudittimeNotBetween(String value1, String value2) {
            addCriterion("XWDAUDITTIME not between", value1, value2, "xwdaudittime");
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

        public Criteria andCredentialnochangedIsNull() {
            addCriterion("CREDENTIALNOCHANGED is null");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedIsNotNull() {
            addCriterion("CREDENTIALNOCHANGED is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedEqualTo(String value) {
            addCriterion("CREDENTIALNOCHANGED =", value, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedNotEqualTo(String value) {
            addCriterion("CREDENTIALNOCHANGED <>", value, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedGreaterThan(String value) {
            addCriterion("CREDENTIALNOCHANGED >", value, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedGreaterThanOrEqualTo(String value) {
            addCriterion("CREDENTIALNOCHANGED >=", value, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedLessThan(String value) {
            addCriterion("CREDENTIALNOCHANGED <", value, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedLessThanOrEqualTo(String value) {
            addCriterion("CREDENTIALNOCHANGED <=", value, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedLike(String value) {
            addCriterion("CREDENTIALNOCHANGED like", value, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedNotLike(String value) {
            addCriterion("CREDENTIALNOCHANGED not like", value, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedIn(List<String> values) {
            addCriterion("CREDENTIALNOCHANGED in", values, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedNotIn(List<String> values) {
            addCriterion("CREDENTIALNOCHANGED not in", values, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedBetween(String value1, String value2) {
            addCriterion("CREDENTIALNOCHANGED between", value1, value2, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andCredentialnochangedNotBetween(String value1, String value2) {
            addCriterion("CREDENTIALNOCHANGED not between", value1, value2, "credentialnochanged");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdIsNull() {
            addCriterion("APPLYID_XWD is null");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdIsNotNull() {
            addCriterion("APPLYID_XWD is not null");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdEqualTo(String value) {
            addCriterion("APPLYID_XWD =", value, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdNotEqualTo(String value) {
            addCriterion("APPLYID_XWD <>", value, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdGreaterThan(String value) {
            addCriterion("APPLYID_XWD >", value, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdGreaterThanOrEqualTo(String value) {
            addCriterion("APPLYID_XWD >=", value, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdLessThan(String value) {
            addCriterion("APPLYID_XWD <", value, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdLessThanOrEqualTo(String value) {
            addCriterion("APPLYID_XWD <=", value, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdLike(String value) {
            addCriterion("APPLYID_XWD like", value, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdNotLike(String value) {
            addCriterion("APPLYID_XWD not like", value, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdIn(List<String> values) {
            addCriterion("APPLYID_XWD in", values, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdNotIn(List<String> values) {
            addCriterion("APPLYID_XWD not in", values, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdBetween(String value1, String value2) {
            addCriterion("APPLYID_XWD between", value1, value2, "applyidXwd");
            return (Criteria) this;
        }

        public Criteria andApplyidXwdNotBetween(String value1, String value2) {
            addCriterion("APPLYID_XWD not between", value1, value2, "applyidXwd");
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

        public Criteria andCredityearEqualTo(String value) {
            addCriterion("CREDITYEAR =", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearNotEqualTo(String value) {
            addCriterion("CREDITYEAR <>", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearGreaterThan(String value) {
            addCriterion("CREDITYEAR >", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITYEAR >=", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearLessThan(String value) {
            addCriterion("CREDITYEAR <", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearLessThanOrEqualTo(String value) {
            addCriterion("CREDITYEAR <=", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearLike(String value) {
            addCriterion("CREDITYEAR like", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearNotLike(String value) {
            addCriterion("CREDITYEAR not like", value, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearIn(List<String> values) {
            addCriterion("CREDITYEAR in", values, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearNotIn(List<String> values) {
            addCriterion("CREDITYEAR not in", values, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearBetween(String value1, String value2) {
            addCriterion("CREDITYEAR between", value1, value2, "credityear");
            return (Criteria) this;
        }

        public Criteria andCredityearNotBetween(String value1, String value2) {
            addCriterion("CREDITYEAR not between", value1, value2, "credityear");
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

        public Criteria andIstwonotIsNull() {
            addCriterion("ISTWONOT is null");
            return (Criteria) this;
        }

        public Criteria andIstwonotIsNotNull() {
            addCriterion("ISTWONOT is not null");
            return (Criteria) this;
        }

        public Criteria andIstwonotEqualTo(Short value) {
            addCriterion("ISTWONOT =", value, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotNotEqualTo(Short value) {
            addCriterion("ISTWONOT <>", value, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotGreaterThan(Short value) {
            addCriterion("ISTWONOT >", value, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotGreaterThanOrEqualTo(Short value) {
            addCriterion("ISTWONOT >=", value, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotLessThan(Short value) {
            addCriterion("ISTWONOT <", value, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotLessThanOrEqualTo(Short value) {
            addCriterion("ISTWONOT <=", value, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotIn(List<Short> values) {
            addCriterion("ISTWONOT in", values, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotNotIn(List<Short> values) {
            addCriterion("ISTWONOT not in", values, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotBetween(Short value1, Short value2) {
            addCriterion("ISTWONOT between", value1, value2, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIstwonotNotBetween(Short value1, Short value2) {
            addCriterion("ISTWONOT not between", value1, value2, "istwonot");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeIsNull() {
            addCriterion("IS21FILEPERSONNELTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeIsNotNull() {
            addCriterion("IS21FILEPERSONNELTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeEqualTo(Short value) {
            addCriterion("IS21FILEPERSONNELTYPE =", value, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeNotEqualTo(Short value) {
            addCriterion("IS21FILEPERSONNELTYPE <>", value, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeGreaterThan(Short value) {
            addCriterion("IS21FILEPERSONNELTYPE >", value, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeGreaterThanOrEqualTo(Short value) {
            addCriterion("IS21FILEPERSONNELTYPE >=", value, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeLessThan(Short value) {
            addCriterion("IS21FILEPERSONNELTYPE <", value, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeLessThanOrEqualTo(Short value) {
            addCriterion("IS21FILEPERSONNELTYPE <=", value, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeIn(List<Short> values) {
            addCriterion("IS21FILEPERSONNELTYPE in", values, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeNotIn(List<Short> values) {
            addCriterion("IS21FILEPERSONNELTYPE not in", values, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeBetween(Short value1, Short value2) {
            addCriterion("IS21FILEPERSONNELTYPE between", value1, value2, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andIs21filepersonneltypeNotBetween(Short value1, Short value2) {
            addCriterion("IS21FILEPERSONNELTYPE not between", value1, value2, "is21filepersonneltype");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileIsNull() {
            addCriterion("PERSONNELTYPE21FILE is null");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileIsNotNull() {
            addCriterion("PERSONNELTYPE21FILE is not null");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileEqualTo(String value) {
            addCriterion("PERSONNELTYPE21FILE =", value, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileNotEqualTo(String value) {
            addCriterion("PERSONNELTYPE21FILE <>", value, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileGreaterThan(String value) {
            addCriterion("PERSONNELTYPE21FILE >", value, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileGreaterThanOrEqualTo(String value) {
            addCriterion("PERSONNELTYPE21FILE >=", value, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileLessThan(String value) {
            addCriterion("PERSONNELTYPE21FILE <", value, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileLessThanOrEqualTo(String value) {
            addCriterion("PERSONNELTYPE21FILE <=", value, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileLike(String value) {
            addCriterion("PERSONNELTYPE21FILE like", value, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileNotLike(String value) {
            addCriterion("PERSONNELTYPE21FILE not like", value, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileIn(List<String> values) {
            addCriterion("PERSONNELTYPE21FILE in", values, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileNotIn(List<String> values) {
            addCriterion("PERSONNELTYPE21FILE not in", values, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileBetween(String value1, String value2) {
            addCriterion("PERSONNELTYPE21FILE between", value1, value2, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andPersonneltype21fileNotBetween(String value1, String value2) {
            addCriterion("PERSONNELTYPE21FILE not between", value1, value2, "personneltype21file");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralIsNull() {
            addCriterion("ISEXEMPTCOLLATERAL is null");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralIsNotNull() {
            addCriterion("ISEXEMPTCOLLATERAL is not null");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralEqualTo(Short value) {
            addCriterion("ISEXEMPTCOLLATERAL =", value, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralNotEqualTo(Short value) {
            addCriterion("ISEXEMPTCOLLATERAL <>", value, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralGreaterThan(Short value) {
            addCriterion("ISEXEMPTCOLLATERAL >", value, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralGreaterThanOrEqualTo(Short value) {
            addCriterion("ISEXEMPTCOLLATERAL >=", value, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralLessThan(Short value) {
            addCriterion("ISEXEMPTCOLLATERAL <", value, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralLessThanOrEqualTo(Short value) {
            addCriterion("ISEXEMPTCOLLATERAL <=", value, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralIn(List<Short> values) {
            addCriterion("ISEXEMPTCOLLATERAL in", values, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralNotIn(List<Short> values) {
            addCriterion("ISEXEMPTCOLLATERAL not in", values, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralBetween(Short value1, Short value2) {
            addCriterion("ISEXEMPTCOLLATERAL between", value1, value2, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andIsexemptcollateralNotBetween(Short value1, Short value2) {
            addCriterion("ISEXEMPTCOLLATERAL not between", value1, value2, "isexemptcollateral");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeIsNull() {
            addCriterion("EXEMPTCOLLPERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeIsNotNull() {
            addCriterion("EXEMPTCOLLPERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeEqualTo(String value) {
            addCriterion("EXEMPTCOLLPERTYPE =", value, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeNotEqualTo(String value) {
            addCriterion("EXEMPTCOLLPERTYPE <>", value, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeGreaterThan(String value) {
            addCriterion("EXEMPTCOLLPERTYPE >", value, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXEMPTCOLLPERTYPE >=", value, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeLessThan(String value) {
            addCriterion("EXEMPTCOLLPERTYPE <", value, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeLessThanOrEqualTo(String value) {
            addCriterion("EXEMPTCOLLPERTYPE <=", value, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeLike(String value) {
            addCriterion("EXEMPTCOLLPERTYPE like", value, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeNotLike(String value) {
            addCriterion("EXEMPTCOLLPERTYPE not like", value, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeIn(List<String> values) {
            addCriterion("EXEMPTCOLLPERTYPE in", values, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeNotIn(List<String> values) {
            addCriterion("EXEMPTCOLLPERTYPE not in", values, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeBetween(String value1, String value2) {
            addCriterion("EXEMPTCOLLPERTYPE between", value1, value2, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andExemptcollpertypeNotBetween(String value1, String value2) {
            addCriterion("EXEMPTCOLLPERTYPE not between", value1, value2, "exemptcollpertype");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNull() {
            addCriterion("LOAN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNotNull() {
            addCriterion("LOAN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeEqualTo(String value) {
            addCriterion("LOAN_TYPE =", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotEqualTo(String value) {
            addCriterion("LOAN_TYPE <>", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThan(String value) {
            addCriterion("LOAN_TYPE >", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_TYPE >=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThan(String value) {
            addCriterion("LOAN_TYPE <", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThanOrEqualTo(String value) {
            addCriterion("LOAN_TYPE <=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLike(String value) {
            addCriterion("LOAN_TYPE like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotLike(String value) {
            addCriterion("LOAN_TYPE not like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIn(List<String> values) {
            addCriterion("LOAN_TYPE in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotIn(List<String> values) {
            addCriterion("LOAN_TYPE not in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeBetween(String value1, String value2) {
            addCriterion("LOAN_TYPE between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotBetween(String value1, String value2) {
            addCriterion("LOAN_TYPE not between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbIsNull() {
            addCriterion("QRMFDBRQLB is null");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbIsNotNull() {
            addCriterion("QRMFDBRQLB is not null");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbEqualTo(String value) {
            addCriterion("QRMFDBRQLB =", value, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbNotEqualTo(String value) {
            addCriterion("QRMFDBRQLB <>", value, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbGreaterThan(String value) {
            addCriterion("QRMFDBRQLB >", value, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbGreaterThanOrEqualTo(String value) {
            addCriterion("QRMFDBRQLB >=", value, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbLessThan(String value) {
            addCriterion("QRMFDBRQLB <", value, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbLessThanOrEqualTo(String value) {
            addCriterion("QRMFDBRQLB <=", value, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbLike(String value) {
            addCriterion("QRMFDBRQLB like", value, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbNotLike(String value) {
            addCriterion("QRMFDBRQLB not like", value, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbIn(List<String> values) {
            addCriterion("QRMFDBRQLB in", values, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbNotIn(List<String> values) {
            addCriterion("QRMFDBRQLB not in", values, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbBetween(String value1, String value2) {
            addCriterion("QRMFDBRQLB between", value1, value2, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andQrmfdbrqlbNotBetween(String value1, String value2) {
            addCriterion("QRMFDBRQLB not between", value1, value2, "qrmfdbrqlb");
            return (Criteria) this;
        }

        public Criteria andLwrylbIsNull() {
            addCriterion("LWRYLB is null");
            return (Criteria) this;
        }

        public Criteria andLwrylbIsNotNull() {
            addCriterion("LWRYLB is not null");
            return (Criteria) this;
        }

        public Criteria andLwrylbEqualTo(String value) {
            addCriterion("LWRYLB =", value, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbNotEqualTo(String value) {
            addCriterion("LWRYLB <>", value, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbGreaterThan(String value) {
            addCriterion("LWRYLB >", value, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbGreaterThanOrEqualTo(String value) {
            addCriterion("LWRYLB >=", value, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbLessThan(String value) {
            addCriterion("LWRYLB <", value, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbLessThanOrEqualTo(String value) {
            addCriterion("LWRYLB <=", value, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbLike(String value) {
            addCriterion("LWRYLB like", value, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbNotLike(String value) {
            addCriterion("LWRYLB not like", value, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbIn(List<String> values) {
            addCriterion("LWRYLB in", values, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbNotIn(List<String> values) {
            addCriterion("LWRYLB not in", values, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbBetween(String value1, String value2) {
            addCriterion("LWRYLB between", value1, value2, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andLwrylbNotBetween(String value1, String value2) {
            addCriterion("LWRYLB not between", value1, value2, "lwrylb");
            return (Criteria) this;
        }

        public Criteria andMarrStatusIsNull() {
            addCriterion("MARR_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andMarrStatusIsNotNull() {
            addCriterion("MARR_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMarrStatusEqualTo(String value) {
            addCriterion("MARR_STATUS =", value, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusNotEqualTo(String value) {
            addCriterion("MARR_STATUS <>", value, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusGreaterThan(String value) {
            addCriterion("MARR_STATUS >", value, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusGreaterThanOrEqualTo(String value) {
            addCriterion("MARR_STATUS >=", value, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusLessThan(String value) {
            addCriterion("MARR_STATUS <", value, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusLessThanOrEqualTo(String value) {
            addCriterion("MARR_STATUS <=", value, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusLike(String value) {
            addCriterion("MARR_STATUS like", value, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusNotLike(String value) {
            addCriterion("MARR_STATUS not like", value, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusIn(List<String> values) {
            addCriterion("MARR_STATUS in", values, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusNotIn(List<String> values) {
            addCriterion("MARR_STATUS not in", values, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusBetween(String value1, String value2) {
            addCriterion("MARR_STATUS between", value1, value2, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andMarrStatusNotBetween(String value1, String value2) {
            addCriterion("MARR_STATUS not between", value1, value2, "marrStatus");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkIsNull() {
            addCriterion("SFYPOZZDK is null");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkIsNotNull() {
            addCriterion("SFYPOZZDK is not null");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkEqualTo(String value) {
            addCriterion("SFYPOZZDK =", value, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkNotEqualTo(String value) {
            addCriterion("SFYPOZZDK <>", value, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkGreaterThan(String value) {
            addCriterion("SFYPOZZDK >", value, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkGreaterThanOrEqualTo(String value) {
            addCriterion("SFYPOZZDK >=", value, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkLessThan(String value) {
            addCriterion("SFYPOZZDK <", value, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkLessThanOrEqualTo(String value) {
            addCriterion("SFYPOZZDK <=", value, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkLike(String value) {
            addCriterion("SFYPOZZDK like", value, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkNotLike(String value) {
            addCriterion("SFYPOZZDK not like", value, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkIn(List<String> values) {
            addCriterion("SFYPOZZDK in", values, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkNotIn(List<String> values) {
            addCriterion("SFYPOZZDK not in", values, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkBetween(String value1, String value2) {
            addCriterion("SFYPOZZDK between", value1, value2, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andSfypozzdkNotBetween(String value1, String value2) {
            addCriterion("SFYPOZZDK not between", value1, value2, "sfypozzdk");
            return (Criteria) this;
        }

        public Criteria andPogzdwIsNull() {
            addCriterion("POGZDW is null");
            return (Criteria) this;
        }

        public Criteria andPogzdwIsNotNull() {
            addCriterion("POGZDW is not null");
            return (Criteria) this;
        }

        public Criteria andPogzdwEqualTo(String value) {
            addCriterion("POGZDW =", value, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwNotEqualTo(String value) {
            addCriterion("POGZDW <>", value, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwGreaterThan(String value) {
            addCriterion("POGZDW >", value, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwGreaterThanOrEqualTo(String value) {
            addCriterion("POGZDW >=", value, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwLessThan(String value) {
            addCriterion("POGZDW <", value, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwLessThanOrEqualTo(String value) {
            addCriterion("POGZDW <=", value, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwLike(String value) {
            addCriterion("POGZDW like", value, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwNotLike(String value) {
            addCriterion("POGZDW not like", value, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwIn(List<String> values) {
            addCriterion("POGZDW in", values, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwNotIn(List<String> values) {
            addCriterion("POGZDW not in", values, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwBetween(String value1, String value2) {
            addCriterion("POGZDW between", value1, value2, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andPogzdwNotBetween(String value1, String value2) {
            addCriterion("POGZDW not between", value1, value2, "pogzdw");
            return (Criteria) this;
        }

        public Criteria andFlwssddzIsNull() {
            addCriterion("FLWSSDDZ is null");
            return (Criteria) this;
        }

        public Criteria andFlwssddzIsNotNull() {
            addCriterion("FLWSSDDZ is not null");
            return (Criteria) this;
        }

        public Criteria andFlwssddzEqualTo(String value) {
            addCriterion("FLWSSDDZ =", value, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzNotEqualTo(String value) {
            addCriterion("FLWSSDDZ <>", value, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzGreaterThan(String value) {
            addCriterion("FLWSSDDZ >", value, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzGreaterThanOrEqualTo(String value) {
            addCriterion("FLWSSDDZ >=", value, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzLessThan(String value) {
            addCriterion("FLWSSDDZ <", value, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzLessThanOrEqualTo(String value) {
            addCriterion("FLWSSDDZ <=", value, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzLike(String value) {
            addCriterion("FLWSSDDZ like", value, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzNotLike(String value) {
            addCriterion("FLWSSDDZ not like", value, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzIn(List<String> values) {
            addCriterion("FLWSSDDZ in", values, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzNotIn(List<String> values) {
            addCriterion("FLWSSDDZ not in", values, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzBetween(String value1, String value2) {
            addCriterion("FLWSSDDZ between", value1, value2, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andFlwssddzNotBetween(String value1, String value2) {
            addCriterion("FLWSSDDZ not between", value1, value2, "flwssddz");
            return (Criteria) this;
        }

        public Criteria andGtgshmcIsNull() {
            addCriterion("GTGSHMC is null");
            return (Criteria) this;
        }

        public Criteria andGtgshmcIsNotNull() {
            addCriterion("GTGSHMC is not null");
            return (Criteria) this;
        }

        public Criteria andGtgshmcEqualTo(String value) {
            addCriterion("GTGSHMC =", value, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcNotEqualTo(String value) {
            addCriterion("GTGSHMC <>", value, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcGreaterThan(String value) {
            addCriterion("GTGSHMC >", value, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcGreaterThanOrEqualTo(String value) {
            addCriterion("GTGSHMC >=", value, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcLessThan(String value) {
            addCriterion("GTGSHMC <", value, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcLessThanOrEqualTo(String value) {
            addCriterion("GTGSHMC <=", value, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcLike(String value) {
            addCriterion("GTGSHMC like", value, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcNotLike(String value) {
            addCriterion("GTGSHMC not like", value, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcIn(List<String> values) {
            addCriterion("GTGSHMC in", values, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcNotIn(List<String> values) {
            addCriterion("GTGSHMC not in", values, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcBetween(String value1, String value2) {
            addCriterion("GTGSHMC between", value1, value2, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andGtgshmcNotBetween(String value1, String value2) {
            addCriterion("GTGSHMC not between", value1, value2, "gtgshmc");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNull() {
            addCriterion("BUSINESS_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNotNull() {
            addCriterion("BUSINESS_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS =", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS <>", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThan(String value) {
            addCriterion("BUSINESS_ADDRESS >", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS >=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThan(String value) {
            addCriterion("BUSINESS_ADDRESS <", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_ADDRESS <=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLike(String value) {
            addCriterion("BUSINESS_ADDRESS like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotLike(String value) {
            addCriterion("BUSINESS_ADDRESS not like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIn(List<String> values) {
            addCriterion("BUSINESS_ADDRESS in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotIn(List<String> values) {
            addCriterion("BUSINESS_ADDRESS not in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressBetween(String value1, String value2) {
            addCriterion("BUSINESS_ADDRESS between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_ADDRESS not between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andSwdjhIsNull() {
            addCriterion("SWDJH is null");
            return (Criteria) this;
        }

        public Criteria andSwdjhIsNotNull() {
            addCriterion("SWDJH is not null");
            return (Criteria) this;
        }

        public Criteria andSwdjhEqualTo(String value) {
            addCriterion("SWDJH =", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhNotEqualTo(String value) {
            addCriterion("SWDJH <>", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhGreaterThan(String value) {
            addCriterion("SWDJH >", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhGreaterThanOrEqualTo(String value) {
            addCriterion("SWDJH >=", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhLessThan(String value) {
            addCriterion("SWDJH <", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhLessThanOrEqualTo(String value) {
            addCriterion("SWDJH <=", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhLike(String value) {
            addCriterion("SWDJH like", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhNotLike(String value) {
            addCriterion("SWDJH not like", value, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhIn(List<String> values) {
            addCriterion("SWDJH in", values, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhNotIn(List<String> values) {
            addCriterion("SWDJH not in", values, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhBetween(String value1, String value2) {
            addCriterion("SWDJH between", value1, value2, "swdjh");
            return (Criteria) this;
        }

        public Criteria andSwdjhNotBetween(String value1, String value2) {
            addCriterion("SWDJH not between", value1, value2, "swdjh");
            return (Criteria) this;
        }

        public Criteria andDksqjdIsNull() {
            addCriterion("DKSQJD is null");
            return (Criteria) this;
        }

        public Criteria andDksqjdIsNotNull() {
            addCriterion("DKSQJD is not null");
            return (Criteria) this;
        }

        public Criteria andDksqjdEqualTo(String value) {
            addCriterion("DKSQJD =", value, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdNotEqualTo(String value) {
            addCriterion("DKSQJD <>", value, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdGreaterThan(String value) {
            addCriterion("DKSQJD >", value, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdGreaterThanOrEqualTo(String value) {
            addCriterion("DKSQJD >=", value, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdLessThan(String value) {
            addCriterion("DKSQJD <", value, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdLessThanOrEqualTo(String value) {
            addCriterion("DKSQJD <=", value, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdLike(String value) {
            addCriterion("DKSQJD like", value, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdNotLike(String value) {
            addCriterion("DKSQJD not like", value, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdIn(List<String> values) {
            addCriterion("DKSQJD in", values, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdNotIn(List<String> values) {
            addCriterion("DKSQJD not in", values, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdBetween(String value1, String value2) {
            addCriterion("DKSQJD between", value1, value2, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andDksqjdNotBetween(String value1, String value2) {
            addCriterion("DKSQJD not between", value1, value2, "dksqjd");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeIsNull() {
            addCriterion("ZHSYDKJE is null");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeIsNotNull() {
            addCriterion("ZHSYDKJE is not null");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeEqualTo(BigDecimal value) {
            addCriterion("ZHSYDKJE =", value, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeNotEqualTo(BigDecimal value) {
            addCriterion("ZHSYDKJE <>", value, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeGreaterThan(BigDecimal value) {
            addCriterion("ZHSYDKJE >", value, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHSYDKJE >=", value, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeLessThan(BigDecimal value) {
            addCriterion("ZHSYDKJE <", value, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZHSYDKJE <=", value, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeIn(List<BigDecimal> values) {
            addCriterion("ZHSYDKJE in", values, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeNotIn(List<BigDecimal> values) {
            addCriterion("ZHSYDKJE not in", values, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHSYDKJE between", value1, value2, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andZhsydkjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZHSYDKJE not between", value1, value2, "zhsydkje");
            return (Criteria) this;
        }

        public Criteria andYxyhbhIsNull() {
            addCriterion("YXYHBH is null");
            return (Criteria) this;
        }

        public Criteria andYxyhbhIsNotNull() {
            addCriterion("YXYHBH is not null");
            return (Criteria) this;
        }

        public Criteria andYxyhbhEqualTo(String value) {
            addCriterion("YXYHBH =", value, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhNotEqualTo(String value) {
            addCriterion("YXYHBH <>", value, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhGreaterThan(String value) {
            addCriterion("YXYHBH >", value, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhGreaterThanOrEqualTo(String value) {
            addCriterion("YXYHBH >=", value, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhLessThan(String value) {
            addCriterion("YXYHBH <", value, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhLessThanOrEqualTo(String value) {
            addCriterion("YXYHBH <=", value, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhLike(String value) {
            addCriterion("YXYHBH like", value, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhNotLike(String value) {
            addCriterion("YXYHBH not like", value, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhIn(List<String> values) {
            addCriterion("YXYHBH in", values, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhNotIn(List<String> values) {
            addCriterion("YXYHBH not in", values, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhBetween(String value1, String value2) {
            addCriterion("YXYHBH between", value1, value2, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andYxyhbhNotBetween(String value1, String value2) {
            addCriterion("YXYHBH not between", value1, value2, "yxyhbh");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztIsNull() {
            addCriterion("BCSJTJZT is null");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztIsNotNull() {
            addCriterion("BCSJTJZT is not null");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztEqualTo(String value) {
            addCriterion("BCSJTJZT =", value, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztNotEqualTo(String value) {
            addCriterion("BCSJTJZT <>", value, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztGreaterThan(String value) {
            addCriterion("BCSJTJZT >", value, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztGreaterThanOrEqualTo(String value) {
            addCriterion("BCSJTJZT >=", value, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztLessThan(String value) {
            addCriterion("BCSJTJZT <", value, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztLessThanOrEqualTo(String value) {
            addCriterion("BCSJTJZT <=", value, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztLike(String value) {
            addCriterion("BCSJTJZT like", value, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztNotLike(String value) {
            addCriterion("BCSJTJZT not like", value, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztIn(List<String> values) {
            addCriterion("BCSJTJZT in", values, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztNotIn(List<String> values) {
            addCriterion("BCSJTJZT not in", values, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztBetween(String value1, String value2) {
            addCriterion("BCSJTJZT between", value1, value2, "bcsjtjzt");
            return (Criteria) this;
        }

        public Criteria andBcsjtjztNotBetween(String value1, String value2) {
            addCriterion("BCSJTJZT not between", value1, value2, "bcsjtjzt");
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