package org.example.oop.inheritance;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

    public void bark() {
        System.out.println("Гав гав");
    }

    public void showName() {
        System.out.println(name);
    }
}
