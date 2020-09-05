package com.wander.cmis.beans;

//���ڴ��һ�ΰ���ж���Ա��ϸ��������Ϣ
public class CommonBjxxPApiDTO {

	private String aac002;//���֤��
	private String recordid;//�������
	private String abd101;//�������
	private String abd130;//������
	public CommonBjxxPApiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommonBjxxPApiDTO(String aac002, String recordid, String abd101, String abd130) {
		super();
		this.aac002 = aac002;
		this.recordid = recordid;
		this.abd101 = abd101;
		this.abd130 = abd130;
	}
	public String getAac002() {
		return aac002;
	}
	public void setAac002(String aac002) {
		this.aac002 = aac002;
	}
	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public String getAbd101() {
		return abd101;
	}
	public void setAbd101(String abd101) {
		this.abd101 = abd101;
	}
	public String getAbd130() {
		return abd130;
	}
	public void setAbd130(String abd130) {
		this.abd130 = abd130;
	}
	@Override
	public String toString() {
		return "CommonBjxxPApiDTO [aac002=" + aac002 + ", recordid=" + recordid + ", abd101=" + abd101 + ", abd130="
				+ abd130 + "]";
	}
	
}
