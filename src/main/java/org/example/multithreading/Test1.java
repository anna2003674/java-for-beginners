package org.example.multithreading;

import java.util.Scanner;

/**
 * Ключевое слово volatile
 */
public class Test1 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        myThread2.shutdown();
    }
}

class MyThread2 extends Thread {
    private volatile boolean running = true;

    @Override
    public void run() {
        while (running) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shutdown() {
        this.running = false;
    }
}

