package ru.mirea.lab10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA {

    // Массив (список) студентов
    private List<Student> iDNumber = new ArrayList<>();

    // 1) Метод заполнения массива (создаем тестовых студентов)
    public void setArray() {
        iDNumber.add(new Student("Карима", "Кадырова", "Экономика", 2, "П-21", 75));
        iDNumber.add(new Student("Лика", "Смирнова", "Дизайн", 1, "Д-11", 95));
        iDNumber.add(new Student("Иван", "Петров", "Программирование", 3, "П-31", 82));
        iDNumber.add(new Student("Мария", "Пак", "Экономика", 2, "Э-21", 88));
    }

    // 3) Метод вывода массива на экран
    public void outArray(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    // СОРТ (Задание 2)

    // Компаратор для сортировки по среднему баллу (по убыванию)
    Comparator<Student> compareByGpa = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s2.getGpa(), s1.getGpa()); // Убывание
        }
    };

    // Компаратор по другому полю (например, по Фамилии)
    Comparator<Student> compareBySurname = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getSurname().compareTo(s2.getSurname());
        }
    };

    // Быстрая сортировка (QuickSort)
    public void quickSort(List<Student> list, int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pi = partition(list, low, high, comp);
            quickSort(list, low, pi - 1, comp);
            quickSort(list, pi + 1, high, comp);
        }
    }

    private int partition(List<Student> list, int low, int high, Comparator<Student> comp) {
        Student pivot = list.get(high);
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comp.compare(list.get(j), pivot) < 0) {
                i++;
                Student temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        Student temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return i + 1;
    }

    // Сортировка слиянием (MergeSort)
    public void mergeSort(List<Student> list, Comparator<Student> comp) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            List<Student> left = new ArrayList<>(list.subList(0, mid));
            List<Student> right = new ArrayList<>(list.subList(mid, list.size()));

            mergeSort(left, comp);
            mergeSort(right, comp);

            merge(list, left, right, comp);
        }
    }

    private void merge(List<Student> list, List<Student> left, List<Student> right, Comparator<Student> comp) {
        int i = 0, j = 0, k = 0;
        while (i < left.size() && j < right.size()) {
            if (comp.compare(left.get(i), right.get(j)) <= 0) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) list.set(k++, left.get(i++));
        while (j < right.size()) list.set(k++, right.get(j++));
    }

    //ОБЪЕДИН ДВУХ СПИСКОВ (Задание 3)
    public List<Student> mergeTwoLists(List<Student> list1, List<Student> list2, Comparator<Student> comp) {
        List<Student> result = new ArrayList<>(list1);
        result.addAll(list2);
        mergeSort(result, comp); // Сортируем объединенный список слиянием
        return result;
    }

    //ГЛАВ МЕТОД
    public static void main(String[] args) {
        SortingStudentsByGPA tester = new SortingStudentsByGPA();

        System.out.println("=== Задание 1 и 2: Исходный массив ===");
        tester.setArray();
        tester.outArray(tester.iDNumber);

        System.out.println("\n=== Сортировка по среднему баллу (QuickSort) ===");
        tester.quickSort(tester.iDNumber, 0, tester.iDNumber.size() - 1, tester.compareByGpa);
        tester.outArray(tester.iDNumber);

        System.out.println("\n=== Сортировка по фамилии (MergeSort) - доп. поле из задания 2 ===");
        tester.mergeSort(tester.iDNumber, tester.compareBySurname);
        tester.outArray(tester.iDNumber);

        // Проверка Задания 3 (объединение)
        System.out.println("\n=== Задание 3: Объединение двух списков ===");
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Алексей", "Сидоров", "Физика", 1, "Ф-11", 70));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Ольга", "Соколова", "Химия", 2, "Х-21", 90));

        List<Student> merged = tester.mergeTwoLists(list1, list2, tester.compareByGpa);
        System.out.println("Объединенный и отсортированный список:");
        tester.outArray(merged);

        // Использование цепочки компараторов
        System.out.println("\n=== Цепочка компараторов (thenComparing) ===");
        Comparator<Student> complexComp = tester.compareByGpa.thenComparing(tester.compareBySurname);
        tester.iDNumber.sort(complexComp);
        tester.outArray(tester.iDNumber);
    }
}