package ru.mirea.lab21;

import java.util.Arrays;

public class Task2<T> {
    private T[] array;

    // Конструктор принимает массив обобщенного типа
    public Task2(T[] array) {
        this.array = array;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public T[] getArray() {
        return array;
    }

    public static void main(String[] args) {
        // Хранение массива Integer
        Integer[] ints = {1, 2, 3};
        Task2<Integer> intHolder = new Task2<>(ints);
        System.out.print("Массив Integer: ");
        intHolder.printArray();

        // Хранение массива Long
        Long[] longs = {100L, 200L, 300L};
        Task2<Long> longHolder = new Task2<>(longs);
        System.out.print("Массив Long: ");
        longHolder.printArray();

        // Хранение массива String
        String[] strings = {"A", "B", "C"};
        Task2<String> strHolder = new Task2<>(strings);
        System.out.print("Массив String: ");
        strHolder.printArray();
    }
}