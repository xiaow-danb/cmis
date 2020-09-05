package com.wander.cmis.beans;

//������˽ӿ�
public class XwdbReviewDTO {

	private Long tac001;//������
	private Integer tac093;//�������
	private String tac095;//���״̬
	private String tac096;//������
	private String tac030a;//���������
	private Integer tac074;//��������
	private String tac083;//����״̬
	private Double tac097;//���Ž��
	private Double tac014;//��������
	public XwdbReviewDTO(Long tac001, Integer tac093, String tac095, String tac096, String tac030a, Integer tac074,
			String tac083, Double tac097, Double tac014) {
		super();
		this.tac001 = tac001;
		this.tac093 = tac093;
		this.tac095 = tac095;
		this.tac096 = tac096;
		this.tac030a = tac030a;
		this.tac074 = tac074;
		this.tac083 = tac083;
		this.tac097 = tac097;
		this.tac014 = tac014;
	}
	@Override
	public String toString() {
		return "XwdbReviewDTO [tac001=" + tac001 + ", tac093=" + tac093 + ", tac095=" + tac095 + ", tac096=" + tac096
				+ ", tac030a=" + tac030a + ", tac074=" + tac074 + ", tac083=" + tac083 + ", tac097=" + tac097
				+ ", tac014=" + tac014 + "]";
	}
	public XwdbReviewDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getTac001() {
		return tac001;
	}
	public void setTac001(Long tac001) {
		this.tac001 = tac001;
	}
	public Integer getTac093() {
		return tac093;
	}
	public void setTac093(Integer tac093) {
		this.tac093 = tac093;
	}
	public String getTac095() {
		return tac095;
	}
	public void setTac095(String tac095) {
		this.tac095 = tac095;
	}
	public String getTac096() {
		return tac096;
	}
	public void setTac096(String tac096) {
		this.tac096 = tac096;
	}
	public String getTac030a() {
		return tac030a;
	}
	public void setTac030a(String tac030a) {
		this.tac030a = tac030a;
	}
	public Integer getTac074() {
		return tac074;
	}
	public void setTac074(Integer tac074) {
		this.tac074 = tac074;
	}
	public String getTac083() {
		return tac083;
	}
	public void setTac083(String tac083) {
		this.tac083 = tac083;
	}
	public Double getTac097() {
		return tac097;
	}
	public void setTac097(Double tac097) {
		this.tac097 = tac097;
	}
	public Double getTac014() {
		return tac014;
	}
	public void setTac014(Double tac014) {
		this.tac014 = tac014;
	}

}
