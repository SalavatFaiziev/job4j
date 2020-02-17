package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return (left > right) ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int max = Max.max(33, 2, 15, 212);
        System.out.println(max);
    }
}