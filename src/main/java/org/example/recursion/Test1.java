package org.example.recursion;

/**
 * Факториал числа
 */
public class Test1 {
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }
}
