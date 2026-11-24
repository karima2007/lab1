package ru.mirea.lab8;



public class Task10 {
    // n -число, reverse - то, что мы собираем наоборот
    public static int reverseNumber(int n, int reverse) {
        // Базовый случай: если число закончилось, возвращаем результат
        if (n == 0) {
            return reverse;
        }
        // Шаг рекурсии: берем последнюю цифру (n % 10) и добавляем ее к нашему числу
        // А само n уменьшаем, отбрасывая последнюю цифру (n / 10)
        return reverseNumber(n / 10, reverse * 10 + (n % 10));
    }

    public static void main(String[] args) {
        int n = 12345;

        int result = reverseNumber(n, 0);
        System.out.println(result);
    }
}