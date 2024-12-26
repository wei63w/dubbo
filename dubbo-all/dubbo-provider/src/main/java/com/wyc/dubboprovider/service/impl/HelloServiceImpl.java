package com.wyc.dubboprovider.service.impl;

import com.wyc.demodubboapi.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl  implements HelloService {


    @Override
    public String sayHello(String name) {
        return "this is hello to implement api and ref parameter:" + name;
    }
}
