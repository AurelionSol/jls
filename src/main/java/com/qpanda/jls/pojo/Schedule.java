package com.qpanda.jls.pojo;

public class Schedule {
    private Integer schedulid;

    private String date;

    private String description;

    private Integer schedulUserid;

    public Integer getSchedulid() {
        return schedulid;
    }

    public void setSchedulid(Integer schedulid) {
        this.schedulid = schedulid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSchedulUserid() {
        return schedulUserid;
    }

    public void setSchedulUserid(Integer schedulUserid) {
        this.schedulUserid = schedulUserid;
    }
}