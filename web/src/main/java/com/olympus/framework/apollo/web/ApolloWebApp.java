package com.olympus.framework.apollo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-21 21:52
 **/
@SpringBootApplication
@EnableEurekaClient
public class ApolloWebApp {

    public static void main(String[] args) {
        SpringApplication.run(ApolloWebApp.class, args);
    }
}
