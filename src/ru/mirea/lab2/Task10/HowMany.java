package ru.mirea.lab2.Task10;
import java.util.Scanner;
public class HowMany {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слова через пробел:");
        String line = sc.nextLine();

        // Разбиваем строку по пробелам
        String[] words = line.split("\\s+");

        System.out.println("Вы ввели " + words.length + " слов.");

        sc.close();
    }
}