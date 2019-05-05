package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysCommentExample() {
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

        public Criteria andSyscommentidIsNull() {
            addCriterion("syscommentId is null");
            return (Criteria) this;
        }

        public Criteria andSyscommentidIsNotNull() {
            addCriterion("syscommentId is not null");
            return (Criteria) this;
        }

        public Criteria andSyscommentidEqualTo(Integer value) {
            addCriterion("syscommentId =", value, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidNotEqualTo(Integer value) {
            addCriterion("syscommentId <>", value, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidGreaterThan(Integer value) {
            addCriterion("syscommentId >", value, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("syscommentId >=", value, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidLessThan(Integer value) {
            addCriterion("syscommentId <", value, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidLessThanOrEqualTo(Integer value) {
            addCriterion("syscommentId <=", value, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidIn(List<Integer> values) {
            addCriterion("syscommentId in", values, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidNotIn(List<Integer> values) {
            addCriterion("syscommentId not in", values, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidBetween(Integer value1, Integer value2) {
            addCriterion("syscommentId between", value1, value2, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("syscommentId not between", value1, value2, "syscommentid");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentIsNull() {
            addCriterion("syscommentContent is null");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentIsNotNull() {
            addCriterion("syscommentContent is not null");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentEqualTo(String value) {
            addCriterion("syscommentContent =", value, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentNotEqualTo(String value) {
            addCriterion("syscommentContent <>", value, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentGreaterThan(String value) {
            addCriterion("syscommentContent >", value, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("syscommentContent >=", value, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentLessThan(String value) {
            addCriterion("syscommentContent <", value, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentLessThanOrEqualTo(String value) {
            addCriterion("syscommentContent <=", value, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentLike(String value) {
            addCriterion("syscommentContent like", value, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentNotLike(String value) {
            addCriterion("syscommentContent not like", value, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentIn(List<String> values) {
            addCriterion("syscommentContent in", values, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentNotIn(List<String> values) {
            addCriterion("syscommentContent not in", values, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentBetween(String value1, String value2) {
            addCriterion("syscommentContent between", value1, value2, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentcontentNotBetween(String value1, String value2) {
            addCriterion("syscommentContent not between", value1, value2, "syscommentcontent");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateIsNull() {
            addCriterion("syscommentDate is null");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateIsNotNull() {
            addCriterion("syscommentDate is not null");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateEqualTo(Date value) {
            addCriterionForJDBCDate("syscommentDate =", value, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("syscommentDate <>", value, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateGreaterThan(Date value) {
            addCriterionForJDBCDate("syscommentDate >", value, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("syscommentDate >=", value, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateLessThan(Date value) {
            addCriterionForJDBCDate("syscommentDate <", value, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("syscommentDate <=", value, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateIn(List<Date> values) {
            addCriterionForJDBCDate("syscommentDate in", values, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("syscommentDate not in", values, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("syscommentDate between", value1, value2, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("syscommentDate not between", value1, value2, "syscommentdate");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameIsNull() {
            addCriterion("syscommentName is null");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameIsNotNull() {
            addCriterion("syscommentName is not null");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameEqualTo(String value) {
            addCriterion("syscommentName =", value, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameNotEqualTo(String value) {
            addCriterion("syscommentName <>", value, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameGreaterThan(String value) {
            addCriterion("syscommentName >", value, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameGreaterThanOrEqualTo(String value) {
            addCriterion("syscommentName >=", value, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameLessThan(String value) {
            addCriterion("syscommentName <", value, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameLessThanOrEqualTo(String value) {
            addCriterion("syscommentName <=", value, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameLike(String value) {
            addCriterion("syscommentName like", value, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameNotLike(String value) {
            addCriterion("syscommentName not like", value, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameIn(List<String> values) {
            addCriterion("syscommentName in", values, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameNotIn(List<String> values) {
            addCriterion("syscommentName not in", values, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameBetween(String value1, String value2) {
            addCriterion("syscommentName between", value1, value2, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentnameNotBetween(String value1, String value2) {
            addCriterion("syscommentName not between", value1, value2, "syscommentname");
            return (Criteria) this;
        }

        public Criteria andSyscommentipIsNull() {
            addCriterion("syscommentIp is null");
            return (Criteria) this;
        }

        public Criteria andSyscommentipIsNotNull() {
            addCriterion("syscommentIp is not null");
            return (Criteria) this;
        }

        public Criteria andSyscommentipEqualTo(String value) {
            addCriterion("syscommentIp =", value, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipNotEqualTo(String value) {
            addCriterion("syscommentIp <>", value, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipGreaterThan(String value) {
            addCriterion("syscommentIp >", value, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipGreaterThanOrEqualTo(String value) {
            addCriterion("syscommentIp >=", value, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipLessThan(String value) {
            addCriterion("syscommentIp <", value, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipLessThanOrEqualTo(String value) {
            addCriterion("syscommentIp <=", value, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipLike(String value) {
            addCriterion("syscommentIp like", value, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipNotLike(String value) {
            addCriterion("syscommentIp not like", value, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipIn(List<String> values) {
            addCriterion("syscommentIp in", values, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipNotIn(List<String> values) {
            addCriterion("syscommentIp not in", values, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipBetween(String value1, String value2) {
            addCriterion("syscommentIp between", value1, value2, "syscommentip");
            return (Criteria) this;
        }

        public Criteria andSyscommentipNotBetween(String value1, String value2) {
            addCriterion("syscommentIp not between", value1, value2, "syscommentip");
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