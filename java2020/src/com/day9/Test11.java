package com.day9;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test11 {

    public static void main(String[] args) {
        String str = new String("abc");
        String str2 = "abc";

        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        String str3 = new String(chars, 2, 2);
//        System.out.println(str3);


        String a = "hello";
        String b = "HelLO";

//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b));

//        System.out.println("a b".length());
//        System.out.println("亚索".length());

//        String a1 = "hello" + "world";
//        System.out.println("hello".concat("world"));
//        System.out.println(a1.charAt(2));

//        String a1 = "helloworld";
//        System.out.println(a1.indexOf("wor"));

//        System.out.println(a1.substring(5));
//        System.out.println(a1.substring(5,7));
//        System.out.println(a1.substring(2,a1.length()-2));

//        char[] chars1= a1.toCharArray();
//        byte[] bytes = a1.getBytes();
//        System.out.println(Arrays.toString(bytes));

//        System.out.println("heLLo".toLowerCase());
//        System.out.println("heLLo".toUpperCase());

//        System.out.println("hello".replace("ll", "xxx"));
//        System.out.println("hello".replace("e", "xxx"));
//        System.out.println("hello".replace("e", ""));

        String str00="篮球，足球，乒乓球";

        String aa = "你好，我是马云，我对钱不感兴趣";
        String[] split = aa.split("马云");
        for (String str0 : split) {
            System.out.println(str0);
        }

    }
}
