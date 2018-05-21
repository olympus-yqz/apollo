package com.olympus.framework.apollo.web.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-21 22:44
 **/
@Configuration
public class WebConfig {

    @Bean
    /*
     * 负载均衡标签
     * */
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
