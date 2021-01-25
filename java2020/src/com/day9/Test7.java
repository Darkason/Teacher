package com.day9;

import java.util.Random;
import java.util.Scanner;

public class Test7 extends Object{

    public static void main(String[] args) {
        a();
    }

    // 游戏开始时，会随机生成一个1-100之间的整数 number 。
    // 玩家猜测一个数字 guessNumber ，会与 number 作比较，系统提示大了或者小了，
    // 直到玩家猜中，游戏结束。

    public static void b() {
        Random random = new Random();
        int a = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入数字：");
            int guessNum = scanner.nextInt();
            if (guessNum > a) {
                System.out.println("大了");
            } else if (guessNum < a) {
                System.out.println("小了");
            } else {
                System.out.println("猜中了，游戏结束");
                System.out.println(a);
                break;
            }
        }
    }

    public static void a() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // [5-8)  [0-3）+5
            System.out.println(random.nextInt(8-5)+5);
        }
    }

}
