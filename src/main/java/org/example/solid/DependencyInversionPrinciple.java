package org.example.solid;

/**
 * Модули должны зависеть от абстракций, а не от конкретных реализаций.
 */
interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Подключение к MySQL");
    }
}

class PostgreSQLDatabase implements Database {
    public void connect() {
        System.out.println("Подключение к PostgreSQL");
    }
}

class Service {
    private Database database;

    Service(Database database) {
        this.database = database;
    }

    void doWork() {
        database.connect();
    }
}

public class DependencyInversionPrinciple {
}
