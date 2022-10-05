package com.tulingxueyuan.ribbon;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfig {
    @Bean
    public IRule iRule(){
        return new NacosRule(); //基于naco权重的负载均衡策略，服务提供者权重越大越可能被调到
//        return new RandomRule();
    }
}
