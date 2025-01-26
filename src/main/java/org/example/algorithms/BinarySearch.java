package org.example.algorithms;

import java.util.Arrays;

/**
 * Бинарный поиск (Binary Search)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{100, 300, 45, 23, 1, 78, 34, 78};
        int target = 78;

        // Сортировка массива
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));

        // Поиск элемента
        int result = binarySearch(array, target);

        // Вывод результата
        if (result != -1) {
            System.out.println("Элемент найден на индексе: " + result);
        } else {
            System.out.println("Элемент не найден");
        }
    }

    public static int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Предотвращение переполнения
            int guess = numbers[mid];

            if (guess == target) {
                return mid; // Элемент найден
            }
            if (guess > target) {
                high = mid - 1; // Исключение правой части
            } else {
                low = mid + 1; // Исключение левой части
            }
        }
        return -1; // Элемент не найден
    }
}
