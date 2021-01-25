package com.day9;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test14 {


    public static void main(String[] args) {
        int num = 100000;

        long start1 = System.currentTimeMillis();
        String str = "hello";
        for (int i = 0; i < num; i++) {
            str += i;
        }
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(i);
        }
        long end2 = System.currentTimeMillis();

        long start3 = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < num; i++) {
            stringBuffer.append(i);
        }
        long end3 = System.currentTimeMillis();

        System.out.println("String:" + (end1 - start1));
        System.out.println("StringBuilder:" + (end2 - start2));
        System.out.println("StringBuffer:" + (end3 - start3));

    }
}
