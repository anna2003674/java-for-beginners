package org.example.oop.Lesson28;

import org.example.oop.Lesson28.Forest.Something.SomeClass;
import org.example.oop.Lesson28.Forest.Squirell;
import org.example.oop.Lesson28.Forest.Tree;

import java.util.Scanner;

/**
 * Пакеты — это механизм организации классов и интерфейсов в группы,
 * что позволяет упрощать управление кодом, избегать конфликтов имен, и упрощать контроль доступа;
 * Пакеты также помогают структурировать большие проекты, делая код модульным и легче поддерживаемым;
 */
public class Test {
    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Squirell squirell1 = new Squirell();
        Scanner scanner = new Scanner(System.in);
        SomeClass someClass = new SomeClass();
    }
}
