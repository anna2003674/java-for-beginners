package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        /// Java 5 - До появления generics ///
        //  В этом динамическом списке могут находиться любые объекты и значения любых типов
        List animal = new ArrayList();
        animal.add("Anna");
        animal.add(12);
        animal.add(new Frog());
        animal.add(23.5);
        String animal1 = (String) animal.get(0);
        System.out.println(animal1);
        Frog animal2 = (Frog) animal.get(2);
        System.out.println(animal2);

        /// С появлением дженериков (generics) ///
        List<String> animals = new ArrayList<>(); // Можем добавлять объекты только класса String
        animals.add("flog");
        animals.add("cat");
        animals.add("dog");
        String animal3 = animals.get(1);
        System.out.println(animal3); // cat

        /// Java 7 ///
        List<String> animal4 = new ArrayList<>();
    }
}

class Frog {
}
