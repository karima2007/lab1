package ru.mirea.lab19.Task1;

public class InnValidator {
    public static void validateInn(String inn) throws InvalidInnException {
        if (inn == null || !inn.matches("\\d{10}|\\d{12}")) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
        System.out.println("ИНН действителен: " + inn);
    }
}