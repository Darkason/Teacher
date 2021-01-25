package com.day5;


public class Dog {

    //属性
    String name;

    Integer age;

    //构造方法 无参
    public Dog() {

    }

    //构造方法 有参  构造方法的重载
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("构造代码块");
    }

    static {

    }


    //行为
    public void run() {
        System.out.println("这只狗会跑");
    }

    public void eat() {

    }


}
