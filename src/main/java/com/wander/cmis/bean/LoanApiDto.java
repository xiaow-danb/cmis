package com.wander.cmis.bean;

import com.wander.cmis.bean.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class LoanApiDto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5207809670326466334L;

    /**
     *
     */
    /**
     * 办件公共信息
     */
    private CommApiDTO commApiDTO;

    private Long aab001;//单位编号

    private String aac002;//身份证号
    private String aac003;//姓名
    private String aab003;//企业统一社会信用代码
    private String aab004;//企业名称
    private String tak002;//组织机构代码

    private String tac002;//贷款申报日
    private String cca080;//申请人类型
    private String caa135;//申请人证件类别
    private String caa136;//申请人证件号
    private String caa131;//是否21号文件最新人群
    private String caa130;//人群类别
    private String caa132;//是否免反担保
    private String caa133;//免反担保人群类别
    private String caa137;//婚姻状况
    private String caa126;//是否以配偶执照贷款
    private String tal003;//配偶姓名
    private String tal002;//配偶身份证号码
    private String tal007;//配偶手机号码
    private String tal008;//配偶工作单位
    private Double tac011;//家庭月均收入（元）
    private String caa138;//法律（诉讼）文书送达地址
    private String tac017;//统一社会信用代码/营业执照号码
    private String tac016;//个体工商户名称
    private String tac018;//经营项目
    private String tac019;//经营地电话
    private String tac013;//经营地址
    private String tac010;//是否小微企业
    private String tac121;//营业执照注册时间
    private String tac117;//税务登记号
    private Integer tac028;//员工人数（不含申请人）
    private Integer tac012;//本年新招人数（不含申请人）
    private String aaa027;//贷款申请区
    private String aab301;//贷款申请街道/乡镇
    private String caa127;//贷款（授信）期限
    private Double tac089;//创业担保贷款金额
    private Double tac090;//组合商业贷款金额
    private Double tac003;//申请贷款总金额
    private String tac079;//意向银行
    private String tac004;//贷款用途

    private String aab022;//所属行业
    private String aab091;//是否小微企业
    private String cca027;//微型企业类型
    private String aab013;//法定代表人姓名
    private String bae182;//法定代表人手机号
    private String aab014;//法人身份证号
    private String tak004;//法定代表人婚姻状况
    private String tak005;//法定代表人居住地址
    private String aae805;//基本户开户行
    private String aae009;//基本户户名
    private String aae010;//基本户账号
    private String tac118;//年销售总额（元）
    private String tac119;//资产总额（元）
    private String tac120;//银行负债额
    private String tac125;//贷款方式
    private String caa129;//两无人员类别




    //担保人列表
    private List<LoanJm65ApiDto> jm65ApiDtos;
    //抵质押列表
    private List<LoanJm66ApiDto> jm66ApiDtos;
    //股东列表
    private List<StockholderApiDto> stockholderApiDtos;
    //员工列表
    private List<LoanEmployeesApiDto> loanEmployeesApiDtos;

    private String cce099;//数据状态
    private String cce099des;


    private String tab002;
    private String handlingno;
    private String tdi001;
    private String tdi001des;
    private Date aae036;
    private String tab020;
    private String tab020des;
    private Long tac001;
    private String cca080des;
    private String caa131des;
    private String caa130des;
    private String caa132des;
    private String caa133des;
    private String caa137des;
    private String caa126des;
    private String tac010des;
    private String aaa027des;
    private String aab301des;
    private String tac079des;
    private String aab022des;
    private String aab091des;
    private String cca027des;
    private String tak004des;
    private String tac125des;//贷款方式
    private String caa129des;//两无人员类别


    private Long tab001;
    private Long tad001;
    private String signature;
    private Date caa139;
    private String tac077des;
    private String tac076des;
    private Date tac072;
    private String tac078;
    private Double tac030;
    private Double tac097;
    private Double tac098;
    private Date tac075;
    private Long dbrdzycount;

    private Long jm118id;
    private String xwdbankname;
    private String jyjbankid;
    private String jyjbankname;


    public List<LoanJm66ApiDto> getJm66ApiDtos() {
        return jm66ApiDtos;
    }
    public void setJm66ApiDtos(List<LoanJm66ApiDto> jm66ApiDtos) {
        this.jm66ApiDtos = jm66ApiDtos;
    }
    public List<LoanJm65ApiDto> getJm65ApiDtos() {
        return jm65ApiDtos;
    }
    public void setJm65ApiDtos(List<LoanJm65ApiDto> jm65ApiDtos) {
        this.jm65ApiDtos = jm65ApiDtos;
    }
    public String getTac002() {
        return tac002;
    }
    public String getTac017() {
        return tac017;
    }
    public void setTac002(String tac002) {
        this.tac002 = tac002;
    }
    public void setTac017(String tac017) {
        this.tac017 = tac017;
    }
    public String getAac002() {
        return aac002;
    }
    public String getAac003() {
        return aac003;
    }
    public String getCca080() {
        return cca080;
    }
    public String getCaa135() {
        return caa135;
    }
    public String getCaa136() {
        return caa136;
    }
    public String getCaa131() {
        return caa131;
    }
    public String getCaa130() {
        return caa130;
    }
    public String getCaa132() {
        return caa132;
    }
    public String getCaa133() {
        return caa133;
    }
    public String getCaa137() {
        return caa137;
    }
    public String getCaa126() {
        return caa126;
    }
    public String getTal003() {
        return tal003;
    }
    public String getTal002() {
        return tal002;
    }
    public String getTal007() {
        return tal007;
    }
    public String getTal008() {
        return tal008;
    }
    public Double getTac011() {
        return tac011;
    }
    public String getCaa138() {
        return caa138;
    }
    public String getTac016() {
        return tac016;
    }
    public String getTac018() {
        return tac018;
    }
    public String getTac019() {
        return tac019;
    }
    public String getTac013() {
        return tac013;
    }
    public String getTac010() {
        return tac010;
    }
    public String getTac121() {
        return tac121;
    }
    public String getTac117() {
        return tac117;
    }
    public Integer getTac028() {
        return tac028;
    }
    public Integer getTac012() {
        return tac012;
    }
    public String getAaa027() {
        return aaa027;
    }
    public String getAab301() {
        return aab301;
    }
    public Double getTac089() {
        return tac089;
    }
    public Double getTac090() {
        return tac090;
    }
    public Double getTac003() {
        return tac003;
    }
    public String getTac079() {
        return tac079;
    }
    public String getTac004() {
        return tac004;
    }
    public void setAac002(String aac002) {
        this.aac002 = aac002;
    }
    public void setAac003(String aac003) {
        this.aac003 = aac003;
    }
    public void setCca080(String cca080) {
        this.cca080 = cca080;
    }
    public void setCaa135(String caa135) {
        this.caa135 = caa135;
    }
    public void setCaa136(String caa136) {
        this.caa136 = caa136;
    }
    public void setCaa131(String caa131) {
        this.caa131 = caa131;
    }
    public void setCaa130(String caa130) {
        this.caa130 = caa130;
    }
    public void setCaa132(String caa132) {
        this.caa132 = caa132;
    }
    public void setCaa133(String caa133) {
        this.caa133 = caa133;
    }
    public void setCaa137(String caa137) {
        this.caa137 = caa137;
    }
    public void setCaa126(String caa126) {
        this.caa126 = caa126;
    }
    public void setTal003(String tal003) {
        this.tal003 = tal003;
    }
    public void setTal002(String tal002) {
        this.tal002 = tal002;
    }
    public void setTal007(String tal007) {
        this.tal007 = tal007;
    }
    public void setTal008(String tal008) {
        this.tal008 = tal008;
    }
    public void setTac011(Double tac011) {
        this.tac011 = tac011;
    }
    public void setCaa138(String caa138) {
        this.caa138 = caa138;
    }
    public void setTac016(String tac016) {
        this.tac016 = tac016;
    }
    public void setTac018(String tac018) {
        this.tac018 = tac018;
    }
    public void setTac019(String tac019) {
        this.tac019 = tac019;
    }
    public void setTac013(String tac013) {
        this.tac013 = tac013;
    }
    public void setTac010(String tac010) {
        this.tac010 = tac010;
    }
    public void setTac121(String tac121) {
        this.tac121 = tac121;
    }
    public void setTac117(String tac117) {
        this.tac117 = tac117;
    }
    public void setTac028(Integer tac028) {
        this.tac028 = tac028;
    }
    public void setTac012(Integer tac012) {
        this.tac012 = tac012;
    }
    public void setAaa027(String aaa027) {
        this.aaa027 = aaa027;
    }
    public void setAab301(String aab301) {
        this.aab301 = aab301;
    }
    public void setTac089(Double tac089) {
        this.tac089 = tac089;
    }
    public void setTac090(Double tac090) {
        this.tac090 = tac090;
    }
    public void setTac003(Double tac003) {
        this.tac003 = tac003;
    }
    public void setTac079(String tac079) {
        this.tac079 = tac079;
    }
    public void setTac004(String tac004) {
        this.tac004 = tac004;
    }
    public String getCaa127() {
        return caa127;
    }
    public void setCaa127(String caa127) {
        this.caa127 = caa127;
    }
    public CommApiDTO getCommApiDTO() {
        return commApiDTO;
    }
    public void setCommApiDTO(CommApiDTO commApiDTO) {
        this.commApiDTO = commApiDTO;
    }
    public String getCce099() {
        return cce099;
    }
    public void setCce099(String cce099) {
        this.cce099 = cce099;
    }
    public String getTab002() {
        return tab002;
    }
    public void setTab002(String tab002) {
        this.tab002 = tab002;
    }
    public String getCce099des() {
        return cce099des;
    }
    public String getHandlingno() {
        return handlingno;
    }
    public String getTdi001() {
        return tdi001;
    }
    public String getTdi001des() {
        return tdi001des;
    }
    public Date getAae036() {
        return aae036;
    }
    public String getTab020() {
        return tab020;
    }
    public String getTab020des() {
        return tab020des;
    }
    public void setCce099des(String cce099des) {
        this.cce099des = cce099des;
    }
    public void setHandlingno(String handlingno) {
        this.handlingno = handlingno;
    }
    public void setTdi001(String tdi001) {
        this.tdi001 = tdi001;
    }
    public void setTdi001des(String tdi001des) {
        this.tdi001des = tdi001des;
    }
    public void setAae036(Date aae036) {
        this.aae036 = aae036;
    }
    public void setTab020(String tab020) {
        this.tab020 = tab020;
    }
    public void setTab020des(String tab020des) {
        this.tab020des = tab020des;
    }
    public Long getTac001() {
        return tac001;
    }
    public String getCca080des() {
        return cca080des;
    }
    public String getCaa131des() {
        return caa131des;
    }
    public String getCaa130des() {
        return caa130des;
    }
    public String getCaa132des() {
        return caa132des;
    }
    public String getCaa133des() {
        return caa133des;
    }
    public String getCaa137des() {
        return caa137des;
    }
    public String getCaa126des() {
        return caa126des;
    }
    public String getTac010des() {
        return tac010des;
    }
    public String getAaa027des() {
        return aaa027des;
    }
    public String getAab301des() {
        return aab301des;
    }
    public String getTac079des() {
        return tac079des;
    }
    public void setTac001(Long tac001) {
        this.tac001 = tac001;
    }
    public void setCca080des(String cca080des) {
        this.cca080des = cca080des;
    }
    public void setCaa131des(String caa131des) {
        this.caa131des = caa131des;
    }
    public void setCaa130des(String caa130des) {
        this.caa130des = caa130des;
    }
    public void setCaa132des(String caa132des) {
        this.caa132des = caa132des;
    }
    public void setCaa133des(String caa133des) {
        this.caa133des = caa133des;
    }
    public void setCaa137des(String caa137des) {
        this.caa137des = caa137des;
    }
    public void setCaa126des(String caa126des) {
        this.caa126des = caa126des;
    }
    public void setTac010des(String tac010des) {
        this.tac010des = tac010des;
    }
    public void setAaa027des(String aaa027des) {
        this.aaa027des = aaa027des;
    }
    public void setAab301des(String aab301des) {
        this.aab301des = aab301des;
    }
    public void setTac079des(String tac079des) {
        this.tac079des = tac079des;
    }
    public Long getTab001() {
        return tab001;
    }
    public Long getTad001() {
        return tad001;
    }
    public void setTab001(Long tab001) {
        this.tab001 = tab001;
    }
    public void setTad001(Long tad001) {
        this.tad001 = tad001;
    }
    public String getSignature() {
        return signature;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    public String getAab003() {
        return aab003;
    }
    public String getAab004() {
        return aab004;
    }
    public void setAab003(String aab003) {
        this.aab003 = aab003;
    }
    public void setAab004(String aab004) {
        this.aab004 = aab004;
    }
    public List<StockholderApiDto> getStockholderApiDtos() {
        return stockholderApiDtos;
    }
    public List<LoanEmployeesApiDto> getLoanEmployeesApiDtos() {
        return loanEmployeesApiDtos;
    }
    public void setStockholderApiDtos(List<StockholderApiDto> stockholderApiDtos) {
        this.stockholderApiDtos = stockholderApiDtos;
    }
    public void setLoanEmployeesApiDtos(List<LoanEmployeesApiDto> loanEmployeesApiDtos) {
        this.loanEmployeesApiDtos = loanEmployeesApiDtos;
    }
    public Long getAab001() {
        return aab001;
    }
    public void setAab001(Long aab001) {
        this.aab001 = aab001;
    }
    public String getAab022() {
        return aab022;
    }
    public String getAab091() {
        return aab091;
    }
    public void setAab022(String aab022) {
        this.aab022 = aab022;
    }
    public void setAab091(String aab091) {
        this.aab091 = aab091;
    }
    public String getCca027() {
        return cca027;
    }
    public String getAab013() {
        return aab013;
    }
    public String getBae182() {
        return bae182;
    }
    public String getAab014() {
        return aab014;
    }
    public String getTak004() {
        return tak004;
    }
    public String getTak005() {
        return tak005;
    }
    public String getAae805() {
        return aae805;
    }
    public String getAae009() {
        return aae009;
    }
    public String getAae010() {
        return aae010;
    }
    public String getTac118() {
        return tac118;
    }
    public String getTac119() {
        return tac119;
    }
    public String getTac120() {
        return tac120;
    }
    public void setCca027(String cca027) {
        this.cca027 = cca027;
    }
    public void setAab013(String aab013) {
        this.aab013 = aab013;
    }
    public void setBae182(String bae182) {
        this.bae182 = bae182;
    }
    public void setAab014(String aab014) {
        this.aab014 = aab014;
    }
    public void setTak004(String tak004) {
        this.tak004 = tak004;
    }
    public void setTak005(String tak005) {
        this.tak005 = tak005;
    }
    public void setAae805(String aae805) {
        this.aae805 = aae805;
    }
    public void setAae009(String aae009) {
        this.aae009 = aae009;
    }
    public void setAae010(String aae010) {
        this.aae010 = aae010;
    }
    public void setTac118(String tac118) {
        this.tac118 = tac118;
    }
    public void setTac119(String tac119) {
        this.tac119 = tac119;
    }
    public void setTac120(String tac120) {
        this.tac120 = tac120;
    }
    public String getTak002() {
        return tak002;
    }
    public void setTak002(String tak002) {
        this.tak002 = tak002;
    }
    public String getAab022des() {
        return aab022des;
    }
    public void setAab022des(String aab022des) {
        this.aab022des = aab022des;
    }
    public String getAab091des() {
        return aab091des;
    }
    public void setAab091des(String aab091des) {
        this.aab091des = aab091des;
    }
    public String getCca027des() {
        return cca027des;
    }
    public void setCca027des(String cca027des) {
        this.cca027des = cca027des;
    }
    public String getTak004des() {
        return tak004des;
    }
    public void setTak004des(String tak004des) {
        this.tak004des = tak004des;
    }
    public Date getCaa139() {
        return caa139;
    }
    public void setCaa139(Date caa139) {
        this.caa139 = caa139;
    }
    public String getTac077des() {
        return tac077des;
    }
    public void setTac077des(String tac077des) {
        this.tac077des = tac077des;
    }
    public String getTac076des() {
        return tac076des;
    }
    public void setTac076des(String tac076des) {
        this.tac076des = tac076des;
    }
    public Date getTac072() {
        return tac072;
    }
    public void setTac072(Date tac072) {
        this.tac072 = tac072;
    }
    public String getTac078() {
        return tac078;
    }
    public void setTac078(String tac078) {
        this.tac078 = tac078;
    }
    public Double getTac030() {
        return tac030;
    }
    public void setTac030(Double tac030) {
        this.tac030 = tac030;
    }
    public Double getTac097() {
        return tac097;
    }
    public void setTac097(Double tac097) {
        this.tac097 = tac097;
    }
    public Double getTac098() {
        return tac098;
    }
    public void setTac098(Double tac098) {
        this.tac098 = tac098;
    }
    public Date getTac075() {
        return tac075;
    }
    public void setTac075(Date tac075) {
        this.tac075 = tac075;
    }
    public String getTac125() {
        return tac125;
    }
    public void setTac125(String tac125) {
        this.tac125 = tac125;
    }
    public String getCaa129() {
        return caa129;
    }
    public void setCaa129(String caa129) {
        this.caa129 = caa129;
    }
    public String getTac125des() {
        return tac125des;
    }
    public void setTac125des(String tac125des) {
        this.tac125des = tac125des;
    }
    public String getCaa129des() {
        return caa129des;
    }
    public void setCaa129des(String caa129des) {
        this.caa129des = caa129des;
    }
    public String getXwdbankname() {
        return xwdbankname;
    }
    public void setXwdbankname(String xwdbankname) {
        this.xwdbankname = xwdbankname;
    }
    public String getJyjbankid() {
        return jyjbankid;
    }
    public void setJyjbankid(String jyjbankid) {
        this.jyjbankid = jyjbankid;
    }
    public String getJyjbankname() {
        return jyjbankname;
    }
    public void setJyjbankname(String jyjbankname) {
        this.jyjbankname = jyjbankname;
    }
    public Long getDbrdzycount() {
        return dbrdzycount;
    }
    public void setDbrdzycount(Long dbrdzycount) {
        this.dbrdzycount = dbrdzycount;
    }
    public Long getJm118id() {
        return jm118id;
    }
    public void setJm118id(Long jm118id) {
        this.jm118id = jm118id;
    }





}
