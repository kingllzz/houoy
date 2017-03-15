package com.houoy.framework.base.zookeeper.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by andyzhao on 2017-03-10
 */
public class LinkedListTest {
    public static void main(String[] args) throws Throwable {
        aaaaaa();
    }

    public static void aaaaaa() {
        long m = 1000000;
        ArrayList<String> bb = new ArrayList();
        long bbt = System.currentTimeMillis();
        for(int i=0 ;i<m;i++){
            bb.add("n12iddubi"+i);
        }
        long bet = System.currentTimeMillis();
       // System.out.println(bet-bbt);

        LinkedList<String> aa = new LinkedList();
        long bt = System.currentTimeMillis();
        for(int i=0 ;i<m;i++){
            aa.add("hj"+i);
        }
        long et = System.currentTimeMillis();
       // System.out.println(et-bt);

        long bbt1 = System.currentTimeMillis();
        for(int i=0 ;i<1000;i++){
            bb.add(i,"n12iddubi"+i);
        }
        long bbt2 = System.currentTimeMillis();
        System.out.println(bbt2-bbt1);

        long ebt1 = System.currentTimeMillis();
        for(int i=0 ;i<1000;i++){
            aa.add(i,"n12iddubi"+i);
        }
        long ebt2 = System.currentTimeMillis();
        System.out.println(ebt2-ebt1);


//        Iterator aai = aa.iterator();
//        while (aai.hasNext()) {
//            System.out.println(aai.next() + "   " + aa.size());
//            //System.out.println( aai.next()+"   "+aa.size());
//            aai.remove();
//        }
//        //  aai.remove();
//
//        System.out.println(aa.size());
    }

    public static void lamada() {
        List<String> aa = new LinkedList();
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
            System.out.println(aai.next() + "   " + aa.size());
            //System.out.println( aai.next()+"   "+aa.size());
            aai.remove();
        }
        //  aai.remove();

        System.out.println(aa.size());

    }
}
