package com.jiudupan.dubboconsumer;

import com.jiudupan.dubboapi.GreetingService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Mr.pxk
 * @create: 2019-07-07
 **/
@Service
public class Consumer {

    @Reference(version = "${spring.application.version}",
            application = "${spring.application.id}",
            registry = "${dubbo.registry.address}")
    private GreetingService greetingService;

    @Scheduled(fixedRate = 3000)
    public void consume() {
        System.out.println(greetingService.welcome("Dubbo"));
    }


}
