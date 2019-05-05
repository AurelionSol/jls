package com.qpanda.jls.pojo;

public class Question {
    private Integer questionid;

    private String questiontype;

    private String questioncontent;

    private String questionanswer;

    private String questionstar;

    private String questionanalysis;

    private String questiona;

    private String questionb;

    private String questionc;

    private String questiond;

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(String questiontype) {
        this.questiontype = questiontype == null ? null : questiontype.trim();
    }

    public String getQuestioncontent() {
        return questioncontent;
    }

    public void setQuestioncontent(String questioncontent) {
        this.questioncontent = questioncontent == null ? null : questioncontent.trim();
    }

    public String getQuestionanswer() {
        return questionanswer;
    }

    public void setQuestionanswer(String questionanswer) {
        this.questionanswer = questionanswer == null ? null : questionanswer.trim();
    }

    public String getQuestionstar() {
        return questionstar;
    }

    public void setQuestionstar(String questionstar) {
        this.questionstar = questionstar == null ? null : questionstar.trim();
    }

    public String getQuestionanalysis() {
        return questionanalysis;
    }

    public void setQuestionanalysis(String questionanalysis) {
        this.questionanalysis = questionanalysis == null ? null : questionanalysis.trim();
    }

    public String getQuestiona() {
        return questiona;
    }

    public void setQuestiona(String questiona) {
        this.questiona = questiona == null ? null : questiona.trim();
    }

    public String getQuestionb() {
        return questionb;
    }

    public void setQuestionb(String questionb) {
        this.questionb = questionb == null ? null : questionb.trim();
    }

    public String getQuestionc() {
        return questionc;
    }

    public void setQuestionc(String questionc) {
        this.questionc = questionc == null ? null : questionc.trim();
    }

    public String getQuestiond() {
        return questiond;
    }

    public void setQuestiond(String questiond) {
        this.questiond = questiond == null ? null : questiond.trim();
    }
}