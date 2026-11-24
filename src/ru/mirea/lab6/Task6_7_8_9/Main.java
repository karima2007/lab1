package ru.mirea.lab6.Task6_7_8_9;

public class Main {
    public static void main(String[] args) {
        Printable[] items = new Printable[4];
        items[0] = new Book("Лавка древностей");
        items[1] = new Shop("Пятёрочка");
        items[2] = new Book("Повелитель мух");
        items[3] = new Shop("Дикси");

        for (int i = 0; i < items.length; i++) {
            items[i].print();
        }
    }
}