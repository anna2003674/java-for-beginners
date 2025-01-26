package org.example.algorithms;

import java.util.Arrays;

/**
 * Бинарный поиск (Binary Search)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arrays = new int[]{100, 300, 45, 23, 1, 78, 34, 78};
        int indexElement = 78;
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
        int result = binarySearch(arrays, indexElement);
        System.out.println(result);
    }

    public static int binarySearch(int[] numbers, int item) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = numbers[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -100;
    }
}
