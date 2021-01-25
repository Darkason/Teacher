package com.day10.test2;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @auth admin
 * @date 2021/1/15
 * @Description
 */
public class Test {

    public static void main(String[] args) {
        ArrayList<String> cardList = new ArrayList<>();
        ArrayList<String> types = new ArrayList<>();
        types.add("万");
        types.add("饼");
        types.add("条");
        String[] strs = {"东", "南", "西", "北", "白板", "发财", "红中"};

        for (int a = 0; a < 4; a++) {
            for (int i = 1; i <= 9; i++) {
                for (int j = 0; j < types.size(); j++) {
                    cardList.add(types.get(j) + i);
                }
            }

            for (int i = 0; i < strs.length; i++) {
                cardList.add(strs[i]);
            }

        }

        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> play4 = new ArrayList<>();
        ArrayList<String> diPaiList = new ArrayList<>();

        System.out.println(cardList);
        Collections.shuffle(cardList);

        for (int i = 0; i < cardList.size(); i++) {
            if (i < 48) {
                if (i / 4 % 4 == 0) {
                    play1.add(cardList.get(i));
                } else if (i / 4 % 4 == 1) {
                    play2.add(cardList.get(i));
                } else if (i / 4 % 4 == 2) {
                    play3.add(cardList.get(i));
                } else if (i / 4 % 4 == 3) {
                    play4.add(cardList.get(i));
                }
            } else {
                diPaiList.add(cardList.get(i));
            }
        }

        System.out.println("西门庆：" + play1);
        System.out.println("潘金莲：" + play2);
        System.out.println("大郎：" + play3);
        System.out.println("武松：" + play4);
        System.out.println("底牌：" + diPaiList);

    }


}
