package ru.mirea.lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task3 {
    public static void main(String[] args) {
        // Текст с ценами (взяты примеры из задания)
        String text = "Цены в магазине: 25.98 USD, 100.50 RUB, 44 ERR, 0.004 EU, 300 RUB.";

        // Регулярное выражение:
        // \d+ - одна или более цифр (целая часть)
        // \. - точка (экранируем обратным слешем)
        // \d{2} - ровно две цифры после точки (копейки/центы)
        // \s+ - пробел
        // (USD|RUB|EU) - валюта (одна из трех)
        String regex = "\\d+\\.\\d{2}\\s+(USD|RUB|EU)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        // Метод find() ищет по всему тексту
        while (matcher.find()) {
            System.out.println(matcher.group()); // Выводим найденное совпадение
        }
    }
}