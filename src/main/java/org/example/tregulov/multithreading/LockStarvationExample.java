package org.example.tregulov.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockStarvationExample {
    private static final Lock lock = new ReentrantLock(true); // true - включаем fair lock

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new Worker(), "Поток-" + i);
            if (i == 5) thread.setPriority(Thread.MIN_PRIORITY); // Задаем низкий приоритет
            thread.start();
        }
    }

    static class Worker implements Runnable {
        public void run() {
            while (true) {
                lock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + " получил доступ к ресурсу.");
                    Thread.sleep(500); // Симуляция работы
                } catch (InterruptedException ignored) {
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}