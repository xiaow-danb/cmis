package com.wander.cmis.bean;

import lombok.Data;

import java.util.List;

@Data
public class XwdbLoanDTO {

	private Long tac001;//贷款编号
	private String tac002;//贷款申请日期
	private Double tac003;//贷款申请总金额
	private String tdi001;//贷款类型
	private String tdi002;//是否担保人担保
	private String tdi004;//是否抵质押担保
	private String tdi003;//贷款年限
	private String tac004;//贷款用途
	private String tac006;//固定电话
	private String tac010;//是否微型企业
	private Double tac011;//家庭月均收入(元）
	private String tac012;//就业人数(不含申请人)
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
	private String tac029;//证件编号
	private String tac031;//备注
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
	private String aac002;//身份证号码
	private String aac003;//姓名
	private String aac067;//电话
	private String aab003;//企业统一社会信用代码
	private String aab004;//企业名称
//	private String tac002;//配偶身份证号码
//	private String tac003;//配偶姓名
	private String tal007;//配偶手机号码
	private String tal008;//配偶工作单位
	private Long ccc001;//人员编号
	private Long aab001;//单位编号
	private List<LoanJm65ApiDto> loanJm65ApiDtos;//担保人列表
	private List<LoanJm66ApiDto> loanJm66ApiDtos;//抵质押列表
	private List<StockholderApiDto> stockholderApiDtos;//股东列表
	private List<LoanEmployeesApiDto> loanEmployeesApiDtos;//员工列表

	
}
