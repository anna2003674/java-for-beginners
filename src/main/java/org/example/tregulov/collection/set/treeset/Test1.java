package org.example.tregulov.collection.set.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(8);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(10);
        // treeSet.add(null); // не хранит null
        treeSet.remove(1);
        System.out.println(treeSet.contains(4));
        System.out.println(treeSet);
    }
}