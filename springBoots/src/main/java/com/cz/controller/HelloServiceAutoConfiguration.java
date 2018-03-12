package com.cz.controller;

import com.cz.bean.HelloService;
import com.cz.bean.HelloServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
//@ConditionalOnClass注解主要是用来判断HelloService这个类在路径中是否存在
@ConditionalOnClass(HelloService.class)
//@ConditionalOnProperty注解则表示指定的属性要满足的条件，在helloService方法中我们则使用了HelloServiceProperties提供的参数。
@ConditionalOnProperty(prefix = "hello",value = "enable",matchIfMissing = true)
public class HelloServiceAutoConfiguration {
    @Autowired
    private HelloServiceProperties helloServiceProperties;
    @Bean
    public HelloService helloService() {
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}