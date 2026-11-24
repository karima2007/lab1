package ru.mirea.lab9.Task3;

public class Test {
    public static void main(String[] args) {
        System.out.println("Задание 3 ПР №9: Слияние двух списков");

        // 1. Создаем первый список (уже отсортированный по ID)
        SinglyLinkedList listA = new SinglyLinkedList();
        listA.add(new Student("Анна",   1, 4.5));
        listA.add(new Student("Борис",  3, 3.8));
        listA.add(new Student("Вера",   7, 4.9));

        // 2. Создаем второй список (тоже отсортированный по ID)
        SinglyLinkedList listB = new SinglyLinkedList();
        listB.add(new Student("Глеб",   2, 3.3));
        listB.add(new Student("Дина",   4, 4.1));
        listB.add(new Student("Егор",   9, 3.0));

        System.out.println("\nСписок A (по ID):");
        listA.printAll();

        System.out.println("\nСписок B (по ID):");
        listB.printAll();

        // 3. Выполняем слияние
        SinglyLinkedList mergedList = Sorting.mergeSorted(listA, listB);

        // 4. Выводим результат
        System.out.println("\nРезультат слияния (отсортировано по ID):");
        mergedList.printAll();
        System.out.println("Всего элементов: " + mergedList.getSize());
    }
}