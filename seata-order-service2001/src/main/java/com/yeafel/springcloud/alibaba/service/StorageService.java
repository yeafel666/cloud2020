package com.yeafel.springcloud.alibaba.service;

import com.yeafel.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Yeafel
 * 2020/7/16 17:21
 * Do or Die,To be a better man!
 */
@FeignClient(value = "seata-storage-service")
@Component
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId,
                          @RequestParam("count") Integer count);
}
