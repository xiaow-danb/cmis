package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CrmpersonalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmpersonalExample() {
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

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(BigDecimal value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(BigDecimal value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(BigDecimal value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(BigDecimal value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<BigDecimal> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<BigDecimal> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
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

        public Criteria andLivaddrIsNull() {
            addCriterion("LIVADDR is null");
            return (Criteria) this;
        }

        public Criteria andLivaddrIsNotNull() {
            addCriterion("LIVADDR is not null");
            return (Criteria) this;
        }

        public Criteria andLivaddrEqualTo(String value) {
            addCriterion("LIVADDR =", value, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrNotEqualTo(String value) {
            addCriterion("LIVADDR <>", value, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrGreaterThan(String value) {
            addCriterion("LIVADDR >", value, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrGreaterThanOrEqualTo(String value) {
            addCriterion("LIVADDR >=", value, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrLessThan(String value) {
            addCriterion("LIVADDR <", value, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrLessThanOrEqualTo(String value) {
            addCriterion("LIVADDR <=", value, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrLike(String value) {
            addCriterion("LIVADDR like", value, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrNotLike(String value) {
            addCriterion("LIVADDR not like", value, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrIn(List<String> values) {
            addCriterion("LIVADDR in", values, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrNotIn(List<String> values) {
            addCriterion("LIVADDR not in", values, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrBetween(String value1, String value2) {
            addCriterion("LIVADDR between", value1, value2, "livaddr");
            return (Criteria) this;
        }

        public Criteria andLivaddrNotBetween(String value1, String value2) {
            addCriterion("LIVADDR not between", value1, value2, "livaddr");
            return (Criteria) this;
        }

        public Criteria andMaritalIsNull() {
            addCriterion("MARITAL is null");
            return (Criteria) this;
        }

        public Criteria andMaritalIsNotNull() {
            addCriterion("MARITAL is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalEqualTo(String value) {
            addCriterion("MARITAL =", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotEqualTo(String value) {
            addCriterion("MARITAL <>", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalGreaterThan(String value) {
            addCriterion("MARITAL >", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalGreaterThanOrEqualTo(String value) {
            addCriterion("MARITAL >=", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLessThan(String value) {
            addCriterion("MARITAL <", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLessThanOrEqualTo(String value) {
            addCriterion("MARITAL <=", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalLike(String value) {
            addCriterion("MARITAL like", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotLike(String value) {
            addCriterion("MARITAL not like", value, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalIn(List<String> values) {
            addCriterion("MARITAL in", values, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotIn(List<String> values) {
            addCriterion("MARITAL not in", values, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalBetween(String value1, String value2) {
            addCriterion("MARITAL between", value1, value2, "marital");
            return (Criteria) this;
        }

        public Criteria andMaritalNotBetween(String value1, String value2) {
            addCriterion("MARITAL not between", value1, value2, "marital");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeIsNull() {
            addCriterion("PROFESSIONTYPE is null");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeIsNotNull() {
            addCriterion("PROFESSIONTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeEqualTo(String value) {
            addCriterion("PROFESSIONTYPE =", value, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeNotEqualTo(String value) {
            addCriterion("PROFESSIONTYPE <>", value, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeGreaterThan(String value) {
            addCriterion("PROFESSIONTYPE >", value, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONTYPE >=", value, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeLessThan(String value) {
            addCriterion("PROFESSIONTYPE <", value, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONTYPE <=", value, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeLike(String value) {
            addCriterion("PROFESSIONTYPE like", value, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeNotLike(String value) {
            addCriterion("PROFESSIONTYPE not like", value, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeIn(List<String> values) {
            addCriterion("PROFESSIONTYPE in", values, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeNotIn(List<String> values) {
            addCriterion("PROFESSIONTYPE not in", values, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeBetween(String value1, String value2) {
            addCriterion("PROFESSIONTYPE between", value1, value2, "professiontype");
            return (Criteria) this;
        }

        public Criteria andProfessiontypeNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONTYPE not between", value1, value2, "professiontype");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNull() {
            addCriterion("ZIPCODE is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("ZIPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("ZIPCODE =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("ZIPCODE <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("ZIPCODE >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIPCODE >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("ZIPCODE <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("ZIPCODE <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("ZIPCODE like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("ZIPCODE not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("ZIPCODE in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("ZIPCODE not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("ZIPCODE between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("ZIPCODE not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidIsNull() {
            addCriterion("FAMILYASSETSID is null");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidIsNotNull() {
            addCriterion("FAMILYASSETSID is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidEqualTo(String value) {
            addCriterion("FAMILYASSETSID =", value, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidNotEqualTo(String value) {
            addCriterion("FAMILYASSETSID <>", value, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidGreaterThan(String value) {
            addCriterion("FAMILYASSETSID >", value, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYASSETSID >=", value, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidLessThan(String value) {
            addCriterion("FAMILYASSETSID <", value, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidLessThanOrEqualTo(String value) {
            addCriterion("FAMILYASSETSID <=", value, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidLike(String value) {
            addCriterion("FAMILYASSETSID like", value, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidNotLike(String value) {
            addCriterion("FAMILYASSETSID not like", value, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidIn(List<String> values) {
            addCriterion("FAMILYASSETSID in", values, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidNotIn(List<String> values) {
            addCriterion("FAMILYASSETSID not in", values, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidBetween(String value1, String value2) {
            addCriterion("FAMILYASSETSID between", value1, value2, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andFamilyassetsidNotBetween(String value1, String value2) {
            addCriterion("FAMILYASSETSID not between", value1, value2, "familyassetsid");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdIsNull() {
            addCriterion("CRMPERSONALEXT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdIsNotNull() {
            addCriterion("CRMPERSONALEXT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdEqualTo(String value) {
            addCriterion("CRMPERSONALEXT_ID =", value, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdNotEqualTo(String value) {
            addCriterion("CRMPERSONALEXT_ID <>", value, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdGreaterThan(String value) {
            addCriterion("CRMPERSONALEXT_ID >", value, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdGreaterThanOrEqualTo(String value) {
            addCriterion("CRMPERSONALEXT_ID >=", value, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdLessThan(String value) {
            addCriterion("CRMPERSONALEXT_ID <", value, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdLessThanOrEqualTo(String value) {
            addCriterion("CRMPERSONALEXT_ID <=", value, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdLike(String value) {
            addCriterion("CRMPERSONALEXT_ID like", value, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdNotLike(String value) {
            addCriterion("CRMPERSONALEXT_ID not like", value, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdIn(List<String> values) {
            addCriterion("CRMPERSONALEXT_ID in", values, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdNotIn(List<String> values) {
            addCriterion("CRMPERSONALEXT_ID not in", values, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdBetween(String value1, String value2) {
            addCriterion("CRMPERSONALEXT_ID between", value1, value2, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andCrmpersonalextIdNotBetween(String value1, String value2) {
            addCriterion("CRMPERSONALEXT_ID not between", value1, value2, "crmpersonalextId");
            return (Criteria) this;
        }

        public Criteria andProfessionidIsNull() {
            addCriterion("PROFESSIONID is null");
            return (Criteria) this;
        }

        public Criteria andProfessionidIsNotNull() {
            addCriterion("PROFESSIONID is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionidEqualTo(String value) {
            addCriterion("PROFESSIONID =", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidNotEqualTo(String value) {
            addCriterion("PROFESSIONID <>", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidGreaterThan(String value) {
            addCriterion("PROFESSIONID >", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidGreaterThanOrEqualTo(String value) {
            addCriterion("PROFESSIONID >=", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidLessThan(String value) {
            addCriterion("PROFESSIONID <", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidLessThanOrEqualTo(String value) {
            addCriterion("PROFESSIONID <=", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidLike(String value) {
            addCriterion("PROFESSIONID like", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidNotLike(String value) {
            addCriterion("PROFESSIONID not like", value, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidIn(List<String> values) {
            addCriterion("PROFESSIONID in", values, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidNotIn(List<String> values) {
            addCriterion("PROFESSIONID not in", values, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidBetween(String value1, String value2) {
            addCriterion("PROFESSIONID between", value1, value2, "professionid");
            return (Criteria) this;
        }

        public Criteria andProfessionidNotBetween(String value1, String value2) {
            addCriterion("PROFESSIONID not between", value1, value2, "professionid");
            return (Criteria) this;
        }

        public Criteria andIsautocrateIsNull() {
            addCriterion("ISAUTOCRATE is null");
            return (Criteria) this;
        }

        public Criteria andIsautocrateIsNotNull() {
            addCriterion("ISAUTOCRATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsautocrateEqualTo(Long value) {
            addCriterion("ISAUTOCRATE =", value, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateNotEqualTo(Long value) {
            addCriterion("ISAUTOCRATE <>", value, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateGreaterThan(Long value) {
            addCriterion("ISAUTOCRATE >", value, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateGreaterThanOrEqualTo(Long value) {
            addCriterion("ISAUTOCRATE >=", value, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateLessThan(Long value) {
            addCriterion("ISAUTOCRATE <", value, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateLessThanOrEqualTo(Long value) {
            addCriterion("ISAUTOCRATE <=", value, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateIn(List<Long> values) {
            addCriterion("ISAUTOCRATE in", values, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateNotIn(List<Long> values) {
            addCriterion("ISAUTOCRATE not in", values, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateBetween(Long value1, Long value2) {
            addCriterion("ISAUTOCRATE between", value1, value2, "isautocrate");
            return (Criteria) this;
        }

        public Criteria andIsautocrateNotBetween(Long value1, Long value2) {
            addCriterion("ISAUTOCRATE not between", value1, value2, "isautocrate");
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