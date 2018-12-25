package com.sam.servicezuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy  //开启网关
@SpringBootApplication
@EnableEurekaClient
public class ServiceZuulApplication {

    /**
     * 网关Zuul
     * @param args
     */
    public static void main(String[] args) {
        //SpringApplication.run(ServiceZuulApplication.class, args);
        new SpringApplicationBuilder(ServiceZuulApplication.class).web(true).run(args);
    }
}