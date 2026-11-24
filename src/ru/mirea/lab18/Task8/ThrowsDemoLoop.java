package ru.mirea.lab18.Task8;

import java.util.Scanner;

public class ThrowsDemoLoop {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            System.out.print("Введите ключ: ");
            String key = myScanner.next();
            try {
                printDetails(key);
                success = true;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage() + ". Попробуйте ещё раз.");
            }
        }
        myScanner.close();
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}