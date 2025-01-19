package org.example.oop.accessmodifiers;

import org.example.oop.accessmodifiers.packet1.Person;

/**
 * Модификаторы доступа:
 * public - публичный (доступен отовсюду), доступен в любом месте проекта.
 * private - доступен только в пределах класса, где он объявлен.
 * default (или отсутствие модификатора) - доступен только внутри пакета, в котором находится класс.
 * protected - доступен в пределах пакета и в классах-наследниках, даже если они находятся в других пакетах.
 */
public class Test extends Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Anna"; // получем доступ к name (т.к. public поле)
    }

    public Test() {
        surname = "Иванов";
    }
}
