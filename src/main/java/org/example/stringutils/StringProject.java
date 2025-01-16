package org.example.stringutils;

public class StringProject {
    public static void main(String[] args) {
        // Работа со строками

        // 1) конкатенация (соединение)
        String s1 = "Hello";
        String s2 = ", ";
        String s3 = "Anna";
        String s4 = "Bob";
        System.out.println(s1 + s2 + s3); // Hello, Anna
        System.out.println("Hello" + " " + "John"); // Hello John
        System.out.println("Hello " + s4); // Bob

        String m1 = "Dasha";
        System.out.println(m1.concat(", ").concat("Masha")); // Dasha, Masha

        // 2) сравнение строк
        String a1 = "Anna";
        String a2 = "Anna";
        System.out.println(a1 == a2);  // true
        System.out.println(a1.equals(a2)); // true

        String a3 = new String("Anna");
        String a4 = new String("Anna");
        System.out.println(a3 == a4); // false
        System.out.println(a3.equals(a4)); // true

        System.out.println("Java".equalsIgnoreCase("java")); // true (сравнивает строки без учёта регистра)

        // Отличие String a1 = new String("Anna"); от String a1 = "Anna";
        /**
         * При использовании new String(), всегда создаётся новый объект строки в куче (heap),
         * даже если строка с таким же значением уже существует в строковом пуле (String Pool).
         */
        String a6 = new String("Anna");
        String a7 = new String("Anna");

        System.out.println(a6 == a7); // false (разные объекты в памяти)
        System.out.println(a6.equals(a7)); // true (содержимое одинаковое)

        System.out.println("-----");

        String a8 = "Anna";
        String a9 = "Anna";
        System.out.println(a8 == a9); // true (оба ссылаются на один объект в пуле)
        System.out.println(a8.equals(a9)); // true (содержимое одинаковое)


        // 3) Получение длины строки
        String str = "Str";
        System.out.println(str.length()); // 3

        // 4) Проверка содержания
        System.out.println("Java Programming".contains("Java")); // true (проверяет, содержит ли строка подстроку)
        System.out.println("Java Programming".startsWith("Java")); // true (проверяет, начинается ли строка с определённой подстроки.)
        System.out.println("Java Programming".endsWith("ingg")); // false (проверяет, заканчивается ли строка определённой подстрокой)


        // 5) Извлечение символов и подстрок
        String h1 = "Java";
        System.out.println(h1.charAt(1)); // a (возвращает символ по индексу)

        String h2 = "I love you";
        System.out.println(h2.substring(2)); // "love you" (извлекает подстроку)
        System.out.println(h2.substring(2, 6)); // "love" (извлекает подстроку)

        // 6) Изменение регистра
        System.out.println("java".toUpperCase()); // "JAVA" (toUpperCase() — преобразует строку в верхний регистр)
        System.out.println("JAVA".toLowerCase()); // "java" (toLowerCase() — преобразует строку в нижний регистр)

        // 7) Удаление пробелов
        String str5 = "  Hello Java!        ";
        System.out.println(str5.trim()); // "Hello Java!" (trim() — удаляет начальные и конечные пробелы)

        // 8) Проверка пустой строки
        System.out.println("".isEmpty()); // true
        System.out.println("      ".isBlank()); // true (isBlank() — проверяет, состоит ли строка только из пробелов или пуста)

        // 9) Замена символов
        String str6 = "Hello, World!";
        System.out.println(str6.replace("World", "Java")); // "Hello, Java!"

        String str7 = "Java Java Java";
        System.out.println(str7.replaceFirst("Java", "Python")); // "Python Java Java"

        // 10) Разбиение строки
        String str8 = "apple,banana,cherry";
        String[] fruits = str8.split(","); // (split() — разбивает строку на массив подстрок по указанному разделителю)
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11) Преобразованеи типов
        int num = 34;
        String st = String.valueOf(num); // (valueOf() — преобразует другие типы данных в строку)
        System.out.println(st); // "34"

        // 12) Поиск подстроки
        String str9 = "Hello, World!";
        System.out.println(str9.indexOf("World")); // 7 (indexOf() — возвращает индекс первого вхождения подстроки)

        String str10 = "Java, Java, Java!";
        System.out.println(str10.lastIndexOf("Java")); // 12 (lastIndexOf() — возвращает индекс последнего вхождения подстроки)

        // 13) Проверка на равенство ссылок
        String a = "Java";
        String b = new String("Java");
        System.out.println(a == b); // false (== проверяет, ссылаются ли a, b на один и тот же объект)
    }
}

