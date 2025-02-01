package org.example.examples.anonymous_class;

// Анонимный класс реализует несколько методов интерфейса
interface Printer {
    void print(String text);

    void clear();
}

public class Test2 {
    public static void main(String[] args) {
        Printer printer = new Printer() { // Анонимный класс реализует два метода
            @Override
            public void print(String text) {
                System.out.println("Печать: " + text);
            }

            @Override
            public void clear() {
                System.out.println("Очистка принтера");
            }
        };

        printer.print("Hello, Java!");
        printer.clear();
    }
}
