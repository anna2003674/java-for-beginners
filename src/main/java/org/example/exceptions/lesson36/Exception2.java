package org.example.exceptions.lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file1 = new File("test");
        Scanner sc = new Scanner(file1);
    }
}
