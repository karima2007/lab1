package ru.mirea.lab6.Task6_7_8_9;

public class Shop implements Printable {
    String name;

    public Shop(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("магазин: " + name);
    }
}
