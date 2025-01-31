package org.example.lambda_expressions;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println(sum.operation(4, 5));
        System.out.println(multiply.operation(4, 5));
    }
}
