package com.houoy.framework.base.zookeeper.test.base;

import com.houoy.framework.base.zookeeper.test.base.clone.Person;

/**
 * Created by Administrator on 2017-03-02.
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person a = new Person();
        Person b = (Person) a.clone();
        System.out.println(a);
        System.out.println(b);
    }


}

