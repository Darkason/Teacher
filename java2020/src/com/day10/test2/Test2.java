package com.day10.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(10);

        //比较器
        Comparator<Integer>comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
                return o1-o2;
//                return o1>o2;
            }
        };
        Collections.sort(list,comparator);

        Collections.sort(list, (a, b) -> {
            return b - a;
        });

        System.out.println(list);

    }
}
