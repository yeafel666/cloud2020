package com.yeafel.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Yeafel
 * 2020/7/7 12:11
 * Do or Die,To be a better man!
 */
@Configuration
public class ApplicationContextConfig {


    /**
     * LoadBalanced赋予了restTemplate负载均衡的能力
     */
    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
