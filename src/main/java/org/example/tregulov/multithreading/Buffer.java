package org.example.tregulov.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 5;

    public synchronized void produce(int value) {
        while (queue.size() == LIMIT) {
            try {
                System.out.println("Буфер заполнен. Производитель ждёт...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        queue.add(value);
        System.out.println("Производитель добавил: " + value);
        notify(); // Уведомляем потребителя
    }

    public synchronized void consume() {
        while (queue.isEmpty()) {
            try {
                System.out.println("Буфер пуст. Потребитель ждёт...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int value = queue.poll();
        System.out.println("Потребитель взял: " + value);
        notify(); // Уведомляем производителя
    }
}

class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                buffer.produce(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                buffer.consume();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
