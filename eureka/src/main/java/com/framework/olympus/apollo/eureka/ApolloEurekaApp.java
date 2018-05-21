package com.framework.olympus.apollo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-21 10:40
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApolloEurekaApp {

    /*
     * start up erueka server
     * */
    public static void main(String[] args) {

        SpringApplication.run(ApolloEurekaApp.class, args);
    }
}
