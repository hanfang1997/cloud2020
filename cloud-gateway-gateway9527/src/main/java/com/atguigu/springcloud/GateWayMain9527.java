package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Program: cloud2020
 * @Description: 网关模块主启动类
 * @Author: 韩放
 * @Date: 2021/06/15 10:34:52
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args){  
        SpringApplication.run(GateWayMain9527.class,args);
    }
}
