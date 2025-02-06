package org.example.tregulov.collection.array_list;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add("Anna");
        list1.add("Alex");
        System.out.println(list1);

        for (String s : list1) {
            System.out.print(s + " ");
        }
        System.out.println();

        list1.add(1, "Misha");
        System.out.println(list1);

        System.out.println(list1.get(2));

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();

        list1.set(0, "Dasha");
        System.out.println(list1);

        list1.remove(0);
        System.out.println(list1);

        list1.remove("Alex");
        System.out.println(list1);
    }
}
