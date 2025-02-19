package org.example.tregulov.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesEx1 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\AnnaTeremizova\\Desktop\\M");
        System.out.println(filePath.getFileName());
        System.out.println(directoryPath.getFileName());
        System.out.println("---");
        System.out.println(filePath.getParent());
        System.out.println(directoryPath.getParent());
        System.out.println("---");
        System.out.println(filePath.getRoot());
        System.out.println(directoryPath.getRoot());
        System.out.println("---");
        System.out.println(filePath.isAbsolute());
        System.out.println(directoryPath.isAbsolute());
        System.out.println("---");
        System.out.println(filePath.toAbsolutePath());
        System.out.println(directoryPath.toAbsolutePath());
        System.out.println("---");
        System.out.println(filePath.toAbsolutePath().getParent());
        System.out.println(directoryPath.toAbsolutePath().getRoot());
        System.out.println("---");
        System.out.println(directoryPath.resolve(directoryPath));
        System.out.println("---");
        if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
        if (!Files.exists(filePath)) {
            Files.createDirectory(directoryPath);
        }
        System.out.println(Files.size(filePath));
    }
}
