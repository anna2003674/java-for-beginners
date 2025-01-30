package org.example.multithreading.callable_future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
            () -> {
                Thread.sleep(1000);
                return "Задача 1";
            },
            () -> {
                Thread.sleep(2000);
                return "Задача 2";
            },
            () -> {
                Thread.sleep(3000);
                return "Задача 3";
            }
        );

        List<Future<String>> results = executor.invokeAll(tasks);

        for (Future<String> future : results) {
            try {
                System.out.println(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }
}
