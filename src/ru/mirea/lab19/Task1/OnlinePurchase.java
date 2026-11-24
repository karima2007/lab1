package ru.mirea.lab19.Task1;

import java.util.Scanner;

public class OnlinePurchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();
        System.out.print("Введите ИНН: ");
        String inn = scanner.next();
        try {
            InnValidator.validateInn(inn);
            System.out.println("Заказ оформлен для " + fullName);
        } catch (InvalidInnException e) {
            System.out.println("Ошибка оформления заказа: " + e.getMessage());
        }
        scanner.close();
    }
}