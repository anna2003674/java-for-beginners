package org.example.tregulov.multithreading;

public class DataProcessor {
    private boolean isDataReady = false;

    public synchronized void waitForData() {
        while (!isDataReady) {
            try {
                System.out.println(Thread.currentThread().getName() + " ждёт данные...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " получил данные!");
    }

    public synchronized void loadData() {
        System.out.println(Thread.currentThread().getName() + " загружает данные...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        isDataReady = true;
        System.out.println(Thread.currentThread().getName() + " загрузил данные!");
        notifyAll(); // Оповещаем всех
    }
}

class NotifyAllExample {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();

        Thread consumer1 = new Thread(processor::waitForData, "Потребитель 1");
        Thread consumer2 = new Thread(processor::waitForData, "Потребитель 2");
        Thread producer = new Thread(processor::loadData, "Производитель");

        consumer1.start();
        consumer2.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        producer.start();
    }
}

