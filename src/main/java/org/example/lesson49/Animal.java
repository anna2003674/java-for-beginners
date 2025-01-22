package org.example.lesson49;

public enum Animal {
    DOG("собака"), FROG("лягушка"), CAT("кошка");

    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Перевод на русский язык: " + translation;
    }
}
