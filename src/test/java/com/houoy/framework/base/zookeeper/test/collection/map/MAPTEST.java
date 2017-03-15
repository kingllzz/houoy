package com.houoy.framework.base.zookeeper.test.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017-03-09.
 */
public class MAPTEST {

    public static void main(String[] args) throws Throwable {
        Map<String, String> map = new HashMap();
        map.put("a", "a");
        map.put("a", "a");
        map.put("a", "a");
        map.put("a", "a");
        map.put(null,"adf");
        int size = map.keySet().size();
        System.out.println(size);
    }
}
