package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andArticleidIsNull() {
            addCriterion("articleId is null");
            return (Criteria) this;
        }

        public Criteria andArticleidIsNotNull() {
            addCriterion("articleId is not null");
            return (Criteria) this;
        }

        public Criteria andArticleidEqualTo(Integer value) {
            addCriterion("articleId =", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotEqualTo(Integer value) {
            addCriterion("articleId <>", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThan(Integer value) {
            addCriterion("articleId >", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleId >=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThan(Integer value) {
            addCriterion("articleId <", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidLessThanOrEqualTo(Integer value) {
            addCriterion("articleId <=", value, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidIn(List<Integer> values) {
            addCriterion("articleId in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotIn(List<Integer> values) {
            addCriterion("articleId not in", values, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidBetween(Integer value1, Integer value2) {
            addCriterion("articleId between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticleidNotBetween(Integer value1, Integer value2) {
            addCriterion("articleId not between", value1, value2, "articleid");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNull() {
            addCriterion("articleTitle is null");
            return (Criteria) this;
        }

        public Criteria andArticletitleIsNotNull() {
            addCriterion("articleTitle is not null");
            return (Criteria) this;
        }

        public Criteria andArticletitleEqualTo(String value) {
            addCriterion("articleTitle =", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotEqualTo(String value) {
            addCriterion("articleTitle <>", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThan(String value) {
            addCriterion("articleTitle >", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleGreaterThanOrEqualTo(String value) {
            addCriterion("articleTitle >=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThan(String value) {
            addCriterion("articleTitle <", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLessThanOrEqualTo(String value) {
            addCriterion("articleTitle <=", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleLike(String value) {
            addCriterion("articleTitle like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotLike(String value) {
            addCriterion("articleTitle not like", value, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleIn(List<String> values) {
            addCriterion("articleTitle in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotIn(List<String> values) {
            addCriterion("articleTitle not in", values, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleBetween(String value1, String value2) {
            addCriterion("articleTitle between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticletitleNotBetween(String value1, String value2) {
            addCriterion("articleTitle not between", value1, value2, "articletitle");
            return (Criteria) this;
        }

        public Criteria andArticleauthorIsNull() {
            addCriterion("articleAuthor is null");
            return (Criteria) this;
        }

        public Criteria andArticleauthorIsNotNull() {
            addCriterion("articleAuthor is not null");
            return (Criteria) this;
        }

        public Criteria andArticleauthorEqualTo(Integer value) {
            addCriterion("articleAuthor =", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorNotEqualTo(Integer value) {
            addCriterion("articleAuthor <>", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorGreaterThan(Integer value) {
            addCriterion("articleAuthor >", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleAuthor >=", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorLessThan(Integer value) {
            addCriterion("articleAuthor <", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorLessThanOrEqualTo(Integer value) {
            addCriterion("articleAuthor <=", value, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorIn(List<Integer> values) {
            addCriterion("articleAuthor in", values, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorNotIn(List<Integer> values) {
            addCriterion("articleAuthor not in", values, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorBetween(Integer value1, Integer value2) {
            addCriterion("articleAuthor between", value1, value2, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticleauthorNotBetween(Integer value1, Integer value2) {
            addCriterion("articleAuthor not between", value1, value2, "articleauthor");
            return (Criteria) this;
        }

        public Criteria andArticledateIsNull() {
            addCriterion("articleDate is null");
            return (Criteria) this;
        }

        public Criteria andArticledateIsNotNull() {
            addCriterion("articleDate is not null");
            return (Criteria) this;
        }

        public Criteria andArticledateEqualTo(Date value) {
            addCriterionForJDBCDate("articleDate =", value, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateNotEqualTo(Date value) {
            addCriterionForJDBCDate("articleDate <>", value, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateGreaterThan(Date value) {
            addCriterionForJDBCDate("articleDate >", value, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("articleDate >=", value, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateLessThan(Date value) {
            addCriterionForJDBCDate("articleDate <", value, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("articleDate <=", value, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateIn(List<Date> values) {
            addCriterionForJDBCDate("articleDate in", values, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateNotIn(List<Date> values) {
            addCriterionForJDBCDate("articleDate not in", values, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("articleDate between", value1, value2, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticledateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("articleDate not between", value1, value2, "articledate");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionIsNull() {
            addCriterion("articleIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionIsNotNull() {
            addCriterion("articleIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionEqualTo(String value) {
            addCriterion("articleIntroduction =", value, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionNotEqualTo(String value) {
            addCriterion("articleIntroduction <>", value, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionGreaterThan(String value) {
            addCriterion("articleIntroduction >", value, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("articleIntroduction >=", value, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionLessThan(String value) {
            addCriterion("articleIntroduction <", value, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionLessThanOrEqualTo(String value) {
            addCriterion("articleIntroduction <=", value, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionLike(String value) {
            addCriterion("articleIntroduction like", value, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionNotLike(String value) {
            addCriterion("articleIntroduction not like", value, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionIn(List<String> values) {
            addCriterion("articleIntroduction in", values, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionNotIn(List<String> values) {
            addCriterion("articleIntroduction not in", values, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionBetween(String value1, String value2) {
            addCriterion("articleIntroduction between", value1, value2, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleintroductionNotBetween(String value1, String value2) {
            addCriterion("articleIntroduction not between", value1, value2, "articleintroduction");
            return (Criteria) this;
        }

        public Criteria andArticleimgIsNull() {
            addCriterion("articleImg is null");
            return (Criteria) this;
        }

        public Criteria andArticleimgIsNotNull() {
            addCriterion("articleImg is not null");
            return (Criteria) this;
        }

        public Criteria andArticleimgEqualTo(String value) {
            addCriterion("articleImg =", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgNotEqualTo(String value) {
            addCriterion("articleImg <>", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgGreaterThan(String value) {
            addCriterion("articleImg >", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgGreaterThanOrEqualTo(String value) {
            addCriterion("articleImg >=", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgLessThan(String value) {
            addCriterion("articleImg <", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgLessThanOrEqualTo(String value) {
            addCriterion("articleImg <=", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgLike(String value) {
            addCriterion("articleImg like", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgNotLike(String value) {
            addCriterion("articleImg not like", value, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgIn(List<String> values) {
            addCriterion("articleImg in", values, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgNotIn(List<String> values) {
            addCriterion("articleImg not in", values, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgBetween(String value1, String value2) {
            addCriterion("articleImg between", value1, value2, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticleimgNotBetween(String value1, String value2) {
            addCriterion("articleImg not between", value1, value2, "articleimg");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumIsNull() {
            addCriterion("articleReadNum is null");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumIsNotNull() {
            addCriterion("articleReadNum is not null");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumEqualTo(Integer value) {
            addCriterion("articleReadNum =", value, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumNotEqualTo(Integer value) {
            addCriterion("articleReadNum <>", value, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumGreaterThan(Integer value) {
            addCriterion("articleReadNum >", value, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("articleReadNum >=", value, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumLessThan(Integer value) {
            addCriterion("articleReadNum <", value, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumLessThanOrEqualTo(Integer value) {
            addCriterion("articleReadNum <=", value, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumIn(List<Integer> values) {
            addCriterion("articleReadNum in", values, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumNotIn(List<Integer> values) {
            addCriterion("articleReadNum not in", values, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumBetween(Integer value1, Integer value2) {
            addCriterion("articleReadNum between", value1, value2, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticlereadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("articleReadNum not between", value1, value2, "articlereadnum");
            return (Criteria) this;
        }

        public Criteria andArticletypeIsNull() {
            addCriterion("articleType is null");
            return (Criteria) this;
        }

        public Criteria andArticletypeIsNotNull() {
            addCriterion("articleType is not null");
            return (Criteria) this;
        }

        public Criteria andArticletypeEqualTo(String value) {
            addCriterion("articleType =", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotEqualTo(String value) {
            addCriterion("articleType <>", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeGreaterThan(String value) {
            addCriterion("articleType >", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeGreaterThanOrEqualTo(String value) {
            addCriterion("articleType >=", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLessThan(String value) {
            addCriterion("articleType <", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLessThanOrEqualTo(String value) {
            addCriterion("articleType <=", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeLike(String value) {
            addCriterion("articleType like", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotLike(String value) {
            addCriterion("articleType not like", value, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeIn(List<String> values) {
            addCriterion("articleType in", values, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotIn(List<String> values) {
            addCriterion("articleType not in", values, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeBetween(String value1, String value2) {
            addCriterion("articleType between", value1, value2, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticletypeNotBetween(String value1, String value2) {
            addCriterion("articleType not between", value1, value2, "articletype");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumIsNull() {
            addCriterion("articleCommentNum is null");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumIsNotNull() {
            addCriterion("articleCommentNum is not null");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumEqualTo(String value) {
            addCriterion("articleCommentNum =", value, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumNotEqualTo(String value) {
            addCriterion("articleCommentNum <>", value, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumGreaterThan(String value) {
            addCriterion("articleCommentNum >", value, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumGreaterThanOrEqualTo(String value) {
            addCriterion("articleCommentNum >=", value, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumLessThan(String value) {
            addCriterion("articleCommentNum <", value, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumLessThanOrEqualTo(String value) {
            addCriterion("articleCommentNum <=", value, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumLike(String value) {
            addCriterion("articleCommentNum like", value, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumNotLike(String value) {
            addCriterion("articleCommentNum not like", value, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumIn(List<String> values) {
            addCriterion("articleCommentNum in", values, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumNotIn(List<String> values) {
            addCriterion("articleCommentNum not in", values, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumBetween(String value1, String value2) {
            addCriterion("articleCommentNum between", value1, value2, "articlecommentnum");
            return (Criteria) this;
        }

        public Criteria andArticlecommentnumNotBetween(String value1, String value2) {
            addCriterion("articleCommentNum not between", value1, value2, "articlecommentnum");
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