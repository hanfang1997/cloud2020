package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Program: cloud2020
 * @Description: 订单openFeign调用主启动类
 * @Author: 韩放
 * @Date: 2021/06/04 17:44:45
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderFeignMain80 {
    public static void main(String[] args){
       /* SpringApplication.run(OrderFeignMain80.class,args);*/
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
