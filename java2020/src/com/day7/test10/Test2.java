package com.day7.test10;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test2 {

    public static void main(String[] args) {
        Person p = new Person() {
            @Override
            public void work() {
                System.out.println("经理管理其他人");
            }

            @Override
            public void eat() {
                System.out.println("吃鱼翅");
            }
        };

        Person p2 = new Person() {
            @Override
            public void work() {
                System.out.println("科学家造原子弹");
            }

            @Override
            public void eat() {
                System.out.println("吃燕窝");
            }
        };

        a(p2);

    }

    public static void a(Person person) {
        person.eat();
    }

}
