package org.example.generics;

/**
 * Параметризация метода
 */
public class Util {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

}

class Main2 {
    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three"};
        Integer[] numbers = {1, 2, 3};

        Util.printArray(strings);
        Util.printArray(numbers);
    }
}
