package com.sui.op.mall.order.controller;

import com.netflix.discovery.converters.Auto;
import com.sui.op.mall.order.entity.Product;
import com.sui.op.mall.order.service.impl.ProductServiceImpl;
import com.sui.op.mall.order.vo.ProductReponse;
import com.sui.op.mall.order.vo.ProductRequest;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * desc: 产品控制层
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order.controller
 * date:   2018-06-08 11:10
 */
@RestController
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("product/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getProductById(id);
    }

    @PostMapping("product")
    public Product createProduct(@RequestBody ProductRequest productRequest){
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setCreateTime(new Date());
        return productService.createProduct(product);
    }

    @PutMapping("product/{id}")
    public Product updateProduct(@PathVariable("id") Long id,@RequestBody Map<String,Object> fieldMap){
        Product product = productService.getProductById(id);
        try {
            BeanUtils.populate(product, fieldMap);
        }catch (Exception e){
            logger.error("参与转化异常");
            return null;
        }
        return productService.updateProduct(product);
    }

    @DeleteMapping("product/{id}")
    public Product deleteProductById(@PathVariable("id") Long id){
        Product product = productService.getProductById(id);
        productService.deleteProductById(id);
        return product;
    }


    @GetMapping("/product")
    public ProductReponse getAllProducts(){
        List<Product> productList = productService.getAllProducts();
        ProductReponse response = new ProductReponse();
        response.setProductList(productList);
        response.setTotal(CollectionUtils.isEmpty(productList) ? 0 : productList.size());
        return response;
    }
}
