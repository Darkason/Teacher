package com.day8.test;

/**
 * @auth admin
 * @date 2021/1/12
 * @Description
 */
public class RegisterException extends RuntimeException {

    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
