package com.wonders.cqjy.ggfw.dto;

import java.io.Serializable;

public class XwdbQueryApiDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5431219624573202665L;
	private Integer pageNo;//页数
	private Integer pageSize;//每页显示条数
	private Long tac001;//贷款编号
	private String aaa027;//贷款申请区
	private String aab301;//贷款申请街道/乡镇
	private String aac002;//身份证号
	private String aac003;//姓名
	private String tdi001;//贷款类型
	private String aab003;//企业统一社会信用代码
	private String aab004;//企业名称
	private Integer aae030;//贷款申报开始日期
	private Integer aae031;//贷款申报结束日期
	private Integer aae050;//区县审核开始日期
	private Integer aae051;//区县审核结束日期
	private String cca080;//申请人类型
	private String caa131;//是否21号文件最新人群
	private String caa130;//人群类别
	private String caa132;//是否免反担保
	private String caa133;//免反担保人群类别
	private String caa126;//是否以配偶执照贷款
	private String tal003;//配偶姓名
	private String tal002;//配偶身份证号码
	private String tal007;//配偶手机号码
	private String tac016;//个体工商户名称
	private String tac121;//营业执照注册时间
	private String tac079;//意向银行
	private String ccc009;//贷款状态6000：待担保审核4002、待发放
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getAaa027() {
		return aaa027;
	}
	public void setAaa027(String aaa027) {
		this.aaa027 = aaa027;
	}
	public String getAab301() {
		return aab301;
	}
	public void setAab301(String aab301) {
		this.aab301 = aab301;
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
	public Integer getAae030() {
		return aae030;
	}
	public void setAae030(Integer aae030) {
		this.aae030 = aae030;
	}
	public Integer getAae031() {
		return aae031;
	}
	public void setAae031(Integer aae031) {
		this.aae031 = aae031;
	}
	public String getCca080() {
		return cca080;
	}
	public void setCca080(String cca080) {
		this.cca080 = cca080;
	}
	public String getCaa131() {
		return caa131;
	}
	public void setCaa131(String caa131) {
		this.caa131 = caa131;
	}
	public String getCaa130() {
		return caa130;
	}
	public void setCaa130(String caa130) {
		this.caa130 = caa130;
	}
	public String getCaa132() {
		return caa132;
	}
	public void setCaa132(String caa132) {
		this.caa132 = caa132;
	}
	public String getCaa133() {
		return caa133;
	}
	public void setCaa133(String caa133) {
		this.caa133 = caa133;
	}
	public String getCaa126() {
		return caa126;
	}
	public void setCaa126(String caa126) {
		this.caa126 = caa126;
	}
	public String getTal003() {
		return tal003;
	}
	public void setTal003(String tal003) {
		this.tal003 = tal003;
	}
	public String getTal002() {
		return tal002;
	}
	public void setTal002(String tal002) {
		this.tal002 = tal002;
	}
	public String getTal007() {
		return tal007;
	}
	public void setTal007(String tal007) {
		this.tal007 = tal007;
	}
	public String getTac016() {
		return tac016;
	}
	public void setTac016(String tac016) {
		this.tac016 = tac016;
	}
	public String getTac121() {
		return tac121;
	}
	public void setTac121(String tac121) {
		this.tac121 = tac121;
	}
	public String getTac079() {
		return tac079;
	}
	public void setTac079(String tac079) {
		this.tac079 = tac079;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getTdi001() {
		return tdi001;
	}
	public void setTdi001(String tdi001) {
		this.tdi001 = tdi001;
	}
	public Integer getAae050() {
		return aae050;
	}
	public void setAae050(Integer aae050) {
		this.aae050 = aae050;
	}
	public Integer getAae051() {
		return aae051;
	}
	public void setAae051(Integer aae051) {
		this.aae051 = aae051;
	}
	public Long getTac001() {
		return tac001;
	}
	public void setTac001(Long tac001) {
		this.tac001 = tac001;
	}
	public String getCcc009() {
		return ccc009;
	}
	public void setCcc009(String ccc009) {
		this.ccc009 = ccc009;
	}
	
}
