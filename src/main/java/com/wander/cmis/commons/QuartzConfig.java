package com.wander.cmis.commons;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class QuartzConfig {

    @Scheduled(cron = "0/5 * * * * ?")
    public void queryPayStatus() {
        System.out.println("每五秒执行一次。");
    }
}
