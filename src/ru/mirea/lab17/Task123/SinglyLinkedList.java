package ru.mirea.lab17.Task123;

import java.io.*;
import java.util.Scanner;

public class SinglyLinkedList {
    private static class Node {
        Student data;
        Node next;
        Node(Student data) { this.data = data; }
    }

    private Node head;
    private int size;

    // a. Функция создания пустого списка (конструктор)
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    // f. Функция проверки списка на пустоту
    public boolean isEmpty() {
        return head == null;
    }

    // b. Функция добавления элемента
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

    // c. Функция удаления элемента (по имени)
    public boolean remove(String name) {
        if (head == null) return false;
        if (head.data.getName().equalsIgnoreCase(name)) {
            head = head.next;
            size--;
            return true;
        }
        Node cur = head;
        while (cur.next != null) {
            if (cur.next.data.getName().equalsIgnoreCase(name)) {
                cur.next = cur.next.next;
                size--;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    // d. Функция вывода элемента (узла) списка на экран
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

    // e. Функция очистки списка
    public void clear() {
        head = null;
        size = 0;
    }

    // g. Функция записи списка в файл
    public void saveToFile(String fileName) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            Node cur = head;
            while (cur != null) {
                pw.println(cur.data.getName() + ";" + cur.data.getAge() + ";" + cur.data.getAverageGrade());
                cur = cur.next;
            }
        }
    }

    // h. Функция чтения списка из файла
    public void loadFromFile(String fileName) throws IOException {
        clear();
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;
                String[] p = line.split(";");
                add(new Student(p[0], Integer.parseInt(p[1]), Double.parseDouble(p[2])));
            }
        }
    }
}