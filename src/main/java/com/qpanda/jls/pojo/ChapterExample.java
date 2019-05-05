package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.List;

public class ChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChapterExample() {
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

        public Criteria andChapteridIsNull() {
            addCriterion("chapterId is null");
            return (Criteria) this;
        }

        public Criteria andChapteridIsNotNull() {
            addCriterion("chapterId is not null");
            return (Criteria) this;
        }

        public Criteria andChapteridEqualTo(Integer value) {
            addCriterion("chapterId =", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotEqualTo(Integer value) {
            addCriterion("chapterId <>", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThan(Integer value) {
            addCriterion("chapterId >", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapterId >=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThan(Integer value) {
            addCriterion("chapterId <", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThanOrEqualTo(Integer value) {
            addCriterion("chapterId <=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridIn(List<Integer> values) {
            addCriterion("chapterId in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotIn(List<Integer> values) {
            addCriterion("chapterId not in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridBetween(Integer value1, Integer value2) {
            addCriterion("chapterId between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotBetween(Integer value1, Integer value2) {
            addCriterion("chapterId not between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapternameIsNull() {
            addCriterion("chapterName is null");
            return (Criteria) this;
        }

        public Criteria andChapternameIsNotNull() {
            addCriterion("chapterName is not null");
            return (Criteria) this;
        }

        public Criteria andChapternameEqualTo(String value) {
            addCriterion("chapterName =", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotEqualTo(String value) {
            addCriterion("chapterName <>", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameGreaterThan(String value) {
            addCriterion("chapterName >", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameGreaterThanOrEqualTo(String value) {
            addCriterion("chapterName >=", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLessThan(String value) {
            addCriterion("chapterName <", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLessThanOrEqualTo(String value) {
            addCriterion("chapterName <=", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameLike(String value) {
            addCriterion("chapterName like", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotLike(String value) {
            addCriterion("chapterName not like", value, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameIn(List<String> values) {
            addCriterion("chapterName in", values, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotIn(List<String> values) {
            addCriterion("chapterName not in", values, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameBetween(String value1, String value2) {
            addCriterion("chapterName between", value1, value2, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapternameNotBetween(String value1, String value2) {
            addCriterion("chapterName not between", value1, value2, "chaptername");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionIsNull() {
            addCriterion("chapterIntroduction is null");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionIsNotNull() {
            addCriterion("chapterIntroduction is not null");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionEqualTo(String value) {
            addCriterion("chapterIntroduction =", value, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionNotEqualTo(String value) {
            addCriterion("chapterIntroduction <>", value, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionGreaterThan(String value) {
            addCriterion("chapterIntroduction >", value, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionGreaterThanOrEqualTo(String value) {
            addCriterion("chapterIntroduction >=", value, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionLessThan(String value) {
            addCriterion("chapterIntroduction <", value, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionLessThanOrEqualTo(String value) {
            addCriterion("chapterIntroduction <=", value, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionLike(String value) {
            addCriterion("chapterIntroduction like", value, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionNotLike(String value) {
            addCriterion("chapterIntroduction not like", value, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionIn(List<String> values) {
            addCriterion("chapterIntroduction in", values, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionNotIn(List<String> values) {
            addCriterion("chapterIntroduction not in", values, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionBetween(String value1, String value2) {
            addCriterion("chapterIntroduction between", value1, value2, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterintroductionNotBetween(String value1, String value2) {
            addCriterion("chapterIntroduction not between", value1, value2, "chapterintroduction");
            return (Criteria) this;
        }

        public Criteria andChapterimgIsNull() {
            addCriterion("chapterImg is null");
            return (Criteria) this;
        }

        public Criteria andChapterimgIsNotNull() {
            addCriterion("chapterImg is not null");
            return (Criteria) this;
        }

        public Criteria andChapterimgEqualTo(String value) {
            addCriterion("chapterImg =", value, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgNotEqualTo(String value) {
            addCriterion("chapterImg <>", value, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgGreaterThan(String value) {
            addCriterion("chapterImg >", value, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgGreaterThanOrEqualTo(String value) {
            addCriterion("chapterImg >=", value, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgLessThan(String value) {
            addCriterion("chapterImg <", value, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgLessThanOrEqualTo(String value) {
            addCriterion("chapterImg <=", value, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgLike(String value) {
            addCriterion("chapterImg like", value, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgNotLike(String value) {
            addCriterion("chapterImg not like", value, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgIn(List<String> values) {
            addCriterion("chapterImg in", values, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgNotIn(List<String> values) {
            addCriterion("chapterImg not in", values, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgBetween(String value1, String value2) {
            addCriterion("chapterImg between", value1, value2, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterimgNotBetween(String value1, String value2) {
            addCriterion("chapterImg not between", value1, value2, "chapterimg");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumIsNull() {
            addCriterion("chapterReadNum is null");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumIsNotNull() {
            addCriterion("chapterReadNum is not null");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumEqualTo(Integer value) {
            addCriterion("chapterReadNum =", value, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumNotEqualTo(Integer value) {
            addCriterion("chapterReadNum <>", value, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumGreaterThan(Integer value) {
            addCriterion("chapterReadNum >", value, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapterReadNum >=", value, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumLessThan(Integer value) {
            addCriterion("chapterReadNum <", value, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumLessThanOrEqualTo(Integer value) {
            addCriterion("chapterReadNum <=", value, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumIn(List<Integer> values) {
            addCriterion("chapterReadNum in", values, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumNotIn(List<Integer> values) {
            addCriterion("chapterReadNum not in", values, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumBetween(Integer value1, Integer value2) {
            addCriterion("chapterReadNum between", value1, value2, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChapterreadnumNotBetween(Integer value1, Integer value2) {
            addCriterion("chapterReadNum not between", value1, value2, "chapterreadnum");
            return (Criteria) this;
        }

        public Criteria andChaptertypeIsNull() {
            addCriterion("chaptertype is null");
            return (Criteria) this;
        }

        public Criteria andChaptertypeIsNotNull() {
            addCriterion("chaptertype is not null");
            return (Criteria) this;
        }

        public Criteria andChaptertypeEqualTo(String value) {
            addCriterion("chaptertype =", value, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeNotEqualTo(String value) {
            addCriterion("chaptertype <>", value, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeGreaterThan(String value) {
            addCriterion("chaptertype >", value, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeGreaterThanOrEqualTo(String value) {
            addCriterion("chaptertype >=", value, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeLessThan(String value) {
            addCriterion("chaptertype <", value, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeLessThanOrEqualTo(String value) {
            addCriterion("chaptertype <=", value, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeLike(String value) {
            addCriterion("chaptertype like", value, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeNotLike(String value) {
            addCriterion("chaptertype not like", value, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeIn(List<String> values) {
            addCriterion("chaptertype in", values, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeNotIn(List<String> values) {
            addCriterion("chaptertype not in", values, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeBetween(String value1, String value2) {
            addCriterion("chaptertype between", value1, value2, "chaptertype");
            return (Criteria) this;
        }

        public Criteria andChaptertypeNotBetween(String value1, String value2) {
            addCriterion("chaptertype not between", value1, value2, "chaptertype");
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