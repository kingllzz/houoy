package com.houoy.framework.base.zookeeper.test.thread;

/**
 * Created by Administrator on 2017-02-17.
 */
public class Test1 {
    private static int ba = 0;

    public synchronized void prba(int type) throws InterruptedException {
        synchronized (Test1.class){
            System.out.println("开始" + type);
            switch (type) {
                case 0:
                    ba = 200;
                    Thread.sleep(2000);
                    System.out.println(type + "   " + ba + Thread.currentThread().getName());
                    break;
                case 1:
                    ba = 400;
                    System.out.println(type + "   " + ba + Thread.currentThread().getName());
                    break;
                default:
                    break;
            }
        }


    }

    public static void main(String[] args) {
        final Test1 test1 = new Test1();
        final Test1 test2 = new Test1();

//        CountDownLatch
        Thread threads = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    test1.prba(0);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    test2.prba(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threads.start();
        thread2.start();

    }
}
