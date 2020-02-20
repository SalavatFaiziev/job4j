package ru.job4j.tracker;

public class Predator extends Animal {
    public Predator(String name) {
        super(name);
        System.out.println("predator name");
    }

    public Predator() {
        System.out.println("predator object");
    }
}
