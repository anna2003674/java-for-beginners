package org.example.tregulov.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Wildcards
 */
public class Test3 {
    public static void main(String[] args) {
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Anna");
        list2.add("Alex");
        showListInfo(list2);

        ArrayList<Double> list3 = new ArrayList<>();
        list3.add(3.14);
        list3.add(3.15);
        list3.add(3.16);
        System.out.println(sum(list3));

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(6);
        list4.add(12);
        System.out.println(sum(list4));

    }

    static void showListInfo(List<?> list) {
        System.out.println(list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}