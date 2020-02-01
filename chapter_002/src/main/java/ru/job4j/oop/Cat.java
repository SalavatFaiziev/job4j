package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println("Cat "  + this.name + " is eating " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();
        Cat black = new Cat();
        black.giveNick("black");
        black.eat("fish");
        black.show();
    }
}