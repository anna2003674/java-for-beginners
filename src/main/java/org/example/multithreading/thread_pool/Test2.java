package org.example.multithreading.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " выполняется потоком " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        executorService.shutdown();
    }
}
