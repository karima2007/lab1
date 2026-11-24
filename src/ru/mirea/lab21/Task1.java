package ru.mirea.lab21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    // Обобщенный метод для конвертации массива любого типа в список
    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {
        // Тест 1: Массив чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> intList = convertArrayToList(intArray);
        System.out.println("Список чисел: " + intList);

        // Тест 2: Массив строк
        String[] strArray = {"Java", "Generics", "Type Erasure"};
        List<String> strList = convertArrayToList(strArray);
        System.out.println("Список строк: " + strList);
    }
}