package com.day9;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test9 {

    public static void main(String[] args) {

        String str = "hello";
        String str2 = "hello";

        System.out.println(str.equals(str2));

        User user = new User("芙蓉姐姐", 20);
        User user2 = new User("芙蓉姐姐", 20);

//        System.out.println(user);
//        System.out.println(user2);

        System.out.println(user == user2);
        //重写equals方法后比较的是具体的值，不在是默认的==(比较内存地址)
        System.out.println(user.equals(user2));

    }

}
