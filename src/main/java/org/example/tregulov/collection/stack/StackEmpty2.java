package org.example.tregulov.collection.stack;

import java.util.Stack;

public class StackEmpty2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Anna");
        stack.push("Dasha");
        stack.push("Alex");
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}