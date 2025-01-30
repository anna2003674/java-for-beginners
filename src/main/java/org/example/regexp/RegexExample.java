package org.example.regexp;

import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Email: example@email.com";
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Найден email: " + matcher.group());
        } else {
            System.out.println("Email не найден.");
        }
    }

}
