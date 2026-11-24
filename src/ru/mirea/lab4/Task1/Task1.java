package ru.mirea.lab4.Task1;

public class Task1 {

    public static void main(String[] args) {

        // 1) Создать переменную с любимым временем года и распечатать всю информацию о нем
        Season favorite = Season.SUMMER;
        System.out.println("Мое любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemperature());
        System.out.println("Описание: " + favorite.getDescription());


        // 2) Метод со switch
        printSeason(favorite);
        printSeason(Season.WINTER);


        // 6) В цикле распечатать все времена года, среднюю температуру и описание
        for (Season s : Season.values()) {
            System.out.println("Время года: " + s);
            System.out.println("Средняя температура: " + s.getAverageTemperature());
            System.out.println("Описание: " + s.getDescription());
            System.out.println();
        }
    }

    // Метод для задания 2
    public static void printSeason(Season season) {
        switch (season) {
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}