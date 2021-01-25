package com.day16.test6;

import org.junit.*;
import org.junit.Test;

/**
 * @auth admin
 * @date 2021/1/23
 * @Description
 */
public class Demo2 {

    @Test
    public void a() {
        System.out.println("hello");
    }

    @Test
    public void b() {
        System.out.println("world");
    }

    @Before
    public void myBefore() {
        System.out.println("方法前");
    }

    @After
    public void myAfter() {
        System.out.println("方法后");
    }

    @BeforeClass
    public static void myStaticBefore() {
        System.out.println("静态方法--方法前");
    }

    @AfterClass
    public static void myStaticAfter() {
        System.out.println("静态方法--方法后");
    }

}
