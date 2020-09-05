package com.wander.cmis.beans;

public class InitBean1 {
    private String name;

    private String code;

    private String parentcode;

    private String parentname;

    public InitBean1(String name, String code, String parentcode, String parentname) {
        this.name = name;
        this.code = code;
        this.parentcode = parentcode;
        this.parentname = parentname;
    }

    public InitBean1() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentcode() {
        return parentcode;
    }

    public void setParentcode(String parentcode) {
        this.parentcode = parentcode;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    @Override
    public String toString() {
        return "InitBean1{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", parentcode='" + parentcode + '\'' +
                ", parentname='" + parentname + '\'' +
                '}';
    }
}
