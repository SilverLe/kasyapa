package com.sui.op.mall.order.vo;

import java.math.BigDecimal;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order.vo
 * date:   2018-06-08 11:26
 */
public class ProductRequest {

    private String name;
    private Long price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
