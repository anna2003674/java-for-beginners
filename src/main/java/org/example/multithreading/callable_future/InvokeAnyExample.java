package org.example.multithreading.callable_future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAnyExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // invokeAny() запускает все задачи, возвращает результат самой быстрой, остальные задачи отменяются.
        List<Callable<String>> tasks = Arrays.asList(
            () -> {
                Thread.sleep(3000);
                return "Задача 1";
            },
            () -> {
                Thread.sleep(1000);
                return "Задача 2";
            },
            () -> {
                Thread.sleep(2000);
                return "Задача 3";
            }
        );

        String result = executor.invokeAny(tasks);
        System.out.println("Первый результат: " + result);

        executor.shutdown();
    }
}
