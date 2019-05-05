package com.qpanda.jls.pojo;

public class Plan {
    private Integer planid;

    private String planname;

    private String planlevel;

    public Integer getPlanid() {
        return planid;
    }

    public void setPlanid(Integer planid) {
        this.planid = planid;
    }

    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname == null ? null : planname.trim();
    }

    public String getPlanlevel() {
        return planlevel;
    }

    public void setPlanlevel(String planlevel) {
        this.planlevel = planlevel == null ? null : planlevel.trim();
    }
}