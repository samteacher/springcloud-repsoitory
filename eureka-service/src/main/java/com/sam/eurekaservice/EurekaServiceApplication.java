package com.sam.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication {

    /**
     * 服务中心
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }

}
