package com.wyc.dubboconsumer.config;


import com.alibaba.nacos.api.config.annotation.NacosValue;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class NacosConfig {

//    @Value("${dubbo.protocol.name}")
//    public String DubboProtocolName;
//
//    @Value("${dubbo.protocol.port}")
//    public String DubboProtocolPort;
//
//    @Value("${dubbo.registry.address}")
//    public String DubboProtocolAddress;
//
//    public String getDubboProtocolName() {
//        return DubboProtocolName;
//    }
//
//    public void setDubboProtocolName(String dubboProtocolName) {
//        DubboProtocolName = dubboProtocolName;
//    }
//
//    public String getDubboProtocolPort() {
//        return DubboProtocolPort;
//    }
//
//    public void setDubboProtocolPort(String dubboProtocolPort) {
//        DubboProtocolPort = dubboProtocolPort;
//    }
//
//    public String getDubboProtocolAddress() {
//        return DubboProtocolAddress;
//    }
//
//    public void setDubboProtocolAddress(String dubboProtocolAddress) {
//        DubboProtocolAddress = dubboProtocolAddress;
//    }



}
