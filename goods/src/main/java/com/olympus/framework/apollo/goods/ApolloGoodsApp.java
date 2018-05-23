package com.olympus.framework.apollo.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-23 14:09
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement
@MapperScan("com.olympus.framework.apollo.goods.dao")
public class ApolloGoodsApp {

    public static void main(String[] args) {
        SpringApplication.run(ApolloGoodsApp.class, args);
    }
}
