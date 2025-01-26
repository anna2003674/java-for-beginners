package org.example.collections.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Очередь (Queue)
 * FIFO (Первый пришел первый вышел - First in first out)
 */
public class Test {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new LinkedList();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        for (Person person : people) {
            System.out.println(person);
        }

        Queue<Person> queue = new ArrayBlockingQueue<Person>(10);
        queue.add(person1);
        queue.add(person2);
        queue.add(person3);
        queue.add(person4);
        System.out.println(people.remove()); // удаление верхнего элемента из очереди
        System.out.println(people.peek()); // посмотреть на верхний элемент в очереди

        // throws exception: add() remove() element()
        // returns special value: offer() poll() peek()
    }
}

class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            '}';
    }
}

