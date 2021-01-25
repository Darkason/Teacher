package com.day7.test9;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test2 {

    public static void main(String[] args) {
        Body body = new Body();
        body.b = false;
        Body.Heart heart = body.new Heart();
        heart.jump();
    }

}
