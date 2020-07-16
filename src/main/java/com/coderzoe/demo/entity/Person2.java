package com.coderzoe.demo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author: yhs
 * @date: 2020/7/15 20:11
 * @description: 另一种方式注解
 */

@Component
public class Person2 {
    /**
     * 在用xml注入bean的时候，我们一般会配置properties的value
     * <bean>
     *      <properties name = "name" value = "张三"><properties/>
     * </bean>
     * 这里的value与注解@Value("张三")作用一样
     */

    @Value("张三")
    private String name;
    @Value("#{11*2}")
    private Integer age;
    @Value("true")
    private Boolean boss;
//    @Value("${person.birthday}")
    private Date birthday;
    //@Value("${person.map}")  不支持复杂类型封装
    private Map<String,Object> map;
    private List<Object> objectList;
    private Dog dog;

    public Person2() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birthday=" + birthday +
                ", map=" + map +
                ", objectList=" + objectList +
                ", dog=" + dog +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
