package org.example.multithreading.callable_future;

import java.util.concurrent.*;

public class FutureMethodsExample {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<String> task = () -> {
            Thread.sleep(3000);
            return "Готово!";
        };

        Future<String> future = executor.submit(task);

        System.out.println("Ожидание результата...");

        try {
            System.out.println(future.get(2, TimeUnit.SECONDS)); // Ждём не больше 2 сек
        } catch (TimeoutException e) {
            System.out.println("Слишком долго! Отменяем...");
            future.cancel(true); // Прерываем выполнение
        }

        executor.shutdown();
    }
}
