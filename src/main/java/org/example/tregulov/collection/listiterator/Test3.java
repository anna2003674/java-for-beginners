package org.example.tregulov.collection.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test3 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        ListIterator<String> it = names.listIterator();

        while (it.hasNext()) {
            String name = it.next();
            if (name.equals("Bob")) {
                it.set("Robert");
            }
        }
        System.out.println(names);
    }
}