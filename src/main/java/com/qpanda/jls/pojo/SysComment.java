package com.qpanda.jls.pojo;

import java.util.Date;

public class SysComment {
    private Integer syscommentid;

    private String syscommentcontent;

    private Date syscommentdate;

    private String syscommentname;

    private String syscommentip;

    public Integer getSyscommentid() {
        return syscommentid;
    }

    public void setSyscommentid(Integer syscommentid) {
        this.syscommentid = syscommentid;
    }

    public String getSyscommentcontent() {
        return syscommentcontent;
    }

    public void setSyscommentcontent(String syscommentcontent) {
        this.syscommentcontent = syscommentcontent == null ? null : syscommentcontent.trim();
    }

    public Date getSyscommentdate() {
        return syscommentdate;
    }

    public void setSyscommentdate(Date syscommentdate) {
        this.syscommentdate = syscommentdate;
    }

    public String getSyscommentname() {
        return syscommentname;
    }

    public void setSyscommentname(String syscommentname) {
        this.syscommentname = syscommentname == null ? null : syscommentname.trim();
    }

    public String getSyscommentip() {
        return syscommentip;
    }

    public void setSyscommentip(String syscommentip) {
        this.syscommentip = syscommentip == null ? null : syscommentip.trim();
    }
}