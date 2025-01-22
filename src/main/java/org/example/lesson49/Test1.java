package org.example.lesson49;

public class Test1 {
    public static void main(String[] args) {
        Animal animal = Animal.DOG;

        switch (animal) {
            case DOG:
                System.out.println("It's a dog");
                break;
            case FROG:
                System.out.println("It's a frog");
                break;
            default:
                System.out.println("It's not an animal");
        }

        Season season = Season.AUTUMN;
        switch (season) {
            case AUTUMN:
                System.out.println("AUTUMN");
                break;
            case SUMMER:
                System.out.println("SUMMER");
                break;
            case WINTER:
                System.out.println("WINTER");
                break;
            case SPRING:
                System.out.println("SPRING");
                break;
            default:
                System.out.println("It's not an season");
        }

        Animal animal2 = Animal.FROG;
        System.out.println(animal2);
    }
}
