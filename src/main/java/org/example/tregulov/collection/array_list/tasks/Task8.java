package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;

/**
 * Найти сумму всех элементов ArrayList
 */
public class Task8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        int result = sumOfElements(list);
        System.out.println("Сумма всех элементов: " + result);
    }

    private static int sumOfElements(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return sum;
    }
}