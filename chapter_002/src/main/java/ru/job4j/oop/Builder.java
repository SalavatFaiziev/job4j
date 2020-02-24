package ru.job4j.oop;

public class Builder extends Engineer {
    public Builder(String name, String surname, String education, String bday) {
        super(name, surname, education, bday);
    }

    public Home build(Home home) {
        return home;
    }
}