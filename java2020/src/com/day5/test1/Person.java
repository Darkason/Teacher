package com.day5.test1;

import java.util.*;

/**
 * @auth admin
 * @date 2021/1/7
 * @Description
 */
public class Person {

    private String name = "马云";
    private int age;
    private boolean b;

    String num;

    public void eat() {
        name = "小马哥";
        num = "";
        System.out.println(name);
        System.out.println("吃饭");
        sum(1, 2);
    }

    private int sum(int a, int b) {
        return a + b;
    }

}
