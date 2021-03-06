package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int eurToRub(int value) {
        return value * 70;
    }

    public static int usdToRub(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rub are 2 euro. Test result : " + passed + "\n");
        in = 180;
        expected = 3;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("180 rub are 3 usd. Test result : " + passed + "\n");
        in = 8;
        expected = 560;
        out = eurToRub(in);
        passed = expected == out;
        System.out.println("8 euro are 560 rub. Test result : " + passed + "\n");
        in = 10;
        expected = 600;
        out = usdToRub(in);
        passed = expected == out;
        System.out.println("10 usd are 600 rub. Test result : " + passed + "\n");
    }
}
