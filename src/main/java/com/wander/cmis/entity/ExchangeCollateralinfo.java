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
@Table(name = "EXCHANGE_COLLATERALINFO")
public class ExchangeCollateralinfo {
    @Id
    @Column(name = "ID")
    private String id;

    private String loanapplyid;

    private String assetownertype;

    private String owner;

    private String assettype;

    private String mortgagename;

    private String mortgageaddr;

    private String mortgagearea;

    private String warrant;

    private BigDecimal assessvalue;

    private String landproperty;

    private String remark;

    private String buydate;

    private String collateralarea;

    private String county;

    private String street;

    private String mortageowneridcard;

    private String qsrzjbm;

    private String telephone;

    private String unitTel;

    private String homeAddr;

    private BigDecimal buyValue;

    private String dafjId;

    private String dbrqzqk;

    private String dywqy;

    private String ssxzjd;

}