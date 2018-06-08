package com.sui.op.mall.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OpSysIntegrationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpSysIntegrationServiceApplication.class, args);
    }
}
