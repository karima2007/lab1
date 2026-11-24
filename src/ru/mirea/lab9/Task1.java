package ru.mirea.lab9;



public class Task1 {

    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable key = list[i];
            int j = i - 1;

            // Сдвигаем элементы, которые больше key, вправо
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Создаем массив студентов (ID специально вразброс)
        Student[] students = {
                new Student(103, "Яков", 85),
                new Student(101, "Иван", 90),
                new Student(105, "Маша", 78),
                new Student(102, "Петр", 92)
        };

        System.out.println("До сортировки:");
        for (Student s : students) System.out.println(s);

        // Вызываем сортировку
        insertionSort(students);

        System.out.println("\nПосле сортировки по ID (вставками):");
        for (Student s : students) System.out.println(s);
    }
}