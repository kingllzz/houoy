package com.houoy.framework.base.zookeeper.test.jvmTest;

/**
 * Created by Administrator on 2017-02-18.
 */
public class OveridingTest {
    class A extends OveridingTest{
        //@重写的方法的安全级别不能比父类的安全级别高
//        @Override
//        private void abc(int a){
//            System.out.println("overridingtest A");
//        }

        @Override
        public void abc(int a){
            System.out.println("overridingtest A");
        }
    }

    public void abc(int a){
        System.out.println("overridingtest");
    }
}
