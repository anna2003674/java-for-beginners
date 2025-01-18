package org.example.oop.interfaces;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Животное спит");
    }

    @Override
    public void showInfo() {
        System.out.println("id: " + this.id);
    }
}
