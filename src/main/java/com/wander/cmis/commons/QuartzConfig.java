package com.wander.cmis.commons;

import com.wander.cmis.service.LoanApplicationService;
import com.wander.cmis.service.LoanAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class QuartzConfig implements SchedulingConfigurer {

    @Value("${loanApplicationCorn}")
    private String loanApplicationCorn;

    @Value("${loanAuditCorn}")
    private String loanAuditCorn;

    @Autowired
    private LoanApplicationService loanApplicationService;

    @Autowired
    private LoanAuditService loanAuditService;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(
                () -> loanApplicationService.convert(),
                triggerContext -> new CronTrigger(loanApplicationCorn).nextExecutionTime(triggerContext)
        );
        scheduledTaskRegistrar.addTriggerTask(
                () -> loanAuditService.doAudit(),
                triggerContext -> new CronTrigger(loanAuditCorn).nextExecutionTime(triggerContext)
        );
    }
}
