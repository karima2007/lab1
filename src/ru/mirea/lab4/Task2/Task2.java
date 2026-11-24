package ru.mirea.lab4.Task2;

public class Task2 {
    public static void main(String[] args) {

        // Создаём массив со всеми типами одежды
        Clothes[] clothes = new Clothes[] {
                new TShirt(Size.L, 1500, "Белый"),
                new Pants(Size.M, 3000, "Черный"),
                new Skirt(Size.XS, 2000, "Красный"),
                new Tie(Size.S, 800, "Синий")
        };

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        System.out.println();
        atelier.dressMan(clothes);
    }
}


