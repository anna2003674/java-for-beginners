package org.example.tregulov.multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunnableImpl2 runnable = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    volatile static int count = 0;
}

class MyRunnableImpl2 implements Runnable {

    public void doWorkTwo() {
        System.out.println("Hello!!!");
    }

    public void doWorkOne() {
        doWorkTwo();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWorkOne();
        }
    }
}