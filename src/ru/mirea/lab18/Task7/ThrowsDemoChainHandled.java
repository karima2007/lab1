package ru.mirea.lab18.Task7;

import java.util.Scanner;

public class ThrowsDemoChainHandled {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        String key = myScanner.next();
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Ошибка перехвачена: " + e.getMessage());
        }
    }

    // ВОТ ЗДЕСЬ НУЖНО ДОБАВИТЬ throws Exception
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e; // Пробрасываем исключение дальше
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
}