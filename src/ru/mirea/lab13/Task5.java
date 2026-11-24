package ru.mirea.lab13;

public class Task5 {
    public static void main(String[] args) {
        String phone1 = "+79014051009"; // Формат: +<Код страны><10 цифр>
        String phone2 = "89014051009";  // Формат: 8<10 цифр> для РФ

        System.out.println("Исходный: " + phone1 + " -> Формат: " + formatPhone(phone1));
        System.out.println("Исходный: " + phone2 + " -> Формат: " + formatPhone(phone2));
    }

    public static String formatPhone(String phone) {
        String countryCode;
        String mainNumber;

        // Если начинается на +, то отделяем код страны
        if (phone.startsWith("+")) {
            // Код страны — это всё, что стоит до последних 10 цифр
            countryCode = phone.substring(0, phone.length() - 10);
            mainNumber = phone.substring(phone.length() - 10);
        } else {
            // Если начинается на 8, то это Россия (код +7)
            countryCode = "+7";
            mainNumber = phone.substring(1); // Отбрасываем 8
        }

        // Разбиваем основные 10 цифр: 3, 3 и 4
        String part1 = mainNumber.substring(0, 3);
        String part2 = mainNumber.substring(3, 6);
        String part3 = mainNumber.substring(6, 10);

        // Собираем в нужный формат
        return countryCode + "<" + part1 + "><" + part2 + "><" + part3 + ">";
    }
}