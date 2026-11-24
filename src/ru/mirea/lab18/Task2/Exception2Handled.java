package ru.mirea.lab18.Task2;

import java.util.Scanner;

public class Exception2Handled {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Введено не целое число: " + intString);
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль");
        }
    }
}
