package com.wander.cmis.beans;

public class InitBean2 {
    private String id;
    private String code;
    private String text;

    public InitBean2() {
        this.id = id;
        this.code = code;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "InitBean2{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
