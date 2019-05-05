package com.qpanda.jls.pojo;

import java.util.Date;

public class SysLog {
    private Integer syslogid;

    private String syslogip;

    private Date syslogdate;

    private String syslogurl;

    private String syslogby;

    public Integer getSyslogid() {
        return syslogid;
    }

    public void setSyslogid(Integer syslogid) {
        this.syslogid = syslogid;
    }

    public String getSyslogip() {
        return syslogip;
    }

    public void setSyslogip(String syslogip) {
        this.syslogip = syslogip == null ? null : syslogip.trim();
    }

    public Date getSyslogdate() {
        return syslogdate;
    }

    public void setSyslogdate(Date syslogdate) {
        this.syslogdate = syslogdate;
    }

    public String getSyslogurl() {
        return syslogurl;
    }

    public void setSyslogurl(String syslogurl) {
        this.syslogurl = syslogurl == null ? null : syslogurl.trim();
    }

    public String getSyslogby() {
        return syslogby;
    }

    public void setSyslogby(String syslogby) {
        this.syslogby = syslogby == null ? null : syslogby.trim();
    }
}