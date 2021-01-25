package com.test;


public class Dog {

    //成员变量
    String name;
    int age;

    //构造方法
    public Dog() {
    }

    //构造方法
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    {
        System.out.println("构造代码块");
    }

    static {
        System.out.println("静态代码块");
    }

    //成员方法
    public void eat() {
        System.out.println("吃的方法...");
    }

    public void run() {
        System.out.println("跑的方法...");
    }

}
