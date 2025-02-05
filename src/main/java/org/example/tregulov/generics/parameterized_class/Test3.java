package org.example.tregulov.generics.parameterized_class;

public class Test3 {
    public static void main(String[] args) {
        OtherPair<String> otherPair = new OtherPair<>("Hello", "World");
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}
