package org.example.lambda_expressions;

public class Test1 {
    public static void main(String[] args) {
        // Анонимный класс, который реализует интерфейс Runnable
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет!");
            }
        });

        Thread thread2 = new Thread(() -> System.out.println("Привет!"));
    }
}
