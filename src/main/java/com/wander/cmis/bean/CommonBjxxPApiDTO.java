package com.wander.cmis.bean;

//办件明细信息
public class CommonBjxxPApiDTO {

	private String aac002;//身份证号
	private String recordid;//档案编号
	private String abd101;//案卷类别
	private String abd130;//条形码
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
