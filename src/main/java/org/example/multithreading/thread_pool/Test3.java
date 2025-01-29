package org.example.multithreading.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;
            executorService.submit(() -> {
                System.out.println("Task " + taskNumber + " выполняется потоком " + Thread.currentThread().getName());
            });
        }
        executorService.shutdown();
    }
}
