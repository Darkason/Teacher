package com.day10;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @auth admin
 * @date 2021/1/14
 * @Description
 */
public class Test5 {

    public static void main(String[] args) {
        ArrayList<String> cardList = new ArrayList<>();

        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();

        colors.add("♠");
        colors.add("♥");
        colors.add("♣");
        colors.add("♦");

        for (int i = 2; i <= 10; i++) {
            //numbers.add(String.valueOf(i));
            numbers.add(i + "");
        }
        numbers.add("A");
        numbers.add("J");
        numbers.add("Q");
        numbers.add("K");

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                cardList.add(colors.get(j) + numbers.get(i));
            }
        }

        cardList.add("大王");
        cardList.add("小王");

        Collections.shuffle(cardList);

        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> diPaiList = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            if (i > 50) {
                // 51 52 53
                diPaiList.add(cardList.get(i));
            } else {
                if (i % 3 == 0) {
                    play1.add(cardList.get(i));
                } else if (i % 3 == 1) {
                    play2.add(cardList.get(i));
                } else {
                    play3.add(cardList.get(i));
                }
            }
        }

        System.out.println("西门庆：" + play1);
        System.out.println("潘金莲：" + play2);
        System.out.println("大郎：" + play3);
        System.out.println("底牌：" + diPaiList);

    }
}
