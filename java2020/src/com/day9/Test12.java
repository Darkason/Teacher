package com.day9;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test12 {

    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("abc");
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sb2 = new StringBuilder();

//        sb = sb.append("hello");
//        sb.append(true);
//        sb.append(3.14D);

        //链式
//        sb.append("hello").append(true).append(123);

//        sb2.append("hello");

//        System.out.println(sb);

//        System.out.println(sb == sb2);
//        System.out.println(sb.equals(sb2));

    }

    public static void a() {
        String str = "hello";
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        System.out.println(str);
    }

}
