package com.day6;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Test {

    public static void main(String[] args) {

        //初始化对象，实例化对象
        Student student = new Student();
        int age = student.age;
        String name = student.name;

        student.eat();

        // 类名.属性名
        String name2 = Student.name;
//        String age2 = Student.age;

        Student.eat();

        a();
        Test.a();

        Student.eat();
    }

    public static void a(){

    }
}
