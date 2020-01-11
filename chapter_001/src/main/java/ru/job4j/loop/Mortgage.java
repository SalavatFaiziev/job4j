package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double mg = amount;
        while (mg > 0) {
            mg += (mg * percent / 100) - salary;
            year++;
        }
        return year;
    }
}