package com.houoy.framework.base.zookeeper.test.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017-03-11.
 */
public class LinkCompareArray {
    public static void main(String[] args) throws Throwable {
        //compareAdd();
        //compareRemove();
        compareSet();
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
    }

    public static void compareGet() {
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

        //get性能很低
        long bbt1 = System.currentTimeMillis();
        for(int i=0 ;i<10000;i++){
            bb.get(i);
        }
        long bbt2 = System.currentTimeMillis();
        System.out.println(bbt2-bbt1);

        long ebt1 = System.currentTimeMillis();
        for(int i=0 ;i<10000;i++){
            aa.get(i);
        }
        long ebt2 = System.currentTimeMillis();
        System.out.println(ebt2-ebt1);
    }

    public static void compareRemove() {
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

        //删除性能Link高很多
        long bbt1 = System.currentTimeMillis();
        for(int i=0 ;i<10000;i++){
            bb.remove(i);
        }
        long bbt2 = System.currentTimeMillis();
        System.out.println(bbt2-bbt1);

        long ebt1 = System.currentTimeMillis();
        for(int i=0 ;i<10000;i++){
            aa.remove(i);
        }
        long ebt2 = System.currentTimeMillis();
        System.out.println(ebt2-ebt1);
    }

    public static void compareSet() {
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

        //set性能array高很多
        long bbt1 = System.currentTimeMillis();
        for(int i=0 ;i<10000;i++){
            bb.set(i,"aa"+i);
        }
        long bbt2 = System.currentTimeMillis();
        System.out.println(bbt2-bbt1);

        long ebt1 = System.currentTimeMillis();
        for(int i=0 ;i<10000;i++){
            aa.set(i,"bb"+i);
        }
        long ebt2 = System.currentTimeMillis();
        System.out.println(ebt2-ebt1);
    }

}
