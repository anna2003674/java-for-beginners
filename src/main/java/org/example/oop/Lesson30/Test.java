package org.example.oop.Lesson30;

public class Test {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // Dog dog = new Dog();
        // animal.eat();
        // dog.eat();

        // доступ к методам в родительском классе (Animal)
        // тут рассматриваем собаку как животное
        Animal animal = new Dog();
        animal.eat();
        // animal.bark(); // нет доступа

        // тут рассматриваем собаку как собаку
        Dog dog = new Dog();
        dog.eat();
        dog.bark(); // имеем доступ к методу

        Animal animal2 = new Animal();
        Dog dog2 = new Dog();
        Cat cat2 = new Cat();
        test(animal2);
        test(dog2);
        test(cat2);
    }

    public static void test(Animal animal) {
        animal.eat();
    }
}
