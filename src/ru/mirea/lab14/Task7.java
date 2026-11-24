package ru.mirea.lab14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task7 {
    public static void main(String[] args) {
        // Регулярное выражение:
        // (?=.*[A-Z]) - проверяет, что есть хотя бы одна заглавная буква
        // (?=.*[a-z]) - проверяет, что есть хотя бы одна строчная буква
        // (?=.*[0-9]) - проверяет, что есть хотя бы одна цифра
        // [a-zA-Z0-9_]{8,} - сам пароль: буквы, цифры, подчеркивание, длина от 8
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[a-zA-Z0-9_]{8,}$";

        // Примеры из задания
        String pass1 = "F032_Password"; // Правильный
        String pass2 = "TrySpy1";       // Правильный
        String pass3 = "smart_pass";    // Неправильный (нет заглавной и цифры)
        String pass4 = "A007";          // Неправильный (меньше 8 символов)

        Pattern pattern = Pattern.compile(regex);

        System.out.println("Пароль " + pass1 + " надежный? " + pattern.matcher(pass1).matches());
        System.out.println("Пароль " + pass2 + " надежный? " + pattern.matcher(pass2).matches());
        System.out.println("Пароль " + pass3 + " надежный? " + pattern.matcher(pass3).matches());
        System.out.println("Пароль " + pass4 + " надежный? " + pattern.matcher(pass4).matches());
    }
}
