package com.day4;

/**
 * @auth admin
 * @date 2021/1/7
 * @Description
 */
public class Test6 {

    public static void main(String[] args) {
        int[] a = {1, 2, 5};
        int[] b = {1, 2, 5};
    }

    public static boolean equals(int[] arr, int[] arr2) {
        if (arr.length == arr2.length) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr2[i]) {
                    count++;
                }
            }

            if (count == arr.length) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean equals2(int[] arr, int[] arr2) {
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
