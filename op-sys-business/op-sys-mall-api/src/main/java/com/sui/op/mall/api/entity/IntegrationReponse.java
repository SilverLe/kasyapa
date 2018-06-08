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
public class IntegrationReponse {

    private List<Integration> integrationList;

    private int total;

    public List<Integration> getIntegrationList() {
        return integrationList;
    }

    public void setIntegrationList(List<Integration> integrationList) {
        this.integrationList = integrationList;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
