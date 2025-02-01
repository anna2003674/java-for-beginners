package org.example.examples.oop.polymorphism;

class Animal2 {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat2 extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Animal2 myAnimal = new Dog2();  // Полиморфизм: объект Dog2 хранится в переменной типа Animal2
        myAnimal.makeSound();  // Bark

        myAnimal = new Cat2();  // Теперь в переменной myAnimal объект Cat2
        myAnimal.makeSound();  // Meow
    }
}