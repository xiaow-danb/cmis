package com.wander.cmis.bean;

import java.math.BigDecimal;

//担保人
public class LoanJm65ApiDto {

    private String tab002;//证件号码
    private String tab003;//姓名
    private String tab016;//手机号码
    private String tab005;//家庭住址
    private String tab007;//担保人类型
    private String tab008;//工作单位
    private String tab015;//单位电话
    private BigDecimal tab009;//年收入（元）
    private BigDecimal tab011;//逾期偿还金额（元）
    private BigDecimal tab013;//现有负债(元)
    private BigDecimal tab012;//供养人口
    private String tab014;//职务
    private BigDecimal tab018;//担保额度(元)
    private String recordid;//档案附件ID
    private String tab020;//担保人签字情况

    public LoanJm65ApiDto() {
        super();
        // TODO Auto-generated constructor stub
    }

    public LoanJm65ApiDto(String tab002, String tab003, String tab016, String tab005, String tab007, String tab008,
                          String tab015, BigDecimal tab009, BigDecimal tab011, BigDecimal tab013, BigDecimal tab012, String tab014,
                          BigDecimal tab018, String recordid, String tab020) {
        super();
        this.tab002 = tab002;
        this.tab003 = tab003;
        this.tab016 = tab016;
        this.tab005 = tab005;
        this.tab007 = tab007;
        this.tab008 = tab008;
        this.tab015 = tab015;
        this.tab009 = tab009;
        this.tab011 = tab011;
        this.tab013 = tab013;
        this.tab012 = tab012;
        this.tab014 = tab014;
        this.tab018 = tab018;
        this.recordid = recordid;
        this.tab020 = tab020;
    }

    public String getTab002() {
        return tab002;
    }

    public void setTab002(String tab002) {
        this.tab002 = tab002;
    }

    public String getTab003() {
        return tab003;
    }

    public void setTab003(String tab003) {
        this.tab003 = tab003;
    }

    public String getTab016() {
        return tab016;
    }

    public void setTab016(String tab016) {
        this.tab016 = tab016;
    }

    public String getTab005() {
        return tab005;
    }

    public void setTab005(String tab005) {
        this.tab005 = tab005;
    }

    public String getTab007() {
        return tab007;
    }

    public void setTab007(String tab007) {
        this.tab007 = tab007;
    }

    public String getTab008() {
        return tab008;
    }

    public void setTab008(String tab008) {
        this.tab008 = tab008;
    }

    public String getTab015() {
        return tab015;
    }

    public void setTab015(String tab015) {
        this.tab015 = tab015;
    }

    public BigDecimal getTab009() {
        return tab009;
    }

    public void setTab009(BigDecimal tab009) {
        this.tab009 = tab009;
    }

    public BigDecimal getTab011() {
        return tab011;
    }

    public void setTab011(BigDecimal tab011) {
        this.tab011 = tab011;
    }

    public BigDecimal getTab013() {
        return tab013;
    }

    public void setTab013(BigDecimal tab013) {
        this.tab013 = tab013;
    }

    public BigDecimal getTab012() {
        return tab012;
    }

    public void setTab012(BigDecimal tab012) {
        this.tab012 = tab012;
    }

    public String getTab014() {
        return tab014;
    }

    public void setTab014(String tab014) {
        this.tab014 = tab014;
    }

    public BigDecimal getTab018() {
        return tab018;
    }

    public void setTab018(BigDecimal tab018) {
        this.tab018 = tab018;
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid;
    }

    public String getTab020() {
        return tab020;
    }

    public void setTab020(String tab020) {
        this.tab020 = tab020;
    }

    @Override
    public String toString() {
        return "LoanJm65ApiDto [tab002=" + tab002 + ", tab003=" + tab003 + ", tab016=" + tab016 + ", tab005=" + tab005
                + ", tab007=" + tab007 + ", tab008=" + tab008 + ", tab015=" + tab015 + ", tab009=" + tab009
                + ", tab011=" + tab011 + ", tab013=" + tab013 + ", tab012=" + tab012 + ", tab014=" + tab014
                + ", tab018=" + tab018 + ", recordid=" + recordid + ", tab020=" + tab020 + "]";
    }


}
