package ru.mirea.lab3.MathRandom;
import java.util.Random;
import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // просим вводить, пока не введёт натуральное число
        while (true) {
            System.out.print("Введите размер массива (натуральное число): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                } else {
                    System.out.println("Число должно быть больше 0, повторите ввод");
                }
            } else {
                System.out.println("Это не число, повторите ввод");
                sc.next();
            }
        }

        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1); // [0; n]
        }

        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // считаем количество чётных
        int countEven = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }

        int[] evenArr = new int[countEven];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[j] = arr[i];
                j++;
            }
        }

        System.out.print("Массив чётных элементов: ");
        if (countEven == 0) {
            System.out.println("чётных элементов нет");
        } else {
            for (int i = 0; i < evenArr.length; i++) {
                System.out.print(evenArr[i] + " ");
            }
            System.out.println();
        }
    }
}