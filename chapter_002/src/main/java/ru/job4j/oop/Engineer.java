package ru.job4j.oop;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, String bday) {
        super(name, surname, education, bday);
        this.name = "Engineer";
    }
}
