package ru.mirea.lab8;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        printOddNumbers();
    }

    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // Читаем число

        // Базовый случай: если ввели 0, прекращаем рекурсию
        if (num == 0) {
            return;
        }

        // Если число нечетное, выводим его на экран
        if (num % 2 != 0) {
            System.out.println(num);
        }

        // Шаг рекурсии: вызываем функцию снова, чтобы прочитать следующее число
        printOddNumbers();
    }
}