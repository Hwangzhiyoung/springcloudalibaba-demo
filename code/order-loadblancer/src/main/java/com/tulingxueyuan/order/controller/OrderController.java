package com.tulingxueyuan.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("add")
    public String add(){
        System.out.println("δΈεζε");
        String msg = restTemplate.getForObject("http://stock-service/stock/deduct", String.class);
        return "hello world "+ msg;
    }
}
