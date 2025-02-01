package org.example.examples.anonymous_class;

public class Test4 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Реализация интерфейса без создания отдельного класса");
            }
        };
        new Thread(runnable).start();

        new Thread(() -> System.out.println("Лямбда вместо анонимного класса!")).start();
    }
}
