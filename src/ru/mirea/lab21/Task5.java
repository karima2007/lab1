package ru.mirea.lab21;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task5 {

    // Обобщенный метод для создания ArrayList
    public static <T> ArrayList<T> newArrayList(T... elements) {
        ArrayList<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    // Обобщенный метод для создания HashSet
    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        for (T element : elements) {
            set.add(element);
        }
        return set;
    }

    // Обобщенный метод для создания HashMap
    public static <K, V> HashMap<K, V> newHashMap(K key, V value) {
        HashMap<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    public static void main(String[] args) {
        // Тестируем newArrayList
        ArrayList<String> list = Task5.newArrayList("A", "B", "C");
        System.out.println("ArrayList: " + list);

        // Тестируем newHashSet (дубликаты исчезнут)
        HashSet<Integer> set = Task5.newHashSet(1, 2, 2, 3, 3, 3);
        System.out.println("HashSet: " + set);

        // Тестируем newHashMap
        HashMap<String, Integer> map = Task5.newHashMap("Возраст", 20);
        System.out.println("HashMap: " + map);
    }
}