package com.yeafel.springcloud.alibaba.service.impl;

import com.yeafel.springcloud.alibaba.dao.OrderDao;
import com.yeafel.springcloud.alibaba.domain.Order;
import com.yeafel.springcloud.alibaba.service.AccountService;
import com.yeafel.springcloud.alibaba.service.OrderService;
import com.yeafel.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yeafel
 * 2020/7/16 17:23
 * Do or Die,To be a better man!
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order", rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("--->开始新建订单");
        //1、新建订单
        orderDao.create(order);

        log.info("---->订单微服务开始调用库存，做扣减");
        //2、扣减库存
        storageService.decrease(order.getProductId(), order.getCount());
        log.info("------>订单服务开始调用库存，做扣减end");

        log.info("---->订单微服务开始调用账户，做扣减Money");
        //3、扣减账户
        accountService.decrease(order.getUserId(), order.getMoney());
        log.info("---->订单微服务开始调用账户，做扣减Money----end");

        //4  修改订单状态 ，从0到1， 1代表完成
        log.info("---->修改订单状态开始");
        orderDao.update(order.getUserId(), 0);
        log.info("---->修改订单状态结束");

        log.info("---->下订单结束了，O(∩_∩)O哈哈~");
    }
}
