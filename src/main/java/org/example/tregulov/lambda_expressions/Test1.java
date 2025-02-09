package org.example.tregulov.lambda_expressions;

import java.util.function.*;

public class Test1 {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        Consumer<String> printer = message -> System.out.println("Сообщение: " + message);
        Supplier<Double> randomSupplier = () -> Math.random();
        Predicate<Integer> isPositive = num -> num > 0;

        String text = "Lambda";
        Integer length = lengthFunction.apply(text);
        printer.accept("Длина строки '" + text + "' = " + length);

        System.out.println("Случайное число: " + randomSupplier.get());
        System.out.println("Число 5 положительное? " + isPositive.test(5));
        System.out.println("Число -3 положительное? " + isPositive.test(-3));
    }
}