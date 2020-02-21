package ru.job4j.oop;

public class Builder extends Engineer {
    public Builder(String name, String surname, String education, String bday) {
        super(name, surname, education, bday);
        this.name = "Builder";
    }

    public Home build(Home home) {
        return home;
    }
}