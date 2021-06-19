package com.atguigu.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Program: cloud2020
 * @Description: feign日志级别设置
 * @Author: 韩放
 * @Date: 2021/06/05 15:47:19
 */
@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL ;
    }
}
