package com.itxxx.domain;

import java.io.Serializable;

public class Hello implements Serializable {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello"+i);
        }
        System.out.println("helloWorld1");
        System.out.println("helloWorld2");
        System.out.println("helloWorld3");
        System.out.println("helloWorld4");
        System.out.println("helloWorld5");
        System.out.println("helloWorld6");
        System.out.println("helloWorld7");
    }
    public void test(){
        System.out.println("test");
    }
}
