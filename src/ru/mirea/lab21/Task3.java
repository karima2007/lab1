package ru.mirea.lab21;

public class Task3 {
    // Обобщенный метод, возвращающий элемент массива по индексу
    public static <T> T getElementAtIndex(T[] array, int index) {
        if (index >= 0 && index < array.length) {
            return array[index];
        } else {
            throw new IndexOutOfBoundsException("Индекс " + index + " вне границ массива");
        }
    }

    public static void main(String[] args) {
        String[] words = {"Apple", "Banana", "Cherry"};
        System.out.println("Элемент под индексом 1: " + getElementAtIndex(words, 1));

        Integer[] numbers = {10, 20, 30};
        System.out.println("Элемент под индексом 2: " + getElementAtIndex(numbers, 2));

        try {
            // Вызовет исключение, так как индекс 5 не существует
            System.out.println(getElementAtIndex(words, 5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}