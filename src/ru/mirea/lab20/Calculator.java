package ru.mirea.lab20;

public class Calculator {

    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        if (b.doubleValue() == 0) {
            System.out.println("Ошибка: деление на ноль!");
            return 0;
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Сложение (Integer + Double): " + Calculator.sum(5, 2.5));
        System.out.println("Умножение (Double * Integer): " + Calculator.multiply(2.5, 4));
        System.out.println("Деление (Integer / Float): " + Calculator.divide(10, 4.0f));
        System.out.println("Вычитание (Double - Integer): " + Calculator.subtraction(10.5, 3));
    }
}