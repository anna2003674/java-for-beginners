package org.example.tregulov.generics.parameterized_class;

public class Test1 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s1 = info1.getValue();

        Info<Integer> info2 = new Info<>(21);
        System.out.println(info2);
        Integer s2 = info2.getValue();
    }
}

class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[" + value + "]}";
    }

    public T getValue() {
        return value;
    }
}
