package ru.mirea.lab9.Task3;

import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String name;
    private int idNumber;
    private double gpa;

    public Student(String name, int idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    // Конструктор по умолчанию для чтения с консоли
    public Student() {
        this("", 0, 0.0);
    }

    public String getName() { return name; }
    public int getIdNumber() { return idNumber; }
    public double getGpa() { return gpa; }

    // a. считать атрибуты с консоли (из ПР №17)
    public void readFromConsole(Scanner sc) {
        System.out.print("Имя: ");
        this.name = sc.nextLine();
        System.out.print("ID: ");
        this.idNumber = Integer.parseInt(sc.nextLine().trim());
        System.out.print("GPA: ");
        this.gpa = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
    }

    // b. вывести атрибуты на экран (из ПР №17)
    public void print() {
        System.out.printf("[%d] %-15s GPA=%.2f%n", idNumber, name, gpa);
    }

    @Override
    public String toString() {
        return idNumber + ";" + name + ";" + gpa;
    }

    // ПР №9, задание 4: собственная реализация Comparable (сортировка по ID)
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.idNumber, o.idNumber);
    }
}