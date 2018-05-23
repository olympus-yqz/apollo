package com.olympus.framework.apollo.goods.service.impl;

import com.olympus.framework.apollo.goods.dao.ProductCategoryMapper;
import com.olympus.framework.apollo.goods.entity.ProductCategory;
import com.olympus.framework.apollo.goods.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-23 15:31
 **/
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper dao;

    @Override
    public int deleteByPrimaryKey(Integer categoryId) {
        return 0;
    }

    @Override
    public int insert(ProductCategory record) {
        return 0;
    }

    @Override
    public int insertSelective(ProductCategory record) {
        return 0;
    }

    @Override
    public ProductCategory selectByPrimaryKey(Integer categoryId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ProductCategory record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ProductCategory record) {
        return 0;
    }

    @Override
    public List<ProductCategory> selectAllCategory() {
        return dao.selectAllCategory();
    }
}
