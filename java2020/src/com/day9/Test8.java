package com.day9;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test8 {

    public static void main(String[] args) {
        User user = new User("芙蓉姐姐", 20);
        User user2 = new User("芙蓉姐姐", 20);
//        System.out.println(user);
//        System.out.println(user.toString());

        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());

        System.out.println("a".hashCode());
        System.out.println("ab".hashCode());
        System.out.println("abc".hashCode());
        System.out.println(97*31+98);
        System.out.println((97*31+98)*31+99);

        System.out.println("xxx".hashCode());
        System.out.println("xxxxxx".hashCode());

    }
}
