package org.example.oop.accessmodifiers.packet1;

public class Test1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.surname);
        person1.name = "Oleg";
    }
}
