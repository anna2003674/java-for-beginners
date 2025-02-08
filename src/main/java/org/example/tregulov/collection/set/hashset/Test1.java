package org.example.tregulov.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Zaur");
        set1.add("Anna");
        set1.add("Alex");
        set1.add("Misha");
        set1.add(null);
        System.out.println(set1);

        for (String s : set1) {
            System.out.println(s);
        }

        set1.remove("Zaur");
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println(set1.isEmpty());
        System.out.println(set1.contains("Anna"));
    }
}