package org.example.examples.interfaces;

public interface Logger {
    default void logInfo(String message) {
        log("INFO: " + message);
    }

    private void log(String message) { // Приватный метод
        System.out.println(message);
    }
}