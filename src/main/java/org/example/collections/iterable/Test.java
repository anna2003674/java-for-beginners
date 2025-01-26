package org.example.collections.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(29);
        list.add(55);
        list.add(25);

        // Before Java 5
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("---");

        // Java 5
        for (int x : list) {
            System.out.println(x);
        }
    }
}
