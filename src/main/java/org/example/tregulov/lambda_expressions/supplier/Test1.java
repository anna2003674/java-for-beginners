package org.example.tregulov.lambda_expressions.supplier;

import java.util.function.Supplier;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
        System.out.println(randomNumber.get());
    }
}