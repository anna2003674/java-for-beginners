package org.example.Lesson23;

/**
 * Все методы класса String не изменяют строку, на которой они вызываются,
 * они возвращают новую строку;
 * StringBuilder в Java — это класс из пакета java.lang,
 * который используется для создания и работы с изменяемыми последовательностями символов;
 * В отличие от объекта String, который является неизменяемым, StringBuilder позволяет изменять содержимое строки без создания нового объекта при каждом изменении,
 * что делает его более эффективным для частых манипуляций со строками;
 */
public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.toUpperCase(); // все строчные буквы станут заглавными
        // все методы класса String возвращают новую строку
        System.out.println(s1); // Hello

        // Метод вернул новую строку и мы результат записали в x
        String x = s1.toUpperCase();
        System.out.println(x); // HELLO

        String s2 = new String("Anna");


        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        // Не создавая новых объектов мы можем сколько угодно конкатенировать строк
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
        // Если множество конкатенаций (модификации со строкой), в цикле что-то делаем со строками, то необходим использовать StringBuilder
        // А вот строка String не меняется. Каждый раз строка создается новая (уже измененная)

        StringBuilder sb1 = new StringBuilder("Masha");
        sb1.append("Misha").insert(0, "!"); // вставляем строку в указанную позицию
        System.out.println(sb1.toString());
        sb1.delete(0, 6); // Удаляет символы из указанного диапазона
        System.out.println(sb1.toString()); // Misha
        sb1.deleteCharAt(2); // удаляет символ по указанному индексу
        System.out.println(sb1.toString()); // Miha
        sb1.replace(0, 4, "Anna");
        System.out.println(sb1.toString()); // Заменяет символы в указанном диапазоне на новую строку
        System.out.println(sb1.reverse()); // Переворачивает последовательность символов
        // toString() преобразует объект StringBuilder в строку
    }
}
