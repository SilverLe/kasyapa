package com.sui.op.mall.api.entity;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order.vo
 * date:   2018-06-08 11:26
 */
public class IntegrationRequest {

    private String userId;
    private Long integration;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getIntegration() {
        return integration;
    }

    public void setIntegration(Long integration) {
        this.integration = integration;
    }
}
