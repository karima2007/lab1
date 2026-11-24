package ru.mirea.lab13;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку со словами (например: i came, i saw, i conquered; to be or not to be that is the question):");
        String line = scanner.nextLine();

        String result = getLine(line);
        System.out.println("Результат: " + result);
    }

    // Метод расставляет слова так, чтобы последняя буква совпадала с первой следующего
    public static String getLine(String line) {
        if (line == null || line.isEmpty()) return "";

        // Разбиваем на слова по пробелам
        String[] words = line.split("\\s+");
        StringBuilder result = new StringBuilder();
        boolean[] used = new boolean[words.length];

        // Начинаем с самого первого слова в массиве
        String currentWord = words[0];
        result.append(currentWord).append(" ");
        used[0] = true;
        int count = 1;

        // Ищем подходящие слова, пока не соберем все
        while (count < words.length) {
            // Берем последнюю букву текущего слова (в нижнем регистре)
            char lastChar = Character.toLowerCase(currentWord.charAt(currentWord.length() - 1));
            boolean found = false;

            for (int i = 0; i < words.length; i++) {
                if (!used[i]) {
                    // Берем первую букву проверяемого слова (в нижнем регистре)
                    char firstChar = Character.toLowerCase(words[i].charAt(0));

                    if (firstChar == lastChar) {
                        currentWord = words[i];
                        result.append(currentWord).append(" ");
                        used[i] = true;
                        count++;
                        found = true;
                        break; // Нашли подходящее слово, переходим к следующему шагу
                    }
                }
            }
            // Если подходящего слова нет, прерываем (чтобы не зависнуть)
            if (!found) break;
        }

        return result.toString().trim();
    }
}
