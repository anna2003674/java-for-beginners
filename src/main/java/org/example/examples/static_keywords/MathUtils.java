package org.example.examples.static_keywords;

public class MathUtils {
    static int sum(int a, int b) {
        return a + b;
    }
}

class Main2 {
    public static void main(String[] args) {
        int result = MathUtils.sum(5, 10);
        System.out.println(result);
    }
}