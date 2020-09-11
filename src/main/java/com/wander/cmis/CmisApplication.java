package com.wander.cmis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.wander.cmis.*"})
@EnableScheduling
@MapperScan(basePackages = "com.wander.cmis.mapper")
public class CmisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmisApplication.class, args);
    }

}
