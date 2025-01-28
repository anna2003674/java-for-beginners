package org.example.tasks;

public class MaximizeFunction {
    public static void main(String[] args) {
        int maxX = 0;
        double maxF = Double.NEGATIVE_INFINITY;

        for (int x = 0; x <= 100; x++) {
            double f = calculateFunction(x);
            if (f > maxF) {
                maxF = f;
                maxX = x;
            }
        }
        System.out.println("Максимальное значение функции достигается при x = " + maxX);
        System.out.println("Значение функции f(x) = " + maxF);
    }

    public static double calculateFunction(int x) {
        return Math.pow(x, 3) - 150 * Math.pow(x, 2) + 5400 * x - 40000;
    }
}
