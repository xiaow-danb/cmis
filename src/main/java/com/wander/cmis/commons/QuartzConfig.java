package com.wander.cmis.commons;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class QuartzConfig {

    private static SerializeConfig serconfig = new SerializeConfig();

    private static String dateFormat = "yyyy-MM-dd HH:mm:ss";

    static {
        serconfig.put(Date.class, new SimpleDateFormatSerializer(dateFormat));
    }

//    @Scheduled(cron = "0/5 * * * * ?")
    public void queryPayStatus() {
        System.out.println("每五秒执行一次。");
        //个人申请推送
    }
}
