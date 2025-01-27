package org.example.algorithms;

import java.util.Arrays;

/**
 * Быстрая сортировка
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{24, 66, 3454, 76, 435, 8787};
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Разделяем массив и получаем индекс опорного элемента
            int pivotIndex = partition(array, low, high);

            // Рекурсивно сортируем левую и правую части
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Опорный элемент
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Меняем местами элементы
                swap(array, i, j);
            }
        }

        // Перемещаем опорный элемент на его правильное место
        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
