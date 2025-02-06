package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;

/**
 * Создайте два ArrayList<Integer>, добавьте в них несколько чисел.
 * Объедините их в третий список.
 */
public class Test5 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(45);
        list1.add(676);

        list2.add(77);
        list2.add(35435);

        ArrayList<Integer> myList = new ArrayList<>(list1);
        myList.addAll(list2);
        System.out.println("Объединенный список: " + myList);
    }
}
