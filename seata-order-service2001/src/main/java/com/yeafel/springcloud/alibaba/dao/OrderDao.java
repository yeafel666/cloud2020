package com.yeafel.springcloud.alibaba.dao;

import com.yeafel.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yeafel
 * 2020/7/16 17:03
 * Do or Die,To be a better man!
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态。从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
