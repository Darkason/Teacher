package com.day7.test2;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Cat extends Animal {

    String name = "tom";
    int age = 100;

    @Override
    public void run() {
        System.out.println("4只脚跑");
    }

    @Override
    void eat() {
        System.out.println("猫吃鱼");
    }
}
