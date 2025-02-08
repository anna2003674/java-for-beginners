package org.example.tregulov.collection.linkedhashmap;

import java.util.LinkedHashMap;

public class Test1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(45.5, "Anna");
        linkedHashMap.put(77.6, "Alex");
        linkedHashMap.put(74.9, "Masha");
        linkedHashMap.put(38.2, "Oleg");
        System.out.println(linkedHashMap);
    }
}