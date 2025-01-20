package org.example.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1));
        listOfAnimals.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());

        test(listOfAnimals);
        test2(listOfDog);
    }

    public static void test(List<Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void test2(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }

//    public static void test3(List<? super Animal> list) {
//        for (Animal animal : list) {
//            animal.eat();
//        }
//    }
}
