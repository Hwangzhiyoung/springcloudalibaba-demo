package com.tulingxueyuan.order;

import com.tulingxueyuan.ribbon.RibbonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@RibbonClients(value = {
//        @RibbonClient(name = "stock-service",configuration = RibbonConfig.class),
//})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }

    @Bean
    @LoadBalanced
    //@LoadBalanced通过客户端的负载均衡解析名字服务-ip:port，才能执行远程调用
    public RestTemplate restTemplate(RestTemplateBuilder restBuilder){
        RestTemplate build = restBuilder.build();
        return build;
    }
}
