package com.yeafel.springcloud.controller;

import com.yeafel.springcloud.entities.CommonResult;
import com.yeafel.springcloud.entities.Payment;
import com.yeafel.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yeafel
 * 2020/7/10 10:47
 * Do or Die,To be a better man!
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping(value = "consumer/payment/feign/timeout")
    public String paymentFeignTimeout() {
        //openfeign-ribbon 客户端一般默认等待1秒
        return paymentFeignService.paymentFeignTimeout();
    }
}
