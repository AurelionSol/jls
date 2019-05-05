package com.qpanda.jls.pojo;

public class Administrator {
    private Integer administratorid;

    private String administratorname;

    private String administratorpassword;

    public Integer getAdministratorid() {
        return administratorid;
    }

    public void setAdministratorid(Integer administratorid) {
        this.administratorid = administratorid;
    }

    public String getAdministratorname() {
        return administratorname;
    }

    public void setAdministratorname(String administratorname) {
        this.administratorname = administratorname == null ? null : administratorname.trim();
    }

    public String getAdministratorpassword() {
        return administratorpassword;
    }

    public void setAdministratorpassword(String administratorpassword) {
        this.administratorpassword = administratorpassword == null ? null : administratorpassword.trim();
    }
}