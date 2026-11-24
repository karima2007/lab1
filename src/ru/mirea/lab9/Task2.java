package ru.mirea.lab9;

import java.util.Comparator;

// Класс, реализующий Comparator (как сказано в задании)
class SortingStudentsByGPA implements Comparator<Student> {

    // Сортируем по убыванию (поэтому other.gpa - student1.gpa)
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getGpa(), s1.getGpa());
    }

    // Алгоритм быстрой сортировки (Quick Sort) из методички (стр. 2)
    public void quickSort(Student[] list, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(list, low, high, comparator);
            quickSort(list, low, pi - 1, comparator);
            quickSort(list, pi + 1, high, comparator);
        }
    }

    // Вспомогательный метод для разделения массива
    private int partition(Student[] list, int low, int high, Comparator<Student> comparator) {
        Student pivot = list[high]; // Опорный элемент (берем последний)
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            // Если текущий элемент должен стоять ДО опорного (по нашему компаратору)
            if (comparator.compare(list[j], pivot) < 0) {
                i++;
                // Меняем местами
                Student temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        // Ставим опорный элемент на правильное место
        Student temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }
}

// Отдельный класс для запуска 2 задания
public class Task2 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1, "Иван", 75),
                new Student(2, "Яков", 95),
                new Student(3, "Петр", 80),
                new Student(4, "Маша", 88)
        };

        System.out.println("До сортировки:");
        for (Student s : students) System.out.println(s);

        // Создаем объект нашего класса-сортировщика
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();

        // Вызываем быструю сортировку
        sorter.quickSort(students, 0, students.length - 1, sorter);

        System.out.println("\nПосле сортировки по баллам (QuickSort, убывание):");
        for (Student s : students) System.out.println(s);
    }
}