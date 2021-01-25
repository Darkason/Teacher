package com.day7.test11;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test2 {
    public static void main(String[] args) {
        a(new Swim() {
            @Override
            public void swimming(String name) {
                System.out.println(name + "花样式游泳");
            }
        }, "");

//        a((String abc) -> {
//            System.out.println(abc + "花样式游泳");
//        });

        a((n) -> {
            System.out.println(n + "花样式游泳");
        }, "马云");

    }

    public static void a(Swim swim, String name) {
        swim.swimming(name);
    }

}
