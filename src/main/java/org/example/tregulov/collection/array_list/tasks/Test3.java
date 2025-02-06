package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;

/**
 * Напишите метод, который находит максимальное и минимальное число в ArrayList<Integer>.
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(4);
        list.add(40000);
        list.add(354);
        list.add(665);
        minAndMaxElements(list);
    }

    private static void minAndMaxElements(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            System.out.println("Список пуст!");
            return;
        }
        Integer minElement = arr.get(0);
        Integer maxElement = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > maxElement) {
                maxElement = arr.get(i);
            }
            if (arr.get(i) < minElement) {
                minElement = arr.get(i);
            }
        }
        System.out.println("Минимальный элемент: " + minElement);
        System.out.println("Максимальный элемент: " + maxElement);
    }
}