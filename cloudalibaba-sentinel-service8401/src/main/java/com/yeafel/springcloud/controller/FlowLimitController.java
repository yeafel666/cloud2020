package com.yeafel.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Yeafel
 * 2020/7/15 16:43
 * Do or Die,To be a better man!
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        //暂停毫秒
//        try {
//            TimeUnit.MICROSECONDS.sleep(800);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return "--------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "\t" + "····testB");
        return "--------testB";
    }


    @GetMapping("/testD")
    public String testD() {
        //暂停几秒钟线程
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD 测试RT");

        log.info("testD 异常比例");
        int age = 10 / 0;
        return "------testD";
    }


    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常比例");
        int age = 10 / 0;
        return "-----testE 测试异常比例";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2
    ) {
        //如果这里有异常，热点key限流的兜底方法是不会生效的，还是会报异常，要用fallback兜底了
//        int age = 10 / 0;
        return "--------testHotKey";
    }


    public String deal_testHotKey(String p1, String p2, BlockException blockException) {
        //sentinel系统默认提示： Blocked by sentinel(flow limiting)
        return "-------deal_testHotKey,o(╥﹏╥)o";
    }
}
