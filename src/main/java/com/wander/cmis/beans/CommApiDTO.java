package com.wander.cmis.beans;

import java.util.List;

//�����Ϣ���ݴ�����
public class CommApiDTO {
	private String handlingno;//֧��ƽ̨������
	private String recordid;//�������	
	private String abd101;//�������
	private String abd130;//������
	private String abd014;//ҵ����
	private String abd120;//��������
	private String aae011;//������
	private String abd513;//������Դ
	private String viewtype;//
	private String caa999;//����������Դ
	private List<CommonBjxxPApiDTO> bjxxPApiDTOs;//�����ϸ��Ϣ
	public CommApiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommApiDTO(String handlingno, String recordid, String abd101, String abd130, String abd014, String abd120,
			String aae011, String abd513, String viewtype, String caa999, List<CommonBjxxPApiDTO> bjxxPApiDTOs) {
		super();
		this.handlingno = handlingno;
		this.recordid = recordid;
		this.abd101 = abd101;
		this.abd130 = abd130;
		this.abd014 = abd014;
		this.abd120 = abd120;
		this.aae011 = aae011;
		this.abd513 = abd513;
		this.viewtype = viewtype;
		this.caa999 = caa999;
		this.bjxxPApiDTOs = bjxxPApiDTOs;
	}
	public String getHandlingno() {
		return handlingno;
	}
	public void setHandlingno(String handlingno) {
		this.handlingno = handlingno;
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
	public String getAbd014() {
		return abd014;
	}
	public void setAbd014(String abd014) {
		this.abd014 = abd014;
	}
	public String getAbd120() {
		return abd120;
	}
	public void setAbd120(String abd120) {
		this.abd120 = abd120;
	}
	public String getAae011() {
		return aae011;
	}
	public void setAae011(String aae011) {
		this.aae011 = aae011;
	}
	public String getAbd513() {
		return abd513;
	}
	public void setAbd513(String abd513) {
		this.abd513 = abd513;
	}
	public String getViewtype() {
		return viewtype;
	}
	public void setViewtype(String viewtype) {
		this.viewtype = viewtype;
	}
	public String getCaa999() {
		return caa999;
	}
	public void setCaa999(String caa999) {
		this.caa999 = caa999;
	}
	public List<CommonBjxxPApiDTO> getBjxxPApiDTOs() {
		return bjxxPApiDTOs;
	}
	public void setBjxxPApiDTOs(List<CommonBjxxPApiDTO> bjxxPApiDTOs) {
		this.bjxxPApiDTOs = bjxxPApiDTOs;
	}
	@Override
	public String toString() {
		return "CommApiDTO [handlingno=" + handlingno + ", recordid=" + recordid + ", abd101=" + abd101 + ", abd130="
				+ abd130 + ", abd014=" + abd014 + ", abd120=" + abd120 + ", aae011=" + aae011 + ", abd513=" + abd513
				+ ", viewtype=" + viewtype + ", caa999=" + caa999 + ", bjxxPApiDTOs=" + bjxxPApiDTOs + "]";
	}
	
}
