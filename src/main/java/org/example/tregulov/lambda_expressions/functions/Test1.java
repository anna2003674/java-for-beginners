package org.example.tregulov.lambda_expressions.functions;

import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Hello"));
    }
}