package org.example.examples.interfaces;

public interface Vehicle {
    default void start() {
        System.out.println("Машина заводится...");
    }
}