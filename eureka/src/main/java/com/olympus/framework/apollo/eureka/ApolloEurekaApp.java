package com.olympus.framework.apollo.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

    private static final Logger logger = LoggerFactory.getLogger(ApolloEurekaApp.class);

    /*
     * start up erueka server
     * */
    public static void main(String[] args) {

        SpringApplication.run(ApolloEurekaApp.class, args);
    }
}
