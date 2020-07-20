package com.yeafel.springcloud.service.impl;

import com.yeafel.springcloud.dao.PaymentDao;
import com.yeafel.springcloud.entities.Payment;
import com.yeafel.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yeafel
 * 2020/7/7 10:57
 * Do or Die,To be a better man!
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
