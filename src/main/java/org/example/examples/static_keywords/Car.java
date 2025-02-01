package org.example.examples.static_keywords;

public class Car {
    static int wheels = 4;
    String model;

    Car(String model) {
        this.model = model;
    }

    void displayInfo() {
        System.out.println(model + " имеет " + wheels + " колеса.");
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota");
        Car car2 = new Car("BMW");

        car1.displayInfo();  // Toyota имеет 4 колеса.
        car2.displayInfo();  // BMW имеет 4 колеса.

        Car.wheels = 6;

        car1.displayInfo();  // Toyota имеет 6 колеса.
        car2.displayInfo();  // BMW имеет 6 колеса.
    }
}
