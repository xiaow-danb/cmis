package com.wander.cmis.bean;

import java.io.Serializable;

public class LoanJm211ApiDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9044075311794506048L;

	private String jam202 ;//		网上申请编号JAM202
	private String jbm202 ;//		股东姓名JBM202
	private String jbm203 ;//		股东身份证JBM203
	private Double jbm204 ;//		股东出资金额JBM204
	private String jbm205 ;//		股东电话JBM205
	
	
	public String getJam202() {
		return jam202;
	}
	public void setJam202(String jam202) {
		this.jam202 = jam202;
	}
	public String getJbm202() {
		return jbm202;
	}
	public void setJbm202(String jbm202) {
		this.jbm202 = jbm202;
	}
	public String getJbm203() {
		return jbm203;
	}
	public void setJbm203(String jbm203) {
		this.jbm203 = jbm203;
	}
	public Double getJbm204() {
		return jbm204;
	}
	public void setJbm204(Double jbm204) {
		this.jbm204 = jbm204;
	}
	public String getJbm205() {
		return jbm205;
	}
	public void setJbm205(String jbm205) {
		this.jbm205 = jbm205;
	}
	
	
	
	
	
}
