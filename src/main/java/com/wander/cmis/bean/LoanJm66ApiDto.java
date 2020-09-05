package com.wander.cmis.bean;

import java.math.BigDecimal;

//抵押质押信息
public class LoanJm66ApiDto {

	private String tad002;//权属人证件编码
	private String tad003;//姓名
	private String tad008;//手机号码
	private String tad007;//单位电话
	private String tad005;//家庭住址
	private String tad009;//资产权属 码值TAD009
	private String tad010;//资产类别 码值TAD010
	private String tad011;//抵、质押品名称
	private String tad012;//抵、质押品证号
	private BigDecimal tad013;//抵、质押品估价
	private BigDecimal tad014;//抵、质押品面积 资产类别为林权、宅基地、、居住性房地产、商业房地产、土地时，必填。
	private String tad015;//土地属性 码值TAD015 资产类别为林权、宅基地、居住性房地产、商业房地产、土地时，必填。
	private BigDecimal tad016;//购买价值（元） 资产类别为林权、宅基地、居住性房地产、商业房地产、土地时，必填
	private BigDecimal tad017;//购买时间 yyyyMMdd格式 资产类别为林权、宅基地、居住性房地产、商业房地产、土地时，必填。
	private String tad019;//抵押物区域 码值TAD019
	private String tad021;//所属乡镇街道 由地区查询接口获取
	private String tad018;//抵押物详细地址
	private String recordid;//档案附件ID
	private String tad022;//担保人签字情况 0未签字，1已签字。
	public LoanJm66ApiDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoanJm66ApiDto(String tad002, String tad003, String tad008, String tad007, String tad005, String tad009,
			String tad010, String tad011, String tad012, BigDecimal tad013, BigDecimal tad014, String tad015,
			BigDecimal tad016, BigDecimal tad017, String tad019, String tad021, String tad018, String recordid,
			String tad022) {
		super();
		this.tad002 = tad002;
		this.tad003 = tad003;
		this.tad008 = tad008;
		this.tad007 = tad007;
		this.tad005 = tad005;
		this.tad009 = tad009;
		this.tad010 = tad010;
		this.tad011 = tad011;
		this.tad012 = tad012;
		this.tad013 = tad013;
		this.tad014 = tad014;
		this.tad015 = tad015;
		this.tad016 = tad016;
		this.tad017 = tad017;
		this.tad019 = tad019;
		this.tad021 = tad021;
		this.tad018 = tad018;
		this.recordid = recordid;
		this.tad022 = tad022;
	}
	public String getTad002() {
		return tad002;
	}
	public void setTad002(String tad002) {
		this.tad002 = tad002;
	}
	public String getTad003() {
		return tad003;
	}
	public void setTad003(String tad003) {
		this.tad003 = tad003;
	}
	public String getTad008() {
		return tad008;
	}
	public void setTad008(String tad008) {
		this.tad008 = tad008;
	}
	public String getTad007() {
		return tad007;
	}
	public void setTad007(String tad007) {
		this.tad007 = tad007;
	}
	public String getTad005() {
		return tad005;
	}
	public void setTad005(String tad005) {
		this.tad005 = tad005;
	}
	public String getTad009() {
		return tad009;
	}
	public void setTad009(String tad009) {
		this.tad009 = tad009;
	}
	public String getTad010() {
		return tad010;
	}
	public void setTad010(String tad010) {
		this.tad010 = tad010;
	}
	public String getTad011() {
		return tad011;
	}
	public void setTad011(String tad011) {
		this.tad011 = tad011;
	}
	public String getTad012() {
		return tad012;
	}
	public void setTad012(String tad012) {
		this.tad012 = tad012;
	}
	public BigDecimal getTad013() {
		return tad013;
	}
	public void setTad013(BigDecimal tad013) {
		this.tad013 = tad013;
	}
	public BigDecimal getTad014() {
		return tad014;
	}
	public void setTad014(BigDecimal tad014) {
		this.tad014 = tad014;
	}
	public String getTad015() {
		return tad015;
	}
	public void setTad015(String tad015) {
		this.tad015 = tad015;
	}
	public BigDecimal getTad016() {
		return tad016;
	}
	public void setTad016(BigDecimal tad016) {
		this.tad016 = tad016;
	}
	public BigDecimal getTad017() {
		return tad017;
	}
	public void setTad017(BigDecimal tad017) {
		this.tad017 = tad017;
	}
	public String getTad019() {
		return tad019;
	}
	public void setTad019(String tad019) {
		this.tad019 = tad019;
	}
	public String getTad021() {
		return tad021;
	}
	public void setTad021(String tad021) {
		this.tad021 = tad021;
	}
	public String getTad018() {
		return tad018;
	}
	public void setTad018(String tad018) {
		this.tad018 = tad018;
	}
	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public String getTad022() {
		return tad022;
	}
	public void setTad022(String tad022) {
		this.tad022 = tad022;
	}
	
	@Override
	public String toString() {
		return "LoanJm66ApiDto [tad002=" + tad002 + ", tad003=" + tad003 + ", tad008=" + tad008 + ", tad007=" + tad007
				+ ", tad005=" + tad005 + ", tad009=" + tad009 + ", tad010=" + tad010 + ", tad011=" + tad011
				+ ", tad012=" + tad012 + ", tad013=" + tad013 + ", tad014=" + tad014 + ", tad015=" + tad015
				+ ", tad016=" + tad016 + ", tad017=" + tad017 + ", tad019=" + tad019 + ", tad021=" + tad021
				+ ", tad018=" + tad018 + ", recordid=" + recordid + ", tad022=" + tad022 + "]";
	}
	

	
}
