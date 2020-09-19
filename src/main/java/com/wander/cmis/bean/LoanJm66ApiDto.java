package com.wander.cmis.bean;

import lombok.Data;

import java.math.BigDecimal;

//抵押质押信息
@Data
public class LoanJm66ApiDto {
	private String loanapplyId;//关联id
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
	private Integer tad017;//购买时间 yyyyMMdd格式 资产类别为林权、宅基地、居住性房地产、商业房地产、土地时，必填。
	private String tad019;//抵押物区域 码值TAD019
	private String tad021;//所属乡镇街道 由地区查询接口获取
	private String tad018;//抵押物详细地址
	private String recordid;//档案附件ID
	private String tad022;//担保人签字情况 0未签字，1已签字。

}
