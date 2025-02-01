package org.example.examples.abstract_class;

abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    abstract void move();

    void showInfo() {
        System.out.println(brand + " едет со скоростью " + speed + " км/ч");
    }
}

class Car extends Vehicle {
    Car(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void move() {
        System.out.println(brand + " едет по дороге");
    }
}

class Plane extends Vehicle {
    Plane(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void move() {
        System.out.println(brand + " летит по воздуху.");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120);
        Plane plane = new Plane("Boeing", 800);

        car.move();   // Toyota едет по дороге.
        plane.move(); // Boeing летит по воздуху.

        car.showInfo();   // Toyota едет со скоростью 120 км/ч.
        plane.showInfo(); // Boeing едет со скоростью 800 км/ч.
    }
}