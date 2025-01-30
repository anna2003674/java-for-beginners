package org.example.regexp;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String a = "Hello there hey";
        String[] words = a.split(" ");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";
        String modifiedString = b.replace(" ", ".");
        System.out.println(modifiedString);

        String b1 = "Hello5345there345345hey";
        String modifiedString2 = b1.replaceAll("\\d+", "-");
        System.out.println(modifiedString2);
    }
}
