package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Program: cloud2020
 * @Description: 自定义负载均衡策略
 * @Author: 韩放
 * @Date: 2021/06/04 14:24:08
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
