package com.yeafel.springcloud.dao;

import com.yeafel.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yeafel
 * 2020/7/7 10:02
 * Do or Die,To be a better man!
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
