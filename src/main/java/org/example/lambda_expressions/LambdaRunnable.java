package org.example.lambda_expressions;

public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Привет из потока!");
            }
        };

        Runnable r2 = () -> System.out.println("Привет из лямбды!");

        new Thread(r1).start();
        new Thread(r2).start();
    }
}
