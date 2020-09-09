package com.wander.cmis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.wander.cmis.commons.InitAndRun;
import com.wander.cmis.service.UserInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class CmisApplicationTests {

    @Resource
    private UserInfoService userInfoService;

    @Test
    void contextLoads() {
        String aa = "CRMENTERPRISE";
        System.out.println(aa.toLowerCase());
        String name = userInfoService.getUserInfoById("74de519d-ed3e-4030-9b01-f7cea3371890");
        System.out.println(name);
    }

}
