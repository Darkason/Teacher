package com.day16.test5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @auth admin
 * @date 2021/1/23
 * @Description
 */
public class Test {

    public static void main(String[] args) throws Exception {
//        b();
        a();
    }

    public static void a() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\stu.txt"));
        User user = (User) ois.readObject();
        System.out.println(user);

        ois.close();
    }

    public static void b() throws Exception {
        User user = new User(1, "admin", 20);

        FileOutputStream fos = new FileOutputStream("d:\\stu.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.flush();
        oos.close();
    }

}
