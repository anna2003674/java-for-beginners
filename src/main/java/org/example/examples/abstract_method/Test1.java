package org.example.examples.abstract_method;

abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Гав-гав!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Мяу-мяу!");
    }
}


public class Test1 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Выведет: Гав-гав!

        Animal myCat = new Cat();
        myCat.makeSound(); // Выведет: Мяу-мяу!
    }
}
