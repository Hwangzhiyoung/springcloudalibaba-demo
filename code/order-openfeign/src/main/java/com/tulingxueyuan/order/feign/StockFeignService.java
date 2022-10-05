package com.tulingxueyuan.order.feign;

import com.tulingxueyuan.order.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "stock-service", path = "/stock",configuration = FeignConfig.class)
public interface StockFeignService {

    @RequestMapping("deduct")
    public String deduct();
}
