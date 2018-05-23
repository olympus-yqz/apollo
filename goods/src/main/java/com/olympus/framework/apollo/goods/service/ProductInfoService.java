package com.olympus.framework.apollo.goods.service;

import com.olympus.framework.apollo.goods.entity.ProductInfo;

public interface ProductInfoService {
    int deleteByPrimaryKey(String productId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    ProductInfo selectByPrimaryKey(String productId);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);
}