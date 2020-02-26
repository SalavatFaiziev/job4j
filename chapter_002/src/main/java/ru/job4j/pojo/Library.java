package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cc = new Book("Clean code", 897);
        Book math = new Book("Math", 375);
        Book hist = new Book("History", 753);
        Book bio = new Book("Biology", 584);

        Book[] books = new Book[]{cc, math, hist, bio};

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " - " + b.getCount());
        }

        System.out.println("0 to 3" + System.lineSeparator());

        Book t = books[0];
        books[0] = books[3];
        books[3] = t;

        for (int i = 0; i < books.length; i++) {
            Book b = books[i];
            System.out.println(b.getName() + " - " + b.getCount());
        }

        System.out.println();

        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " - " + books[i].getCount());
            }
        }
    }
}
