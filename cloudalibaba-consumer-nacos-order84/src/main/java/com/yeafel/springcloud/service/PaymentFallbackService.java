package com.yeafel.springcloud.service;

import com.alibaba.csp.sentinel.command.annotation.CommandMapping;
import com.yeafel.springcloud.entities.CommonResult;
import com.yeafel.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Yeafel
 * 2020/7/16 14:09
 * Do or Die,To be a better man!
 */
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444444, "服务降级返回，----PaymentFallbackService", new Payment(id, "error"));
    }
}
