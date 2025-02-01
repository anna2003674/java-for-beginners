package org.example.examples.abstract_method;

interface Animal3 {
    void makeSound(); // Абстрактный метод

    default void sleep() { // Метод с реализацией
        System.out.println("Животное спит...");
    }
}

class Dog2 implements Animal3 {
    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.makeSound(); // Гав-гав!
        dog.sleep();     // Животное спит...
    }
}
