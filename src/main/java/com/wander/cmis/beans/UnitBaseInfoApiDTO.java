package com.wander.cmis.beans;

//��λ������Ϣ���ݴ�����
public class UnitBaseInfoApiDTO {

	private CommApiDTO commApiDTO;//�����Ϣ���ݴ�����
	private String aab003;//ͳһ������ô���
	private String aab004;//��λ����
	private String aab019;//��λ����
	private String aab022;//��ҵ����
	private String aab020;//��������
	private String aab013;//��������
	private String aab014;//����֤����
	private String cce014;//��ϵ������
	private String cce015;//��ϵ�绰
	private String aab078;//��λ��������
	private String aae006;//��λע���ַ
	public CommApiDTO getCommApiDTO() {
		return commApiDTO;
	}
	public void setCommApiDTO(CommApiDTO commApiDTO) {
		this.commApiDTO = commApiDTO;
	}
	public String getAab003() {
		return aab003;
	}
	public void setAab003(String aab003) {
		this.aab003 = aab003;
	}
	public String getAab004() {
		return aab004;
	}
	public void setAab004(String aab004) {
		this.aab004 = aab004;
	}
	public String getAab019() {
		return aab019;
	}
	public void setAab019(String aab019) {
		this.aab019 = aab019;
	}
	public String getAab022() {
		return aab022;
	}
	public void setAab022(String aab022) {
		this.aab022 = aab022;
	}
	public String getAab020() {
		return aab020;
	}
	public void setAab020(String aab020) {
		this.aab020 = aab020;
	}
	public String getAab013() {
		return aab013;
	}
	public void setAab013(String aab013) {
		this.aab013 = aab013;
	}
	public String getAab014() {
		return aab014;
	}
	public void setAab014(String aab014) {
		this.aab014 = aab014;
	}
	public String getCce014() {
		return cce014;
	}
	public void setCce014(String cce014) {
		this.cce014 = cce014;
	}
	public String getCce015() {
		return cce015;
	}
	public void setCce015(String cce015) {
		this.cce015 = cce015;
	}
	public String getAab078() {
		return aab078;
	}
	public void setAab078(String aab078) {
		this.aab078 = aab078;
	}
	public String getAae006() {
		return aae006;
	}
	public void setAae006(String aae006) {
		this.aae006 = aae006;
	}
	public UnitBaseInfoApiDTO(CommApiDTO commApiDTO, String aab003, String aab004, String aab019, String aab022,
			String aab020, String aab013, String aab014, String cce014, String cce015, String aab078, String aae006) {
		super();
		this.commApiDTO = commApiDTO;
		this.aab003 = aab003;
		this.aab004 = aab004;
		this.aab019 = aab019;
		this.aab022 = aab022;
		this.aab020 = aab020;
		this.aab013 = aab013;
		this.aab014 = aab014;
		this.cce014 = cce014;
		this.cce015 = cce015;
		this.aab078 = aab078;
		this.aae006 = aae006;
	}
	public UnitBaseInfoApiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UnitBaseInfoApiDTO [commApiDTO=" + commApiDTO + ", aab003=" + aab003 + ", aab004=" + aab004
				+ ", aab019=" + aab019 + ", aab022=" + aab022 + ", aab020=" + aab020 + ", aab013=" + aab013
				+ ", aab014=" + aab014 + ", cce014=" + cce014 + ", cce015=" + cce015 + ", aab078=" + aab078
				+ ", aae006=" + aae006 + "]";
	}
	
	
}
