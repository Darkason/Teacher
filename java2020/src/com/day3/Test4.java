package com.day3;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test4 {
    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {10, 20, 30, 40, 50};
//        System.arraycopy(arr1, 0, arr2, 1, 2);

//        int[] arr3 = arr1;

        int[] arr3 = new int[5];

        System.arraycopy(arr1, 0, arr3, 0, arr1.length);

        arr3[0]=100;

        System.out.println(arr1[0]);

        for (int i : arr3) {
            System.out.println(i);
        }
    }

}
