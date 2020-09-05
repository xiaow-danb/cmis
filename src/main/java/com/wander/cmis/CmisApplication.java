package com.wander.cmis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class CmisApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmisApplication.class, args);
    }

}
