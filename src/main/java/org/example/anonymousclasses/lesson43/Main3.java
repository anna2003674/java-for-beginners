package org.example.anonymousclasses.lesson43;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // Анонимный класс создается для заполнения списка значениями
        List<String> list = new ArrayList<>(new ArrayList<>() {
            {
                add("Привет");
                add("Пока");
            }
        });
        list.forEach(System.out::println);
    }
}
