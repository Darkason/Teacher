package com.day7.test2;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Monkey extends Animal {

    String name2 = "";

    public Monkey() {
//        String name00 = super.name;
//        String name0 = this.name2;
//        super();
    }

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("2只脚跑");
    }

    @Override
    void eat() {
        System.out.println("猴子吃桃");
    }
}
