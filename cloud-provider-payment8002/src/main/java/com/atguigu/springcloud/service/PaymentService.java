package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Program: cloud2020
 * @Description: 支付业务接口
 * @Author: 韩放
 * @Date: 2021/04/25 20:50:10
 */
public interface PaymentService {

    Integer create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
