package com.houoy.framework.base.zookeeper.test.jvmTest.jvmMemery;

/**
 * HOTSPOT
 * JDK1.2-JDK1.6
 * 常量都在永久带
 * JDK1.7
 * 常量在java heap中
 * JDK1.8
 * 常量在metadata元数据 层
 */
public class RuntimeConstantsPoolChange {
    public static void main(String[] args) {

        String s1 = new StringBuilder("nihao").append("zhaozhao").toString();
        String s2 = new StringBuilder("ja").append("va").toString();

        System.out.println(s1.intern() == s1);
        System.out.println(s2.intern() == s2);

        //jdk1.7以后输出结果为
        //true
        //false



    }
}
