package ru.job4j.oop;

public class Doctor extends Profession {
    public Doctor(String name, String surname, String education, String bday) {
        super(name, surname, education, bday);
        this.name = "Doctor";
    }

    public Diagnose heal(Patient patient) {
        Diagnose diagnose = new Diagnose();
        return diagnose;
    }
}