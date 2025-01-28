package org.example.tasks;

import java.util.Random;

public class Treasure {
    public static int max(int x, int y) {
        if (x > y) return x;
        return y;
    }

    public static int treasure(int[] weights, int[] values, int capacity, int startIndex, int[][] memo) {
        if (startIndex >= weights.length) return 0;
        if (memo[startIndex][capacity] != -1) {
            return memo[startIndex][capacity];
        }
        if (capacity < weights[startIndex]) {
            return memo[startIndex][capacity] = treasure(weights, values, capacity, startIndex + 1, memo);
        }
        int result = max(
            treasure(weights, values, capacity - weights[startIndex], startIndex + 1, memo) + values[startIndex],
            treasure(weights, values, capacity, startIndex + 1, memo)
        );
        memo[startIndex][capacity] = result;
        return result;
    }

    public static int[] createRandomVector(int length, int seed) {
        Random rand = new Random(seed);
        int[] result = new int[length];
        for (int i = 0; i < length; ++i)
            result[i] = rand.nextInt(100);
        return result;
    }

    public static void main(String[] args) {
        int[] weights = createRandomVector(1000, 1);
        int[] values = createRandomVector(1000, 2);
        int capacity = 100;
        int[][] memo = new int[weights.length][capacity + 1];
        for (int i = 0; i < weights.length; i++) {
            for (int j = 0; j <= capacity; j++) {
                memo[i][j] = -1;
            }
        }
        int result = treasure(weights, values, capacity, 0, memo);
        System.out.println("Максимальная стоимость набора предметов: " + result);
    }
}
