package com.houoy.framework.base.zookeeper.test;

import org.apache.log4j.Logger;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.data.Stat;
import java.util.List;

public class ZooKeeperOperator extends AbstractZooKeeper {

    private static Logger logger = Logger.getLogger(ZooKeeperOperator.class);

    /**
     *
     *创建znode
     *
     */
    public void create(String path,byte[] data)throws KeeperException, InterruptedException{
        /**
         * 此处采用的是创建的是持久化节点：PERSISTENT表示不会因连接的断裂而删除节点
         * EPHEMERAL 表示The znode will be deleted upon the client's disconnect.
         */
        this.zooKeeper.create(path, data, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
    }
    /**
     *
     *获取节点信息
     *
     */
    public void getChild(String path) throws KeeperException, InterruptedException{
        try{
            List<String> list=this.zooKeeper.getChildren(path, false);
            if(list.isEmpty()){
                logger.info(path+"中没有节点");
                System.out.println(path+"中没有节点");
            }else{
                for(String child:list){
                    System.out.println("节点："+child);
                }
            }
        }catch (KeeperException.NoNodeException e) {
            // TODO: handle exception
            throw e;
        }
    }
    /**
     *
     *获取节点数据
     *
     */
    public byte[] getData(String path) throws KeeperException, InterruptedException {
        return  this.zooKeeper.getData(path, false,null);
    }

    /**
     * 修改节点数据
     */
    public Stat setDate(String path, byte[] data, int version) throws KeeperException, InterruptedException{
        return this.zooKeeper.setData(path, data, version);
    }

    /**
     * 删除节点
     */
    public void deleteNode(final String path,int version) throws InterruptedException, KeeperException{
        this.zooKeeper.delete(path, version);
    }

    public static void main(String[] args) {
        try {
            ZooKeeperOperator zkoperator = new ZooKeeperOperator();
            zkoperator.connect("192.168.0.111");

            //操作1：创建一个持久化节点
//            zkoperator.create("/test1", "zk".getBytes());
//            zkoperator.create("/test1/test11", "zk".getBytes());
//            zkoperator.create("/test1/test12", "zk".getBytes());

            //操作2：取出原有的节点
            byte[] b = zkoperator.getData("/test1");
            System.out.println(new String(b));

            //操作3：设置节点数据
            zkoperator.setDate("/test1", "zk1".getBytes(), 1);


            //操作4：删除节点操作
           // zkoperator.deleteNode("/test1/test12", 0);

            //获取子节点
            // zkoperator.getChild("/test1");

           // zkoperator.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}