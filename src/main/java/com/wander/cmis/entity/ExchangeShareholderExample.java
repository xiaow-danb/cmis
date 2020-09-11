package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchangeShareholderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeShareholderExample() {
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

        public Criteria andShareamtIsNull() {
            addCriterion("SHAREAMT is null");
            return (Criteria) this;
        }

        public Criteria andShareamtIsNotNull() {
            addCriterion("SHAREAMT is not null");
            return (Criteria) this;
        }

        public Criteria andShareamtEqualTo(BigDecimal value) {
            addCriterion("SHAREAMT =", value, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtNotEqualTo(BigDecimal value) {
            addCriterion("SHAREAMT <>", value, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtGreaterThan(BigDecimal value) {
            addCriterion("SHAREAMT >", value, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHAREAMT >=", value, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtLessThan(BigDecimal value) {
            addCriterion("SHAREAMT <", value, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHAREAMT <=", value, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtIn(List<BigDecimal> values) {
            addCriterion("SHAREAMT in", values, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtNotIn(List<BigDecimal> values) {
            addCriterion("SHAREAMT not in", values, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHAREAMT between", value1, value2, "shareamt");
            return (Criteria) this;
        }

        public Criteria andShareamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHAREAMT not between", value1, value2, "shareamt");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andGdbhIsNull() {
            addCriterion("GDBH is null");
            return (Criteria) this;
        }

        public Criteria andGdbhIsNotNull() {
            addCriterion("GDBH is not null");
            return (Criteria) this;
        }

        public Criteria andGdbhEqualTo(BigDecimal value) {
            addCriterion("GDBH =", value, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhNotEqualTo(BigDecimal value) {
            addCriterion("GDBH <>", value, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhGreaterThan(BigDecimal value) {
            addCriterion("GDBH >", value, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GDBH >=", value, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhLessThan(BigDecimal value) {
            addCriterion("GDBH <", value, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GDBH <=", value, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhIn(List<BigDecimal> values) {
            addCriterion("GDBH in", values, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhNotIn(List<BigDecimal> values) {
            addCriterion("GDBH not in", values, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GDBH between", value1, value2, "gdbh");
            return (Criteria) this;
        }

        public Criteria andGdbhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GDBH not between", value1, value2, "gdbh");
            return (Criteria) this;
        }

        public Criteria andUnitNoIsNull() {
            addCriterion("UNIT_NO is null");
            return (Criteria) this;
        }

        public Criteria andUnitNoIsNotNull() {
            addCriterion("UNIT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUnitNoEqualTo(BigDecimal value) {
            addCriterion("UNIT_NO =", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotEqualTo(BigDecimal value) {
            addCriterion("UNIT_NO <>", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoGreaterThan(BigDecimal value) {
            addCriterion("UNIT_NO >", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_NO >=", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLessThan(BigDecimal value) {
            addCriterion("UNIT_NO <", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_NO <=", value, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoIn(List<BigDecimal> values) {
            addCriterion("UNIT_NO in", values, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotIn(List<BigDecimal> values) {
            addCriterion("UNIT_NO not in", values, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_NO between", value1, value2, "unitNo");
            return (Criteria) this;
        }

        public Criteria andUnitNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_NO not between", value1, value2, "unitNo");
            return (Criteria) this;
        }

        public Criteria andQdczbsIsNull() {
            addCriterion("QDCZBS is null");
            return (Criteria) this;
        }

        public Criteria andQdczbsIsNotNull() {
            addCriterion("QDCZBS is not null");
            return (Criteria) this;
        }

        public Criteria andQdczbsEqualTo(String value) {
            addCriterion("QDCZBS =", value, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsNotEqualTo(String value) {
            addCriterion("QDCZBS <>", value, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsGreaterThan(String value) {
            addCriterion("QDCZBS >", value, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsGreaterThanOrEqualTo(String value) {
            addCriterion("QDCZBS >=", value, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsLessThan(String value) {
            addCriterion("QDCZBS <", value, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsLessThanOrEqualTo(String value) {
            addCriterion("QDCZBS <=", value, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsLike(String value) {
            addCriterion("QDCZBS like", value, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsNotLike(String value) {
            addCriterion("QDCZBS not like", value, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsIn(List<String> values) {
            addCriterion("QDCZBS in", values, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsNotIn(List<String> values) {
            addCriterion("QDCZBS not in", values, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsBetween(String value1, String value2) {
            addCriterion("QDCZBS between", value1, value2, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsNotBetween(String value1, String value2) {
            addCriterion("QDCZBS not between", value1, value2, "qdczbs");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsIsNull() {
            addCriterion("QDCZBSMS is null");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsIsNotNull() {
            addCriterion("QDCZBSMS is not null");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsEqualTo(String value) {
            addCriterion("QDCZBSMS =", value, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsNotEqualTo(String value) {
            addCriterion("QDCZBSMS <>", value, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsGreaterThan(String value) {
            addCriterion("QDCZBSMS >", value, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsGreaterThanOrEqualTo(String value) {
            addCriterion("QDCZBSMS >=", value, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsLessThan(String value) {
            addCriterion("QDCZBSMS <", value, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsLessThanOrEqualTo(String value) {
            addCriterion("QDCZBSMS <=", value, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsLike(String value) {
            addCriterion("QDCZBSMS like", value, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsNotLike(String value) {
            addCriterion("QDCZBSMS not like", value, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsIn(List<String> values) {
            addCriterion("QDCZBSMS in", values, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsNotIn(List<String> values) {
            addCriterion("QDCZBSMS not in", values, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsBetween(String value1, String value2) {
            addCriterion("QDCZBSMS between", value1, value2, "qdczbsms");
            return (Criteria) this;
        }

        public Criteria andQdczbsmsNotBetween(String value1, String value2) {
            addCriterion("QDCZBSMS not between", value1, value2, "qdczbsms");
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