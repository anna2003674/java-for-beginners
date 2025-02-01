package org.example.examples.anonymous_class;

// Анонимный класс переопределяет несколько методов родительского класса
abstract class Animal2 {
    abstract void makeSound();

    void sleep() {
        System.out.println("Животное спит...");
    }
}

public class Test3 {
    public static void main(String[] args) {
        Animal2 dog = new Animal2() {  // Анонимный класс наследуется от Animal2
            @Override
            void makeSound() {
                System.out.println("Гав-гав!");
            }

            @Override
            void sleep() {
                System.out.println("Собака спит...");
            }
        };

        dog.makeSound();
        dog.sleep();
    }
}
