package org.example.examples.oop.polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Test1 {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Создание объекта типа Dog, но через тип Animal
        myAnimal.makeSound(); // Bark
    }
}
