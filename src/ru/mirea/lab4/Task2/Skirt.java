package ru.mirea.lab4.Task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка. Размер: " + size +
                ", Евро: " + size.getEuroSize() +
                ", Цвет: " + color + ", Цена: " + cost);
    }
}
