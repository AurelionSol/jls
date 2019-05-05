package com.qpanda.jls.pojo;

import java.util.Date;

public class SysView {
    private Integer sysviewid;

    private String sysviewip;

    private Date sysviewdate;

    public Integer getSysviewid() {
        return sysviewid;
    }

    public void setSysviewid(Integer sysviewid) {
        this.sysviewid = sysviewid;
    }

    public String getSysviewip() {
        return sysviewip;
    }

    public void setSysviewip(String sysviewip) {
        this.sysviewip = sysviewip == null ? null : sysviewip.trim();
    }

    public Date getSysviewdate() {
        return sysviewdate;
    }

    public void setSysviewdate(Date sysviewdate) {
        this.sysviewdate = sysviewdate;
    }
}