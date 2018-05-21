package com.olympus.framework.apollo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-21 21:31
 **/
@SpringBootApplication
@EnableEurekaClient
public class ApolloOrderApp {

    public static void main(String[] args) {
        SpringApplication.run(ApolloOrderApp.class, args);
    }
}
