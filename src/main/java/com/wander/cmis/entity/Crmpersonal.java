package com.wander.cmis.entity;

import java.math.BigDecimal;

public class Crmpersonal {
    private String id;

    private BigDecimal birthday;

    private String gender;

    private String livaddr;

    private String marital;

    private String professiontype;

    private String zipcode;

    private String familyassetsid;

    private String crmpersonalextId;

    private String professionid;

    private Long isautocrate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public BigDecimal getBirthday() {
        return birthday;
    }

    public void setBirthday(BigDecimal birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getLivaddr() {
        return livaddr;
    }

    public void setLivaddr(String livaddr) {
        this.livaddr = livaddr == null ? null : livaddr.trim();
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital == null ? null : marital.trim();
    }

    public String getProfessiontype() {
        return professiontype;
    }

    public void setProfessiontype(String professiontype) {
        this.professiontype = professiontype == null ? null : professiontype.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public String getFamilyassetsid() {
        return familyassetsid;
    }

    public void setFamilyassetsid(String familyassetsid) {
        this.familyassetsid = familyassetsid == null ? null : familyassetsid.trim();
    }

    public String getCrmpersonalextId() {
        return crmpersonalextId;
    }

    public void setCrmpersonalextId(String crmpersonalextId) {
        this.crmpersonalextId = crmpersonalextId == null ? null : crmpersonalextId.trim();
    }

    public String getProfessionid() {
        return professionid;
    }

    public void setProfessionid(String professionid) {
        this.professionid = professionid == null ? null : professionid.trim();
    }

    public Long getIsautocrate() {
        return isautocrate;
    }

    public void setIsautocrate(Long isautocrate) {
        this.isautocrate = isautocrate;
    }
}