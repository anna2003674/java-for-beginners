package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Найти второй по величине элемент
 */
public class Task10 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(42);
        numbers.add(8);
        numbers.add(23);
        numbers.add(42);
        numbers.add(7);

        Integer secondLargest = findSecondLargest(numbers);
        if (secondLargest != null) {
            System.out.println("Второй по величине элемент: " + secondLargest);
        } else {
            System.out.println("Второй по величине элемент не найден");
        }
    }

    private static Integer findSecondLargest(ArrayList<Integer> list) {
        if (list == null || list.size() < 2) {
            return null;
        }
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(0))) {
                return list.get(i);
            }
        }
        return null;
    }
}