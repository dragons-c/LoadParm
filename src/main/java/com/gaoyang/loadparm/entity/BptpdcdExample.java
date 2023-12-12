package com.gaoyang.loadparm.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BptpdcdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BptpdcdExample() {
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

        public Criteria andPRDT_CODEIsNull() {
            addCriterion("PRDT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODEIsNotNull() {
            addCriterion("PRDT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODEEqualTo(String value) {
            addCriterion("PRDT_CODE =", value, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODENotEqualTo(String value) {
            addCriterion("PRDT_CODE <>", value, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODEGreaterThan(String value) {
            addCriterion("PRDT_CODE >", value, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_CODE >=", value, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODELessThan(String value) {
            addCriterion("PRDT_CODE <", value, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODELessThanOrEqualTo(String value) {
            addCriterion("PRDT_CODE <=", value, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODELike(String value) {
            addCriterion("PRDT_CODE like", value, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODENotLike(String value) {
            addCriterion("PRDT_CODE not like", value, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODEIn(List<String> values) {
            addCriterion("PRDT_CODE in", values, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODENotIn(List<String> values) {
            addCriterion("PRDT_CODE not in", values, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODEBetween(String value1, String value2) {
            addCriterion("PRDT_CODE between", value1, value2, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andPRDT_CODENotBetween(String value1, String value2) {
            addCriterion("PRDT_CODE not between", value1, value2, "PRDT_CODE");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGIsNull() {
            addCriterion("CUS_PER_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGIsNotNull() {
            addCriterion("CUS_PER_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGEqualTo(String value) {
            addCriterion("CUS_PER_FLG =", value, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGNotEqualTo(String value) {
            addCriterion("CUS_PER_FLG <>", value, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGGreaterThan(String value) {
            addCriterion("CUS_PER_FLG >", value, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_PER_FLG >=", value, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGLessThan(String value) {
            addCriterion("CUS_PER_FLG <", value, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGLessThanOrEqualTo(String value) {
            addCriterion("CUS_PER_FLG <=", value, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGLike(String value) {
            addCriterion("CUS_PER_FLG like", value, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGNotLike(String value) {
            addCriterion("CUS_PER_FLG not like", value, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGIn(List<String> values) {
            addCriterion("CUS_PER_FLG in", values, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGNotIn(List<String> values) {
            addCriterion("CUS_PER_FLG not in", values, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGBetween(String value1, String value2) {
            addCriterion("CUS_PER_FLG between", value1, value2, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_PER_FLGNotBetween(String value1, String value2) {
            addCriterion("CUS_PER_FLG not between", value1, value2, "CUS_PER_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGIsNull() {
            addCriterion("CUS_COM_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGIsNotNull() {
            addCriterion("CUS_COM_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGEqualTo(String value) {
            addCriterion("CUS_COM_FLG =", value, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGNotEqualTo(String value) {
            addCriterion("CUS_COM_FLG <>", value, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGGreaterThan(String value) {
            addCriterion("CUS_COM_FLG >", value, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_FLG >=", value, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGLessThan(String value) {
            addCriterion("CUS_COM_FLG <", value, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGLessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_FLG <=", value, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGLike(String value) {
            addCriterion("CUS_COM_FLG like", value, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGNotLike(String value) {
            addCriterion("CUS_COM_FLG not like", value, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGIn(List<String> values) {
            addCriterion("CUS_COM_FLG in", values, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGNotIn(List<String> values) {
            addCriterion("CUS_COM_FLG not in", values, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGBetween(String value1, String value2) {
            addCriterion("CUS_COM_FLG between", value1, value2, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_FLGNotBetween(String value1, String value2) {
            addCriterion("CUS_COM_FLG not between", value1, value2, "CUS_COM_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGIsNull() {
            addCriterion("CUS_FIN_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGIsNotNull() {
            addCriterion("CUS_FIN_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGEqualTo(String value) {
            addCriterion("CUS_FIN_FLG =", value, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGNotEqualTo(String value) {
            addCriterion("CUS_FIN_FLG <>", value, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGGreaterThan(String value) {
            addCriterion("CUS_FIN_FLG >", value, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_FLG >=", value, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGLessThan(String value) {
            addCriterion("CUS_FIN_FLG <", value, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGLessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_FLG <=", value, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGLike(String value) {
            addCriterion("CUS_FIN_FLG like", value, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGNotLike(String value) {
            addCriterion("CUS_FIN_FLG not like", value, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGIn(List<String> values) {
            addCriterion("CUS_FIN_FLG in", values, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGNotIn(List<String> values) {
            addCriterion("CUS_FIN_FLG not in", values, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGBetween(String value1, String value2) {
            addCriterion("CUS_FIN_FLG between", value1, value2, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_FLGNotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_FLG not between", value1, value2, "CUS_FIN_FLG");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPEIsNull() {
            addCriterion("CUS_COM_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPEIsNotNull() {
            addCriterion("CUS_COM_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPEEqualTo(String value) {
            addCriterion("CUS_COM_SCOPE =", value, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPENotEqualTo(String value) {
            addCriterion("CUS_COM_SCOPE <>", value, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPEGreaterThan(String value) {
            addCriterion("CUS_COM_SCOPE >", value, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPEGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_SCOPE >=", value, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPELessThan(String value) {
            addCriterion("CUS_COM_SCOPE <", value, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPELessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_SCOPE <=", value, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPELike(String value) {
            addCriterion("CUS_COM_SCOPE like", value, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPENotLike(String value) {
            addCriterion("CUS_COM_SCOPE not like", value, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPEIn(List<String> values) {
            addCriterion("CUS_COM_SCOPE in", values, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPENotIn(List<String> values) {
            addCriterion("CUS_COM_SCOPE not in", values, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPEBetween(String value1, String value2) {
            addCriterion("CUS_COM_SCOPE between", value1, value2, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_SCOPENotBetween(String value1, String value2) {
            addCriterion("CUS_COM_SCOPE not between", value1, value2, "CUS_COM_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1IsNull() {
            addCriterion("CUS_COM_TYP1 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1IsNotNull() {
            addCriterion("CUS_COM_TYP1 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1EqualTo(String value) {
            addCriterion("CUS_COM_TYP1 =", value, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP1 <>", value, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1GreaterThan(String value) {
            addCriterion("CUS_COM_TYP1 >", value, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP1 >=", value, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1LessThan(String value) {
            addCriterion("CUS_COM_TYP1 <", value, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP1 <=", value, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1Like(String value) {
            addCriterion("CUS_COM_TYP1 like", value, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1NotLike(String value) {
            addCriterion("CUS_COM_TYP1 not like", value, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1In(List<String> values) {
            addCriterion("CUS_COM_TYP1 in", values, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP1 not in", values, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP1 between", value1, value2, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP1NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP1 not between", value1, value2, "CUS_COM_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2IsNull() {
            addCriterion("CUS_COM_TYP2 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2IsNotNull() {
            addCriterion("CUS_COM_TYP2 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2EqualTo(String value) {
            addCriterion("CUS_COM_TYP2 =", value, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP2 <>", value, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2GreaterThan(String value) {
            addCriterion("CUS_COM_TYP2 >", value, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP2 >=", value, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2LessThan(String value) {
            addCriterion("CUS_COM_TYP2 <", value, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP2 <=", value, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2Like(String value) {
            addCriterion("CUS_COM_TYP2 like", value, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2NotLike(String value) {
            addCriterion("CUS_COM_TYP2 not like", value, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2In(List<String> values) {
            addCriterion("CUS_COM_TYP2 in", values, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP2 not in", values, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP2 between", value1, value2, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP2NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP2 not between", value1, value2, "CUS_COM_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3IsNull() {
            addCriterion("CUS_COM_TYP3 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3IsNotNull() {
            addCriterion("CUS_COM_TYP3 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3EqualTo(String value) {
            addCriterion("CUS_COM_TYP3 =", value, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP3 <>", value, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3GreaterThan(String value) {
            addCriterion("CUS_COM_TYP3 >", value, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP3 >=", value, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3LessThan(String value) {
            addCriterion("CUS_COM_TYP3 <", value, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP3 <=", value, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3Like(String value) {
            addCriterion("CUS_COM_TYP3 like", value, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3NotLike(String value) {
            addCriterion("CUS_COM_TYP3 not like", value, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3In(List<String> values) {
            addCriterion("CUS_COM_TYP3 in", values, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP3 not in", values, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP3 between", value1, value2, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP3NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP3 not between", value1, value2, "CUS_COM_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4IsNull() {
            addCriterion("CUS_COM_TYP4 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4IsNotNull() {
            addCriterion("CUS_COM_TYP4 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4EqualTo(String value) {
            addCriterion("CUS_COM_TYP4 =", value, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP4 <>", value, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4GreaterThan(String value) {
            addCriterion("CUS_COM_TYP4 >", value, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP4 >=", value, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4LessThan(String value) {
            addCriterion("CUS_COM_TYP4 <", value, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP4 <=", value, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4Like(String value) {
            addCriterion("CUS_COM_TYP4 like", value, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4NotLike(String value) {
            addCriterion("CUS_COM_TYP4 not like", value, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4In(List<String> values) {
            addCriterion("CUS_COM_TYP4 in", values, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP4 not in", values, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP4 between", value1, value2, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP4NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP4 not between", value1, value2, "CUS_COM_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5IsNull() {
            addCriterion("CUS_COM_TYP5 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5IsNotNull() {
            addCriterion("CUS_COM_TYP5 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5EqualTo(String value) {
            addCriterion("CUS_COM_TYP5 =", value, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP5 <>", value, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5GreaterThan(String value) {
            addCriterion("CUS_COM_TYP5 >", value, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP5 >=", value, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5LessThan(String value) {
            addCriterion("CUS_COM_TYP5 <", value, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP5 <=", value, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5Like(String value) {
            addCriterion("CUS_COM_TYP5 like", value, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5NotLike(String value) {
            addCriterion("CUS_COM_TYP5 not like", value, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5In(List<String> values) {
            addCriterion("CUS_COM_TYP5 in", values, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP5 not in", values, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP5 between", value1, value2, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP5NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP5 not between", value1, value2, "CUS_COM_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6IsNull() {
            addCriterion("CUS_COM_TYP6 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6IsNotNull() {
            addCriterion("CUS_COM_TYP6 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6EqualTo(String value) {
            addCriterion("CUS_COM_TYP6 =", value, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP6 <>", value, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6GreaterThan(String value) {
            addCriterion("CUS_COM_TYP6 >", value, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP6 >=", value, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6LessThan(String value) {
            addCriterion("CUS_COM_TYP6 <", value, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP6 <=", value, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6Like(String value) {
            addCriterion("CUS_COM_TYP6 like", value, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6NotLike(String value) {
            addCriterion("CUS_COM_TYP6 not like", value, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6In(List<String> values) {
            addCriterion("CUS_COM_TYP6 in", values, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP6 not in", values, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP6 between", value1, value2, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP6NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP6 not between", value1, value2, "CUS_COM_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7IsNull() {
            addCriterion("CUS_COM_TYP7 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7IsNotNull() {
            addCriterion("CUS_COM_TYP7 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7EqualTo(String value) {
            addCriterion("CUS_COM_TYP7 =", value, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP7 <>", value, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7GreaterThan(String value) {
            addCriterion("CUS_COM_TYP7 >", value, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP7 >=", value, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7LessThan(String value) {
            addCriterion("CUS_COM_TYP7 <", value, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP7 <=", value, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7Like(String value) {
            addCriterion("CUS_COM_TYP7 like", value, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7NotLike(String value) {
            addCriterion("CUS_COM_TYP7 not like", value, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7In(List<String> values) {
            addCriterion("CUS_COM_TYP7 in", values, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP7 not in", values, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP7 between", value1, value2, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP7NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP7 not between", value1, value2, "CUS_COM_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8IsNull() {
            addCriterion("CUS_COM_TYP8 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8IsNotNull() {
            addCriterion("CUS_COM_TYP8 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8EqualTo(String value) {
            addCriterion("CUS_COM_TYP8 =", value, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP8 <>", value, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8GreaterThan(String value) {
            addCriterion("CUS_COM_TYP8 >", value, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP8 >=", value, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8LessThan(String value) {
            addCriterion("CUS_COM_TYP8 <", value, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP8 <=", value, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8Like(String value) {
            addCriterion("CUS_COM_TYP8 like", value, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8NotLike(String value) {
            addCriterion("CUS_COM_TYP8 not like", value, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8In(List<String> values) {
            addCriterion("CUS_COM_TYP8 in", values, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP8 not in", values, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP8 between", value1, value2, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP8NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP8 not between", value1, value2, "CUS_COM_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9IsNull() {
            addCriterion("CUS_COM_TYP9 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9IsNotNull() {
            addCriterion("CUS_COM_TYP9 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9EqualTo(String value) {
            addCriterion("CUS_COM_TYP9 =", value, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP9 <>", value, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9GreaterThan(String value) {
            addCriterion("CUS_COM_TYP9 >", value, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP9 >=", value, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9LessThan(String value) {
            addCriterion("CUS_COM_TYP9 <", value, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP9 <=", value, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9Like(String value) {
            addCriterion("CUS_COM_TYP9 like", value, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9NotLike(String value) {
            addCriterion("CUS_COM_TYP9 not like", value, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9In(List<String> values) {
            addCriterion("CUS_COM_TYP9 in", values, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP9 not in", values, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP9 between", value1, value2, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP9NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP9 not between", value1, value2, "CUS_COM_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10IsNull() {
            addCriterion("CUS_COM_TYP10 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10IsNotNull() {
            addCriterion("CUS_COM_TYP10 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10EqualTo(String value) {
            addCriterion("CUS_COM_TYP10 =", value, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10NotEqualTo(String value) {
            addCriterion("CUS_COM_TYP10 <>", value, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10GreaterThan(String value) {
            addCriterion("CUS_COM_TYP10 >", value, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP10 >=", value, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10LessThan(String value) {
            addCriterion("CUS_COM_TYP10 <", value, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10LessThanOrEqualTo(String value) {
            addCriterion("CUS_COM_TYP10 <=", value, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10Like(String value) {
            addCriterion("CUS_COM_TYP10 like", value, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10NotLike(String value) {
            addCriterion("CUS_COM_TYP10 not like", value, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10In(List<String> values) {
            addCriterion("CUS_COM_TYP10 in", values, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10NotIn(List<String> values) {
            addCriterion("CUS_COM_TYP10 not in", values, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10Between(String value1, String value2) {
            addCriterion("CUS_COM_TYP10 between", value1, value2, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_COM_TYP10NotBetween(String value1, String value2) {
            addCriterion("CUS_COM_TYP10 not between", value1, value2, "CUS_COM_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPEIsNull() {
            addCriterion("CUS_FIN_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPEIsNotNull() {
            addCriterion("CUS_FIN_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPEEqualTo(String value) {
            addCriterion("CUS_FIN_SCOPE =", value, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPENotEqualTo(String value) {
            addCriterion("CUS_FIN_SCOPE <>", value, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPEGreaterThan(String value) {
            addCriterion("CUS_FIN_SCOPE >", value, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPEGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_SCOPE >=", value, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPELessThan(String value) {
            addCriterion("CUS_FIN_SCOPE <", value, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPELessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_SCOPE <=", value, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPELike(String value) {
            addCriterion("CUS_FIN_SCOPE like", value, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPENotLike(String value) {
            addCriterion("CUS_FIN_SCOPE not like", value, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPEIn(List<String> values) {
            addCriterion("CUS_FIN_SCOPE in", values, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPENotIn(List<String> values) {
            addCriterion("CUS_FIN_SCOPE not in", values, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPEBetween(String value1, String value2) {
            addCriterion("CUS_FIN_SCOPE between", value1, value2, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_SCOPENotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_SCOPE not between", value1, value2, "CUS_FIN_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1IsNull() {
            addCriterion("CUS_FIN_TYP1 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1IsNotNull() {
            addCriterion("CUS_FIN_TYP1 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1EqualTo(String value) {
            addCriterion("CUS_FIN_TYP1 =", value, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP1 <>", value, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP1 >", value, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP1 >=", value, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1LessThan(String value) {
            addCriterion("CUS_FIN_TYP1 <", value, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP1 <=", value, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1Like(String value) {
            addCriterion("CUS_FIN_TYP1 like", value, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1NotLike(String value) {
            addCriterion("CUS_FIN_TYP1 not like", value, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1In(List<String> values) {
            addCriterion("CUS_FIN_TYP1 in", values, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP1 not in", values, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP1 between", value1, value2, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP1NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP1 not between", value1, value2, "CUS_FIN_TYP1");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2IsNull() {
            addCriterion("CUS_FIN_TYP2 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2IsNotNull() {
            addCriterion("CUS_FIN_TYP2 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2EqualTo(String value) {
            addCriterion("CUS_FIN_TYP2 =", value, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP2 <>", value, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP2 >", value, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP2 >=", value, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2LessThan(String value) {
            addCriterion("CUS_FIN_TYP2 <", value, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP2 <=", value, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2Like(String value) {
            addCriterion("CUS_FIN_TYP2 like", value, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2NotLike(String value) {
            addCriterion("CUS_FIN_TYP2 not like", value, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2In(List<String> values) {
            addCriterion("CUS_FIN_TYP2 in", values, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP2 not in", values, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP2 between", value1, value2, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP2NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP2 not between", value1, value2, "CUS_FIN_TYP2");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3IsNull() {
            addCriterion("CUS_FIN_TYP3 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3IsNotNull() {
            addCriterion("CUS_FIN_TYP3 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3EqualTo(String value) {
            addCriterion("CUS_FIN_TYP3 =", value, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP3 <>", value, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP3 >", value, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP3 >=", value, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3LessThan(String value) {
            addCriterion("CUS_FIN_TYP3 <", value, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP3 <=", value, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3Like(String value) {
            addCriterion("CUS_FIN_TYP3 like", value, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3NotLike(String value) {
            addCriterion("CUS_FIN_TYP3 not like", value, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3In(List<String> values) {
            addCriterion("CUS_FIN_TYP3 in", values, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP3 not in", values, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP3 between", value1, value2, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP3NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP3 not between", value1, value2, "CUS_FIN_TYP3");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4IsNull() {
            addCriterion("CUS_FIN_TYP4 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4IsNotNull() {
            addCriterion("CUS_FIN_TYP4 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4EqualTo(String value) {
            addCriterion("CUS_FIN_TYP4 =", value, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP4 <>", value, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP4 >", value, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP4 >=", value, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4LessThan(String value) {
            addCriterion("CUS_FIN_TYP4 <", value, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP4 <=", value, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4Like(String value) {
            addCriterion("CUS_FIN_TYP4 like", value, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4NotLike(String value) {
            addCriterion("CUS_FIN_TYP4 not like", value, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4In(List<String> values) {
            addCriterion("CUS_FIN_TYP4 in", values, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP4 not in", values, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP4 between", value1, value2, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP4NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP4 not between", value1, value2, "CUS_FIN_TYP4");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5IsNull() {
            addCriterion("CUS_FIN_TYP5 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5IsNotNull() {
            addCriterion("CUS_FIN_TYP5 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5EqualTo(String value) {
            addCriterion("CUS_FIN_TYP5 =", value, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP5 <>", value, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP5 >", value, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP5 >=", value, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5LessThan(String value) {
            addCriterion("CUS_FIN_TYP5 <", value, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP5 <=", value, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5Like(String value) {
            addCriterion("CUS_FIN_TYP5 like", value, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5NotLike(String value) {
            addCriterion("CUS_FIN_TYP5 not like", value, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5In(List<String> values) {
            addCriterion("CUS_FIN_TYP5 in", values, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP5 not in", values, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP5 between", value1, value2, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP5NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP5 not between", value1, value2, "CUS_FIN_TYP5");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6IsNull() {
            addCriterion("CUS_FIN_TYP6 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6IsNotNull() {
            addCriterion("CUS_FIN_TYP6 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6EqualTo(String value) {
            addCriterion("CUS_FIN_TYP6 =", value, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP6 <>", value, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP6 >", value, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP6 >=", value, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6LessThan(String value) {
            addCriterion("CUS_FIN_TYP6 <", value, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP6 <=", value, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6Like(String value) {
            addCriterion("CUS_FIN_TYP6 like", value, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6NotLike(String value) {
            addCriterion("CUS_FIN_TYP6 not like", value, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6In(List<String> values) {
            addCriterion("CUS_FIN_TYP6 in", values, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP6 not in", values, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP6 between", value1, value2, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP6NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP6 not between", value1, value2, "CUS_FIN_TYP6");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7IsNull() {
            addCriterion("CUS_FIN_TYP7 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7IsNotNull() {
            addCriterion("CUS_FIN_TYP7 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7EqualTo(String value) {
            addCriterion("CUS_FIN_TYP7 =", value, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP7 <>", value, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP7 >", value, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP7 >=", value, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7LessThan(String value) {
            addCriterion("CUS_FIN_TYP7 <", value, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP7 <=", value, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7Like(String value) {
            addCriterion("CUS_FIN_TYP7 like", value, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7NotLike(String value) {
            addCriterion("CUS_FIN_TYP7 not like", value, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7In(List<String> values) {
            addCriterion("CUS_FIN_TYP7 in", values, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP7 not in", values, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP7 between", value1, value2, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP7NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP7 not between", value1, value2, "CUS_FIN_TYP7");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8IsNull() {
            addCriterion("CUS_FIN_TYP8 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8IsNotNull() {
            addCriterion("CUS_FIN_TYP8 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8EqualTo(String value) {
            addCriterion("CUS_FIN_TYP8 =", value, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP8 <>", value, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP8 >", value, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP8 >=", value, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8LessThan(String value) {
            addCriterion("CUS_FIN_TYP8 <", value, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP8 <=", value, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8Like(String value) {
            addCriterion("CUS_FIN_TYP8 like", value, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8NotLike(String value) {
            addCriterion("CUS_FIN_TYP8 not like", value, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8In(List<String> values) {
            addCriterion("CUS_FIN_TYP8 in", values, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP8 not in", values, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP8 between", value1, value2, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP8NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP8 not between", value1, value2, "CUS_FIN_TYP8");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9IsNull() {
            addCriterion("CUS_FIN_TYP9 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9IsNotNull() {
            addCriterion("CUS_FIN_TYP9 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9EqualTo(String value) {
            addCriterion("CUS_FIN_TYP9 =", value, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP9 <>", value, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP9 >", value, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP9 >=", value, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9LessThan(String value) {
            addCriterion("CUS_FIN_TYP9 <", value, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP9 <=", value, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9Like(String value) {
            addCriterion("CUS_FIN_TYP9 like", value, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9NotLike(String value) {
            addCriterion("CUS_FIN_TYP9 not like", value, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9In(List<String> values) {
            addCriterion("CUS_FIN_TYP9 in", values, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP9 not in", values, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP9 between", value1, value2, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP9NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP9 not between", value1, value2, "CUS_FIN_TYP9");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10IsNull() {
            addCriterion("CUS_FIN_TYP10 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10IsNotNull() {
            addCriterion("CUS_FIN_TYP10 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10EqualTo(String value) {
            addCriterion("CUS_FIN_TYP10 =", value, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10NotEqualTo(String value) {
            addCriterion("CUS_FIN_TYP10 <>", value, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10GreaterThan(String value) {
            addCriterion("CUS_FIN_TYP10 >", value, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP10 >=", value, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10LessThan(String value) {
            addCriterion("CUS_FIN_TYP10 <", value, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10LessThanOrEqualTo(String value) {
            addCriterion("CUS_FIN_TYP10 <=", value, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10Like(String value) {
            addCriterion("CUS_FIN_TYP10 like", value, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10NotLike(String value) {
            addCriterion("CUS_FIN_TYP10 not like", value, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10In(List<String> values) {
            addCriterion("CUS_FIN_TYP10 in", values, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10NotIn(List<String> values) {
            addCriterion("CUS_FIN_TYP10 not in", values, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10Between(String value1, String value2) {
            addCriterion("CUS_FIN_TYP10 between", value1, value2, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_FIN_TYP10NotBetween(String value1, String value2) {
            addCriterion("CUS_FIN_TYP10 not between", value1, value2, "CUS_FIN_TYP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPEIsNull() {
            addCriterion("CUS_GROUP_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPEIsNotNull() {
            addCriterion("CUS_GROUP_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPEEqualTo(String value) {
            addCriterion("CUS_GROUP_SCOPE =", value, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPENotEqualTo(String value) {
            addCriterion("CUS_GROUP_SCOPE <>", value, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPEGreaterThan(String value) {
            addCriterion("CUS_GROUP_SCOPE >", value, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPEGreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP_SCOPE >=", value, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPELessThan(String value) {
            addCriterion("CUS_GROUP_SCOPE <", value, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPELessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP_SCOPE <=", value, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPELike(String value) {
            addCriterion("CUS_GROUP_SCOPE like", value, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPENotLike(String value) {
            addCriterion("CUS_GROUP_SCOPE not like", value, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPEIn(List<String> values) {
            addCriterion("CUS_GROUP_SCOPE in", values, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPENotIn(List<String> values) {
            addCriterion("CUS_GROUP_SCOPE not in", values, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPEBetween(String value1, String value2) {
            addCriterion("CUS_GROUP_SCOPE between", value1, value2, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP_SCOPENotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP_SCOPE not between", value1, value2, "CUS_GROUP_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1IsNull() {
            addCriterion("CUS_GROUP1 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1IsNotNull() {
            addCriterion("CUS_GROUP1 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1EqualTo(String value) {
            addCriterion("CUS_GROUP1 =", value, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1NotEqualTo(String value) {
            addCriterion("CUS_GROUP1 <>", value, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1GreaterThan(String value) {
            addCriterion("CUS_GROUP1 >", value, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP1 >=", value, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1LessThan(String value) {
            addCriterion("CUS_GROUP1 <", value, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP1 <=", value, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1Like(String value) {
            addCriterion("CUS_GROUP1 like", value, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1NotLike(String value) {
            addCriterion("CUS_GROUP1 not like", value, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1In(List<String> values) {
            addCriterion("CUS_GROUP1 in", values, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1NotIn(List<String> values) {
            addCriterion("CUS_GROUP1 not in", values, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1Between(String value1, String value2) {
            addCriterion("CUS_GROUP1 between", value1, value2, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP1NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP1 not between", value1, value2, "CUS_GROUP1");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2IsNull() {
            addCriterion("CUS_GROUP2 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2IsNotNull() {
            addCriterion("CUS_GROUP2 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2EqualTo(String value) {
            addCriterion("CUS_GROUP2 =", value, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2NotEqualTo(String value) {
            addCriterion("CUS_GROUP2 <>", value, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2GreaterThan(String value) {
            addCriterion("CUS_GROUP2 >", value, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP2 >=", value, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2LessThan(String value) {
            addCriterion("CUS_GROUP2 <", value, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP2 <=", value, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2Like(String value) {
            addCriterion("CUS_GROUP2 like", value, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2NotLike(String value) {
            addCriterion("CUS_GROUP2 not like", value, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2In(List<String> values) {
            addCriterion("CUS_GROUP2 in", values, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2NotIn(List<String> values) {
            addCriterion("CUS_GROUP2 not in", values, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2Between(String value1, String value2) {
            addCriterion("CUS_GROUP2 between", value1, value2, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP2NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP2 not between", value1, value2, "CUS_GROUP2");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3IsNull() {
            addCriterion("CUS_GROUP3 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3IsNotNull() {
            addCriterion("CUS_GROUP3 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3EqualTo(String value) {
            addCriterion("CUS_GROUP3 =", value, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3NotEqualTo(String value) {
            addCriterion("CUS_GROUP3 <>", value, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3GreaterThan(String value) {
            addCriterion("CUS_GROUP3 >", value, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP3 >=", value, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3LessThan(String value) {
            addCriterion("CUS_GROUP3 <", value, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP3 <=", value, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3Like(String value) {
            addCriterion("CUS_GROUP3 like", value, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3NotLike(String value) {
            addCriterion("CUS_GROUP3 not like", value, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3In(List<String> values) {
            addCriterion("CUS_GROUP3 in", values, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3NotIn(List<String> values) {
            addCriterion("CUS_GROUP3 not in", values, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3Between(String value1, String value2) {
            addCriterion("CUS_GROUP3 between", value1, value2, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP3NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP3 not between", value1, value2, "CUS_GROUP3");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4IsNull() {
            addCriterion("CUS_GROUP4 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4IsNotNull() {
            addCriterion("CUS_GROUP4 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4EqualTo(String value) {
            addCriterion("CUS_GROUP4 =", value, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4NotEqualTo(String value) {
            addCriterion("CUS_GROUP4 <>", value, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4GreaterThan(String value) {
            addCriterion("CUS_GROUP4 >", value, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP4 >=", value, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4LessThan(String value) {
            addCriterion("CUS_GROUP4 <", value, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP4 <=", value, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4Like(String value) {
            addCriterion("CUS_GROUP4 like", value, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4NotLike(String value) {
            addCriterion("CUS_GROUP4 not like", value, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4In(List<String> values) {
            addCriterion("CUS_GROUP4 in", values, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4NotIn(List<String> values) {
            addCriterion("CUS_GROUP4 not in", values, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4Between(String value1, String value2) {
            addCriterion("CUS_GROUP4 between", value1, value2, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP4NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP4 not between", value1, value2, "CUS_GROUP4");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5IsNull() {
            addCriterion("CUS_GROUP5 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5IsNotNull() {
            addCriterion("CUS_GROUP5 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5EqualTo(String value) {
            addCriterion("CUS_GROUP5 =", value, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5NotEqualTo(String value) {
            addCriterion("CUS_GROUP5 <>", value, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5GreaterThan(String value) {
            addCriterion("CUS_GROUP5 >", value, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP5 >=", value, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5LessThan(String value) {
            addCriterion("CUS_GROUP5 <", value, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP5 <=", value, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5Like(String value) {
            addCriterion("CUS_GROUP5 like", value, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5NotLike(String value) {
            addCriterion("CUS_GROUP5 not like", value, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5In(List<String> values) {
            addCriterion("CUS_GROUP5 in", values, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5NotIn(List<String> values) {
            addCriterion("CUS_GROUP5 not in", values, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5Between(String value1, String value2) {
            addCriterion("CUS_GROUP5 between", value1, value2, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP5NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP5 not between", value1, value2, "CUS_GROUP5");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6IsNull() {
            addCriterion("CUS_GROUP6 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6IsNotNull() {
            addCriterion("CUS_GROUP6 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6EqualTo(String value) {
            addCriterion("CUS_GROUP6 =", value, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6NotEqualTo(String value) {
            addCriterion("CUS_GROUP6 <>", value, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6GreaterThan(String value) {
            addCriterion("CUS_GROUP6 >", value, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP6 >=", value, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6LessThan(String value) {
            addCriterion("CUS_GROUP6 <", value, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP6 <=", value, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6Like(String value) {
            addCriterion("CUS_GROUP6 like", value, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6NotLike(String value) {
            addCriterion("CUS_GROUP6 not like", value, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6In(List<String> values) {
            addCriterion("CUS_GROUP6 in", values, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6NotIn(List<String> values) {
            addCriterion("CUS_GROUP6 not in", values, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6Between(String value1, String value2) {
            addCriterion("CUS_GROUP6 between", value1, value2, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP6NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP6 not between", value1, value2, "CUS_GROUP6");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7IsNull() {
            addCriterion("CUS_GROUP7 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7IsNotNull() {
            addCriterion("CUS_GROUP7 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7EqualTo(String value) {
            addCriterion("CUS_GROUP7 =", value, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7NotEqualTo(String value) {
            addCriterion("CUS_GROUP7 <>", value, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7GreaterThan(String value) {
            addCriterion("CUS_GROUP7 >", value, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP7 >=", value, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7LessThan(String value) {
            addCriterion("CUS_GROUP7 <", value, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP7 <=", value, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7Like(String value) {
            addCriterion("CUS_GROUP7 like", value, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7NotLike(String value) {
            addCriterion("CUS_GROUP7 not like", value, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7In(List<String> values) {
            addCriterion("CUS_GROUP7 in", values, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7NotIn(List<String> values) {
            addCriterion("CUS_GROUP7 not in", values, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7Between(String value1, String value2) {
            addCriterion("CUS_GROUP7 between", value1, value2, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP7NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP7 not between", value1, value2, "CUS_GROUP7");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8IsNull() {
            addCriterion("CUS_GROUP8 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8IsNotNull() {
            addCriterion("CUS_GROUP8 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8EqualTo(String value) {
            addCriterion("CUS_GROUP8 =", value, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8NotEqualTo(String value) {
            addCriterion("CUS_GROUP8 <>", value, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8GreaterThan(String value) {
            addCriterion("CUS_GROUP8 >", value, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP8 >=", value, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8LessThan(String value) {
            addCriterion("CUS_GROUP8 <", value, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP8 <=", value, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8Like(String value) {
            addCriterion("CUS_GROUP8 like", value, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8NotLike(String value) {
            addCriterion("CUS_GROUP8 not like", value, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8In(List<String> values) {
            addCriterion("CUS_GROUP8 in", values, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8NotIn(List<String> values) {
            addCriterion("CUS_GROUP8 not in", values, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8Between(String value1, String value2) {
            addCriterion("CUS_GROUP8 between", value1, value2, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP8NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP8 not between", value1, value2, "CUS_GROUP8");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9IsNull() {
            addCriterion("CUS_GROUP9 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9IsNotNull() {
            addCriterion("CUS_GROUP9 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9EqualTo(String value) {
            addCriterion("CUS_GROUP9 =", value, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9NotEqualTo(String value) {
            addCriterion("CUS_GROUP9 <>", value, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9GreaterThan(String value) {
            addCriterion("CUS_GROUP9 >", value, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP9 >=", value, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9LessThan(String value) {
            addCriterion("CUS_GROUP9 <", value, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP9 <=", value, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9Like(String value) {
            addCriterion("CUS_GROUP9 like", value, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9NotLike(String value) {
            addCriterion("CUS_GROUP9 not like", value, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9In(List<String> values) {
            addCriterion("CUS_GROUP9 in", values, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9NotIn(List<String> values) {
            addCriterion("CUS_GROUP9 not in", values, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9Between(String value1, String value2) {
            addCriterion("CUS_GROUP9 between", value1, value2, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP9NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP9 not between", value1, value2, "CUS_GROUP9");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10IsNull() {
            addCriterion("CUS_GROUP10 is null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10IsNotNull() {
            addCriterion("CUS_GROUP10 is not null");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10EqualTo(String value) {
            addCriterion("CUS_GROUP10 =", value, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10NotEqualTo(String value) {
            addCriterion("CUS_GROUP10 <>", value, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10GreaterThan(String value) {
            addCriterion("CUS_GROUP10 >", value, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10GreaterThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP10 >=", value, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10LessThan(String value) {
            addCriterion("CUS_GROUP10 <", value, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10LessThanOrEqualTo(String value) {
            addCriterion("CUS_GROUP10 <=", value, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10Like(String value) {
            addCriterion("CUS_GROUP10 like", value, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10NotLike(String value) {
            addCriterion("CUS_GROUP10 not like", value, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10In(List<String> values) {
            addCriterion("CUS_GROUP10 in", values, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10NotIn(List<String> values) {
            addCriterion("CUS_GROUP10 not in", values, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10Between(String value1, String value2) {
            addCriterion("CUS_GROUP10 between", value1, value2, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andCUS_GROUP10NotBetween(String value1, String value2) {
            addCriterion("CUS_GROUP10 not between", value1, value2, "CUS_GROUP10");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHIsNull() {
            addCriterion("PARTI_METH is null");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHIsNotNull() {
            addCriterion("PARTI_METH is not null");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHEqualTo(String value) {
            addCriterion("PARTI_METH =", value, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHNotEqualTo(String value) {
            addCriterion("PARTI_METH <>", value, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHGreaterThan(String value) {
            addCriterion("PARTI_METH >", value, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHGreaterThanOrEqualTo(String value) {
            addCriterion("PARTI_METH >=", value, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHLessThan(String value) {
            addCriterion("PARTI_METH <", value, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHLessThanOrEqualTo(String value) {
            addCriterion("PARTI_METH <=", value, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHLike(String value) {
            addCriterion("PARTI_METH like", value, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHNotLike(String value) {
            addCriterion("PARTI_METH not like", value, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHIn(List<String> values) {
            addCriterion("PARTI_METH in", values, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHNotIn(List<String> values) {
            addCriterion("PARTI_METH not in", values, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHBetween(String value1, String value2) {
            addCriterion("PARTI_METH between", value1, value2, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_METHNotBetween(String value1, String value2) {
            addCriterion("PARTI_METH not between", value1, value2, "PARTI_METH");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPEIsNull() {
            addCriterion("PARTI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPEIsNotNull() {
            addCriterion("PARTI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPEEqualTo(String value) {
            addCriterion("PARTI_TYPE =", value, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPENotEqualTo(String value) {
            addCriterion("PARTI_TYPE <>", value, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPEGreaterThan(String value) {
            addCriterion("PARTI_TYPE >", value, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("PARTI_TYPE >=", value, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPELessThan(String value) {
            addCriterion("PARTI_TYPE <", value, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPELessThanOrEqualTo(String value) {
            addCriterion("PARTI_TYPE <=", value, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPELike(String value) {
            addCriterion("PARTI_TYPE like", value, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPENotLike(String value) {
            addCriterion("PARTI_TYPE not like", value, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPEIn(List<String> values) {
            addCriterion("PARTI_TYPE in", values, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPENotIn(List<String> values) {
            addCriterion("PARTI_TYPE not in", values, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPEBetween(String value1, String value2) {
            addCriterion("PARTI_TYPE between", value1, value2, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_TYPENotBetween(String value1, String value2) {
            addCriterion("PARTI_TYPE not between", value1, value2, "PARTI_TYPE");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUIsNull() {
            addCriterion("PARTI_STRU is null");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUIsNotNull() {
            addCriterion("PARTI_STRU is not null");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUEqualTo(String value) {
            addCriterion("PARTI_STRU =", value, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUNotEqualTo(String value) {
            addCriterion("PARTI_STRU <>", value, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUGreaterThan(String value) {
            addCriterion("PARTI_STRU >", value, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUGreaterThanOrEqualTo(String value) {
            addCriterion("PARTI_STRU >=", value, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRULessThan(String value) {
            addCriterion("PARTI_STRU <", value, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRULessThanOrEqualTo(String value) {
            addCriterion("PARTI_STRU <=", value, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRULike(String value) {
            addCriterion("PARTI_STRU like", value, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUNotLike(String value) {
            addCriterion("PARTI_STRU not like", value, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUIn(List<String> values) {
            addCriterion("PARTI_STRU in", values, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUNotIn(List<String> values) {
            addCriterion("PARTI_STRU not in", values, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUBetween(String value1, String value2) {
            addCriterion("PARTI_STRU between", value1, value2, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andPARTI_STRUNotBetween(String value1, String value2) {
            addCriterion("PARTI_STRU not between", value1, value2, "PARTI_STRU");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNIsNull() {
            addCriterion("SOLD_RGN is null");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNIsNotNull() {
            addCriterion("SOLD_RGN is not null");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNEqualTo(String value) {
            addCriterion("SOLD_RGN =", value, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNNotEqualTo(String value) {
            addCriterion("SOLD_RGN <>", value, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNGreaterThan(String value) {
            addCriterion("SOLD_RGN >", value, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNGreaterThanOrEqualTo(String value) {
            addCriterion("SOLD_RGN >=", value, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNLessThan(String value) {
            addCriterion("SOLD_RGN <", value, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNLessThanOrEqualTo(String value) {
            addCriterion("SOLD_RGN <=", value, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNLike(String value) {
            addCriterion("SOLD_RGN like", value, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNNotLike(String value) {
            addCriterion("SOLD_RGN not like", value, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNIn(List<String> values) {
            addCriterion("SOLD_RGN in", values, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNNotIn(List<String> values) {
            addCriterion("SOLD_RGN not in", values, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNBetween(String value1, String value2) {
            addCriterion("SOLD_RGN between", value1, value2, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andSOLD_RGNNotBetween(String value1, String value2) {
            addCriterion("SOLD_RGN not between", value1, value2, "SOLD_RGN");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPEIsNull() {
            addCriterion("CHNL_SCOPE is null");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPEIsNotNull() {
            addCriterion("CHNL_SCOPE is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPEEqualTo(String value) {
            addCriterion("CHNL_SCOPE =", value, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPENotEqualTo(String value) {
            addCriterion("CHNL_SCOPE <>", value, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPEGreaterThan(String value) {
            addCriterion("CHNL_SCOPE >", value, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPEGreaterThanOrEqualTo(String value) {
            addCriterion("CHNL_SCOPE >=", value, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPELessThan(String value) {
            addCriterion("CHNL_SCOPE <", value, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPELessThanOrEqualTo(String value) {
            addCriterion("CHNL_SCOPE <=", value, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPELike(String value) {
            addCriterion("CHNL_SCOPE like", value, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPENotLike(String value) {
            addCriterion("CHNL_SCOPE not like", value, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPEIn(List<String> values) {
            addCriterion("CHNL_SCOPE in", values, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPENotIn(List<String> values) {
            addCriterion("CHNL_SCOPE not in", values, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPEBetween(String value1, String value2) {
            addCriterion("CHNL_SCOPE between", value1, value2, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL_SCOPENotBetween(String value1, String value2) {
            addCriterion("CHNL_SCOPE not between", value1, value2, "CHNL_SCOPE");
            return (Criteria) this;
        }

        public Criteria andCHNL1IsNull() {
            addCriterion("CHNL1 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL1IsNotNull() {
            addCriterion("CHNL1 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL1EqualTo(String value) {
            addCriterion("CHNL1 =", value, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1NotEqualTo(String value) {
            addCriterion("CHNL1 <>", value, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1GreaterThan(String value) {
            addCriterion("CHNL1 >", value, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL1 >=", value, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1LessThan(String value) {
            addCriterion("CHNL1 <", value, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1LessThanOrEqualTo(String value) {
            addCriterion("CHNL1 <=", value, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1Like(String value) {
            addCriterion("CHNL1 like", value, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1NotLike(String value) {
            addCriterion("CHNL1 not like", value, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1In(List<String> values) {
            addCriterion("CHNL1 in", values, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1NotIn(List<String> values) {
            addCriterion("CHNL1 not in", values, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1Between(String value1, String value2) {
            addCriterion("CHNL1 between", value1, value2, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL1NotBetween(String value1, String value2) {
            addCriterion("CHNL1 not between", value1, value2, "CHNL1");
            return (Criteria) this;
        }

        public Criteria andCHNL2IsNull() {
            addCriterion("CHNL2 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL2IsNotNull() {
            addCriterion("CHNL2 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL2EqualTo(String value) {
            addCriterion("CHNL2 =", value, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2NotEqualTo(String value) {
            addCriterion("CHNL2 <>", value, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2GreaterThan(String value) {
            addCriterion("CHNL2 >", value, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL2 >=", value, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2LessThan(String value) {
            addCriterion("CHNL2 <", value, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2LessThanOrEqualTo(String value) {
            addCriterion("CHNL2 <=", value, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2Like(String value) {
            addCriterion("CHNL2 like", value, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2NotLike(String value) {
            addCriterion("CHNL2 not like", value, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2In(List<String> values) {
            addCriterion("CHNL2 in", values, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2NotIn(List<String> values) {
            addCriterion("CHNL2 not in", values, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2Between(String value1, String value2) {
            addCriterion("CHNL2 between", value1, value2, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL2NotBetween(String value1, String value2) {
            addCriterion("CHNL2 not between", value1, value2, "CHNL2");
            return (Criteria) this;
        }

        public Criteria andCHNL3IsNull() {
            addCriterion("CHNL3 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL3IsNotNull() {
            addCriterion("CHNL3 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL3EqualTo(String value) {
            addCriterion("CHNL3 =", value, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3NotEqualTo(String value) {
            addCriterion("CHNL3 <>", value, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3GreaterThan(String value) {
            addCriterion("CHNL3 >", value, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL3 >=", value, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3LessThan(String value) {
            addCriterion("CHNL3 <", value, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3LessThanOrEqualTo(String value) {
            addCriterion("CHNL3 <=", value, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3Like(String value) {
            addCriterion("CHNL3 like", value, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3NotLike(String value) {
            addCriterion("CHNL3 not like", value, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3In(List<String> values) {
            addCriterion("CHNL3 in", values, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3NotIn(List<String> values) {
            addCriterion("CHNL3 not in", values, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3Between(String value1, String value2) {
            addCriterion("CHNL3 between", value1, value2, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL3NotBetween(String value1, String value2) {
            addCriterion("CHNL3 not between", value1, value2, "CHNL3");
            return (Criteria) this;
        }

        public Criteria andCHNL4IsNull() {
            addCriterion("CHNL4 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL4IsNotNull() {
            addCriterion("CHNL4 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL4EqualTo(String value) {
            addCriterion("CHNL4 =", value, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4NotEqualTo(String value) {
            addCriterion("CHNL4 <>", value, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4GreaterThan(String value) {
            addCriterion("CHNL4 >", value, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL4 >=", value, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4LessThan(String value) {
            addCriterion("CHNL4 <", value, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4LessThanOrEqualTo(String value) {
            addCriterion("CHNL4 <=", value, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4Like(String value) {
            addCriterion("CHNL4 like", value, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4NotLike(String value) {
            addCriterion("CHNL4 not like", value, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4In(List<String> values) {
            addCriterion("CHNL4 in", values, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4NotIn(List<String> values) {
            addCriterion("CHNL4 not in", values, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4Between(String value1, String value2) {
            addCriterion("CHNL4 between", value1, value2, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL4NotBetween(String value1, String value2) {
            addCriterion("CHNL4 not between", value1, value2, "CHNL4");
            return (Criteria) this;
        }

        public Criteria andCHNL5IsNull() {
            addCriterion("CHNL5 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL5IsNotNull() {
            addCriterion("CHNL5 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL5EqualTo(String value) {
            addCriterion("CHNL5 =", value, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5NotEqualTo(String value) {
            addCriterion("CHNL5 <>", value, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5GreaterThan(String value) {
            addCriterion("CHNL5 >", value, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL5 >=", value, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5LessThan(String value) {
            addCriterion("CHNL5 <", value, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5LessThanOrEqualTo(String value) {
            addCriterion("CHNL5 <=", value, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5Like(String value) {
            addCriterion("CHNL5 like", value, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5NotLike(String value) {
            addCriterion("CHNL5 not like", value, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5In(List<String> values) {
            addCriterion("CHNL5 in", values, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5NotIn(List<String> values) {
            addCriterion("CHNL5 not in", values, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5Between(String value1, String value2) {
            addCriterion("CHNL5 between", value1, value2, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL5NotBetween(String value1, String value2) {
            addCriterion("CHNL5 not between", value1, value2, "CHNL5");
            return (Criteria) this;
        }

        public Criteria andCHNL6IsNull() {
            addCriterion("CHNL6 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL6IsNotNull() {
            addCriterion("CHNL6 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL6EqualTo(String value) {
            addCriterion("CHNL6 =", value, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6NotEqualTo(String value) {
            addCriterion("CHNL6 <>", value, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6GreaterThan(String value) {
            addCriterion("CHNL6 >", value, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL6 >=", value, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6LessThan(String value) {
            addCriterion("CHNL6 <", value, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6LessThanOrEqualTo(String value) {
            addCriterion("CHNL6 <=", value, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6Like(String value) {
            addCriterion("CHNL6 like", value, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6NotLike(String value) {
            addCriterion("CHNL6 not like", value, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6In(List<String> values) {
            addCriterion("CHNL6 in", values, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6NotIn(List<String> values) {
            addCriterion("CHNL6 not in", values, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6Between(String value1, String value2) {
            addCriterion("CHNL6 between", value1, value2, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL6NotBetween(String value1, String value2) {
            addCriterion("CHNL6 not between", value1, value2, "CHNL6");
            return (Criteria) this;
        }

        public Criteria andCHNL7IsNull() {
            addCriterion("CHNL7 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL7IsNotNull() {
            addCriterion("CHNL7 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL7EqualTo(String value) {
            addCriterion("CHNL7 =", value, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7NotEqualTo(String value) {
            addCriterion("CHNL7 <>", value, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7GreaterThan(String value) {
            addCriterion("CHNL7 >", value, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL7 >=", value, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7LessThan(String value) {
            addCriterion("CHNL7 <", value, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7LessThanOrEqualTo(String value) {
            addCriterion("CHNL7 <=", value, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7Like(String value) {
            addCriterion("CHNL7 like", value, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7NotLike(String value) {
            addCriterion("CHNL7 not like", value, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7In(List<String> values) {
            addCriterion("CHNL7 in", values, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7NotIn(List<String> values) {
            addCriterion("CHNL7 not in", values, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7Between(String value1, String value2) {
            addCriterion("CHNL7 between", value1, value2, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL7NotBetween(String value1, String value2) {
            addCriterion("CHNL7 not between", value1, value2, "CHNL7");
            return (Criteria) this;
        }

        public Criteria andCHNL8IsNull() {
            addCriterion("CHNL8 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL8IsNotNull() {
            addCriterion("CHNL8 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL8EqualTo(String value) {
            addCriterion("CHNL8 =", value, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8NotEqualTo(String value) {
            addCriterion("CHNL8 <>", value, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8GreaterThan(String value) {
            addCriterion("CHNL8 >", value, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL8 >=", value, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8LessThan(String value) {
            addCriterion("CHNL8 <", value, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8LessThanOrEqualTo(String value) {
            addCriterion("CHNL8 <=", value, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8Like(String value) {
            addCriterion("CHNL8 like", value, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8NotLike(String value) {
            addCriterion("CHNL8 not like", value, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8In(List<String> values) {
            addCriterion("CHNL8 in", values, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8NotIn(List<String> values) {
            addCriterion("CHNL8 not in", values, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8Between(String value1, String value2) {
            addCriterion("CHNL8 between", value1, value2, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL8NotBetween(String value1, String value2) {
            addCriterion("CHNL8 not between", value1, value2, "CHNL8");
            return (Criteria) this;
        }

        public Criteria andCHNL9IsNull() {
            addCriterion("CHNL9 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL9IsNotNull() {
            addCriterion("CHNL9 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL9EqualTo(String value) {
            addCriterion("CHNL9 =", value, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9NotEqualTo(String value) {
            addCriterion("CHNL9 <>", value, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9GreaterThan(String value) {
            addCriterion("CHNL9 >", value, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL9 >=", value, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9LessThan(String value) {
            addCriterion("CHNL9 <", value, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9LessThanOrEqualTo(String value) {
            addCriterion("CHNL9 <=", value, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9Like(String value) {
            addCriterion("CHNL9 like", value, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9NotLike(String value) {
            addCriterion("CHNL9 not like", value, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9In(List<String> values) {
            addCriterion("CHNL9 in", values, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9NotIn(List<String> values) {
            addCriterion("CHNL9 not in", values, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9Between(String value1, String value2) {
            addCriterion("CHNL9 between", value1, value2, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL9NotBetween(String value1, String value2) {
            addCriterion("CHNL9 not between", value1, value2, "CHNL9");
            return (Criteria) this;
        }

        public Criteria andCHNL10IsNull() {
            addCriterion("CHNL10 is null");
            return (Criteria) this;
        }

        public Criteria andCHNL10IsNotNull() {
            addCriterion("CHNL10 is not null");
            return (Criteria) this;
        }

        public Criteria andCHNL10EqualTo(String value) {
            addCriterion("CHNL10 =", value, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10NotEqualTo(String value) {
            addCriterion("CHNL10 <>", value, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10GreaterThan(String value) {
            addCriterion("CHNL10 >", value, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10GreaterThanOrEqualTo(String value) {
            addCriterion("CHNL10 >=", value, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10LessThan(String value) {
            addCriterion("CHNL10 <", value, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10LessThanOrEqualTo(String value) {
            addCriterion("CHNL10 <=", value, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10Like(String value) {
            addCriterion("CHNL10 like", value, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10NotLike(String value) {
            addCriterion("CHNL10 not like", value, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10In(List<String> values) {
            addCriterion("CHNL10 in", values, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10NotIn(List<String> values) {
            addCriterion("CHNL10 not in", values, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10Between(String value1, String value2) {
            addCriterion("CHNL10 between", value1, value2, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andCHNL10NotBetween(String value1, String value2) {
            addCriterion("CHNL10 not between", value1, value2, "CHNL10");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOIsNull() {
            addCriterion("PRDT_CUST_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOIsNotNull() {
            addCriterion("PRDT_CUST_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOEqualTo(String value) {
            addCriterion("PRDT_CUST_INFO =", value, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFONotEqualTo(String value) {
            addCriterion("PRDT_CUST_INFO <>", value, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOGreaterThan(String value) {
            addCriterion("PRDT_CUST_INFO >", value, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_CUST_INFO >=", value, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOLessThan(String value) {
            addCriterion("PRDT_CUST_INFO <", value, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOLessThanOrEqualTo(String value) {
            addCriterion("PRDT_CUST_INFO <=", value, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOLike(String value) {
            addCriterion("PRDT_CUST_INFO like", value, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFONotLike(String value) {
            addCriterion("PRDT_CUST_INFO not like", value, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOIn(List<String> values) {
            addCriterion("PRDT_CUST_INFO in", values, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFONotIn(List<String> values) {
            addCriterion("PRDT_CUST_INFO not in", values, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFOBetween(String value1, String value2) {
            addCriterion("PRDT_CUST_INFO between", value1, value2, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_CUST_INFONotBetween(String value1, String value2) {
            addCriterion("PRDT_CUST_INFO not between", value1, value2, "PRDT_CUST_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALIsNull() {
            addCriterion("PRDT_MARKT_GOAL is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALIsNotNull() {
            addCriterion("PRDT_MARKT_GOAL is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALEqualTo(String value) {
            addCriterion("PRDT_MARKT_GOAL =", value, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALNotEqualTo(String value) {
            addCriterion("PRDT_MARKT_GOAL <>", value, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALGreaterThan(String value) {
            addCriterion("PRDT_MARKT_GOAL >", value, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_MARKT_GOAL >=", value, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALLessThan(String value) {
            addCriterion("PRDT_MARKT_GOAL <", value, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALLessThanOrEqualTo(String value) {
            addCriterion("PRDT_MARKT_GOAL <=", value, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALLike(String value) {
            addCriterion("PRDT_MARKT_GOAL like", value, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALNotLike(String value) {
            addCriterion("PRDT_MARKT_GOAL not like", value, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALIn(List<String> values) {
            addCriterion("PRDT_MARKT_GOAL in", values, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALNotIn(List<String> values) {
            addCriterion("PRDT_MARKT_GOAL not in", values, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALBetween(String value1, String value2) {
            addCriterion("PRDT_MARKT_GOAL between", value1, value2, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MARKT_GOALNotBetween(String value1, String value2) {
            addCriterion("PRDT_MARKT_GOAL not between", value1, value2, "PRDT_MARKT_GOAL");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCIsNull() {
            addCriterion("COMP_PRDT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCIsNotNull() {
            addCriterion("COMP_PRDT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCEqualTo(String value) {
            addCriterion("COMP_PRDT_DESC =", value, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCNotEqualTo(String value) {
            addCriterion("COMP_PRDT_DESC <>", value, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCGreaterThan(String value) {
            addCriterion("COMP_PRDT_DESC >", value, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_PRDT_DESC >=", value, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCLessThan(String value) {
            addCriterion("COMP_PRDT_DESC <", value, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCLessThanOrEqualTo(String value) {
            addCriterion("COMP_PRDT_DESC <=", value, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCLike(String value) {
            addCriterion("COMP_PRDT_DESC like", value, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCNotLike(String value) {
            addCriterion("COMP_PRDT_DESC not like", value, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCIn(List<String> values) {
            addCriterion("COMP_PRDT_DESC in", values, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCNotIn(List<String> values) {
            addCriterion("COMP_PRDT_DESC not in", values, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCBetween(String value1, String value2) {
            addCriterion("COMP_PRDT_DESC between", value1, value2, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andCOMP_PRDT_DESCNotBetween(String value1, String value2) {
            addCriterion("COMP_PRDT_DESC not between", value1, value2, "COMP_PRDT_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCIsNull() {
            addCriterion("PRDT_ADV_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCIsNotNull() {
            addCriterion("PRDT_ADV_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCEqualTo(String value) {
            addCriterion("PRDT_ADV_DESC =", value, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCNotEqualTo(String value) {
            addCriterion("PRDT_ADV_DESC <>", value, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCGreaterThan(String value) {
            addCriterion("PRDT_ADV_DESC >", value, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_ADV_DESC >=", value, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCLessThan(String value) {
            addCriterion("PRDT_ADV_DESC <", value, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCLessThanOrEqualTo(String value) {
            addCriterion("PRDT_ADV_DESC <=", value, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCLike(String value) {
            addCriterion("PRDT_ADV_DESC like", value, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCNotLike(String value) {
            addCriterion("PRDT_ADV_DESC not like", value, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCIn(List<String> values) {
            addCriterion("PRDT_ADV_DESC in", values, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCNotIn(List<String> values) {
            addCriterion("PRDT_ADV_DESC not in", values, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCBetween(String value1, String value2) {
            addCriterion("PRDT_ADV_DESC between", value1, value2, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_ADV_DESCNotBetween(String value1, String value2) {
            addCriterion("PRDT_ADV_DESC not between", value1, value2, "PRDT_ADV_DESC");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOIsNull() {
            addCriterion("PRDT_FAV_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOIsNotNull() {
            addCriterion("PRDT_FAV_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOEqualTo(String value) {
            addCriterion("PRDT_FAV_INFO =", value, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFONotEqualTo(String value) {
            addCriterion("PRDT_FAV_INFO <>", value, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOGreaterThan(String value) {
            addCriterion("PRDT_FAV_INFO >", value, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_FAV_INFO >=", value, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOLessThan(String value) {
            addCriterion("PRDT_FAV_INFO <", value, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOLessThanOrEqualTo(String value) {
            addCriterion("PRDT_FAV_INFO <=", value, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOLike(String value) {
            addCriterion("PRDT_FAV_INFO like", value, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFONotLike(String value) {
            addCriterion("PRDT_FAV_INFO not like", value, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOIn(List<String> values) {
            addCriterion("PRDT_FAV_INFO in", values, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFONotIn(List<String> values) {
            addCriterion("PRDT_FAV_INFO not in", values, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFOBetween(String value1, String value2) {
            addCriterion("PRDT_FAV_INFO between", value1, value2, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_FAV_INFONotBetween(String value1, String value2) {
            addCriterion("PRDT_FAV_INFO not between", value1, value2, "PRDT_FAV_INFO");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERIsNull() {
            addCriterion("PRDT_COUNTER is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERIsNotNull() {
            addCriterion("PRDT_COUNTER is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTEREqualTo(Integer value) {
            addCriterion("PRDT_COUNTER =", value, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERNotEqualTo(Integer value) {
            addCriterion("PRDT_COUNTER <>", value, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERGreaterThan(Integer value) {
            addCriterion("PRDT_COUNTER >", value, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRDT_COUNTER >=", value, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERLessThan(Integer value) {
            addCriterion("PRDT_COUNTER <", value, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERLessThanOrEqualTo(Integer value) {
            addCriterion("PRDT_COUNTER <=", value, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERIn(List<Integer> values) {
            addCriterion("PRDT_COUNTER in", values, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERNotIn(List<Integer> values) {
            addCriterion("PRDT_COUNTER not in", values, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERBetween(Integer value1, Integer value2) {
            addCriterion("PRDT_COUNTER between", value1, value2, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andPRDT_COUNTERNotBetween(Integer value1, Integer value2) {
            addCriterion("PRDT_COUNTER not between", value1, value2, "PRDT_COUNTER");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMIsNull() {
            addCriterion("SOLD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMIsNotNull() {
            addCriterion("SOLD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMEqualTo(Integer value) {
            addCriterion("SOLD_NUM =", value, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMNotEqualTo(Integer value) {
            addCriterion("SOLD_NUM <>", value, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMGreaterThan(Integer value) {
            addCriterion("SOLD_NUM >", value, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMGreaterThanOrEqualTo(Integer value) {
            addCriterion("SOLD_NUM >=", value, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMLessThan(Integer value) {
            addCriterion("SOLD_NUM <", value, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMLessThanOrEqualTo(Integer value) {
            addCriterion("SOLD_NUM <=", value, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMIn(List<Integer> values) {
            addCriterion("SOLD_NUM in", values, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMNotIn(List<Integer> values) {
            addCriterion("SOLD_NUM not in", values, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMBetween(Integer value1, Integer value2) {
            addCriterion("SOLD_NUM between", value1, value2, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_NUMNotBetween(Integer value1, Integer value2) {
            addCriterion("SOLD_NUM not between", value1, value2, "SOLD_NUM");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTIsNull() {
            addCriterion("SOLD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTIsNotNull() {
            addCriterion("SOLD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTEqualTo(BigDecimal value) {
            addCriterion("SOLD_AMT =", value, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTNotEqualTo(BigDecimal value) {
            addCriterion("SOLD_AMT <>", value, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTGreaterThan(BigDecimal value) {
            addCriterion("SOLD_AMT >", value, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SOLD_AMT >=", value, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTLessThan(BigDecimal value) {
            addCriterion("SOLD_AMT <", value, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SOLD_AMT <=", value, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTIn(List<BigDecimal> values) {
            addCriterion("SOLD_AMT in", values, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTNotIn(List<BigDecimal> values) {
            addCriterion("SOLD_AMT not in", values, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOLD_AMT between", value1, value2, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andSOLD_AMTNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SOLD_AMT not between", value1, value2, "SOLD_AMT");
            return (Criteria) this;
        }

        public Criteria andBEL_BRIsNull() {
            addCriterion("BEL_BR is null");
            return (Criteria) this;
        }

        public Criteria andBEL_BRIsNotNull() {
            addCriterion("BEL_BR is not null");
            return (Criteria) this;
        }

        public Criteria andBEL_BREqualTo(Integer value) {
            addCriterion("BEL_BR =", value, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRNotEqualTo(Integer value) {
            addCriterion("BEL_BR <>", value, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRGreaterThan(Integer value) {
            addCriterion("BEL_BR >", value, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRGreaterThanOrEqualTo(Integer value) {
            addCriterion("BEL_BR >=", value, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRLessThan(Integer value) {
            addCriterion("BEL_BR <", value, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRLessThanOrEqualTo(Integer value) {
            addCriterion("BEL_BR <=", value, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRIn(List<Integer> values) {
            addCriterion("BEL_BR in", values, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRNotIn(List<Integer> values) {
            addCriterion("BEL_BR not in", values, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRBetween(Integer value1, Integer value2) {
            addCriterion("BEL_BR between", value1, value2, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andBEL_BRNotBetween(Integer value1, Integer value2) {
            addCriterion("BEL_BR not between", value1, value2, "BEL_BR");
            return (Criteria) this;
        }

        public Criteria andLEVEL1IsNull() {
            addCriterion("LEVEL1 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL1IsNotNull() {
            addCriterion("LEVEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL1EqualTo(String value) {
            addCriterion("LEVEL1 =", value, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1NotEqualTo(String value) {
            addCriterion("LEVEL1 <>", value, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1GreaterThan(String value) {
            addCriterion("LEVEL1 >", value, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL1 >=", value, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1LessThan(String value) {
            addCriterion("LEVEL1 <", value, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1LessThanOrEqualTo(String value) {
            addCriterion("LEVEL1 <=", value, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1Like(String value) {
            addCriterion("LEVEL1 like", value, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1NotLike(String value) {
            addCriterion("LEVEL1 not like", value, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1In(List<String> values) {
            addCriterion("LEVEL1 in", values, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1NotIn(List<String> values) {
            addCriterion("LEVEL1 not in", values, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1Between(String value1, String value2) {
            addCriterion("LEVEL1 between", value1, value2, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL1NotBetween(String value1, String value2) {
            addCriterion("LEVEL1 not between", value1, value2, "LEVEL1");
            return (Criteria) this;
        }

        public Criteria andLEVEL2IsNull() {
            addCriterion("LEVEL2 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL2IsNotNull() {
            addCriterion("LEVEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL2EqualTo(String value) {
            addCriterion("LEVEL2 =", value, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2NotEqualTo(String value) {
            addCriterion("LEVEL2 <>", value, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2GreaterThan(String value) {
            addCriterion("LEVEL2 >", value, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL2 >=", value, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2LessThan(String value) {
            addCriterion("LEVEL2 <", value, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2LessThanOrEqualTo(String value) {
            addCriterion("LEVEL2 <=", value, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2Like(String value) {
            addCriterion("LEVEL2 like", value, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2NotLike(String value) {
            addCriterion("LEVEL2 not like", value, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2In(List<String> values) {
            addCriterion("LEVEL2 in", values, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2NotIn(List<String> values) {
            addCriterion("LEVEL2 not in", values, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2Between(String value1, String value2) {
            addCriterion("LEVEL2 between", value1, value2, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL2NotBetween(String value1, String value2) {
            addCriterion("LEVEL2 not between", value1, value2, "LEVEL2");
            return (Criteria) this;
        }

        public Criteria andLEVEL3IsNull() {
            addCriterion("LEVEL3 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL3IsNotNull() {
            addCriterion("LEVEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL3EqualTo(String value) {
            addCriterion("LEVEL3 =", value, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3NotEqualTo(String value) {
            addCriterion("LEVEL3 <>", value, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3GreaterThan(String value) {
            addCriterion("LEVEL3 >", value, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL3 >=", value, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3LessThan(String value) {
            addCriterion("LEVEL3 <", value, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3LessThanOrEqualTo(String value) {
            addCriterion("LEVEL3 <=", value, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3Like(String value) {
            addCriterion("LEVEL3 like", value, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3NotLike(String value) {
            addCriterion("LEVEL3 not like", value, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3In(List<String> values) {
            addCriterion("LEVEL3 in", values, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3NotIn(List<String> values) {
            addCriterion("LEVEL3 not in", values, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3Between(String value1, String value2) {
            addCriterion("LEVEL3 between", value1, value2, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL3NotBetween(String value1, String value2) {
            addCriterion("LEVEL3 not between", value1, value2, "LEVEL3");
            return (Criteria) this;
        }

        public Criteria andLEVEL4IsNull() {
            addCriterion("LEVEL4 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL4IsNotNull() {
            addCriterion("LEVEL4 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL4EqualTo(String value) {
            addCriterion("LEVEL4 =", value, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4NotEqualTo(String value) {
            addCriterion("LEVEL4 <>", value, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4GreaterThan(String value) {
            addCriterion("LEVEL4 >", value, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL4 >=", value, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4LessThan(String value) {
            addCriterion("LEVEL4 <", value, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4LessThanOrEqualTo(String value) {
            addCriterion("LEVEL4 <=", value, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4Like(String value) {
            addCriterion("LEVEL4 like", value, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4NotLike(String value) {
            addCriterion("LEVEL4 not like", value, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4In(List<String> values) {
            addCriterion("LEVEL4 in", values, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4NotIn(List<String> values) {
            addCriterion("LEVEL4 not in", values, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4Between(String value1, String value2) {
            addCriterion("LEVEL4 between", value1, value2, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL4NotBetween(String value1, String value2) {
            addCriterion("LEVEL4 not between", value1, value2, "LEVEL4");
            return (Criteria) this;
        }

        public Criteria andLEVEL5IsNull() {
            addCriterion("LEVEL5 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL5IsNotNull() {
            addCriterion("LEVEL5 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL5EqualTo(String value) {
            addCriterion("LEVEL5 =", value, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5NotEqualTo(String value) {
            addCriterion("LEVEL5 <>", value, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5GreaterThan(String value) {
            addCriterion("LEVEL5 >", value, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL5 >=", value, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5LessThan(String value) {
            addCriterion("LEVEL5 <", value, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5LessThanOrEqualTo(String value) {
            addCriterion("LEVEL5 <=", value, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5Like(String value) {
            addCriterion("LEVEL5 like", value, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5NotLike(String value) {
            addCriterion("LEVEL5 not like", value, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5In(List<String> values) {
            addCriterion("LEVEL5 in", values, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5NotIn(List<String> values) {
            addCriterion("LEVEL5 not in", values, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5Between(String value1, String value2) {
            addCriterion("LEVEL5 between", value1, value2, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL5NotBetween(String value1, String value2) {
            addCriterion("LEVEL5 not between", value1, value2, "LEVEL5");
            return (Criteria) this;
        }

        public Criteria andLEVEL6IsNull() {
            addCriterion("LEVEL6 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL6IsNotNull() {
            addCriterion("LEVEL6 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL6EqualTo(String value) {
            addCriterion("LEVEL6 =", value, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6NotEqualTo(String value) {
            addCriterion("LEVEL6 <>", value, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6GreaterThan(String value) {
            addCriterion("LEVEL6 >", value, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL6 >=", value, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6LessThan(String value) {
            addCriterion("LEVEL6 <", value, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6LessThanOrEqualTo(String value) {
            addCriterion("LEVEL6 <=", value, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6Like(String value) {
            addCriterion("LEVEL6 like", value, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6NotLike(String value) {
            addCriterion("LEVEL6 not like", value, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6In(List<String> values) {
            addCriterion("LEVEL6 in", values, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6NotIn(List<String> values) {
            addCriterion("LEVEL6 not in", values, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6Between(String value1, String value2) {
            addCriterion("LEVEL6 between", value1, value2, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL6NotBetween(String value1, String value2) {
            addCriterion("LEVEL6 not between", value1, value2, "LEVEL6");
            return (Criteria) this;
        }

        public Criteria andLEVEL7IsNull() {
            addCriterion("LEVEL7 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL7IsNotNull() {
            addCriterion("LEVEL7 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL7EqualTo(String value) {
            addCriterion("LEVEL7 =", value, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7NotEqualTo(String value) {
            addCriterion("LEVEL7 <>", value, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7GreaterThan(String value) {
            addCriterion("LEVEL7 >", value, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL7 >=", value, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7LessThan(String value) {
            addCriterion("LEVEL7 <", value, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7LessThanOrEqualTo(String value) {
            addCriterion("LEVEL7 <=", value, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7Like(String value) {
            addCriterion("LEVEL7 like", value, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7NotLike(String value) {
            addCriterion("LEVEL7 not like", value, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7In(List<String> values) {
            addCriterion("LEVEL7 in", values, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7NotIn(List<String> values) {
            addCriterion("LEVEL7 not in", values, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7Between(String value1, String value2) {
            addCriterion("LEVEL7 between", value1, value2, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL7NotBetween(String value1, String value2) {
            addCriterion("LEVEL7 not between", value1, value2, "LEVEL7");
            return (Criteria) this;
        }

        public Criteria andLEVEL8IsNull() {
            addCriterion("LEVEL8 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL8IsNotNull() {
            addCriterion("LEVEL8 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL8EqualTo(String value) {
            addCriterion("LEVEL8 =", value, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8NotEqualTo(String value) {
            addCriterion("LEVEL8 <>", value, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8GreaterThan(String value) {
            addCriterion("LEVEL8 >", value, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL8 >=", value, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8LessThan(String value) {
            addCriterion("LEVEL8 <", value, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8LessThanOrEqualTo(String value) {
            addCriterion("LEVEL8 <=", value, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8Like(String value) {
            addCriterion("LEVEL8 like", value, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8NotLike(String value) {
            addCriterion("LEVEL8 not like", value, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8In(List<String> values) {
            addCriterion("LEVEL8 in", values, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8NotIn(List<String> values) {
            addCriterion("LEVEL8 not in", values, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8Between(String value1, String value2) {
            addCriterion("LEVEL8 between", value1, value2, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL8NotBetween(String value1, String value2) {
            addCriterion("LEVEL8 not between", value1, value2, "LEVEL8");
            return (Criteria) this;
        }

        public Criteria andLEVEL9IsNull() {
            addCriterion("LEVEL9 is null");
            return (Criteria) this;
        }

        public Criteria andLEVEL9IsNotNull() {
            addCriterion("LEVEL9 is not null");
            return (Criteria) this;
        }

        public Criteria andLEVEL9EqualTo(String value) {
            addCriterion("LEVEL9 =", value, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9NotEqualTo(String value) {
            addCriterion("LEVEL9 <>", value, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9GreaterThan(String value) {
            addCriterion("LEVEL9 >", value, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9GreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL9 >=", value, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9LessThan(String value) {
            addCriterion("LEVEL9 <", value, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9LessThanOrEqualTo(String value) {
            addCriterion("LEVEL9 <=", value, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9Like(String value) {
            addCriterion("LEVEL9 like", value, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9NotLike(String value) {
            addCriterion("LEVEL9 not like", value, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9In(List<String> values) {
            addCriterion("LEVEL9 in", values, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9NotIn(List<String> values) {
            addCriterion("LEVEL9 not in", values, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9Between(String value1, String value2) {
            addCriterion("LEVEL9 between", value1, value2, "LEVEL9");
            return (Criteria) this;
        }

        public Criteria andLEVEL9NotBetween(String value1, String value2) {
            addCriterion("LEVEL9 not between", value1, value2, "LEVEL9");
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