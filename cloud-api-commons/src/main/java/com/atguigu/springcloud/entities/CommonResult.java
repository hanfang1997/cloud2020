package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Program: cloud2020
 * @Description: 公共返回结果类
 * @Author: 韩放
 * @Date: 2021/04/22 23:40:51
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public static <T> CommonResult<T> ok(T data) {
        return new CommonResult<>(200, "success", data);
    }


}
