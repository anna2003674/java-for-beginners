package org.example.tregulov.files.work_with_files;

import java.io.File;
import java.util.Arrays;

public class FileEx1 {
    public static void main(String[] args) {
        File file = new File("test2.txt");
        File folder = new File("C:\\Users\\AnnaTeremizova\\Desktop\\A");
        System.out.println(file.getAbsolutePath());
        System.out.println(folder.getAbsolutePath());
        System.out.println();
        System.out.println(file.isAbsolute());
        System.out.println(folder.isAbsolute());
        System.out.println();
        System.out.println(file.isDirectory());
        System.out.println(folder.isDirectory());
        System.out.println();
        System.out.println(file.exists());
        System.out.println(folder.exists());
        System.out.println();
        System.out.println(file.length());
        System.out.println();
        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println();
        System.out.println(file.isHidden());
        System.out.println();
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.canExecute());
    }
}
