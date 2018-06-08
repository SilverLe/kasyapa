package com.sui.op.mall.api.entity;

import java.util.List;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order.vo
 * date:   2018-06-08 11:26
 */
public class ProductReponse {

    private List<Product> productList;

    private int total;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
