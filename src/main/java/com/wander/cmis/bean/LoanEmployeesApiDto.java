package com.wander.cmis.bean;

//员工信息
public class LoanEmployeesApiDto {

	private Long acc002;//就业登记编号
	private Long ccc001;//人员编号
	private String aac002;//身份证号
	private String aac003;//姓名
	private String aac004;//性别 码值AAC004
	private String aac004des;//性别描述
	private String aac009;//户口性质 码值AAC009

	private String aac011;//文化程度 码值AAC011
	private String aac011des;//文化程度描述
	private String cca014;//人员类别1 码值CCA014
	private String cca014des;//人员类别1描述
	private String cca015;//人员类别2 码值CCA014

	private String cca015des;//人员类别2描述
	private String cca016;//人员类别3 码值CCA014
	private String cca016des;//人员类别3描述
	private String cca080;//贷款人员类别 码值CCA080
	private String cca080des;//贷款人员类别描述

	public LoanEmployeesApiDto() {
		super();
	}

	public LoanEmployeesApiDto(Long acc002, Long ccc001, String aac002, String aac003, String aac004, String aac004des, String aac009, String aac011, String aac011des, String cca014, String cca014des, String cca015, String cca015des, String cca016, String cca016des, String cca080, String cca080des) {
		this.acc002 = acc002;
		this.ccc001 = ccc001;
		this.aac002 = aac002;
		this.aac003 = aac003;
		this.aac004 = aac004;
		this.aac004des = aac004des;
		this.aac009 = aac009;
		this.aac011 = aac011;
		this.aac011des = aac011des;
		this.cca014 = cca014;
		this.cca014des = cca014des;
		this.cca015 = cca015;
		this.cca015des = cca015des;
		this.cca016 = cca016;
		this.cca016des = cca016des;
		this.cca080 = cca080;
		this.cca080des = cca080des;
	}

	@Override
	public String toString() {
		return "LoanEmployeesApiDto{" +
				"acc002=" + acc002 +
				", ccc001=" + ccc001 +
				", aac002='" + aac002 + '\'' +
				", aac003='" + aac003 + '\'' +
				", aac004='" + aac004 + '\'' +
				", aac004des='" + aac004des + '\'' +
				", aac009='" + aac009 + '\'' +
				", aac011='" + aac011 + '\'' +
				", aac011des='" + aac011des + '\'' +
				", cca014='" + cca014 + '\'' +
				", cca014des='" + cca014des + '\'' +
				", cca015='" + cca015 + '\'' +
				", cca015des='" + cca015des + '\'' +
				", cca016='" + cca016 + '\'' +
				", cca016des='" + cca016des + '\'' +
				", cca080='" + cca080 + '\'' +
				", cca080des='" + cca080des + '\'' +
				'}';
	}

	public Long getAcc002() {
		return acc002;
	}

	public void setAcc002(Long acc002) {
		this.acc002 = acc002;
	}

	public Long getCcc001() {
		return ccc001;
	}

	public void setCcc001(Long ccc001) {
		this.ccc001 = ccc001;
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

	public String getAac004() {
		return aac004;
	}

	public void setAac004(String aac004) {
		this.aac004 = aac004;
	}

	public String getAac004des() {
		return aac004des;
	}

	public void setAac004des(String aac004des) {
		this.aac004des = aac004des;
	}

	public String getAac009() {
		return aac009;
	}

	public void setAac009(String aac009) {
		this.aac009 = aac009;
	}

	public String getAac011() {
		return aac011;
	}

	public void setAac011(String aac011) {
		this.aac011 = aac011;
	}

	public String getAac011des() {
		return aac011des;
	}

	public void setAac011des(String aac011des) {
		this.aac011des = aac011des;
	}

	public String getCca014() {
		return cca014;
	}

	public void setCca014(String cca014) {
		this.cca014 = cca014;
	}

	public String getCca014des() {
		return cca014des;
	}

	public void setCca014des(String cca014des) {
		this.cca014des = cca014des;
	}

	public String getCca015() {
		return cca015;
	}

	public void setCca015(String cca015) {
		this.cca015 = cca015;
	}

	public String getCca015des() {
		return cca015des;
	}

	public void setCca015des(String cca015des) {
		this.cca015des = cca015des;
	}

	public String getCca016() {
		return cca016;
	}

	public void setCca016(String cca016) {
		this.cca016 = cca016;
	}

	public String getCca016des() {
		return cca016des;
	}

	public void setCca016des(String cca016des) {
		this.cca016des = cca016des;
	}

	public String getCca080() {
		return cca080;
	}

	public void setCca080(String cca080) {
		this.cca080 = cca080;
	}

	public String getCca080des() {
		return cca080des;
	}

	public void setCca080des(String cca080des) {
		this.cca080des = cca080des;
	}
}
