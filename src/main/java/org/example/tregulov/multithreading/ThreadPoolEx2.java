package org.example.tregulov.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
            Executors.newScheduledThreadPool(1);
        scheduledExecutorService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}

class RunnableImpl200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}