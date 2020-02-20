package ru.job4j.tracker;

public class Tiger extends Predator {
    public Tiger(String name) {
        super(name);
        System.out.println("tiger name");
    }

    public Tiger() {
        System.out.println("tiger object");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("tiger");
    }
}
