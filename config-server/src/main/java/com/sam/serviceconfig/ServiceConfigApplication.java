package com.sam.serviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfigApplication {

    /**
     * 分布式配置文件中心
     */
    public static void main(String[] args) {
        SpringApplication.run(ServiceConfigApplication.class, args);
    }
}
