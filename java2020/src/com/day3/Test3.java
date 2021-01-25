package com.day3;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test3 {

    public static void main(String[] args) {
        short[] s = {4, -2, 5};
        short max = s[0];
        short max1 = 0;
        for (int i = 0; i < s.length; i++) {
            if (max <= s[i]) {
                max = s[i];
            }
        }
//        System.out.println(max);

        int i = 0;
//        for (; i < 10;i=i+1) {
//        for (; i < 10;i+=1) {
        for (; i < 10; i++) {
//            System.out.println(i);
        }

        for (; ; i++) {
            System.out.println(i);
            if (i >= 10) {
                break;
            }
        }

        int j = 0;
        for (; ; ) {
            j++;
            System.out.println(j);
            if (j >= 10) {
                break;
            }
        }

        while (true) {
            j++;
            System.out.println(j);
            if (j >= 10) {
                break;
            }
        }

        for (int k = 10; k > 0; k--) {

        }

        for (int k = 10; k > 0; k = k - 2) {

        }

        for (int k = 1; k < 10; k = k * 2) {

        }

//        int a = 1, b = 2;

        int a = 1;
        int b = 2;



    }

}
