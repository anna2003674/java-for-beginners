package org.example.recursion;

public class Test2 {
    public static void main(String[] args) {
        int result = fibb(5);
        System.out.println(result);
    }

    private static int fibb(int n) {
        if (n <= 1) {
            return n;
        }
        return fibb(n - 1) + fibb(n - 2);
    }
}
