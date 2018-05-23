package com.olympus.framework.apollo.goods.controller;

import com.olympus.framework.apollo.goods.entity.ProductInfo;
import com.olympus.framework.apollo.goods.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-23 16:20
 **/
@RestController
@RequestMapping("/goods")

public class GoodsController {

    @Autowired
    private ProductInfoService service;

    @GetMapping
    public List<ProductInfo> list() {
        return null;
    }

    @GetMapping("/msg")
    public String msg() {
        return "this goods message 10003";
    }
}
