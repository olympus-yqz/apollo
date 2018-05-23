package com.olympus.framework.apollo.goods.dao;

import com.olympus.framework.apollo.goods.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryMapper {
    int deleteByPrimaryKey(Integer categoryId);

    int insert(ProductCategory record);

    int insertSelective(ProductCategory record);

    ProductCategory selectByPrimaryKey(Integer categoryId);

    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);

    List<ProductCategory> selectAllCategory();
}