package com.yeafel.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yeafel
 * 2020/7/16 20:42
 * Do or Die,To be a better man!
 */
@Mapper
public interface StorageDao {
    //扣减库存
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
