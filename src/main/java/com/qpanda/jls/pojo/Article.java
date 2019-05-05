package com.qpanda.jls.pojo;

import java.util.Date;

public class Article {
    private Integer articleid;

    private String articletitle;

    private Integer articleauthor;

    private Date articledate;

    private String articleintroduction;

    private String articleimg;

    private Integer articlereadnum;

    private String articletype;

    private String articlecommentnum;

    private String articlecontent;

    public Integer getArticleid() {
        return articleid;
    }

    public void setArticleid(Integer articleid) {
        this.articleid = articleid;
    }

    public String getArticletitle() {
        return articletitle;
    }

    public void setArticletitle(String articletitle) {
        this.articletitle = articletitle == null ? null : articletitle.trim();
    }

    public Integer getArticleauthor() {
        return articleauthor;
    }

    public void setArticleauthor(Integer articleauthor) {
        this.articleauthor = articleauthor;
    }

    public Date getArticledate() {
        return articledate;
    }

    public void setArticledate(Date articledate) {
        this.articledate = articledate;
    }

    public String getArticleintroduction() {
        return articleintroduction;
    }

    public void setArticleintroduction(String articleintroduction) {
        this.articleintroduction = articleintroduction == null ? null : articleintroduction.trim();
    }

    public String getArticleimg() {
        return articleimg;
    }

    public void setArticleimg(String articleimg) {
        this.articleimg = articleimg == null ? null : articleimg.trim();
    }

    public Integer getArticlereadnum() {
        return articlereadnum;
    }

    public void setArticlereadnum(Integer articlereadnum) {
        this.articlereadnum = articlereadnum;
    }

    public String getArticletype() {
        return articletype;
    }

    public void setArticletype(String articletype) {
        this.articletype = articletype == null ? null : articletype.trim();
    }

    public String getArticlecommentnum() {
        return articlecommentnum;
    }

    public void setArticlecommentnum(String articlecommentnum) {
        this.articlecommentnum = articlecommentnum == null ? null : articlecommentnum.trim();
    }

    public String getArticlecontent() {
        return articlecontent;
    }

    public void setArticlecontent(String articlecontent) {
        this.articlecontent = articlecontent == null ? null : articlecontent.trim();
    }
}