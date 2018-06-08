package com.sui.op.mall.order.service.impl;

import com.sui.op.mall.order.dao.ProductRepositoryDao;
import com.sui.op.mall.order.entity.Product;
import com.sui.op.mall.order.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order.service.impl
 * date:   2018-06-08 11:02
 */
@Service("productService")
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductRepositoryDao productRepositoryDao;

    @Override
    public Product getProductById(Long id) {
        return productRepositoryDao.findOne(id);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepositoryDao.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepositoryDao.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
         productRepositoryDao.delete(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepositoryDao.findAll();
    }
}
