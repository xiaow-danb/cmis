package com.wonders.cqjy.ggfw.dto;

import java.io.Serializable;
import java.util.List;


public class XwdbLoanDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8250219706616058496L;
	private Long tac001;//贷款编号
	private String  tac002;//贷款申请日期
	private Double  tac003;//贷款申请总金额
	private String tdi001;//贷款类型
	private String tdi002;//是否担保人担保
	private String tdi003;//贷款年限
	private String tdi004;//是否抵质押担保
	private String tac004;//贷款用途
	private String tac006;//固定电话
	private String tac010;//是否微型企业
	private Double tac011;//家庭月均收入(元）
	private Integer tac012;//就业人数(不含申请人)
	private String tac013;//经营地址
	private String tac016;//个体工商户名称
	private String tac017;//营业执照号码
	private String tac018;//经营项目
	private String tac019;//经营地址电话
	private String tac020;//未结清债务
	private String tac021;//邮政编码
	private String tac022;//营业面积
	private Double tac023;//月租金
	private Double tac024;//总投资
	private Double tac025;//月销售收入
	private Double tac026;//月纯利润
	private Double tac027;//自有资金
	private Integer tac028;//员工人数
	private String  tac029;//证件编号
	private String  tac031;//备注
	private Integer tac071;//区县审核日期
	private Integer tac073;//家庭人口数
	private String tac078;//就业局审核意见
	private String tac079;//意向银行
	private String tac081;//申报直属统筹区
	private String tac082;//就业审核状态
	private String tac083;//发放审核状态
	private Double tac089;//政策性贷款金额
	private Double tac090;//商业贷款
	private String ccc009;//贷款状态
	private String cca080;//申请人类型
	private String caa126;//是否以配偶执照贷款
	private String caa127;//贷款授信年限
	private String caa128;//是否两无贷款人员
	private String caa129;//两无贷款人员类别
	private String caa131;//是否21号文件最新人群
	private String caa130;//人群类别
	private String caa132;//是否免反担保
	private String caa133;//免反担保人群类别
	private String tac121;//营业执照注册时间
	private String aaa027;//贷款申请区
	private String aab301;//贷款申请街道/乡镇
	private String aac002;//身份证号
	private String aac003;//姓名
	private String aac067;//电话
	private String aab003;//企业统一社会信用代码
	private String aab004;//企业名称
	private String tal003;//配偶姓名
	private String tal002;//配偶身份证号码
	private String tal007;//配偶手机号码
	private String tal008;//配偶工作单位
	private Long ccc001;//人员编号
	private Long aab001;//单位编号
	private String tac079a;//小微担保贷款银行编号
	private String aab013;//法人姓名
	private String aab014;//法人证件号码
	private String cdd010; //合伙编号

	public String getCdd010() {
		return cdd010;
	}

	public void setCdd010(String cdd010) {
		this.cdd010 = cdd010;
	}

	//担保人列表
	private List<LoanJm65ApiDto> jm65ApiDtos; 
	//抵质押列表
	private List<LoanJm66ApiDto> jm66ApiDtos; 
	//股东列表
	private List<StockholderApiDto> stockholderApiDtos;
	//员工列表
	private List<LoanEmployeesApiDto> loanEmployeesApiDtos;
	
	public Long getTac001() {
		return tac001;
	}
	public void setTac001(Long tac001) {
		this.tac001 = tac001;
	}
	public String getTac002() {
		return tac002;
	}
	public void setTac002(String tac002) {
		this.tac002 = tac002;
	}
	public Double getTac003() {
		return tac003;
	}
	public void setTac003(Double tac003) {
		this.tac003 = tac003;
	}
	public String getTdi001() {
		return tdi001;
	}
	public void setTdi001(String tdi001) {
		this.tdi001 = tdi001;
	}
	public String getTdi002() {
		return tdi002;
	}
	public void setTdi002(String tdi002) {
		this.tdi002 = tdi002;
	}
	public String getTdi003() {
		return tdi003;
	}
	public void setTdi003(String tdi003) {
		this.tdi003 = tdi003;
	}
	public String getTdi004() {
		return tdi004;
	}
	public void setTdi004(String tdi004) {
		this.tdi004 = tdi004;
	}
	public String getTac004() {
		return tac004;
	}
	public void setTac004(String tac004) {
		this.tac004 = tac004;
	}
	public String getTac006() {
		return tac006;
	}
	public void setTac006(String tac006) {
		this.tac006 = tac006;
	}
	public String getTac010() {
		return tac010;
	}
	public void setTac010(String tac010) {
		this.tac010 = tac010;
	}
	public Double getTac011() {
		return tac011;
	}
	public void setTac011(Double tac011) {
		this.tac011 = tac011;
	}
	
	public String getTac013() {
		return tac013;
	}
	public void setTac013(String tac013) {
		this.tac013 = tac013;
	}
	public String getTac016() {
		return tac016;
	}
	public void setTac016(String tac016) {
		this.tac016 = tac016;
	}
	public String getTac017() {
		return tac017;
	}
	public void setTac017(String tac017) {
		this.tac017 = tac017;
	}
	public String getTac018() {
		return tac018;
	}
	public void setTac018(String tac018) {
		this.tac018 = tac018;
	}
	public String getTac019() {
		return tac019;
	}
	public void setTac019(String tac019) {
		this.tac019 = tac019;
	}
	public String getTac020() {
		return tac020;
	}
	public void setTac020(String tac020) {
		this.tac020 = tac020;
	}
	public String getTac021() {
		return tac021;
	}
	public void setTac021(String tac021) {
		this.tac021 = tac021;
	}
	public String getTac022() {
		return tac022;
	}
	public void setTac022(String tac022) {
		this.tac022 = tac022;
	}
	public Double getTac023() {
		return tac023;
	}
	public void setTac023(Double tac023) {
		this.tac023 = tac023;
	}
	public Double getTac024() {
		return tac024;
	}
	public void setTac024(Double tac024) {
		this.tac024 = tac024;
	}
	public Double getTac025() {
		return tac025;
	}
	public void setTac025(Double tac025) {
		this.tac025 = tac025;
	}
	public Double getTac026() {
		return tac026;
	}
	public void setTac026(Double tac026) {
		this.tac026 = tac026;
	}
	public Double getTac027() {
		return tac027;
	}
	public void setTac027(Double tac027) {
		this.tac027 = tac027;
	}
	public Integer getTac028() {
		return tac028;
	}
	public void setTac028(Integer tac028) {
		this.tac028 = tac028;
	}
	public String getTac029() {
		return tac029;
	}
	public void setTac029(String tac029) {
		this.tac029 = tac029;
	}
	public String getTac031() {
		return tac031;
	}
	public void setTac031(String tac031) {
		this.tac031 = tac031;
	}
	public Integer getTac071() {
		return tac071;
	}
	public void setTac071(Integer tac071) {
		this.tac071 = tac071;
	}
	public Integer getTac073() {
		return tac073;
	}
	public void setTac073(Integer tac073) {
		this.tac073 = tac073;
	}
	public String getTac079() {
		return tac079;
	}
	public void setTac079(String tac079) {
		this.tac079 = tac079;
	}
	public String getTac081() {
		return tac081;
	}
	public void setTac081(String tac081) {
		this.tac081 = tac081;
	}
	public String getTac082() {
		return tac082;
	}
	public void setTac082(String tac082) {
		this.tac082 = tac082;
	}
	public String getTac083() {
		return tac083;
	}
	public void setTac083(String tac083) {
		this.tac083 = tac083;
	}
	public Double getTac089() {
		return tac089;
	}
	public void setTac089(Double tac089) {
		this.tac089 = tac089;
	}
	public Double getTac090() {
		return tac090;
	}
	public void setTac090(Double tac090) {
		this.tac090 = tac090;
	}
	public String getCcc009() {
		return ccc009;
	}
	public void setCcc009(String ccc009) {
		this.ccc009 = ccc009;
	}
	public String getCca080() {
		return cca080;
	}
	public void setCca080(String cca080) {
		this.cca080 = cca080;
	}
	public String getCaa126() {
		return caa126;
	}
	public void setCaa126(String caa126) {
		this.caa126 = caa126;
	}
	public String getCaa127() {
		return caa127;
	}
	public void setCaa127(String caa127) {
		this.caa127 = caa127;
	}
	public String getCaa128() {
		return caa128;
	}
	public void setCaa128(String caa128) {
		this.caa128 = caa128;
	}
	public String getCaa129() {
		return caa129;
	}
	public void setCaa129(String caa129) {
		this.caa129 = caa129;
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
	public String getTac121() {
		return tac121;
	}
	public void setTac121(String tac121) {
		this.tac121 = tac121;
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
	public String getAac067() {
		return aac067;
	}
	public void setAac067(String aac067) {
		this.aac067 = aac067;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	public String getTal008() {
		return tal008;
	}
	public void setTal008(String tal008) {
		this.tal008 = tal008;
	}
	public List<LoanJm65ApiDto> getJm65ApiDtos() {
		return jm65ApiDtos;
	}
	public void setJm65ApiDtos(List<LoanJm65ApiDto> jm65ApiDtos) {
		this.jm65ApiDtos = jm65ApiDtos;
	}
	public List<LoanJm66ApiDto> getJm66ApiDtos() {
		return jm66ApiDtos;
	}
	public void setJm66ApiDtos(List<LoanJm66ApiDto> jm66ApiDtos) {
		this.jm66ApiDtos = jm66ApiDtos;
	}
	public List<StockholderApiDto> getStockholderApiDtos() {
		return stockholderApiDtos;
	}
	public void setStockholderApiDtos(List<StockholderApiDto> stockholderApiDtos) {
		this.stockholderApiDtos = stockholderApiDtos;
	}
	public List<LoanEmployeesApiDto> getLoanEmployeesApiDtos() {
		return loanEmployeesApiDtos;
	}
	public void setLoanEmployeesApiDtos(
			List<LoanEmployeesApiDto> loanEmployeesApiDtos) {
		this.loanEmployeesApiDtos = loanEmployeesApiDtos;
	}
	public Long getCcc001() {
		return ccc001;
	}
	public void setCcc001(Long ccc001) {
		this.ccc001 = ccc001;
	}
	public Long getAab001() {
		return aab001;
	}
	public void setAab001(Long aab001) {
		this.aab001 = aab001;
	}
	public Integer getTac012() {
		return tac012;
	}
	public void setTac012(Integer tac012) {
		this.tac012 = tac012;
	}
	public String getTac078() {
		return tac078;
	}
	public void setTac078(String tac078) {
		this.tac078 = tac078;
	}
	public String getTac079a() {
		return tac079a;
	}
	public void setTac079a(String tac079a) {
		this.tac079a = tac079a;
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
}
