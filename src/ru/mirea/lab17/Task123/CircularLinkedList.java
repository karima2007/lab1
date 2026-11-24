package ru.mirea.lab17.Task123;

import java.io.*;
import java.util.Scanner;

public class CircularLinkedList {
    private static class Node {
        Student data;
        Node next;
        Node(Student data) { this.data = data; }
    }

    private Node head; // У кольцевого списка last.next == head
    private int size;

    public CircularLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Student s) {
        Node n = new Node(s);
        if (head == null) {
            head = n;
            n.next = head; // ссылается сам на себя
        } else {
            Node cur = head;
            while (cur.next != head) {
                cur = cur.next;
            }
            cur.next = n;
            n.next = head;
        }
        size++;
    }

    public boolean remove(String name) {
        if (head == null) return false;

        Node cur = head;
        Node prev = null;

        do {
            if (cur.data.getName().equalsIgnoreCase(name)) {
                if (prev == null) {
                    // Удаляем первый элемент (head)
                    if (head.next == head) {
                        head = null; // Был единственный элемент
                    } else {
                        Node last = head;
                        while (last.next != head) last = last.next; // Находим хвост
                        head = head.next;
                        last.next = head;
                    }
                } else {
                    prev.next = cur.next;
                }
                size--;
                return true;
            }
            prev = cur;
            cur = cur.next;
        } while (cur != head);

        return false;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Node cur = head;
        do {
            cur.data.print();
            cur = cur.next;
        } while (cur != head); // Обход, пока не вернемся в начало
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void saveToFile(String fileName) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            if (head == null) return;
            Node cur = head;
            do {
                pw.println(cur.data.getName() + ";" + cur.data.getAge() + ";" + cur.data.getAverageGrade());
                cur = cur.next;
            } while (cur != head);
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