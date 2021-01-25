package com.day6;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Student {

    static String name;
    int age;

    public void run() {
        System.out.println(this.name);
        System.out.println(age);
        eat();

    }

    public static void eat() {
        study();

        Student s = new Student();
        s.run();
//        run();

        System.out.println(Student.name);
//        System.out.println(this.name);
        System.out.println(s.age);
    }

    public static void study() {

    }

}
