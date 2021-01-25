package com.day7.test8;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    public void watch() {
        System.out.println("看门");
    }
}
