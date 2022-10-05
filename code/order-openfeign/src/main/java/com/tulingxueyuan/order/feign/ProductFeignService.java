package com.tulingxueyuan.order.feign;

import com.tulingxueyuan.order.config.FeignConfig;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "product-service",path = "/product")
public interface ProductFeignService {

    @RequestMapping("/{id}")
    public String get(@PathVariable("id") Integer id);

    //对应feign原生注解
//    @RequestLine("GET /{id}")
//    public String get(@Param("id") Integer id);
}
