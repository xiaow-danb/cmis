package com.wander.cmis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.wander.cmis.dao"})
public class CmisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmisApplication.class, args);
    }

}
