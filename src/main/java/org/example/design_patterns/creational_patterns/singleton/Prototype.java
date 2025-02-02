package org.example.design_patterns.creational_patterns.singleton;

/**
 * Prototype (Прототип)
 * Помогает создать дублированный объект с лучшей производительностью,
 * вместо нового создается возвращаемый клон существующего объекта.
 */
// Абстрактный класс, который будет клонироваться
abstract class Report implements Cloneable {
    protected String content;

    public abstract void createReport(String userName);

    @Override
    protected Report clone() throws CloneNotSupportedException {
        return (Report) super.clone();
    }

    public String getContent() {
        return content;
    }
}

// Конкретная реализация отчета
class UserReport extends Report {

    @Override
    public void createReport(String userName) {
        this.content = "User report for " + userName;
    }
}

// Другой тип отчета
class AdminReport extends Report {

    @Override
    public void createReport(String userName) {
        this.content = "Admin report for " + userName;
    }
}

public class Prototype {
    public static void main(String[] args) {
        try {
            // Создаем шаблонный отчет для пользователя
            Report userReport = new UserReport();
            userReport.createReport("Anna Teremizova");

            // Клонируем отчет с помощью Prototype
            Report clonedUserReport = userReport.clone();
            System.out.println("Cloned User Report: " + clonedUserReport.getContent());

            // Создаем шаблонный отчет для администратора
            Report adminReport = new AdminReport();
            adminReport.createReport("Admin");

            // Клонируем отчет администратора
            Report clonedAdminReport = adminReport.clone();
            System.out.println("Cloned Admin Report: " + clonedAdminReport.getContent());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
