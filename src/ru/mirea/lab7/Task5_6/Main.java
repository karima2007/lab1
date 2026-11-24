package ru.mirea.lab7.Task5_6;


public class Main {
    public static void main(String[] args) {
        ProcessStrings ps = new ProcessStrings();
        String text = "Программирование";

        System.out.println("Символов: " + ps.countChars(text));
        System.out.println("Нечётные позиции: " + ps.oddPositions(text));
        System.out.println("Инверсия: " + ps.reverse(text));
    }
}