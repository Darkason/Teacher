package com.day9;

import java.util.Scanner;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        //产生阻塞
//        int i = scanner.nextInt();

//        float f = scanner.nextFloat();

//        boolean b = scanner.nextBoolean();

        //只能是字符串，遇到空格或者特殊字符则结束
//        String str = scanner.next();
        String str = scanner.nextLine();

        System.out.println("输入的值：" + str);

    }
}
