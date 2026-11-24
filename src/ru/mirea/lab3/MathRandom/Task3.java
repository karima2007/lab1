package ru.mirea.lab3.MathRandom;
import java.util.Random;
public class Task3 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(90) + 10; // [10;99]
        }

        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean isIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является строго возрастающей последовательностью");
        }
    }
}