package org.example.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple"); // добавление элементов в конец динамического массива
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list);
        list.add(1, "Pear"); // добавление элемента на индекс
        System.out.println(list);
        list.remove("Pear"); // удаление элемента
        list.remove(1); // удаление элемента по индексу
        System.out.println(list);
        System.out.println("Элемент по индексу 0: " + list.get(0));
        list.set(0, "Banana"); // изменение элемента по индексу
        System.out.println(list);
        if (list.contains("Banana")) {
            System.out.println("Динамический массив содержит элемент Banana");
        }
        list.clear(); // очиста списка
        list.size(); // размер списка
    }
}
