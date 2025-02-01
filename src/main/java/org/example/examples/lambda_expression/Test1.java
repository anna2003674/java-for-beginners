package org.example.examples.lambda_expression;

import org.example.examples.anonymous_class.Greeting;

public class Test1 {
    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("Привет из лямбда-выражения!");
        greeting.sayHello();
    }
}
