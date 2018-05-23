package com.olympus.framework.apollo.goods.enums;

/*
 * 商品 上下架状态
 * */
public enum GoodsStatusEnum {
    UP(0, "在架"),
    DOWN(1, "下架");

    private Integer code;
    private String message;

    GoodsStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
