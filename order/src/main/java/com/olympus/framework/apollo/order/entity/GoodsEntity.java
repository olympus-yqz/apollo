package com.olympus.framework.apollo.order.entity;

import java.math.BigDecimal;

/**
 * @program: apollo
 * @description:
 * @author: yqzhang
 * @create: 2018-05-21 21:37
 **/
public class GoodsEntity {

    private String id;
    private String name;
    private BigDecimal price;

    public GoodsEntity() {
    }

    public GoodsEntity(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
