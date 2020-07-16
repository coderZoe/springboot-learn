package com.coderzoe.demo.config;

import com.coderzoe.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration注解告诉SpringBoot 这是一个配置类 SpringBoot推荐注解和类配置
 * @author: yhs
 * @date: 2020/7/15 22:11
 */
@Configuration
public class MyAppConfig {

    /**
     * Bean注解与之前配置文件中<bean></bean>作用相同
     * 注解的作用是将方法的返回值 添加到容器中！ 容器中组件默认id就是方法名(bean id)
     */
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
