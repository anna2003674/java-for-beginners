package org.example.examples.oop.inheritance;

class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();

        Cat cat = new Cat();
        cat.makeSound();
    }
}