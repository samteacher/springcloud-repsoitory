package com.sam.eurekaorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class EurekaOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaOrderApplication.class, args);
    }

    /**
     * Ribbon 负载均衡
     * @return
     */
    @Bean               //注册到Bean容器中
    @LoadBalanced       //支持负载均衡
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }

}
