package org.example.oop;

public class ClassesAndObjects {
    public static void main(String[] args) {
        People people1 = new People();
        people1.setName("Роман");
        people1.setAge(18);
        people1.speak();
        people1.sayHello();

        People people2 = new People();
        people2.setName("Вова");
        people2.setAge(20);
        people2.speak();
        people1.calculateYearsToRetirement();
        people2.calculateYearsToRetirement();

        int yearsPeople1 = people1.calculateYearsToRetirementTwo();
        int yearsPeople2 = people2.calculateYearsToRetirementTwo();
        System.out.println("People1 " + yearsPeople1 + " лет");
        System.out.println("People2 " + yearsPeople2 + " лет");

        People people3 = new People();
        people3.setNameAnaAge("Anna", 21);
        System.out.println(people3.getAge() + " " + people3.getName());
    }
}

class People {
    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Ты ввел пустое имя");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void setNameAnaAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void calculateYearsToRetirement() {
        int years = 65 - age;
        System.out.println("Количество лет до пенсии: " + years);
    }

    int calculateYearsToRetirementTwo() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Меня зовут " + name + " мне " + age + " лет");
    }

    void sayHello() {
        System.out.println("Привет");
    }
}
