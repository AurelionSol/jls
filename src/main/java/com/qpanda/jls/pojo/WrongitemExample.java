package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.List;

public class WrongitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WrongitemExample() {
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

        public Criteria andWrongidIsNull() {
            addCriterion("wrongId is null");
            return (Criteria) this;
        }

        public Criteria andWrongidIsNotNull() {
            addCriterion("wrongId is not null");
            return (Criteria) this;
        }

        public Criteria andWrongidEqualTo(Integer value) {
            addCriterion("wrongId =", value, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidNotEqualTo(Integer value) {
            addCriterion("wrongId <>", value, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidGreaterThan(Integer value) {
            addCriterion("wrongId >", value, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrongId >=", value, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidLessThan(Integer value) {
            addCriterion("wrongId <", value, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidLessThanOrEqualTo(Integer value) {
            addCriterion("wrongId <=", value, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidIn(List<Integer> values) {
            addCriterion("wrongId in", values, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidNotIn(List<Integer> values) {
            addCriterion("wrongId not in", values, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidBetween(Integer value1, Integer value2) {
            addCriterion("wrongId between", value1, value2, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongidNotBetween(Integer value1, Integer value2) {
            addCriterion("wrongId not between", value1, value2, "wrongid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidIsNull() {
            addCriterion("wrong_questionid is null");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidIsNotNull() {
            addCriterion("wrong_questionid is not null");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidEqualTo(Integer value) {
            addCriterion("wrong_questionid =", value, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidNotEqualTo(Integer value) {
            addCriterion("wrong_questionid <>", value, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidGreaterThan(Integer value) {
            addCriterion("wrong_questionid >", value, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrong_questionid >=", value, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidLessThan(Integer value) {
            addCriterion("wrong_questionid <", value, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("wrong_questionid <=", value, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidIn(List<Integer> values) {
            addCriterion("wrong_questionid in", values, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidNotIn(List<Integer> values) {
            addCriterion("wrong_questionid not in", values, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("wrong_questionid between", value1, value2, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("wrong_questionid not between", value1, value2, "wrongQuestionid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridIsNull() {
            addCriterion("wrong_userId is null");
            return (Criteria) this;
        }

        public Criteria andWrongUseridIsNotNull() {
            addCriterion("wrong_userId is not null");
            return (Criteria) this;
        }

        public Criteria andWrongUseridEqualTo(Integer value) {
            addCriterion("wrong_userId =", value, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridNotEqualTo(Integer value) {
            addCriterion("wrong_userId <>", value, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridGreaterThan(Integer value) {
            addCriterion("wrong_userId >", value, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrong_userId >=", value, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridLessThan(Integer value) {
            addCriterion("wrong_userId <", value, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridLessThanOrEqualTo(Integer value) {
            addCriterion("wrong_userId <=", value, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridIn(List<Integer> values) {
            addCriterion("wrong_userId in", values, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridNotIn(List<Integer> values) {
            addCriterion("wrong_userId not in", values, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridBetween(Integer value1, Integer value2) {
            addCriterion("wrong_userId between", value1, value2, "wrongUserid");
            return (Criteria) this;
        }

        public Criteria andWrongUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("wrong_userId not between", value1, value2, "wrongUserid");
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