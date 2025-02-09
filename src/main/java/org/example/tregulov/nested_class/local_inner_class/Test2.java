package org.example.tregulov.nested_class.local_inner_class;

public class Test2 {
    public static void main(String[] args) {

        class Summ implements Math2 {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Summ summ = new Summ();
        int result = summ.doOperation(4, 6);
        System.out.println(result);
    }
}

interface Math2 {
    int doOperation(int a, int b);
}
