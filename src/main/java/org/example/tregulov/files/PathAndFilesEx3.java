package org.example.tregulov.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test100.txt");
        Files.createFile(filePath);
        String dialog = "Привет.\nПривет!\nКак дела? \nХорошо \nУ тебя как?";
        Files.write(filePath, dialog.getBytes());

        List<String> list = Files.readAllLines(filePath);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
