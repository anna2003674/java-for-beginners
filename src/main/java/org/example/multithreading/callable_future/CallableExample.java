package org.example.multithreading.callable_future;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            System.out.println("Выполняем вычисления...");
            Thread.sleep(2000);
            return 42;
        };

        Future<Integer> future = executor.submit(task); // Запуск задачи

        System.out.println("Ожидание результата...");

        Integer result = future.get(); // Ожидание результата (блокирует поток)
        System.out.println("Результат: " + result);

        executor.shutdown();
    }
}
