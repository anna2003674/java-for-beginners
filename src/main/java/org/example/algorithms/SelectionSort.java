package org.example.algorithms;

import java.util.Arrays;

/**
 * Сортировка выбором (Selection Sort)
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 67, 34, 90, 23, 67, 88, 100};
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void selectionSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            // Предполагаем, что текущий индекс содержит минимальный элемент
            int minIndex = i;

            // Находим индекс минимального элемента в оставшейся части массива
            for (int j = i + 1; j < n; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            // Меняем местами текущий элемент и минимальный
            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temp;
        }
    }
}
