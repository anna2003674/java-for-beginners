package org.example.tasks.arrays;

/**
 * Найти максимальный, минимальный элементы в массиве и поменять их местами
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arrays = new int[]{10, 45, 67, 345, 767, 2, 676, 3500, 600, 3434};

        int minIndex = minElementIndex(arrays);
        int maxIndex = maxElementIndex(arrays);

        System.out.println("Максимальный элемент массива: " + arrays[maxIndex]);
        System.out.println("Минимальный элемент массива: " + arrays[minIndex]);

        swapArrays(arrays, minIndex, maxIndex);

        System.out.println("Массив после замены:");
        printArrays(arrays);
    }

    private static void printArrays(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    private static void swapArrays(int[] arr, int minIndex, int maxIndex) {
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int maxElementIndex(int[] arrays) {
        int maxIndex = 0;
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] > arrays[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private static int minElementIndex(int[] arrays) {
        int minIndex = 0;
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i] < arrays[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
