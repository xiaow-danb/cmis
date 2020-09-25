package com.wander.cmis.bean;


import java.io.Serializable;

public class CompanyInfoDto implements Serializable {

    //统一社会信用代码
    private String licensenum;
    //企业名称
    private String companyName;
    //审批时间
    private String autidDate;
    //审批结果 yes为通过 no为为未通过
    private String autidResult;
    //备注
    private String remark;

    public String getLicensenum() {
        return licensenum;
    }

    public void setLicensenum(String licensenum) {
        this.licensenum = licensenum;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
}
