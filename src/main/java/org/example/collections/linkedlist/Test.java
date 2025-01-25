package org.example.collections.linkedlist;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(100);
        myLinkedList.add(44);
        myLinkedList.add(37);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}
