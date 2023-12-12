package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BptpdmeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BptpdmeExample() {
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

        public Criteria andPRDT_NAMEIsNull() {
            addCriterion("PRDT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMEIsNotNull() {
            addCriterion("PRDT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMEEqualTo(String value) {
            addCriterion("PRDT_NAME =", value, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMENotEqualTo(String value) {
            addCriterion("PRDT_NAME <>", value, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMEGreaterThan(String value) {
            addCriterion("PRDT_NAME >", value, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_NAME >=", value, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMELessThan(String value) {
            addCriterion("PRDT_NAME <", value, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMELessThanOrEqualTo(String value) {
            addCriterion("PRDT_NAME <=", value, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMELike(String value) {
            addCriterion("PRDT_NAME like", value, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMENotLike(String value) {
            addCriterion("PRDT_NAME not like", value, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMEIn(List<String> values) {
            addCriterion("PRDT_NAME in", values, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMENotIn(List<String> values) {
            addCriterion("PRDT_NAME not in", values, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMEBetween(String value1, String value2) {
            addCriterion("PRDT_NAME between", value1, value2, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andPRDT_NAMENotBetween(String value1, String value2) {
            addCriterion("PRDT_NAME not between", value1, value2, "PRDT_NAME");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPEIsNull() {
            addCriterion("BUSI_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPEIsNotNull() {
            addCriterion("BUSI_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPEEqualTo(String value) {
            addCriterion("BUSI_TYPE =", value, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPENotEqualTo(String value) {
            addCriterion("BUSI_TYPE <>", value, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPEGreaterThan(String value) {
            addCriterion("BUSI_TYPE >", value, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE >=", value, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPELessThan(String value) {
            addCriterion("BUSI_TYPE <", value, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPELessThanOrEqualTo(String value) {
            addCriterion("BUSI_TYPE <=", value, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPELike(String value) {
            addCriterion("BUSI_TYPE like", value, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPENotLike(String value) {
            addCriterion("BUSI_TYPE not like", value, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPEIn(List<String> values) {
            addCriterion("BUSI_TYPE in", values, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPENotIn(List<String> values) {
            addCriterion("BUSI_TYPE not in", values, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPEBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE between", value1, value2, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andBUSI_TYPENotBetween(String value1, String value2) {
            addCriterion("BUSI_TYPE not between", value1, value2, "BUSI_TYPE");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPIsNull() {
            addCriterion("CTRACT_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPIsNotNull() {
            addCriterion("CTRACT_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPEqualTo(String value) {
            addCriterion("CTRACT_GROUP =", value, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPNotEqualTo(String value) {
            addCriterion("CTRACT_GROUP <>", value, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPGreaterThan(String value) {
            addCriterion("CTRACT_GROUP >", value, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPGreaterThanOrEqualTo(String value) {
            addCriterion("CTRACT_GROUP >=", value, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPLessThan(String value) {
            addCriterion("CTRACT_GROUP <", value, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPLessThanOrEqualTo(String value) {
            addCriterion("CTRACT_GROUP <=", value, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPLike(String value) {
            addCriterion("CTRACT_GROUP like", value, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPNotLike(String value) {
            addCriterion("CTRACT_GROUP not like", value, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPIn(List<String> values) {
            addCriterion("CTRACT_GROUP in", values, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPNotIn(List<String> values) {
            addCriterion("CTRACT_GROUP not in", values, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPBetween(String value1, String value2) {
            addCriterion("CTRACT_GROUP between", value1, value2, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andCTRACT_GROUPNotBetween(String value1, String value2) {
            addCriterion("CTRACT_GROUP not between", value1, value2, "CTRACT_GROUP");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELIsNull() {
            addCriterion("PRDT_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELIsNotNull() {
            addCriterion("PRDT_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELEqualTo(String value) {
            addCriterion("PRDT_MODEL =", value, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELNotEqualTo(String value) {
            addCriterion("PRDT_MODEL <>", value, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELGreaterThan(String value) {
            addCriterion("PRDT_MODEL >", value, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL >=", value, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELLessThan(String value) {
            addCriterion("PRDT_MODEL <", value, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELLessThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL <=", value, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELLike(String value) {
            addCriterion("PRDT_MODEL like", value, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELNotLike(String value) {
            addCriterion("PRDT_MODEL not like", value, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELIn(List<String> values) {
            addCriterion("PRDT_MODEL in", values, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELNotIn(List<String> values) {
            addCriterion("PRDT_MODEL not in", values, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELBetween(String value1, String value2) {
            addCriterion("PRDT_MODEL between", value1, value2, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODELNotBetween(String value1, String value2) {
            addCriterion("PRDT_MODEL not between", value1, value2, "PRDT_MODEL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1IsNull() {
            addCriterion("PRDT_MODEL1 is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1IsNotNull() {
            addCriterion("PRDT_MODEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1EqualTo(String value) {
            addCriterion("PRDT_MODEL1 =", value, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1NotEqualTo(String value) {
            addCriterion("PRDT_MODEL1 <>", value, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1GreaterThan(String value) {
            addCriterion("PRDT_MODEL1 >", value, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1GreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL1 >=", value, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1LessThan(String value) {
            addCriterion("PRDT_MODEL1 <", value, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1LessThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL1 <=", value, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1Like(String value) {
            addCriterion("PRDT_MODEL1 like", value, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1NotLike(String value) {
            addCriterion("PRDT_MODEL1 not like", value, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1In(List<String> values) {
            addCriterion("PRDT_MODEL1 in", values, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1NotIn(List<String> values) {
            addCriterion("PRDT_MODEL1 not in", values, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1Between(String value1, String value2) {
            addCriterion("PRDT_MODEL1 between", value1, value2, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL1NotBetween(String value1, String value2) {
            addCriterion("PRDT_MODEL1 not between", value1, value2, "PRDT_MODEL1");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2IsNull() {
            addCriterion("PRDT_MODEL2 is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2IsNotNull() {
            addCriterion("PRDT_MODEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2EqualTo(String value) {
            addCriterion("PRDT_MODEL2 =", value, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2NotEqualTo(String value) {
            addCriterion("PRDT_MODEL2 <>", value, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2GreaterThan(String value) {
            addCriterion("PRDT_MODEL2 >", value, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2GreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL2 >=", value, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2LessThan(String value) {
            addCriterion("PRDT_MODEL2 <", value, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2LessThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL2 <=", value, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2Like(String value) {
            addCriterion("PRDT_MODEL2 like", value, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2NotLike(String value) {
            addCriterion("PRDT_MODEL2 not like", value, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2In(List<String> values) {
            addCriterion("PRDT_MODEL2 in", values, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2NotIn(List<String> values) {
            addCriterion("PRDT_MODEL2 not in", values, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2Between(String value1, String value2) {
            addCriterion("PRDT_MODEL2 between", value1, value2, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL2NotBetween(String value1, String value2) {
            addCriterion("PRDT_MODEL2 not between", value1, value2, "PRDT_MODEL2");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3IsNull() {
            addCriterion("PRDT_MODEL3 is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3IsNotNull() {
            addCriterion("PRDT_MODEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3EqualTo(String value) {
            addCriterion("PRDT_MODEL3 =", value, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3NotEqualTo(String value) {
            addCriterion("PRDT_MODEL3 <>", value, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3GreaterThan(String value) {
            addCriterion("PRDT_MODEL3 >", value, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3GreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL3 >=", value, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3LessThan(String value) {
            addCriterion("PRDT_MODEL3 <", value, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3LessThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL3 <=", value, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3Like(String value) {
            addCriterion("PRDT_MODEL3 like", value, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3NotLike(String value) {
            addCriterion("PRDT_MODEL3 not like", value, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3In(List<String> values) {
            addCriterion("PRDT_MODEL3 in", values, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3NotIn(List<String> values) {
            addCriterion("PRDT_MODEL3 not in", values, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3Between(String value1, String value2) {
            addCriterion("PRDT_MODEL3 between", value1, value2, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL3NotBetween(String value1, String value2) {
            addCriterion("PRDT_MODEL3 not between", value1, value2, "PRDT_MODEL3");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4IsNull() {
            addCriterion("PRDT_MODEL4 is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4IsNotNull() {
            addCriterion("PRDT_MODEL4 is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4EqualTo(String value) {
            addCriterion("PRDT_MODEL4 =", value, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4NotEqualTo(String value) {
            addCriterion("PRDT_MODEL4 <>", value, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4GreaterThan(String value) {
            addCriterion("PRDT_MODEL4 >", value, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4GreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL4 >=", value, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4LessThan(String value) {
            addCriterion("PRDT_MODEL4 <", value, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4LessThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL4 <=", value, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4Like(String value) {
            addCriterion("PRDT_MODEL4 like", value, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4NotLike(String value) {
            addCriterion("PRDT_MODEL4 not like", value, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4In(List<String> values) {
            addCriterion("PRDT_MODEL4 in", values, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4NotIn(List<String> values) {
            addCriterion("PRDT_MODEL4 not in", values, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4Between(String value1, String value2) {
            addCriterion("PRDT_MODEL4 between", value1, value2, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL4NotBetween(String value1, String value2) {
            addCriterion("PRDT_MODEL4 not between", value1, value2, "PRDT_MODEL4");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5IsNull() {
            addCriterion("PRDT_MODEL5 is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5IsNotNull() {
            addCriterion("PRDT_MODEL5 is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5EqualTo(String value) {
            addCriterion("PRDT_MODEL5 =", value, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5NotEqualTo(String value) {
            addCriterion("PRDT_MODEL5 <>", value, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5GreaterThan(String value) {
            addCriterion("PRDT_MODEL5 >", value, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5GreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL5 >=", value, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5LessThan(String value) {
            addCriterion("PRDT_MODEL5 <", value, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5LessThanOrEqualTo(String value) {
            addCriterion("PRDT_MODEL5 <=", value, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5Like(String value) {
            addCriterion("PRDT_MODEL5 like", value, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5NotLike(String value) {
            addCriterion("PRDT_MODEL5 not like", value, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5In(List<String> values) {
            addCriterion("PRDT_MODEL5 in", values, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5NotIn(List<String> values) {
            addCriterion("PRDT_MODEL5 not in", values, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5Between(String value1, String value2) {
            addCriterion("PRDT_MODEL5 between", value1, value2, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andPRDT_MODEL5NotBetween(String value1, String value2) {
            addCriterion("PRDT_MODEL5 not between", value1, value2, "PRDT_MODEL5");
            return (Criteria) this;
        }

        public Criteria andSTSIsNull() {
            addCriterion("STS is null");
            return (Criteria) this;
        }

        public Criteria andSTSIsNotNull() {
            addCriterion("STS is not null");
            return (Criteria) this;
        }

        public Criteria andSTSEqualTo(String value) {
            addCriterion("STS =", value, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSNotEqualTo(String value) {
            addCriterion("STS <>", value, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSGreaterThan(String value) {
            addCriterion("STS >", value, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSGreaterThanOrEqualTo(String value) {
            addCriterion("STS >=", value, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSLessThan(String value) {
            addCriterion("STS <", value, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSLessThanOrEqualTo(String value) {
            addCriterion("STS <=", value, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSLike(String value) {
            addCriterion("STS like", value, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSNotLike(String value) {
            addCriterion("STS not like", value, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSIn(List<String> values) {
            addCriterion("STS in", values, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSNotIn(List<String> values) {
            addCriterion("STS not in", values, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSBetween(String value1, String value2) {
            addCriterion("STS between", value1, value2, "STS");
            return (Criteria) this;
        }

        public Criteria andSTSNotBetween(String value1, String value2) {
            addCriterion("STS not between", value1, value2, "STS");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDIsNull() {
            addCriterion("PRDT_IND is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDIsNotNull() {
            addCriterion("PRDT_IND is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDEqualTo(String value) {
            addCriterion("PRDT_IND =", value, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDNotEqualTo(String value) {
            addCriterion("PRDT_IND <>", value, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDGreaterThan(String value) {
            addCriterion("PRDT_IND >", value, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_IND >=", value, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDLessThan(String value) {
            addCriterion("PRDT_IND <", value, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDLessThanOrEqualTo(String value) {
            addCriterion("PRDT_IND <=", value, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDLike(String value) {
            addCriterion("PRDT_IND like", value, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDNotLike(String value) {
            addCriterion("PRDT_IND not like", value, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDIn(List<String> values) {
            addCriterion("PRDT_IND in", values, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDNotIn(List<String> values) {
            addCriterion("PRDT_IND not in", values, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDBetween(String value1, String value2) {
            addCriterion("PRDT_IND between", value1, value2, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andPRDT_INDNotBetween(String value1, String value2) {
            addCriterion("PRDT_IND not between", value1, value2, "PRDT_IND");
            return (Criteria) this;
        }

        public Criteria andDESCIsNull() {
            addCriterion("DESC is null");
            return (Criteria) this;
        }

        public Criteria andDESCIsNotNull() {
            addCriterion("DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDESCEqualTo(String value) {
            addCriterion("DESC =", value, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCNotEqualTo(String value) {
            addCriterion("DESC <>", value, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCGreaterThan(String value) {
            addCriterion("DESC >", value, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCGreaterThanOrEqualTo(String value) {
            addCriterion("DESC >=", value, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCLessThan(String value) {
            addCriterion("DESC <", value, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCLessThanOrEqualTo(String value) {
            addCriterion("DESC <=", value, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCLike(String value) {
            addCriterion("DESC like", value, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCNotLike(String value) {
            addCriterion("DESC not like", value, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCIn(List<String> values) {
            addCriterion("DESC in", values, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCNotIn(List<String> values) {
            addCriterion("DESC not in", values, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCBetween(String value1, String value2) {
            addCriterion("DESC between", value1, value2, "DESC");
            return (Criteria) this;
        }

        public Criteria andDESCNotBetween(String value1, String value2) {
            addCriterion("DESC not between", value1, value2, "DESC");
            return (Criteria) this;
        }

        public Criteria andEFF_DATEIsNull() {
            addCriterion("EFF_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEFF_DATEIsNotNull() {
            addCriterion("EFF_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEFF_DATEEqualTo(Integer value) {
            addCriterion("EFF_DATE =", value, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATENotEqualTo(Integer value) {
            addCriterion("EFF_DATE <>", value, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATEGreaterThan(Integer value) {
            addCriterion("EFF_DATE >", value, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("EFF_DATE >=", value, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATELessThan(Integer value) {
            addCriterion("EFF_DATE <", value, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATELessThanOrEqualTo(Integer value) {
            addCriterion("EFF_DATE <=", value, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATEIn(List<Integer> values) {
            addCriterion("EFF_DATE in", values, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATENotIn(List<Integer> values) {
            addCriterion("EFF_DATE not in", values, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATEBetween(Integer value1, Integer value2) {
            addCriterion("EFF_DATE between", value1, value2, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEFF_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("EFF_DATE not between", value1, value2, "EFF_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATEIsNull() {
            addCriterion("EXP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEXP_DATEIsNotNull() {
            addCriterion("EXP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEXP_DATEEqualTo(Integer value) {
            addCriterion("EXP_DATE =", value, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATENotEqualTo(Integer value) {
            addCriterion("EXP_DATE <>", value, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATEGreaterThan(Integer value) {
            addCriterion("EXP_DATE >", value, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXP_DATE >=", value, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATELessThan(Integer value) {
            addCriterion("EXP_DATE <", value, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATELessThanOrEqualTo(Integer value) {
            addCriterion("EXP_DATE <=", value, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATEIn(List<Integer> values) {
            addCriterion("EXP_DATE in", values, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATENotIn(List<Integer> values) {
            addCriterion("EXP_DATE not in", values, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATEBetween(Integer value1, Integer value2) {
            addCriterion("EXP_DATE between", value1, value2, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andEXP_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("EXP_DATE not between", value1, value2, "EXP_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATEIsNull() {
            addCriterion("STOP_SOLD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATEIsNotNull() {
            addCriterion("STOP_SOLD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATEEqualTo(Integer value) {
            addCriterion("STOP_SOLD_DATE =", value, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATENotEqualTo(Integer value) {
            addCriterion("STOP_SOLD_DATE <>", value, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATEGreaterThan(Integer value) {
            addCriterion("STOP_SOLD_DATE >", value, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("STOP_SOLD_DATE >=", value, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATELessThan(Integer value) {
            addCriterion("STOP_SOLD_DATE <", value, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATELessThanOrEqualTo(Integer value) {
            addCriterion("STOP_SOLD_DATE <=", value, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATEIn(List<Integer> values) {
            addCriterion("STOP_SOLD_DATE in", values, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATENotIn(List<Integer> values) {
            addCriterion("STOP_SOLD_DATE not in", values, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATEBetween(Integer value1, Integer value2) {
            addCriterion("STOP_SOLD_DATE between", value1, value2, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andSTOP_SOLD_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("STOP_SOLD_DATE not between", value1, value2, "STOP_SOLD_DATE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODEIsNull() {
            addCriterion("PARM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPARM_CODEIsNotNull() {
            addCriterion("PARM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPARM_CODEEqualTo(String value) {
            addCriterion("PARM_CODE =", value, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODENotEqualTo(String value) {
            addCriterion("PARM_CODE <>", value, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODEGreaterThan(String value) {
            addCriterion("PARM_CODE >", value, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("PARM_CODE >=", value, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODELessThan(String value) {
            addCriterion("PARM_CODE <", value, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODELessThanOrEqualTo(String value) {
            addCriterion("PARM_CODE <=", value, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODELike(String value) {
            addCriterion("PARM_CODE like", value, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODENotLike(String value) {
            addCriterion("PARM_CODE not like", value, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODEIn(List<String> values) {
            addCriterion("PARM_CODE in", values, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODENotIn(List<String> values) {
            addCriterion("PARM_CODE not in", values, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODEBetween(String value1, String value2) {
            addCriterion("PARM_CODE between", value1, value2, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andPARM_CODENotBetween(String value1, String value2) {
            addCriterion("PARM_CODE not between", value1, value2, "PARM_CODE");
            return (Criteria) this;
        }

        public Criteria andAC_RULEIsNull() {
            addCriterion("AC_RULE is null");
            return (Criteria) this;
        }

        public Criteria andAC_RULEIsNotNull() {
            addCriterion("AC_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andAC_RULEEqualTo(String value) {
            addCriterion("AC_RULE =", value, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULENotEqualTo(String value) {
            addCriterion("AC_RULE <>", value, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULEGreaterThan(String value) {
            addCriterion("AC_RULE >", value, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULEGreaterThanOrEqualTo(String value) {
            addCriterion("AC_RULE >=", value, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULELessThan(String value) {
            addCriterion("AC_RULE <", value, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULELessThanOrEqualTo(String value) {
            addCriterion("AC_RULE <=", value, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULELike(String value) {
            addCriterion("AC_RULE like", value, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULENotLike(String value) {
            addCriterion("AC_RULE not like", value, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULEIn(List<String> values) {
            addCriterion("AC_RULE in", values, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULENotIn(List<String> values) {
            addCriterion("AC_RULE not in", values, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULEBetween(String value1, String value2) {
            addCriterion("AC_RULE between", value1, value2, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andAC_RULENotBetween(String value1, String value2) {
            addCriterion("AC_RULE not between", value1, value2, "AC_RULE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPEIsNull() {
            addCriterion("ACCR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPEIsNotNull() {
            addCriterion("ACCR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPEEqualTo(String value) {
            addCriterion("ACCR_TYPE =", value, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPENotEqualTo(String value) {
            addCriterion("ACCR_TYPE <>", value, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPEGreaterThan(String value) {
            addCriterion("ACCR_TYPE >", value, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("ACCR_TYPE >=", value, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPELessThan(String value) {
            addCriterion("ACCR_TYPE <", value, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPELessThanOrEqualTo(String value) {
            addCriterion("ACCR_TYPE <=", value, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPELike(String value) {
            addCriterion("ACCR_TYPE like", value, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPENotLike(String value) {
            addCriterion("ACCR_TYPE not like", value, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPEIn(List<String> values) {
            addCriterion("ACCR_TYPE in", values, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPENotIn(List<String> values) {
            addCriterion("ACCR_TYPE not in", values, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPEBetween(String value1, String value2) {
            addCriterion("ACCR_TYPE between", value1, value2, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andACCR_TYPENotBetween(String value1, String value2) {
            addCriterion("ACCR_TYPE not between", value1, value2, "ACCR_TYPE");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLIsNull() {
            addCriterion("RISK_LVL is null");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLIsNotNull() {
            addCriterion("RISK_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLEqualTo(String value) {
            addCriterion("RISK_LVL =", value, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLNotEqualTo(String value) {
            addCriterion("RISK_LVL <>", value, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLGreaterThan(String value) {
            addCriterion("RISK_LVL >", value, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLGreaterThanOrEqualTo(String value) {
            addCriterion("RISK_LVL >=", value, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLLessThan(String value) {
            addCriterion("RISK_LVL <", value, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLLessThanOrEqualTo(String value) {
            addCriterion("RISK_LVL <=", value, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLLike(String value) {
            addCriterion("RISK_LVL like", value, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLNotLike(String value) {
            addCriterion("RISK_LVL not like", value, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLIn(List<String> values) {
            addCriterion("RISK_LVL in", values, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLNotIn(List<String> values) {
            addCriterion("RISK_LVL not in", values, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLBetween(String value1, String value2) {
            addCriterion("RISK_LVL between", value1, value2, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andRISK_LVLNotBetween(String value1, String value2) {
            addCriterion("RISK_LVL not between", value1, value2, "RISK_LVL");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERIsNull() {
            addCriterion("PRDT_MANEGER is null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERIsNotNull() {
            addCriterion("PRDT_MANEGER is not null");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGEREqualTo(String value) {
            addCriterion("PRDT_MANEGER =", value, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERNotEqualTo(String value) {
            addCriterion("PRDT_MANEGER <>", value, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERGreaterThan(String value) {
            addCriterion("PRDT_MANEGER >", value, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERGreaterThanOrEqualTo(String value) {
            addCriterion("PRDT_MANEGER >=", value, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERLessThan(String value) {
            addCriterion("PRDT_MANEGER <", value, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERLessThanOrEqualTo(String value) {
            addCriterion("PRDT_MANEGER <=", value, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERLike(String value) {
            addCriterion("PRDT_MANEGER like", value, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERNotLike(String value) {
            addCriterion("PRDT_MANEGER not like", value, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERIn(List<String> values) {
            addCriterion("PRDT_MANEGER in", values, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERNotIn(List<String> values) {
            addCriterion("PRDT_MANEGER not in", values, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERBetween(String value1, String value2) {
            addCriterion("PRDT_MANEGER between", value1, value2, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andPRDT_MANEGERNotBetween(String value1, String value2) {
            addCriterion("PRDT_MANEGER not between", value1, value2, "PRDT_MANEGER");
            return (Criteria) this;
        }

        public Criteria andASS_BRIsNull() {
            addCriterion("ASS_BR is null");
            return (Criteria) this;
        }

        public Criteria andASS_BRIsNotNull() {
            addCriterion("ASS_BR is not null");
            return (Criteria) this;
        }

        public Criteria andASS_BREqualTo(Integer value) {
            addCriterion("ASS_BR =", value, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRNotEqualTo(Integer value) {
            addCriterion("ASS_BR <>", value, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRGreaterThan(Integer value) {
            addCriterion("ASS_BR >", value, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRGreaterThanOrEqualTo(Integer value) {
            addCriterion("ASS_BR >=", value, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRLessThan(Integer value) {
            addCriterion("ASS_BR <", value, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRLessThanOrEqualTo(Integer value) {
            addCriterion("ASS_BR <=", value, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRIn(List<Integer> values) {
            addCriterion("ASS_BR in", values, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRNotIn(List<Integer> values) {
            addCriterion("ASS_BR not in", values, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRBetween(Integer value1, Integer value2) {
            addCriterion("ASS_BR between", value1, value2, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andASS_BRNotBetween(Integer value1, Integer value2) {
            addCriterion("ASS_BR not between", value1, value2, "ASS_BR");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATEIsNull() {
            addCriterion("OPEN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATEIsNotNull() {
            addCriterion("OPEN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATEEqualTo(Integer value) {
            addCriterion("OPEN_DATE =", value, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATENotEqualTo(Integer value) {
            addCriterion("OPEN_DATE <>", value, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATEGreaterThan(Integer value) {
            addCriterion("OPEN_DATE >", value, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPEN_DATE >=", value, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATELessThan(Integer value) {
            addCriterion("OPEN_DATE <", value, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATELessThanOrEqualTo(Integer value) {
            addCriterion("OPEN_DATE <=", value, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATEIn(List<Integer> values) {
            addCriterion("OPEN_DATE in", values, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATENotIn(List<Integer> values) {
            addCriterion("OPEN_DATE not in", values, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATEBetween(Integer value1, Integer value2) {
            addCriterion("OPEN_DATE between", value1, value2, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andOPEN_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("OPEN_DATE not between", value1, value2, "OPEN_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATEIsNull() {
            addCriterion("LAST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLAST_DATEIsNotNull() {
            addCriterion("LAST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_DATEEqualTo(Integer value) {
            addCriterion("LAST_DATE =", value, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATENotEqualTo(Integer value) {
            addCriterion("LAST_DATE <>", value, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATEGreaterThan(Integer value) {
            addCriterion("LAST_DATE >", value, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_DATE >=", value, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATELessThan(Integer value) {
            addCriterion("LAST_DATE <", value, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATELessThanOrEqualTo(Integer value) {
            addCriterion("LAST_DATE <=", value, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATEIn(List<Integer> values) {
            addCriterion("LAST_DATE in", values, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATENotIn(List<Integer> values) {
            addCriterion("LAST_DATE not in", values, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATEBetween(Integer value1, Integer value2) {
            addCriterion("LAST_DATE between", value1, value2, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_DATE not between", value1, value2, "LAST_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTIsNull() {
            addCriterion("LAST_TLT is null");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTIsNotNull() {
            addCriterion("LAST_TLT is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTEqualTo(String value) {
            addCriterion("LAST_TLT =", value, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTNotEqualTo(String value) {
            addCriterion("LAST_TLT <>", value, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTGreaterThan(String value) {
            addCriterion("LAST_TLT >", value, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_TLT >=", value, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTLessThan(String value) {
            addCriterion("LAST_TLT <", value, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTLessThanOrEqualTo(String value) {
            addCriterion("LAST_TLT <=", value, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTLike(String value) {
            addCriterion("LAST_TLT like", value, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTNotLike(String value) {
            addCriterion("LAST_TLT not like", value, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTIn(List<String> values) {
            addCriterion("LAST_TLT in", values, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTNotIn(List<String> values) {
            addCriterion("LAST_TLT not in", values, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTBetween(String value1, String value2) {
            addCriterion("LAST_TLT between", value1, value2, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andLAST_TLTNotBetween(String value1, String value2) {
            addCriterion("LAST_TLT not between", value1, value2, "LAST_TLT");
            return (Criteria) this;
        }

        public Criteria andTSIsNull() {
            addCriterion("TS is null");
            return (Criteria) this;
        }

        public Criteria andTSIsNotNull() {
            addCriterion("TS is not null");
            return (Criteria) this;
        }

        public Criteria andTSEqualTo(Date value) {
            addCriterion("TS =", value, "TS");
            return (Criteria) this;
        }

        public Criteria andTSNotEqualTo(Date value) {
            addCriterion("TS <>", value, "TS");
            return (Criteria) this;
        }

        public Criteria andTSGreaterThan(Date value) {
            addCriterion("TS >", value, "TS");
            return (Criteria) this;
        }

        public Criteria andTSGreaterThanOrEqualTo(Date value) {
            addCriterion("TS >=", value, "TS");
            return (Criteria) this;
        }

        public Criteria andTSLessThan(Date value) {
            addCriterion("TS <", value, "TS");
            return (Criteria) this;
        }

        public Criteria andTSLessThanOrEqualTo(Date value) {
            addCriterion("TS <=", value, "TS");
            return (Criteria) this;
        }

        public Criteria andTSIn(List<Date> values) {
            addCriterion("TS in", values, "TS");
            return (Criteria) this;
        }

        public Criteria andTSNotIn(List<Date> values) {
            addCriterion("TS not in", values, "TS");
            return (Criteria) this;
        }

        public Criteria andTSBetween(Date value1, Date value2) {
            addCriterion("TS between", value1, value2, "TS");
            return (Criteria) this;
        }

        public Criteria andTSNotBetween(Date value1, Date value2) {
            addCriterion("TS not between", value1, value2, "TS");
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