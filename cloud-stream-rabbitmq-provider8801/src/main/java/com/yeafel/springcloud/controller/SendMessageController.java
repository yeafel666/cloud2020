package com.yeafel.springcloud.controller;

import com.yeafel.springcloud.service.ImessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Yeafel
 * 2020/7/14 11:34
 * Do or Die,To be a better man!
 */
@RestController
public class SendMessageController {
    @Resource
    private ImessageProvider messageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage() {
        return messageProvider.send();
    }
}
