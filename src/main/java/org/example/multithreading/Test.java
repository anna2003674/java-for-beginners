package org.example.multithreading;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // потоки не синхронизированы
        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out.println("Hello World");

        MyThread myThread2 = new MyThread();
        myThread2.start();

        System.out.println("Я ложусь спать");
        Thread.sleep(3000);
        System.out.println("Я проснулся");

        Thread thread1 = new Thread(new Runner());
        thread1.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread!" + i);
        }
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread!" + i);
        }
    }
}
