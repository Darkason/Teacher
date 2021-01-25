package com.day7.test9;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Person {

    String name = "如花";

    public void eat() {
        class Chopsticks {
            Integer length;

            public void use() {
                System.out.println(name + "在使用筷子,长度" + length);
            }
        }
        Chopsticks c = new Chopsticks();
        c.length=20;
        c.use();
    }

}
