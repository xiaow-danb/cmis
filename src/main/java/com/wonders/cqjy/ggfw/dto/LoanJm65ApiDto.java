package com.wonders.cqjy.ggfw.dto;

import java.io.Serializable;

public class LoanJm65ApiDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -138896428118665047L;
	/**
	 * 
	 */

	// jm65
	private Long tab001;//担保人信息ID
	private Long tac001;//贷款事件ID
	private String tab002;//身份证号码
	private String tab003;//姓名
	private String tab016;//手机电话
	private String tab005;//家庭住址
	private String tab007;//担保人类型
	private String tab008;//工作单位
	private String tab015;//单位电话
	private Double tab009;//年收入
	private Double tab011;//逾期每月偿还金额
	private Double tab013;//现有负债(元)
	private Integer tab012;//供养人口
	private String tab014;//职务
	private Double tab018;//担保额度
	private String recordid;//附件档案编号
	private String tab020;//签字状态
	
	private String tab007des;//担保人类型
	private String tab020des;//签字状态
	
	
	
	public Long getTab001() {
		return tab001;
	}
	public Long getTac001() {
		return tac001;
	}
	public String getTab002() {
		return tab002;
	}
	public String getTab003() {
		return tab003;
	}
	public String getTab016() {
		return tab016;
	}
	public String getTab005() {
		return tab005;
	}
	public String getTab007() {
		return tab007;
	}
	public String getTab008() {
		return tab008;
	}
	public String getTab015() {
		return tab015;
	}
	public Double getTab009() {
		return tab009;
	}
	public Double getTab011() {
		return tab011;
	}
	public Double getTab013() {
		return tab013;
	}
	public Integer getTab012() {
		return tab012;
	}
	public String getTab014() {
		return tab014;
	}
	public Double getTab018() {
		return tab018;
	}
	public void setTab001(Long tab001) {
		this.tab001 = tab001;
	}
	public void setTac001(Long tac001) {
		this.tac001 = tac001;
	}
	public void setTab002(String tab002) {
		this.tab002 = tab002;
	}
	public void setTab003(String tab003) {
		this.tab003 = tab003;
	}
	public void setTab016(String tab016) {
		this.tab016 = tab016;
	}
	public void setTab005(String tab005) {
		this.tab005 = tab005;
	}
	public void setTab007(String tab007) {
		this.tab007 = tab007;
	}
	public void setTab008(String tab008) {
		this.tab008 = tab008;
	}
	public void setTab015(String tab015) {
		this.tab015 = tab015;
	}
	public void setTab009(Double tab009) {
		this.tab009 = tab009;
	}
	public void setTab011(Double tab011) {
		this.tab011 = tab011;
	}
	public void setTab013(Double tab013) {
		this.tab013 = tab013;
	}
	public void setTab012(Integer tab012) {
		this.tab012 = tab012;
	}
	public void setTab014(String tab014) {
		this.tab014 = tab014;
	}
	public void setTab018(Double tab018) {
		this.tab018 = tab018;
	}
	public String getRecordid() {
		return recordid;
	}
	public String getTab020() {
		return tab020;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public void setTab020(String tab020) {
		this.tab020 = tab020;
	}
	public String getTab007des() {
		return tab007des;
	}
	public String getTab020des() {
		return tab020des;
	}
	public void setTab007des(String tab007des) {
		this.tab007des = tab007des;
	}
	public void setTab020des(String tab020des) {
		this.tab020des = tab020des;
	}
	
	

}
