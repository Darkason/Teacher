package com.day16.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @auth admin
 * @date 2021/1/22
 * @Description
 */
public class Test3 {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("d:\\1.png");
            String path = "e:\\" + System.currentTimeMillis() + ".png";
            fos = new FileOutputStream(path);
            byte[] b = new byte[64];
            int len;
            while (true) {
                len = fis.read(b);
                if (len == -1) {
                    break;
                }
                fos.write(b, 0, len);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
