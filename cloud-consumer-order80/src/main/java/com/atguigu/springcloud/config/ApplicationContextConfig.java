package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Program: cloud2020
 * @Description: 应用程序上下文配置类
 * @Author: 韩放
 * @Date: 2021/05/08 16:36:32
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced //使用springcloud内置的注解@LoadBalanced赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
