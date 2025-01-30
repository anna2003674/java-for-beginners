package org.example.regexp;

public class Test1 {
    public static void main(String[] args) {
        String a1 = "8";
        System.out.println(a1.matches("\\d"));

        String a2 = "4654";
        System.out.println(a2.matches("\\d+"));

        String a3 = "-4654";
        System.out.println(a3.matches("-\\d+"));

        String a4 = "-54534";
        String a5 = "65466";
        System.out.println(a4.matches("-?\\d+"));

        String a = "-354456";
        String b = "467578456";
        String c = "+984688457";
        System.out.println(b.matches("(-|\\+)?\\d*")); // true на a, b, c

        String d = "t87357843";
        System.out.println(d.matches("[a-zA-Z]\\d+"));

        String d1 = "tsfsdHjgj87357843";
        System.out.println(d1.matches("[a-zA-Z]+\\d+"));

        String e = "hebcallo";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
        System.out.println(f.matches("\\d{2}")); // false
    }
}
