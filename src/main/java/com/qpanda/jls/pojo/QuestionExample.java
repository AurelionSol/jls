package com.qpanda.jls.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQuestionidIsNull() {
            addCriterion("questionId is null");
            return (Criteria) this;
        }

        public Criteria andQuestionidIsNotNull() {
            addCriterion("questionId is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionidEqualTo(Integer value) {
            addCriterion("questionId =", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotEqualTo(Integer value) {
            addCriterion("questionId <>", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThan(Integer value) {
            addCriterion("questionId >", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("questionId >=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThan(Integer value) {
            addCriterion("questionId <", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidLessThanOrEqualTo(Integer value) {
            addCriterion("questionId <=", value, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidIn(List<Integer> values) {
            addCriterion("questionId in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotIn(List<Integer> values) {
            addCriterion("questionId not in", values, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidBetween(Integer value1, Integer value2) {
            addCriterion("questionId between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestionidNotBetween(Integer value1, Integer value2) {
            addCriterion("questionId not between", value1, value2, "questionid");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIsNull() {
            addCriterion("questionType is null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIsNotNull() {
            addCriterion("questionType is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeEqualTo(String value) {
            addCriterion("questionType =", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeNotEqualTo(String value) {
            addCriterion("questionType <>", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeGreaterThan(String value) {
            addCriterion("questionType >", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("questionType >=", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeLessThan(String value) {
            addCriterion("questionType <", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeLessThanOrEqualTo(String value) {
            addCriterion("questionType <=", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeLike(String value) {
            addCriterion("questionType like", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeNotLike(String value) {
            addCriterion("questionType not like", value, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeIn(List<String> values) {
            addCriterion("questionType in", values, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeNotIn(List<String> values) {
            addCriterion("questionType not in", values, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeBetween(String value1, String value2) {
            addCriterion("questionType between", value1, value2, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestiontypeNotBetween(String value1, String value2) {
            addCriterion("questionType not between", value1, value2, "questiontype");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentIsNull() {
            addCriterion("questionContent is null");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentIsNotNull() {
            addCriterion("questionContent is not null");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentEqualTo(String value) {
            addCriterion("questionContent =", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotEqualTo(String value) {
            addCriterion("questionContent <>", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentGreaterThan(String value) {
            addCriterion("questionContent >", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentGreaterThanOrEqualTo(String value) {
            addCriterion("questionContent >=", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLessThan(String value) {
            addCriterion("questionContent <", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLessThanOrEqualTo(String value) {
            addCriterion("questionContent <=", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentLike(String value) {
            addCriterion("questionContent like", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotLike(String value) {
            addCriterion("questionContent not like", value, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentIn(List<String> values) {
            addCriterion("questionContent in", values, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotIn(List<String> values) {
            addCriterion("questionContent not in", values, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentBetween(String value1, String value2) {
            addCriterion("questionContent between", value1, value2, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestioncontentNotBetween(String value1, String value2) {
            addCriterion("questionContent not between", value1, value2, "questioncontent");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIsNull() {
            addCriterion("questionAnswer is null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIsNotNull() {
            addCriterion("questionAnswer is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerEqualTo(String value) {
            addCriterion("questionAnswer =", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotEqualTo(String value) {
            addCriterion("questionAnswer <>", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerGreaterThan(String value) {
            addCriterion("questionAnswer >", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerGreaterThanOrEqualTo(String value) {
            addCriterion("questionAnswer >=", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLessThan(String value) {
            addCriterion("questionAnswer <", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLessThanOrEqualTo(String value) {
            addCriterion("questionAnswer <=", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerLike(String value) {
            addCriterion("questionAnswer like", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotLike(String value) {
            addCriterion("questionAnswer not like", value, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerIn(List<String> values) {
            addCriterion("questionAnswer in", values, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotIn(List<String> values) {
            addCriterion("questionAnswer not in", values, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerBetween(String value1, String value2) {
            addCriterion("questionAnswer between", value1, value2, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionanswerNotBetween(String value1, String value2) {
            addCriterion("questionAnswer not between", value1, value2, "questionanswer");
            return (Criteria) this;
        }

        public Criteria andQuestionstarIsNull() {
            addCriterion("questionStar is null");
            return (Criteria) this;
        }

        public Criteria andQuestionstarIsNotNull() {
            addCriterion("questionStar is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionstarEqualTo(String value) {
            addCriterion("questionStar =", value, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarNotEqualTo(String value) {
            addCriterion("questionStar <>", value, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarGreaterThan(String value) {
            addCriterion("questionStar >", value, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarGreaterThanOrEqualTo(String value) {
            addCriterion("questionStar >=", value, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarLessThan(String value) {
            addCriterion("questionStar <", value, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarLessThanOrEqualTo(String value) {
            addCriterion("questionStar <=", value, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarLike(String value) {
            addCriterion("questionStar like", value, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarNotLike(String value) {
            addCriterion("questionStar not like", value, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarIn(List<String> values) {
            addCriterion("questionStar in", values, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarNotIn(List<String> values) {
            addCriterion("questionStar not in", values, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarBetween(String value1, String value2) {
            addCriterion("questionStar between", value1, value2, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionstarNotBetween(String value1, String value2) {
            addCriterion("questionStar not between", value1, value2, "questionstar");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisIsNull() {
            addCriterion("questionAnalysis is null");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisIsNotNull() {
            addCriterion("questionAnalysis is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisEqualTo(String value) {
            addCriterion("questionAnalysis =", value, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisNotEqualTo(String value) {
            addCriterion("questionAnalysis <>", value, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisGreaterThan(String value) {
            addCriterion("questionAnalysis >", value, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisGreaterThanOrEqualTo(String value) {
            addCriterion("questionAnalysis >=", value, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisLessThan(String value) {
            addCriterion("questionAnalysis <", value, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisLessThanOrEqualTo(String value) {
            addCriterion("questionAnalysis <=", value, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisLike(String value) {
            addCriterion("questionAnalysis like", value, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisNotLike(String value) {
            addCriterion("questionAnalysis not like", value, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisIn(List<String> values) {
            addCriterion("questionAnalysis in", values, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisNotIn(List<String> values) {
            addCriterion("questionAnalysis not in", values, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisBetween(String value1, String value2) {
            addCriterion("questionAnalysis between", value1, value2, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionanalysisNotBetween(String value1, String value2) {
            addCriterion("questionAnalysis not between", value1, value2, "questionanalysis");
            return (Criteria) this;
        }

        public Criteria andQuestionaIsNull() {
            addCriterion("questionA is null");
            return (Criteria) this;
        }

        public Criteria andQuestionaIsNotNull() {
            addCriterion("questionA is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionaEqualTo(String value) {
            addCriterion("questionA =", value, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaNotEqualTo(String value) {
            addCriterion("questionA <>", value, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaGreaterThan(String value) {
            addCriterion("questionA >", value, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaGreaterThanOrEqualTo(String value) {
            addCriterion("questionA >=", value, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaLessThan(String value) {
            addCriterion("questionA <", value, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaLessThanOrEqualTo(String value) {
            addCriterion("questionA <=", value, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaLike(String value) {
            addCriterion("questionA like", value, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaNotLike(String value) {
            addCriterion("questionA not like", value, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaIn(List<String> values) {
            addCriterion("questionA in", values, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaNotIn(List<String> values) {
            addCriterion("questionA not in", values, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaBetween(String value1, String value2) {
            addCriterion("questionA between", value1, value2, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionaNotBetween(String value1, String value2) {
            addCriterion("questionA not between", value1, value2, "questiona");
            return (Criteria) this;
        }

        public Criteria andQuestionbIsNull() {
            addCriterion("questionB is null");
            return (Criteria) this;
        }

        public Criteria andQuestionbIsNotNull() {
            addCriterion("questionB is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionbEqualTo(String value) {
            addCriterion("questionB =", value, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbNotEqualTo(String value) {
            addCriterion("questionB <>", value, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbGreaterThan(String value) {
            addCriterion("questionB >", value, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbGreaterThanOrEqualTo(String value) {
            addCriterion("questionB >=", value, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbLessThan(String value) {
            addCriterion("questionB <", value, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbLessThanOrEqualTo(String value) {
            addCriterion("questionB <=", value, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbLike(String value) {
            addCriterion("questionB like", value, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbNotLike(String value) {
            addCriterion("questionB not like", value, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbIn(List<String> values) {
            addCriterion("questionB in", values, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbNotIn(List<String> values) {
            addCriterion("questionB not in", values, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbBetween(String value1, String value2) {
            addCriterion("questionB between", value1, value2, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestionbNotBetween(String value1, String value2) {
            addCriterion("questionB not between", value1, value2, "questionb");
            return (Criteria) this;
        }

        public Criteria andQuestioncIsNull() {
            addCriterion("questionC is null");
            return (Criteria) this;
        }

        public Criteria andQuestioncIsNotNull() {
            addCriterion("questionC is not null");
            return (Criteria) this;
        }

        public Criteria andQuestioncEqualTo(String value) {
            addCriterion("questionC =", value, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncNotEqualTo(String value) {
            addCriterion("questionC <>", value, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncGreaterThan(String value) {
            addCriterion("questionC >", value, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncGreaterThanOrEqualTo(String value) {
            addCriterion("questionC >=", value, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncLessThan(String value) {
            addCriterion("questionC <", value, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncLessThanOrEqualTo(String value) {
            addCriterion("questionC <=", value, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncLike(String value) {
            addCriterion("questionC like", value, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncNotLike(String value) {
            addCriterion("questionC not like", value, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncIn(List<String> values) {
            addCriterion("questionC in", values, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncNotIn(List<String> values) {
            addCriterion("questionC not in", values, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncBetween(String value1, String value2) {
            addCriterion("questionC between", value1, value2, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestioncNotBetween(String value1, String value2) {
            addCriterion("questionC not between", value1, value2, "questionc");
            return (Criteria) this;
        }

        public Criteria andQuestiondIsNull() {
            addCriterion("questionD is null");
            return (Criteria) this;
        }

        public Criteria andQuestiondIsNotNull() {
            addCriterion("questionD is not null");
            return (Criteria) this;
        }

        public Criteria andQuestiondEqualTo(String value) {
            addCriterion("questionD =", value, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondNotEqualTo(String value) {
            addCriterion("questionD <>", value, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondGreaterThan(String value) {
            addCriterion("questionD >", value, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondGreaterThanOrEqualTo(String value) {
            addCriterion("questionD >=", value, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondLessThan(String value) {
            addCriterion("questionD <", value, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondLessThanOrEqualTo(String value) {
            addCriterion("questionD <=", value, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondLike(String value) {
            addCriterion("questionD like", value, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondNotLike(String value) {
            addCriterion("questionD not like", value, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondIn(List<String> values) {
            addCriterion("questionD in", values, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondNotIn(List<String> values) {
            addCriterion("questionD not in", values, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondBetween(String value1, String value2) {
            addCriterion("questionD between", value1, value2, "questiond");
            return (Criteria) this;
        }

        public Criteria andQuestiondNotBetween(String value1, String value2) {
            addCriterion("questionD not between", value1, value2, "questiond");
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