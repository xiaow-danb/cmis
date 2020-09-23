package com.wander.cmis.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "EXCHANGE_COUNTY")
public class ExchangeCounty {

    @Id
    @Column(name = "ID")
    private String id;

    private String jyjcountyid;
}
