package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load += another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(100);
        Battery two = new Battery(500);
        System.out.println("first : " + one.load + ". second : " + two.load);
        one.exchange(two);
        System.out.println("first : " + one.load + ". second : " + two.load);
    }
}