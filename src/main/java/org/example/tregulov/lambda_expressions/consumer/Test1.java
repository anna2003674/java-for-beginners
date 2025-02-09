package org.example.tregulov.lambda_expressions.consumer;

import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        Consumer<String> printer = message -> System.out.println("Сообщение: " + message);
        printer.accept("Привет, мир!");
    }
}