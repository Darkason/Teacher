package com.day7.test9;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Body {

    boolean b = true;

    public void walk() {
        System.out.println("散步");
    }

    public class Heart {

        public void jump() {
            if (b) {
                System.out.println("跳动");
            } else {
                System.out.println("不跳动");
            }
        }

    }

}
