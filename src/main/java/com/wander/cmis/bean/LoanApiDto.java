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
    private String jm118id; //TODO 新增意向银行编号
    private String tac004;//贷款用途
    private List<LoanJm65ApiDto> jm65ApiDtos;//担保人列表
    private List<LoanJm66ApiDto> jm66ApiDtos;//抵押质押信息列表
    private String cce099;//本次数据提交状态   1001待反担保人签字；1002提交待审核。

    public LoanApiDto(){
        super();
    }

    public LoanApiDto(CommApiDTO commApiDTO, String aac002, String aac003, String tac002, String cca080, String caa135, String caa136, String caa131, String caa130, String tac125, String caa133, String caa129, String caa137, String caa126, String tal003, String tal002, String tal007, String tal008, Number tac011, String caa138, String tac017, String tac016, String tac018, String tac019, String tac013, String tac010, String tac121, String tac117, Number tac028, Number tac012, String aaa027, String aab301, String caa127, BigDecimal tac089, BigDecimal tac090, BigDecimal tac003, String jm118id, String tac004, List<LoanJm65ApiDto> jm65ApiDtos, List<LoanJm66ApiDto> jm66ApiDtos, String cce099) {
        this.commApiDTO = commApiDTO;
        this.aac002 = aac002;
        this.aac003 = aac003;
        this.tac002 = tac002;
        this.cca080 = cca080;
        this.caa135 = caa135;
        this.caa136 = caa136;
        this.caa131 = caa131;
        this.caa130 = caa130;
        this.tac125 = tac125;
        this.caa133 = caa133;
        this.caa129 = caa129;
        this.caa137 = caa137;
        this.caa126 = caa126;
        this.tal003 = tal003;
        this.tal002 = tal002;
        this.tal007 = tal007;
        this.tal008 = tal008;
        this.tac011 = tac011;
        this.caa138 = caa138;
        this.tac017 = tac017;
        this.tac016 = tac016;
        this.tac018 = tac018;
        this.tac019 = tac019;
        this.tac013 = tac013;
        this.tac010 = tac010;
        this.tac121 = tac121;
        this.tac117 = tac117;
        this.tac028 = tac028;
        this.tac012 = tac012;
        this.aaa027 = aaa027;
        this.aab301 = aab301;
        this.caa127 = caa127;
        this.tac089 = tac089;
        this.tac090 = tac090;
        this.tac003 = tac003;
        this.jm118id = jm118id;
        this.tac004 = tac004;
        this.jm65ApiDtos = jm65ApiDtos;
        this.jm66ApiDtos = jm66ApiDtos;
        this.cce099 = cce099;
    }

    public CommApiDTO getCommApiDTO() {
        return commApiDTO;
    }

    public void setCommApiDTO(CommApiDTO commApiDTO) {
        this.commApiDTO = commApiDTO;
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

    public String getTac002() {
        return tac002;
    }

    public void setTac002(String tac002) {
        this.tac002 = tac002;
    }

    public String getCca080() {
        return cca080;
    }

    public void setCca080(String cca080) {
        this.cca080 = cca080;
    }

    public String getCaa135() {
        return caa135;
    }

    public void setCaa135(String caa135) {
        this.caa135 = caa135;
    }

    public String getCaa136() {
        return caa136;
    }

    public void setCaa136(String caa136) {
        this.caa136 = caa136;
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

    public String getTac125() {
        return tac125;
    }

    public void setTac125(String tac125) {
        this.tac125 = tac125;
    }

    public String getCaa133() {
        return caa133;
    }

    public void setCaa133(String caa133) {
        this.caa133 = caa133;
    }

    public String getCaa129() {
        return caa129;
    }

    public void setCaa129(String caa129) {
        this.caa129 = caa129;
    }

    public String getCaa137() {
        return caa137;
    }

    public void setCaa137(String caa137) {
        this.caa137 = caa137;
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

    public String getTal008() {
        return tal008;
    }

    public void setTal008(String tal008) {
        this.tal008 = tal008;
    }

    public Number getTac011() {
        return tac011;
    }

    public void setTac011(Number tac011) {
        this.tac011 = tac011;
    }

    public String getCaa138() {
        return caa138;
    }

    public void setCaa138(String caa138) {
        this.caa138 = caa138;
    }

    public String getTac017() {
        return tac017;
    }

    public void setTac017(String tac017) {
        this.tac017 = tac017;
    }

    public String getTac016() {
        return tac016;
    }

    public void setTac016(String tac016) {
        this.tac016 = tac016;
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

    public String getTac013() {
        return tac013;
    }

    public void setTac013(String tac013) {
        this.tac013 = tac013;
    }

    public String getTac010() {
        return tac010;
    }

    public void setTac010(String tac010) {
        this.tac010 = tac010;
    }

    public String getTac121() {
        return tac121;
    }

    public void setTac121(String tac121) {
        this.tac121 = tac121;
    }

    public String getTac117() {
        return tac117;
    }

    public void setTac117(String tac117) {
        this.tac117 = tac117;
    }

    public Number getTac028() {
        return tac028;
    }

    public void setTac028(Number tac028) {
        this.tac028 = tac028;
    }

    public Number getTac012() {
        return tac012;
    }

    public void setTac012(Number tac012) {
        this.tac012 = tac012;
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

    public String getCaa127() {
        return caa127;
    }

    public void setCaa127(String caa127) {
        this.caa127 = caa127;
    }

    public BigDecimal getTac089() {
        return tac089;
    }

    public void setTac089(BigDecimal tac089) {
        this.tac089 = tac089;
    }

    public BigDecimal getTac090() {
        return tac090;
    }

    public void setTac090(BigDecimal tac090) {
        this.tac090 = tac090;
    }

    public BigDecimal getTac003() {
        return tac003;
    }

    public void setTac003(BigDecimal tac003) {
        this.tac003 = tac003;
    }

    public String getJm118id() {
        return jm118id;
    }

    public void setJm118id(String jm118id) {
        this.jm118id = jm118id;
    }

    public String getTac004() {
        return tac004;
    }

    public void setTac004(String tac004) {
        this.tac004 = tac004;
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

    public String getCce099() {
        return cce099;
    }

    public void setCce099(String cce099) {
        this.cce099 = cce099;
    }
}
