package com.sam.eurekamemuber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaMemuberApplication {

    /**
     * 提供者
     * @return
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaMemuberApplication.class, args);
    }
}
