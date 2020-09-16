package com.wander.cmis.bean;

import java.math.BigDecimal;

//推送放款信息，查询贷款申请列表或者担保公司审核完毕（放款前）
public class XwdbReviewDTO {

    private Long tac001;//贷款编号
    private Integer tac093;//审核日期
    private String tac095;//审核状态    旧小微担保审核状态 新小微担保审核状态
    private String tac096;//审核意见    初审审核意见 AUDITADVICE 小微担审核意见 XWDAUDITADVICE 中间表（申请信息）
    private String tac030a;//贷款发放类型 LOANTYPE 中间表（申请信息表） 01.个人创业担保贷款;02.企业创业担保贷款;03.个人微型企业创业扶持贷款;04.企业微型企业创业扶持贷款05.个人微利组合贷款;06.企业组合A(低组合) ;07.企业组合B(高组合);08.合伙经营
    private Integer tac074;//发放日期   LOANDATE 中间表（放款信息）
    private String tac083;//发放状态    LOANTAG 中间表（申请信息） 默认no  yes已放款
    private BigDecimal tac097;//发放金额    CREATEBUSIAMOUNT 中间表（申请信息）
    private BigDecimal tac014;//贷款利率    LOANRATE 中间表（放款信息）

    public XwdbReviewDTO(Long tac001, Integer tac093, String tac095, String tac096, String tac030a, Integer tac074, String tac083, BigDecimal tac097, BigDecimal tac014) {
        this.tac001 = tac001;
        this.tac093 = tac093;
        this.tac095 = tac095;
        this.tac096 = tac096;
        this.tac030a = tac030a;
        this.tac074 = tac074;
        this.tac083 = tac083;
        this.tac097 = tac097;
        this.tac014 = tac014;
    }

    public XwdbReviewDTO() {
    }

    public Long getTac001() {
        return tac001;
    }

    public void setTac001(Long tac001) {
        this.tac001 = tac001;
    }

    public Integer getTac093() {
        return tac093;
    }

    public void setTac093(Integer tac093) {
        this.tac093 = tac093;
    }

    public String getTac095() {
        return tac095;
    }

    public void setTac095(String tac095) {
        this.tac095 = tac095;
    }

    public String getTac096() {
        return tac096;
    }

    public void setTac096(String tac096) {
        this.tac096 = tac096;
    }

    public String getTac030a() {
        return tac030a;
    }

    public void setTac030a(String tac030a) {
        this.tac030a = tac030a;
    }

    public Integer getTac074() {
        return tac074;
    }

    public void setTac074(Integer tac074) {
        this.tac074 = tac074;
    }

    public String getTac083() {
        return tac083;
    }

    public void setTac083(String tac083) {
        this.tac083 = tac083;
    }

    public BigDecimal getTac097() {
        return tac097;
    }

    public void setTac097(BigDecimal tac097) {
        this.tac097 = tac097;
    }

    public BigDecimal getTac014() {
        return tac014;
    }

    public void setTac014(BigDecimal tac014) {
        this.tac014 = tac014;
    }

    @Override
    public String toString() {
        return "XwdbReviewDTO{" +
                "tac001=" + tac001 +
                ", tac093=" + tac093 +
                ", tac095='" + tac095 + '\'' +
                ", tac096='" + tac096 + '\'' +
                ", tac030a='" + tac030a + '\'' +
                ", tac074=" + tac074 +
                ", tac083='" + tac083 + '\'' +
                ", tac097=" + tac097 +
                ", tac014=" + tac014 +
                '}';
    }
}
