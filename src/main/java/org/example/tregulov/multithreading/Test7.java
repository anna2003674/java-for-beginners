package org.example.tregulov.multithreading;

public class Test7 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Метод начал свою работу");
        Thread thread1 = new Thread(new Worker());
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        thread1.join();
        System.out.println(thread1.getState());
        System.out.println("Метод закончил свою работу");
    }
}

class Worker implements Runnable {
    public void run() {
        System.out.println("Работа началась");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Работа закончена");
    }
}