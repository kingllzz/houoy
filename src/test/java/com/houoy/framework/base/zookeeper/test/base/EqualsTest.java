package com.houoy.framework.base.zookeeper.test.base;

import com.houoy.framework.base.zookeeper.test.base.clone.Person;

/**
 * Created by Administrator on 2017-03-02.
 */
public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person a = new Person(11,"a");
        Person b = new Person(11,"a");
        Person c = b;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(c.equals(b));
    }


}

