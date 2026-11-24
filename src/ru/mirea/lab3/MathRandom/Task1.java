package ru.mirea.lab3.MathRandom;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        // Первый подход - Math.random()
        double[] arr1 = new double[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Math.random() * 100;
        }
        System.out.println("Массив 1 (Math.random):");
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Отсортированный:");
        System.out.println(Arrays.toString(arr1));

        // Второй подход - класс Random
        Random rand = new Random();
        double[] arr2 = new double[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextDouble() * 100;
        }
        System.out.println("\nМассив 2 (Random):");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Отсортированный:");
        System.out.println(Arrays.toString(arr2));
    }
}