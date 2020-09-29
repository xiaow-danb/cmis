package com.wander.cmis.commons;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.service.LoanApplicationService;
import com.wander.cmis.service.LoanAuditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Component
public class QuartzConfig {

    Logger logger = LoggerFactory.getLogger(QuartzConfig.class);

    @Autowired
    private LoanApplicationService loanApplicationService;

    @Autowired
    private LoanAuditService loanAuditService;


    @Scheduled(cron = "0 0/3 * * * ?")
    public void syncAudit() {
        loanAuditService.doAudit();
    }

    @Scheduled(cron = "0 0/7 * * * ?")
    public void queryPayStatus() {
        loanApplicationService.convert();
    }
}
