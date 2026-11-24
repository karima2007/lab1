package ru.mirea.lab9.Task3;




import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinglyLinkedList {
    // Внутренний класс Узел
    private static class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() { return head == null; }

    public int getSize() { return size; }

    // Добавление в конец
    public void add(Student s) {
        Node n = new Node(s);
        if (head == null) {
            head = n;
        } else {
            Node cur = head;
            while (cur.next != null) cur = cur.next;
            cur.next = n;
        }
        size++;
    }

    // Удаление по ID
    public boolean remove(int id) {
        if (head == null) return false;
        if (head.data.getIdNumber() == id) {
            head = head.next;
            size--;
            return true;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.data.getIdNumber() == id) {
                cur.next = cur.next.next;
                size--;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // Вывод на экран
    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node cur = head;
        while (cur != null) {
            cur.data.print();
            cur = cur.next;
        }
    }

    // Очистка
    public void clear() {
        head = null;
        size = 0;
    }

    // Сохранение в файл
    public void saveToFile(String fileName) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            Node cur = head;
            while (cur != null) {
                pw.println(cur.data.toString());
                cur = cur.next;
            }
        }
    }

    // Загрузка из файла
    public void loadFromFile(String fileName) throws IOException {
        clear();
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;
                String[] p = line.split(";");
                add(new Student(p[1], Integer.parseInt(p[0]), Double.parseDouble(p[2])));
            }
        }
    }

    // Метод для получения элементов списка в виде обычного java.util.List
    public List<Student> toList() {
        List<Student> res = new ArrayList<>();
        Node cur = head;
        while (cur != null) {
            res.add(cur.data);
            cur = cur.next;
        }
        return res;
    }
}