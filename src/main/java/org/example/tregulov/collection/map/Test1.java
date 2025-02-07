package org.example.tregulov.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3568, "Ivan Ivanov");
        map1.put(6578, "Mariya Sidorova");
        map1.put(15879, "Nikolay Petrov");
        System.out.println(map1);
        map1.putIfAbsent(1000, "Anna Ter");
        System.out.println(map1);
        System.out.println(map1.get(6578));
        map1.remove(15879);
        System.out.println(map1);
        System.out.println(map1.containsValue("Ivan Ivanov"));
        System.out.println(map1.containsKey(500));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}