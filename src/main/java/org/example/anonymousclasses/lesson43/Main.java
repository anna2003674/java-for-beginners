package org.example.anonymousclasses.lesson43;

public class Main {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Анонимный класс реализует интерфейс Runnable");
            }
        };
        new Thread(runnable).start();
    }
}
