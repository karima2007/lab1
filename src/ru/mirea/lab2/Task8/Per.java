package ru.mirea.lab2.Task8;
import java.util.Scanner;
public class Per {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // Переворачиваем без дополнительного массива
        for (int i = 0; i < n / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("Перевёрнутый массив:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}