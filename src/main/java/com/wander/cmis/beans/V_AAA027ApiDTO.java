package com.wander.cmis.beans;

public class V_AAA027ApiDTO {

	private String code;
	private String parentcode;
	public V_AAA027ApiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public V_AAA027ApiDTO(String code, String parentcode) {
		super();
		this.code = code;
		this.parentcode = parentcode;
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
	@Override
	public String toString() {
		return "V_AAA027ApiDTO [code=" + code + ", parentcode=" + parentcode + "]";
	}
	
	
}
