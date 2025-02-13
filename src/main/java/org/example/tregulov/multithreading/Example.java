package org.example.tregulov.multithreading;

public class Example {
    static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (running) {
            }
            System.out.println("Поток остановлен!");
        });
        thread.start();
        Thread.sleep(2000);
        running = false;
        System.out.println("Флаг изменен в главном потоке.");
    }
}