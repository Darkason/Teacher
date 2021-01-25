package com.day10.test3;

import java.util.HashSet;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test3 {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("ab");  // 10  97*31+98
        set.add("ab");  // 10  97*31+98
        set.add("abc"); // 20

        set.add("Aa"); // 2112
        //"BB".equals()
        set.add("BB"); // 2112
        set.add("CC"); // 2112
        set.add("DD"); // 2112
        set.add("EE"); // 2112
        set.add("FF"); // 2112
        set.add("FF3"); // 2112
        set.add("FF1"); // 2112
        set.add("FF9"); // 2112

        set.add("hello"); // 1000
        set.add("world"); // 2000



        // 65*31+97
        System.out.println("Aa".hashCode());
        // 66*31+66
        System.out.println("BB".hashCode());

        //对象相同，hashCode一定相同
        //hashCode相同，对象不一定相同 Aa和BB

    }
}
