package com.wander.cmis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

//企业员工信息
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EXCHANGE_EMPLOYEE")
public class ExchangeEmployee {
    @Id
    @Column(name = "ID")
    private String id;

    private String loanapplyid;

    private String name;

    private String idno;

    private BigDecimal jydjbh;

    private BigDecimal employeeNo;

    private String sex;

    private String sexDesc;

    private String hkxz;

    private String whcd;

    private String whcdms;

    private String rylb1;

    private String rtlb1ms;

    private String rylb2;

    private String rylb2ms;

    private String rylb3;

    private String rylb3ms;

    private String dkrylb;

    private String dkrylbms;

}