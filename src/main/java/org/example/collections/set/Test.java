package org.example.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>(); // не сохраняет порядка добавления элементов
        Set<String> linkedHashSet = new LinkedHashSet<>(); // сохраняет порядок добавления элементов
        Set<String> treeSet = new TreeSet<>(); // хранит элементы в отсортированном порядке

        hashSet.add("Mike");
        hashSet.add("Katy");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");

        for (String name : hashSet) {
            System.out.println(name);
        }
        System.out.println("----");

        linkedHashSet.add("Mike");
        linkedHashSet.add("Katy");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        for (String name : linkedHashSet) {
            System.out.println(name);
        }
        System.out.println("----");

        treeSet.add("Mike");
        treeSet.add("Katy");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");
        treeSet.add("Donald"); // мн-во не хранит дубликаты

        for (String name : treeSet) {
            System.out.println(name);
        }

        System.out.println(treeSet.contains("Anna"));
        System.out.println(treeSet.isEmpty());
    }
}
