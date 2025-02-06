package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;

/**
 * Создайте ArrayList<String>, содержащий 5 слов. Поменяйте местами первый и последний элементы.
 */
public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Grushka");
        list.add("Grape");
        list.add("Plum");

        int lastIndex = list.size() - 1;
        String temp = list.get(0);
        list.set(0, list.get(lastIndex));
        list.set(lastIndex, temp);
        System.out.println("После перестановки: " + list);
    }
}
