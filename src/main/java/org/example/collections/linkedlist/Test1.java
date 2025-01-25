package org.example.collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        //measureTime(list1);
        //measureTime(list2);
        // если нужно добавлять элементы в самый конец списка, то лучше использовать arraylist
        // если нужно считать элемент по индексу, то лучше использовать arraylist (он будет быстрее)
        // если необходимо вставить элемент в середину или начало списка, то лучше использовать linkedlist
        // если необходимо удалить элемент из списка, то лучше использовать linkedlist
        measureTime2(list1);
        measureTime2(list2);
    }

    private static void measureTime(List<Integer> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void measureTime2(List<Integer> list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
