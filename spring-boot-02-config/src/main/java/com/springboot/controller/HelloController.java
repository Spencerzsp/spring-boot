package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author: zsp
 * @ Date: 2019/9/22 0022 下午 4:05
 * @ Version
 */

@RestController
public class HelloController {

    @Value("${person.last-name}") // 从配置文件中获取单个属性
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello " + name;
    }
}
