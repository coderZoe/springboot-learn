package com.coderzoe.demo;

import com.coderzoe.demo.entity.Person;
import com.coderzoe.demo.entity.Person2;
import com.coderzoe.demo.entity.Person3;
import com.coderzoe.demo.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private Person2 person2;
    @Autowired
    private Person3 person3;
    @Autowired
    ApplicationContext context;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    /**
     * 不再用@ConfigurationProperties注解 改为使用@Value注解来注入值
     * @author: yhs
     * @date: 2020/07/15 20:20
     * @param:
     * @return:
     */
    @Test
    void test2(){
        System.out.println(person3);
    }

    @Test
    void test3(){
        System.out.println(context.containsBean("helloService"));
    }

}
