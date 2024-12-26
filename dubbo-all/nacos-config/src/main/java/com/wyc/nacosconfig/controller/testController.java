package com.wyc.nacosconfig.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/config")
public class testController {


//    @Autowired
//    DubboConfig dubboConfig;

    @NacosValue(value = "${dubbo.protocol.name:'default-name'}", autoRefreshed  = true)
//    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private String name;
    @NacosValue(value = "${dubbo.protocol.port:'defaul-port'}", autoRefreshed  = true)
    private String port;


    @RequestMapping("/test")
    public String test(){

//        String name = dubboConfig.getName();
//        String port = dubboConfig.getPort();
//        String address = dubboConfig.getAddress();
//        String str = "name:"+name+"\nport:"+port+"\naddress:"+address;
        String str = "name:"+name+"\nport:"+port;
        return str;
    }

}
