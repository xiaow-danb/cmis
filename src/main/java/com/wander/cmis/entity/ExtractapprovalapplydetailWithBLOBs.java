package com.wander.cmis.entity;

public class ExtractapprovalapplydetailWithBLOBs extends Extractapprovalapplydetail {
    private String remark;

    private String verifyreturnreason;

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
}