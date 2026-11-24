package ru.mirea.lab4.Task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка. Размер: " + size +
                ", Евро: " + size.getEuroSize() +
                ", Цвет: " + color + ", Цена: " + cost);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка. Размер: " + size +
                ", Евро: " + size.getEuroSize() +
                ", Цвет: " + color + ", Цена: " + cost);
    }
}
