package com.easygo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * description:描述
 * author:mutong(david)
 * time:21:19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AdminWebApp {
    public static void main(String[] args) {
        System.out.println("运营商管理WEB,9002...");
        SpringApplication.run(AdminWebApp.class,args);
    }
}
