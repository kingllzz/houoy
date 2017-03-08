package com.houoy.framework.base.zookeeper.test.jvmTest;

/**
 * 成员内部类
 */
public class InnerClassTest2 {
    static class StaticInner{}
    class Inner{}
    public static void main(String[] args) {
        StaticInner si = new StaticInner();
        Inner in = new InnerClassTest2().new Inner();
        System.out.println(si.getClass());
        System.out.println(in.getClass());
    }

}