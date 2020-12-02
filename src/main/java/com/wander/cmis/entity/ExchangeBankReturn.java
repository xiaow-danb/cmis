package com.wander.cmis.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "EXCHANGE_BANKRETURN")
public class ExchangeBankReturn {

    @Id
    @Column(name = "ID")
    private String id;
    //申请id
    private String loanapplyid;
    //退回时间
    private String returntime;
    //退回原因
    private String returncaust;
    //小微担保读取状态0未读
    private String xwdreadflag;
    //小微处理结果
    private String xwdprocessresult;
    //小微处理时间
    private String xwdprocesstime;

}
