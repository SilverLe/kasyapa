package com.sui.op.mall.api.service;

import com.sui.op.mall.api.config.FeignConfig;
import com.sui.op.mall.api.entity.Integration;
import com.sui.op.mall.api.entity.IntegrationRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <description>:feign客户端
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.api.service
 * date:   2018-06-08 14:34
 */
@FeignClient(value = "op-sys-mall-integra-service",configuration = FeignConfig.class)
public interface IntegrationServiceFeign {

    /**
    * <description>:
     * 这个不该用实体类接收了，用json串
    * @param: Long id
    * @return: Integration
    * @author: yangyang
    * @date: 2018/6/8 14:43
    **/
    @RequestMapping(value = "/integration/{id}",method = RequestMethod.GET)
    Integration getIntegrationById(@PathVariable("id") Long id);
    /**
     * <description>:
     * @param: Long id
     * @return: Integration
     * @author: yangyang
     * @date: 2018/6/8 14:43
     **/
    @RequestMapping(value = "/integration",method = RequestMethod.GET)
    Integration createIntegration(@RequestBody IntegrationRequest integrationRequest);

    /**
     * <description>:修改积分
     * @param: Long id
     * @return: Integration
     * @author: yangyang
     * @date: 2018/6/8 14:43
     **/
    @RequestMapping(value = "/integration/{id}",method = RequestMethod.PUT)
    Integration updateIntegration(@PathVariable("id") Long id,@RequestBody Map<String,Object> fieldMap);

}
