package com.houoy.framework.base.zookeeper.test.collection.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2017-03-13.
 */
public class HashtableTEST {
    public static void main(String[] args) throws Throwable {
        Map<String, String> map = new Hashtable();
        map.put("a", "a");
        map.put("a", "a");
        map.put("a", "a");
        map.put("a", "a");
        int size = map.keySet().size();
        System.out.println(size);
    }
}
