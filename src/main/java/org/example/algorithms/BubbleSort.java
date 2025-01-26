package org.example.algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = new int[]{23, 67, 34, 893, 233, 89, 100, 3};
        System.out.println(Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // Если за проход не было обменов, массив отсортирован
            }
        }
    }
}
