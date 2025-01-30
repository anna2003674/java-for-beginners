package org.example.multithreading.callable_future;

import java.util.Random;
import java.util.concurrent.*;

public class Test1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Finished");

            Random random = new Random();
            int randomValue = random.nextInt(10);

            if (randomValue < 5) {
                throw new Exception("Something bad happened");
            }

            return randomValue;
        });

        executorService.shutdown();

        try {
            int result = future.get(); // get() дожидается окончания выполнения потока
            System.out.println("Result: " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
