package com.day10.test3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test8 {

    public static void main(String[] args) {
        Collection<Integer> c1 = new ArrayList<>();
        Collection<Number> c2 = new ArrayList<>();
        Collection<Object> c3 = new ArrayList<>();
        print(c1);
        print(c2);
//        print(c3);

//        print2(c1);
        print2(c2);
        print2(c3);

    }

    //泛型上限
    public static void print(Collection<? extends Number> collection) {
    }

    //下限
    public static void print2(Collection<? super Number> collection) {
    }

}
