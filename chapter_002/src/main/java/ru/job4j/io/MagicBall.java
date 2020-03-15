package ru.job4j.io;
import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String q = input.nextLine();
        int answer = new Random().nextInt(3);
        String s = answer == 0 ? "Да" : (answer > 1 ? "Может быть" : "Нет");
        System.out.println(s);
    }
}
