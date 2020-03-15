package ru.job4j.io;
import java.util.*;

public class Matches {
    public static int chooseMatches(String player) {
        System.out.println(player + ", enter 1 to 3 number");
        Scanner input = new Scanner(System.in);
        int choice = Integer.valueOf(input.nextLine());
        while (choice < 1 || choice > 3) {
            System.out.println("bad number! try again");
            choice = Integer.valueOf(input.nextLine());
        }
        return choice;
    }

    public static int counterMatches(int count, int input) {
     if (count - input < 0) {
         System.out.println("not enough matches, try lesser number");
     } else {
         count -= input;
         System.out.println("left matches: " + count);
     }
        if (count == 0) {
            System.out.println("Game over!");
        }
     return count;

    }

    public static void main(String[] args) {
        String p1 = "Player 1";
        String p2 = "Player 2";
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        int matches = 11;
        while (matches > 0) {
            matches = counterMatches(matches, chooseMatches(p1));
            if (matches == 0) {
                System.out.println("Winner is " + p1);
                break;
            }
            matches = counterMatches(matches, chooseMatches(p2));
            if (matches == 0) {
                System.out.println("Winner is " + p2);
            }
        }
    }
}