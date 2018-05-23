package com.olympus.framework.apollo.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-23 17:46
 **/
@Configuration
public class OrderConfig {

    @Bean
    /*
     * RestTemplate 负载均衡注解
     * */
    @LoadBalanced
    public RestTemplate configRestTemplate() {

        return new RestTemplate();
    }
}
