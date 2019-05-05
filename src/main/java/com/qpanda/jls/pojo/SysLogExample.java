package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysLogExample() {
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

        public Criteria andSyslogidIsNull() {
            addCriterion("syslogId is null");
            return (Criteria) this;
        }

        public Criteria andSyslogidIsNotNull() {
            addCriterion("syslogId is not null");
            return (Criteria) this;
        }

        public Criteria andSyslogidEqualTo(Integer value) {
            addCriterion("syslogId =", value, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidNotEqualTo(Integer value) {
            addCriterion("syslogId <>", value, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidGreaterThan(Integer value) {
            addCriterion("syslogId >", value, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("syslogId >=", value, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidLessThan(Integer value) {
            addCriterion("syslogId <", value, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidLessThanOrEqualTo(Integer value) {
            addCriterion("syslogId <=", value, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidIn(List<Integer> values) {
            addCriterion("syslogId in", values, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidNotIn(List<Integer> values) {
            addCriterion("syslogId not in", values, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidBetween(Integer value1, Integer value2) {
            addCriterion("syslogId between", value1, value2, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogidNotBetween(Integer value1, Integer value2) {
            addCriterion("syslogId not between", value1, value2, "syslogid");
            return (Criteria) this;
        }

        public Criteria andSyslogipIsNull() {
            addCriterion("syslogIp is null");
            return (Criteria) this;
        }

        public Criteria andSyslogipIsNotNull() {
            addCriterion("syslogIp is not null");
            return (Criteria) this;
        }

        public Criteria andSyslogipEqualTo(String value) {
            addCriterion("syslogIp =", value, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipNotEqualTo(String value) {
            addCriterion("syslogIp <>", value, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipGreaterThan(String value) {
            addCriterion("syslogIp >", value, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipGreaterThanOrEqualTo(String value) {
            addCriterion("syslogIp >=", value, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipLessThan(String value) {
            addCriterion("syslogIp <", value, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipLessThanOrEqualTo(String value) {
            addCriterion("syslogIp <=", value, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipLike(String value) {
            addCriterion("syslogIp like", value, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipNotLike(String value) {
            addCriterion("syslogIp not like", value, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipIn(List<String> values) {
            addCriterion("syslogIp in", values, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipNotIn(List<String> values) {
            addCriterion("syslogIp not in", values, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipBetween(String value1, String value2) {
            addCriterion("syslogIp between", value1, value2, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogipNotBetween(String value1, String value2) {
            addCriterion("syslogIp not between", value1, value2, "syslogip");
            return (Criteria) this;
        }

        public Criteria andSyslogdateIsNull() {
            addCriterion("syslogDate is null");
            return (Criteria) this;
        }

        public Criteria andSyslogdateIsNotNull() {
            addCriterion("syslogDate is not null");
            return (Criteria) this;
        }

        public Criteria andSyslogdateEqualTo(Date value) {
            addCriterionForJDBCDate("syslogDate =", value, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("syslogDate <>", value, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateGreaterThan(Date value) {
            addCriterionForJDBCDate("syslogDate >", value, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("syslogDate >=", value, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateLessThan(Date value) {
            addCriterionForJDBCDate("syslogDate <", value, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("syslogDate <=", value, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateIn(List<Date> values) {
            addCriterionForJDBCDate("syslogDate in", values, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("syslogDate not in", values, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("syslogDate between", value1, value2, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("syslogDate not between", value1, value2, "syslogdate");
            return (Criteria) this;
        }

        public Criteria andSyslogurlIsNull() {
            addCriterion("syslogUrl is null");
            return (Criteria) this;
        }

        public Criteria andSyslogurlIsNotNull() {
            addCriterion("syslogUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSyslogurlEqualTo(String value) {
            addCriterion("syslogUrl =", value, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlNotEqualTo(String value) {
            addCriterion("syslogUrl <>", value, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlGreaterThan(String value) {
            addCriterion("syslogUrl >", value, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlGreaterThanOrEqualTo(String value) {
            addCriterion("syslogUrl >=", value, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlLessThan(String value) {
            addCriterion("syslogUrl <", value, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlLessThanOrEqualTo(String value) {
            addCriterion("syslogUrl <=", value, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlLike(String value) {
            addCriterion("syslogUrl like", value, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlNotLike(String value) {
            addCriterion("syslogUrl not like", value, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlIn(List<String> values) {
            addCriterion("syslogUrl in", values, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlNotIn(List<String> values) {
            addCriterion("syslogUrl not in", values, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlBetween(String value1, String value2) {
            addCriterion("syslogUrl between", value1, value2, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogurlNotBetween(String value1, String value2) {
            addCriterion("syslogUrl not between", value1, value2, "syslogurl");
            return (Criteria) this;
        }

        public Criteria andSyslogbyIsNull() {
            addCriterion("syslogBy is null");
            return (Criteria) this;
        }

        public Criteria andSyslogbyIsNotNull() {
            addCriterion("syslogBy is not null");
            return (Criteria) this;
        }

        public Criteria andSyslogbyEqualTo(String value) {
            addCriterion("syslogBy =", value, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyNotEqualTo(String value) {
            addCriterion("syslogBy <>", value, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyGreaterThan(String value) {
            addCriterion("syslogBy >", value, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyGreaterThanOrEqualTo(String value) {
            addCriterion("syslogBy >=", value, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyLessThan(String value) {
            addCriterion("syslogBy <", value, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyLessThanOrEqualTo(String value) {
            addCriterion("syslogBy <=", value, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyLike(String value) {
            addCriterion("syslogBy like", value, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyNotLike(String value) {
            addCriterion("syslogBy not like", value, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyIn(List<String> values) {
            addCriterion("syslogBy in", values, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyNotIn(List<String> values) {
            addCriterion("syslogBy not in", values, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyBetween(String value1, String value2) {
            addCriterion("syslogBy between", value1, value2, "syslogby");
            return (Criteria) this;
        }

        public Criteria andSyslogbyNotBetween(String value1, String value2) {
            addCriterion("syslogBy not between", value1, value2, "syslogby");
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