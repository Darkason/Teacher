package com.day8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test3 {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("d:\\a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
