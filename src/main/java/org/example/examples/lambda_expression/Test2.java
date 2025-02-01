package org.example.examples.lambda_expression;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Test2 {
    public static void main(String[] args) {
        MathOperation mathOperation = (a, b) -> a + b;
        System.out.println(mathOperation.operate(4, 8));
    }
}