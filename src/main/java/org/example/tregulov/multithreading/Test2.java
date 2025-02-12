package org.example.tregulov.multithreading;

public class Test2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread4());
        Thread thread2 = new Thread(new MyThread5());
        thread2.start();
        thread1.start();
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
}

class MyThread5 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}