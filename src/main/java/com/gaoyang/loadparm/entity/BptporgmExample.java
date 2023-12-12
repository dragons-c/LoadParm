package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BptporgmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BptporgmExample() {
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

        public Criteria andSUPR_BRIsNull() {
            addCriterion("SUPR_BR is null");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRIsNotNull() {
            addCriterion("SUPR_BR is not null");
            return (Criteria) this;
        }

        public Criteria andSUPR_BREqualTo(Integer value) {
            addCriterion("SUPR_BR =", value, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRNotEqualTo(Integer value) {
            addCriterion("SUPR_BR <>", value, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRGreaterThan(Integer value) {
            addCriterion("SUPR_BR >", value, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUPR_BR >=", value, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRLessThan(Integer value) {
            addCriterion("SUPR_BR <", value, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRLessThanOrEqualTo(Integer value) {
            addCriterion("SUPR_BR <=", value, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRIn(List<Integer> values) {
            addCriterion("SUPR_BR in", values, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRNotIn(List<Integer> values) {
            addCriterion("SUPR_BR not in", values, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRBetween(Integer value1, Integer value2) {
            addCriterion("SUPR_BR between", value1, value2, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andSUPR_BRNotBetween(Integer value1, Integer value2) {
            addCriterion("SUPR_BR not between", value1, value2, "SUPR_BR");
            return (Criteria) this;
        }

        public Criteria andATTRIsNull() {
            addCriterion("ATTR is null");
            return (Criteria) this;
        }

        public Criteria andATTRIsNotNull() {
            addCriterion("ATTR is not null");
            return (Criteria) this;
        }

        public Criteria andATTREqualTo(String value) {
            addCriterion("ATTR =", value, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRNotEqualTo(String value) {
            addCriterion("ATTR <>", value, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRGreaterThan(String value) {
            addCriterion("ATTR >", value, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR >=", value, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRLessThan(String value) {
            addCriterion("ATTR <", value, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRLessThanOrEqualTo(String value) {
            addCriterion("ATTR <=", value, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRLike(String value) {
            addCriterion("ATTR like", value, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRNotLike(String value) {
            addCriterion("ATTR not like", value, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRIn(List<String> values) {
            addCriterion("ATTR in", values, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRNotIn(List<String> values) {
            addCriterion("ATTR not in", values, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRBetween(String value1, String value2) {
            addCriterion("ATTR between", value1, value2, "ATTR");
            return (Criteria) this;
        }

        public Criteria andATTRNotBetween(String value1, String value2) {
            addCriterion("ATTR not between", value1, value2, "ATTR");
            return (Criteria) this;
        }

        public Criteria andLVLIsNull() {
            addCriterion("LVL is null");
            return (Criteria) this;
        }

        public Criteria andLVLIsNotNull() {
            addCriterion("LVL is not null");
            return (Criteria) this;
        }

        public Criteria andLVLEqualTo(String value) {
            addCriterion("LVL =", value, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLNotEqualTo(String value) {
            addCriterion("LVL <>", value, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLGreaterThan(String value) {
            addCriterion("LVL >", value, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLGreaterThanOrEqualTo(String value) {
            addCriterion("LVL >=", value, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLLessThan(String value) {
            addCriterion("LVL <", value, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLLessThanOrEqualTo(String value) {
            addCriterion("LVL <=", value, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLLike(String value) {
            addCriterion("LVL like", value, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLNotLike(String value) {
            addCriterion("LVL not like", value, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLIn(List<String> values) {
            addCriterion("LVL in", values, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLNotIn(List<String> values) {
            addCriterion("LVL not in", values, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLBetween(String value1, String value2) {
            addCriterion("LVL between", value1, value2, "LVL");
            return (Criteria) this;
        }

        public Criteria andLVLNotBetween(String value1, String value2) {
            addCriterion("LVL not between", value1, value2, "LVL");
            return (Criteria) this;
        }

        public Criteria andTYPIsNull() {
            addCriterion("TYP is null");
            return (Criteria) this;
        }

        public Criteria andTYPIsNotNull() {
            addCriterion("TYP is not null");
            return (Criteria) this;
        }

        public Criteria andTYPEqualTo(String value) {
            addCriterion("TYP =", value, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPNotEqualTo(String value) {
            addCriterion("TYP <>", value, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPGreaterThan(String value) {
            addCriterion("TYP >", value, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPGreaterThanOrEqualTo(String value) {
            addCriterion("TYP >=", value, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPLessThan(String value) {
            addCriterion("TYP <", value, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPLessThanOrEqualTo(String value) {
            addCriterion("TYP <=", value, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPLike(String value) {
            addCriterion("TYP like", value, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPNotLike(String value) {
            addCriterion("TYP not like", value, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPIn(List<String> values) {
            addCriterion("TYP in", values, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPNotIn(List<String> values) {
            addCriterion("TYP not in", values, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPBetween(String value1, String value2) {
            addCriterion("TYP between", value1, value2, "TYP");
            return (Criteria) this;
        }

        public Criteria andTYPNotBetween(String value1, String value2) {
            addCriterion("TYP not between", value1, value2, "TYP");
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

        public Criteria andCHN_NMIsNull() {
            addCriterion("CHN_NM is null");
            return (Criteria) this;
        }

        public Criteria andCHN_NMIsNotNull() {
            addCriterion("CHN_NM is not null");
            return (Criteria) this;
        }

        public Criteria andCHN_NMEqualTo(String value) {
            addCriterion("CHN_NM =", value, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMNotEqualTo(String value) {
            addCriterion("CHN_NM <>", value, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMGreaterThan(String value) {
            addCriterion("CHN_NM >", value, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMGreaterThanOrEqualTo(String value) {
            addCriterion("CHN_NM >=", value, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMLessThan(String value) {
            addCriterion("CHN_NM <", value, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMLessThanOrEqualTo(String value) {
            addCriterion("CHN_NM <=", value, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMLike(String value) {
            addCriterion("CHN_NM like", value, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMNotLike(String value) {
            addCriterion("CHN_NM not like", value, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMIn(List<String> values) {
            addCriterion("CHN_NM in", values, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMNotIn(List<String> values) {
            addCriterion("CHN_NM not in", values, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMBetween(String value1, String value2) {
            addCriterion("CHN_NM between", value1, value2, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_NMNotBetween(String value1, String value2) {
            addCriterion("CHN_NM not between", value1, value2, "CHN_NM");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRIsNull() {
            addCriterion("CHN_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRIsNotNull() {
            addCriterion("CHN_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDREqualTo(String value) {
            addCriterion("CHN_ADDR =", value, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRNotEqualTo(String value) {
            addCriterion("CHN_ADDR <>", value, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRGreaterThan(String value) {
            addCriterion("CHN_ADDR >", value, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRGreaterThanOrEqualTo(String value) {
            addCriterion("CHN_ADDR >=", value, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRLessThan(String value) {
            addCriterion("CHN_ADDR <", value, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRLessThanOrEqualTo(String value) {
            addCriterion("CHN_ADDR <=", value, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRLike(String value) {
            addCriterion("CHN_ADDR like", value, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRNotLike(String value) {
            addCriterion("CHN_ADDR not like", value, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRIn(List<String> values) {
            addCriterion("CHN_ADDR in", values, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRNotIn(List<String> values) {
            addCriterion("CHN_ADDR not in", values, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRBetween(String value1, String value2) {
            addCriterion("CHN_ADDR between", value1, value2, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andCHN_ADDRNotBetween(String value1, String value2) {
            addCriterion("CHN_ADDR not between", value1, value2, "CHN_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_NMIsNull() {
            addCriterion("ENG_NM is null");
            return (Criteria) this;
        }

        public Criteria andENG_NMIsNotNull() {
            addCriterion("ENG_NM is not null");
            return (Criteria) this;
        }

        public Criteria andENG_NMEqualTo(String value) {
            addCriterion("ENG_NM =", value, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMNotEqualTo(String value) {
            addCriterion("ENG_NM <>", value, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMGreaterThan(String value) {
            addCriterion("ENG_NM >", value, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMGreaterThanOrEqualTo(String value) {
            addCriterion("ENG_NM >=", value, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMLessThan(String value) {
            addCriterion("ENG_NM <", value, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMLessThanOrEqualTo(String value) {
            addCriterion("ENG_NM <=", value, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMLike(String value) {
            addCriterion("ENG_NM like", value, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMNotLike(String value) {
            addCriterion("ENG_NM not like", value, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMIn(List<String> values) {
            addCriterion("ENG_NM in", values, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMNotIn(List<String> values) {
            addCriterion("ENG_NM not in", values, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMBetween(String value1, String value2) {
            addCriterion("ENG_NM between", value1, value2, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_NMNotBetween(String value1, String value2) {
            addCriterion("ENG_NM not between", value1, value2, "ENG_NM");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRIsNull() {
            addCriterion("ENG_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRIsNotNull() {
            addCriterion("ENG_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andENG_ADDREqualTo(String value) {
            addCriterion("ENG_ADDR =", value, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRNotEqualTo(String value) {
            addCriterion("ENG_ADDR <>", value, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRGreaterThan(String value) {
            addCriterion("ENG_ADDR >", value, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRGreaterThanOrEqualTo(String value) {
            addCriterion("ENG_ADDR >=", value, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRLessThan(String value) {
            addCriterion("ENG_ADDR <", value, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRLessThanOrEqualTo(String value) {
            addCriterion("ENG_ADDR <=", value, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRLike(String value) {
            addCriterion("ENG_ADDR like", value, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRNotLike(String value) {
            addCriterion("ENG_ADDR not like", value, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRIn(List<String> values) {
            addCriterion("ENG_ADDR in", values, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRNotIn(List<String> values) {
            addCriterion("ENG_ADDR not in", values, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRBetween(String value1, String value2) {
            addCriterion("ENG_ADDR between", value1, value2, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andENG_ADDRNotBetween(String value1, String value2) {
            addCriterion("ENG_ADDR not between", value1, value2, "ENG_ADDR");
            return (Criteria) this;
        }

        public Criteria andABBRIsNull() {
            addCriterion("ABBR is null");
            return (Criteria) this;
        }

        public Criteria andABBRIsNotNull() {
            addCriterion("ABBR is not null");
            return (Criteria) this;
        }

        public Criteria andABBREqualTo(String value) {
            addCriterion("ABBR =", value, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRNotEqualTo(String value) {
            addCriterion("ABBR <>", value, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRGreaterThan(String value) {
            addCriterion("ABBR >", value, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRGreaterThanOrEqualTo(String value) {
            addCriterion("ABBR >=", value, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRLessThan(String value) {
            addCriterion("ABBR <", value, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRLessThanOrEqualTo(String value) {
            addCriterion("ABBR <=", value, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRLike(String value) {
            addCriterion("ABBR like", value, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRNotLike(String value) {
            addCriterion("ABBR not like", value, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRIn(List<String> values) {
            addCriterion("ABBR in", values, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRNotIn(List<String> values) {
            addCriterion("ABBR not in", values, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRBetween(String value1, String value2) {
            addCriterion("ABBR between", value1, value2, "ABBR");
            return (Criteria) this;
        }

        public Criteria andABBRNotBetween(String value1, String value2) {
            addCriterion("ABBR not between", value1, value2, "ABBR");
            return (Criteria) this;
        }

        public Criteria andLINK_MANIsNull() {
            addCriterion("LINK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLINK_MANIsNotNull() {
            addCriterion("LINK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLINK_MANEqualTo(String value) {
            addCriterion("LINK_MAN =", value, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANNotEqualTo(String value) {
            addCriterion("LINK_MAN <>", value, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANGreaterThan(String value) {
            addCriterion("LINK_MAN >", value, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_MAN >=", value, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANLessThan(String value) {
            addCriterion("LINK_MAN <", value, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANLessThanOrEqualTo(String value) {
            addCriterion("LINK_MAN <=", value, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANLike(String value) {
            addCriterion("LINK_MAN like", value, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANNotLike(String value) {
            addCriterion("LINK_MAN not like", value, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANIn(List<String> values) {
            addCriterion("LINK_MAN in", values, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANNotIn(List<String> values) {
            addCriterion("LINK_MAN not in", values, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANBetween(String value1, String value2) {
            addCriterion("LINK_MAN between", value1, value2, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_MANNotBetween(String value1, String value2) {
            addCriterion("LINK_MAN not between", value1, value2, "LINK_MAN");
            return (Criteria) this;
        }

        public Criteria andLINK_TELIsNull() {
            addCriterion("LINK_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLINK_TELIsNotNull() {
            addCriterion("LINK_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLINK_TELEqualTo(String value) {
            addCriterion("LINK_TEL =", value, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELNotEqualTo(String value) {
            addCriterion("LINK_TEL <>", value, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELGreaterThan(String value) {
            addCriterion("LINK_TEL >", value, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_TEL >=", value, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELLessThan(String value) {
            addCriterion("LINK_TEL <", value, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELLessThanOrEqualTo(String value) {
            addCriterion("LINK_TEL <=", value, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELLike(String value) {
            addCriterion("LINK_TEL like", value, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELNotLike(String value) {
            addCriterion("LINK_TEL not like", value, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELIn(List<String> values) {
            addCriterion("LINK_TEL in", values, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELNotIn(List<String> values) {
            addCriterion("LINK_TEL not in", values, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELBetween(String value1, String value2) {
            addCriterion("LINK_TEL between", value1, value2, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andLINK_TELNotBetween(String value1, String value2) {
            addCriterion("LINK_TEL not between", value1, value2, "LINK_TEL");
            return (Criteria) this;
        }

        public Criteria andPOSTIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPOSTIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPOSTEqualTo(String value) {
            addCriterion("POST =", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTNotEqualTo(String value) {
            addCriterion("POST <>", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTGreaterThan(String value) {
            addCriterion("POST >", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTLessThan(String value) {
            addCriterion("POST <", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTLike(String value) {
            addCriterion("POST like", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTNotLike(String value) {
            addCriterion("POST not like", value, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTIn(List<String> values) {
            addCriterion("POST in", values, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTNotIn(List<String> values) {
            addCriterion("POST not in", values, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "POST");
            return (Criteria) this;
        }

        public Criteria andPOSTNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "POST");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXIsNull() {
            addCriterion("TLR_MAX is null");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXIsNotNull() {
            addCriterion("TLR_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXEqualTo(String value) {
            addCriterion("TLR_MAX =", value, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXNotEqualTo(String value) {
            addCriterion("TLR_MAX <>", value, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXGreaterThan(String value) {
            addCriterion("TLR_MAX >", value, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_MAX >=", value, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXLessThan(String value) {
            addCriterion("TLR_MAX <", value, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXLessThanOrEqualTo(String value) {
            addCriterion("TLR_MAX <=", value, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXLike(String value) {
            addCriterion("TLR_MAX like", value, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXNotLike(String value) {
            addCriterion("TLR_MAX not like", value, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXIn(List<String> values) {
            addCriterion("TLR_MAX in", values, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXNotIn(List<String> values) {
            addCriterion("TLR_MAX not in", values, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXBetween(String value1, String value2) {
            addCriterion("TLR_MAX between", value1, value2, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andTLR_MAXNotBetween(String value1, String value2) {
            addCriterion("TLR_MAX not between", value1, value2, "TLR_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXIsNull() {
            addCriterion("ATH_MAX is null");
            return (Criteria) this;
        }

        public Criteria andATH_MAXIsNotNull() {
            addCriterion("ATH_MAX is not null");
            return (Criteria) this;
        }

        public Criteria andATH_MAXEqualTo(String value) {
            addCriterion("ATH_MAX =", value, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXNotEqualTo(String value) {
            addCriterion("ATH_MAX <>", value, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXGreaterThan(String value) {
            addCriterion("ATH_MAX >", value, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXGreaterThanOrEqualTo(String value) {
            addCriterion("ATH_MAX >=", value, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXLessThan(String value) {
            addCriterion("ATH_MAX <", value, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXLessThanOrEqualTo(String value) {
            addCriterion("ATH_MAX <=", value, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXLike(String value) {
            addCriterion("ATH_MAX like", value, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXNotLike(String value) {
            addCriterion("ATH_MAX not like", value, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXIn(List<String> values) {
            addCriterion("ATH_MAX in", values, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXNotIn(List<String> values) {
            addCriterion("ATH_MAX not in", values, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXBetween(String value1, String value2) {
            addCriterion("ATH_MAX between", value1, value2, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andATH_MAXNotBetween(String value1, String value2) {
            addCriterion("ATH_MAX not between", value1, value2, "ATH_MAX");
            return (Criteria) this;
        }

        public Criteria andFX_BUSIIsNull() {
            addCriterion("FX_BUSI is null");
            return (Criteria) this;
        }

        public Criteria andFX_BUSIIsNotNull() {
            addCriterion("FX_BUSI is not null");
            return (Criteria) this;
        }

        public Criteria andFX_BUSIEqualTo(String value) {
            addCriterion("FX_BUSI =", value, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSINotEqualTo(String value) {
            addCriterion("FX_BUSI <>", value, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSIGreaterThan(String value) {
            addCriterion("FX_BUSI >", value, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSIGreaterThanOrEqualTo(String value) {
            addCriterion("FX_BUSI >=", value, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSILessThan(String value) {
            addCriterion("FX_BUSI <", value, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSILessThanOrEqualTo(String value) {
            addCriterion("FX_BUSI <=", value, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSILike(String value) {
            addCriterion("FX_BUSI like", value, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSINotLike(String value) {
            addCriterion("FX_BUSI not like", value, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSIIn(List<String> values) {
            addCriterion("FX_BUSI in", values, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSINotIn(List<String> values) {
            addCriterion("FX_BUSI not in", values, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSIBetween(String value1, String value2) {
            addCriterion("FX_BUSI between", value1, value2, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andFX_BUSINotBetween(String value1, String value2) {
            addCriterion("FX_BUSI not between", value1, value2, "FX_BUSI");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOIsNull() {
            addCriterion("CNAP_NO is null");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOIsNotNull() {
            addCriterion("CNAP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOEqualTo(Long value) {
            addCriterion("CNAP_NO =", value, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NONotEqualTo(Long value) {
            addCriterion("CNAP_NO <>", value, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOGreaterThan(Long value) {
            addCriterion("CNAP_NO >", value, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOGreaterThanOrEqualTo(Long value) {
            addCriterion("CNAP_NO >=", value, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOLessThan(Long value) {
            addCriterion("CNAP_NO <", value, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOLessThanOrEqualTo(Long value) {
            addCriterion("CNAP_NO <=", value, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOIn(List<Long> values) {
            addCriterion("CNAP_NO in", values, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NONotIn(List<Long> values) {
            addCriterion("CNAP_NO not in", values, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NOBetween(Long value1, Long value2) {
            addCriterion("CNAP_NO between", value1, value2, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andCNAP_NONotBetween(Long value1, Long value2) {
            addCriterion("CNAP_NO not between", value1, value2, "CNAP_NO");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGIsNull() {
            addCriterion("ACCT_FLG is null");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGIsNotNull() {
            addCriterion("ACCT_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGEqualTo(String value) {
            addCriterion("ACCT_FLG =", value, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGNotEqualTo(String value) {
            addCriterion("ACCT_FLG <>", value, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGGreaterThan(String value) {
            addCriterion("ACCT_FLG >", value, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("ACCT_FLG >=", value, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGLessThan(String value) {
            addCriterion("ACCT_FLG <", value, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGLessThanOrEqualTo(String value) {
            addCriterion("ACCT_FLG <=", value, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGLike(String value) {
            addCriterion("ACCT_FLG like", value, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGNotLike(String value) {
            addCriterion("ACCT_FLG not like", value, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGIn(List<String> values) {
            addCriterion("ACCT_FLG in", values, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGNotIn(List<String> values) {
            addCriterion("ACCT_FLG not in", values, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGBetween(String value1, String value2) {
            addCriterion("ACCT_FLG between", value1, value2, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andACCT_FLGNotBetween(String value1, String value2) {
            addCriterion("ACCT_FLG not between", value1, value2, "ACCT_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_DTIsNull() {
            addCriterion("OPN_DT is null");
            return (Criteria) this;
        }

        public Criteria andOPN_DTIsNotNull() {
            addCriterion("OPN_DT is not null");
            return (Criteria) this;
        }

        public Criteria andOPN_DTEqualTo(Integer value) {
            addCriterion("OPN_DT =", value, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTNotEqualTo(Integer value) {
            addCriterion("OPN_DT <>", value, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTGreaterThan(Integer value) {
            addCriterion("OPN_DT >", value, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPN_DT >=", value, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTLessThan(Integer value) {
            addCriterion("OPN_DT <", value, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTLessThanOrEqualTo(Integer value) {
            addCriterion("OPN_DT <=", value, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTIn(List<Integer> values) {
            addCriterion("OPN_DT in", values, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTNotIn(List<Integer> values) {
            addCriterion("OPN_DT not in", values, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTBetween(Integer value1, Integer value2) {
            addCriterion("OPN_DT between", value1, value2, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andOPN_DTNotBetween(Integer value1, Integer value2) {
            addCriterion("OPN_DT not between", value1, value2, "OPN_DT");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYIsNull() {
            addCriterion("RUN_HDAY is null");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYIsNotNull() {
            addCriterion("RUN_HDAY is not null");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYEqualTo(String value) {
            addCriterion("RUN_HDAY =", value, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYNotEqualTo(String value) {
            addCriterion("RUN_HDAY <>", value, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYGreaterThan(String value) {
            addCriterion("RUN_HDAY >", value, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_HDAY >=", value, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYLessThan(String value) {
            addCriterion("RUN_HDAY <", value, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYLessThanOrEqualTo(String value) {
            addCriterion("RUN_HDAY <=", value, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYLike(String value) {
            addCriterion("RUN_HDAY like", value, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYNotLike(String value) {
            addCriterion("RUN_HDAY not like", value, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYIn(List<String> values) {
            addCriterion("RUN_HDAY in", values, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYNotIn(List<String> values) {
            addCriterion("RUN_HDAY not in", values, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYBetween(String value1, String value2) {
            addCriterion("RUN_HDAY between", value1, value2, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_HDAYNotBetween(String value1, String value2) {
            addCriterion("RUN_HDAY not between", value1, value2, "RUN_HDAY");
            return (Criteria) this;
        }

        public Criteria andRUN_MODEIsNull() {
            addCriterion("RUN_MODE is null");
            return (Criteria) this;
        }

        public Criteria andRUN_MODEIsNotNull() {
            addCriterion("RUN_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andRUN_MODEEqualTo(String value) {
            addCriterion("RUN_MODE =", value, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODENotEqualTo(String value) {
            addCriterion("RUN_MODE <>", value, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODEGreaterThan(String value) {
            addCriterion("RUN_MODE >", value, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODEGreaterThanOrEqualTo(String value) {
            addCriterion("RUN_MODE >=", value, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODELessThan(String value) {
            addCriterion("RUN_MODE <", value, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODELessThanOrEqualTo(String value) {
            addCriterion("RUN_MODE <=", value, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODELike(String value) {
            addCriterion("RUN_MODE like", value, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODENotLike(String value) {
            addCriterion("RUN_MODE not like", value, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODEIn(List<String> values) {
            addCriterion("RUN_MODE in", values, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODENotIn(List<String> values) {
            addCriterion("RUN_MODE not in", values, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODEBetween(String value1, String value2) {
            addCriterion("RUN_MODE between", value1, value2, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andRUN_MODENotBetween(String value1, String value2) {
            addCriterion("RUN_MODE not between", value1, value2, "RUN_MODE");
            return (Criteria) this;
        }

        public Criteria andCALD_CDIsNull() {
            addCriterion("CALD_CD is null");
            return (Criteria) this;
        }

        public Criteria andCALD_CDIsNotNull() {
            addCriterion("CALD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCALD_CDEqualTo(String value) {
            addCriterion("CALD_CD =", value, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDNotEqualTo(String value) {
            addCriterion("CALD_CD <>", value, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDGreaterThan(String value) {
            addCriterion("CALD_CD >", value, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDGreaterThanOrEqualTo(String value) {
            addCriterion("CALD_CD >=", value, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDLessThan(String value) {
            addCriterion("CALD_CD <", value, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDLessThanOrEqualTo(String value) {
            addCriterion("CALD_CD <=", value, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDLike(String value) {
            addCriterion("CALD_CD like", value, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDNotLike(String value) {
            addCriterion("CALD_CD not like", value, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDIn(List<String> values) {
            addCriterion("CALD_CD in", values, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDNotIn(List<String> values) {
            addCriterion("CALD_CD not in", values, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDBetween(String value1, String value2) {
            addCriterion("CALD_CD between", value1, value2, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andCALD_CDNotBetween(String value1, String value2) {
            addCriterion("CALD_CD not between", value1, value2, "CALD_CD");
            return (Criteria) this;
        }

        public Criteria andOPN_TMIsNull() {
            addCriterion("OPN_TM is null");
            return (Criteria) this;
        }

        public Criteria andOPN_TMIsNotNull() {
            addCriterion("OPN_TM is not null");
            return (Criteria) this;
        }

        public Criteria andOPN_TMEqualTo(Integer value) {
            addCriterion("OPN_TM =", value, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMNotEqualTo(Integer value) {
            addCriterion("OPN_TM <>", value, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMGreaterThan(Integer value) {
            addCriterion("OPN_TM >", value, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPN_TM >=", value, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMLessThan(Integer value) {
            addCriterion("OPN_TM <", value, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMLessThanOrEqualTo(Integer value) {
            addCriterion("OPN_TM <=", value, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMIn(List<Integer> values) {
            addCriterion("OPN_TM in", values, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMNotIn(List<Integer> values) {
            addCriterion("OPN_TM not in", values, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMBetween(Integer value1, Integer value2) {
            addCriterion("OPN_TM between", value1, value2, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_TMNotBetween(Integer value1, Integer value2) {
            addCriterion("OPN_TM not between", value1, value2, "OPN_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMIsNull() {
            addCriterion("CLS_TM is null");
            return (Criteria) this;
        }

        public Criteria andCLS_TMIsNotNull() {
            addCriterion("CLS_TM is not null");
            return (Criteria) this;
        }

        public Criteria andCLS_TMEqualTo(Integer value) {
            addCriterion("CLS_TM =", value, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMNotEqualTo(Integer value) {
            addCriterion("CLS_TM <>", value, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMGreaterThan(Integer value) {
            addCriterion("CLS_TM >", value, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLS_TM >=", value, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMLessThan(Integer value) {
            addCriterion("CLS_TM <", value, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMLessThanOrEqualTo(Integer value) {
            addCriterion("CLS_TM <=", value, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMIn(List<Integer> values) {
            addCriterion("CLS_TM in", values, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMNotIn(List<Integer> values) {
            addCriterion("CLS_TM not in", values, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMBetween(Integer value1, Integer value2) {
            addCriterion("CLS_TM between", value1, value2, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andCLS_TMNotBetween(Integer value1, Integer value2) {
            addCriterion("CLS_TM not between", value1, value2, "CLS_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMIsNull() {
            addCriterion("HOPN_TM is null");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMIsNotNull() {
            addCriterion("HOPN_TM is not null");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMEqualTo(Integer value) {
            addCriterion("HOPN_TM =", value, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMNotEqualTo(Integer value) {
            addCriterion("HOPN_TM <>", value, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMGreaterThan(Integer value) {
            addCriterion("HOPN_TM >", value, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMGreaterThanOrEqualTo(Integer value) {
            addCriterion("HOPN_TM >=", value, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMLessThan(Integer value) {
            addCriterion("HOPN_TM <", value, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMLessThanOrEqualTo(Integer value) {
            addCriterion("HOPN_TM <=", value, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMIn(List<Integer> values) {
            addCriterion("HOPN_TM in", values, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMNotIn(List<Integer> values) {
            addCriterion("HOPN_TM not in", values, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMBetween(Integer value1, Integer value2) {
            addCriterion("HOPN_TM between", value1, value2, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHOPN_TMNotBetween(Integer value1, Integer value2) {
            addCriterion("HOPN_TM not between", value1, value2, "HOPN_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMIsNull() {
            addCriterion("HCLS_TM is null");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMIsNotNull() {
            addCriterion("HCLS_TM is not null");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMEqualTo(Integer value) {
            addCriterion("HCLS_TM =", value, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMNotEqualTo(Integer value) {
            addCriterion("HCLS_TM <>", value, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMGreaterThan(Integer value) {
            addCriterion("HCLS_TM >", value, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMGreaterThanOrEqualTo(Integer value) {
            addCriterion("HCLS_TM >=", value, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMLessThan(Integer value) {
            addCriterion("HCLS_TM <", value, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMLessThanOrEqualTo(Integer value) {
            addCriterion("HCLS_TM <=", value, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMIn(List<Integer> values) {
            addCriterion("HCLS_TM in", values, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMNotIn(List<Integer> values) {
            addCriterion("HCLS_TM not in", values, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMBetween(Integer value1, Integer value2) {
            addCriterion("HCLS_TM between", value1, value2, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andHCLS_TMNotBetween(Integer value1, Integer value2) {
            addCriterion("HCLS_TM not between", value1, value2, "HCLS_TM");
            return (Criteria) this;
        }

        public Criteria andUPT_DTIsNull() {
            addCriterion("UPT_DT is null");
            return (Criteria) this;
        }

        public Criteria andUPT_DTIsNotNull() {
            addCriterion("UPT_DT is not null");
            return (Criteria) this;
        }

        public Criteria andUPT_DTEqualTo(Integer value) {
            addCriterion("UPT_DT =", value, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTNotEqualTo(Integer value) {
            addCriterion("UPT_DT <>", value, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTGreaterThan(Integer value) {
            addCriterion("UPT_DT >", value, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPT_DT >=", value, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTLessThan(Integer value) {
            addCriterion("UPT_DT <", value, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTLessThanOrEqualTo(Integer value) {
            addCriterion("UPT_DT <=", value, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTIn(List<Integer> values) {
            addCriterion("UPT_DT in", values, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTNotIn(List<Integer> values) {
            addCriterion("UPT_DT not in", values, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTBetween(Integer value1, Integer value2) {
            addCriterion("UPT_DT between", value1, value2, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_DTNotBetween(Integer value1, Integer value2) {
            addCriterion("UPT_DT not between", value1, value2, "UPT_DT");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRIsNull() {
            addCriterion("UPT_TLR is null");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRIsNotNull() {
            addCriterion("UPT_TLR is not null");
            return (Criteria) this;
        }

        public Criteria andUPT_TLREqualTo(String value) {
            addCriterion("UPT_TLR =", value, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRNotEqualTo(String value) {
            addCriterion("UPT_TLR <>", value, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRGreaterThan(String value) {
            addCriterion("UPT_TLR >", value, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRGreaterThanOrEqualTo(String value) {
            addCriterion("UPT_TLR >=", value, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRLessThan(String value) {
            addCriterion("UPT_TLR <", value, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRLessThanOrEqualTo(String value) {
            addCriterion("UPT_TLR <=", value, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRLike(String value) {
            addCriterion("UPT_TLR like", value, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRNotLike(String value) {
            addCriterion("UPT_TLR not like", value, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRIn(List<String> values) {
            addCriterion("UPT_TLR in", values, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRNotIn(List<String> values) {
            addCriterion("UPT_TLR not in", values, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRBetween(String value1, String value2) {
            addCriterion("UPT_TLR between", value1, value2, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andUPT_TLRNotBetween(String value1, String value2) {
            addCriterion("UPT_TLR not between", value1, value2, "UPT_TLR");
            return (Criteria) this;
        }

        public Criteria andFAXIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFAXIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFAXEqualTo(String value) {
            addCriterion("FAX =", value, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXNotEqualTo(String value) {
            addCriterion("FAX <>", value, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXGreaterThan(String value) {
            addCriterion("FAX >", value, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXLessThan(String value) {
            addCriterion("FAX <", value, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXLike(String value) {
            addCriterion("FAX like", value, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXNotLike(String value) {
            addCriterion("FAX not like", value, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXIn(List<String> values) {
            addCriterion("FAX in", values, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXNotIn(List<String> values) {
            addCriterion("FAX not in", values, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "FAX");
            return (Criteria) this;
        }

        public Criteria andFAXNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "FAX");
            return (Criteria) this;
        }

        public Criteria andTELEXIsNull() {
            addCriterion("TELEX is null");
            return (Criteria) this;
        }

        public Criteria andTELEXIsNotNull() {
            addCriterion("TELEX is not null");
            return (Criteria) this;
        }

        public Criteria andTELEXEqualTo(String value) {
            addCriterion("TELEX =", value, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXNotEqualTo(String value) {
            addCriterion("TELEX <>", value, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXGreaterThan(String value) {
            addCriterion("TELEX >", value, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXGreaterThanOrEqualTo(String value) {
            addCriterion("TELEX >=", value, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXLessThan(String value) {
            addCriterion("TELEX <", value, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXLessThanOrEqualTo(String value) {
            addCriterion("TELEX <=", value, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXLike(String value) {
            addCriterion("TELEX like", value, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXNotLike(String value) {
            addCriterion("TELEX not like", value, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXIn(List<String> values) {
            addCriterion("TELEX in", values, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXNotIn(List<String> values) {
            addCriterion("TELEX not in", values, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXBetween(String value1, String value2) {
            addCriterion("TELEX between", value1, value2, "TELEX");
            return (Criteria) this;
        }

        public Criteria andTELEXNotBetween(String value1, String value2) {
            addCriterion("TELEX not between", value1, value2, "TELEX");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGIsNull() {
            addCriterion("PRO_FLG is null");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGIsNotNull() {
            addCriterion("PRO_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGEqualTo(String value) {
            addCriterion("PRO_FLG =", value, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGNotEqualTo(String value) {
            addCriterion("PRO_FLG <>", value, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGGreaterThan(String value) {
            addCriterion("PRO_FLG >", value, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_FLG >=", value, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGLessThan(String value) {
            addCriterion("PRO_FLG <", value, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGLessThanOrEqualTo(String value) {
            addCriterion("PRO_FLG <=", value, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGLike(String value) {
            addCriterion("PRO_FLG like", value, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGNotLike(String value) {
            addCriterion("PRO_FLG not like", value, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGIn(List<String> values) {
            addCriterion("PRO_FLG in", values, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGNotIn(List<String> values) {
            addCriterion("PRO_FLG not in", values, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGBetween(String value1, String value2) {
            addCriterion("PRO_FLG between", value1, value2, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andPRO_FLGNotBetween(String value1, String value2) {
            addCriterion("PRO_FLG not between", value1, value2, "PRO_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGIsNull() {
            addCriterion("COST_FLG is null");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGIsNotNull() {
            addCriterion("COST_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGEqualTo(String value) {
            addCriterion("COST_FLG =", value, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGNotEqualTo(String value) {
            addCriterion("COST_FLG <>", value, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGGreaterThan(String value) {
            addCriterion("COST_FLG >", value, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("COST_FLG >=", value, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGLessThan(String value) {
            addCriterion("COST_FLG <", value, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGLessThanOrEqualTo(String value) {
            addCriterion("COST_FLG <=", value, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGLike(String value) {
            addCriterion("COST_FLG like", value, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGNotLike(String value) {
            addCriterion("COST_FLG not like", value, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGIn(List<String> values) {
            addCriterion("COST_FLG in", values, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGNotIn(List<String> values) {
            addCriterion("COST_FLG not in", values, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGBetween(String value1, String value2) {
            addCriterion("COST_FLG between", value1, value2, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andCOST_FLGNotBetween(String value1, String value2) {
            addCriterion("COST_FLG not between", value1, value2, "COST_FLG");
            return (Criteria) this;
        }

        public Criteria andGL_MSTIsNull() {
            addCriterion("GL_MST is null");
            return (Criteria) this;
        }

        public Criteria andGL_MSTIsNotNull() {
            addCriterion("GL_MST is not null");
            return (Criteria) this;
        }

        public Criteria andGL_MSTEqualTo(Integer value) {
            addCriterion("GL_MST =", value, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTNotEqualTo(Integer value) {
            addCriterion("GL_MST <>", value, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTGreaterThan(Integer value) {
            addCriterion("GL_MST >", value, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTGreaterThanOrEqualTo(Integer value) {
            addCriterion("GL_MST >=", value, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTLessThan(Integer value) {
            addCriterion("GL_MST <", value, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTLessThanOrEqualTo(Integer value) {
            addCriterion("GL_MST <=", value, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTIn(List<Integer> values) {
            addCriterion("GL_MST in", values, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTNotIn(List<Integer> values) {
            addCriterion("GL_MST not in", values, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTBetween(Integer value1, Integer value2) {
            addCriterion("GL_MST between", value1, value2, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andGL_MSTNotBetween(Integer value1, Integer value2) {
            addCriterion("GL_MST not between", value1, value2, "GL_MST");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRIsNull() {
            addCriterion("DEF_PTR is null");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRIsNotNull() {
            addCriterion("DEF_PTR is not null");
            return (Criteria) this;
        }

        public Criteria andDEF_PTREqualTo(String value) {
            addCriterion("DEF_PTR =", value, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRNotEqualTo(String value) {
            addCriterion("DEF_PTR <>", value, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRGreaterThan(String value) {
            addCriterion("DEF_PTR >", value, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRGreaterThanOrEqualTo(String value) {
            addCriterion("DEF_PTR >=", value, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRLessThan(String value) {
            addCriterion("DEF_PTR <", value, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRLessThanOrEqualTo(String value) {
            addCriterion("DEF_PTR <=", value, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRLike(String value) {
            addCriterion("DEF_PTR like", value, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRNotLike(String value) {
            addCriterion("DEF_PTR not like", value, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRIn(List<String> values) {
            addCriterion("DEF_PTR in", values, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRNotIn(List<String> values) {
            addCriterion("DEF_PTR not in", values, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRBetween(String value1, String value2) {
            addCriterion("DEF_PTR between", value1, value2, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andDEF_PTRNotBetween(String value1, String value2) {
            addCriterion("DEF_PTR not between", value1, value2, "DEF_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRIsNull() {
            addCriterion("PAY_PTR is null");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRIsNotNull() {
            addCriterion("PAY_PTR is not null");
            return (Criteria) this;
        }

        public Criteria andPAY_PTREqualTo(String value) {
            addCriterion("PAY_PTR =", value, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRNotEqualTo(String value) {
            addCriterion("PAY_PTR <>", value, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRGreaterThan(String value) {
            addCriterion("PAY_PTR >", value, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PTR >=", value, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRLessThan(String value) {
            addCriterion("PAY_PTR <", value, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRLessThanOrEqualTo(String value) {
            addCriterion("PAY_PTR <=", value, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRLike(String value) {
            addCriterion("PAY_PTR like", value, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRNotLike(String value) {
            addCriterion("PAY_PTR not like", value, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRIn(List<String> values) {
            addCriterion("PAY_PTR in", values, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRNotIn(List<String> values) {
            addCriterion("PAY_PTR not in", values, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRBetween(String value1, String value2) {
            addCriterion("PAY_PTR between", value1, value2, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andPAY_PTRNotBetween(String value1, String value2) {
            addCriterion("PAY_PTR not between", value1, value2, "PAY_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRIsNull() {
            addCriterion("CFM_PTR is null");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRIsNotNull() {
            addCriterion("CFM_PTR is not null");
            return (Criteria) this;
        }

        public Criteria andCFM_PTREqualTo(String value) {
            addCriterion("CFM_PTR =", value, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRNotEqualTo(String value) {
            addCriterion("CFM_PTR <>", value, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRGreaterThan(String value) {
            addCriterion("CFM_PTR >", value, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRGreaterThanOrEqualTo(String value) {
            addCriterion("CFM_PTR >=", value, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRLessThan(String value) {
            addCriterion("CFM_PTR <", value, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRLessThanOrEqualTo(String value) {
            addCriterion("CFM_PTR <=", value, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRLike(String value) {
            addCriterion("CFM_PTR like", value, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRNotLike(String value) {
            addCriterion("CFM_PTR not like", value, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRIn(List<String> values) {
            addCriterion("CFM_PTR in", values, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRNotIn(List<String> values) {
            addCriterion("CFM_PTR not in", values, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRBetween(String value1, String value2) {
            addCriterion("CFM_PTR between", value1, value2, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andCFM_PTRNotBetween(String value1, String value2) {
            addCriterion("CFM_PTR not between", value1, value2, "CFM_PTR");
            return (Criteria) this;
        }

        public Criteria andSWF_IDIsNull() {
            addCriterion("SWF_ID is null");
            return (Criteria) this;
        }

        public Criteria andSWF_IDIsNotNull() {
            addCriterion("SWF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSWF_IDEqualTo(String value) {
            addCriterion("SWF_ID =", value, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDNotEqualTo(String value) {
            addCriterion("SWF_ID <>", value, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDGreaterThan(String value) {
            addCriterion("SWF_ID >", value, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDGreaterThanOrEqualTo(String value) {
            addCriterion("SWF_ID >=", value, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDLessThan(String value) {
            addCriterion("SWF_ID <", value, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDLessThanOrEqualTo(String value) {
            addCriterion("SWF_ID <=", value, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDLike(String value) {
            addCriterion("SWF_ID like", value, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDNotLike(String value) {
            addCriterion("SWF_ID not like", value, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDIn(List<String> values) {
            addCriterion("SWF_ID in", values, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDNotIn(List<String> values) {
            addCriterion("SWF_ID not in", values, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDBetween(String value1, String value2) {
            addCriterion("SWF_ID between", value1, value2, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andSWF_IDNotBetween(String value1, String value2) {
            addCriterion("SWF_ID not between", value1, value2, "SWF_ID");
            return (Criteria) this;
        }

        public Criteria andBIC_NOIsNull() {
            addCriterion("BIC_NO is null");
            return (Criteria) this;
        }

        public Criteria andBIC_NOIsNotNull() {
            addCriterion("BIC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBIC_NOEqualTo(String value) {
            addCriterion("BIC_NO =", value, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NONotEqualTo(String value) {
            addCriterion("BIC_NO <>", value, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NOGreaterThan(String value) {
            addCriterion("BIC_NO >", value, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NOGreaterThanOrEqualTo(String value) {
            addCriterion("BIC_NO >=", value, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NOLessThan(String value) {
            addCriterion("BIC_NO <", value, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NOLessThanOrEqualTo(String value) {
            addCriterion("BIC_NO <=", value, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NOLike(String value) {
            addCriterion("BIC_NO like", value, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NONotLike(String value) {
            addCriterion("BIC_NO not like", value, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NOIn(List<String> values) {
            addCriterion("BIC_NO in", values, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NONotIn(List<String> values) {
            addCriterion("BIC_NO not in", values, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NOBetween(String value1, String value2) {
            addCriterion("BIC_NO between", value1, value2, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andBIC_NONotBetween(String value1, String value2) {
            addCriterion("BIC_NO not between", value1, value2, "BIC_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOIsNull() {
            addCriterion("IBAN_NO is null");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOIsNotNull() {
            addCriterion("IBAN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOEqualTo(String value) {
            addCriterion("IBAN_NO =", value, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NONotEqualTo(String value) {
            addCriterion("IBAN_NO <>", value, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOGreaterThan(String value) {
            addCriterion("IBAN_NO >", value, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOGreaterThanOrEqualTo(String value) {
            addCriterion("IBAN_NO >=", value, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOLessThan(String value) {
            addCriterion("IBAN_NO <", value, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOLessThanOrEqualTo(String value) {
            addCriterion("IBAN_NO <=", value, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOLike(String value) {
            addCriterion("IBAN_NO like", value, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NONotLike(String value) {
            addCriterion("IBAN_NO not like", value, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOIn(List<String> values) {
            addCriterion("IBAN_NO in", values, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NONotIn(List<String> values) {
            addCriterion("IBAN_NO not in", values, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NOBetween(String value1, String value2) {
            addCriterion("IBAN_NO between", value1, value2, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andIBAN_NONotBetween(String value1, String value2) {
            addCriterion("IBAN_NO not between", value1, value2, "IBAN_NO");
            return (Criteria) this;
        }

        public Criteria andCI_LENIsNull() {
            addCriterion("CI_LEN is null");
            return (Criteria) this;
        }

        public Criteria andCI_LENIsNotNull() {
            addCriterion("CI_LEN is not null");
            return (Criteria) this;
        }

        public Criteria andCI_LENEqualTo(Integer value) {
            addCriterion("CI_LEN =", value, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENNotEqualTo(Integer value) {
            addCriterion("CI_LEN <>", value, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENGreaterThan(Integer value) {
            addCriterion("CI_LEN >", value, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENGreaterThanOrEqualTo(Integer value) {
            addCriterion("CI_LEN >=", value, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENLessThan(Integer value) {
            addCriterion("CI_LEN <", value, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENLessThanOrEqualTo(Integer value) {
            addCriterion("CI_LEN <=", value, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENIn(List<Integer> values) {
            addCriterion("CI_LEN in", values, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENNotIn(List<Integer> values) {
            addCriterion("CI_LEN not in", values, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENBetween(Integer value1, Integer value2) {
            addCriterion("CI_LEN between", value1, value2, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCI_LENNotBetween(Integer value1, Integer value2) {
            addCriterion("CI_LEN not between", value1, value2, "CI_LEN");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDIsNull() {
            addCriterion("COUN_CD is null");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDIsNotNull() {
            addCriterion("COUN_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDEqualTo(String value) {
            addCriterion("COUN_CD =", value, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDNotEqualTo(String value) {
            addCriterion("COUN_CD <>", value, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDGreaterThan(String value) {
            addCriterion("COUN_CD >", value, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDGreaterThanOrEqualTo(String value) {
            addCriterion("COUN_CD >=", value, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDLessThan(String value) {
            addCriterion("COUN_CD <", value, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDLessThanOrEqualTo(String value) {
            addCriterion("COUN_CD <=", value, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDLike(String value) {
            addCriterion("COUN_CD like", value, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDNotLike(String value) {
            addCriterion("COUN_CD not like", value, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDIn(List<String> values) {
            addCriterion("COUN_CD in", values, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDNotIn(List<String> values) {
            addCriterion("COUN_CD not in", values, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDBetween(String value1, String value2) {
            addCriterion("COUN_CD between", value1, value2, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCOUN_CDNotBetween(String value1, String value2) {
            addCriterion("COUN_CD not between", value1, value2, "COUN_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDIsNull() {
            addCriterion("CITY_CD is null");
            return (Criteria) this;
        }

        public Criteria andCITY_CDIsNotNull() {
            addCriterion("CITY_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCITY_CDEqualTo(String value) {
            addCriterion("CITY_CD =", value, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDNotEqualTo(String value) {
            addCriterion("CITY_CD <>", value, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDGreaterThan(String value) {
            addCriterion("CITY_CD >", value, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CD >=", value, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDLessThan(String value) {
            addCriterion("CITY_CD <", value, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDLessThanOrEqualTo(String value) {
            addCriterion("CITY_CD <=", value, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDLike(String value) {
            addCriterion("CITY_CD like", value, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDNotLike(String value) {
            addCriterion("CITY_CD not like", value, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDIn(List<String> values) {
            addCriterion("CITY_CD in", values, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDNotIn(List<String> values) {
            addCriterion("CITY_CD not in", values, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDBetween(String value1, String value2) {
            addCriterion("CITY_CD between", value1, value2, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andCITY_CDNotBetween(String value1, String value2) {
            addCriterion("CITY_CD not between", value1, value2, "CITY_CD");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLIsNull() {
            addCriterion("UNSCH_HOL is null");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLIsNotNull() {
            addCriterion("UNSCH_HOL is not null");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLEqualTo(String value) {
            addCriterion("UNSCH_HOL =", value, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLNotEqualTo(String value) {
            addCriterion("UNSCH_HOL <>", value, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLGreaterThan(String value) {
            addCriterion("UNSCH_HOL >", value, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLGreaterThanOrEqualTo(String value) {
            addCriterion("UNSCH_HOL >=", value, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLLessThan(String value) {
            addCriterion("UNSCH_HOL <", value, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLLessThanOrEqualTo(String value) {
            addCriterion("UNSCH_HOL <=", value, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLLike(String value) {
            addCriterion("UNSCH_HOL like", value, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLNotLike(String value) {
            addCriterion("UNSCH_HOL not like", value, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLIn(List<String> values) {
            addCriterion("UNSCH_HOL in", values, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLNotIn(List<String> values) {
            addCriterion("UNSCH_HOL not in", values, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLBetween(String value1, String value2) {
            addCriterion("UNSCH_HOL between", value1, value2, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOLNotBetween(String value1, String value2) {
            addCriterion("UNSCH_HOL not between", value1, value2, "UNSCH_HOL");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMIsNull() {
            addCriterion("UNSCH_HOL_TM is null");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMIsNotNull() {
            addCriterion("UNSCH_HOL_TM is not null");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMEqualTo(Integer value) {
            addCriterion("UNSCH_HOL_TM =", value, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMNotEqualTo(Integer value) {
            addCriterion("UNSCH_HOL_TM <>", value, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMGreaterThan(Integer value) {
            addCriterion("UNSCH_HOL_TM >", value, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNSCH_HOL_TM >=", value, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMLessThan(Integer value) {
            addCriterion("UNSCH_HOL_TM <", value, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMLessThanOrEqualTo(Integer value) {
            addCriterion("UNSCH_HOL_TM <=", value, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMIn(List<Integer> values) {
            addCriterion("UNSCH_HOL_TM in", values, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMNotIn(List<Integer> values) {
            addCriterion("UNSCH_HOL_TM not in", values, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMBetween(Integer value1, Integer value2) {
            addCriterion("UNSCH_HOL_TM between", value1, value2, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andUNSCH_HOL_TMNotBetween(Integer value1, Integer value2) {
            addCriterion("UNSCH_HOL_TM not between", value1, value2, "UNSCH_HOL_TM");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGIsNull() {
            addCriterion("OPN_CHECK_FLG is null");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGIsNotNull() {
            addCriterion("OPN_CHECK_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGEqualTo(String value) {
            addCriterion("OPN_CHECK_FLG =", value, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGNotEqualTo(String value) {
            addCriterion("OPN_CHECK_FLG <>", value, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGGreaterThan(String value) {
            addCriterion("OPN_CHECK_FLG >", value, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("OPN_CHECK_FLG >=", value, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGLessThan(String value) {
            addCriterion("OPN_CHECK_FLG <", value, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGLessThanOrEqualTo(String value) {
            addCriterion("OPN_CHECK_FLG <=", value, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGLike(String value) {
            addCriterion("OPN_CHECK_FLG like", value, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGNotLike(String value) {
            addCriterion("OPN_CHECK_FLG not like", value, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGIn(List<String> values) {
            addCriterion("OPN_CHECK_FLG in", values, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGNotIn(List<String> values) {
            addCriterion("OPN_CHECK_FLG not in", values, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGBetween(String value1, String value2) {
            addCriterion("OPN_CHECK_FLG between", value1, value2, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andOPN_CHECK_FLGNotBetween(String value1, String value2) {
            addCriterion("OPN_CHECK_FLG not between", value1, value2, "OPN_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGIsNull() {
            addCriterion("VOU_CHECK_FLG is null");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGIsNotNull() {
            addCriterion("VOU_CHECK_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGEqualTo(String value) {
            addCriterion("VOU_CHECK_FLG =", value, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGNotEqualTo(String value) {
            addCriterion("VOU_CHECK_FLG <>", value, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGGreaterThan(String value) {
            addCriterion("VOU_CHECK_FLG >", value, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("VOU_CHECK_FLG >=", value, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGLessThan(String value) {
            addCriterion("VOU_CHECK_FLG <", value, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGLessThanOrEqualTo(String value) {
            addCriterion("VOU_CHECK_FLG <=", value, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGLike(String value) {
            addCriterion("VOU_CHECK_FLG like", value, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGNotLike(String value) {
            addCriterion("VOU_CHECK_FLG not like", value, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGIn(List<String> values) {
            addCriterion("VOU_CHECK_FLG in", values, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGNotIn(List<String> values) {
            addCriterion("VOU_CHECK_FLG not in", values, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGBetween(String value1, String value2) {
            addCriterion("VOU_CHECK_FLG between", value1, value2, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andVOU_CHECK_FLGNotBetween(String value1, String value2) {
            addCriterion("VOU_CHECK_FLG not between", value1, value2, "VOU_CHECK_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGIsNull() {
            addCriterion("INT_TAX_FLG is null");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGIsNotNull() {
            addCriterion("INT_TAX_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGEqualTo(String value) {
            addCriterion("INT_TAX_FLG =", value, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGNotEqualTo(String value) {
            addCriterion("INT_TAX_FLG <>", value, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGGreaterThan(String value) {
            addCriterion("INT_TAX_FLG >", value, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("INT_TAX_FLG >=", value, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGLessThan(String value) {
            addCriterion("INT_TAX_FLG <", value, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGLessThanOrEqualTo(String value) {
            addCriterion("INT_TAX_FLG <=", value, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGLike(String value) {
            addCriterion("INT_TAX_FLG like", value, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGNotLike(String value) {
            addCriterion("INT_TAX_FLG not like", value, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGIn(List<String> values) {
            addCriterion("INT_TAX_FLG in", values, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGNotIn(List<String> values) {
            addCriterion("INT_TAX_FLG not in", values, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGBetween(String value1, String value2) {
            addCriterion("INT_TAX_FLG between", value1, value2, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andINT_TAX_FLGNotBetween(String value1, String value2) {
            addCriterion("INT_TAX_FLG not between", value1, value2, "INT_TAX_FLG");
            return (Criteria) this;
        }

        public Criteria andERP_BRANIsNull() {
            addCriterion("ERP_BRAN is null");
            return (Criteria) this;
        }

        public Criteria andERP_BRANIsNotNull() {
            addCriterion("ERP_BRAN is not null");
            return (Criteria) this;
        }

        public Criteria andERP_BRANEqualTo(Integer value) {
            addCriterion("ERP_BRAN =", value, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANNotEqualTo(Integer value) {
            addCriterion("ERP_BRAN <>", value, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANGreaterThan(Integer value) {
            addCriterion("ERP_BRAN >", value, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERP_BRAN >=", value, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANLessThan(Integer value) {
            addCriterion("ERP_BRAN <", value, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANLessThanOrEqualTo(Integer value) {
            addCriterion("ERP_BRAN <=", value, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANIn(List<Integer> values) {
            addCriterion("ERP_BRAN in", values, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANNotIn(List<Integer> values) {
            addCriterion("ERP_BRAN not in", values, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANBetween(Integer value1, Integer value2) {
            addCriterion("ERP_BRAN between", value1, value2, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andERP_BRANNotBetween(Integer value1, Integer value2) {
            addCriterion("ERP_BRAN not between", value1, value2, "ERP_BRAN");
            return (Criteria) this;
        }

        public Criteria andORG_FLGIsNull() {
            addCriterion("ORG_FLG is null");
            return (Criteria) this;
        }

        public Criteria andORG_FLGIsNotNull() {
            addCriterion("ORG_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andORG_FLGEqualTo(String value) {
            addCriterion("ORG_FLG =", value, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGNotEqualTo(String value) {
            addCriterion("ORG_FLG <>", value, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGGreaterThan(String value) {
            addCriterion("ORG_FLG >", value, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_FLG >=", value, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGLessThan(String value) {
            addCriterion("ORG_FLG <", value, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGLessThanOrEqualTo(String value) {
            addCriterion("ORG_FLG <=", value, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGLike(String value) {
            addCriterion("ORG_FLG like", value, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGNotLike(String value) {
            addCriterion("ORG_FLG not like", value, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGIn(List<String> values) {
            addCriterion("ORG_FLG in", values, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGNotIn(List<String> values) {
            addCriterion("ORG_FLG not in", values, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGBetween(String value1, String value2) {
            addCriterion("ORG_FLG between", value1, value2, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andORG_FLGNotBetween(String value1, String value2) {
            addCriterion("ORG_FLG not between", value1, value2, "ORG_FLG");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRIsNull() {
            addCriterion("BRANCH_BR is null");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRIsNotNull() {
            addCriterion("BRANCH_BR is not null");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BREqualTo(Integer value) {
            addCriterion("BRANCH_BR =", value, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRNotEqualTo(Integer value) {
            addCriterion("BRANCH_BR <>", value, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRGreaterThan(Integer value) {
            addCriterion("BRANCH_BR >", value, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRANCH_BR >=", value, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRLessThan(Integer value) {
            addCriterion("BRANCH_BR <", value, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRLessThanOrEqualTo(Integer value) {
            addCriterion("BRANCH_BR <=", value, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRIn(List<Integer> values) {
            addCriterion("BRANCH_BR in", values, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRNotIn(List<Integer> values) {
            addCriterion("BRANCH_BR not in", values, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRBetween(Integer value1, Integer value2) {
            addCriterion("BRANCH_BR between", value1, value2, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andBRANCH_BRNotBetween(Integer value1, Integer value2) {
            addCriterion("BRANCH_BR not between", value1, value2, "BRANCH_BR");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDIsNull() {
            addCriterion("FTZ_CD is null");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDIsNotNull() {
            addCriterion("FTZ_CD is not null");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDEqualTo(String value) {
            addCriterion("FTZ_CD =", value, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDNotEqualTo(String value) {
            addCriterion("FTZ_CD <>", value, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDGreaterThan(String value) {
            addCriterion("FTZ_CD >", value, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDGreaterThanOrEqualTo(String value) {
            addCriterion("FTZ_CD >=", value, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDLessThan(String value) {
            addCriterion("FTZ_CD <", value, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDLessThanOrEqualTo(String value) {
            addCriterion("FTZ_CD <=", value, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDLike(String value) {
            addCriterion("FTZ_CD like", value, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDNotLike(String value) {
            addCriterion("FTZ_CD not like", value, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDIn(List<String> values) {
            addCriterion("FTZ_CD in", values, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDNotIn(List<String> values) {
            addCriterion("FTZ_CD not in", values, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDBetween(String value1, String value2) {
            addCriterion("FTZ_CD between", value1, value2, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andFTZ_CDNotBetween(String value1, String value2) {
            addCriterion("FTZ_CD not between", value1, value2, "FTZ_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDIsNull() {
            addCriterion("BOP_CD is null");
            return (Criteria) this;
        }

        public Criteria andBOP_CDIsNotNull() {
            addCriterion("BOP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andBOP_CDEqualTo(String value) {
            addCriterion("BOP_CD =", value, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDNotEqualTo(String value) {
            addCriterion("BOP_CD <>", value, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDGreaterThan(String value) {
            addCriterion("BOP_CD >", value, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDGreaterThanOrEqualTo(String value) {
            addCriterion("BOP_CD >=", value, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDLessThan(String value) {
            addCriterion("BOP_CD <", value, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDLessThanOrEqualTo(String value) {
            addCriterion("BOP_CD <=", value, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDLike(String value) {
            addCriterion("BOP_CD like", value, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDNotLike(String value) {
            addCriterion("BOP_CD not like", value, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDIn(List<String> values) {
            addCriterion("BOP_CD in", values, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDNotIn(List<String> values) {
            addCriterion("BOP_CD not in", values, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDBetween(String value1, String value2) {
            addCriterion("BOP_CD between", value1, value2, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andBOP_CDNotBetween(String value1, String value2) {
            addCriterion("BOP_CD not between", value1, value2, "BOP_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDIsNull() {
            addCriterion("CIC_CD is null");
            return (Criteria) this;
        }

        public Criteria andCIC_CDIsNotNull() {
            addCriterion("CIC_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCIC_CDEqualTo(String value) {
            addCriterion("CIC_CD =", value, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDNotEqualTo(String value) {
            addCriterion("CIC_CD <>", value, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDGreaterThan(String value) {
            addCriterion("CIC_CD >", value, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDGreaterThanOrEqualTo(String value) {
            addCriterion("CIC_CD >=", value, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDLessThan(String value) {
            addCriterion("CIC_CD <", value, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDLessThanOrEqualTo(String value) {
            addCriterion("CIC_CD <=", value, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDLike(String value) {
            addCriterion("CIC_CD like", value, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDNotLike(String value) {
            addCriterion("CIC_CD not like", value, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDIn(List<String> values) {
            addCriterion("CIC_CD in", values, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDNotIn(List<String> values) {
            addCriterion("CIC_CD not in", values, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDBetween(String value1, String value2) {
            addCriterion("CIC_CD between", value1, value2, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andCIC_CDNotBetween(String value1, String value2) {
            addCriterion("CIC_CD not between", value1, value2, "CIC_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDIsNull() {
            addCriterion("FII_CD is null");
            return (Criteria) this;
        }

        public Criteria andFII_CDIsNotNull() {
            addCriterion("FII_CD is not null");
            return (Criteria) this;
        }

        public Criteria andFII_CDEqualTo(String value) {
            addCriterion("FII_CD =", value, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDNotEqualTo(String value) {
            addCriterion("FII_CD <>", value, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDGreaterThan(String value) {
            addCriterion("FII_CD >", value, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDGreaterThanOrEqualTo(String value) {
            addCriterion("FII_CD >=", value, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDLessThan(String value) {
            addCriterion("FII_CD <", value, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDLessThanOrEqualTo(String value) {
            addCriterion("FII_CD <=", value, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDLike(String value) {
            addCriterion("FII_CD like", value, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDNotLike(String value) {
            addCriterion("FII_CD not like", value, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDIn(List<String> values) {
            addCriterion("FII_CD in", values, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDNotIn(List<String> values) {
            addCriterion("FII_CD not in", values, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDBetween(String value1, String value2) {
            addCriterion("FII_CD between", value1, value2, "FII_CD");
            return (Criteria) this;
        }

        public Criteria andFII_CDNotBetween(String value1, String value2) {
            addCriterion("FII_CD not between", value1, value2, "FII_CD");
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