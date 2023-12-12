package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BpttltExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BpttltExample() {
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

        public Criteria andTLRIsNull() {
            addCriterion("TLR is null");
            return (Criteria) this;
        }

        public Criteria andTLRIsNotNull() {
            addCriterion("TLR is not null");
            return (Criteria) this;
        }

        public Criteria andTLREqualTo(String value) {
            addCriterion("TLR =", value, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRNotEqualTo(String value) {
            addCriterion("TLR <>", value, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRGreaterThan(String value) {
            addCriterion("TLR >", value, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRGreaterThanOrEqualTo(String value) {
            addCriterion("TLR >=", value, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRLessThan(String value) {
            addCriterion("TLR <", value, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRLessThanOrEqualTo(String value) {
            addCriterion("TLR <=", value, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRLike(String value) {
            addCriterion("TLR like", value, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRNotLike(String value) {
            addCriterion("TLR not like", value, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRIn(List<String> values) {
            addCriterion("TLR in", values, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRNotIn(List<String> values) {
            addCriterion("TLR not in", values, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRBetween(String value1, String value2) {
            addCriterion("TLR between", value1, value2, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLRNotBetween(String value1, String value2) {
            addCriterion("TLR not between", value1, value2, "TLR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRIsNull() {
            addCriterion("TLR_BR is null");
            return (Criteria) this;
        }

        public Criteria andTLR_BRIsNotNull() {
            addCriterion("TLR_BR is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_BREqualTo(Integer value) {
            addCriterion("TLR_BR =", value, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRNotEqualTo(Integer value) {
            addCriterion("TLR_BR <>", value, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRGreaterThan(Integer value) {
            addCriterion("TLR_BR >", value, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRGreaterThanOrEqualTo(Integer value) {
            addCriterion("TLR_BR >=", value, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRLessThan(Integer value) {
            addCriterion("TLR_BR <", value, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRLessThanOrEqualTo(Integer value) {
            addCriterion("TLR_BR <=", value, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRIn(List<Integer> values) {
            addCriterion("TLR_BR in", values, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRNotIn(List<Integer> values) {
            addCriterion("TLR_BR not in", values, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRBetween(Integer value1, Integer value2) {
            addCriterion("TLR_BR between", value1, value2, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_BRNotBetween(Integer value1, Integer value2) {
            addCriterion("TLR_BR not between", value1, value2, "TLR_BR");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSIsNull() {
            addCriterion("TLR_TKS is null");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSIsNotNull() {
            addCriterion("TLR_TKS is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSEqualTo(Short value) {
            addCriterion("TLR_TKS =", value, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSNotEqualTo(Short value) {
            addCriterion("TLR_TKS <>", value, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSGreaterThan(Short value) {
            addCriterion("TLR_TKS >", value, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSGreaterThanOrEqualTo(Short value) {
            addCriterion("TLR_TKS >=", value, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSLessThan(Short value) {
            addCriterion("TLR_TKS <", value, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSLessThanOrEqualTo(Short value) {
            addCriterion("TLR_TKS <=", value, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSIn(List<Short> values) {
            addCriterion("TLR_TKS in", values, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSNotIn(List<Short> values) {
            addCriterion("TLR_TKS not in", values, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSBetween(Short value1, Short value2) {
            addCriterion("TLR_TKS between", value1, value2, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andTLR_TKSNotBetween(Short value1, Short value2) {
            addCriterion("TLR_TKS not between", value1, value2, "TLR_TKS");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOIsNull() {
            addCriterion("STAF_NO is null");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOIsNotNull() {
            addCriterion("STAF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOEqualTo(String value) {
            addCriterion("STAF_NO =", value, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NONotEqualTo(String value) {
            addCriterion("STAF_NO <>", value, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOGreaterThan(String value) {
            addCriterion("STAF_NO >", value, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOGreaterThanOrEqualTo(String value) {
            addCriterion("STAF_NO >=", value, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOLessThan(String value) {
            addCriterion("STAF_NO <", value, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOLessThanOrEqualTo(String value) {
            addCriterion("STAF_NO <=", value, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOLike(String value) {
            addCriterion("STAF_NO like", value, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NONotLike(String value) {
            addCriterion("STAF_NO not like", value, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOIn(List<String> values) {
            addCriterion("STAF_NO in", values, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NONotIn(List<String> values) {
            addCriterion("STAF_NO not in", values, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NOBetween(String value1, String value2) {
            addCriterion("STAF_NO between", value1, value2, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAF_NONotBetween(String value1, String value2) {
            addCriterion("STAF_NO not between", value1, value2, "STAF_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMIsNull() {
            addCriterion("TLR_CN_NM is null");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMIsNotNull() {
            addCriterion("TLR_CN_NM is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMEqualTo(String value) {
            addCriterion("TLR_CN_NM =", value, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMNotEqualTo(String value) {
            addCriterion("TLR_CN_NM <>", value, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMGreaterThan(String value) {
            addCriterion("TLR_CN_NM >", value, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_CN_NM >=", value, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMLessThan(String value) {
            addCriterion("TLR_CN_NM <", value, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMLessThanOrEqualTo(String value) {
            addCriterion("TLR_CN_NM <=", value, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMLike(String value) {
            addCriterion("TLR_CN_NM like", value, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMNotLike(String value) {
            addCriterion("TLR_CN_NM not like", value, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMIn(List<String> values) {
            addCriterion("TLR_CN_NM in", values, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMNotIn(List<String> values) {
            addCriterion("TLR_CN_NM not in", values, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMBetween(String value1, String value2) {
            addCriterion("TLR_CN_NM between", value1, value2, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_CN_NMNotBetween(String value1, String value2) {
            addCriterion("TLR_CN_NM not between", value1, value2, "TLR_CN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMIsNull() {
            addCriterion("TLR_EN_NM is null");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMIsNotNull() {
            addCriterion("TLR_EN_NM is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMEqualTo(String value) {
            addCriterion("TLR_EN_NM =", value, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMNotEqualTo(String value) {
            addCriterion("TLR_EN_NM <>", value, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMGreaterThan(String value) {
            addCriterion("TLR_EN_NM >", value, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_EN_NM >=", value, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMLessThan(String value) {
            addCriterion("TLR_EN_NM <", value, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMLessThanOrEqualTo(String value) {
            addCriterion("TLR_EN_NM <=", value, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMLike(String value) {
            addCriterion("TLR_EN_NM like", value, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMNotLike(String value) {
            addCriterion("TLR_EN_NM not like", value, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMIn(List<String> values) {
            addCriterion("TLR_EN_NM in", values, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMNotIn(List<String> values) {
            addCriterion("TLR_EN_NM not in", values, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMBetween(String value1, String value2) {
            addCriterion("TLR_EN_NM between", value1, value2, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andTLR_EN_NMNotBetween(String value1, String value2) {
            addCriterion("TLR_EN_NM not between", value1, value2, "TLR_EN_NM");
            return (Criteria) this;
        }

        public Criteria andEFF_DTIsNull() {
            addCriterion("EFF_DT is null");
            return (Criteria) this;
        }

        public Criteria andEFF_DTIsNotNull() {
            addCriterion("EFF_DT is not null");
            return (Criteria) this;
        }

        public Criteria andEFF_DTEqualTo(Integer value) {
            addCriterion("EFF_DT =", value, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTNotEqualTo(Integer value) {
            addCriterion("EFF_DT <>", value, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTGreaterThan(Integer value) {
            addCriterion("EFF_DT >", value, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTGreaterThanOrEqualTo(Integer value) {
            addCriterion("EFF_DT >=", value, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTLessThan(Integer value) {
            addCriterion("EFF_DT <", value, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTLessThanOrEqualTo(Integer value) {
            addCriterion("EFF_DT <=", value, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTIn(List<Integer> values) {
            addCriterion("EFF_DT in", values, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTNotIn(List<Integer> values) {
            addCriterion("EFF_DT not in", values, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTBetween(Integer value1, Integer value2) {
            addCriterion("EFF_DT between", value1, value2, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEFF_DTNotBetween(Integer value1, Integer value2) {
            addCriterion("EFF_DT not between", value1, value2, "EFF_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTIsNull() {
            addCriterion("EXP_DT is null");
            return (Criteria) this;
        }

        public Criteria andEXP_DTIsNotNull() {
            addCriterion("EXP_DT is not null");
            return (Criteria) this;
        }

        public Criteria andEXP_DTEqualTo(Integer value) {
            addCriterion("EXP_DT =", value, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTNotEqualTo(Integer value) {
            addCriterion("EXP_DT <>", value, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTGreaterThan(Integer value) {
            addCriterion("EXP_DT >", value, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXP_DT >=", value, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTLessThan(Integer value) {
            addCriterion("EXP_DT <", value, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTLessThanOrEqualTo(Integer value) {
            addCriterion("EXP_DT <=", value, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTIn(List<Integer> values) {
            addCriterion("EXP_DT in", values, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTNotIn(List<Integer> values) {
            addCriterion("EXP_DT not in", values, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTBetween(Integer value1, Integer value2) {
            addCriterion("EXP_DT between", value1, value2, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andEXP_DTNotBetween(Integer value1, Integer value2) {
            addCriterion("EXP_DT not between", value1, value2, "EXP_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTIsNull() {
            addCriterion("UPD_DT is null");
            return (Criteria) this;
        }

        public Criteria andUPD_DTIsNotNull() {
            addCriterion("UPD_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUPD_DTEqualTo(Integer value) {
            addCriterion("UPD_DT =", value, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTNotEqualTo(Integer value) {
            addCriterion("UPD_DT <>", value, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTGreaterThan(Integer value) {
            addCriterion("UPD_DT >", value, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPD_DT >=", value, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTLessThan(Integer value) {
            addCriterion("UPD_DT <", value, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTLessThanOrEqualTo(Integer value) {
            addCriterion("UPD_DT <=", value, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTIn(List<Integer> values) {
            addCriterion("UPD_DT in", values, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTNotIn(List<Integer> values) {
            addCriterion("UPD_DT not in", values, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTBetween(Integer value1, Integer value2) {
            addCriterion("UPD_DT between", value1, value2, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_DTNotBetween(Integer value1, Integer value2) {
            addCriterion("UPD_DT not between", value1, value2, "UPD_DT");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRIsNull() {
            addCriterion("UPD_TLR is null");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRIsNotNull() {
            addCriterion("UPD_TLR is not null");
            return (Criteria) this;
        }

        public Criteria andUPD_TLREqualTo(String value) {
            addCriterion("UPD_TLR =", value, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRNotEqualTo(String value) {
            addCriterion("UPD_TLR <>", value, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRGreaterThan(String value) {
            addCriterion("UPD_TLR >", value, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_TLR >=", value, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRLessThan(String value) {
            addCriterion("UPD_TLR <", value, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRLessThanOrEqualTo(String value) {
            addCriterion("UPD_TLR <=", value, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRLike(String value) {
            addCriterion("UPD_TLR like", value, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRNotLike(String value) {
            addCriterion("UPD_TLR not like", value, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRIn(List<String> values) {
            addCriterion("UPD_TLR in", values, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRNotIn(List<String> values) {
            addCriterion("UPD_TLR not in", values, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRBetween(String value1, String value2) {
            addCriterion("UPD_TLR between", value1, value2, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andUPD_TLRNotBetween(String value1, String value2) {
            addCriterion("UPD_TLR not between", value1, value2, "UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPIsNull() {
            addCriterion("TLR_TYP is null");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPIsNotNull() {
            addCriterion("TLR_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPEqualTo(String value) {
            addCriterion("TLR_TYP =", value, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPNotEqualTo(String value) {
            addCriterion("TLR_TYP <>", value, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPGreaterThan(String value) {
            addCriterion("TLR_TYP >", value, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_TYP >=", value, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPLessThan(String value) {
            addCriterion("TLR_TYP <", value, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPLessThanOrEqualTo(String value) {
            addCriterion("TLR_TYP <=", value, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPLike(String value) {
            addCriterion("TLR_TYP like", value, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPNotLike(String value) {
            addCriterion("TLR_TYP not like", value, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPIn(List<String> values) {
            addCriterion("TLR_TYP in", values, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPNotIn(List<String> values) {
            addCriterion("TLR_TYP not in", values, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPBetween(String value1, String value2) {
            addCriterion("TLR_TYP between", value1, value2, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_TYPNotBetween(String value1, String value2) {
            addCriterion("TLR_TYP not between", value1, value2, "TLR_TYP");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLIsNull() {
            addCriterion("TLR_LVL is null");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLIsNotNull() {
            addCriterion("TLR_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLEqualTo(String value) {
            addCriterion("TLR_LVL =", value, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLNotEqualTo(String value) {
            addCriterion("TLR_LVL <>", value, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLGreaterThan(String value) {
            addCriterion("TLR_LVL >", value, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_LVL >=", value, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLLessThan(String value) {
            addCriterion("TLR_LVL <", value, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLLessThanOrEqualTo(String value) {
            addCriterion("TLR_LVL <=", value, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLLike(String value) {
            addCriterion("TLR_LVL like", value, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLNotLike(String value) {
            addCriterion("TLR_LVL not like", value, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLIn(List<String> values) {
            addCriterion("TLR_LVL in", values, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLNotIn(List<String> values) {
            addCriterion("TLR_LVL not in", values, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLBetween(String value1, String value2) {
            addCriterion("TLR_LVL between", value1, value2, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTLR_LVLNotBetween(String value1, String value2) {
            addCriterion("TLR_LVL not between", value1, value2, "TLR_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLIsNull() {
            addCriterion("TX_LVL is null");
            return (Criteria) this;
        }

        public Criteria andTX_LVLIsNotNull() {
            addCriterion("TX_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andTX_LVLEqualTo(String value) {
            addCriterion("TX_LVL =", value, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLNotEqualTo(String value) {
            addCriterion("TX_LVL <>", value, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLGreaterThan(String value) {
            addCriterion("TX_LVL >", value, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLGreaterThanOrEqualTo(String value) {
            addCriterion("TX_LVL >=", value, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLLessThan(String value) {
            addCriterion("TX_LVL <", value, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLLessThanOrEqualTo(String value) {
            addCriterion("TX_LVL <=", value, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLLike(String value) {
            addCriterion("TX_LVL like", value, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLNotLike(String value) {
            addCriterion("TX_LVL not like", value, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLIn(List<String> values) {
            addCriterion("TX_LVL in", values, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLNotIn(List<String> values) {
            addCriterion("TX_LVL not in", values, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLBetween(String value1, String value2) {
            addCriterion("TX_LVL between", value1, value2, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_LVLNotBetween(String value1, String value2) {
            addCriterion("TX_LVL not between", value1, value2, "TX_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLIsNull() {
            addCriterion("ATH_LVL is null");
            return (Criteria) this;
        }

        public Criteria andATH_LVLIsNotNull() {
            addCriterion("ATH_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andATH_LVLEqualTo(String value) {
            addCriterion("ATH_LVL =", value, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLNotEqualTo(String value) {
            addCriterion("ATH_LVL <>", value, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLGreaterThan(String value) {
            addCriterion("ATH_LVL >", value, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLGreaterThanOrEqualTo(String value) {
            addCriterion("ATH_LVL >=", value, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLLessThan(String value) {
            addCriterion("ATH_LVL <", value, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLLessThanOrEqualTo(String value) {
            addCriterion("ATH_LVL <=", value, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLLike(String value) {
            addCriterion("ATH_LVL like", value, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLNotLike(String value) {
            addCriterion("ATH_LVL not like", value, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLIn(List<String> values) {
            addCriterion("ATH_LVL in", values, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLNotIn(List<String> values) {
            addCriterion("ATH_LVL not in", values, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLBetween(String value1, String value2) {
            addCriterion("ATH_LVL between", value1, value2, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_LVLNotBetween(String value1, String value2) {
            addCriterion("ATH_LVL not between", value1, value2, "ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andATH_RGNIsNull() {
            addCriterion("ATH_RGN is null");
            return (Criteria) this;
        }

        public Criteria andATH_RGNIsNotNull() {
            addCriterion("ATH_RGN is not null");
            return (Criteria) this;
        }

        public Criteria andATH_RGNEqualTo(String value) {
            addCriterion("ATH_RGN =", value, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNNotEqualTo(String value) {
            addCriterion("ATH_RGN <>", value, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNGreaterThan(String value) {
            addCriterion("ATH_RGN >", value, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNGreaterThanOrEqualTo(String value) {
            addCriterion("ATH_RGN >=", value, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNLessThan(String value) {
            addCriterion("ATH_RGN <", value, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNLessThanOrEqualTo(String value) {
            addCriterion("ATH_RGN <=", value, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNLike(String value) {
            addCriterion("ATH_RGN like", value, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNNotLike(String value) {
            addCriterion("ATH_RGN not like", value, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNIn(List<String> values) {
            addCriterion("ATH_RGN in", values, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNNotIn(List<String> values) {
            addCriterion("ATH_RGN not in", values, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNBetween(String value1, String value2) {
            addCriterion("ATH_RGN between", value1, value2, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andATH_RGNNotBetween(String value1, String value2) {
            addCriterion("ATH_RGN not between", value1, value2, "ATH_RGN");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLIsNull() {
            addCriterion("TMP_TX_LVL is null");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLIsNotNull() {
            addCriterion("TMP_TX_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLEqualTo(String value) {
            addCriterion("TMP_TX_LVL =", value, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLNotEqualTo(String value) {
            addCriterion("TMP_TX_LVL <>", value, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLGreaterThan(String value) {
            addCriterion("TMP_TX_LVL >", value, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLGreaterThanOrEqualTo(String value) {
            addCriterion("TMP_TX_LVL >=", value, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLLessThan(String value) {
            addCriterion("TMP_TX_LVL <", value, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLLessThanOrEqualTo(String value) {
            addCriterion("TMP_TX_LVL <=", value, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLLike(String value) {
            addCriterion("TMP_TX_LVL like", value, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLNotLike(String value) {
            addCriterion("TMP_TX_LVL not like", value, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLIn(List<String> values) {
            addCriterion("TMP_TX_LVL in", values, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLNotIn(List<String> values) {
            addCriterion("TMP_TX_LVL not in", values, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLBetween(String value1, String value2) {
            addCriterion("TMP_TX_LVL between", value1, value2, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_TX_LVLNotBetween(String value1, String value2) {
            addCriterion("TMP_TX_LVL not between", value1, value2, "TMP_TX_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLIsNull() {
            addCriterion("TMP_ATH_LVL is null");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLIsNotNull() {
            addCriterion("TMP_ATH_LVL is not null");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLEqualTo(String value) {
            addCriterion("TMP_ATH_LVL =", value, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLNotEqualTo(String value) {
            addCriterion("TMP_ATH_LVL <>", value, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLGreaterThan(String value) {
            addCriterion("TMP_ATH_LVL >", value, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLGreaterThanOrEqualTo(String value) {
            addCriterion("TMP_ATH_LVL >=", value, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLLessThan(String value) {
            addCriterion("TMP_ATH_LVL <", value, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLLessThanOrEqualTo(String value) {
            addCriterion("TMP_ATH_LVL <=", value, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLLike(String value) {
            addCriterion("TMP_ATH_LVL like", value, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLNotLike(String value) {
            addCriterion("TMP_ATH_LVL not like", value, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLIn(List<String> values) {
            addCriterion("TMP_ATH_LVL in", values, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLNotIn(List<String> values) {
            addCriterion("TMP_ATH_LVL not in", values, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLBetween(String value1, String value2) {
            addCriterion("TMP_ATH_LVL between", value1, value2, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTMP_ATH_LVLNotBetween(String value1, String value2) {
            addCriterion("TMP_ATH_LVL not between", value1, value2, "TMP_ATH_LVL");
            return (Criteria) this;
        }

        public Criteria andTX_MODEIsNull() {
            addCriterion("TX_MODE is null");
            return (Criteria) this;
        }

        public Criteria andTX_MODEIsNotNull() {
            addCriterion("TX_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andTX_MODEEqualTo(String value) {
            addCriterion("TX_MODE =", value, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODENotEqualTo(String value) {
            addCriterion("TX_MODE <>", value, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODEGreaterThan(String value) {
            addCriterion("TX_MODE >", value, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODEGreaterThanOrEqualTo(String value) {
            addCriterion("TX_MODE >=", value, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODELessThan(String value) {
            addCriterion("TX_MODE <", value, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODELessThanOrEqualTo(String value) {
            addCriterion("TX_MODE <=", value, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODELike(String value) {
            addCriterion("TX_MODE like", value, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODENotLike(String value) {
            addCriterion("TX_MODE not like", value, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODEIn(List<String> values) {
            addCriterion("TX_MODE in", values, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODENotIn(List<String> values) {
            addCriterion("TX_MODE not in", values, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODEBetween(String value1, String value2) {
            addCriterion("TX_MODE between", value1, value2, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andTX_MODENotBetween(String value1, String value2) {
            addCriterion("TX_MODE not between", value1, value2, "TX_MODE");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSIsNull() {
            addCriterion("SIGN_STS is null");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSIsNotNull() {
            addCriterion("SIGN_STS is not null");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSEqualTo(String value) {
            addCriterion("SIGN_STS =", value, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSNotEqualTo(String value) {
            addCriterion("SIGN_STS <>", value, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSGreaterThan(String value) {
            addCriterion("SIGN_STS >", value, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_STS >=", value, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSLessThan(String value) {
            addCriterion("SIGN_STS <", value, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSLessThanOrEqualTo(String value) {
            addCriterion("SIGN_STS <=", value, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSLike(String value) {
            addCriterion("SIGN_STS like", value, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSNotLike(String value) {
            addCriterion("SIGN_STS not like", value, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSIn(List<String> values) {
            addCriterion("SIGN_STS in", values, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSNotIn(List<String> values) {
            addCriterion("SIGN_STS not in", values, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSBetween(String value1, String value2) {
            addCriterion("SIGN_STS between", value1, value2, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_STSNotBetween(String value1, String value2) {
            addCriterion("SIGN_STS not between", value1, value2, "SIGN_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSIsNull() {
            addCriterion("TLR_STS is null");
            return (Criteria) this;
        }

        public Criteria andTLR_STSIsNotNull() {
            addCriterion("TLR_STS is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_STSEqualTo(String value) {
            addCriterion("TLR_STS =", value, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSNotEqualTo(String value) {
            addCriterion("TLR_STS <>", value, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSGreaterThan(String value) {
            addCriterion("TLR_STS >", value, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_STS >=", value, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSLessThan(String value) {
            addCriterion("TLR_STS <", value, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSLessThanOrEqualTo(String value) {
            addCriterion("TLR_STS <=", value, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSLike(String value) {
            addCriterion("TLR_STS like", value, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSNotLike(String value) {
            addCriterion("TLR_STS not like", value, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSIn(List<String> values) {
            addCriterion("TLR_STS in", values, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSNotIn(List<String> values) {
            addCriterion("TLR_STS not in", values, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSBetween(String value1, String value2) {
            addCriterion("TLR_STS between", value1, value2, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andTLR_STSNotBetween(String value1, String value2) {
            addCriterion("TLR_STS not between", value1, value2, "TLR_STS");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTIsNull() {
            addCriterion("SIGN_DT is null");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTIsNotNull() {
            addCriterion("SIGN_DT is not null");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTEqualTo(Integer value) {
            addCriterion("SIGN_DT =", value, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTNotEqualTo(Integer value) {
            addCriterion("SIGN_DT <>", value, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTGreaterThan(Integer value) {
            addCriterion("SIGN_DT >", value, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_DT >=", value, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTLessThan(Integer value) {
            addCriterion("SIGN_DT <", value, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_DT <=", value, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTIn(List<Integer> values) {
            addCriterion("SIGN_DT in", values, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTNotIn(List<Integer> values) {
            addCriterion("SIGN_DT not in", values, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_DT between", value1, value2, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andSIGN_DTNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_DT not between", value1, value2, "SIGN_DT");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNIsNull() {
            addCriterion("CRO_BR_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNIsNotNull() {
            addCriterion("CRO_BR_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNEqualTo(String value) {
            addCriterion("CRO_BR_SIGN =", value, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNNotEqualTo(String value) {
            addCriterion("CRO_BR_SIGN <>", value, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNGreaterThan(String value) {
            addCriterion("CRO_BR_SIGN >", value, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNGreaterThanOrEqualTo(String value) {
            addCriterion("CRO_BR_SIGN >=", value, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNLessThan(String value) {
            addCriterion("CRO_BR_SIGN <", value, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNLessThanOrEqualTo(String value) {
            addCriterion("CRO_BR_SIGN <=", value, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNLike(String value) {
            addCriterion("CRO_BR_SIGN like", value, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNNotLike(String value) {
            addCriterion("CRO_BR_SIGN not like", value, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNIn(List<String> values) {
            addCriterion("CRO_BR_SIGN in", values, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNNotIn(List<String> values) {
            addCriterion("CRO_BR_SIGN not in", values, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNBetween(String value1, String value2) {
            addCriterion("CRO_BR_SIGN between", value1, value2, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andCRO_BR_SIGNNotBetween(String value1, String value2) {
            addCriterion("CRO_BR_SIGN not between", value1, value2, "CRO_BR_SIGN");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESIsNull() {
            addCriterion("SIGN_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESIsNotNull() {
            addCriterion("SIGN_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESEqualTo(Integer value) {
            addCriterion("SIGN_TIMES =", value, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESNotEqualTo(Integer value) {
            addCriterion("SIGN_TIMES <>", value, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESGreaterThan(Integer value) {
            addCriterion("SIGN_TIMES >", value, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGN_TIMES >=", value, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESLessThan(Integer value) {
            addCriterion("SIGN_TIMES <", value, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESLessThanOrEqualTo(Integer value) {
            addCriterion("SIGN_TIMES <=", value, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESIn(List<Integer> values) {
            addCriterion("SIGN_TIMES in", values, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESNotIn(List<Integer> values) {
            addCriterion("SIGN_TIMES not in", values, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_TIMES between", value1, value2, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andSIGN_TIMESNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGN_TIMES not between", value1, value2, "SIGN_TIMES");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYIsNull() {
            addCriterion("PSW_RETRY is null");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYIsNotNull() {
            addCriterion("PSW_RETRY is not null");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYEqualTo(Integer value) {
            addCriterion("PSW_RETRY =", value, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYNotEqualTo(Integer value) {
            addCriterion("PSW_RETRY <>", value, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYGreaterThan(Integer value) {
            addCriterion("PSW_RETRY >", value, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYGreaterThanOrEqualTo(Integer value) {
            addCriterion("PSW_RETRY >=", value, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYLessThan(Integer value) {
            addCriterion("PSW_RETRY <", value, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYLessThanOrEqualTo(Integer value) {
            addCriterion("PSW_RETRY <=", value, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYIn(List<Integer> values) {
            addCriterion("PSW_RETRY in", values, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYNotIn(List<Integer> values) {
            addCriterion("PSW_RETRY not in", values, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYBetween(Integer value1, Integer value2) {
            addCriterion("PSW_RETRY between", value1, value2, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andPSW_RETRYNotBetween(Integer value1, Integer value2) {
            addCriterion("PSW_RETRY not between", value1, value2, "PSW_RETRY");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPIsNull() {
            addCriterion("TRM_TYP is null");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPIsNotNull() {
            addCriterion("TRM_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPEqualTo(String value) {
            addCriterion("TRM_TYP =", value, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPNotEqualTo(String value) {
            addCriterion("TRM_TYP <>", value, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPGreaterThan(String value) {
            addCriterion("TRM_TYP >", value, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPGreaterThanOrEqualTo(String value) {
            addCriterion("TRM_TYP >=", value, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPLessThan(String value) {
            addCriterion("TRM_TYP <", value, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPLessThanOrEqualTo(String value) {
            addCriterion("TRM_TYP <=", value, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPLike(String value) {
            addCriterion("TRM_TYP like", value, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPNotLike(String value) {
            addCriterion("TRM_TYP not like", value, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPIn(List<String> values) {
            addCriterion("TRM_TYP in", values, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPNotIn(List<String> values) {
            addCriterion("TRM_TYP not in", values, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPBetween(String value1, String value2) {
            addCriterion("TRM_TYP between", value1, value2, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andTRM_TYPNotBetween(String value1, String value2) {
            addCriterion("TRM_TYP not between", value1, value2, "TRM_TYP");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMIsNull() {
            addCriterion("SIGN_TRM is null");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMIsNotNull() {
            addCriterion("SIGN_TRM is not null");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMEqualTo(String value) {
            addCriterion("SIGN_TRM =", value, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMNotEqualTo(String value) {
            addCriterion("SIGN_TRM <>", value, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMGreaterThan(String value) {
            addCriterion("SIGN_TRM >", value, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_TRM >=", value, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMLessThan(String value) {
            addCriterion("SIGN_TRM <", value, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMLessThanOrEqualTo(String value) {
            addCriterion("SIGN_TRM <=", value, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMLike(String value) {
            addCriterion("SIGN_TRM like", value, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMNotLike(String value) {
            addCriterion("SIGN_TRM not like", value, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMIn(List<String> values) {
            addCriterion("SIGN_TRM in", values, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMNotIn(List<String> values) {
            addCriterion("SIGN_TRM not in", values, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMBetween(String value1, String value2) {
            addCriterion("SIGN_TRM between", value1, value2, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRMNotBetween(String value1, String value2) {
            addCriterion("SIGN_TRM not between", value1, value2, "SIGN_TRM");
            return (Criteria) this;
        }

        public Criteria andPRT_IPIsNull() {
            addCriterion("PRT_IP is null");
            return (Criteria) this;
        }

        public Criteria andPRT_IPIsNotNull() {
            addCriterion("PRT_IP is not null");
            return (Criteria) this;
        }

        public Criteria andPRT_IPEqualTo(String value) {
            addCriterion("PRT_IP =", value, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPNotEqualTo(String value) {
            addCriterion("PRT_IP <>", value, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPGreaterThan(String value) {
            addCriterion("PRT_IP >", value, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPGreaterThanOrEqualTo(String value) {
            addCriterion("PRT_IP >=", value, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPLessThan(String value) {
            addCriterion("PRT_IP <", value, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPLessThanOrEqualTo(String value) {
            addCriterion("PRT_IP <=", value, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPLike(String value) {
            addCriterion("PRT_IP like", value, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPNotLike(String value) {
            addCriterion("PRT_IP not like", value, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPIn(List<String> values) {
            addCriterion("PRT_IP in", values, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPNotIn(List<String> values) {
            addCriterion("PRT_IP not in", values, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPBetween(String value1, String value2) {
            addCriterion("PRT_IP between", value1, value2, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andPRT_IPNotBetween(String value1, String value2) {
            addCriterion("PRT_IP not between", value1, value2, "PRT_IP");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWIsNull() {
            addCriterion("TLR_STSW is null");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWIsNotNull() {
            addCriterion("TLR_STSW is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWEqualTo(String value) {
            addCriterion("TLR_STSW =", value, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWNotEqualTo(String value) {
            addCriterion("TLR_STSW <>", value, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWGreaterThan(String value) {
            addCriterion("TLR_STSW >", value, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_STSW >=", value, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWLessThan(String value) {
            addCriterion("TLR_STSW <", value, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWLessThanOrEqualTo(String value) {
            addCriterion("TLR_STSW <=", value, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWLike(String value) {
            addCriterion("TLR_STSW like", value, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWNotLike(String value) {
            addCriterion("TLR_STSW not like", value, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWIn(List<String> values) {
            addCriterion("TLR_STSW in", values, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWNotIn(List<String> values) {
            addCriterion("TLR_STSW not in", values, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWBetween(String value1, String value2) {
            addCriterion("TLR_STSW between", value1, value2, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andTLR_STSWNotBetween(String value1, String value2) {
            addCriterion("TLR_STSW not between", value1, value2, "TLR_STSW");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNIsNull() {
            addCriterion("LAST_JRN is null");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNIsNotNull() {
            addCriterion("LAST_JRN is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNEqualTo(Long value) {
            addCriterion("LAST_JRN =", value, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNNotEqualTo(Long value) {
            addCriterion("LAST_JRN <>", value, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNGreaterThan(Long value) {
            addCriterion("LAST_JRN >", value, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_JRN >=", value, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNLessThan(Long value) {
            addCriterion("LAST_JRN <", value, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNLessThanOrEqualTo(Long value) {
            addCriterion("LAST_JRN <=", value, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNIn(List<Long> values) {
            addCriterion("LAST_JRN in", values, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNNotIn(List<Long> values) {
            addCriterion("LAST_JRN not in", values, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNBetween(Long value1, Long value2) {
            addCriterion("LAST_JRN between", value1, value2, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andLAST_JRNNotBetween(Long value1, Long value2) {
            addCriterion("LAST_JRN not between", value1, value2, "LAST_JRN");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOIsNull() {
            addCriterion("ACC_VCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOIsNotNull() {
            addCriterion("ACC_VCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOEqualTo(String value) {
            addCriterion("ACC_VCH_NO =", value, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NONotEqualTo(String value) {
            addCriterion("ACC_VCH_NO <>", value, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOGreaterThan(String value) {
            addCriterion("ACC_VCH_NO >", value, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_VCH_NO >=", value, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOLessThan(String value) {
            addCriterion("ACC_VCH_NO <", value, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOLessThanOrEqualTo(String value) {
            addCriterion("ACC_VCH_NO <=", value, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOLike(String value) {
            addCriterion("ACC_VCH_NO like", value, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NONotLike(String value) {
            addCriterion("ACC_VCH_NO not like", value, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOIn(List<String> values) {
            addCriterion("ACC_VCH_NO in", values, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NONotIn(List<String> values) {
            addCriterion("ACC_VCH_NO not in", values, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NOBetween(String value1, String value2) {
            addCriterion("ACC_VCH_NO between", value1, value2, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andACC_VCH_NONotBetween(String value1, String value2) {
            addCriterion("ACC_VCH_NO not between", value1, value2, "ACC_VCH_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOIsNull() {
            addCriterion("TLR_CRD_NO is null");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOIsNotNull() {
            addCriterion("TLR_CRD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOEqualTo(String value) {
            addCriterion("TLR_CRD_NO =", value, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NONotEqualTo(String value) {
            addCriterion("TLR_CRD_NO <>", value, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOGreaterThan(String value) {
            addCriterion("TLR_CRD_NO >", value, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_CRD_NO >=", value, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOLessThan(String value) {
            addCriterion("TLR_CRD_NO <", value, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOLessThanOrEqualTo(String value) {
            addCriterion("TLR_CRD_NO <=", value, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOLike(String value) {
            addCriterion("TLR_CRD_NO like", value, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NONotLike(String value) {
            addCriterion("TLR_CRD_NO not like", value, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOIn(List<String> values) {
            addCriterion("TLR_CRD_NO in", values, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NONotIn(List<String> values) {
            addCriterion("TLR_CRD_NO not in", values, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NOBetween(String value1, String value2) {
            addCriterion("TLR_CRD_NO between", value1, value2, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andTLR_CRD_NONotBetween(String value1, String value2) {
            addCriterion("TLR_CRD_NO not between", value1, value2, "TLR_CRD_NO");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTIsNull() {
            addCriterion("CRD_PSW_DT is null");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTIsNotNull() {
            addCriterion("CRD_PSW_DT is not null");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTEqualTo(Integer value) {
            addCriterion("CRD_PSW_DT =", value, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTNotEqualTo(Integer value) {
            addCriterion("CRD_PSW_DT <>", value, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTGreaterThan(Integer value) {
            addCriterion("CRD_PSW_DT >", value, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTGreaterThanOrEqualTo(Integer value) {
            addCriterion("CRD_PSW_DT >=", value, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTLessThan(Integer value) {
            addCriterion("CRD_PSW_DT <", value, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTLessThanOrEqualTo(Integer value) {
            addCriterion("CRD_PSW_DT <=", value, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTIn(List<Integer> values) {
            addCriterion("CRD_PSW_DT in", values, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTNotIn(List<Integer> values) {
            addCriterion("CRD_PSW_DT not in", values, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTBetween(Integer value1, Integer value2) {
            addCriterion("CRD_PSW_DT between", value1, value2, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andCRD_PSW_DTNotBetween(Integer value1, Integer value2) {
            addCriterion("CRD_PSW_DT not between", value1, value2, "CRD_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTIsNull() {
            addCriterion("KB_PSW_DT is null");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTIsNotNull() {
            addCriterion("KB_PSW_DT is not null");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTEqualTo(Integer value) {
            addCriterion("KB_PSW_DT =", value, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTNotEqualTo(Integer value) {
            addCriterion("KB_PSW_DT <>", value, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTGreaterThan(Integer value) {
            addCriterion("KB_PSW_DT >", value, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTGreaterThanOrEqualTo(Integer value) {
            addCriterion("KB_PSW_DT >=", value, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTLessThan(Integer value) {
            addCriterion("KB_PSW_DT <", value, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTLessThanOrEqualTo(Integer value) {
            addCriterion("KB_PSW_DT <=", value, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTIn(List<Integer> values) {
            addCriterion("KB_PSW_DT in", values, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTNotIn(List<Integer> values) {
            addCriterion("KB_PSW_DT not in", values, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTBetween(Integer value1, Integer value2) {
            addCriterion("KB_PSW_DT between", value1, value2, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andKB_PSW_DTNotBetween(Integer value1, Integer value2) {
            addCriterion("KB_PSW_DT not between", value1, value2, "KB_PSW_DT");
            return (Criteria) this;
        }

        public Criteria andTELEIsNull() {
            addCriterion("TELE is null");
            return (Criteria) this;
        }

        public Criteria andTELEIsNotNull() {
            addCriterion("TELE is not null");
            return (Criteria) this;
        }

        public Criteria andTELEEqualTo(String value) {
            addCriterion("TELE =", value, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELENotEqualTo(String value) {
            addCriterion("TELE <>", value, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELEGreaterThan(String value) {
            addCriterion("TELE >", value, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELEGreaterThanOrEqualTo(String value) {
            addCriterion("TELE >=", value, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELELessThan(String value) {
            addCriterion("TELE <", value, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELELessThanOrEqualTo(String value) {
            addCriterion("TELE <=", value, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELELike(String value) {
            addCriterion("TELE like", value, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELENotLike(String value) {
            addCriterion("TELE not like", value, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELEIn(List<String> values) {
            addCriterion("TELE in", values, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELENotIn(List<String> values) {
            addCriterion("TELE not in", values, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELEBetween(String value1, String value2) {
            addCriterion("TELE between", value1, value2, "TELE");
            return (Criteria) this;
        }

        public Criteria andTELENotBetween(String value1, String value2) {
            addCriterion("TELE not between", value1, value2, "TELE");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSIsNull() {
            addCriterion("PST_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSIsNotNull() {
            addCriterion("PST_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSEqualTo(String value) {
            addCriterion("PST_ADDRESS =", value, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSNotEqualTo(String value) {
            addCriterion("PST_ADDRESS <>", value, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSGreaterThan(String value) {
            addCriterion("PST_ADDRESS >", value, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSGreaterThanOrEqualTo(String value) {
            addCriterion("PST_ADDRESS >=", value, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSLessThan(String value) {
            addCriterion("PST_ADDRESS <", value, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSLessThanOrEqualTo(String value) {
            addCriterion("PST_ADDRESS <=", value, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSLike(String value) {
            addCriterion("PST_ADDRESS like", value, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSNotLike(String value) {
            addCriterion("PST_ADDRESS not like", value, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSIn(List<String> values) {
            addCriterion("PST_ADDRESS in", values, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSNotIn(List<String> values) {
            addCriterion("PST_ADDRESS not in", values, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSBetween(String value1, String value2) {
            addCriterion("PST_ADDRESS between", value1, value2, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andPST_ADDRESSNotBetween(String value1, String value2) {
            addCriterion("PST_ADDRESS not between", value1, value2, "PST_ADDRESS");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGIsNull() {
            addCriterion("SIGN_TRM_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGIsNotNull() {
            addCriterion("SIGN_TRM_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGEqualTo(String value) {
            addCriterion("SIGN_TRM_FLG =", value, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGNotEqualTo(String value) {
            addCriterion("SIGN_TRM_FLG <>", value, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGGreaterThan(String value) {
            addCriterion("SIGN_TRM_FLG >", value, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_TRM_FLG >=", value, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGLessThan(String value) {
            addCriterion("SIGN_TRM_FLG <", value, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGLessThanOrEqualTo(String value) {
            addCriterion("SIGN_TRM_FLG <=", value, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGLike(String value) {
            addCriterion("SIGN_TRM_FLG like", value, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGNotLike(String value) {
            addCriterion("SIGN_TRM_FLG not like", value, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGIn(List<String> values) {
            addCriterion("SIGN_TRM_FLG in", values, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGNotIn(List<String> values) {
            addCriterion("SIGN_TRM_FLG not in", values, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGBetween(String value1, String value2) {
            addCriterion("SIGN_TRM_FLG between", value1, value2, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andSIGN_TRM_FLGNotBetween(String value1, String value2) {
            addCriterion("SIGN_TRM_FLG not between", value1, value2, "SIGN_TRM_FLG");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOIsNull() {
            addCriterion("TRM_INFO is null");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOIsNotNull() {
            addCriterion("TRM_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOEqualTo(String value) {
            addCriterion("TRM_INFO =", value, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFONotEqualTo(String value) {
            addCriterion("TRM_INFO <>", value, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOGreaterThan(String value) {
            addCriterion("TRM_INFO >", value, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOGreaterThanOrEqualTo(String value) {
            addCriterion("TRM_INFO >=", value, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOLessThan(String value) {
            addCriterion("TRM_INFO <", value, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOLessThanOrEqualTo(String value) {
            addCriterion("TRM_INFO <=", value, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOLike(String value) {
            addCriterion("TRM_INFO like", value, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFONotLike(String value) {
            addCriterion("TRM_INFO not like", value, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOIn(List<String> values) {
            addCriterion("TRM_INFO in", values, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFONotIn(List<String> values) {
            addCriterion("TRM_INFO not in", values, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFOBetween(String value1, String value2) {
            addCriterion("TRM_INFO between", value1, value2, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andTRM_INFONotBetween(String value1, String value2) {
            addCriterion("TRM_INFO not between", value1, value2, "TRM_INFO");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPIsNull() {
            addCriterion("PSW_TYP is null");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPIsNotNull() {
            addCriterion("PSW_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPEqualTo(String value) {
            addCriterion("PSW_TYP =", value, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPNotEqualTo(String value) {
            addCriterion("PSW_TYP <>", value, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPGreaterThan(String value) {
            addCriterion("PSW_TYP >", value, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPGreaterThanOrEqualTo(String value) {
            addCriterion("PSW_TYP >=", value, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPLessThan(String value) {
            addCriterion("PSW_TYP <", value, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPLessThanOrEqualTo(String value) {
            addCriterion("PSW_TYP <=", value, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPLike(String value) {
            addCriterion("PSW_TYP like", value, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPNotLike(String value) {
            addCriterion("PSW_TYP not like", value, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPIn(List<String> values) {
            addCriterion("PSW_TYP in", values, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPNotIn(List<String> values) {
            addCriterion("PSW_TYP not in", values, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPBetween(String value1, String value2) {
            addCriterion("PSW_TYP between", value1, value2, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andPSW_TYPNotBetween(String value1, String value2) {
            addCriterion("PSW_TYP not between", value1, value2, "PSW_TYP");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDIsNull() {
            addCriterion("IDEN_DEV_ID is null");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDIsNotNull() {
            addCriterion("IDEN_DEV_ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDEqualTo(String value) {
            addCriterion("IDEN_DEV_ID =", value, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDNotEqualTo(String value) {
            addCriterion("IDEN_DEV_ID <>", value, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDGreaterThan(String value) {
            addCriterion("IDEN_DEV_ID >", value, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDGreaterThanOrEqualTo(String value) {
            addCriterion("IDEN_DEV_ID >=", value, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDLessThan(String value) {
            addCriterion("IDEN_DEV_ID <", value, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDLessThanOrEqualTo(String value) {
            addCriterion("IDEN_DEV_ID <=", value, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDLike(String value) {
            addCriterion("IDEN_DEV_ID like", value, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDNotLike(String value) {
            addCriterion("IDEN_DEV_ID not like", value, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDIn(List<String> values) {
            addCriterion("IDEN_DEV_ID in", values, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDNotIn(List<String> values) {
            addCriterion("IDEN_DEV_ID not in", values, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDBetween(String value1, String value2) {
            addCriterion("IDEN_DEV_ID between", value1, value2, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andIDEN_DEV_IDNotBetween(String value1, String value2) {
            addCriterion("IDEN_DEV_ID not between", value1, value2, "IDEN_DEV_ID");
            return (Criteria) this;
        }

        public Criteria andNEW_BRIsNull() {
            addCriterion("NEW_BR is null");
            return (Criteria) this;
        }

        public Criteria andNEW_BRIsNotNull() {
            addCriterion("NEW_BR is not null");
            return (Criteria) this;
        }

        public Criteria andNEW_BREqualTo(Integer value) {
            addCriterion("NEW_BR =", value, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRNotEqualTo(Integer value) {
            addCriterion("NEW_BR <>", value, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRGreaterThan(Integer value) {
            addCriterion("NEW_BR >", value, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEW_BR >=", value, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRLessThan(Integer value) {
            addCriterion("NEW_BR <", value, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRLessThanOrEqualTo(Integer value) {
            addCriterion("NEW_BR <=", value, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRIn(List<Integer> values) {
            addCriterion("NEW_BR in", values, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRNotIn(List<Integer> values) {
            addCriterion("NEW_BR not in", values, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRBetween(Integer value1, Integer value2) {
            addCriterion("NEW_BR between", value1, value2, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BRNotBetween(Integer value1, Integer value2) {
            addCriterion("NEW_BR not between", value1, value2, "NEW_BR");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFIsNull() {
            addCriterion("NEW_BR_EFF is null");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFIsNotNull() {
            addCriterion("NEW_BR_EFF is not null");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFEqualTo(Integer value) {
            addCriterion("NEW_BR_EFF =", value, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFNotEqualTo(Integer value) {
            addCriterion("NEW_BR_EFF <>", value, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFGreaterThan(Integer value) {
            addCriterion("NEW_BR_EFF >", value, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEW_BR_EFF >=", value, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFLessThan(Integer value) {
            addCriterion("NEW_BR_EFF <", value, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFLessThanOrEqualTo(Integer value) {
            addCriterion("NEW_BR_EFF <=", value, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFIn(List<Integer> values) {
            addCriterion("NEW_BR_EFF in", values, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFNotIn(List<Integer> values) {
            addCriterion("NEW_BR_EFF not in", values, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFBetween(Integer value1, Integer value2) {
            addCriterion("NEW_BR_EFF between", value1, value2, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andNEW_BR_EFFNotBetween(Integer value1, Integer value2) {
            addCriterion("NEW_BR_EFF not between", value1, value2, "NEW_BR_EFF");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTIsNull() {
            addCriterion("TM_OUT_LMT is null");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTIsNotNull() {
            addCriterion("TM_OUT_LMT is not null");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTEqualTo(Integer value) {
            addCriterion("TM_OUT_LMT =", value, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTNotEqualTo(Integer value) {
            addCriterion("TM_OUT_LMT <>", value, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTGreaterThan(Integer value) {
            addCriterion("TM_OUT_LMT >", value, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTGreaterThanOrEqualTo(Integer value) {
            addCriterion("TM_OUT_LMT >=", value, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTLessThan(Integer value) {
            addCriterion("TM_OUT_LMT <", value, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTLessThanOrEqualTo(Integer value) {
            addCriterion("TM_OUT_LMT <=", value, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTIn(List<Integer> values) {
            addCriterion("TM_OUT_LMT in", values, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTNotIn(List<Integer> values) {
            addCriterion("TM_OUT_LMT not in", values, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTBetween(Integer value1, Integer value2) {
            addCriterion("TM_OUT_LMT between", value1, value2, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andTM_OUT_LMTNotBetween(Integer value1, Integer value2) {
            addCriterion("TM_OUT_LMT not between", value1, value2, "TM_OUT_LMT");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSIsNull() {
            addCriterion("ACC_SEN_CUS is null");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSIsNotNull() {
            addCriterion("ACC_SEN_CUS is not null");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSEqualTo(String value) {
            addCriterion("ACC_SEN_CUS =", value, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSNotEqualTo(String value) {
            addCriterion("ACC_SEN_CUS <>", value, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSGreaterThan(String value) {
            addCriterion("ACC_SEN_CUS >", value, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_SEN_CUS >=", value, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSLessThan(String value) {
            addCriterion("ACC_SEN_CUS <", value, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSLessThanOrEqualTo(String value) {
            addCriterion("ACC_SEN_CUS <=", value, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSLike(String value) {
            addCriterion("ACC_SEN_CUS like", value, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSNotLike(String value) {
            addCriterion("ACC_SEN_CUS not like", value, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSIn(List<String> values) {
            addCriterion("ACC_SEN_CUS in", values, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSNotIn(List<String> values) {
            addCriterion("ACC_SEN_CUS not in", values, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSBetween(String value1, String value2) {
            addCriterion("ACC_SEN_CUS between", value1, value2, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_CUSNotBetween(String value1, String value2) {
            addCriterion("ACC_SEN_CUS not between", value1, value2, "ACC_SEN_CUS");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLIsNull() {
            addCriterion("ACC_SEN_GL is null");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLIsNotNull() {
            addCriterion("ACC_SEN_GL is not null");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLEqualTo(String value) {
            addCriterion("ACC_SEN_GL =", value, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLNotEqualTo(String value) {
            addCriterion("ACC_SEN_GL <>", value, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLGreaterThan(String value) {
            addCriterion("ACC_SEN_GL >", value, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLGreaterThanOrEqualTo(String value) {
            addCriterion("ACC_SEN_GL >=", value, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLLessThan(String value) {
            addCriterion("ACC_SEN_GL <", value, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLLessThanOrEqualTo(String value) {
            addCriterion("ACC_SEN_GL <=", value, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLLike(String value) {
            addCriterion("ACC_SEN_GL like", value, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLNotLike(String value) {
            addCriterion("ACC_SEN_GL not like", value, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLIn(List<String> values) {
            addCriterion("ACC_SEN_GL in", values, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLNotIn(List<String> values) {
            addCriterion("ACC_SEN_GL not in", values, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLBetween(String value1, String value2) {
            addCriterion("ACC_SEN_GL between", value1, value2, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andACC_SEN_GLNotBetween(String value1, String value2) {
            addCriterion("ACC_SEN_GL not between", value1, value2, "ACC_SEN_GL");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGIsNull() {
            addCriterion("SUPER_FLG is null");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGIsNotNull() {
            addCriterion("SUPER_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGEqualTo(String value) {
            addCriterion("SUPER_FLG =", value, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGNotEqualTo(String value) {
            addCriterion("SUPER_FLG <>", value, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGGreaterThan(String value) {
            addCriterion("SUPER_FLG >", value, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("SUPER_FLG >=", value, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGLessThan(String value) {
            addCriterion("SUPER_FLG <", value, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGLessThanOrEqualTo(String value) {
            addCriterion("SUPER_FLG <=", value, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGLike(String value) {
            addCriterion("SUPER_FLG like", value, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGNotLike(String value) {
            addCriterion("SUPER_FLG not like", value, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGIn(List<String> values) {
            addCriterion("SUPER_FLG in", values, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGNotIn(List<String> values) {
            addCriterion("SUPER_FLG not in", values, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGBetween(String value1, String value2) {
            addCriterion("SUPER_FLG between", value1, value2, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andSUPER_FLGNotBetween(String value1, String value2) {
            addCriterion("SUPER_FLG not between", value1, value2, "SUPER_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGIsNull() {
            addCriterion("EXCEL_FLG is null");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGIsNotNull() {
            addCriterion("EXCEL_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGEqualTo(String value) {
            addCriterion("EXCEL_FLG =", value, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGNotEqualTo(String value) {
            addCriterion("EXCEL_FLG <>", value, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGGreaterThan(String value) {
            addCriterion("EXCEL_FLG >", value, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEL_FLG >=", value, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGLessThan(String value) {
            addCriterion("EXCEL_FLG <", value, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGLessThanOrEqualTo(String value) {
            addCriterion("EXCEL_FLG <=", value, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGLike(String value) {
            addCriterion("EXCEL_FLG like", value, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGNotLike(String value) {
            addCriterion("EXCEL_FLG not like", value, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGIn(List<String> values) {
            addCriterion("EXCEL_FLG in", values, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGNotIn(List<String> values) {
            addCriterion("EXCEL_FLG not in", values, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGBetween(String value1, String value2) {
            addCriterion("EXCEL_FLG between", value1, value2, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andEXCEL_FLGNotBetween(String value1, String value2) {
            addCriterion("EXCEL_FLG not between", value1, value2, "EXCEL_FLG");
            return (Criteria) this;
        }

        public Criteria andDPT_NOIsNull() {
            addCriterion("DPT_NO is null");
            return (Criteria) this;
        }

        public Criteria andDPT_NOIsNotNull() {
            addCriterion("DPT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDPT_NOEqualTo(String value) {
            addCriterion("DPT_NO =", value, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NONotEqualTo(String value) {
            addCriterion("DPT_NO <>", value, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NOGreaterThan(String value) {
            addCriterion("DPT_NO >", value, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NOGreaterThanOrEqualTo(String value) {
            addCriterion("DPT_NO >=", value, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NOLessThan(String value) {
            addCriterion("DPT_NO <", value, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NOLessThanOrEqualTo(String value) {
            addCriterion("DPT_NO <=", value, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NOLike(String value) {
            addCriterion("DPT_NO like", value, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NONotLike(String value) {
            addCriterion("DPT_NO not like", value, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NOIn(List<String> values) {
            addCriterion("DPT_NO in", values, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NONotIn(List<String> values) {
            addCriterion("DPT_NO not in", values, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NOBetween(String value1, String value2) {
            addCriterion("DPT_NO between", value1, value2, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andDPT_NONotBetween(String value1, String value2) {
            addCriterion("DPT_NO not between", value1, value2, "DPT_NO");
            return (Criteria) this;
        }

        public Criteria andATH_CARDIsNull() {
            addCriterion("ATH_CARD is null");
            return (Criteria) this;
        }

        public Criteria andATH_CARDIsNotNull() {
            addCriterion("ATH_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andATH_CARDEqualTo(String value) {
            addCriterion("ATH_CARD =", value, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDNotEqualTo(String value) {
            addCriterion("ATH_CARD <>", value, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDGreaterThan(String value) {
            addCriterion("ATH_CARD >", value, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDGreaterThanOrEqualTo(String value) {
            addCriterion("ATH_CARD >=", value, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDLessThan(String value) {
            addCriterion("ATH_CARD <", value, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDLessThanOrEqualTo(String value) {
            addCriterion("ATH_CARD <=", value, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDLike(String value) {
            addCriterion("ATH_CARD like", value, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDNotLike(String value) {
            addCriterion("ATH_CARD not like", value, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDIn(List<String> values) {
            addCriterion("ATH_CARD in", values, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDNotIn(List<String> values) {
            addCriterion("ATH_CARD not in", values, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDBetween(String value1, String value2) {
            addCriterion("ATH_CARD between", value1, value2, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andATH_CARDNotBetween(String value1, String value2) {
            addCriterion("ATH_CARD not between", value1, value2, "ATH_CARD");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDIsNull() {
            addCriterion("LDAP_ID is null");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDIsNotNull() {
            addCriterion("LDAP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDEqualTo(String value) {
            addCriterion("LDAP_ID =", value, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDNotEqualTo(String value) {
            addCriterion("LDAP_ID <>", value, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDGreaterThan(String value) {
            addCriterion("LDAP_ID >", value, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDGreaterThanOrEqualTo(String value) {
            addCriterion("LDAP_ID >=", value, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDLessThan(String value) {
            addCriterion("LDAP_ID <", value, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDLessThanOrEqualTo(String value) {
            addCriterion("LDAP_ID <=", value, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDLike(String value) {
            addCriterion("LDAP_ID like", value, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDNotLike(String value) {
            addCriterion("LDAP_ID not like", value, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDIn(List<String> values) {
            addCriterion("LDAP_ID in", values, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDNotIn(List<String> values) {
            addCriterion("LDAP_ID not in", values, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDBetween(String value1, String value2) {
            addCriterion("LDAP_ID between", value1, value2, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andLDAP_IDNotBetween(String value1, String value2) {
            addCriterion("LDAP_ID not between", value1, value2, "LDAP_ID");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1IsNull() {
            addCriterion("PRT_NAME1 is null");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1IsNotNull() {
            addCriterion("PRT_NAME1 is not null");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1EqualTo(String value) {
            addCriterion("PRT_NAME1 =", value, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1NotEqualTo(String value) {
            addCriterion("PRT_NAME1 <>", value, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1GreaterThan(String value) {
            addCriterion("PRT_NAME1 >", value, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1GreaterThanOrEqualTo(String value) {
            addCriterion("PRT_NAME1 >=", value, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1LessThan(String value) {
            addCriterion("PRT_NAME1 <", value, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1LessThanOrEqualTo(String value) {
            addCriterion("PRT_NAME1 <=", value, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1Like(String value) {
            addCriterion("PRT_NAME1 like", value, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1NotLike(String value) {
            addCriterion("PRT_NAME1 not like", value, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1In(List<String> values) {
            addCriterion("PRT_NAME1 in", values, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1NotIn(List<String> values) {
            addCriterion("PRT_NAME1 not in", values, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1Between(String value1, String value2) {
            addCriterion("PRT_NAME1 between", value1, value2, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME1NotBetween(String value1, String value2) {
            addCriterion("PRT_NAME1 not between", value1, value2, "PRT_NAME1");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2IsNull() {
            addCriterion("PRT_NAME2 is null");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2IsNotNull() {
            addCriterion("PRT_NAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2EqualTo(String value) {
            addCriterion("PRT_NAME2 =", value, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2NotEqualTo(String value) {
            addCriterion("PRT_NAME2 <>", value, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2GreaterThan(String value) {
            addCriterion("PRT_NAME2 >", value, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2GreaterThanOrEqualTo(String value) {
            addCriterion("PRT_NAME2 >=", value, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2LessThan(String value) {
            addCriterion("PRT_NAME2 <", value, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2LessThanOrEqualTo(String value) {
            addCriterion("PRT_NAME2 <=", value, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2Like(String value) {
            addCriterion("PRT_NAME2 like", value, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2NotLike(String value) {
            addCriterion("PRT_NAME2 not like", value, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2In(List<String> values) {
            addCriterion("PRT_NAME2 in", values, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2NotIn(List<String> values) {
            addCriterion("PRT_NAME2 not in", values, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2Between(String value1, String value2) {
            addCriterion("PRT_NAME2 between", value1, value2, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME2NotBetween(String value1, String value2) {
            addCriterion("PRT_NAME2 not between", value1, value2, "PRT_NAME2");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3IsNull() {
            addCriterion("PRT_NAME3 is null");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3IsNotNull() {
            addCriterion("PRT_NAME3 is not null");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3EqualTo(String value) {
            addCriterion("PRT_NAME3 =", value, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3NotEqualTo(String value) {
            addCriterion("PRT_NAME3 <>", value, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3GreaterThan(String value) {
            addCriterion("PRT_NAME3 >", value, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3GreaterThanOrEqualTo(String value) {
            addCriterion("PRT_NAME3 >=", value, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3LessThan(String value) {
            addCriterion("PRT_NAME3 <", value, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3LessThanOrEqualTo(String value) {
            addCriterion("PRT_NAME3 <=", value, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3Like(String value) {
            addCriterion("PRT_NAME3 like", value, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3NotLike(String value) {
            addCriterion("PRT_NAME3 not like", value, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3In(List<String> values) {
            addCriterion("PRT_NAME3 in", values, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3NotIn(List<String> values) {
            addCriterion("PRT_NAME3 not in", values, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3Between(String value1, String value2) {
            addCriterion("PRT_NAME3 between", value1, value2, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andPRT_NAME3NotBetween(String value1, String value2) {
            addCriterion("PRT_NAME3 not between", value1, value2, "PRT_NAME3");
            return (Criteria) this;
        }

        public Criteria andAA_CODEIsNull() {
            addCriterion("AA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAA_CODEIsNotNull() {
            addCriterion("AA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAA_CODEEqualTo(String value) {
            addCriterion("AA_CODE =", value, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODENotEqualTo(String value) {
            addCriterion("AA_CODE <>", value, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODEGreaterThan(String value) {
            addCriterion("AA_CODE >", value, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("AA_CODE >=", value, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODELessThan(String value) {
            addCriterion("AA_CODE <", value, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODELessThanOrEqualTo(String value) {
            addCriterion("AA_CODE <=", value, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODELike(String value) {
            addCriterion("AA_CODE like", value, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODENotLike(String value) {
            addCriterion("AA_CODE not like", value, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODEIn(List<String> values) {
            addCriterion("AA_CODE in", values, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODENotIn(List<String> values) {
            addCriterion("AA_CODE not in", values, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODEBetween(String value1, String value2) {
            addCriterion("AA_CODE between", value1, value2, "AA_CODE");
            return (Criteria) this;
        }

        public Criteria andAA_CODENotBetween(String value1, String value2) {
            addCriterion("AA_CODE not between", value1, value2, "AA_CODE");
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