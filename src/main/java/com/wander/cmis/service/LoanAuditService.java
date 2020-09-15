package com.wander.cmis.service;

public interface LoanAuditService {

    /**
     * 担保公司审核完毕（放款前） 接口编号2.4.9.5(贷款审核)
     */
    void doAudit();
}
