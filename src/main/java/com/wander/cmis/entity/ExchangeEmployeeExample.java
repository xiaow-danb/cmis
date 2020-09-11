package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchangeEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeEmployeeExample() {
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

        public Criteria andLoanapplyidIsNull() {
            addCriterion("LOANAPPLYID is null");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidIsNotNull() {
            addCriterion("LOANAPPLYID is not null");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidEqualTo(String value) {
            addCriterion("LOANAPPLYID =", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidNotEqualTo(String value) {
            addCriterion("LOANAPPLYID <>", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidGreaterThan(String value) {
            addCriterion("LOANAPPLYID >", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidGreaterThanOrEqualTo(String value) {
            addCriterion("LOANAPPLYID >=", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidLessThan(String value) {
            addCriterion("LOANAPPLYID <", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidLessThanOrEqualTo(String value) {
            addCriterion("LOANAPPLYID <=", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidLike(String value) {
            addCriterion("LOANAPPLYID like", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidNotLike(String value) {
            addCriterion("LOANAPPLYID not like", value, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidIn(List<String> values) {
            addCriterion("LOANAPPLYID in", values, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidNotIn(List<String> values) {
            addCriterion("LOANAPPLYID not in", values, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidBetween(String value1, String value2) {
            addCriterion("LOANAPPLYID between", value1, value2, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andLoanapplyidNotBetween(String value1, String value2) {
            addCriterion("LOANAPPLYID not between", value1, value2, "loanapplyid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("IDNO is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("IDNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("IDNO =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("IDNO <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("IDNO >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("IDNO >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("IDNO <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("IDNO <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("IDNO like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("IDNO not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("IDNO in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("IDNO not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("IDNO between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("IDNO not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andJydjbhIsNull() {
            addCriterion("JYDJBH is null");
            return (Criteria) this;
        }

        public Criteria andJydjbhIsNotNull() {
            addCriterion("JYDJBH is not null");
            return (Criteria) this;
        }

        public Criteria andJydjbhEqualTo(BigDecimal value) {
            addCriterion("JYDJBH =", value, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhNotEqualTo(BigDecimal value) {
            addCriterion("JYDJBH <>", value, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhGreaterThan(BigDecimal value) {
            addCriterion("JYDJBH >", value, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JYDJBH >=", value, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhLessThan(BigDecimal value) {
            addCriterion("JYDJBH <", value, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JYDJBH <=", value, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhIn(List<BigDecimal> values) {
            addCriterion("JYDJBH in", values, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhNotIn(List<BigDecimal> values) {
            addCriterion("JYDJBH not in", values, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JYDJBH between", value1, value2, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andJydjbhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JYDJBH not between", value1, value2, "jydjbh");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNull() {
            addCriterion("EMPLOYEE_NO is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNotNull() {
            addCriterion("EMPLOYEE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoEqualTo(BigDecimal value) {
            addCriterion("EMPLOYEE_NO =", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotEqualTo(BigDecimal value) {
            addCriterion("EMPLOYEE_NO <>", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThan(BigDecimal value) {
            addCriterion("EMPLOYEE_NO >", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPLOYEE_NO >=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThan(BigDecimal value) {
            addCriterion("EMPLOYEE_NO <", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPLOYEE_NO <=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIn(List<BigDecimal> values) {
            addCriterion("EMPLOYEE_NO in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotIn(List<BigDecimal> values) {
            addCriterion("EMPLOYEE_NO not in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPLOYEE_NO between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPLOYEE_NO not between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexDescIsNull() {
            addCriterion("SEX_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSexDescIsNotNull() {
            addCriterion("SEX_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSexDescEqualTo(String value) {
            addCriterion("SEX_DESC =", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotEqualTo(String value) {
            addCriterion("SEX_DESC <>", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescGreaterThan(String value) {
            addCriterion("SEX_DESC >", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescGreaterThanOrEqualTo(String value) {
            addCriterion("SEX_DESC >=", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLessThan(String value) {
            addCriterion("SEX_DESC <", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLessThanOrEqualTo(String value) {
            addCriterion("SEX_DESC <=", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescLike(String value) {
            addCriterion("SEX_DESC like", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotLike(String value) {
            addCriterion("SEX_DESC not like", value, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescIn(List<String> values) {
            addCriterion("SEX_DESC in", values, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotIn(List<String> values) {
            addCriterion("SEX_DESC not in", values, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescBetween(String value1, String value2) {
            addCriterion("SEX_DESC between", value1, value2, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andSexDescNotBetween(String value1, String value2) {
            addCriterion("SEX_DESC not between", value1, value2, "sexDesc");
            return (Criteria) this;
        }

        public Criteria andHkxzIsNull() {
            addCriterion("HKXZ is null");
            return (Criteria) this;
        }

        public Criteria andHkxzIsNotNull() {
            addCriterion("HKXZ is not null");
            return (Criteria) this;
        }

        public Criteria andHkxzEqualTo(String value) {
            addCriterion("HKXZ =", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzNotEqualTo(String value) {
            addCriterion("HKXZ <>", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzGreaterThan(String value) {
            addCriterion("HKXZ >", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzGreaterThanOrEqualTo(String value) {
            addCriterion("HKXZ >=", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzLessThan(String value) {
            addCriterion("HKXZ <", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzLessThanOrEqualTo(String value) {
            addCriterion("HKXZ <=", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzLike(String value) {
            addCriterion("HKXZ like", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzNotLike(String value) {
            addCriterion("HKXZ not like", value, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzIn(List<String> values) {
            addCriterion("HKXZ in", values, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzNotIn(List<String> values) {
            addCriterion("HKXZ not in", values, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzBetween(String value1, String value2) {
            addCriterion("HKXZ between", value1, value2, "hkxz");
            return (Criteria) this;
        }

        public Criteria andHkxzNotBetween(String value1, String value2) {
            addCriterion("HKXZ not between", value1, value2, "hkxz");
            return (Criteria) this;
        }

        public Criteria andWhcdIsNull() {
            addCriterion("WHCD is null");
            return (Criteria) this;
        }

        public Criteria andWhcdIsNotNull() {
            addCriterion("WHCD is not null");
            return (Criteria) this;
        }

        public Criteria andWhcdEqualTo(String value) {
            addCriterion("WHCD =", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotEqualTo(String value) {
            addCriterion("WHCD <>", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdGreaterThan(String value) {
            addCriterion("WHCD >", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdGreaterThanOrEqualTo(String value) {
            addCriterion("WHCD >=", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLessThan(String value) {
            addCriterion("WHCD <", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLessThanOrEqualTo(String value) {
            addCriterion("WHCD <=", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdLike(String value) {
            addCriterion("WHCD like", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotLike(String value) {
            addCriterion("WHCD not like", value, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdIn(List<String> values) {
            addCriterion("WHCD in", values, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotIn(List<String> values) {
            addCriterion("WHCD not in", values, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdBetween(String value1, String value2) {
            addCriterion("WHCD between", value1, value2, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdNotBetween(String value1, String value2) {
            addCriterion("WHCD not between", value1, value2, "whcd");
            return (Criteria) this;
        }

        public Criteria andWhcdmsIsNull() {
            addCriterion("WHCDMS is null");
            return (Criteria) this;
        }

        public Criteria andWhcdmsIsNotNull() {
            addCriterion("WHCDMS is not null");
            return (Criteria) this;
        }

        public Criteria andWhcdmsEqualTo(String value) {
            addCriterion("WHCDMS =", value, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsNotEqualTo(String value) {
            addCriterion("WHCDMS <>", value, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsGreaterThan(String value) {
            addCriterion("WHCDMS >", value, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsGreaterThanOrEqualTo(String value) {
            addCriterion("WHCDMS >=", value, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsLessThan(String value) {
            addCriterion("WHCDMS <", value, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsLessThanOrEqualTo(String value) {
            addCriterion("WHCDMS <=", value, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsLike(String value) {
            addCriterion("WHCDMS like", value, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsNotLike(String value) {
            addCriterion("WHCDMS not like", value, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsIn(List<String> values) {
            addCriterion("WHCDMS in", values, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsNotIn(List<String> values) {
            addCriterion("WHCDMS not in", values, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsBetween(String value1, String value2) {
            addCriterion("WHCDMS between", value1, value2, "whcdms");
            return (Criteria) this;
        }

        public Criteria andWhcdmsNotBetween(String value1, String value2) {
            addCriterion("WHCDMS not between", value1, value2, "whcdms");
            return (Criteria) this;
        }

        public Criteria andRylb1IsNull() {
            addCriterion("RYLB1 is null");
            return (Criteria) this;
        }

        public Criteria andRylb1IsNotNull() {
            addCriterion("RYLB1 is not null");
            return (Criteria) this;
        }

        public Criteria andRylb1EqualTo(String value) {
            addCriterion("RYLB1 =", value, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1NotEqualTo(String value) {
            addCriterion("RYLB1 <>", value, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1GreaterThan(String value) {
            addCriterion("RYLB1 >", value, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1GreaterThanOrEqualTo(String value) {
            addCriterion("RYLB1 >=", value, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1LessThan(String value) {
            addCriterion("RYLB1 <", value, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1LessThanOrEqualTo(String value) {
            addCriterion("RYLB1 <=", value, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1Like(String value) {
            addCriterion("RYLB1 like", value, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1NotLike(String value) {
            addCriterion("RYLB1 not like", value, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1In(List<String> values) {
            addCriterion("RYLB1 in", values, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1NotIn(List<String> values) {
            addCriterion("RYLB1 not in", values, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1Between(String value1, String value2) {
            addCriterion("RYLB1 between", value1, value2, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRylb1NotBetween(String value1, String value2) {
            addCriterion("RYLB1 not between", value1, value2, "rylb1");
            return (Criteria) this;
        }

        public Criteria andRtlb1msIsNull() {
            addCriterion("RTLB1MS is null");
            return (Criteria) this;
        }

        public Criteria andRtlb1msIsNotNull() {
            addCriterion("RTLB1MS is not null");
            return (Criteria) this;
        }

        public Criteria andRtlb1msEqualTo(String value) {
            addCriterion("RTLB1MS =", value, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msNotEqualTo(String value) {
            addCriterion("RTLB1MS <>", value, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msGreaterThan(String value) {
            addCriterion("RTLB1MS >", value, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msGreaterThanOrEqualTo(String value) {
            addCriterion("RTLB1MS >=", value, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msLessThan(String value) {
            addCriterion("RTLB1MS <", value, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msLessThanOrEqualTo(String value) {
            addCriterion("RTLB1MS <=", value, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msLike(String value) {
            addCriterion("RTLB1MS like", value, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msNotLike(String value) {
            addCriterion("RTLB1MS not like", value, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msIn(List<String> values) {
            addCriterion("RTLB1MS in", values, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msNotIn(List<String> values) {
            addCriterion("RTLB1MS not in", values, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msBetween(String value1, String value2) {
            addCriterion("RTLB1MS between", value1, value2, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRtlb1msNotBetween(String value1, String value2) {
            addCriterion("RTLB1MS not between", value1, value2, "rtlb1ms");
            return (Criteria) this;
        }

        public Criteria andRylb2IsNull() {
            addCriterion("RYLB2 is null");
            return (Criteria) this;
        }

        public Criteria andRylb2IsNotNull() {
            addCriterion("RYLB2 is not null");
            return (Criteria) this;
        }

        public Criteria andRylb2EqualTo(String value) {
            addCriterion("RYLB2 =", value, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2NotEqualTo(String value) {
            addCriterion("RYLB2 <>", value, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2GreaterThan(String value) {
            addCriterion("RYLB2 >", value, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2GreaterThanOrEqualTo(String value) {
            addCriterion("RYLB2 >=", value, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2LessThan(String value) {
            addCriterion("RYLB2 <", value, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2LessThanOrEqualTo(String value) {
            addCriterion("RYLB2 <=", value, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2Like(String value) {
            addCriterion("RYLB2 like", value, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2NotLike(String value) {
            addCriterion("RYLB2 not like", value, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2In(List<String> values) {
            addCriterion("RYLB2 in", values, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2NotIn(List<String> values) {
            addCriterion("RYLB2 not in", values, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2Between(String value1, String value2) {
            addCriterion("RYLB2 between", value1, value2, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2NotBetween(String value1, String value2) {
            addCriterion("RYLB2 not between", value1, value2, "rylb2");
            return (Criteria) this;
        }

        public Criteria andRylb2msIsNull() {
            addCriterion("RYLB2MS is null");
            return (Criteria) this;
        }

        public Criteria andRylb2msIsNotNull() {
            addCriterion("RYLB2MS is not null");
            return (Criteria) this;
        }

        public Criteria andRylb2msEqualTo(String value) {
            addCriterion("RYLB2MS =", value, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msNotEqualTo(String value) {
            addCriterion("RYLB2MS <>", value, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msGreaterThan(String value) {
            addCriterion("RYLB2MS >", value, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msGreaterThanOrEqualTo(String value) {
            addCriterion("RYLB2MS >=", value, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msLessThan(String value) {
            addCriterion("RYLB2MS <", value, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msLessThanOrEqualTo(String value) {
            addCriterion("RYLB2MS <=", value, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msLike(String value) {
            addCriterion("RYLB2MS like", value, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msNotLike(String value) {
            addCriterion("RYLB2MS not like", value, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msIn(List<String> values) {
            addCriterion("RYLB2MS in", values, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msNotIn(List<String> values) {
            addCriterion("RYLB2MS not in", values, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msBetween(String value1, String value2) {
            addCriterion("RYLB2MS between", value1, value2, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb2msNotBetween(String value1, String value2) {
            addCriterion("RYLB2MS not between", value1, value2, "rylb2ms");
            return (Criteria) this;
        }

        public Criteria andRylb3IsNull() {
            addCriterion("RYLB3 is null");
            return (Criteria) this;
        }

        public Criteria andRylb3IsNotNull() {
            addCriterion("RYLB3 is not null");
            return (Criteria) this;
        }

        public Criteria andRylb3EqualTo(String value) {
            addCriterion("RYLB3 =", value, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3NotEqualTo(String value) {
            addCriterion("RYLB3 <>", value, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3GreaterThan(String value) {
            addCriterion("RYLB3 >", value, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3GreaterThanOrEqualTo(String value) {
            addCriterion("RYLB3 >=", value, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3LessThan(String value) {
            addCriterion("RYLB3 <", value, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3LessThanOrEqualTo(String value) {
            addCriterion("RYLB3 <=", value, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3Like(String value) {
            addCriterion("RYLB3 like", value, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3NotLike(String value) {
            addCriterion("RYLB3 not like", value, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3In(List<String> values) {
            addCriterion("RYLB3 in", values, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3NotIn(List<String> values) {
            addCriterion("RYLB3 not in", values, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3Between(String value1, String value2) {
            addCriterion("RYLB3 between", value1, value2, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3NotBetween(String value1, String value2) {
            addCriterion("RYLB3 not between", value1, value2, "rylb3");
            return (Criteria) this;
        }

        public Criteria andRylb3msIsNull() {
            addCriterion("RYLB3MS is null");
            return (Criteria) this;
        }

        public Criteria andRylb3msIsNotNull() {
            addCriterion("RYLB3MS is not null");
            return (Criteria) this;
        }

        public Criteria andRylb3msEqualTo(String value) {
            addCriterion("RYLB3MS =", value, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msNotEqualTo(String value) {
            addCriterion("RYLB3MS <>", value, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msGreaterThan(String value) {
            addCriterion("RYLB3MS >", value, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msGreaterThanOrEqualTo(String value) {
            addCriterion("RYLB3MS >=", value, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msLessThan(String value) {
            addCriterion("RYLB3MS <", value, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msLessThanOrEqualTo(String value) {
            addCriterion("RYLB3MS <=", value, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msLike(String value) {
            addCriterion("RYLB3MS like", value, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msNotLike(String value) {
            addCriterion("RYLB3MS not like", value, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msIn(List<String> values) {
            addCriterion("RYLB3MS in", values, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msNotIn(List<String> values) {
            addCriterion("RYLB3MS not in", values, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msBetween(String value1, String value2) {
            addCriterion("RYLB3MS between", value1, value2, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andRylb3msNotBetween(String value1, String value2) {
            addCriterion("RYLB3MS not between", value1, value2, "rylb3ms");
            return (Criteria) this;
        }

        public Criteria andDkrylbIsNull() {
            addCriterion("DKRYLB is null");
            return (Criteria) this;
        }

        public Criteria andDkrylbIsNotNull() {
            addCriterion("DKRYLB is not null");
            return (Criteria) this;
        }

        public Criteria andDkrylbEqualTo(String value) {
            addCriterion("DKRYLB =", value, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbNotEqualTo(String value) {
            addCriterion("DKRYLB <>", value, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbGreaterThan(String value) {
            addCriterion("DKRYLB >", value, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbGreaterThanOrEqualTo(String value) {
            addCriterion("DKRYLB >=", value, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbLessThan(String value) {
            addCriterion("DKRYLB <", value, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbLessThanOrEqualTo(String value) {
            addCriterion("DKRYLB <=", value, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbLike(String value) {
            addCriterion("DKRYLB like", value, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbNotLike(String value) {
            addCriterion("DKRYLB not like", value, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbIn(List<String> values) {
            addCriterion("DKRYLB in", values, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbNotIn(List<String> values) {
            addCriterion("DKRYLB not in", values, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbBetween(String value1, String value2) {
            addCriterion("DKRYLB between", value1, value2, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbNotBetween(String value1, String value2) {
            addCriterion("DKRYLB not between", value1, value2, "dkrylb");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsIsNull() {
            addCriterion("DKRYLBMS is null");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsIsNotNull() {
            addCriterion("DKRYLBMS is not null");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsEqualTo(String value) {
            addCriterion("DKRYLBMS =", value, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsNotEqualTo(String value) {
            addCriterion("DKRYLBMS <>", value, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsGreaterThan(String value) {
            addCriterion("DKRYLBMS >", value, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsGreaterThanOrEqualTo(String value) {
            addCriterion("DKRYLBMS >=", value, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsLessThan(String value) {
            addCriterion("DKRYLBMS <", value, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsLessThanOrEqualTo(String value) {
            addCriterion("DKRYLBMS <=", value, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsLike(String value) {
            addCriterion("DKRYLBMS like", value, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsNotLike(String value) {
            addCriterion("DKRYLBMS not like", value, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsIn(List<String> values) {
            addCriterion("DKRYLBMS in", values, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsNotIn(List<String> values) {
            addCriterion("DKRYLBMS not in", values, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsBetween(String value1, String value2) {
            addCriterion("DKRYLBMS between", value1, value2, "dkrylbms");
            return (Criteria) this;
        }

        public Criteria andDkrylbmsNotBetween(String value1, String value2) {
            addCriterion("DKRYLBMS not between", value1, value2, "dkrylbms");
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