package ru.mirea.lab4.Task2;

public class Atelier {


    // Метод выводит информацию только о женской одежде
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда");
        for (Clothes c : clothes) {
            // проверяем, реализует ли объект интерфейс WomenClothing
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
            }
        }
    }

    // Метод выводит информацию только о мужской одежде
    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMan();
            }
        }
    }
}