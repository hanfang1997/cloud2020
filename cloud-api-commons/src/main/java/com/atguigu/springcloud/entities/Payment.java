package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Program: cloud2020
 * @Description: 支付实体类
 * @Author: 韩放
 * @Date: 2021/04/21 12:34:34
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable{

    private Long id;

    private String serial;
}
