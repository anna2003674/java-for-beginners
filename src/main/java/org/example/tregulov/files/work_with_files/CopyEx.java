package org.example.tregulov.files.work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("test3.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("test4.txt"));
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
