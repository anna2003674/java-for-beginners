package org.example.tregulov.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\AnnaTeremizova\\Desktop\\M");
        Path directoryBPath = Paths.get("C:\\Users\\AnnaTeremizova\\Desktop\\B");

        Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(filePath, directoryPath.resolve("test16.txt"));
        System.out.println("---");
        Files.copy(directoryBPath, directoryPath.resolve("B"));
        System.out.println("---");
        Files.move(filePath, directoryPath.resolve("test15.txt"));
        System.out.println("---");
    }
}
