package com.yeafel.springcloud.service;

import com.yeafel.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yeafel
 * 2020/7/7 10:56
 * Do or Die,To be a better man!
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
