package org.example.transformations;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        animal.eat();

        // Upcasting - восходящее преобразование
        Dog dog1 = new Dog();
        Animal animal1 = dog1;

        // Downcasting - Нисходящее преобразование
        Dog dog2 = (Dog) animal1;
        dog2.bark();
    }
}
