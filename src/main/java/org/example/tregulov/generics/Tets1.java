package org.example.tregulov.generics;

import java.util.ArrayList;
import java.util.List;

public class Tets1 {
    public static void main(String[] args) {
        // без Generics
        List list = new ArrayList();
        list.add("OK");
        list.add(5);
        list.add(new StringBuilder("str478574"));
        list.add(new Car());

        List list2 = new ArrayList();
        list2.add("Anna");
        list2.add("Dasha");
        list2.add("Masha");

        for (Object o : list2) {
            System.out.println(o + " " + ((String) o).length());
        }
    }
}

class Car {
}
