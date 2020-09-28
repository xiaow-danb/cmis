package com.wander.cmis.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "EXCHANGE_BANK")
public class ExchangeBank {

    @Id
    @Column(name = "ID")
    private String id;

    private String jyjbankid;

    private String jyjindustry;
}
