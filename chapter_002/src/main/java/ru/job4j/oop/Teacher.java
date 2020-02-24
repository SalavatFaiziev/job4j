package ru.job4j.oop;

public class Teacher extends Profession {
    public Teacher(String name, String surname, String education, String bday) {
        super(name, surname, education, bday);
    }

    public Lesson teach(Lesson lesson) {
        return lesson;
    }
}