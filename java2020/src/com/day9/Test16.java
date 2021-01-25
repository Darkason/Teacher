package com.day9;

import java.util.Calendar;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test16 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.YEAR, 2022);
//        calendar.set(Calendar.MONTH, 7);

        calendar.add(Calendar.YEAR,10);

        System.out.println(calendar.getTime());

        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(2) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));

    }
}
