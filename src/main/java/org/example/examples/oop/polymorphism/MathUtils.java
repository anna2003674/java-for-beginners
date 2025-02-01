package org.example.examples.oop.polymorphism;

public class MathUtils {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}

class Main {
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        System.out.println(math.sum(5, 10));        // Вызовет метод sum(int, int)
        System.out.println(math.sum(5, 10, 15));    // Вызовет метод sum(int, int, int)
        System.out.println(math.sum(2.5, 3.5));     // Вызовет метод sum(double, double)
    }
}
