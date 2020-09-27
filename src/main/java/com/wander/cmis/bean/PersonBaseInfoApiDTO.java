package com.wander.cmis.bean;

import lombok.Data;

import java.math.BigDecimal;

//人员基础信息数据传输类
@Data
public class PersonBaseInfoApiDTO {

	private String aac161;//国籍或地区 码值CCZ001	个人信息拓展NATIVEHOME
	private String aac058;//证件类型 码值AAC058	客户表CREDENTIALTYPE
	private String aac002;//证件号码
	private String aac003;//姓名
	private String aac004;//性别 AAC004码值
	private BigDecimal aac006;//出生日期 yyyymmdd格式
	private String aac009;//户籍性质 AAC009码值
	private String aac005;//民族 AAC005码值
	private String aac024;//政治面貌 AAC024码值
	private String aaf016; //户籍区域编码 由地区查询接口获取
	private String aac010;//户籍详细地址
	private String aac011;//文化程度/学历 码值AAC011
	private String aac033;//健康状况 码值AAC033
	private String ala040;//伤残等级 码值ALA040
	private String caa027;//常住地区编码 由地区查询接口获取
	private String aae271;//常住地址详细
	private String aac067;//手机号
	private String aae005;//固定电话
	private String aae159;//电子邮件
	private String aae806;//其他联系方式
	private String cce017;//职业（工种）资格1 码值ACA111A
	private String aac015;//职业（工种）资格1等级 码值AAC015
	private String aca200;//职业（工种）资格2 码值ACA111A
	private String aca202;//职业（工种）资格2等级 码值AAC015
	private String aca201;//职业（工种）资格3 码值ACA111A
	private String aca203;//职业（工种）资格3等级 码值AAC015
	private String aac200;//专业技术职务名称1	码值AAC200
	private String aac014;//专业技术职务1级别	码值AAC014
	private String aca204;//专业技术职务名称2	码值AAC200
	private String aca206;//专业技术职务2级别	码值AAC014
	private String aca205;//专业技术职务名称3	码值AAC200
	private String aca207;//专业技术职务3级别	码值AAC014
	private String cca014;//人员类别1	码值CCA014@8
	private String cca015;//人员类别2	码值CCA014@8
	private String cca016;//人员类别3	码值CCA014@8
	private String cce016;//低保证号
	private BigDecimal cce011;//转业时间
	private String cac008;//毕业学校所在区域编码	由地区查询接口获取
	private String aaz068;//毕业学校
	private String cac639;//毕业时间
	private String cac640;//专业	码值AAC048
	private String cac641;//生源地	由地区查询接口获取
	private String cca023;//就业意向1	码值CCA023
	private String cca024;//就业意向2	码值CCA023
	private String cca025;//就业服务需求1	码值CCA025
	private String cca026;//就业服务需求2	码值CCA025
	private String cca022;//就业地意向	码值CCA022
	private String aac148;//����״��
	private String cce019;//����״��֤���
	private BigDecimal acc034;//������н

	private String caa999;//渠道来源
	
	
	
}
