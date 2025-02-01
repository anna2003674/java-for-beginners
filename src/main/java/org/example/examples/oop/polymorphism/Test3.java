package org.example.examples.oop.polymorphism;

interface Vehicle {
    void move();
}

// Реализация интерфейса для машины
class Car implements Vehicle {
    public void move() {
        System.out.println("The car is driving on the road.");
    }
}

// Реализация интерфейса для лодки
class Boat implements Vehicle {
    public void move() {
        System.out.println("The boat is sailing on the water.");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.move();  // The car is driving on the road.

        myVehicle = new Boat();
        myVehicle.move();  // The boat is sailing on the water.

    }
}
