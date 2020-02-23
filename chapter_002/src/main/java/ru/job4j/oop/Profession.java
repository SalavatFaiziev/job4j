package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String bday;

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