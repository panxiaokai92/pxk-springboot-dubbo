package com.jiudupan.dubboprovider.service;


import com.jiudupan.dubboapi.GreetingService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;


/**
 * @description:
 * @author: Mr.pxk
 * @create: 2019-07-07
 **/
@Service(version = "${spring.application.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
@Component
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String welcome(String name) {
        String msg = "Welcome " + name + " at " + LocalDateTime.now();
        System.out.println(msg);
        return msg;
    }
}