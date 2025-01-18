package org.example.oop.interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        animal1.sleep();
        person1.sayHello();
        animal1.showInfo();
        person1.showInfo();

        // Можно делать так, потому что классы Animal, Person реализуют интерфейс Info
        Info info1 = new Animal(2);
        Info info2 = new Person("Anna");
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);

        Animal animal2 = new Animal(3);
        Person person2 = new Person("Dasha");
        outputInfo(animal2);
        outputInfo(person2);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
