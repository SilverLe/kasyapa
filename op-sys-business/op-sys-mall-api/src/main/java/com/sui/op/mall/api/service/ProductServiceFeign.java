package com.sui.op.mall.api.service;

import com.sui.op.mall.api.config.FeignConfig;
import com.sui.op.mall.api.entity.Product;
import com.sui.op.mall.api.entity.ProductRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * <description>:feign客户端
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.api.service
 * date:   2018-06-08 14:34
 */
@FeignClient(value = "op-sys-mall-order-service",configuration = FeignConfig.class)
public interface ProductServiceFeign {

    /**
    * <description>:
     * 这个不该用实体类接收了，用json串
    * @param: Long id
    * @return: Product
    * @author: yangyang
    * @date: 2018/6/8 14:43
    **/
    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    Product getProductById(@PathVariable("id") Long id);
    /**
     * <description>:
     * @param: Long id
     * @return: Product
     * @author: yangyang
     * @date: 2018/6/8 14:43
     **/
    @RequestMapping(value = "/product",method = RequestMethod.GET)
    Product createProduct(@RequestBody ProductRequest productRequest);

}
