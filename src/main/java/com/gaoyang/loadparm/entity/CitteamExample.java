package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CitteamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CitteamExample() {
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

        public Criteria andTEAM_NOIsNull() {
            addCriterion("TEAM_NO is null");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOIsNotNull() {
            addCriterion("TEAM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOEqualTo(String value) {
            addCriterion("TEAM_NO =", value, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NONotEqualTo(String value) {
            addCriterion("TEAM_NO <>", value, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOGreaterThan(String value) {
            addCriterion("TEAM_NO >", value, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NO >=", value, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOLessThan(String value) {
            addCriterion("TEAM_NO <", value, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NO <=", value, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOLike(String value) {
            addCriterion("TEAM_NO like", value, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NONotLike(String value) {
            addCriterion("TEAM_NO not like", value, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOIn(List<String> values) {
            addCriterion("TEAM_NO in", values, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NONotIn(List<String> values) {
            addCriterion("TEAM_NO not in", values, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NOBetween(String value1, String value2) {
            addCriterion("TEAM_NO between", value1, value2, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NONotBetween(String value1, String value2) {
            addCriterion("TEAM_NO not between", value1, value2, "TEAM_NO");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMIsNull() {
            addCriterion("TEAM_NM is null");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMIsNotNull() {
            addCriterion("TEAM_NM is not null");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMEqualTo(String value) {
            addCriterion("TEAM_NM =", value, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMNotEqualTo(String value) {
            addCriterion("TEAM_NM <>", value, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMGreaterThan(String value) {
            addCriterion("TEAM_NM >", value, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMGreaterThanOrEqualTo(String value) {
            addCriterion("TEAM_NM >=", value, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMLessThan(String value) {
            addCriterion("TEAM_NM <", value, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMLessThanOrEqualTo(String value) {
            addCriterion("TEAM_NM <=", value, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMLike(String value) {
            addCriterion("TEAM_NM like", value, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMNotLike(String value) {
            addCriterion("TEAM_NM not like", value, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMIn(List<String> values) {
            addCriterion("TEAM_NM in", values, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMNotIn(List<String> values) {
            addCriterion("TEAM_NM not in", values, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMBetween(String value1, String value2) {
            addCriterion("TEAM_NM between", value1, value2, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andTEAM_NMNotBetween(String value1, String value2) {
            addCriterion("TEAM_NM not between", value1, value2, "TEAM_NM");
            return (Criteria) this;
        }

        public Criteria andBRANCHIsNull() {
            addCriterion("BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andBRANCHIsNotNull() {
            addCriterion("BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andBRANCHEqualTo(Integer value) {
            addCriterion("BRANCH =", value, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHNotEqualTo(Integer value) {
            addCriterion("BRANCH <>", value, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHGreaterThan(Integer value) {
            addCriterion("BRANCH >", value, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRANCH >=", value, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHLessThan(Integer value) {
            addCriterion("BRANCH <", value, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHLessThanOrEqualTo(Integer value) {
            addCriterion("BRANCH <=", value, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHIn(List<Integer> values) {
            addCriterion("BRANCH in", values, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHNotIn(List<Integer> values) {
            addCriterion("BRANCH not in", values, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHBetween(Integer value1, Integer value2) {
            addCriterion("BRANCH between", value1, value2, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andBRANCHNotBetween(Integer value1, Integer value2) {
            addCriterion("BRANCH not between", value1, value2, "BRANCH");
            return (Criteria) this;
        }

        public Criteria andPROFITIsNull() {
            addCriterion("PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andPROFITIsNotNull() {
            addCriterion("PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andPROFITEqualTo(String value) {
            addCriterion("PROFIT =", value, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITNotEqualTo(String value) {
            addCriterion("PROFIT <>", value, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITGreaterThan(String value) {
            addCriterion("PROFIT >", value, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITGreaterThanOrEqualTo(String value) {
            addCriterion("PROFIT >=", value, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITLessThan(String value) {
            addCriterion("PROFIT <", value, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITLessThanOrEqualTo(String value) {
            addCriterion("PROFIT <=", value, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITLike(String value) {
            addCriterion("PROFIT like", value, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITNotLike(String value) {
            addCriterion("PROFIT not like", value, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITIn(List<String> values) {
            addCriterion("PROFIT in", values, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITNotIn(List<String> values) {
            addCriterion("PROFIT not in", values, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITBetween(String value1, String value2) {
            addCriterion("PROFIT between", value1, value2, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andPROFITNotBetween(String value1, String value2) {
            addCriterion("PROFIT not between", value1, value2, "PROFIT");
            return (Criteria) this;
        }

        public Criteria andDIVISIONIsNull() {
            addCriterion("DIVISION is null");
            return (Criteria) this;
        }

        public Criteria andDIVISIONIsNotNull() {
            addCriterion("DIVISION is not null");
            return (Criteria) this;
        }

        public Criteria andDIVISIONEqualTo(String value) {
            addCriterion("DIVISION =", value, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONNotEqualTo(String value) {
            addCriterion("DIVISION <>", value, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONGreaterThan(String value) {
            addCriterion("DIVISION >", value, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONGreaterThanOrEqualTo(String value) {
            addCriterion("DIVISION >=", value, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONLessThan(String value) {
            addCriterion("DIVISION <", value, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONLessThanOrEqualTo(String value) {
            addCriterion("DIVISION <=", value, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONLike(String value) {
            addCriterion("DIVISION like", value, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONNotLike(String value) {
            addCriterion("DIVISION not like", value, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONIn(List<String> values) {
            addCriterion("DIVISION in", values, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONNotIn(List<String> values) {
            addCriterion("DIVISION not in", values, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONBetween(String value1, String value2) {
            addCriterion("DIVISION between", value1, value2, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andDIVISIONNotBetween(String value1, String value2) {
            addCriterion("DIVISION not between", value1, value2, "DIVISION");
            return (Criteria) this;
        }

        public Criteria andREGIONIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andREGIONIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andREGIONEqualTo(String value) {
            addCriterion("REGION =", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONNotEqualTo(String value) {
            addCriterion("REGION <>", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONGreaterThan(String value) {
            addCriterion("REGION >", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONLessThan(String value) {
            addCriterion("REGION <", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONLike(String value) {
            addCriterion("REGION like", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONNotLike(String value) {
            addCriterion("REGION not like", value, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONIn(List<String> values) {
            addCriterion("REGION in", values, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONNotIn(List<String> values) {
            addCriterion("REGION not in", values, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "REGION");
            return (Criteria) this;
        }

        public Criteria andREGIONNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "REGION");
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

        public Criteria andCREATE_TLRIsNull() {
            addCriterion("CREATE_TLR is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRIsNotNull() {
            addCriterion("CREATE_TLR is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLREqualTo(String value) {
            addCriterion("CREATE_TLR =", value, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRNotEqualTo(String value) {
            addCriterion("CREATE_TLR <>", value, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRGreaterThan(String value) {
            addCriterion("CREATE_TLR >", value, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_TLR >=", value, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRLessThan(String value) {
            addCriterion("CREATE_TLR <", value, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRLessThanOrEqualTo(String value) {
            addCriterion("CREATE_TLR <=", value, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRLike(String value) {
            addCriterion("CREATE_TLR like", value, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRNotLike(String value) {
            addCriterion("CREATE_TLR not like", value, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRIn(List<String> values) {
            addCriterion("CREATE_TLR in", values, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRNotIn(List<String> values) {
            addCriterion("CREATE_TLR not in", values, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRBetween(String value1, String value2) {
            addCriterion("CREATE_TLR between", value1, value2, "CREATE_TLR");
            return (Criteria) this;
        }

        public Criteria andCREATE_TLRNotBetween(String value1, String value2) {
            addCriterion("CREATE_TLR not between", value1, value2, "CREATE_TLR");
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

        public Criteria andCREATE_TIMEIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEEqualTo(Integer value) {
            addCriterion("CREATE_TIME =", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotEqualTo(Integer value) {
            addCriterion("CREATE_TIME <>", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEGreaterThan(Integer value) {
            addCriterion("CREATE_TIME >", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_TIME >=", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMELessThan(Integer value) {
            addCriterion("CREATE_TIME <", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMELessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_TIME <=", value, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEIn(List<Integer> values) {
            addCriterion("CREATE_TIME in", values, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotIn(List<Integer> values) {
            addCriterion("CREATE_TIME not in", values, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMEBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_TIME between", value1, value2, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andCREATE_TIMENotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "CREATE_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATEIsNull() {
            addCriterion("LAST_UPD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATEIsNotNull() {
            addCriterion("LAST_UPD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATEEqualTo(Integer value) {
            addCriterion("LAST_UPD_DATE =", value, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATENotEqualTo(Integer value) {
            addCriterion("LAST_UPD_DATE <>", value, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATEGreaterThan(Integer value) {
            addCriterion("LAST_UPD_DATE >", value, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATEGreaterThanOrEqualTo(Integer value) {
            addCriterion("LAST_UPD_DATE >=", value, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATELessThan(Integer value) {
            addCriterion("LAST_UPD_DATE <", value, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATELessThanOrEqualTo(Integer value) {
            addCriterion("LAST_UPD_DATE <=", value, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATEIn(List<Integer> values) {
            addCriterion("LAST_UPD_DATE in", values, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATENotIn(List<Integer> values) {
            addCriterion("LAST_UPD_DATE not in", values, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATEBetween(Integer value1, Integer value2) {
            addCriterion("LAST_UPD_DATE between", value1, value2, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_DATENotBetween(Integer value1, Integer value2) {
            addCriterion("LAST_UPD_DATE not between", value1, value2, "LAST_UPD_DATE");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRIsNull() {
            addCriterion("LAST_UPD_TLR is null");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRIsNotNull() {
            addCriterion("LAST_UPD_TLR is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLREqualTo(String value) {
            addCriterion("LAST_UPD_TLR =", value, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRNotEqualTo(String value) {
            addCriterion("LAST_UPD_TLR <>", value, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRGreaterThan(String value) {
            addCriterion("LAST_UPD_TLR >", value, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_TLR >=", value, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRLessThan(String value) {
            addCriterion("LAST_UPD_TLR <", value, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRLessThanOrEqualTo(String value) {
            addCriterion("LAST_UPD_TLR <=", value, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRLike(String value) {
            addCriterion("LAST_UPD_TLR like", value, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRNotLike(String value) {
            addCriterion("LAST_UPD_TLR not like", value, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRIn(List<String> values) {
            addCriterion("LAST_UPD_TLR in", values, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRNotIn(List<String> values) {
            addCriterion("LAST_UPD_TLR not in", values, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRBetween(String value1, String value2) {
            addCriterion("LAST_UPD_TLR between", value1, value2, "LAST_UPD_TLR");
            return (Criteria) this;
        }

        public Criteria andLAST_UPD_TLRNotBetween(String value1, String value2) {
            addCriterion("LAST_UPD_TLR not between", value1, value2, "LAST_UPD_TLR");
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