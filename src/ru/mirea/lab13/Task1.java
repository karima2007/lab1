package ru.mirea.lab13;

public class Task1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println("Исходная строка: " + str);

        // 2. Последний символ
        System.out.println("Последний символ: " + str.charAt(str.length() - 1));

        // 3. Заканчивается на "!!!"
        System.out.println("Заканчивается на '!!!': " + str.endsWith("!!!"));

        // 4. Начинается на "I like"
        System.out.println("Начинается на 'I like': " + str.startsWith("I like"));

        // 5. Содержит "Java"
        System.out.println("Содержит 'Java': " + str.contains("Java"));

        // 6. Позиция "Java"
        System.out.println("Позиция 'Java': " + str.indexOf("Java"));

        // 7. Заменить "а" на "о" (английскую a на o)
        System.out.println("Замена 'a' на 'o': " + str.replace('a', 'o'));

        // 8. Верхний регистр
        System.out.println("Верхний регистр: " + str.toUpperCase());

        // 9. Нижний регистр
        System.out.println("Нижний регистр: " + str.toLowerCase());

        // 10. Вырезать "Java"
        int start = str.indexOf("Java");
        System.out.println("Вырезать 'Java': " + str.substring(start, start + 4));
    }
}