package com.coderzoe.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 操作
 * @author: yhs
 * @date: 2020/7/15 10:52
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Value("${person.name}")
    private String name;
    /**
     * 测试1
     * @author: yhs
     * @date: 2020/7/15 10:52
     * @param:
     * @return: {@link String }
     */
    @GetMapping("/test")
    public String test(){
        return "ok";
    }

    /**
     * 测试2
     * @author: yhs
     * @date: 2020/07/15 11:02
     * @param:
     * @return: {@link String }
     */
    @GetMapping("/hello")
    public String test2(){
        return "hello"+name;
    }
}
