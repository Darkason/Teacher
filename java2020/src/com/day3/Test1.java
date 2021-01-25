package com.day3;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test1 {

    public static void main(String[] args) {

        int[] arr = new int[3];
        int arr2[] = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr3 = new int[]{1, 2, 3};

        int[] arr4 = {2, 3, 3, 5};

        arr4[0] = 10;

//        System.out.println(arr4);

//        System.out.println("1:"+arr4[0]);
//        System.out.println("2:"+arr4[1]);

        String[] str = {"aaa", "bbb"};

        boolean[] b = {true, false, true};
        Boolean[] b2 = {true};

        //数组只有length属性，没有length()方法
        //集合只有size()方法
//        System.out.println(str.length);

        int[] arr10 = new int[]{1, 2};
//        int[] arr11 = new int[]{1, 2};
        System.out.println(arr10[0]);
        System.out.println(arr10[1]);

        int[] arr11 = arr10;
        arr11[0] = 11;
        arr11[1] = 22;
        System.out.println(arr10[0]);
        System.out.println(arr10[1]);
        System.out.println(arr11[0]);
        System.out.println(arr11[1]);

        //深拷贝 浅拷贝

    }
}
