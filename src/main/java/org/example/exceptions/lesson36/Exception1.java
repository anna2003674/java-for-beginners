package org.example.exceptions.lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        // В ходе выполнения программы могут возникать ошибки
        // (мы должны эти ошибки обрабатывать)
        File file1 = new File("test");
        try {
            Scanner sc1 = new Scanner(file1);
            System.out.println("После Scanner'a");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch");
    }
}
