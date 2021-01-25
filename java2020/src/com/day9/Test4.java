package com.day9;

import java.util.Scanner;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int i1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int i2 = scanner.nextInt();
        System.out.println("请输入第3个数字：");
        int i3 = scanner.nextInt();

        int[] arr = new int[3];
        arr[0] = i1;

        int temp = i1 > i2 ? i1 : i2;
        int max = temp > i3 ? temp : i3;

        System.out.println("最大值：" + max);

    }
}
