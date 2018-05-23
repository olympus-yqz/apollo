package com.olympus.framework.apollo.goods.service;

import com.olympus.framework.apollo.goods.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryService {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);

    List<ProductCategory> selectAllCategory();
}