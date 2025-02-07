package org.example.tregulov.collection.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        ListIterator<String> listIterator = names.listIterator();

        System.out.println("Прямой обход:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("\nОбратный обход:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}