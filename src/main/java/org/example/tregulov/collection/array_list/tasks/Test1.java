package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;

/**
 * Создайте ArrayList из 5 строк. Выведите его элементы на экран.
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Anna");
        list.add("Dasha");
        list.add("Masha");
        list.add("Alex");
        list.add("Misha");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
