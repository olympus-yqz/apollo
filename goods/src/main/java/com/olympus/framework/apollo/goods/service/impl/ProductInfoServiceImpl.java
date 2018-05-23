package com.olympus.framework.apollo.goods.service.impl;

import com.olympus.framework.apollo.goods.dao.ProductInfoMapper;
import com.olympus.framework.apollo.goods.entity.ProductInfo;
import com.olympus.framework.apollo.goods.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-23 15:29
 **/
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper dao;

    @Override
    public int deleteByPrimaryKey(String productId) {
        return 0;
    }

    @Override
    public int insert(ProductInfo record) {
        return 0;
    }

    @Override
    public int insertSelective(ProductInfo record) {
        return 0;
    }

    @Override
    public ProductInfo selectByPrimaryKey(String productId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ProductInfo record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ProductInfo record) {
        return 0;
    }
}
