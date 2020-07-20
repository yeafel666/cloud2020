package com.yeafel.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Yeafel
 * 2020/7/8 21:58
 * Do or Die,To be a better man!
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
