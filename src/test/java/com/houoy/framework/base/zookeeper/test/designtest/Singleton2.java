package com.houoy.framework.base.zookeeper.test.designtest;

//懒汉式单例类.在第一次调用的时候实例化自己
public class  Singleton2 {
    private Singleton2() {}
    private static volatile Singleton2 single=null;
    //静态工厂方法
    public static Singleton2 getInstance() {
        if (single == null) {
            synchronized (Singleton2.class){
                if(single==null){
                    single = new Singleton2();
                }
            }

        }
        return single;
    }
}
