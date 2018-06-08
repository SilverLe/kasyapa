package com.sui.op.mall.api.entity;

import java.util.Date;

/**
 * desc:产品实体类
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order.entity
 * date:   2018-06-08 10:27
 */
public class Product {

    private Long id;
    private String name;
    private Long price;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", createTime=" + createTime +
                '}';
    }
}
