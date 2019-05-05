package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdministratorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministratorExample() {
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

        public Criteria andAdministratoridIsNull() {
            addCriterion("administratorId is null");
            return (Criteria) this;
        }

        public Criteria andAdministratoridIsNotNull() {
            addCriterion("administratorId is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratoridEqualTo(Integer value) {
            addCriterion("administratorId =", value, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridNotEqualTo(Integer value) {
            addCriterion("administratorId <>", value, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridGreaterThan(Integer value) {
            addCriterion("administratorId >", value, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("administratorId >=", value, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridLessThan(Integer value) {
            addCriterion("administratorId <", value, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridLessThanOrEqualTo(Integer value) {
            addCriterion("administratorId <=", value, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridIn(List<Integer> values) {
            addCriterion("administratorId in", values, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridNotIn(List<Integer> values) {
            addCriterion("administratorId not in", values, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridBetween(Integer value1, Integer value2) {
            addCriterion("administratorId between", value1, value2, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratoridNotBetween(Integer value1, Integer value2) {
            addCriterion("administratorId not between", value1, value2, "administratorid");
            return (Criteria) this;
        }

        public Criteria andAdministratornameIsNull() {
            addCriterion("administratorName is null");
            return (Criteria) this;
        }

        public Criteria andAdministratornameIsNotNull() {
            addCriterion("administratorName is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratornameEqualTo(String value) {
            addCriterion("administratorName =", value, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameNotEqualTo(String value) {
            addCriterion("administratorName <>", value, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameGreaterThan(String value) {
            addCriterion("administratorName >", value, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameGreaterThanOrEqualTo(String value) {
            addCriterion("administratorName >=", value, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameLessThan(String value) {
            addCriterion("administratorName <", value, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameLessThanOrEqualTo(String value) {
            addCriterion("administratorName <=", value, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameLike(String value) {
            addCriterion("administratorName like", value, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameNotLike(String value) {
            addCriterion("administratorName not like", value, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameIn(List<String> values) {
            addCriterion("administratorName in", values, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameNotIn(List<String> values) {
            addCriterion("administratorName not in", values, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameBetween(String value1, String value2) {
            addCriterion("administratorName between", value1, value2, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratornameNotBetween(String value1, String value2) {
            addCriterion("administratorName not between", value1, value2, "administratorname");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordIsNull() {
            addCriterion("administratorPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordIsNotNull() {
            addCriterion("administratorPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordEqualTo(String value) {
            addCriterion("administratorPassword =", value, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordNotEqualTo(String value) {
            addCriterion("administratorPassword <>", value, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordGreaterThan(String value) {
            addCriterion("administratorPassword >", value, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("administratorPassword >=", value, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordLessThan(String value) {
            addCriterion("administratorPassword <", value, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordLessThanOrEqualTo(String value) {
            addCriterion("administratorPassword <=", value, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordLike(String value) {
            addCriterion("administratorPassword like", value, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordNotLike(String value) {
            addCriterion("administratorPassword not like", value, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordIn(List<String> values) {
            addCriterion("administratorPassword in", values, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordNotIn(List<String> values) {
            addCriterion("administratorPassword not in", values, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordBetween(String value1, String value2) {
            addCriterion("administratorPassword between", value1, value2, "administratorpassword");
            return (Criteria) this;
        }

        public Criteria andAdministratorpasswordNotBetween(String value1, String value2) {
            addCriterion("administratorPassword not between", value1, value2, "administratorpassword");
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