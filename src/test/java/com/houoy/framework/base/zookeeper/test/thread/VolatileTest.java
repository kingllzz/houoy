package com.houoy.framework.base.zookeeper.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by andyzhao on 2017-02-23.
 */
public class VolatileTest extends Thread {
    private int running = 0;

    public void setRunning(int running) {
        this.running = running;
    }

    public void run() {
        System.out.println("into running");
        while (this.running==0) {
//            try {
//                Thread.sleep(500);
//                System.out.println("running");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println("out running");
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTest vt = new VolatileTest();

        vt.start();
       // Thread.sleep(3000);
        vt.setRunning(1);
        System.out.println("set false");
        //Thread.sleep(1000);
        System.out.println(vt.running);
    }

    
}
