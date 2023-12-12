package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BptparmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BptparmExample() {
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

        public Criteria andTYPEIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTYPEIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTYPEEqualTo(String value) {
            addCriterion("TYPE =", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotEqualTo(String value) {
            addCriterion("TYPE <>", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThan(String value) {
            addCriterion("TYPE >", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThan(String value) {
            addCriterion("TYPE <", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELike(String value) {
            addCriterion("TYPE like", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotLike(String value) {
            addCriterion("TYPE not like", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEIn(List<String> values) {
            addCriterion("TYPE in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotIn(List<String> values) {
            addCriterion("TYPE not in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andCODEIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCODEIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCODEEqualTo(String value) {
            addCriterion("CODE =", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotEqualTo(String value) {
            addCriterion("CODE <>", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThan(String value) {
            addCriterion("CODE >", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThan(String value) {
            addCriterion("CODE <", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODELike(String value) {
            addCriterion("CODE like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotLike(String value) {
            addCriterion("CODE not like", value, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEIn(List<String> values) {
            addCriterion("CODE in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotIn(List<String> values) {
            addCriterion("CODE not in", values, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODEBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "CODE");
            return (Criteria) this;
        }

        public Criteria andCODENotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "CODE");
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

        public Criteria andCDESCIsNull() {
            addCriterion("CDESC is null");
            return (Criteria) this;
        }

        public Criteria andCDESCIsNotNull() {
            addCriterion("CDESC is not null");
            return (Criteria) this;
        }

        public Criteria andCDESCEqualTo(String value) {
            addCriterion("CDESC =", value, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCNotEqualTo(String value) {
            addCriterion("CDESC <>", value, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCGreaterThan(String value) {
            addCriterion("CDESC >", value, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCGreaterThanOrEqualTo(String value) {
            addCriterion("CDESC >=", value, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCLessThan(String value) {
            addCriterion("CDESC <", value, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCLessThanOrEqualTo(String value) {
            addCriterion("CDESC <=", value, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCLike(String value) {
            addCriterion("CDESC like", value, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCNotLike(String value) {
            addCriterion("CDESC not like", value, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCIn(List<String> values) {
            addCriterion("CDESC in", values, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCNotIn(List<String> values) {
            addCriterion("CDESC not in", values, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCBetween(String value1, String value2) {
            addCriterion("CDESC between", value1, value2, "CDESC");
            return (Criteria) this;
        }

        public Criteria andCDESCNotBetween(String value1, String value2) {
            addCriterion("CDESC not between", value1, value2, "CDESC");
            return (Criteria) this;
        }

        public Criteria andUPD_DATEIsNull() {
            addCriterion("UPD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUPD_DATEIsNotNull() {
            addCriterion("UPD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUPD_DATEEqualTo(Integer value) {
            addCriterion("UPD_DATE =", value, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATENotEqualTo(Integer value) {
            addCriterion("UPD_DATE <>", value, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATEGreaterThan(Integer value) {
            addCriterion("UPD_DATE >", value, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPD_DATE >=", value, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATELessThan(Integer value) {
            addCriterion("UPD_DATE <", value, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATELessThanOrEqualTo(Integer value) {
            addCriterion("UPD_DATE <=", value, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATEIn(List<Integer> values) {
            addCriterion("UPD_DATE in", values, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATENotIn(List<Integer> values) {
            addCriterion("UPD_DATE not in", values, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATEBetween(Integer value1, Integer value2) {
            addCriterion("UPD_DATE between", value1, value2, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("UPD_DATE not between", value1, value2, "UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andUPD_BRIsNull() {
            addCriterion("UPD_BR is null");
            return (Criteria) this;
        }

        public Criteria andUPD_BRIsNotNull() {
            addCriterion("UPD_BR is not null");
            return (Criteria) this;
        }

        public Criteria andUPD_BREqualTo(Integer value) {
            addCriterion("UPD_BR =", value, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRNotEqualTo(Integer value) {
            addCriterion("UPD_BR <>", value, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRGreaterThan(Integer value) {
            addCriterion("UPD_BR >", value, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPD_BR >=", value, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRLessThan(Integer value) {
            addCriterion("UPD_BR <", value, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRLessThanOrEqualTo(Integer value) {
            addCriterion("UPD_BR <=", value, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRIn(List<Integer> values) {
            addCriterion("UPD_BR in", values, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRNotIn(List<Integer> values) {
            addCriterion("UPD_BR not in", values, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRBetween(Integer value1, Integer value2) {
            addCriterion("UPD_BR between", value1, value2, "UPD_BR");
            return (Criteria) this;
        }

        public Criteria andUPD_BRNotBetween(Integer value1, Integer value2) {
            addCriterion("UPD_BR not between", value1, value2, "UPD_BR");
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