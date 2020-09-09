package com.wander.cmis.bean;

import java.math.BigDecimal;

//人员基础信息数据传输类
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
	public String getAac161() {
		return aac161;
	}
	public void setAac161(String aac161) {
		this.aac161 = aac161;
	}
	public String getAac058() {
		return aac058;
	}
	public void setAac058(String aac058) {
		this.aac058 = aac058;
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
	public String getAac004() {
		return aac004;
	}
	public void setAac004(String aac004) {
		this.aac004 = aac004;
	}
	public BigDecimal getAac006() {
		return aac006;
	}
	public void setAac006(BigDecimal aac006) {
		this.aac006 = aac006;
	}
	public String getAac009() {
		return aac009;
	}
	public void setAac009(String aac009) {
		this.aac009 = aac009;
	}
	public String getAac005() {
		return aac005;
	}
	public void setAac005(String aac005) {
		this.aac005 = aac005;
	}
	public String getAac024() {
		return aac024;
	}
	public void setAac024(String aac024) {
		this.aac024 = aac024;
	}
	public String getAaf016() {
		return aaf016;
	}
	public void setAaf016(String aaf016) {
		this.aaf016 = aaf016;
	}
	public String getAac010() {
		return aac010;
	}
	public void setAac010(String aac010) {
		this.aac010 = aac010;
	}
	public String getAac011() {
		return aac011;
	}
	public void setAac011(String aac011) {
		this.aac011 = aac011;
	}
	public String getAac033() {
		return aac033;
	}
	public void setAac033(String aac033) {
		this.aac033 = aac033;
	}
	public String getAla040() {
		return ala040;
	}
	public void setAla040(String ala040) {
		this.ala040 = ala040;
	}
	public String getCaa027() {
		return caa027;
	}
	public void setCaa027(String caa027) {
		this.caa027 = caa027;
	}
	public String getAae271() {
		return aae271;
	}
	public void setAae271(String aae271) {
		this.aae271 = aae271;
	}
	public String getAac067() {
		return aac067;
	}
	public void setAac067(String aac067) {
		this.aac067 = aac067;
	}
	public String getAae005() {
		return aae005;
	}
	public void setAae005(String aae005) {
		this.aae005 = aae005;
	}
	public String getAae159() {
		return aae159;
	}
	public void setAae159(String aae159) {
		this.aae159 = aae159;
	}
	public String getAae806() {
		return aae806;
	}
	public void setAae806(String aae806) {
		this.aae806 = aae806;
	}
	public String getCce017() {
		return cce017;
	}
	public void setCce017(String cce017) {
		this.cce017 = cce017;
	}
	public String getAac015() {
		return aac015;
	}
	public void setAac015(String aac015) {
		this.aac015 = aac015;
	}
	public String getAca200() {
		return aca200;
	}
	public void setAca200(String aca200) {
		this.aca200 = aca200;
	}
	public String getAca202() {
		return aca202;
	}
	public void setAca202(String aca202) {
		this.aca202 = aca202;
	}
	public String getAca201() {
		return aca201;
	}
	public void setAca201(String aca201) {
		this.aca201 = aca201;
	}
	public String getAca203() {
		return aca203;
	}
	public void setAca203(String aca203) {
		this.aca203 = aca203;
	}
	public String getAac200() {
		return aac200;
	}
	public void setAac200(String aac200) {
		this.aac200 = aac200;
	}
	public String getAac014() {
		return aac014;
	}
	public void setAac014(String aac014) {
		this.aac014 = aac014;
	}
	public String getAca204() {
		return aca204;
	}
	public void setAca204(String aca204) {
		this.aca204 = aca204;
	}
	public String getAca206() {
		return aca206;
	}
	public void setAca206(String aca206) {
		this.aca206 = aca206;
	}
	public String getAca205() {
		return aca205;
	}
	public void setAca205(String aca205) {
		this.aca205 = aca205;
	}
	public String getAca207() {
		return aca207;
	}
	public void setAca207(String aca207) {
		this.aca207 = aca207;
	}
	public String getCca014() {
		return cca014;
	}
	public void setCca014(String cca014) {
		this.cca014 = cca014;
	}
	public String getCca015() {
		return cca015;
	}
	public void setCca015(String cca015) {
		this.cca015 = cca015;
	}
	public String getCca016() {
		return cca016;
	}
	public void setCca016(String cca016) {
		this.cca016 = cca016;
	}
	public String getCce016() {
		return cce016;
	}
	public void setCce016(String cce016) {
		this.cce016 = cce016;
	}
	public BigDecimal getCce011() {
		return cce011;
	}
	public void setCce011(BigDecimal cce011) {
		this.cce011 = cce011;
	}
	public String getCac008() {
		return cac008;
	}
	public void setCac008(String cac008) {
		this.cac008 = cac008;
	}
	public String getAaz068() {
		return aaz068;
	}
	public void setAaz068(String aaz068) {
		this.aaz068 = aaz068;
	}
	public String getCac639() {
		return cac639;
	}
	public void setCac639(String cac639) {
		this.cac639 = cac639;
	}
	public String getCac640() {
		return cac640;
	}
	public void setCac640(String cac640) {
		this.cac640 = cac640;
	}
	public String getCac641() {
		return cac641;
	}
	public void setCac641(String cac641) {
		this.cac641 = cac641;
	}
	public String getCca023() {
		return cca023;
	}
	public void setCca023(String cca023) {
		this.cca023 = cca023;
	}
	public String getCca024() {
		return cca024;
	}
	public void setCca024(String cca024) {
		this.cca024 = cca024;
	}
	public String getCca025() {
		return cca025;
	}
	public void setCca025(String cca025) {
		this.cca025 = cca025;
	}
	public String getCca026() {
		return cca026;
	}
	public void setCca026(String cca026) {
		this.cca026 = cca026;
	}
	public String getCca022() {
		return cca022;
	}
	public void setCca022(String cca022) {
		this.cca022 = cca022;
	}
	public String getAac148() {
		return aac148;
	}
	public void setAac148(String aac148) {
		this.aac148 = aac148;
	}
	public String getCce019() {
		return cce019;
	}
	public void setCce019(String cce019) {
		this.cce019 = cce019;
	}
	public BigDecimal getAcc034() {
		return acc034;
	}
	public void setAcc034(BigDecimal acc034) {
		this.acc034 = acc034;
	}
	private String aac148;//����״��
	private String cce019;//����״��֤���
	private BigDecimal acc034;//������н

	
	
	
	
}
