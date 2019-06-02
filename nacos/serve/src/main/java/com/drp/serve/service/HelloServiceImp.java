package com.drp.serve.service;

import com.drp.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@com.alibaba.dubbo.config.annotation.Service
public class HelloServiceImp implements HelloService {
    @Override
    public void sayHello() {
        log.info ("Hello Nacos !!");
    }
}
