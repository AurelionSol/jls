package com.qpanda.jls.pojo;

public class Chapter {
    private Integer chapterid;

    private String chaptername;

    private String chapterintroduction;

    private String chapterimg;

    private Integer chapterreadnum;

    private String chaptertype;

    private String chaptercontent;

    public Integer getChapterid() {
        return chapterid;
    }

    public void setChapterid(Integer chapterid) {
        this.chapterid = chapterid;
    }

    public String getChaptername() {
        return chaptername;
    }

    public void setChaptername(String chaptername) {
        this.chaptername = chaptername == null ? null : chaptername.trim();
    }

    public String getChapterintroduction() {
        return chapterintroduction;
    }

    public void setChapterintroduction(String chapterintroduction) {
        this.chapterintroduction = chapterintroduction == null ? null : chapterintroduction.trim();
    }

    public String getChapterimg() {
        return chapterimg;
    }

    public void setChapterimg(String chapterimg) {
        this.chapterimg = chapterimg == null ? null : chapterimg.trim();
    }

    public Integer getChapterreadnum() {
        return chapterreadnum;
    }

    public void setChapterreadnum(Integer chapterreadnum) {
        this.chapterreadnum = chapterreadnum;
    }

    public String getChaptertype() {
        return chaptertype;
    }

    public void setChaptertype(String chaptertype) {
        this.chaptertype = chaptertype == null ? null : chaptertype.trim();
    }

    public String getChaptercontent() {
        return chaptercontent;
    }

    public void setChaptercontent(String chaptercontent) {
        this.chaptercontent = chaptercontent == null ? null : chaptercontent.trim();
    }
}