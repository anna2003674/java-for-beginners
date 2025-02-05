package org.example.tasks.arrays;

import java.util.Scanner;

/**
 * Ввести массив длиной n. Поменять местами первый и последний элементы.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Исходный массив: ");
        printArray(array);

        swapFirstLast(array);

        System.out.println("Массив после замены: ");
        printArray(array);
    }

    private static void swapFirstLast(int[] array) {
        if (array.length > 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
