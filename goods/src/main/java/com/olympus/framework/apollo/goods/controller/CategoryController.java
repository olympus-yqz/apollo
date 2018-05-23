package com.olympus.framework.apollo.goods.controller;

import com.olympus.framework.apollo.goods.entity.ProductCategory;
import com.olympus.framework.apollo.goods.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-23 15:42
 **/
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ProductCategoryService service;

    @GetMapping("/list")
    public List<ProductCategory> list() {
        return service.selectAllCategory();
    }
}
