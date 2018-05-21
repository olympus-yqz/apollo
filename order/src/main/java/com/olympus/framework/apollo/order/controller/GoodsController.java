package com.olympus.framework.apollo.order.controller;

import com.olympus.framework.apollo.order.entity.GoodsEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/goods")
public class GoodsController {

    @GetMapping
    public List<GoodsEntity> list() {

        List<GoodsEntity> list = new LinkedList<>();

        list.add(new GoodsEntity("100001", "房子", BigDecimal.valueOf(2000000)));
        list.add(new GoodsEntity("100002", "卡迪拉克", BigDecimal.valueOf(300000)));
        list.add(new GoodsEntity("100003", "格拉苏蒂", BigDecimal.valueOf(40000)));


        return list;
    }
}
