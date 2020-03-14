package ru.job4j.io;
import java.util.*;

public class Matches {
    public static void main(String[] args) {
        int m = 11;
        String player = new String();
        String p1 = "Player 1";
        String p2 = "Player 2";
        Scanner input = new Scanner(System.in);
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        while (m > 0) {
           player = p1;
            System.out.println(player + ", enter 1 to 3 number");
            int choice = Integer.valueOf(input.nextLine());
            if (choice < 1 || choice > 3 || m - choice < 0) {
                System.out.println("bad number! player 2 turn");
            } else {
                m -= choice;
                System.out.println("Left matches: " + m);
            }
            if (m == 0) {
                break;
            }
            player = p2;
            System.out.println(player + ", enter 1 to 3 number");
                choice = Integer.valueOf(input.nextLine());
            if (choice < 1 || choice > 3 || m - choice < 0) {
                System.out.println("bad number! player 1 turn");
            } else {
                m -= choice;
                System.out.println("Left matches: " + m);
            }
        }
        System.out.println("Winner is " + player);
    }
}