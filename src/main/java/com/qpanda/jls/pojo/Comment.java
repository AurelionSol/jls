package com.qpanda.jls.pojo;

import java.util.Date;

public class Comment {
    private Integer commentid;

    private String commentcontent;

    private Integer commentauthorid;

    private Date commentdate;

    private Integer commentarticleid;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    public Integer getCommentauthorid() {
        return commentauthorid;
    }

    public void setCommentauthorid(Integer commentauthorid) {
        this.commentauthorid = commentauthorid;
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
    }

    public Integer getCommentarticleid() {
        return commentarticleid;
    }

    public void setCommentarticleid(Integer commentarticleid) {
        this.commentarticleid = commentarticleid;
    }
}