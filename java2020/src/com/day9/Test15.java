package com.day9;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auth admin
 * @date 2021/1/13
 * @Description
 */
public class Test15 {

    public static void main(String[] args) throws Exception{
        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());

//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss:sss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd");
        String format = sdf.format(date);
//        System.out.println(format);

        String str="20210113 18:01:03";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd HH:mm:ss");
        Date date1 = sdf2.parse(str);
        System.out.println(date1);
    }
}
