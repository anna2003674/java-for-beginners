package org.example.recursion;

/**
 * Рекурсия (recursion) — это поведение функции, при котором она вызывает сама себя.
 */
public class Test {
    public static void main(String[] args) {
        counter(3);
    }

    private static void counter(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        counter(n - 1);
    }
}
