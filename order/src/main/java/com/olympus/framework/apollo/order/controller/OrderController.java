package com.olympus.framework.apollo.order.controller;

import com.olympus.framework.apollo.order.entity.GoodsEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-21 21:35
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private RestTemplate rest;
    /*
     * LoadBalancerClient用法
     * */
//    @Autowired
//    private LoadBalancerClient balancerClient;

    @GetMapping
    public List<GoodsEntity> list() {

        List<GoodsEntity> list = new LinkedList<>();

        list.add(new GoodsEntity("100001", "房子", BigDecimal.valueOf(2000000)));
        list.add(new GoodsEntity("100002", "卡迪拉克", BigDecimal.valueOf(300000)));
        list.add(new GoodsEntity("100003", "格拉苏蒂", BigDecimal.valueOf(40000)));

        System.out.println(System.currentTimeMillis());

        return list;
    }

    @GetMapping("/msg")
    public String msg() {
        /*
         * LoadBalancerClient用法
         * */
//        ServiceInstance instance = balancerClient.choose("GOODS-SERVICE");
//
//        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/goods/msg";
//        logger.info(url);
//
//        RestTemplate rest = new RestTemplate();
//

        String result = rest.getForObject("http://GOODS-SERVICE/goods/msg", String.class);

        return result;
    }
}
