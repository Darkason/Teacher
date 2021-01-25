package com.day7.test6;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("狗吃翔");
    }

    @Override
    public int run() {
        return 0;
    }
}
