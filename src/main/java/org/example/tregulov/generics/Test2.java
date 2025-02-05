package org.example.tregulov.generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(388);

        List<String> list2 = new ArrayList<>();
        list2.add("Anna");
        list2.add("Dasha");
        list2.add("Masha");

        for (Object o : list2) {
            System.out.println(o + " " + ((String) o).length());
        }
    }
}
