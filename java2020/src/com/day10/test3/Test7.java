package com.day10.test3;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test7 {
    public static void main(String[] args) {
        MyGener<String> myGener = new MyGener();
        myGener.add("hello");

        MyGener myGener2 = new MyGener();
        myGener2.add(123);
        myGener2.add("hello");

        new MyInter<String>() {
            @Override
            public void add(String s) {

            }
        };

    }
}
