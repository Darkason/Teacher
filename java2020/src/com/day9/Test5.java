package com.day9;

import java.util.Scanner;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test5 {

    public static void main(String[] args) {
        //可以一直输入，直到end结束游戏
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入：");
            String str = scanner.next();
            if (str.equals("end")) {
                System.out.println("游戏结束!");
                break;
            }
            System.out.println("输入的值：" + str);
        }

    }
}
