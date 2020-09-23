package com.wonders.cqjy.ggfw.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class XwdbReviewDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6605914197538899492L;
	private Long tac001;//贷款编号
	
	private Integer tac093;//审核日期
	private String tac095;//审核状态
	private String tac096;//审核意见
	
	private String tac030a;//贷款发放类型
	private Integer tac074;//发放日期
	private String tac083;//发放状态
	private BigDecimal tac097;//发放金额
	private Double tac014;//贷款利率
	
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
	public BigDecimal getTac097() {
		return tac097;
	}
	public void setTac097(BigDecimal tac097) {
		this.tac097 = tac097;
	}
	public Double getTac014() {
		return tac014;
	}
	public void setTac014(Double tac014) {
		this.tac014 = tac014;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTac030a() {
		return tac030a;
	}
	public void setTac030a(String tac030a) {
		this.tac030a = tac030a;
	}
	
}
