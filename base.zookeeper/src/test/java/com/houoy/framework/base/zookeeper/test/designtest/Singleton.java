package com.houoy.framework.base.zookeeper.test.designtest;

//饿汉式单例类.在第一次调用的时候实例化自己
public class Singleton {
    private Singleton() {}
    private static Singleton single= new Singleton();
    //静态工厂方法
    public static Singleton getInstance() {
        return single;
    }
}
