package ru.mirea.lab1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("введите кол элем массива: ");
        int n = s.nextInt();
        if (n <= 0) { System.out.println("массив пустой"); return; }
        int[] arr = new int[n];

        int i = 0;
        while (i<n) {

            arr[i] = s.nextInt();
            i = i + 1;
        }

        int sum = 0;
        int max = arr[0];
        int min = arr[0];

        int j = 0;
        do {
            sum = sum + arr[j];

            if (arr[j] > max) {
                max = arr[j];
            }

            if (arr[j] < min) {
                min = arr[j];
            }

            j = j + 1;
        } while (j < n);

        System.out.println("сумма: " + sum);
        System.out.println("макс: " + max);
        System.out.println("мин: " + min);

        s.close();

    }
}
