package com.wander.cmis.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
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
	private Integer tac002;//贷款申请日期
	private List<LoanJm211ApiDto> jm211List;//股东列表
	private List<LoanJm212ApiDto> jm212List;//员工列表	
	private List<LoanJm23ApiDto> jm23List;//担保人列表
	private List<LoanJm24ApiDto> jm24List;//抵质押物列表
	
	private String reMsg;
	
	
}
