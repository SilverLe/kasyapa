package com.sui.op.mall.order.dao;

import com.sui.op.mall.order.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * desc:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order.dao
 * date:   2018-06-08 10:36
 */
public interface ProductRepositoryDao extends JpaRepository<Product,Long> {
}
