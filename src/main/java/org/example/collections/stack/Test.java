package org.example.collections.stack;

import java.util.Stack;

/**
 * Stack
 * LIFO (Последний пришел первый вышел) Last in first out
 */
public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);
        System.out.println(stack.pop()); // 1
        System.out.println(stack.pop()); // 3
        System.out.println(stack.peek());

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
