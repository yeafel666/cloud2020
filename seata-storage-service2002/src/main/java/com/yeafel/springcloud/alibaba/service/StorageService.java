package com.yeafel.springcloud.alibaba.service;

/**
 * @author Yeafel
 * 2020/7/16 20:51
 * Do or Die,To be a better man!
 */
public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId, Integer count);
}
