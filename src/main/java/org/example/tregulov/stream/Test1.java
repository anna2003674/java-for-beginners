package org.example.tregulov.stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("Dasha");
        list.add("Alex");
        list.add("Oleg");
        list.add("Misha");
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Anna");
        set.add("Dasha");
        set.add("Alex");
        set.add("Oleg");
        set.add("Misha");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(set2);

        List<Integer> list3 = set.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(list3);
    }
}