package com.yeafel.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Yeafel
 * 2020/7/16 17:39
 * Do or Die,To be a better man!
 */
@Configuration
@MapperScan({"com.yeafel.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
