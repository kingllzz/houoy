package com.houoy.framework.base.zookeeper.test.thread;

/**
 * Created by Administrator on 2017-02-23.
 */
public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            PrintString mPrintString = new PrintString();
            Thread mThread = new Thread(mPrintString);
            mThread.start();
            Thread.sleep(1000);
            mPrintString.setContinuePrint(false);//在-server模式下，这个操作修改的是公共堆栈中的值，而线程的私有堆栈并没有修改
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class PrintString implements Runnable {

    private boolean isContinuePrint = true;

    public boolean isContinuePrint() {
        return isContinuePrint;
    }

    public void setContinuePrint(boolean isContinuePrint) {
        this.isContinuePrint = isContinuePrint;
    }

    public void printStringMethod() {
        try {
            while (isContinuePrint) {
                System.out.println("run printStringMethod threadName = " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}