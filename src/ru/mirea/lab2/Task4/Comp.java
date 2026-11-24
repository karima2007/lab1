package ru.mirea.lab2.Task4;

public class Comp {

    private String name;
    private double price;

    public Comp(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Comp{" + name + ", " + price + " руб.}";
    }
}