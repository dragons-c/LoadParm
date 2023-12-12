package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.List;

public class BptgrpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BptgrpExample() {
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

        public Criteria andROLE_CDIsNull() {
            addCriterion("ROLE_CD is null");
            return (Criteria) this;
        }

        public Criteria andROLE_CDIsNotNull() {
            addCriterion("ROLE_CD is not null");
            return (Criteria) this;
        }

        public Criteria andROLE_CDEqualTo(String value) {
            addCriterion("ROLE_CD =", value, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDNotEqualTo(String value) {
            addCriterion("ROLE_CD <>", value, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDGreaterThan(String value) {
            addCriterion("ROLE_CD >", value, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_CD >=", value, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDLessThan(String value) {
            addCriterion("ROLE_CD <", value, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDLessThanOrEqualTo(String value) {
            addCriterion("ROLE_CD <=", value, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDLike(String value) {
            addCriterion("ROLE_CD like", value, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDNotLike(String value) {
            addCriterion("ROLE_CD not like", value, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDIn(List<String> values) {
            addCriterion("ROLE_CD in", values, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDNotIn(List<String> values) {
            addCriterion("ROLE_CD not in", values, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDBetween(String value1, String value2) {
            addCriterion("ROLE_CD between", value1, value2, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CDNotBetween(String value1, String value2) {
            addCriterion("ROLE_CD not between", value1, value2, "ROLE_CD");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMIsNull() {
            addCriterion("ROLE_CNNM is null");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMIsNotNull() {
            addCriterion("ROLE_CNNM is not null");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMEqualTo(String value) {
            addCriterion("ROLE_CNNM =", value, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMNotEqualTo(String value) {
            addCriterion("ROLE_CNNM <>", value, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMGreaterThan(String value) {
            addCriterion("ROLE_CNNM >", value, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_CNNM >=", value, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMLessThan(String value) {
            addCriterion("ROLE_CNNM <", value, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMLessThanOrEqualTo(String value) {
            addCriterion("ROLE_CNNM <=", value, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMLike(String value) {
            addCriterion("ROLE_CNNM like", value, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMNotLike(String value) {
            addCriterion("ROLE_CNNM not like", value, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMIn(List<String> values) {
            addCriterion("ROLE_CNNM in", values, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMNotIn(List<String> values) {
            addCriterion("ROLE_CNNM not in", values, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMBetween(String value1, String value2) {
            addCriterion("ROLE_CNNM between", value1, value2, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNNMNotBetween(String value1, String value2) {
            addCriterion("ROLE_CNNM not between", value1, value2, "ROLE_CNNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMIsNull() {
            addCriterion("ROLE_ENNM is null");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMIsNotNull() {
            addCriterion("ROLE_ENNM is not null");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMEqualTo(String value) {
            addCriterion("ROLE_ENNM =", value, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMNotEqualTo(String value) {
            addCriterion("ROLE_ENNM <>", value, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMGreaterThan(String value) {
            addCriterion("ROLE_ENNM >", value, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ENNM >=", value, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMLessThan(String value) {
            addCriterion("ROLE_ENNM <", value, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ENNM <=", value, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMLike(String value) {
            addCriterion("ROLE_ENNM like", value, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMNotLike(String value) {
            addCriterion("ROLE_ENNM not like", value, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMIn(List<String> values) {
            addCriterion("ROLE_ENNM in", values, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMNotIn(List<String> values) {
            addCriterion("ROLE_ENNM not in", values, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMBetween(String value1, String value2) {
            addCriterion("ROLE_ENNM between", value1, value2, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_ENNMNotBetween(String value1, String value2) {
            addCriterion("ROLE_ENNM not between", value1, value2, "ROLE_ENNM");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSIsNull() {
            addCriterion("ROLE_CNMS is null");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSIsNotNull() {
            addCriterion("ROLE_CNMS is not null");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSEqualTo(String value) {
            addCriterion("ROLE_CNMS =", value, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSNotEqualTo(String value) {
            addCriterion("ROLE_CNMS <>", value, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSGreaterThan(String value) {
            addCriterion("ROLE_CNMS >", value, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_CNMS >=", value, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSLessThan(String value) {
            addCriterion("ROLE_CNMS <", value, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSLessThanOrEqualTo(String value) {
            addCriterion("ROLE_CNMS <=", value, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSLike(String value) {
            addCriterion("ROLE_CNMS like", value, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSNotLike(String value) {
            addCriterion("ROLE_CNMS not like", value, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSIn(List<String> values) {
            addCriterion("ROLE_CNMS in", values, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSNotIn(List<String> values) {
            addCriterion("ROLE_CNMS not in", values, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSBetween(String value1, String value2) {
            addCriterion("ROLE_CNMS between", value1, value2, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_CNMSNotBetween(String value1, String value2) {
            addCriterion("ROLE_CNMS not between", value1, value2, "ROLE_CNMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSIsNull() {
            addCriterion("ROLE_ENMS is null");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSIsNotNull() {
            addCriterion("ROLE_ENMS is not null");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSEqualTo(String value) {
            addCriterion("ROLE_ENMS =", value, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSNotEqualTo(String value) {
            addCriterion("ROLE_ENMS <>", value, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSGreaterThan(String value) {
            addCriterion("ROLE_ENMS >", value, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ENMS >=", value, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSLessThan(String value) {
            addCriterion("ROLE_ENMS <", value, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ENMS <=", value, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSLike(String value) {
            addCriterion("ROLE_ENMS like", value, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSNotLike(String value) {
            addCriterion("ROLE_ENMS not like", value, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSIn(List<String> values) {
            addCriterion("ROLE_ENMS in", values, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSNotIn(List<String> values) {
            addCriterion("ROLE_ENMS not in", values, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSBetween(String value1, String value2) {
            addCriterion("ROLE_ENMS between", value1, value2, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andROLE_ENMSNotBetween(String value1, String value2) {
            addCriterion("ROLE_ENMS not between", value1, value2, "ROLE_ENMS");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGIsNull() {
            addCriterion("ATH_MOV_FLG is null");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGIsNotNull() {
            addCriterion("ATH_MOV_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGEqualTo(String value) {
            addCriterion("ATH_MOV_FLG =", value, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGNotEqualTo(String value) {
            addCriterion("ATH_MOV_FLG <>", value, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGGreaterThan(String value) {
            addCriterion("ATH_MOV_FLG >", value, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("ATH_MOV_FLG >=", value, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGLessThan(String value) {
            addCriterion("ATH_MOV_FLG <", value, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGLessThanOrEqualTo(String value) {
            addCriterion("ATH_MOV_FLG <=", value, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGLike(String value) {
            addCriterion("ATH_MOV_FLG like", value, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGNotLike(String value) {
            addCriterion("ATH_MOV_FLG not like", value, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGIn(List<String> values) {
            addCriterion("ATH_MOV_FLG in", values, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGNotIn(List<String> values) {
            addCriterion("ATH_MOV_FLG not in", values, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGBetween(String value1, String value2) {
            addCriterion("ATH_MOV_FLG between", value1, value2, "ATH_MOV_FLG");
            return (Criteria) this;
        }

        public Criteria andATH_MOV_FLGNotBetween(String value1, String value2) {
            addCriterion("ATH_MOV_FLG not between", value1, value2, "ATH_MOV_FLG");
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