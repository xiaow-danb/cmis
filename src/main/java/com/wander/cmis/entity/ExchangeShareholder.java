package com.wander.cmis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EXCHANGE_SHAREHOLDER")
public class ExchangeShareholder {

    @Id
    @Column(name = "ID")
    private String id;

    private String loanapplyid;

    private String name;

    private String idno;

    private BigDecimal shareamt;

    private String mobile;

    private BigDecimal gdbh;

    private BigDecimal unitNo;

    private String qdczbs;

    private String qdczbsms;

}