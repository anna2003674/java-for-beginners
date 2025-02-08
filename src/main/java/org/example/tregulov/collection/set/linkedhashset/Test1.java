package org.example.tregulov.collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class Test1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(53464567);
        linkedHashSet.add(54);
        linkedHashSet.add(556);
        linkedHashSet.add(58789);
        linkedHashSet.add(null);
        linkedHashSet.remove(5);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.contains(5));
    }
}