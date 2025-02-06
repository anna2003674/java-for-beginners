package org.example.tregulov.collection.array_list;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add("Ivan");
        list1.add("Mariya");
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");
        list2.addAll(1, list1);
        System.out.println(list2);
        // list2.clear();
        System.out.println(list1.indexOf("Ivan"));
        System.out.println(list2.size());
        System.out.println(list2.isEmpty());
        System.out.println(list2.contains("Ivan"));
        System.out.println(list2.toString());
    }
}
