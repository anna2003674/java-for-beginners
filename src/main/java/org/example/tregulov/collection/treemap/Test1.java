package org.example.tregulov.collection.treemap;

import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        TreeMap<Double, String> treeMap = new TreeMap<>();
        treeMap.put(45.5, "Anna");
        treeMap.put(77.6, "Alex");
        treeMap.put(74.9, "Masha");
        treeMap.put(38.2, "Oleg");
        System.out.println(treeMap);
        System.out.println(treeMap.get(74.9));
        treeMap.remove(74.9);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(7.3));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
    }
}