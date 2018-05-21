package com.olympus.framework.apollo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-21 22:02
 **/
@RestController
@RequestMapping("/hi")
public class WelcomeController {

    @Autowired
    private RestTemplate rest;

    @GetMapping
    public String hi() {

        String str = rest.getForObject("http://ORDER-SERVICE/goods", String.class);
        System.out.println(str);
        return "hi, yqzhang";
    }

}
