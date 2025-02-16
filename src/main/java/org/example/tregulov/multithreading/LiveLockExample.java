package org.example.tregulov.multithreading;

class SharedResource {
    private boolean lockTaken = false;

    synchronized void tryLock(Thread thread) {
        while (lockTaken) {
            System.out.println(thread.getName() + " уступает ресурс другому потоку...");
            try {
                Thread.sleep(100); // Уступаем управление
            } catch (InterruptedException ignored) {
            }
        }
        lockTaken = true;
        System.out.println(thread.getName() + " захватил ресурс.");
    }

    synchronized void unlock() {
        lockTaken = false;
    }
}

public class LiveLockExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Runnable task = () -> {
            Thread currentThread = Thread.currentThread();
            while (true) {
                resource.tryLock(currentThread);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                resource.unlock();
            }
        };

        new Thread(task, "Поток-1").start();
        new Thread(task, "Поток-2").start();
    }
}