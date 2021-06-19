package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Program: cloud2020
 * @Description: 订单模块启动类
 * @Author: 韩放
 * @Date: 2021/05/08 14:39:17
 */
@SpringBootApplication
@EnableEurekaClient
/*@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)*/
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
