package com.houoy.framework.base.zookeeper.test;

import org.apache.log4j.Logger;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class AbstractZooKeeper implements Watcher {
    protected Logger logger = Logger.getLogger(AbstractZooKeeper.class);

    //缓存时间
    private static final int SESSION_TIME  = 2000;
    protected ZooKeeper zooKeeper;
    protected CountDownLatch countDownLatch=new CountDownLatch(1);

    //连接zk集群
    public void connect(String hosts) throws IOException, InterruptedException{
        zooKeeper = new ZooKeeper(hosts,SESSION_TIME,this);
        countDownLatch.await();
        //Class
    }

    //zk处理
    public void process(WatchedEvent event) {
        if(event.getState()== Event.KeeperState.SyncConnected){
            countDownLatch.countDown();
        }
    }

    //关闭集群
    public void close() throws InterruptedException{
        zooKeeper.close();
    }






}




