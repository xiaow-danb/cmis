package com.wander.cmis.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "ERROR_LOG")
public class ErrorLog {

    @Id
    @Column(name = "id")
    private String id;

    //就业局接口名称
    private String jyjInterface;

    //传参数据
    private String sendData;

    //返回数据
    private String resultData;
}
