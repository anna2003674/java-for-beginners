package org.example.multithreading.wait_notify;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        WaitAnaNotify wn = new WaitAnaNotify();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    wn.cunsume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}

class WaitAnaNotify {
    public void produce() throws InterruptedException {
        synchronized (this) {
            System.out.println("Produces thread started...");
            wait(); // 1 - отдаем intrinsic lock, 2 - ждем, пока будет вызван notify()
            System.out.println("Producer thread resumed...");
        }
    }

    public void cunsume() throws InterruptedException {
        Thread.sleep(2000);
        Scanner scanner = new Scanner(System.in);

        synchronized (this) {
            System.out.println("Waiting for return key pressed");
            scanner.nextLine();
            notify();
            Thread.sleep(5000);
        }
    }
}
