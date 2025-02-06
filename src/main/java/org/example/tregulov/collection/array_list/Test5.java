package org.example.tregulov.collection.array_list;

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Zaur");
        list1.add("Ivan");
        list1.add("Mariya");
        list1.add("Kolya");
        list1.add("Elena");
        System.out.println(list1);
        List<String> myList = list1.subList(1, 4);
        System.out.println(myList);
        myList.add("Fedor");
        System.out.println(myList);
        System.out.println(list1);
        Object[] array = list1.toArray();
        String[] array2 = list1.toArray(new String[5]);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ivan");
        list2.add("Mariya");
        list2.add("Igor");
        System.out.println(list2);

        // list1.removeAll(list2); // из list1 удалятся все элементы, которые есть в list2
        // System.out.println(list1);

        // list1.retainAll(list2); // оставит в list1 те элементы, которые есть в list2
        // System.out.println(list1);

        boolean result = list1.containsAll(list2);
        System.out.println(result);

        List<Integer> list4 = List.of(3, 8, 13); // неизменяемый список
        System.out.println(list4);
        // list4.add(100); // UnsupportedOperationException

        List<Integer> list5 = List.copyOf(list4);
        System.out.println(list5);
    }
}