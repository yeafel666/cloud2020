package com.yeafel.springcloud.alibaba.controller;

import com.yeafel.springcloud.alibaba.domain.CommonResult;
import com.yeafel.springcloud.alibaba.domain.Order;
import com.yeafel.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yeafel
 * 2020/7/16 17:35
 * Do or Die,To be a better man!
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功");
    }
}
