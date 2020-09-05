package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CrmenterpriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmenterpriseExample() {
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

        public Criteria andBelongareaIsNull() {
            addCriterion("BELONGAREA is null");
            return (Criteria) this;
        }

        public Criteria andBelongareaIsNotNull() {
            addCriterion("BELONGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andBelongareaEqualTo(String value) {
            addCriterion("BELONGAREA =", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotEqualTo(String value) {
            addCriterion("BELONGAREA <>", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaGreaterThan(String value) {
            addCriterion("BELONGAREA >", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaGreaterThanOrEqualTo(String value) {
            addCriterion("BELONGAREA >=", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaLessThan(String value) {
            addCriterion("BELONGAREA <", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaLessThanOrEqualTo(String value) {
            addCriterion("BELONGAREA <=", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaLike(String value) {
            addCriterion("BELONGAREA like", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotLike(String value) {
            addCriterion("BELONGAREA not like", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaIn(List<String> values) {
            addCriterion("BELONGAREA in", values, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotIn(List<String> values) {
            addCriterion("BELONGAREA not in", values, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaBetween(String value1, String value2) {
            addCriterion("BELONGAREA between", value1, value2, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotBetween(String value1, String value2) {
            addCriterion("BELONGAREA not between", value1, value2, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaIsNull() {
            addCriterion("BUILDINGAREA is null");
            return (Criteria) this;
        }

        public Criteria andBuildingareaIsNotNull() {
            addCriterion("BUILDINGAREA is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingareaEqualTo(BigDecimal value) {
            addCriterion("BUILDINGAREA =", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotEqualTo(BigDecimal value) {
            addCriterion("BUILDINGAREA <>", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaGreaterThan(BigDecimal value) {
            addCriterion("BUILDINGAREA >", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUILDINGAREA >=", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaLessThan(BigDecimal value) {
            addCriterion("BUILDINGAREA <", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUILDINGAREA <=", value, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaIn(List<BigDecimal> values) {
            addCriterion("BUILDINGAREA in", values, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotIn(List<BigDecimal> values) {
            addCriterion("BUILDINGAREA not in", values, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUILDINGAREA between", value1, value2, "buildingarea");
            return (Criteria) this;
        }

        public Criteria andBuildingareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUILDINGAREA not between", value1, value2, "buildingarea");
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

        public Criteria andCustomindustryIsNull() {
            addCriterion("CUSTOMINDUSTRY is null");
            return (Criteria) this;
        }

        public Criteria andCustomindustryIsNotNull() {
            addCriterion("CUSTOMINDUSTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomindustryEqualTo(String value) {
            addCriterion("CUSTOMINDUSTRY =", value, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryNotEqualTo(String value) {
            addCriterion("CUSTOMINDUSTRY <>", value, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryGreaterThan(String value) {
            addCriterion("CUSTOMINDUSTRY >", value, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMINDUSTRY >=", value, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryLessThan(String value) {
            addCriterion("CUSTOMINDUSTRY <", value, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMINDUSTRY <=", value, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryLike(String value) {
            addCriterion("CUSTOMINDUSTRY like", value, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryNotLike(String value) {
            addCriterion("CUSTOMINDUSTRY not like", value, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryIn(List<String> values) {
            addCriterion("CUSTOMINDUSTRY in", values, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryNotIn(List<String> values) {
            addCriterion("CUSTOMINDUSTRY not in", values, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryBetween(String value1, String value2) {
            addCriterion("CUSTOMINDUSTRY between", value1, value2, "customindustry");
            return (Criteria) this;
        }

        public Criteria andCustomindustryNotBetween(String value1, String value2) {
            addCriterion("CUSTOMINDUSTRY not between", value1, value2, "customindustry");
            return (Criteria) this;
        }

        public Criteria andEcononatureIsNull() {
            addCriterion("ECONONATURE is null");
            return (Criteria) this;
        }

        public Criteria andEcononatureIsNotNull() {
            addCriterion("ECONONATURE is not null");
            return (Criteria) this;
        }

        public Criteria andEcononatureEqualTo(String value) {
            addCriterion("ECONONATURE =", value, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureNotEqualTo(String value) {
            addCriterion("ECONONATURE <>", value, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureGreaterThan(String value) {
            addCriterion("ECONONATURE >", value, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureGreaterThanOrEqualTo(String value) {
            addCriterion("ECONONATURE >=", value, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureLessThan(String value) {
            addCriterion("ECONONATURE <", value, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureLessThanOrEqualTo(String value) {
            addCriterion("ECONONATURE <=", value, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureLike(String value) {
            addCriterion("ECONONATURE like", value, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureNotLike(String value) {
            addCriterion("ECONONATURE not like", value, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureIn(List<String> values) {
            addCriterion("ECONONATURE in", values, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureNotIn(List<String> values) {
            addCriterion("ECONONATURE not in", values, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureBetween(String value1, String value2) {
            addCriterion("ECONONATURE between", value1, value2, "econonature");
            return (Criteria) this;
        }

        public Criteria andEcononatureNotBetween(String value1, String value2) {
            addCriterion("ECONONATURE not between", value1, value2, "econonature");
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

        public Criteria andEnterprisesizeIsNull() {
            addCriterion("ENTERPRISESIZE is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeIsNotNull() {
            addCriterion("ENTERPRISESIZE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeEqualTo(String value) {
            addCriterion("ENTERPRISESIZE =", value, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeNotEqualTo(String value) {
            addCriterion("ENTERPRISESIZE <>", value, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeGreaterThan(String value) {
            addCriterion("ENTERPRISESIZE >", value, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeGreaterThanOrEqualTo(String value) {
            addCriterion("ENTERPRISESIZE >=", value, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeLessThan(String value) {
            addCriterion("ENTERPRISESIZE <", value, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeLessThanOrEqualTo(String value) {
            addCriterion("ENTERPRISESIZE <=", value, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeLike(String value) {
            addCriterion("ENTERPRISESIZE like", value, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeNotLike(String value) {
            addCriterion("ENTERPRISESIZE not like", value, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeIn(List<String> values) {
            addCriterion("ENTERPRISESIZE in", values, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeNotIn(List<String> values) {
            addCriterion("ENTERPRISESIZE not in", values, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeBetween(String value1, String value2) {
            addCriterion("ENTERPRISESIZE between", value1, value2, "enterprisesize");
            return (Criteria) this;
        }

        public Criteria andEnterprisesizeNotBetween(String value1, String value2) {
            addCriterion("ENTERPRISESIZE not between", value1, value2, "enterprisesize");
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

        public Criteria andManageplaceareaIsNull() {
            addCriterion("MANAGEPLACEAREA is null");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaIsNotNull() {
            addCriterion("MANAGEPLACEAREA is not null");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaEqualTo(BigDecimal value) {
            addCriterion("MANAGEPLACEAREA =", value, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaNotEqualTo(BigDecimal value) {
            addCriterion("MANAGEPLACEAREA <>", value, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaGreaterThan(BigDecimal value) {
            addCriterion("MANAGEPLACEAREA >", value, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MANAGEPLACEAREA >=", value, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaLessThan(BigDecimal value) {
            addCriterion("MANAGEPLACEAREA <", value, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MANAGEPLACEAREA <=", value, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaIn(List<BigDecimal> values) {
            addCriterion("MANAGEPLACEAREA in", values, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaNotIn(List<BigDecimal> values) {
            addCriterion("MANAGEPLACEAREA not in", values, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANAGEPLACEAREA between", value1, value2, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MANAGEPLACEAREA not between", value1, value2, "manageplacearea");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerIsNull() {
            addCriterion("MANAGEPLACEOWNER is null");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerIsNotNull() {
            addCriterion("MANAGEPLACEOWNER is not null");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerEqualTo(String value) {
            addCriterion("MANAGEPLACEOWNER =", value, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerNotEqualTo(String value) {
            addCriterion("MANAGEPLACEOWNER <>", value, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerGreaterThan(String value) {
            addCriterion("MANAGEPLACEOWNER >", value, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGEPLACEOWNER >=", value, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerLessThan(String value) {
            addCriterion("MANAGEPLACEOWNER <", value, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerLessThanOrEqualTo(String value) {
            addCriterion("MANAGEPLACEOWNER <=", value, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerLike(String value) {
            addCriterion("MANAGEPLACEOWNER like", value, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerNotLike(String value) {
            addCriterion("MANAGEPLACEOWNER not like", value, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerIn(List<String> values) {
            addCriterion("MANAGEPLACEOWNER in", values, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerNotIn(List<String> values) {
            addCriterion("MANAGEPLACEOWNER not in", values, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerBetween(String value1, String value2) {
            addCriterion("MANAGEPLACEOWNER between", value1, value2, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplaceownerNotBetween(String value1, String value2) {
            addCriterion("MANAGEPLACEOWNER not between", value1, value2, "manageplaceowner");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationIsNull() {
            addCriterion("MANAGEPLACESITUATION is null");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationIsNotNull() {
            addCriterion("MANAGEPLACESITUATION is not null");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationEqualTo(String value) {
            addCriterion("MANAGEPLACESITUATION =", value, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationNotEqualTo(String value) {
            addCriterion("MANAGEPLACESITUATION <>", value, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationGreaterThan(String value) {
            addCriterion("MANAGEPLACESITUATION >", value, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGEPLACESITUATION >=", value, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationLessThan(String value) {
            addCriterion("MANAGEPLACESITUATION <", value, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationLessThanOrEqualTo(String value) {
            addCriterion("MANAGEPLACESITUATION <=", value, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationLike(String value) {
            addCriterion("MANAGEPLACESITUATION like", value, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationNotLike(String value) {
            addCriterion("MANAGEPLACESITUATION not like", value, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationIn(List<String> values) {
            addCriterion("MANAGEPLACESITUATION in", values, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationNotIn(List<String> values) {
            addCriterion("MANAGEPLACESITUATION not in", values, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationBetween(String value1, String value2) {
            addCriterion("MANAGEPLACESITUATION between", value1, value2, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplacesituationNotBetween(String value1, String value2) {
            addCriterion("MANAGEPLACESITUATION not between", value1, value2, "manageplacesituation");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsIsNull() {
            addCriterion("MANAGEPLACEYEARS is null");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsIsNotNull() {
            addCriterion("MANAGEPLACEYEARS is not null");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsEqualTo(Long value) {
            addCriterion("MANAGEPLACEYEARS =", value, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsNotEqualTo(Long value) {
            addCriterion("MANAGEPLACEYEARS <>", value, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsGreaterThan(Long value) {
            addCriterion("MANAGEPLACEYEARS >", value, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsGreaterThanOrEqualTo(Long value) {
            addCriterion("MANAGEPLACEYEARS >=", value, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsLessThan(Long value) {
            addCriterion("MANAGEPLACEYEARS <", value, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsLessThanOrEqualTo(Long value) {
            addCriterion("MANAGEPLACEYEARS <=", value, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsIn(List<Long> values) {
            addCriterion("MANAGEPLACEYEARS in", values, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsNotIn(List<Long> values) {
            addCriterion("MANAGEPLACEYEARS not in", values, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsBetween(Long value1, Long value2) {
            addCriterion("MANAGEPLACEYEARS between", value1, value2, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andManageplaceyearsNotBetween(Long value1, Long value2) {
            addCriterion("MANAGEPLACEYEARS not between", value1, value2, "manageplaceyears");
            return (Criteria) this;
        }

        public Criteria andNatureIsNull() {
            addCriterion("NATURE is null");
            return (Criteria) this;
        }

        public Criteria andNatureIsNotNull() {
            addCriterion("NATURE is not null");
            return (Criteria) this;
        }

        public Criteria andNatureEqualTo(String value) {
            addCriterion("NATURE =", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotEqualTo(String value) {
            addCriterion("NATURE <>", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThan(String value) {
            addCriterion("NATURE >", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureGreaterThanOrEqualTo(String value) {
            addCriterion("NATURE >=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThan(String value) {
            addCriterion("NATURE <", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLessThanOrEqualTo(String value) {
            addCriterion("NATURE <=", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureLike(String value) {
            addCriterion("NATURE like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotLike(String value) {
            addCriterion("NATURE not like", value, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureIn(List<String> values) {
            addCriterion("NATURE in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotIn(List<String> values) {
            addCriterion("NATURE not in", values, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureBetween(String value1, String value2) {
            addCriterion("NATURE between", value1, value2, "nature");
            return (Criteria) this;
        }

        public Criteria andNatureNotBetween(String value1, String value2) {
            addCriterion("NATURE not between", value1, value2, "nature");
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

        public Criteria andRegisteryearsIsNull() {
            addCriterion("REGISTERYEARS is null");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsIsNotNull() {
            addCriterion("REGISTERYEARS is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsEqualTo(Long value) {
            addCriterion("REGISTERYEARS =", value, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsNotEqualTo(Long value) {
            addCriterion("REGISTERYEARS <>", value, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsGreaterThan(Long value) {
            addCriterion("REGISTERYEARS >", value, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsGreaterThanOrEqualTo(Long value) {
            addCriterion("REGISTERYEARS >=", value, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsLessThan(Long value) {
            addCriterion("REGISTERYEARS <", value, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsLessThanOrEqualTo(Long value) {
            addCriterion("REGISTERYEARS <=", value, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsIn(List<Long> values) {
            addCriterion("REGISTERYEARS in", values, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsNotIn(List<Long> values) {
            addCriterion("REGISTERYEARS not in", values, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsBetween(Long value1, Long value2) {
            addCriterion("REGISTERYEARS between", value1, value2, "registeryears");
            return (Criteria) this;
        }

        public Criteria andRegisteryearsNotBetween(Long value1, Long value2) {
            addCriterion("REGISTERYEARS not between", value1, value2, "registeryears");
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

        public Criteria andUsedareaIsNull() {
            addCriterion("USEDAREA is null");
            return (Criteria) this;
        }

        public Criteria andUsedareaIsNotNull() {
            addCriterion("USEDAREA is not null");
            return (Criteria) this;
        }

        public Criteria andUsedareaEqualTo(BigDecimal value) {
            addCriterion("USEDAREA =", value, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaNotEqualTo(BigDecimal value) {
            addCriterion("USEDAREA <>", value, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaGreaterThan(BigDecimal value) {
            addCriterion("USEDAREA >", value, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAREA >=", value, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaLessThan(BigDecimal value) {
            addCriterion("USEDAREA <", value, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("USEDAREA <=", value, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaIn(List<BigDecimal> values) {
            addCriterion("USEDAREA in", values, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaNotIn(List<BigDecimal> values) {
            addCriterion("USEDAREA not in", values, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAREA between", value1, value2, "usedarea");
            return (Criteria) this;
        }

        public Criteria andUsedareaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("USEDAREA not between", value1, value2, "usedarea");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("WEBSITE is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("WEBSITE is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("WEBSITE =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("WEBSITE <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("WEBSITE >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("WEBSITE >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("WEBSITE <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("WEBSITE <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("WEBSITE like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("WEBSITE not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("WEBSITE in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("WEBSITE not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("WEBSITE between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("WEBSITE not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdIsNull() {
            addCriterion("ACTUALCONTROLLER_ID is null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdIsNotNull() {
            addCriterion("ACTUALCONTROLLER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdEqualTo(String value) {
            addCriterion("ACTUALCONTROLLER_ID =", value, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdNotEqualTo(String value) {
            addCriterion("ACTUALCONTROLLER_ID <>", value, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdGreaterThan(String value) {
            addCriterion("ACTUALCONTROLLER_ID >", value, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLER_ID >=", value, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdLessThan(String value) {
            addCriterion("ACTUALCONTROLLER_ID <", value, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdLessThanOrEqualTo(String value) {
            addCriterion("ACTUALCONTROLLER_ID <=", value, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdLike(String value) {
            addCriterion("ACTUALCONTROLLER_ID like", value, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdNotLike(String value) {
            addCriterion("ACTUALCONTROLLER_ID not like", value, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdIn(List<String> values) {
            addCriterion("ACTUALCONTROLLER_ID in", values, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdNotIn(List<String> values) {
            addCriterion("ACTUALCONTROLLER_ID not in", values, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLER_ID between", value1, value2, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIdNotBetween(String value1, String value2) {
            addCriterion("ACTUALCONTROLLER_ID not between", value1, value2, "actualcontrollerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdIsNull() {
            addCriterion("AGENTMANAGER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdIsNotNull() {
            addCriterion("AGENTMANAGER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdEqualTo(String value) {
            addCriterion("AGENTMANAGER_ID =", value, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdNotEqualTo(String value) {
            addCriterion("AGENTMANAGER_ID <>", value, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdGreaterThan(String value) {
            addCriterion("AGENTMANAGER_ID >", value, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdGreaterThanOrEqualTo(String value) {
            addCriterion("AGENTMANAGER_ID >=", value, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdLessThan(String value) {
            addCriterion("AGENTMANAGER_ID <", value, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdLessThanOrEqualTo(String value) {
            addCriterion("AGENTMANAGER_ID <=", value, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdLike(String value) {
            addCriterion("AGENTMANAGER_ID like", value, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdNotLike(String value) {
            addCriterion("AGENTMANAGER_ID not like", value, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdIn(List<String> values) {
            addCriterion("AGENTMANAGER_ID in", values, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdNotIn(List<String> values) {
            addCriterion("AGENTMANAGER_ID not in", values, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdBetween(String value1, String value2) {
            addCriterion("AGENTMANAGER_ID between", value1, value2, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andAgentmanagerIdNotBetween(String value1, String value2) {
            addCriterion("AGENTMANAGER_ID not between", value1, value2, "agentmanagerId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdIsNull() {
            addCriterion("LEGALREPRESENTATIVE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdIsNotNull() {
            addCriterion("LEGALREPRESENTATIVE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE_ID =", value, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdNotEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE_ID <>", value, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdGreaterThan(String value) {
            addCriterion("LEGALREPRESENTATIVE_ID >", value, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE_ID >=", value, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdLessThan(String value) {
            addCriterion("LEGALREPRESENTATIVE_ID <", value, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdLessThanOrEqualTo(String value) {
            addCriterion("LEGALREPRESENTATIVE_ID <=", value, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdLike(String value) {
            addCriterion("LEGALREPRESENTATIVE_ID like", value, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdNotLike(String value) {
            addCriterion("LEGALREPRESENTATIVE_ID not like", value, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdIn(List<String> values) {
            addCriterion("LEGALREPRESENTATIVE_ID in", values, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdNotIn(List<String> values) {
            addCriterion("LEGALREPRESENTATIVE_ID not in", values, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdBetween(String value1, String value2) {
            addCriterion("LEGALREPRESENTATIVE_ID between", value1, value2, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andLegalrepresentativeIdNotBetween(String value1, String value2) {
            addCriterion("LEGALREPRESENTATIVE_ID not between", value1, value2, "legalrepresentativeId");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNull() {
            addCriterion("GROUPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIsNotNull() {
            addCriterion("GROUPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGrouptypeEqualTo(String value) {
            addCriterion("GROUPTYPE =", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotEqualTo(String value) {
            addCriterion("GROUPTYPE <>", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThan(String value) {
            addCriterion("GROUPTYPE >", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeGreaterThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE >=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThan(String value) {
            addCriterion("GROUPTYPE <", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLessThanOrEqualTo(String value) {
            addCriterion("GROUPTYPE <=", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeLike(String value) {
            addCriterion("GROUPTYPE like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotLike(String value) {
            addCriterion("GROUPTYPE not like", value, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeIn(List<String> values) {
            addCriterion("GROUPTYPE in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotIn(List<String> values) {
            addCriterion("GROUPTYPE not in", values, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeBetween(String value1, String value2) {
            addCriterion("GROUPTYPE between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andGrouptypeNotBetween(String value1, String value2) {
            addCriterion("GROUPTYPE not between", value1, value2, "grouptype");
            return (Criteria) this;
        }

        public Criteria andCreditnoteIsNull() {
            addCriterion("CREDITNOTE is null");
            return (Criteria) this;
        }

        public Criteria andCreditnoteIsNotNull() {
            addCriterion("CREDITNOTE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditnoteEqualTo(String value) {
            addCriterion("CREDITNOTE =", value, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteNotEqualTo(String value) {
            addCriterion("CREDITNOTE <>", value, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteGreaterThan(String value) {
            addCriterion("CREDITNOTE >", value, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteGreaterThanOrEqualTo(String value) {
            addCriterion("CREDITNOTE >=", value, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteLessThan(String value) {
            addCriterion("CREDITNOTE <", value, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteLessThanOrEqualTo(String value) {
            addCriterion("CREDITNOTE <=", value, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteLike(String value) {
            addCriterion("CREDITNOTE like", value, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteNotLike(String value) {
            addCriterion("CREDITNOTE not like", value, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteIn(List<String> values) {
            addCriterion("CREDITNOTE in", values, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteNotIn(List<String> values) {
            addCriterion("CREDITNOTE not in", values, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteBetween(String value1, String value2) {
            addCriterion("CREDITNOTE between", value1, value2, "creditnote");
            return (Criteria) this;
        }

        public Criteria andCreditnoteNotBetween(String value1, String value2) {
            addCriterion("CREDITNOTE not between", value1, value2, "creditnote");
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

        public Criteria andNewemployeenumIsNull() {
            addCriterion("NEWEMPLOYEENUM is null");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumIsNotNull() {
            addCriterion("NEWEMPLOYEENUM is not null");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumEqualTo(Long value) {
            addCriterion("NEWEMPLOYEENUM =", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumNotEqualTo(Long value) {
            addCriterion("NEWEMPLOYEENUM <>", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumGreaterThan(Long value) {
            addCriterion("NEWEMPLOYEENUM >", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumGreaterThanOrEqualTo(Long value) {
            addCriterion("NEWEMPLOYEENUM >=", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumLessThan(Long value) {
            addCriterion("NEWEMPLOYEENUM <", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumLessThanOrEqualTo(Long value) {
            addCriterion("NEWEMPLOYEENUM <=", value, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumIn(List<Long> values) {
            addCriterion("NEWEMPLOYEENUM in", values, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumNotIn(List<Long> values) {
            addCriterion("NEWEMPLOYEENUM not in", values, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumBetween(Long value1, Long value2) {
            addCriterion("NEWEMPLOYEENUM between", value1, value2, "newemployeenum");
            return (Criteria) this;
        }

        public Criteria andNewemployeenumNotBetween(Long value1, Long value2) {
            addCriterion("NEWEMPLOYEENUM not between", value1, value2, "newemployeenum");
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