package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("the bus is on way");
    }

    @Override
    public void passengers(int number) {
        System.out.println("passengers in the bus: " + number);
    }

    @Override
    public double fillFuel(double fuel) {
        double priceFuel = 46.85;
        return fuel * priceFuel;
    }
}