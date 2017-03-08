package com.houoy.framework.base.zookeeper.test.thread;

/**
 * Created by Administrator on 2017-02-23.
 */
public class MyThreadd {

    public static void main(String[] args) {
        MyThread[] myThreads = new MyThread[100];
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i] = new MyThread();
        }

        for (MyThread myThread : myThreads) {
            if (null != myThread) {
                myThread.start();
            }
        }
    }
}

class MyThread extends Thread {
    volatile public static int COUNT;

    //private static synchronized void addCount() {
    private static void addCount() {
        for (int i = 0; i < 100; i++) {
            COUNT++;
        }
        System.out.println("count = " + COUNT);
    }

    @Override
    public void run() {
        addCount();
    }
}