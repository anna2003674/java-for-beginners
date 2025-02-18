package org.example.tregulov.files.work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной." +
            "Непонятного нет для меня под луной..." +
            "Мне изестно, что мне ничего не известно!" +
            "Вот последняя правда, открытая мной.";

        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\AnnaTeremizova\\Desktop\\WorkingWithFile.txt");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
