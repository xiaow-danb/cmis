package com.wander.cmis;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.wander.cmis.init.FirstInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.wander.cmis.*"})
@EnableScheduling
@MapperScan(basePackages = "com.wander.cmis.mapper")
//@EnableDubboConfiguration
@EnableConfigurationProperties
public class CmisApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CmisApplication.class);
        application.addInitializers(new FirstInitializer());
        SpringApplication.run(CmisApplication.class, args);
    }

}
