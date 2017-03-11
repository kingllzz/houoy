package com.houoy.framework.base.zookeeper.test.Generic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-03-09.
 */
public class Generic {
    public static void main(String[] args){
        List<? extends A> list1 = new ArrayList<A>();
        //list1.add(new A()); //错误，编译器无法确定List所持有的类型，所以无法安全的向其中添加对象
        A a = list1.get(0);
        List<? extends A> list2 = new ArrayList<B>();
        List<? super B> list3 = new ArrayList<B>();
        list3.add(new B());
        list3.add(new D());
        //想要正确，必须向下转型，但是向下转型是不安全的，非常容易出错
//          B b = list3.get(0); //编译器无法确定get返回的对象类型是B,还是B的父类或 Object.
        List<? super B> list4 = new ArrayList<A>();

        C ass = new C();

        E<String> ee = new E();
    }
}

class A{}
class B extends A{}
class D extends B{}
class C<T extends A>{}
class E<T extends Comparable>{}
class F<T , B>{}