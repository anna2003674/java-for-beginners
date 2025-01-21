package org.example.exceptions.lesson39;

import java.io.IOException;
import java.text.ParseException;

public class Exception1 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {
    }
}
