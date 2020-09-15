package com.wander.cmis.service;

public interface TransferPersonalService {
    /**
     * 个人企业贷款申请
     * @param type
     */
    void doTransfer(String type);

    /**
     * 调用就业局提供的 个人（合伙）贷款担保公司数据查询接口 新增到中间表
     */
    void doSyncPersonalAndInsert();

    /**
     * 调用就业局提供的2.4.9.2 企业贷款担保公司数据查询接口 新增到中间表
     */
    void doSyncCompanyAndInsert();
}
