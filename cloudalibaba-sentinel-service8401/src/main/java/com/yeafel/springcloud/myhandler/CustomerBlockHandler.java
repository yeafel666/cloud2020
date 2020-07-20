package com.yeafel.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yeafel.springcloud.entities.CommonResult;

/**
 * @author Yeafel
 * 2020/7/15 19:54
 * Do or Die,To be a better man!
 */
public class CustomerBlockHandler {
    public static CommonResult handlerExcepetion(BlockException exception) {
        return new CommonResult(4444, "按客户自定义，global handlerException-------------1");
    }


    public static CommonResult handlerExcepetion2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义，global handlerException-------------2");
    }
}
