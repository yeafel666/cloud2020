package com.yeafel.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yeafel
 * 2020/7/16 16:26
 * Do or Die,To be a better man!
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {
    private Integer code;
    private String message;
    private Object data;

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
