package com.day10.test3;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class MyGener<ABC> {

    public ABC add(ABC abc) {
        System.out.println(abc);
        return abc;
    }

    public <ABC> void add2(ABC abc) {

    }
}
