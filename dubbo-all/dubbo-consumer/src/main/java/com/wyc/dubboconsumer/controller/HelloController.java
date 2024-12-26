package com.wyc.dubboconsumer.controller;


import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.wyc.demodubboapi.service.HelloService;
import com.wyc.dubboconsumer.config.NacosConfig;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

@RestController
public class HelloController {

    @Autowired
    NacosConfig nacosConfig;

    @DubboReference
    HelloService helloService;

    @GetMapping("/hello")
    public String  getHelloService() {

//        String str = nacosConfig.DubboProtocolName + " " + nacosConfig.DubboProtocolPort + " " + nacosConfig.DubboProtocolAddress;

//        String str = DubboProtocolName + " " + DubboProtocolPort + " " + DubboProtocolAddress;
//        System.out.println(str);
        return helloService.sayHello("wyc:::");
    }
    
    
    
    
}
