package com.wander.cmis.entity;

public class PolicyguaranteeapplyWithBLOBs extends Policyguaranteeapply {
    private String remark;

    private String verifyreturnreason;

    private String policyverifyreturnreason;

    private String gsverifyreturnreason;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getVerifyreturnreason() {
        return verifyreturnreason;
    }

    public void setVerifyreturnreason(String verifyreturnreason) {
        this.verifyreturnreason = verifyreturnreason == null ? null : verifyreturnreason.trim();
    }

    public String getPolicyverifyreturnreason() {
        return policyverifyreturnreason;
    }

    public void setPolicyverifyreturnreason(String policyverifyreturnreason) {
        this.policyverifyreturnreason = policyverifyreturnreason == null ? null : policyverifyreturnreason.trim();
    }

    public String getGsverifyreturnreason() {
        return gsverifyreturnreason;
    }

    public void setGsverifyreturnreason(String gsverifyreturnreason) {
        this.gsverifyreturnreason = gsverifyreturnreason == null ? null : gsverifyreturnreason.trim();
    }
}