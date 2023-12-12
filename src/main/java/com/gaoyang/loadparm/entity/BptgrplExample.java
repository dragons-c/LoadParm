package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.List;

public class BptgrplExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BptgrplExample() {
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

        public Criteria andASS_TYPIsNull() {
            addCriterion("ASS_TYP is null");
            return (Criteria) this;
        }

        public Criteria andASS_TYPIsNotNull() {
            addCriterion("ASS_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andASS_TYPEqualTo(String value) {
            addCriterion("ASS_TYP =", value, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPNotEqualTo(String value) {
            addCriterion("ASS_TYP <>", value, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPGreaterThan(String value) {
            addCriterion("ASS_TYP >", value, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPGreaterThanOrEqualTo(String value) {
            addCriterion("ASS_TYP >=", value, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPLessThan(String value) {
            addCriterion("ASS_TYP <", value, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPLessThanOrEqualTo(String value) {
            addCriterion("ASS_TYP <=", value, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPLike(String value) {
            addCriterion("ASS_TYP like", value, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPNotLike(String value) {
            addCriterion("ASS_TYP not like", value, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPIn(List<String> values) {
            addCriterion("ASS_TYP in", values, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPNotIn(List<String> values) {
            addCriterion("ASS_TYP not in", values, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPBetween(String value1, String value2) {
            addCriterion("ASS_TYP between", value1, value2, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_TYPNotBetween(String value1, String value2) {
            addCriterion("ASS_TYP not between", value1, value2, "ASS_TYP");
            return (Criteria) this;
        }

        public Criteria andASS_IDIsNull() {
            addCriterion("ASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andASS_IDIsNotNull() {
            addCriterion("ASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andASS_IDEqualTo(String value) {
            addCriterion("ASS_ID =", value, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDNotEqualTo(String value) {
            addCriterion("ASS_ID <>", value, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDGreaterThan(String value) {
            addCriterion("ASS_ID >", value, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDGreaterThanOrEqualTo(String value) {
            addCriterion("ASS_ID >=", value, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDLessThan(String value) {
            addCriterion("ASS_ID <", value, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDLessThanOrEqualTo(String value) {
            addCriterion("ASS_ID <=", value, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDLike(String value) {
            addCriterion("ASS_ID like", value, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDNotLike(String value) {
            addCriterion("ASS_ID not like", value, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDIn(List<String> values) {
            addCriterion("ASS_ID in", values, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDNotIn(List<String> values) {
            addCriterion("ASS_ID not in", values, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDBetween(String value1, String value2) {
            addCriterion("ASS_ID between", value1, value2, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andASS_IDNotBetween(String value1, String value2) {
            addCriterion("ASS_ID not between", value1, value2, "ASS_ID");
            return (Criteria) this;
        }

        public Criteria andATH_TYPIsNull() {
            addCriterion("ATH_TYP is null");
            return (Criteria) this;
        }

        public Criteria andATH_TYPIsNotNull() {
            addCriterion("ATH_TYP is not null");
            return (Criteria) this;
        }

        public Criteria andATH_TYPEqualTo(String value) {
            addCriterion("ATH_TYP =", value, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPNotEqualTo(String value) {
            addCriterion("ATH_TYP <>", value, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPGreaterThan(String value) {
            addCriterion("ATH_TYP >", value, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPGreaterThanOrEqualTo(String value) {
            addCriterion("ATH_TYP >=", value, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPLessThan(String value) {
            addCriterion("ATH_TYP <", value, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPLessThanOrEqualTo(String value) {
            addCriterion("ATH_TYP <=", value, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPLike(String value) {
            addCriterion("ATH_TYP like", value, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPNotLike(String value) {
            addCriterion("ATH_TYP not like", value, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPIn(List<String> values) {
            addCriterion("ATH_TYP in", values, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPNotIn(List<String> values) {
            addCriterion("ATH_TYP not in", values, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPBetween(String value1, String value2) {
            addCriterion("ATH_TYP between", value1, value2, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andATH_TYPNotBetween(String value1, String value2) {
            addCriterion("ATH_TYP not between", value1, value2, "ATH_TYP");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTIsNull() {
            addCriterion("ROLE_CNT is null");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTIsNotNull() {
            addCriterion("ROLE_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTEqualTo(Short value) {
            addCriterion("ROLE_CNT =", value, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTNotEqualTo(Short value) {
            addCriterion("ROLE_CNT <>", value, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTGreaterThan(Short value) {
            addCriterion("ROLE_CNT >", value, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTGreaterThanOrEqualTo(Short value) {
            addCriterion("ROLE_CNT >=", value, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTLessThan(Short value) {
            addCriterion("ROLE_CNT <", value, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTLessThanOrEqualTo(Short value) {
            addCriterion("ROLE_CNT <=", value, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTIn(List<Short> values) {
            addCriterion("ROLE_CNT in", values, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTNotIn(List<Short> values) {
            addCriterion("ROLE_CNT not in", values, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTBetween(Short value1, Short value2) {
            addCriterion("ROLE_CNT between", value1, value2, "ROLE_CNT");
            return (Criteria) this;
        }

        public Criteria andROLE_CNTNotBetween(Short value1, Short value2) {
            addCriterion("ROLE_CNT not between", value1, value2, "ROLE_CNT");
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