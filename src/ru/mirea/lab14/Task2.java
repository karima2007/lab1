package ru.mirea.lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task2 {
    public static void main(String[] args) {
        // Шаблон: просто пишем нужную строку. Спецсимволов нет, поэтому регулярка простая.
        String regex = "abcdefghijklmnopqrstuv18340";

        // Правильные и неправильные примеры из задания
        String correctStr = "abcdefghijklmnopqrstuv18340";
        String wrongStr = "abcdefghijklmnoasdfasdpqrstuv18340";

        Pattern pattern = Pattern.compile(regex);

        // Проверяем правильную строку
        Matcher matcher1 = pattern.matcher(correctStr);
        System.out.println("Строка '" + correctStr + "' подходит? " + matcher1.matches());

        // Проверяем неправильную строку
        Matcher matcher2 = pattern.matcher(wrongStr);
        System.out.println("Строка '" + wrongStr + "' подходит? " + matcher2.matches());
    }
}