package com.tulingxueyuan.order.config;
/*
* 这个配置类是控制日志等级输出,超时时间，自定义拦截器
* */

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
*  全局配置： 当使用@Configuration 会将配置作用所有的服务提供方
*  局部配置： 1. 通过配置类：如果只想针对某一个服务进行配置， 就不要加@Configuration
*           2. 通过配置文件
* */
//@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

    //interface里要使用feign原生注解
//    @Bean
//    public Contract feignContract() {
//        return new Contract.Default();
//    }
}
