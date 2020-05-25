package com.easygo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description:描述
 * author:mutong(david)
 * time:0:06
 */
@SpringBootApplication
@EnableEurekaClient
public class BrandServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(BrandServiceApp.class,args);
    }
}
