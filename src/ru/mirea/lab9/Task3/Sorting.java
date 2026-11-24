package ru.mirea.lab9.Task3;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    // Задание 3 ПР №9: Слияние двух отсортированных списков
    public static SinglyLinkedList mergeSorted(SinglyLinkedList a, SinglyLinkedList b) {
        List<Student> la = a.toList();
        List<Student> lb = b.toList();

        // Итоговый объединенный список
        List<Student> merged = new ArrayList<>(la.size() + lb.size());

        int i = 0, j = 0;
        // Классический алгоритм слияния (Merge)
        while (i < la.size() && j < lb.size()) {
            if (la.get(i).compareTo(lb.get(j)) <= 0) {
                merged.add(la.get(i++));
            } else {
                merged.add(lb.get(j++));
            }
        }

        // Добавляем остатки, если один список закончился раньше
        while (i < la.size()) merged.add(la.get(i++));
        while (j < lb.size()) merged.add(lb.get(j++));

        // Перекладываем обратно в наш SinglyLinkedList
        SinglyLinkedList result = new SinglyLinkedList();
        for (Student s : merged) {
            result.add(s);
        }
        return result;
    }
}