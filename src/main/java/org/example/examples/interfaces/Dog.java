package org.example.examples.interfaces;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}

class Test1 {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Гав-гав!
    }
}
