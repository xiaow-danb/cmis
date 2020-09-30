package com.wander.cmis.bean;

import java.io.Serializable;

public class LoanJm212ApiDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4181760801581294698L;
	/**
	 * 
	 */

	private String jam202 ;//		网上申请编号JAM202
	private String jbm202 ;//		股东姓名JBM202
	private String jbm203 ;//		股东身份证JBM203
	
	
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
	
	
}
