package com.wander.cmis.bean;

import java.math.BigDecimal;
import java.util.List;

//贷款数据传输类

/**
 * 1.表名称中间表-申请信息表:(EXCHANGE_POLGUAAPP)
 *
 */
public class LoanApiDto {

    private CommApiDTO commApiDTO;//业务经办信息
    private String aac002;//借款人身份证号
    private String aac003;//借款人姓名
    private String tac002;//贷款申请日期	yyyyMMdd格式
    private String cca080;//申请人类型	码值CCA080@2 cca130与cca080必填其一。
    private String caa135;//申请人证件类别
    private String caa136;//申请人证件号
    private String caa131;//是否21号文件最新人群	码值AAC081 caa130四个类型，选择后，“是否21号文件最新人群 为”是“，其他类型为否。
    private String caa130;//人群类别 码值CAA130@1 cca130与cca080必填其一。
    private String tac125;//TODO 新增贷款方式
    private String caa133;//TODO 确认免反担保人群类别
    private String caa129;//TODO 新增两无人员类别
    private String caa137;//婚姻状况 码值AAC017@2
    private String caa126;//是否以配偶执照贷款 码值AAC081
    private String tal003;//配偶姓名
    private String tal002;//配偶身份证号码
    private String tal007;//配偶手机号码
    private String tal008;//配偶工作单位
    private Number tac011;//家庭月均收入（元）
    private String caa138;//法律（诉讼）文书送达地址
    private String tac017;//统一社会信用代码
    private String tac016;//个体工商户名称
    private String tac018;//经营项目
    private String tac019;//经营地电话
    private String tac013;//经营地址
    private String tac010;//是否小微企业
    private String tac121;//营业执照注册时间 yyyyMMdd格式
    private String tac117;//税务登记号
    private Number tac028;//员工人数（不含申请人）
    private Number tac012;//本年新招人数（不含申请人）
    private String aaa027;//贷款申请区县 由地区查询接口获取
    private String aab301;//贷款申请街道/乡镇
    private String caa127;//贷款期限 传固定值1。
    private BigDecimal tac089;//创业担保贷款金额（元）
    private BigDecimal tac090;//组合商业贷款金额（元）
    private BigDecimal tac003;//申请贷款总金额（元）
    private String xwdbankid; //TODO 新增意向银行编号
    private String tac004;//贷款用途
    private List<LoanJm65ApiDto> jm65ApiDtos;//担保人列表
    private List<LoanJm66ApiDto> jm66ApiDtos;//抵押质押信息列表
    private String cce099;//本次数据提交状态   1001待反担保人签字；1002提交待审核。
}
