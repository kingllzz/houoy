package com.houoy.framework.base.zookeeper.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017-03-09.
 */
public class ListTEST {

    public static void main(String[] args) throws Throwable {
        retainAll();
    }

    public static void removae() {
        List<String> list = new ArrayList<String>(){
            {
                System.out.println("begin");
                // 为list添加数据
                addAll(Arrays.asList("wangzhen456liupei123".split("")));
                add("1521"); // 纯数字数据
                add("wanghzen123"); // 数字+字符数据
                add("wangzhen"); // 纯字符串
            }
        };

        ListTEST dd = new ListTEST(){
            {

            }
        };
    }

    public static void remove() {
        ArrayList<String> aa = new ArrayList();
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
      //  aa.removeIf();
        //aa.remove();
      //  aa.retainAll():

                System.out.println(aa.size());
    }

    public static void retainAll() {
        List<String> list=new ArrayList<String>();

        list.add("第一个元素");  //向列表中添加数据

        list.add("第二个元素");  //向列表中添加数据

        list.add("第三个元素");  //向列表中添加数据

        List<String> list1=new ArrayList<String>();

        list1.add("第一个元素");  //向列表中添加数据

        list1.add("第三个元素");  //向列表中添加数据

        boolean ret=list.retainAll(list1);

        if(ret){

            System.out.println("元素被移除成功"+list.size()+list.get(0));

        }else{

            System.out.println("列表中不包含要移除的元素");

        }

    }

    public static void lamada() {
        List<String> aa = new ArrayList();
        aa.add("dd");
        aa.add("7");
        aa.add("5");
        aa.add(null);
        aa.add(1, "a");
//        aa.add("6");
//        aa.add("8");
//        aa.add("1");
//        aa.add("3");
//        aa.add("4");
//        aa.add("5");
        Iterator aai = aa.iterator();
        while (aai.hasNext()) {
            aai.forEachRemaining(s -> {
                System.out.println(s);
                System.out.println(aai.hasNext());
            });
            aai.hasNext();
        }
//        aai.forEachRemaining(s->{
//            System.out.println(s);
//        });

    }

    public static void EnsureCapacityTest() {
        final int N = 10000000;
        Object obj = new Object();

        //没用调用ensureCapacity()方法初始化ArrayList对象
        ArrayList list = new ArrayList();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= N; i++) {
            list.add(obj);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("没有调用ensureCapacity()方法所用时间：" + (endTime - startTime) + "ms");

        //调用ensureCapacity()方法初始化ArrayList对象
        list = new ArrayList();
        startTime = System.currentTimeMillis();
        list.ensureCapacity(N);//预先设置list的大小
        for (int i = 0; i <= N; i++) {
            list.add(obj);
        }
        endTime = System.currentTimeMillis();
        System.out.println("调用ensureCapacity()方法所用时间：" + (endTime - startTime) + "ms");


    }
}
