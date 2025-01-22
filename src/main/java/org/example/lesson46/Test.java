package org.example.lesson46;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1 == animal2); // (false) сравниваются ссылки на объекты в памяти
        System.out.println(animal2.equals(animal1)); // (true) сравниваются объекты по содержимому, а не ссылки (по умолчанию equals() сравнивает ссылки на объекты, поэтому метод equals() нужно переопределять)
    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;

    }
}
