package org.example.examples.interfaces;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Автомобиль заводится ключом...");
    }
}