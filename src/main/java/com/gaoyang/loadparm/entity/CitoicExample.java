package com.gaoyang.loadparm.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CitoicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CitoicExample() {
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

        public Criteria andOIC_NOIsNull() {
            addCriterion("OIC_NO is null");
            return (Criteria) this;
        }

        public Criteria andOIC_NOIsNotNull() {
            addCriterion("OIC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOIC_NOEqualTo(String value) {
            addCriterion("OIC_NO =", value, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NONotEqualTo(String value) {
            addCriterion("OIC_NO <>", value, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NOGreaterThan(String value) {
            addCriterion("OIC_NO >", value, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NOGreaterThanOrEqualTo(String value) {
            addCriterion("OIC_NO >=", value, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NOLessThan(String value) {
            addCriterion("OIC_NO <", value, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NOLessThanOrEqualTo(String value) {
            addCriterion("OIC_NO <=", value, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NOLike(String value) {
            addCriterion("OIC_NO like", value, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NONotLike(String value) {
            addCriterion("OIC_NO not like", value, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NOIn(List<String> values) {
            addCriterion("OIC_NO in", values, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NONotIn(List<String> values) {
            addCriterion("OIC_NO not in", values, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NOBetween(String value1, String value2) {
            addCriterion("OIC_NO between", value1, value2, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andOIC_NONotBetween(String value1, String value2) {
            addCriterion("OIC_NO not between", value1, value2, "OIC_NO");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHIsNull() {
            addCriterion("BOOK_BCH is null");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHIsNotNull() {
            addCriterion("BOOK_BCH is not null");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHEqualTo(Integer value) {
            addCriterion("BOOK_BCH =", value, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHNotEqualTo(Integer value) {
            addCriterion("BOOK_BCH <>", value, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHGreaterThan(Integer value) {
            addCriterion("BOOK_BCH >", value, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHGreaterThanOrEqualTo(Integer value) {
            addCriterion("BOOK_BCH >=", value, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHLessThan(Integer value) {
            addCriterion("BOOK_BCH <", value, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHLessThanOrEqualTo(Integer value) {
            addCriterion("BOOK_BCH <=", value, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHIn(List<Integer> values) {
            addCriterion("BOOK_BCH in", values, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHNotIn(List<Integer> values) {
            addCriterion("BOOK_BCH not in", values, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHBetween(Integer value1, Integer value2) {
            addCriterion("BOOK_BCH between", value1, value2, "BOOK_BCH");
            return (Criteria) this;
        }

        public Criteria andBOOK_BCHNotBetween(Integer value1, Integer value2) {
            addCriterion("BOOK_BCH not between", value1, value2, "BOOK_BCH");
            return (Criteria) this;
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

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andTEL_NOIsNull() {
            addCriterion("TEL_NO is null");
            return (Criteria) this;
        }

        public Criteria andTEL_NOIsNotNull() {
            addCriterion("TEL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTEL_NOEqualTo(String value) {
            addCriterion("TEL_NO =", value, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NONotEqualTo(String value) {
            addCriterion("TEL_NO <>", value, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NOGreaterThan(String value) {
            addCriterion("TEL_NO >", value, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NOGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_NO >=", value, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NOLessThan(String value) {
            addCriterion("TEL_NO <", value, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NOLessThanOrEqualTo(String value) {
            addCriterion("TEL_NO <=", value, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NOLike(String value) {
            addCriterion("TEL_NO like", value, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NONotLike(String value) {
            addCriterion("TEL_NO not like", value, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NOIn(List<String> values) {
            addCriterion("TEL_NO in", values, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NONotIn(List<String> values) {
            addCriterion("TEL_NO not in", values, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NOBetween(String value1, String value2) {
            addCriterion("TEL_NO between", value1, value2, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andTEL_NONotBetween(String value1, String value2) {
            addCriterion("TEL_NO not between", value1, value2, "TEL_NO");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEMAILIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEMAILEqualTo(String value) {
            addCriterion("EMAIL =", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThan(String value) {
            addCriterion("EMAIL >", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThan(String value) {
            addCriterion("EMAIL <", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILLike(String value) {
            addCriterion("EMAIL like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotLike(String value) {
            addCriterion("EMAIL not like", value, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILIn(List<String> values) {
            addCriterion("EMAIL in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andEMAILNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "EMAIL");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOIsNull() {
            addCriterion("STAFF_NO is null");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOIsNotNull() {
            addCriterion("STAFF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOEqualTo(String value) {
            addCriterion("STAFF_NO =", value, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NONotEqualTo(String value) {
            addCriterion("STAFF_NO <>", value, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOGreaterThan(String value) {
            addCriterion("STAFF_NO >", value, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_NO >=", value, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOLessThan(String value) {
            addCriterion("STAFF_NO <", value, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOLessThanOrEqualTo(String value) {
            addCriterion("STAFF_NO <=", value, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOLike(String value) {
            addCriterion("STAFF_NO like", value, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NONotLike(String value) {
            addCriterion("STAFF_NO not like", value, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOIn(List<String> values) {
            addCriterion("STAFF_NO in", values, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NONotIn(List<String> values) {
            addCriterion("STAFF_NO not in", values, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NOBetween(String value1, String value2) {
            addCriterion("STAFF_NO between", value1, value2, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andSTAFF_NONotBetween(String value1, String value2) {
            addCriterion("STAFF_NO not between", value1, value2, "STAFF_NO");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGIsNull() {
            addCriterion("LEADER_FLG is null");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGIsNotNull() {
            addCriterion("LEADER_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGEqualTo(String value) {
            addCriterion("LEADER_FLG =", value, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGNotEqualTo(String value) {
            addCriterion("LEADER_FLG <>", value, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGGreaterThan(String value) {
            addCriterion("LEADER_FLG >", value, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGGreaterThanOrEqualTo(String value) {
            addCriterion("LEADER_FLG >=", value, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGLessThan(String value) {
            addCriterion("LEADER_FLG <", value, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGLessThanOrEqualTo(String value) {
            addCriterion("LEADER_FLG <=", value, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGLike(String value) {
            addCriterion("LEADER_FLG like", value, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGNotLike(String value) {
            addCriterion("LEADER_FLG not like", value, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGIn(List<String> values) {
            addCriterion("LEADER_FLG in", values, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGNotIn(List<String> values) {
            addCriterion("LEADER_FLG not in", values, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGBetween(String value1, String value2) {
            addCriterion("LEADER_FLG between", value1, value2, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andLEADER_FLGNotBetween(String value1, String value2) {
            addCriterion("LEADER_FLG not between", value1, value2, "LEADER_FLG");
            return (Criteria) this;
        }

        public Criteria andTLR_IDIsNull() {
            addCriterion("TLR_ID is null");
            return (Criteria) this;
        }

        public Criteria andTLR_IDIsNotNull() {
            addCriterion("TLR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTLR_IDEqualTo(String value) {
            addCriterion("TLR_ID =", value, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDNotEqualTo(String value) {
            addCriterion("TLR_ID <>", value, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDGreaterThan(String value) {
            addCriterion("TLR_ID >", value, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDGreaterThanOrEqualTo(String value) {
            addCriterion("TLR_ID >=", value, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDLessThan(String value) {
            addCriterion("TLR_ID <", value, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDLessThanOrEqualTo(String value) {
            addCriterion("TLR_ID <=", value, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDLike(String value) {
            addCriterion("TLR_ID like", value, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDNotLike(String value) {
            addCriterion("TLR_ID not like", value, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDIn(List<String> values) {
            addCriterion("TLR_ID in", values, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDNotIn(List<String> values) {
            addCriterion("TLR_ID not in", values, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDBetween(String value1, String value2) {
            addCriterion("TLR_ID between", value1, value2, "TLR_ID");
            return (Criteria) this;
        }

        public Criteria andTLR_IDNotBetween(String value1, String value2) {
            addCriterion("TLR_ID not between", value1, value2, "TLR_ID");
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