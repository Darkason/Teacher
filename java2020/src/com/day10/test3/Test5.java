package com.day10.test3;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test5 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr));
        System.out.println(sum(1));
        System.out.println(sum(1,2,3));
    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
