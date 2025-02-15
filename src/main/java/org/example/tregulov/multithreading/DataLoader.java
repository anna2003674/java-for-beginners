package org.example.tregulov.multithreading;

public class DataLoader {
    private boolean isDataReady = false;

    public synchronized void waitForData() {
        while (!isDataReady) {
            try {
                System.out.println(Thread.currentThread().getName() + " ждёт загрузки данных...");
                wait(); // Ожидание
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " получил данные и продолжает работу!");
    }

    public synchronized void loadData() {
        System.out.println(Thread.currentThread().getName() + " загружает данные...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        isDataReady = true;
        System.out.println(Thread.currentThread().getName() + " загрузил данные!");
        notify(); // Оповещаем один поток
    }
}

class WaitNotifyExample {
    public static void main(String[] args) {
        DataLoader loader = new DataLoader();

        Thread consumer = new Thread(loader::waitForData, "Потребитель");
        Thread producer = new Thread(loader::loadData, "Производитель");

        consumer.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        producer.start();
    }
}