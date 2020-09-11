package com.wander.cmis.bean;

//股东信息
public class StockholderApiDto {
    private Long gdk001;//股东编号
    private Long aab001;//单位编号
    private String aac002;//身份证号
    private String aac003;//姓名
    private String gdk003;//出资额
    private String gdk004;//手机号
    private String gdk002;//前端操作标识 0不变，1新增，2删除，3修改。
    private String gdk002des;//前端操作标识描述

    public StockholderApiDto() {
        super();
    }

    public StockholderApiDto(Long gdk001, Long aab001, String aac002, String aac003, String gdk003, String gdk004, String gdk002, String gdk002des) {
        this.gdk001 = gdk001;
        this.aab001 = aab001;
        this.aac002 = aac002;
        this.aac003 = aac003;
        this.gdk003 = gdk003;
        this.gdk004 = gdk004;
        this.gdk002 = gdk002;
        this.gdk002des = gdk002des;
    }

    @Override
    public String toString() {
        return "StockholderApiDto{" +
                "gdk001=" + gdk001 +
                ", aab001=" + aab001 +
                ", aac002='" + aac002 + '\'' +
                ", aac003='" + aac003 + '\'' +
                ", gdk003='" + gdk003 + '\'' +
                ", gdk004='" + gdk004 + '\'' +
                ", gdk002='" + gdk002 + '\'' +
                ", gdk002des='" + gdk002des + '\'' +
                '}';
    }

    public Long getGdk001() {
        return gdk001;
    }

    public void setGdk001(Long gdk001) {
        this.gdk001 = gdk001;
    }

    public Long getAab001() {
        return aab001;
    }

    public void setAab001(Long aab001) {
        this.aab001 = aab001;
    }

    public String getAac002() {
        return aac002;
    }

    public void setAac002(String aac002) {
        this.aac002 = aac002;
    }

    public String getAac003() {
        return aac003;
    }

    public void setAac003(String aac003) {
        this.aac003 = aac003;
    }

    public String getGdk003() {
        return gdk003;
    }

    public void setGdk003(String gdk003) {
        this.gdk003 = gdk003;
    }

    public String getGdk004() {
        return gdk004;
    }

    public void setGdk004(String gdk004) {
        this.gdk004 = gdk004;
    }

    public String getGdk002() {
        return gdk002;
    }

    public void setGdk002(String gdk002) {
        this.gdk002 = gdk002;
    }

    public String getGdk002des() {
        return gdk002des;
    }

    public void setGdk002des(String gdk002des) {
        this.gdk002des = gdk002des;
    }
}
