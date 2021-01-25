package com.day3;

import java.util.Arrays;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test5 {

    public static void main(String[] args) {
        int[] a = {1, 22, 5, 65, -1, 63, 6};
        Arrays.sort(a, 0, 4);
        for (int i = 0; i < a.length; i++) {
            //System.out.println(a[i]);
        }

        System.out.println(a);
        System.out.println(a.toString());
        System.out.println(Arrays.toString(a));
    }
}
