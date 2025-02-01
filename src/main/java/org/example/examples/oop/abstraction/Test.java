package org.example.examples.oop.abstraction;

abstract class Animal {
    public abstract void makeSound();

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Test {
    public static void main(String[] args) {
    }
}
