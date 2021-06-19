package com.atguigu.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;

/**
 * @Program: cloud2020
 * @Description: feign接口的统一降级处理实现类
 * @Author: 韩放
 * @Date: 2021/06/08 16:54:13
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "===== PaymentFallbackService fall back-paymentInfo_OK,o(╥﹏╥)o ===== "+id;
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "===== PaymentFallbackService fall back-paymentInfo_TimeOut,o(╥﹏╥)o =====";
    }

    public String  fallbackHandler(){
        return "heiheihei";
    }
}
