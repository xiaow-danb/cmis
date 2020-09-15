package com.wander.cmis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

//抵押信息
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EXCHANGE_GUARANTORINFO")
public class ExchangeGuarantorinfo {

    @Id
    @Column(name = "ID")
    private String id;

    private String loanapplyid;

    private String guarantor;

    private String idno;

    private String workunittype;

    private String guarantorworkunit;

    private String duty;

    private String guarantorunitphone;

    private BigDecimal deposit;

    private BigDecimal monthlyincome;

    private String contactway;

    private String address;

    private String guarantortype;

    private BigDecimal yqchje;

    private BigDecimal xyfz;

    private BigDecimal gyrk;

    private String dafjId;

    private String dbrqzqk;

}