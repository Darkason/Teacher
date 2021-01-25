package com.day8.test;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class Test {

    public static void main(String[] args) {

        try {
            reg("adaamin");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("注册失败");
            System.out.println("跳转到注册页面");
        }

        System.out.println("跳转到登录页面");

    }

    public static void reg(String name) {
        if (name == "admin") {
            throw new RegisterException("账号已经注册");
        }
        System.out.println("注册成功");
    }

}
