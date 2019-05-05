package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentidIsNull() {
            addCriterion("commentId is null");
            return (Criteria) this;
        }

        public Criteria andCommentidIsNotNull() {
            addCriterion("commentId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentidEqualTo(Integer value) {
            addCriterion("commentId =", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotEqualTo(Integer value) {
            addCriterion("commentId <>", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThan(Integer value) {
            addCriterion("commentId >", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentId >=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThan(Integer value) {
            addCriterion("commentId <", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidLessThanOrEqualTo(Integer value) {
            addCriterion("commentId <=", value, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidIn(List<Integer> values) {
            addCriterion("commentId in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotIn(List<Integer> values) {
            addCriterion("commentId not in", values, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidBetween(Integer value1, Integer value2) {
            addCriterion("commentId between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentId not between", value1, value2, "commentid");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNull() {
            addCriterion("commentContent is null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIsNotNull() {
            addCriterion("commentContent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentcontentEqualTo(String value) {
            addCriterion("commentContent =", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotEqualTo(String value) {
            addCriterion("commentContent <>", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThan(String value) {
            addCriterion("commentContent >", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("commentContent >=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThan(String value) {
            addCriterion("commentContent <", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLessThanOrEqualTo(String value) {
            addCriterion("commentContent <=", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentLike(String value) {
            addCriterion("commentContent like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotLike(String value) {
            addCriterion("commentContent not like", value, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentIn(List<String> values) {
            addCriterion("commentContent in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotIn(List<String> values) {
            addCriterion("commentContent not in", values, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentBetween(String value1, String value2) {
            addCriterion("commentContent between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentcontentNotBetween(String value1, String value2) {
            addCriterion("commentContent not between", value1, value2, "commentcontent");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridIsNull() {
            addCriterion("commentAuthorId is null");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridIsNotNull() {
            addCriterion("commentAuthorId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridEqualTo(Integer value) {
            addCriterion("commentAuthorId =", value, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridNotEqualTo(Integer value) {
            addCriterion("commentAuthorId <>", value, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridGreaterThan(Integer value) {
            addCriterion("commentAuthorId >", value, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentAuthorId >=", value, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridLessThan(Integer value) {
            addCriterion("commentAuthorId <", value, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridLessThanOrEqualTo(Integer value) {
            addCriterion("commentAuthorId <=", value, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridIn(List<Integer> values) {
            addCriterion("commentAuthorId in", values, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridNotIn(List<Integer> values) {
            addCriterion("commentAuthorId not in", values, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridBetween(Integer value1, Integer value2) {
            addCriterion("commentAuthorId between", value1, value2, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentauthoridNotBetween(Integer value1, Integer value2) {
            addCriterion("commentAuthorId not between", value1, value2, "commentauthorid");
            return (Criteria) this;
        }

        public Criteria andCommentdateIsNull() {
            addCriterion("commentDate is null");
            return (Criteria) this;
        }

        public Criteria andCommentdateIsNotNull() {
            addCriterion("commentDate is not null");
            return (Criteria) this;
        }

        public Criteria andCommentdateEqualTo(Date value) {
            addCriterionForJDBCDate("commentDate =", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("commentDate <>", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateGreaterThan(Date value) {
            addCriterionForJDBCDate("commentDate >", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commentDate >=", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateLessThan(Date value) {
            addCriterionForJDBCDate("commentDate <", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("commentDate <=", value, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateIn(List<Date> values) {
            addCriterionForJDBCDate("commentDate in", values, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("commentDate not in", values, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commentDate between", value1, value2, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("commentDate not between", value1, value2, "commentdate");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidIsNull() {
            addCriterion("commentArticleId is null");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidIsNotNull() {
            addCriterion("commentArticleId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidEqualTo(Integer value) {
            addCriterion("commentArticleId =", value, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidNotEqualTo(Integer value) {
            addCriterion("commentArticleId <>", value, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidGreaterThan(Integer value) {
            addCriterion("commentArticleId >", value, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("commentArticleId >=", value, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidLessThan(Integer value) {
            addCriterion("commentArticleId <", value, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidLessThanOrEqualTo(Integer value) {
            addCriterion("commentArticleId <=", value, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidIn(List<Integer> values) {
            addCriterion("commentArticleId in", values, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidNotIn(List<Integer> values) {
            addCriterion("commentArticleId not in", values, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidBetween(Integer value1, Integer value2) {
            addCriterion("commentArticleId between", value1, value2, "commentarticleid");
            return (Criteria) this;
        }

        public Criteria andCommentarticleidNotBetween(Integer value1, Integer value2) {
            addCriterion("commentArticleId not between", value1, value2, "commentarticleid");
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