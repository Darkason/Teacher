package com.day9;

import java.util.Objects;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test10 {

    public static void main(String[] args) {
//        String str="abc";
        String str = null;
        System.out.println("abc".equals(str));
//        System.out.println(str.equals("abc"));

        if (str != null) {
            System.out.println(str.equals("abc"));
        }

        System.out.println(Objects.equals(str, "abc"));


        // ==和equals区别?
        // 如果是基本类型， 只能用==，是比较值，不能用equals
        //如果是引用类型， ==是比较内存地址，equals默认也是比较内存地址,此时调用的是Object类中的equals方法
        //如果对象重写了equals方法，则equals比较的才是值

        // String为什么调用equals是比较的值？
        //重写equals为什么要重写hashCode?
    }
}
