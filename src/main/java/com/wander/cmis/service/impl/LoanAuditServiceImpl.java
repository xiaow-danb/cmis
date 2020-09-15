package com.wander.cmis.service.impl;

import com.wander.cmis.mapper.ExchangeStatusRecordMapper;
import com.wander.cmis.service.LoanAuditService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoanAuditServiceImpl implements LoanAuditService {

    @Resource
    private ExchangeStatusRecordMapper exchangeStatusRecordMapper;

    @Override
    public void doAudit() {

    }
}
