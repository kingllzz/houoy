package com.houoy.framework.base.zookeeper.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017-03-11.
 */
public class SortTest {
    public static void main(String[] args) throws Throwable {
        compareAdd();
    }

    public static void compareAdd() {
        //初始化效率相差不多
        long m = 1000000;
        ArrayList<String> bb = new ArrayList();
        long bbt = System.currentTimeMillis();
        for(int i=0 ;i<m;i++){
            bb.add("n12iddubi"+i);
        }
        long bet = System.currentTimeMillis();
         System.out.println(bet-bbt);

        LinkedList<String> aa = new LinkedList();
        long bt = System.currentTimeMillis();
        for(int i=0 ;i<m;i++){
            aa.add("hj"+i);
        }
        long et = System.currentTimeMillis();
         System.out.println(et-bt);


        //插入性能Link高很多
        long bbt1 = System.currentTimeMillis();
        Collections.sort(bb, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        long bbt2 = System.currentTimeMillis();
        System.out.println(bbt2-bbt1);

        long ebt1 = System.currentTimeMillis();
        Collections.sort(aa, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        long ebt2 = System.currentTimeMillis();
        System.out.println(ebt2-ebt1);
    }



}
