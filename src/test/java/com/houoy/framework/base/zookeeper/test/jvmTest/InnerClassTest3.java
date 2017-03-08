package com.houoy.framework.base.zookeeper.test.jvmTest;

/**
 * 匿名内部类
 */
public class InnerClassTest3 {
    static Object staticAnClass = new Object(){};
    static Object staticBlockAnClass;
    static {
        staticBlockAnClass  = new Object(){};
    }

    Object anClass = new Object(){};
    Object blockAnClass;
    {
        blockAnClass = new Object(){};
    }
    public static void main(String[] args) {
        InnerClassTest3 functionClass = new InnerClassTest3(){};
        System.out.println(staticAnClass.getClass());
        System.out.println(staticBlockAnClass.getClass());

        InnerClassTest3 test = new InnerClassTest3();
        System.out.println(test.anClass.getClass());
        System.out.println(test.blockAnClass.getClass());
        System.out.println(functionClass.getClass());
    }

}