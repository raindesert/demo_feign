package com.example.demo.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi")
public interface FeignDemoInterface {
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
    String testSayHi(@RequestParam(value = "name") String name);
}
