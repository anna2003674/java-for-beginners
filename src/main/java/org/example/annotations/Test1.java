package org.example.annotations;

public class Test1 {
    @MethodInfo(author = "Anna", dateOfCreation = 2025, purpose = "Print Hello World")
    public void printHelloWorld() {
        System.out.println("Hello World");
    }

    @MethodInfo(purpose = "Print Hello")
    public void printHello() {
        System.out.println("Hello");
    }
}
