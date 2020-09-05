package com.wander.cmis;

import com.wander.cmis.dao.UserInfoMapper;
import com.wander.cmis.entity.UserInfo;
import com.wander.cmis.service.UserInfoService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CmisApplicationTests {

    @Reference
    private UserInfoService userInfoService;

    @Test
    void contextLoads() {
        String aa = "CRMENTERPRISE";
        System.out.println(aa.toLowerCase());
        String name = userInfoService.getUserInfoById("74de519d-ed3e-4030-9b01-f7cea3371890");
        System.out.println(name);
    }

}
