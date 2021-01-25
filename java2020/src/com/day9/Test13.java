package com.day9;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test13 {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        sb.append("hello");
        sb2.append("hello");

        System.out.println(sb==sb2);
        System.out.println(sb.equals(sb2));
    }
}
