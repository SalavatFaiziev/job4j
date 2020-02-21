package ru.job4j.oop;

public class Profession {
    public String name;
    public String surname;
    public String education;
    public String bday;

    public Profession(String name, String surname, String education, String bday) {
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEducation() {
        return this.education;
    }

    public String getBday() {
        return this.bday;
    }
}