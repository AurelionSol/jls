package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysViewExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSysviewidIsNull() {
            addCriterion("sysviewId is null");
            return (Criteria) this;
        }

        public Criteria andSysviewidIsNotNull() {
            addCriterion("sysviewId is not null");
            return (Criteria) this;
        }

        public Criteria andSysviewidEqualTo(Integer value) {
            addCriterion("sysviewId =", value, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidNotEqualTo(Integer value) {
            addCriterion("sysviewId <>", value, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidGreaterThan(Integer value) {
            addCriterion("sysviewId >", value, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysviewId >=", value, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidLessThan(Integer value) {
            addCriterion("sysviewId <", value, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidLessThanOrEqualTo(Integer value) {
            addCriterion("sysviewId <=", value, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidIn(List<Integer> values) {
            addCriterion("sysviewId in", values, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidNotIn(List<Integer> values) {
            addCriterion("sysviewId not in", values, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidBetween(Integer value1, Integer value2) {
            addCriterion("sysviewId between", value1, value2, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewidNotBetween(Integer value1, Integer value2) {
            addCriterion("sysviewId not between", value1, value2, "sysviewid");
            return (Criteria) this;
        }

        public Criteria andSysviewipIsNull() {
            addCriterion("sysviewIp is null");
            return (Criteria) this;
        }

        public Criteria andSysviewipIsNotNull() {
            addCriterion("sysviewIp is not null");
            return (Criteria) this;
        }

        public Criteria andSysviewipEqualTo(String value) {
            addCriterion("sysviewIp =", value, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipNotEqualTo(String value) {
            addCriterion("sysviewIp <>", value, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipGreaterThan(String value) {
            addCriterion("sysviewIp >", value, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipGreaterThanOrEqualTo(String value) {
            addCriterion("sysviewIp >=", value, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipLessThan(String value) {
            addCriterion("sysviewIp <", value, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipLessThanOrEqualTo(String value) {
            addCriterion("sysviewIp <=", value, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipLike(String value) {
            addCriterion("sysviewIp like", value, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipNotLike(String value) {
            addCriterion("sysviewIp not like", value, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipIn(List<String> values) {
            addCriterion("sysviewIp in", values, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipNotIn(List<String> values) {
            addCriterion("sysviewIp not in", values, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipBetween(String value1, String value2) {
            addCriterion("sysviewIp between", value1, value2, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewipNotBetween(String value1, String value2) {
            addCriterion("sysviewIp not between", value1, value2, "sysviewip");
            return (Criteria) this;
        }

        public Criteria andSysviewdateIsNull() {
            addCriterion("sysviewDate is null");
            return (Criteria) this;
        }

        public Criteria andSysviewdateIsNotNull() {
            addCriterion("sysviewDate is not null");
            return (Criteria) this;
        }

        public Criteria andSysviewdateEqualTo(Date value) {
            addCriterionForJDBCDate("sysviewDate =", value, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sysviewDate <>", value, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateGreaterThan(Date value) {
            addCriterionForJDBCDate("sysviewDate >", value, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sysviewDate >=", value, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateLessThan(Date value) {
            addCriterionForJDBCDate("sysviewDate <", value, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sysviewDate <=", value, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateIn(List<Date> values) {
            addCriterionForJDBCDate("sysviewDate in", values, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sysviewDate not in", values, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sysviewDate between", value1, value2, "sysviewdate");
            return (Criteria) this;
        }

        public Criteria andSysviewdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sysviewDate not between", value1, value2, "sysviewdate");
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