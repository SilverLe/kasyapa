package com.sui.op.mall.order.service;

import com.sui.op.mall.order.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * desc:产品服务类
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order.service
 * date:   2018-06-08 10:47
 */
public interface IProductService {

    /**
    * <description>: 根据主键查找产品
    * @param: [id]
    * @return: com.sui.op.mall.order.entity.Product
    * @author: HP
    * @date: 2018/6/8 10:57
    **/
    Product getProductById(Long id);

    /**
    * <description>: 根据产品实例创建产品
    * @param: [product]
    * @return: void
    * @author: HP
    * @date: 2018/6/8 10:58
    **/
    Product createProduct(Product product);

    /**
    * <description>: 更新产品
    * @param: [product]
    * @return: void 
    * @author: HP
    * @date: 2018/6/8 10:58
    **/
    Product updateProduct(Product product);

    /**
    * <description>:根据主键删除产品
    * @param: [id]
    * @return: int 
    * @author: HP
    * @date: 2018/6/8 10:58
    **/
    void deleteProductById(Long id);

    /**
    * <description>:获取所有产品
    * @param: []
    * @return: java.util.List<com.sui.op.mall.order.entity.Product>
    * @author: HP
    * @date: 2018/6/8 10:59
    **/
    List<Product> getAllProducts();

}
