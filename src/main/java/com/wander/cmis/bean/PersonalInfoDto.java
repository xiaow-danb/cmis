package com.wander.cmis.bean;


import java.io.Serializable;

public class PersonalInfoDto implements Serializable {

    //身份证号码
    private String IdCard;
    //名称
    private String name;
    //审批时间
    private String autidDate;
    //审批结果 yes为通过 no为为未通过
    private String autidResult;
    //备注
    private String remark;

    public String getIdCard() {
        return IdCard;
    }

    public void setIdCard(String idCard) {
        IdCard = idCard;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonalInfoDto{" +
                "IdCard='" + IdCard + '\'' +
                ", name='" + name + '\'' +
                ", autidDate='" + autidDate + '\'' +
                ", autidResult='" + autidResult + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
