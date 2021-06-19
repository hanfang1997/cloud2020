package com.atguigu.springcloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.commons.util.IdUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Program: cloud2020
 * @Description: 服务降级熔断业务类
 * @Author: 韩放
 * @Date: 2021/06/07 09:49:53
 */
@Service
public class PaymentService {

    public String paymentInfo_OK(Integer id){

        return "线程池: "+Thread.currentThread().getName()+"   paymentInfo_OK,id "+id+"\t"+"O(∩_∩)O哈哈~";
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties ={@HystrixProperty(name ="execution.isolation.thread.timeoutInMilliseconds",value = "5000")
            , @HystrixProperty(name ="circuitBreaker.requestVolumeThreshold",value ="10"),
            @HystrixProperty(name ="circuitBreaker.sleepWindowInMilliseconds",value ="10000")
    } )
    public String paymentInfo_TimeOut(Integer id){
       /* int timeNumber = 3;
        try {
            Thread.sleep(timeNumber*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        int age = id;
        if(age<10){
            throw new RuntimeException("111");
        }
        return "线程池: "+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id "+id+"\t"+"O(∩_∩)O哈哈~"+" 耗时(秒)age"+age;
    }

    public String paymentInfo_TimeOutHandler(Integer id){
        return "线程池: "+Thread.currentThread().getName()+"   8001系统繁忙或者运行报错,请稍候再试,id "+id+"\t"+"o(╥﹏╥)o哭哭~";
    }

    //=====服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
            @HystrixProperty(name ="circuitBreaker.enabled",value ="true"),
            @HystrixProperty(name ="circuitBreaker.requestVolumeThreshold",value ="10"),
            @HystrixProperty(name ="circuitBreaker.sleepWindowInMilliseconds",value ="10000"),
            @HystrixProperty(name ="circuitBreaker.errorThresholdPercentage",value ="60")
    })
    public String paymentCircuitBreaker(@PathVariable("id") Integer id){
        if(id < 0){
            throw new RuntimeException("*****   id不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+ "\t调用成功,流水号    "+serialNumber;
    }

    public String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id){
        return "id不能为负数,请稍候再试,o(╥﹏╥)o~~   id: "+id;
    }




}