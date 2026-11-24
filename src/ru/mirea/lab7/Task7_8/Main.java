package ru.mirea.lab7.Task7_8;

public class Main {
    public static void main(String[] args) {
        Printable[] items = new Printable[4];
        items[0] = new Book("Война и мир", "Л. Н. Толстой", 1863);
        items[1] = new Journal("ЛЮК");
        items[2] = new Book("Лавка древностей", "Ч. Диккенс", 1840);
        items[3] = new Magazine("Свет");

        System.out.println("только книги");
        Book.printBooks(items);

        System.out.println("только журналы");
        Magazine.printMagazines(items);
    }
}
