package com.day7.test8;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void mouse() {
        System.out.println("猫抓老鼠");
    }

}
