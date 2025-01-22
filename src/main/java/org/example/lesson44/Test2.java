package org.example.lesson44;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; // разделитель
        String path = "C:" + separator + "Users" + separator + "AnnaTeremizova" + separator + "Desktop" + separator + "Anna.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[8];
        int counter = 0;

        for (String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}
