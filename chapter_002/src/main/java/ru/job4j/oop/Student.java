package ru.job4j.oop;

public class Student {

    public void song(int k) {
        for (int i = 0; i < k; i++) {
            System.out.println("I believe I can fly");
        }
        if (k == 0) {
            System.out.println("booo");
        }
    }

    public void music(int k) {
        for (int i = 0; i < k; i++) {
            System.out.println("Tra tra tra");
        }
        if (k == 0) {
            System.out.println("no music today");
        }
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music(3);
        petya.song(3);
    }
}