package com.day5.test1;

/**
 * @auth admin
 * @date 2021/1/7
 * @Description
 */
public class Student {

    private String name;
    private Integer age;

    public void eat() {
    }

    public int sum() {
        return 0;
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
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
