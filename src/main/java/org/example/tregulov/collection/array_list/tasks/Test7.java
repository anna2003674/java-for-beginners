package org.example.tregulov.collection.array_list.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан ArrayList<Integer>, содержащий числа.
 * Напишите метод, который отбирает только числа больше 50.
 */
public class Test7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4565);
        numbers.add(434);
        numbers.add(55);
        numbers.add(11);
        numbers.add(28);
        numbers.add(9);
        numbers.add(5);
        numbers.add(70);
        numbers.add(42);
        numbers.add(33);
        List<Integer> filtered = numbers.stream()
            .filter(n -> n > 50).collect(Collectors.toList());
        System.out.println("Числа больше 50: " + filtered);

        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(4565);
        numbers2.add(434);
        numbers2.add(55);
        numbers2.add(11);
        numbers2.add(28);
        numbers2.add(9);
        numbers2.add(5);
        numbers2.add(70);
        numbers2.add(42);
        numbers2.add(33);

        int[] filteredNumbers = filterNumbers(numbers2);

        System.out.print("Числа больше 50: ");
        for (int num : filteredNumbers) {
            System.out.print(num + " ");
        }
    }

    private static int[] filterNumbers(ArrayList<Integer> list) {
        int count = 0;
        for (int num : list) {
            if (num > 50) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num : list) {
            if (num > 50) {
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}