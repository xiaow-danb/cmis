package com.wander.cmis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

//放款信息（中间表）
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EXCHANGE_PROJECTLOAN")
public class ExchangeProjectLoan {

    @Id
    @Column(name = "ID")
    private String id;

    private String loanapplyid;

    private String jyid;

    private BigDecimal feerate;

    private BigDecimal guaranteefee;

    private BigDecimal loanrate;

    private String loandate;

    private String loanorganizationnm;

    private Short readtag1;

    private BigDecimal loanamount;

    private String isdiscount;

    private Date createtime;

    private String loanType;

    private String grantStatus;

}