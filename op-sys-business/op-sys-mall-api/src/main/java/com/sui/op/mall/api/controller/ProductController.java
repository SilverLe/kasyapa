package com.sui.op.mall.api.controller;

import com.sui.op.mall.api.entity.Product;
import com.sui.op.mall.api.entity.ProductRequest;
import com.sui.op.mall.api.service.ProductServiceFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <description>:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.api.controller
 * date:   2018-06-08 14:48
 */
@RestController
public class ProductController {

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductServiceFeign productServiceFeign;

    @GetMapping("product/get/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productServiceFeign.getProductById(id);
    }

    @GetMapping("product/create")
    public Product createProduct(){
        ProductRequest productRequest = new ProductRequest();
        productRequest.setName("MakBook");
        productRequest.setPrice(800000L);
        return productServiceFeign.createProduct(productRequest);
    }

    /*@PutMapping("product/{id}")
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
    }*/
}
