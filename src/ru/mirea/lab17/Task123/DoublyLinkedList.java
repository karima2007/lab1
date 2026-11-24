package ru.mirea.lab17.Task123;

import java.io.*;
import java.util.Scanner;

public class DoublyLinkedList {
    private static class Node {
        Student data;
        Node prev;
        Node next;
        Node(Student data) { this.data = data; }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Добавление в конец (используем tail для скорости)
    public void add(Student s) {
        Node n = new Node(s);
        if (head == null) {
            head = tail = n;
        } else {
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public boolean remove(String name) {
        Node cur = head;
        while (cur != null && !cur.data.getName().equalsIgnoreCase(name)) {
            cur = cur.next;
        }
        if (cur == null) return false;

        if (cur.prev != null) cur.prev.next = cur.next;
        else head = cur.next; // удаляем первый элемент

        if (cur.next != null) cur.next.prev = cur.prev;
        else tail = cur.prev; // удаляем последний элемент

        size--;
        return true;
    }

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

    // Дополнительный метод: вывод в обратном порядке (демонстрация двусвязности)
    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node cur = tail;
        while (cur != null) {
            cur.data.print();
            cur = cur.prev;
        }
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void saveToFile(String fileName) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            Node cur = head;
            while (cur != null) {
                pw.println(cur.data.getName() + ";" + cur.data.getAge() + ";" + cur.data.getAverageGrade());
                cur = cur.next;
            }
        }
    }

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
