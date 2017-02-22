package com.houoy.framework.base.zookeeper.test.jvmTest;

/**
 * 局部内部类
 */
public class InnerClassTest1 {
    public static void main(String[] args) {
        functionA();
        functionB();
    }

    public static void functionA() {
        class Inner {};
        System.out.println(new Inner().getClass());
    }

    public static void functionB() {
        class Inner {};
        System.out.println(new Inner().getClass());
    }

}