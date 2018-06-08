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
public class Integration {

    private Long id;
    private String userId;
    private Long integration;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Integration{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", integration=" + integration +
                ", createTime=" + createTime +
                '}';
    }
}
