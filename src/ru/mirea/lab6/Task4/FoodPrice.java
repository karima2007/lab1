package ru.mirea.lab6.Task4;

public class FoodPrice implements Priceable {
    double price;

    public FoodPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}