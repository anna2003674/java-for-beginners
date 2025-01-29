package org.example.multithreading.thread_pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        scheduler.scheduleAtFixedRate(() -> {
            System.out.println("Повторяющаяся задача выполняется: " + System.currentTimeMillis());
        }, 1, 3, TimeUnit.SECONDS); // Задержка 1 сек, затем каждые 3 сек

        // Остановим выполнение через 10 секунд
        scheduler.schedule(() -> {
            System.out.println("Остановка работы пула");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}
