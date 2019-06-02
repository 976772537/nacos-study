package com.drp.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.drp.service.HelloService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication implements ApplicationRunner {
    @Reference
    private HelloService helloService;
    public static void main(String[] args) {
        SpringApplication.run (ConsumerApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        helloService.sayHello ();
    }
}
