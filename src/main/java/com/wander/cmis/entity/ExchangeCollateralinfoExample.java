package com.wander.cmis.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExchangeCollateralinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExchangeCollateralinfoExample() {
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

        public Criteria andAssetownertypeIsNull() {
            addCriterion("ASSETOWNERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeIsNotNull() {
            addCriterion("ASSETOWNERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeEqualTo(String value) {
            addCriterion("ASSETOWNERTYPE =", value, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeNotEqualTo(String value) {
            addCriterion("ASSETOWNERTYPE <>", value, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeGreaterThan(String value) {
            addCriterion("ASSETOWNERTYPE >", value, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETOWNERTYPE >=", value, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeLessThan(String value) {
            addCriterion("ASSETOWNERTYPE <", value, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeLessThanOrEqualTo(String value) {
            addCriterion("ASSETOWNERTYPE <=", value, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeLike(String value) {
            addCriterion("ASSETOWNERTYPE like", value, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeNotLike(String value) {
            addCriterion("ASSETOWNERTYPE not like", value, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeIn(List<String> values) {
            addCriterion("ASSETOWNERTYPE in", values, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeNotIn(List<String> values) {
            addCriterion("ASSETOWNERTYPE not in", values, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeBetween(String value1, String value2) {
            addCriterion("ASSETOWNERTYPE between", value1, value2, "assetownertype");
            return (Criteria) this;
        }

        public Criteria andAssetownertypeNotBetween(String value1, String value2) {
            addCriterion("ASSETOWNERTYPE not between", value1, value2, "assetownertype");
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

        public Criteria andMortgagenameIsNull() {
            addCriterion("MORTGAGENAME is null");
            return (Criteria) this;
        }

        public Criteria andMortgagenameIsNotNull() {
            addCriterion("MORTGAGENAME is not null");
            return (Criteria) this;
        }

        public Criteria andMortgagenameEqualTo(String value) {
            addCriterion("MORTGAGENAME =", value, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameNotEqualTo(String value) {
            addCriterion("MORTGAGENAME <>", value, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameGreaterThan(String value) {
            addCriterion("MORTGAGENAME >", value, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameGreaterThanOrEqualTo(String value) {
            addCriterion("MORTGAGENAME >=", value, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameLessThan(String value) {
            addCriterion("MORTGAGENAME <", value, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameLessThanOrEqualTo(String value) {
            addCriterion("MORTGAGENAME <=", value, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameLike(String value) {
            addCriterion("MORTGAGENAME like", value, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameNotLike(String value) {
            addCriterion("MORTGAGENAME not like", value, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameIn(List<String> values) {
            addCriterion("MORTGAGENAME in", values, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameNotIn(List<String> values) {
            addCriterion("MORTGAGENAME not in", values, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameBetween(String value1, String value2) {
            addCriterion("MORTGAGENAME between", value1, value2, "mortgagename");
            return (Criteria) this;
        }

        public Criteria andMortgagenameNotBetween(String value1, String value2) {
            addCriterion("MORTGAGENAME not between", value1, value2, "mortgagename");
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

        public Criteria andMortgageareaEqualTo(String value) {
            addCriterion("MORTGAGEAREA =", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaNotEqualTo(String value) {
            addCriterion("MORTGAGEAREA <>", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaGreaterThan(String value) {
            addCriterion("MORTGAGEAREA >", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaGreaterThanOrEqualTo(String value) {
            addCriterion("MORTGAGEAREA >=", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaLessThan(String value) {
            addCriterion("MORTGAGEAREA <", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaLessThanOrEqualTo(String value) {
            addCriterion("MORTGAGEAREA <=", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaLike(String value) {
            addCriterion("MORTGAGEAREA like", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaNotLike(String value) {
            addCriterion("MORTGAGEAREA not like", value, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaIn(List<String> values) {
            addCriterion("MORTGAGEAREA in", values, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaNotIn(List<String> values) {
            addCriterion("MORTGAGEAREA not in", values, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaBetween(String value1, String value2) {
            addCriterion("MORTGAGEAREA between", value1, value2, "mortgagearea");
            return (Criteria) this;
        }

        public Criteria andMortgageareaNotBetween(String value1, String value2) {
            addCriterion("MORTGAGEAREA not between", value1, value2, "mortgagearea");
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

        public Criteria andBuydateIsNull() {
            addCriterion("BUYDATE is null");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNotNull() {
            addCriterion("BUYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBuydateEqualTo(String value) {
            addCriterion("BUYDATE =", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotEqualTo(String value) {
            addCriterion("BUYDATE <>", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThan(String value) {
            addCriterion("BUYDATE >", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThanOrEqualTo(String value) {
            addCriterion("BUYDATE >=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThan(String value) {
            addCriterion("BUYDATE <", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThanOrEqualTo(String value) {
            addCriterion("BUYDATE <=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLike(String value) {
            addCriterion("BUYDATE like", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotLike(String value) {
            addCriterion("BUYDATE not like", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateIn(List<String> values) {
            addCriterion("BUYDATE in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotIn(List<String> values) {
            addCriterion("BUYDATE not in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateBetween(String value1, String value2) {
            addCriterion("BUYDATE between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotBetween(String value1, String value2) {
            addCriterion("BUYDATE not between", value1, value2, "buydate");
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

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
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