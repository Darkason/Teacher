package com.day6.test2;

/**
 * @auth admin
 * @date 2021/1/11
 * @Description
 */
public class Teacher {

    private String name1 = "private";

    String name2 = "";

    protected String name3 = "protected";

    public String name4 = "public";

    public void a() {
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }

}
