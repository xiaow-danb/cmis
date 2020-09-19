package com.wander.cmis.bean;


public class PolguaappDto {

    //公共接口编号
    private String handlingno;
    //就业局贷款编号
    private String applyNo;
    //审批时间
    private String autidDate;
    //审批结果 yes为通过 no为为未通过
    private String autidResult;
    //备注
    private String remark;
    //个人/企业 type 01 个人 02 企业
    private String type;

    public String getHandlingno() {
        return handlingno;
    }

    public void setHandlingno(String handlingno) {
        this.handlingno = handlingno;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getAutidDate() {
        return autidDate;
    }

    public void setAutidDate(String autidDate) {
        this.autidDate = autidDate;
    }

    public String getAutidResult() {
        return autidResult;
    }

    public void setAutidResult(String autidResult) {
        this.autidResult = autidResult;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "PolguaappDto{" +
                "handlingno='" + handlingno + '\'' +
                ", applyNo='" + applyNo + '\'' +
                ", autidDate='" + autidDate + '\'' +
                ", autidResult='" + autidResult + '\'' +
                ", remark='" + remark + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
