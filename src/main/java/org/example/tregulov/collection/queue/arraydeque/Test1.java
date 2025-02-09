package org.example.tregulov.collection.queue.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test1 {
    public static void main(String[] args) {
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(3);
        arrayDeque.addFirst(5);
        arrayDeque.addLast(7);
        arrayDeque.addFirst(1);
        arrayDeque.addLast(8);
        System.out.println(arrayDeque);
        System.out.println(arrayDeque.removeFirst());
        System.out.println(arrayDeque.removeLast());
        System.out.println(arrayDeque.pollFirst());
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque.getFirst());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());
    }
}