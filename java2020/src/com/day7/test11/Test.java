package com.day7.test11;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person(new Task() {
            @Override
            public void eat() {
                System.out.println("吃大餐");
            }
        });
        p.a();

        Person p2 = new Person(() -> {
            System.out.println("吃大餐");
        });
        p2.a();
    }
}
