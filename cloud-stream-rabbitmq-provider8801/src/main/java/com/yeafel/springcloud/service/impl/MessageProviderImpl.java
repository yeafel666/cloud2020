package com.yeafel.springcloud.service.impl;

import com.yeafel.springcloud.service.ImessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Yeafel
 * 2020/7/14 11:26
 * Do or Die,To be a better man!
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements ImessageProvider {

    //消息的发送管道
    @Resource
    private MessageChannel output;


    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*********serial: " +serial);
        return null;
    }
}
