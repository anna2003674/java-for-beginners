package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Создайте ArrayList<Integer> с повторяющимися элементами.
 * Напишите метод, который удаляет дубликаты.
 */
public class Test6 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(200);
        list.add(45);
        list.add(200);
        list.add(243);
        list.add(5655);
        list.add(10);
        System.out.println("До удаления дубликатов: " + list);
        list = removingDuplicates(list);
        System.out.println("После удаления дубликатов: " + list);
    }

    private static ArrayList<Integer> removingDuplicates(ArrayList<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }
}
