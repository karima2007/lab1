package ru.mirea.lab6.Task4;

public class Main {
    public static void main(String[] args) {
        Priceable b = new FoodPrice(500.0);
        Priceable p = new DrinksPrice(300.0);

        System.out.println("цена еды: " + b.getPrice());
        System.out.println("цена напитков: " + p.getPrice());
    }
}
