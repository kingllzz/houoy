package com.houoy.framework.base.zookeeper.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017-03-10.
 */
public class LinkedListTest {
    public static void main(String[] args) throws Throwable {
        lamada();
    }

    public static void lamada(){
        List<String> aa = new LinkedList<>();
        aa.add("a");
        aa.add("7");
        aa.add("5");
        aa.add("6");
        aa.add("8");
        aa.add("1");
        aa.add("3");
        aa.add("4");
        aa.add("5");
        Iterator aai = aa.iterator();
        while (aai.hasNext()) {
            System.out.println( aai.next()+"   "+aa.size());
            //System.out.println( aai.next()+"   "+aa.size());
            aai.remove();
        }
        //  aai.remove();

        System.out.println(aa.size());

    }
}
