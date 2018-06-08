package com.sui.op.mall.api.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <description>:
 *
 * @author: yangyang
 * project:cloud
 * packageName:com.sui.op.mall.api.config
 * date:   2018-06-08 14:33
 */
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100, 1000, 3);
    }
}
