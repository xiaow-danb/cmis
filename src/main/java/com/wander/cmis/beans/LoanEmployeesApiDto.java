package com.wander.cmis.beans;

//��ҵ��ҵ��Ա��
public class LoanEmployeesApiDto {

	private String aab001;//��λ���
	private String aac002;//���֤����
	private String aac003;//����
	private String aac004;//�Ա�
	private String aac009;//��������
	private String cca014;//��Ա���
	private String cca080;//������Ա���
	public LoanEmployeesApiDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanEmployeesApiDto(String aab001, String aac002, String aac003, String aac004, String aac009, String cca014,
			String cca080) {
		super();
		this.aab001 = aab001;
		this.aac002 = aac002;
		this.aac003 = aac003;
		this.aac004 = aac004;
		this.aac009 = aac009;
		this.cca014 = cca014;
		this.cca080 = cca080;
	}
	public String getAab001() {
		return aab001;
	}
	public void setAab001(String aab001) {
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
	public String getAac004() {
		return aac004;
	}
	public void setAac004(String aac004) {
		this.aac004 = aac004;
	}
	public String getAac009() {
		return aac009;
	}
	public void setAac009(String aac009) {
		this.aac009 = aac009;
	}
	public String getCca014() {
		return cca014;
	}
	public void setCca014(String cca014) {
		this.cca014 = cca014;
	}
	public String getCca080() {
		return cca080;
	}
	public void setCca080(String cca080) {
		this.cca080 = cca080;
	}
	@Override
	public String toString() {
		return "LoanEmployeesApiDto [aab001=" + aab001 + ", aac002=" + aac002 + ", aac003=" + aac003 + ", aac004="
				+ aac004 + ", aac009=" + aac009 + ", cca014=" + cca014 + ", cca080=" + cca080 + "]";
	}
	


}
