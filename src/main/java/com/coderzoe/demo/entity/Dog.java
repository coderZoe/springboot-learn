package com.coderzoe.demo.entity;

/**
 * @author yhs
 * @date 2020/7/14 23:41
 * @description
 */
public class Dog {
    private String name;
    private Integer age;

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}
