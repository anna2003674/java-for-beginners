package org.example.examples.static_keywords;

public class Database {
    static String connection;

    static {
        connection = "Подключено к базе данных!";
        System.out.println("Static блок сработал!");
    }

    static void getConnection() {
        System.out.println(connection);
    }
}

class Main3 {
    public static void main(String[] args) {
        Database.getConnection();
    }
}