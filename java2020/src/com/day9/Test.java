package com.day9;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test {

    public static void main(String[] args) {

        Integer i = 1 + 1;
        Integer i2 = new Integer(1);
        Integer i3 = Integer.valueOf(1);

        int a = i;
        int a2 = i.intValue();

        String str = 20 + "";
        String str2 = String.valueOf(20);
        String str3 = Integer.toString(20);

        String str4 = true + "";

        a();
    }

    public static void a() {
        String string = "20";
        Integer i = Integer.valueOf(string);
        short s = Short.valueOf("120");

        Boolean aTrue = Boolean.valueOf("true");

//        System.out.println(Float.valueOf("3.14a"));

        System.out.println(Double.parseDouble("3.1415a"));
    }

}
