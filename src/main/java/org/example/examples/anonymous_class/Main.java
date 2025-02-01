package org.example.examples.anonymous_class;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() { // Создаем анонимный класс
            @Override
            public void sayHello() {
                System.out.println("Привет из анонимного класса!");
            }
        };
        greeting.sayHello();
    }
}