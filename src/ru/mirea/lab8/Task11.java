package ru.mirea.lab8;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        // Основная программа только вызывает функцию
        System.out.println(countOnes());
    }
    //возврат int, а не void,из-за запрета на глобальные переменные и параметры — это единственный легальный способ
    // протащить счетчик через рекурсию.
    public static int countOnes() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // Читаем первое число

        // Если это 0, проверяем следующее. Если и оно 0 - останавливаемся.
        if (num == 0) {
            int next = scanner.nextInt();
            if (next == 0) {
                return 0; // Базовый случай: два нуля подряд
            } else if (next == 1) {
                return 1 + countOnes();
            } else {
                return countOnes();
            }
        }

        // Шаг рекурсии: если число 1, прибавляем 1 к результату и идем дальше
        if (num == 1) {
            return 1 + countOnes();
        } else {
            return countOnes();
        }
    }
}