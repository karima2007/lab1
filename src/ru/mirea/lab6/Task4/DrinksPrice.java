package ru.mirea.lab6.Task4;

public class DrinksPrice implements Priceable {
    double price;

    public DrinksPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
