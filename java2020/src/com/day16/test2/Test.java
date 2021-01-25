package com.day16.test2;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @auth admin
 * @date 2021/1/22
 * @Description
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //字节输出流
        FileOutputStream fos = new FileOutputStream("d:\\a.txt");
        fos.write('a');
        fos.write("\r\n".getBytes());
        fos.write('b');
        // 关闭资源
        fos.close();

    }
}
