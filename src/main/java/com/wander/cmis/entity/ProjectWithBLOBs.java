package com.wander.cmis.entity;

public class ProjectWithBLOBs extends Project {
    private String applyopinion;

    private String counterguaranteeplan;

    private String payloanplan;

    private String payloansource;

    private String description;

    private String remark;

    private String projectmgraopinion;

    public String getApplyopinion() {
        return applyopinion;
    }

    public void setApplyopinion(String applyopinion) {
        this.applyopinion = applyopinion == null ? null : applyopinion.trim();
    }

    public String getCounterguaranteeplan() {
        return counterguaranteeplan;
    }

    public void setCounterguaranteeplan(String counterguaranteeplan) {
        this.counterguaranteeplan = counterguaranteeplan == null ? null : counterguaranteeplan.trim();
    }

    public String getPayloanplan() {
        return payloanplan;
    }

    public void setPayloanplan(String payloanplan) {
        this.payloanplan = payloanplan == null ? null : payloanplan.trim();
    }

    public String getPayloansource() {
        return payloansource;
    }

    public void setPayloansource(String payloansource) {
        this.payloansource = payloansource == null ? null : payloansource.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getProjectmgraopinion() {
        return projectmgraopinion;
    }

    public void setProjectmgraopinion(String projectmgraopinion) {
        this.projectmgraopinion = projectmgraopinion == null ? null : projectmgraopinion.trim();
    }
}