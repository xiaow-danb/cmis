package com.wander.cmis.bean;

import java.io.Serializable;
import java.util.List;

public class LoanXdgsApiDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1682823436270815917L;

	/**
	 * 
	 */
	private String jam202;//网上来源数据编号
	private String jam203;//网上来源数据交互方式
	private String jam204;//网上申请编号	
	private String jam205;//贷款类型	
	private String jam206;//网上客户类型
	private String jam207;//网上申请姓名或者单位名称
	private String jam208;//申请人员类别
	private String jam209;//行业类型
	private String jam210;//联系电话
	private String jam211;//性别
	private String jam212;//身份证号码
	private String jam213;//区县
	private String jam214;//是否微型企业	
	private String jam215;//注册时间
	private Double jam216;//注册资本
	private String jam217;//法人姓名
	private String jam218;//法人联系电话
	private String jam219;//法人身份证号码
	private String jam220;//开户行
	private String jam221;//账号	
	private Double jam222;//资产总额
	private Double jam223;//银行负债
	private Double jam224;//年销售规模
	private String jam225;//主营业务
	private Integer jam226;//带动就业人数
	private String jam227;//纳税人识别号
	private String jam228;//工商营业执照号
	private Double jam229;//创业担保贷款金额
	private Double jam230;//政策组合贷款超过贴息部分
	private Double jam231;//微型企业创业扶持贷款
	private Double jam232;//贷款总金额
	private String jam233;//担保方式
	private Integer jam234;//担保期限
	private Double jam235;//担保费用
	private String jam236;//承贷银行id
	private String jam237;//承贷银行名称
	private Double jam239;//家庭月收入
	private String jam240;//组织机构代码
	private String jam244;//银行分理处
	private List<LoanJm211ApiDto> jm211List;//股东列表
	private List<LoanJm212ApiDto> jm212List;//员工列表	
	private List<LoanJm23ApiDto> jm23List;//担保人列表
	private List<LoanJm24ApiDto> jm24List;//抵质押物列表
	
	private String reMsg;
	
	
	public String getJam202() {
		return jam202;
	}
	public void setJam202(String jam202) {
		this.jam202 = jam202;
	}
	public String getJam203() {
		return jam203;
	}
	public void setJam203(String jam203) {
		this.jam203 = jam203;
	}
	public String getJam204() {
		return jam204;
	}
	public void setJam204(String jam204) {
		this.jam204 = jam204;
	}
	public String getJam205() {
		return jam205;
	}
	public void setJam205(String jam205) {
		this.jam205 = jam205;
	}
	public String getJam206() {
		return jam206;
	}
	public void setJam206(String jam206) {
		this.jam206 = jam206;
	}
	public String getJam207() {
		return jam207;
	}
	public void setJam207(String jam207) {
		this.jam207 = jam207;
	}
	public String getJam208() {
		return jam208;
	}
	public void setJam208(String jam208) {
		this.jam208 = jam208;
	}
	public String getJam209() {
		return jam209;
	}
	public void setJam209(String jam209) {
		this.jam209 = jam209;
	}
	public String getJam210() {
		return jam210;
	}
	public void setJam210(String jam210) {
		this.jam210 = jam210;
	}
	public String getJam211() {
		return jam211;
	}
	public void setJam211(String jam211) {
		this.jam211 = jam211;
	}
	public String getJam212() {
		return jam212;
	}
	public void setJam212(String jam212) {
		this.jam212 = jam212;
	}
	public String getJam213() {
		return jam213;
	}
	public void setJam213(String jam213) {
		this.jam213 = jam213;
	}
	public String getJam214() {
		return jam214;
	}
	public void setJam214(String jam214) {
		this.jam214 = jam214;
	}
	public String getJam215() {
		return jam215;
	}
	public void setJam215(String jam215) {
		this.jam215 = jam215;
	}
	public Double getJam216() {
		return jam216;
	}
	public void setJam216(Double jam216) {
		this.jam216 = jam216;
	}
	public String getJam217() {
		return jam217;
	}
	public void setJam217(String jam217) {
		this.jam217 = jam217;
	}
	public String getJam218() {
		return jam218;
	}
	public void setJam218(String jam218) {
		this.jam218 = jam218;
	}
	public String getJam219() {
		return jam219;
	}
	public void setJam219(String jam219) {
		this.jam219 = jam219;
	}
	public String getJam220() {
		return jam220;
	}
	public void setJam220(String jam220) {
		this.jam220 = jam220;
	}
	public String getJam221() {
		return jam221;
	}
	public void setJam221(String jam221) {
		this.jam221 = jam221;
	}
	public Double getJam222() {
		return jam222;
	}
	public void setJam222(Double jam222) {
		this.jam222 = jam222;
	}
	public Double getJam223() {
		return jam223;
	}
	public void setJam223(Double jam223) {
		this.jam223 = jam223;
	}
	public Double getJam224() {
		return jam224;
	}
	public void setJam224(Double jam224) {
		this.jam224 = jam224;
	}
	public String getJam225() {
		return jam225;
	}
	public void setJam225(String jam225) {
		this.jam225 = jam225;
	}
	public Integer getJam226() {
		return jam226;
	}
	public void setJam226(Integer jam226) {
		this.jam226 = jam226;
	}
	public String getJam227() {
		return jam227;
	}
	public void setJam227(String jam227) {
		this.jam227 = jam227;
	}
	public String getJam228() {
		return jam228;
	}
	public void setJam228(String jam228) {
		this.jam228 = jam228;
	}
	public Double getJam229() {
		return jam229;
	}
	public void setJam229(Double jam229) {
		this.jam229 = jam229;
	}
	public Double getJam230() {
		return jam230;
	}
	public void setJam230(Double jam230) {
		this.jam230 = jam230;
	}
	public Double getJam231() {
		return jam231;
	}
	public void setJam231(Double jam231) {
		this.jam231 = jam231;
	}
	public Double getJam232() {
		return jam232;
	}
	public void setJam232(Double jam232) {
		this.jam232 = jam232;
	}
	public String getJam233() {
		return jam233;
	}
	public void setJam233(String jam233) {
		this.jam233 = jam233;
	}
	
	public Integer getJam234() {
		return jam234;
	}
	public void setJam234(Integer jam234) {
		this.jam234 = jam234;
	}
	public Double getJam235() {
		return jam235;
	}
	public void setJam235(Double jam235) {
		this.jam235 = jam235;
	}
	public String getJam236() {
		return jam236;
	}
	public void setJam236(String jam236) {
		this.jam236 = jam236;
	}
	public String getJam237() {
		return jam237;
	}
	public void setJam237(String jam237) {
		this.jam237 = jam237;
	}
	public Double getJam239() {
		return jam239;
	}
	public void setJam239(Double jam239) {
		this.jam239 = jam239;
	}
	public String getJam240() {
		return jam240;
	}
	public void setJam240(String jam240) {
		this.jam240 = jam240;
	}
	public String getJam244() {
		return jam244;
	}
	public void setJam244(String jam244) {
		this.jam244 = jam244;
	}
	public List<LoanJm211ApiDto> getJm211List() {
		return jm211List;
	}
	public void setJm211List(List<LoanJm211ApiDto> jm211List) {
		this.jm211List = jm211List;
	}
	public List<LoanJm212ApiDto> getJm212List() {
		return jm212List;
	}
	public void setJm212List(List<LoanJm212ApiDto> jm212List) {
		this.jm212List = jm212List;
	}
	public List<LoanJm23ApiDto> getJm23List() {
		return jm23List;
	}
	public void setJm23List(List<LoanJm23ApiDto> jm23List) {
		this.jm23List = jm23List;
	}
	public List<LoanJm24ApiDto> getJm24List() {
		return jm24List;
	}
	public void setJm24List(List<LoanJm24ApiDto> jm24List) {
		this.jm24List = jm24List;
	}
	public String getReMsg() {
		return reMsg;
	}
	public void setReMsg(String reMsg) {
		this.reMsg = reMsg;
	}
	
	
	
	
}
