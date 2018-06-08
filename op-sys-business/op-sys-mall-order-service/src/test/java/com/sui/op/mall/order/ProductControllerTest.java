package com.sui.op.mall.order;

import com.sui.op.mall.order.entity.Product;
import com.sui.op.mall.order.vo.ProductReponse;
import com.sui.op.mall.order.vo.ProductRequest;
import org.assertj.core.api.Assertions;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * <description>:产品api测试类
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.order
 * date:   2018-06-08 12:33
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductControllerTest {


    @Autowired
    private TestRestTemplate restTemplate;
    /**
     * <description>:测试创建产品
     * @param: []
     * @return: void
     * @author: yangyang
     * @date: 2018/6/8 13:51
     **/
    @Test
    public void test1_createProduct() throws Exception{
        ProductRequest request = new ProductRequest();
        request.setName("MacBook");
        request.setPrice(800000L);

        String result = restTemplate.postForObject("/product",request,String.class);
        System.out.println("新增产品:"+result);
    }
    /**
    * <description>:测试根据主键获取产品
    * @param: []
    * @return: void
    * @author: yangyang
    * @date: 2018/6/8 13:51
    **/
    @Test
    public void test2_getProductById() throws Exception{
        Product product = restTemplate.getForObject("/product/1",Product.class);
        System.out.println("获取产品:"+product);
        Assertions.assertThat(product.getName()).isEqualTo("MacBook");
    }

    /**
     * <description>:测试获取所有产品
     * @param: []
     * @return: void
     * @author: yangyang
     * @date: 2018/6/8 13:52
     **/
    @Test
    public void test3_getAllProduct() throws Exception{
        ProductReponse response = restTemplate.getForObject("/product",ProductReponse.class);
        System.out.println("获取所有产品:"+response.getTotal());
        Assertions.assertThat(response.getProductList()).isNotNull();
    }

    /**
    * <description>: 测试更新产品
    * @param: []
    * @return: void
    * @author: yangyang
    * @date: 2018/6/8 13:52
    **/
    @Test
    public void test4_updateProduct() throws Exception{
        Map<String,Object> fieldMap = new HashMap<>(8);
        fieldMap.put("price",900000L);
        RequestEntity<Map<String,Object>> requestEntity = new RequestEntity<>(fieldMap, HttpMethod.PUT,new URI("/product/1"));
        String result = restTemplate.exchange(requestEntity,String.class).getBody();
        System.out.println("更新产品:"+result);
    }

    /**
    * <description>:测试根据主键删除产品
    * @param: []
    * @return: void
    * @author: yangyang
    * @date: 2018/6/8 13:52
    **/
    @Test
    public void test5_deleteProductById() throws Exception{
        String result = restTemplate.exchange("/product/1",HttpMethod.DELETE,null,String.class).getBody();
        System.out.println("删除产品:"+result);
    }


}
