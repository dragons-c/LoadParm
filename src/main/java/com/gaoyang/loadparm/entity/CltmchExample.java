package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CltmchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CltmchExample() {
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

        public Criteria andR_TYPEIsNull() {
            addCriterion("R_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andR_TYPEIsNotNull() {
            addCriterion("R_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andR_TYPEEqualTo(String value) {
            addCriterion("R_TYPE =", value, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPENotEqualTo(String value) {
            addCriterion("R_TYPE <>", value, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPEGreaterThan(String value) {
            addCriterion("R_TYPE >", value, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("R_TYPE >=", value, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPELessThan(String value) {
            addCriterion("R_TYPE <", value, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPELessThanOrEqualTo(String value) {
            addCriterion("R_TYPE <=", value, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPELike(String value) {
            addCriterion("R_TYPE like", value, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPENotLike(String value) {
            addCriterion("R_TYPE not like", value, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPEIn(List<String> values) {
            addCriterion("R_TYPE in", values, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPENotIn(List<String> values) {
            addCriterion("R_TYPE not in", values, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPEBetween(String value1, String value2) {
            addCriterion("R_TYPE between", value1, value2, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andR_TYPENotBetween(String value1, String value2) {
            addCriterion("R_TYPE not between", value1, value2, "r_TYPE");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOIsNull() {
            addCriterion("SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOIsNotNull() {
            addCriterion("SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOEqualTo(Integer value) {
            addCriterion("SEQ_NO =", value, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NONotEqualTo(Integer value) {
            addCriterion("SEQ_NO <>", value, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOGreaterThan(Integer value) {
            addCriterion("SEQ_NO >", value, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQ_NO >=", value, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOLessThan(Integer value) {
            addCriterion("SEQ_NO <", value, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOLessThanOrEqualTo(Integer value) {
            addCriterion("SEQ_NO <=", value, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOIn(List<Integer> values) {
            addCriterion("SEQ_NO in", values, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NONotIn(List<Integer> values) {
            addCriterion("SEQ_NO not in", values, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NOBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_NO between", value1, value2, "SEQ_NO");
            return (Criteria) this;
        }

        public Criteria andSEQ_NONotBetween(Integer value1, Integer value2) {
            addCriterion("SEQ_NO not between", value1, value2, "SEQ_NO");
            return (Criteria) this;
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

        public Criteria andCI_NOIsNull() {
            addCriterion("CI_NO is null");
            return (Criteria) this;
        }

        public Criteria andCI_NOIsNotNull() {
            addCriterion("CI_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCI_NOEqualTo(String value) {
            addCriterion("CI_NO =", value, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NONotEqualTo(String value) {
            addCriterion("CI_NO <>", value, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NOGreaterThan(String value) {
            addCriterion("CI_NO >", value, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NOGreaterThanOrEqualTo(String value) {
            addCriterion("CI_NO >=", value, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NOLessThan(String value) {
            addCriterion("CI_NO <", value, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NOLessThanOrEqualTo(String value) {
            addCriterion("CI_NO <=", value, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NOLike(String value) {
            addCriterion("CI_NO like", value, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NONotLike(String value) {
            addCriterion("CI_NO not like", value, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NOIn(List<String> values) {
            addCriterion("CI_NO in", values, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NONotIn(List<String> values) {
            addCriterion("CI_NO not in", values, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NOBetween(String value1, String value2) {
            addCriterion("CI_NO between", value1, value2, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andCI_NONotBetween(String value1, String value2) {
            addCriterion("CI_NO not between", value1, value2, "CI_NO");
            return (Criteria) this;
        }

        public Criteria andPROD_CODEIsNull() {
            addCriterion("PROD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPROD_CODEIsNotNull() {
            addCriterion("PROD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPROD_CODEEqualTo(String value) {
            addCriterion("PROD_CODE =", value, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODENotEqualTo(String value) {
            addCriterion("PROD_CODE <>", value, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODEGreaterThan(String value) {
            addCriterion("PROD_CODE >", value, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_CODE >=", value, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODELessThan(String value) {
            addCriterion("PROD_CODE <", value, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODELessThanOrEqualTo(String value) {
            addCriterion("PROD_CODE <=", value, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODELike(String value) {
            addCriterion("PROD_CODE like", value, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODENotLike(String value) {
            addCriterion("PROD_CODE not like", value, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODEIn(List<String> values) {
            addCriterion("PROD_CODE in", values, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODENotIn(List<String> values) {
            addCriterion("PROD_CODE not in", values, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODEBetween(String value1, String value2) {
            addCriterion("PROD_CODE between", value1, value2, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andPROD_CODENotBetween(String value1, String value2) {
            addCriterion("PROD_CODE not between", value1, value2, "PROD_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODEIsNull() {
            addCriterion("LMT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLMT_CODEIsNotNull() {
            addCriterion("LMT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLMT_CODEEqualTo(String value) {
            addCriterion("LMT_CODE =", value, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODENotEqualTo(String value) {
            addCriterion("LMT_CODE <>", value, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODEGreaterThan(String value) {
            addCriterion("LMT_CODE >", value, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODEGreaterThanOrEqualTo(String value) {
            addCriterion("LMT_CODE >=", value, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODELessThan(String value) {
            addCriterion("LMT_CODE <", value, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODELessThanOrEqualTo(String value) {
            addCriterion("LMT_CODE <=", value, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODELike(String value) {
            addCriterion("LMT_CODE like", value, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODENotLike(String value) {
            addCriterion("LMT_CODE not like", value, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODEIn(List<String> values) {
            addCriterion("LMT_CODE in", values, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODENotIn(List<String> values) {
            addCriterion("LMT_CODE not in", values, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODEBetween(String value1, String value2) {
            addCriterion("LMT_CODE between", value1, value2, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andLMT_CODENotBetween(String value1, String value2) {
            addCriterion("LMT_CODE not between", value1, value2, "LMT_CODE");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSIsNull() {
            addCriterion("REC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSIsNotNull() {
            addCriterion("REC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSEqualTo(String value) {
            addCriterion("REC_STATUS =", value, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSNotEqualTo(String value) {
            addCriterion("REC_STATUS <>", value, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSGreaterThan(String value) {
            addCriterion("REC_STATUS >", value, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSGreaterThanOrEqualTo(String value) {
            addCriterion("REC_STATUS >=", value, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSLessThan(String value) {
            addCriterion("REC_STATUS <", value, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSLessThanOrEqualTo(String value) {
            addCriterion("REC_STATUS <=", value, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSLike(String value) {
            addCriterion("REC_STATUS like", value, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSNotLike(String value) {
            addCriterion("REC_STATUS not like", value, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSIn(List<String> values) {
            addCriterion("REC_STATUS in", values, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSNotIn(List<String> values) {
            addCriterion("REC_STATUS not in", values, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSBetween(String value1, String value2) {
            addCriterion("REC_STATUS between", value1, value2, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andREC_STATUSNotBetween(String value1, String value2) {
            addCriterion("REC_STATUS not between", value1, value2, "REC_STATUS");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITIsNull() {
            addCriterion("UNCONFMD_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITIsNotNull() {
            addCriterion("UNCONFMD_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITEqualTo(Integer value) {
            addCriterion("UNCONFMD_UNIT =", value, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITNotEqualTo(Integer value) {
            addCriterion("UNCONFMD_UNIT <>", value, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITGreaterThan(Integer value) {
            addCriterion("UNCONFMD_UNIT >", value, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNCONFMD_UNIT >=", value, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITLessThan(Integer value) {
            addCriterion("UNCONFMD_UNIT <", value, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITLessThanOrEqualTo(Integer value) {
            addCriterion("UNCONFMD_UNIT <=", value, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITIn(List<Integer> values) {
            addCriterion("UNCONFMD_UNIT in", values, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITNotIn(List<Integer> values) {
            addCriterion("UNCONFMD_UNIT not in", values, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITBetween(Integer value1, Integer value2) {
            addCriterion("UNCONFMD_UNIT between", value1, value2, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andUNCONFMD_UNITNotBetween(Integer value1, Integer value2) {
            addCriterion("UNCONFMD_UNIT not between", value1, value2, "UNCONFMD_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATEIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATEIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATEEqualTo(Integer value) {
            addCriterion("CREATE_DATE =", value, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATENotEqualTo(Integer value) {
            addCriterion("CREATE_DATE <>", value, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATEGreaterThan(Integer value) {
            addCriterion("CREATE_DATE >", value, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_DATE >=", value, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATELessThan(Integer value) {
            addCriterion("CREATE_DATE <", value, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATELessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_DATE <=", value, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATEIn(List<Integer> values) {
            addCriterion("CREATE_DATE in", values, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATENotIn(List<Integer> values) {
            addCriterion("CREATE_DATE not in", values, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATEBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_DATE between", value1, value2, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "CREATE_DATE");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLIsNull() {
            addCriterion("CREATE_TL is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLIsNotNull() {
            addCriterion("CREATE_TL is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLEqualTo(String value) {
            addCriterion("CREATE_TL =", value, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLNotEqualTo(String value) {
            addCriterion("CREATE_TL <>", value, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLGreaterThan(String value) {
            addCriterion("CREATE_TL >", value, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TL >=", value, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLLessThan(String value) {
            addCriterion("CREATE_TL <", value, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TL <=", value, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLLike(String value) {
            addCriterion("CREATE_TL like", value, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLNotLike(String value) {
            addCriterion("CREATE_TL not like", value, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLIn(List<String> values) {
            addCriterion("CREATE_TL in", values, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLNotIn(List<String> values) {
            addCriterion("CREATE_TL not in", values, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLBetween(String value1, String value2) {
            addCriterion("CREATE_TL between", value1, value2, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLNotBetween(String value1, String value2) {
            addCriterion("CREATE_TL not between", value1, value2, "CREATE_TL");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITIsNull() {
            addCriterion("CREATE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITIsNotNull() {
            addCriterion("CREATE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITEqualTo(Integer value) {
            addCriterion("CREATE_UNIT =", value, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITNotEqualTo(Integer value) {
            addCriterion("CREATE_UNIT <>", value, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITGreaterThan(Integer value) {
            addCriterion("CREATE_UNIT >", value, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_UNIT >=", value, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITLessThan(Integer value) {
            addCriterion("CREATE_UNIT <", value, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_UNIT <=", value, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITIn(List<Integer> values) {
            addCriterion("CREATE_UNIT in", values, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITNotIn(List<Integer> values) {
            addCriterion("CREATE_UNIT not in", values, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_UNIT between", value1, value2, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCREATE_UNITNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_UNIT not between", value1, value2, "CREATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATEIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATEIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATEEqualTo(Integer value) {
            addCriterion("UPDATE_DATE =", value, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATENotEqualTo(Integer value) {
            addCriterion("UPDATE_DATE <>", value, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATEGreaterThan(Integer value) {
            addCriterion("UPDATE_DATE >", value, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_DATE >=", value, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATELessThan(Integer value) {
            addCriterion("UPDATE_DATE <", value, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATELessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_DATE <=", value, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATEIn(List<Integer> values) {
            addCriterion("UPDATE_DATE in", values, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATENotIn(List<Integer> values) {
            addCriterion("UPDATE_DATE not in", values, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATEBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "UPDATE_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLIsNull() {
            addCriterion("UPDATE_TL is null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLIsNotNull() {
            addCriterion("UPDATE_TL is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLEqualTo(String value) {
            addCriterion("UPDATE_TL =", value, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLNotEqualTo(String value) {
            addCriterion("UPDATE_TL <>", value, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLGreaterThan(String value) {
            addCriterion("UPDATE_TL >", value, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_TL >=", value, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLLessThan(String value) {
            addCriterion("UPDATE_TL <", value, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_TL <=", value, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLLike(String value) {
            addCriterion("UPDATE_TL like", value, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLNotLike(String value) {
            addCriterion("UPDATE_TL not like", value, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLIn(List<String> values) {
            addCriterion("UPDATE_TL in", values, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLNotIn(List<String> values) {
            addCriterion("UPDATE_TL not in", values, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLBetween(String value1, String value2) {
            addCriterion("UPDATE_TL between", value1, value2, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_TLNotBetween(String value1, String value2) {
            addCriterion("UPDATE_TL not between", value1, value2, "UPDATE_TL");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITIsNull() {
            addCriterion("UPDATE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITIsNotNull() {
            addCriterion("UPDATE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITEqualTo(Integer value) {
            addCriterion("UPDATE_UNIT =", value, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITNotEqualTo(Integer value) {
            addCriterion("UPDATE_UNIT <>", value, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITGreaterThan(Integer value) {
            addCriterion("UPDATE_UNIT >", value, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_UNIT >=", value, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITLessThan(Integer value) {
            addCriterion("UPDATE_UNIT <", value, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITLessThanOrEqualTo(Integer value) {
            addCriterion("UPDATE_UNIT <=", value, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITIn(List<Integer> values) {
            addCriterion("UPDATE_UNIT in", values, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITNotIn(List<Integer> values) {
            addCriterion("UPDATE_UNIT not in", values, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_UNIT between", value1, value2, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andUPDATE_UNITNotBetween(Integer value1, Integer value2) {
            addCriterion("UPDATE_UNIT not between", value1, value2, "UPDATE_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITIsNull() {
            addCriterion("CONF_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITIsNotNull() {
            addCriterion("CONF_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITEqualTo(Integer value) {
            addCriterion("CONF_UNIT =", value, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITNotEqualTo(Integer value) {
            addCriterion("CONF_UNIT <>", value, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITGreaterThan(Integer value) {
            addCriterion("CONF_UNIT >", value, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONF_UNIT >=", value, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITLessThan(Integer value) {
            addCriterion("CONF_UNIT <", value, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITLessThanOrEqualTo(Integer value) {
            addCriterion("CONF_UNIT <=", value, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITIn(List<Integer> values) {
            addCriterion("CONF_UNIT in", values, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITNotIn(List<Integer> values) {
            addCriterion("CONF_UNIT not in", values, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITBetween(Integer value1, Integer value2) {
            addCriterion("CONF_UNIT between", value1, value2, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_UNITNotBetween(Integer value1, Integer value2) {
            addCriterion("CONF_UNIT not between", value1, value2, "CONF_UNIT");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPIsNull() {
            addCriterion("CONF_SUP is null");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPIsNotNull() {
            addCriterion("CONF_SUP is not null");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPEqualTo(String value) {
            addCriterion("CONF_SUP =", value, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPNotEqualTo(String value) {
            addCriterion("CONF_SUP <>", value, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPGreaterThan(String value) {
            addCriterion("CONF_SUP >", value, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPGreaterThanOrEqualTo(String value) {
            addCriterion("CONF_SUP >=", value, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPLessThan(String value) {
            addCriterion("CONF_SUP <", value, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPLessThanOrEqualTo(String value) {
            addCriterion("CONF_SUP <=", value, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPLike(String value) {
            addCriterion("CONF_SUP like", value, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPNotLike(String value) {
            addCriterion("CONF_SUP not like", value, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPIn(List<String> values) {
            addCriterion("CONF_SUP in", values, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPNotIn(List<String> values) {
            addCriterion("CONF_SUP not in", values, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPBetween(String value1, String value2) {
            addCriterion("CONF_SUP between", value1, value2, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_SUPNotBetween(String value1, String value2) {
            addCriterion("CONF_SUP not between", value1, value2, "CONF_SUP");
            return (Criteria) this;
        }

        public Criteria andCONF_DATEIsNull() {
            addCriterion("CONF_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCONF_DATEIsNotNull() {
            addCriterion("CONF_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCONF_DATEEqualTo(Integer value) {
            addCriterion("CONF_DATE =", value, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATENotEqualTo(Integer value) {
            addCriterion("CONF_DATE <>", value, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATEGreaterThan(Integer value) {
            addCriterion("CONF_DATE >", value, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONF_DATE >=", value, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATELessThan(Integer value) {
            addCriterion("CONF_DATE <", value, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATELessThanOrEqualTo(Integer value) {
            addCriterion("CONF_DATE <=", value, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATEIn(List<Integer> values) {
            addCriterion("CONF_DATE in", values, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATENotIn(List<Integer> values) {
            addCriterion("CONF_DATE not in", values, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATEBetween(Integer value1, Integer value2) {
            addCriterion("CONF_DATE between", value1, value2, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andCONF_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("CONF_DATE not between", value1, value2, "CONF_DATE");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1IsNull() {
            addCriterion("OVER_SUP1 is null");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1IsNotNull() {
            addCriterion("OVER_SUP1 is not null");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1EqualTo(String value) {
            addCriterion("OVER_SUP1 =", value, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1NotEqualTo(String value) {
            addCriterion("OVER_SUP1 <>", value, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1GreaterThan(String value) {
            addCriterion("OVER_SUP1 >", value, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1GreaterThanOrEqualTo(String value) {
            addCriterion("OVER_SUP1 >=", value, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1LessThan(String value) {
            addCriterion("OVER_SUP1 <", value, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1LessThanOrEqualTo(String value) {
            addCriterion("OVER_SUP1 <=", value, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1Like(String value) {
            addCriterion("OVER_SUP1 like", value, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1NotLike(String value) {
            addCriterion("OVER_SUP1 not like", value, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1In(List<String> values) {
            addCriterion("OVER_SUP1 in", values, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1NotIn(List<String> values) {
            addCriterion("OVER_SUP1 not in", values, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1Between(String value1, String value2) {
            addCriterion("OVER_SUP1 between", value1, value2, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP1NotBetween(String value1, String value2) {
            addCriterion("OVER_SUP1 not between", value1, value2, "OVER_SUP1");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2IsNull() {
            addCriterion("OVER_SUP2 is null");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2IsNotNull() {
            addCriterion("OVER_SUP2 is not null");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2EqualTo(String value) {
            addCriterion("OVER_SUP2 =", value, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2NotEqualTo(String value) {
            addCriterion("OVER_SUP2 <>", value, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2GreaterThan(String value) {
            addCriterion("OVER_SUP2 >", value, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2GreaterThanOrEqualTo(String value) {
            addCriterion("OVER_SUP2 >=", value, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2LessThan(String value) {
            addCriterion("OVER_SUP2 <", value, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2LessThanOrEqualTo(String value) {
            addCriterion("OVER_SUP2 <=", value, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2Like(String value) {
            addCriterion("OVER_SUP2 like", value, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2NotLike(String value) {
            addCriterion("OVER_SUP2 not like", value, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2In(List<String> values) {
            addCriterion("OVER_SUP2 in", values, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2NotIn(List<String> values) {
            addCriterion("OVER_SUP2 not in", values, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2Between(String value1, String value2) {
            addCriterion("OVER_SUP2 between", value1, value2, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andOVER_SUP2NotBetween(String value1, String value2) {
            addCriterion("OVER_SUP2 not between", value1, value2, "OVER_SUP2");
            return (Criteria) this;
        }

        public Criteria andVER_NOIsNull() {
            addCriterion("VER_NO is null");
            return (Criteria) this;
        }

        public Criteria andVER_NOIsNotNull() {
            addCriterion("VER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVER_NOEqualTo(Short value) {
            addCriterion("VER_NO =", value, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NONotEqualTo(Short value) {
            addCriterion("VER_NO <>", value, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NOGreaterThan(Short value) {
            addCriterion("VER_NO >", value, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NOGreaterThanOrEqualTo(Short value) {
            addCriterion("VER_NO >=", value, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NOLessThan(Short value) {
            addCriterion("VER_NO <", value, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NOLessThanOrEqualTo(Short value) {
            addCriterion("VER_NO <=", value, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NOIn(List<Short> values) {
            addCriterion("VER_NO in", values, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NONotIn(List<Short> values) {
            addCriterion("VER_NO not in", values, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NOBetween(Short value1, Short value2) {
            addCriterion("VER_NO between", value1, value2, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andVER_NONotBetween(Short value1, Short value2) {
            addCriterion("VER_NO not between", value1, value2, "VER_NO");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATEIsNull() {
            addCriterion("UPDTBL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATEIsNotNull() {
            addCriterion("UPDTBL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATEEqualTo(Integer value) {
            addCriterion("UPDTBL_DATE =", value, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATENotEqualTo(Integer value) {
            addCriterion("UPDTBL_DATE <>", value, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATEGreaterThan(Integer value) {
            addCriterion("UPDTBL_DATE >", value, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPDTBL_DATE >=", value, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATELessThan(Integer value) {
            addCriterion("UPDTBL_DATE <", value, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATELessThanOrEqualTo(Integer value) {
            addCriterion("UPDTBL_DATE <=", value, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATEIn(List<Integer> values) {
            addCriterion("UPDTBL_DATE in", values, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATENotIn(List<Integer> values) {
            addCriterion("UPDTBL_DATE not in", values, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATEBetween(Integer value1, Integer value2) {
            addCriterion("UPDTBL_DATE between", value1, value2, "UPDTBL_DATE");
            return (Criteria) this;
        }

        public Criteria andUPDTBL_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("UPDTBL_DATE not between", value1, value2, "UPDTBL_DATE");
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