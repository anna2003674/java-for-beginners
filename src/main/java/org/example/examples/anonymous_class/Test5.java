package org.example.examples.anonymous_class;

class Car {
    void drive() {
        System.out.println("Машина едет");
    }
}

public class Test5 {
    public static void main(String[] args) {
        Car bmw = new Car() { // Анонимный класс
            @Override
            void drive() {
                System.out.println("Bmw едет");
            }
        };

        bmw.drive();
    }
}
