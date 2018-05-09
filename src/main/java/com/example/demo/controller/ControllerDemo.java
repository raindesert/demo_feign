package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
    @Autowired
    FeignDemoInterface demoInterface;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return demoInterface.testSayHi(name);
    }
}
