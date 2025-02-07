package org.example.tregulov.collection.listiterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(2);
        numbers.add(354);

        ListIterator<Integer> it = numbers.listIterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num == 2) {
                it.remove();
                it.add(20);
            }
        }
        System.out.println(numbers);
    }
}
