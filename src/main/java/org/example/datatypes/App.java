package org.example.datatypes;

public class App {
    public static void main(String[] args) {
        // Примитивные типы данных
        // Целочисленные типы данных
        int myInt = 10; // -2³¹ до 2³¹-1. (4 байта)
        short myShort = 3266; // -32768 до 32767 (2 байта)
        long myLong = 22445632; // -2⁶³ до 2⁶³-1. (8 байт)
        byte myByte = 127; // -128 до 127. (1 байт)

        // Вещественные типы данных
        double myDouble = 456.4; // (8 байт)
        float myFloat = 4545.5f; // (4 байта)

        // Символьный тип данных
        char myChar = 'a'; // Хранит одиночный символ в формате Unicode (от 0 до 65535), (2 байта)

        // Логический тип данных
        boolean myBoolean = true; // true false

        // Ссылочные типы данных
        String s = "Anna";
        // Строки, интерфейсы, массивы, классы, перечисления, коллекции, потоки (stream) и др.
    }
}
