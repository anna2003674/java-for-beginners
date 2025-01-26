package org.example.collections.hashmap.linkedhashmap_treemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // внутри не гарантируется никакого порядка
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(); // гарантируется порядок добалвения пар ключ/значние
        Map<Integer, String> treeMap = new TreeMap<>(); // пары ключ/значение хранятся в отсортированном виде по ключу

        testMap(hashMap);
        System.out.println("----");
        testMap(linkedHashMap);
        System.out.println("----");
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(39, "Bob");
        map.put(12, "Mike");
        map.put(78, "Tom");
        map.put(0, "Tim");
        map.put(1500, "Lewis");
        map.put(7, "Bob");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
