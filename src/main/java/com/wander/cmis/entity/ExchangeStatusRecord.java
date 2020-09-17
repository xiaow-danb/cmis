package com.wander.cmis.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "EXCHANGE_STATUS_RECORD")
public class ExchangeStatusRecord {
    @Id
    @Column(name = "ID")
    private String id;
}
