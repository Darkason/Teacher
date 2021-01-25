package com.day3;

/**
 * @auth admin
 * @date 2021/1/6
 * @Description
 */
public class Test2 {

    public static void main(String[] args) {
        short[] s = {1, 2, 3};
//        System.out.println(s[3]);

        byte[] b = {1, 2};
//        b = null;
//        System.out.println(b);
//        System.out.println(b.length);

//        for (int i = 0; i < ; i++) {
//
//        }

//        for (byte b0:b){
//
//        }

        int i=0;
        while (true) {
            System.out.println(b[i]);
            i++;
            if(i>=b.length){
                break;
            }
        }
    }

}
