package com.houoy.framework.base.zookeeper.test.collection.map;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by andyzhao on 2017-03-13.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) throws Throwable {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("语文", 1);
        map.put("数学", 2);
        map.put("英语", 3);
        map.put("历史", 4);
        map.put("政治", 5);
        map.put("地理", 6);
        map.put("生物", 7);
        map.put("化学", 8);
        int size = map.keySet().size();
        System.out.println(size);
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        LinkedHashMap<String, Integer> lmap = new LinkedHashMap<String, Integer>();
        lmap.put("语文", 1);
        lmap.put("数学", 2);
        lmap.put("英语", 3);
        lmap.put("历史", 4);
        lmap.put("政治", 5);
        lmap.put("地理", 6);
        lmap.put("生物", 7);
        lmap.put("化学", 8);
        for(Map.Entry<String, Integer> entry : lmap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
